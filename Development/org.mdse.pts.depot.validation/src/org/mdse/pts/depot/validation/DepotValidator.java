package org.mdse.pts.depot.validation;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.mdse.pts.depot.Coach;
import org.mdse.pts.depot.Depot;
import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.DiningCoach;
import org.mdse.pts.depot.InnerCoach;
import org.mdse.pts.depot.Locomotive;
import org.mdse.pts.depot.PassengerClass;
import org.mdse.pts.depot.PassengerCoach;
import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.TrainType;

public class DepotValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;

	@Override
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(DepotPackage.eINSTANCE, new DepotValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		
		if (DepotPackage.eINSTANCE.getDepot().equals(eClass)) {
			Depot depot = (Depot) eObject;
			modelIsValid &= validateDepot(depot);
		}
		
		if (DepotPackage.eINSTANCE.getTrain().equals(eClass)) {
			Train train = (Train) eObject;
			modelIsValid &= validateTrain(train);
		}
		
		if (DepotPackage.eINSTANCE.getLocomotive().equals(eClass)) {
			Locomotive locomotive = (Locomotive) eObject;
			modelIsValid &= validateLocomotive(locomotive);
		}
		
		return modelIsValid;
	}
	
	private boolean validateDepot(Depot depot) {
		boolean isValid = true;
		
		Set<String> trainNames = new HashSet<String>();
		for (Train t : depot.getTrains()) {
			trainNames.add(t.getName());
		}
		
		if (trainNames.size() != depot.getTrains().size()) {
			isValid &= constraintViolated(depot, "Train names has to be unique inside depot");
		}
		
		return isValid;
	}

	private boolean validateTrain(Train train) {
		
		boolean isValid = true;

		
		Predicate<Coach> isFirstClass =
					c -> c instanceof PassengerCoach && ((PassengerCoach)c).getPassengerClass() == PassengerClass.FIRST;
		Predicate<Coach> isSecondClass =
					c -> c instanceof PassengerCoach && ((PassengerCoach)c).getPassengerClass() == PassengerClass.SECOND;
 		
		int firstClassCount = count(train.getCoaches(),	isFirstClass);
		int secondClassCount = count(train.getCoaches(), isSecondClass);
		
		// Intercity requires first class passenger coaches
		if (train.getTrainType() == TrainType.INTERCITY && firstClassCount == 0) {
			isValid &= constraintViolated(train, "INTERCITY requires at least one first class passenger coach.");
		}
		
		// Intercity train requires dining coach
		int diningCoachCount = count(train.getCoaches(), c -> c instanceof DiningCoach);
		
		if (diningCoachCount > 1) {
			isValid &= constraintViolated(train, "Train has too many dining coaches, at most one can be attached");
		}
		
		if (train.getTrainType() == TrainType.INTERCITY && diningCoachCount < 1) {
			isValid &= constraintViolated(train, "Intercity train requies 1 dining coach");
		}
		
		if (firstClassCount > 0 && secondClassCount > 0) {
			boolean notValid = false;
			int diningCoachIndex = 0;
			for (Coach c : train.getCoaches()) {
				if (c instanceof DiningCoach) {
					diningCoachIndex = train.getCoaches().indexOf(c);
					break;
				}
			}
			
			if (diningCoachIndex == 0 || diningCoachIndex == train.getCoaches().size()-1) {
				notValid = true;
			} else {
				Coach prevCoach = train.getCoaches().get(diningCoachIndex-1); 
				Coach nextCoach = train.getCoaches().get(diningCoachIndex+1);
				
				if (prevCoach instanceof PassengerCoach && nextCoach instanceof PassengerCoach) {
					PassengerCoach prevPC = (PassengerCoach) prevCoach;
					PassengerCoach nextPC = (PassengerCoach) nextCoach;
					
					if (!((prevPC.getPassengerClass() == PassengerClass.FIRST && nextPC.getPassengerClass() == PassengerClass.SECOND) 
							|| (prevPC.getPassengerClass() == PassengerClass.SECOND && nextPC.getPassengerClass() == PassengerClass.FIRST))) {
						notValid = true;
					}
				} else {
					notValid = true;
				}
			}
			
			if (notValid)
				isValid &= constraintViolated(train, "The Dining coach should be in the middle of first and second class");
			
		}
		
		// PassengerCoaches in trains should be sequential
		isValid &= checkIfInSequence(train, PassengerClass.FIRST);
		isValid &= checkIfInSequence(train, PassengerClass.SECOND);
		
		// Check all number identifiers for coaches are distinct inside train
		int nonNumberedCount = 0;
		Set<Integer> numbers = new HashSet<Integer>(); 
		for (Coach c : train.getCoaches()) {
			if (c instanceof InnerCoach) {
				InnerCoach ic = (InnerCoach) c;
				numbers.add(ic.getNumber());
			} else  {
				nonNumberedCount++;
			}
		}
		
		if (numbers.size()+nonNumberedCount != train.getCoaches().size()) {
			isValid &= constraintViolated(train, "All coach numbers in of a train should be unique");
		}
		
		return isValid;
	}
	
	private boolean validateLocomotive(Locomotive locomotive) {
		boolean isValid = true;
		
		if (locomotive.eContainer() instanceof Train) {
			Train curTrain = (Train) locomotive.eContainer();
			if (!curTrain.getCoaches().get(0).equals(locomotive) 
					&& !curTrain.getCoaches().get(curTrain.getCoaches().size()-1).equals(locomotive)) {
				isValid &= constraintViolated(locomotive, "A Locomotive coach should be either first or last in the train");
			}
		}
		
		return isValid;
	}
		
	private <T> int count(EList<T> objects, Predicate<T> pred) {
		int count = 0;
		for (T object : objects) {
			if (pred.test(object)) {
				count++;
			}
		}
		return count;
	}
	
	private boolean checkIfInSequence(Train train, PassengerClass ps) {
		int lastIndex = Integer.MIN_VALUE;
		for (Coach c : train.getCoaches()) {
			if (c instanceof PassengerCoach) {
				PassengerCoach pc = (PassengerCoach) c;
				if (pc.getPassengerClass() == ps) {
					if (lastIndex == Integer.MIN_VALUE) {
						lastIndex = train.getCoaches().indexOf(pc);
					} else {
						int curIndex = train.getCoaches().indexOf(pc);
						if (curIndex - lastIndex > 1) {
							return constraintViolated(train, ps.toString() + " Passenger class coaches must be in a sequence");
						}
						lastIndex = curIndex;
					}
				}
			}
		}
		
		return true;
	}
	
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
}
