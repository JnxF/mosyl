package org.mdse.pts.depot.validation;

import java.util.Map;
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
import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.PassengerClass;
import org.mdse.pts.depot.PassengerCoach;
import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.TrainType;

public class DepotValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;

	@Override
	public void earlyStartup() {
		// TODO Auto-generated method stub
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
		
		if (DepotPackage.eINSTANCE.getTrain().equals(eClass)) {
			Train train = (Train) eObject;
			modelIsValid &= validateTrain(train);
		}
		
		return modelIsValid;
	}
	
	private boolean validateTrain(Train train) {
		
		// Intercity requires first class passenger coaches
		if (train.getTrainType() == TrainType.INTERCITY) {
			Predicate<Coach> leastOneFirstClass =
					c -> c instanceof PassengerCoach && ((PassengerCoach)c).getPassengerClass() == PassengerClass.FIRST;

			if (Any(train.getCoaches(), leastOneFirstClass)) {
				return constraintViolated(train, "INTERCITY train has no first class passenger coach.");
			}
		}
		
		// PassengerCoaches in trains should be sequential
		int lastIndex = Integer.MIN_VALUE;
		for (Coach c : train.getCoaches()) {
			if (c instanceof PassengerCoach) {
				PassengerCoach pc = (PassengerCoach) c;
				if (pc.getPassengerClass() == PassengerClass.FIRST) {
					if (lastIndex == Integer.MIN_VALUE) {
						lastIndex = train.getCoaches().indexOf(pc);
					} else {
						int curIndex = train.getCoaches().indexOf(pc);
						if (curIndex - lastIndex > 1) {
							return constraintViolated(train, "Passenger class sequence is wrong");
						}
					}
				}
			}
		}
		
		return true;
	}
	
	private <T> boolean Any(EList<T> objects, Predicate<T> pred) {
		for (T object : objects) {
			if (pred.test(object)) {
				return true;
			}
		}
		return false;
	}
	
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
}
