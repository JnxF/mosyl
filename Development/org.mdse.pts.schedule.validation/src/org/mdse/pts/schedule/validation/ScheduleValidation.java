package org.mdse.pts.schedule.validation;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IStartup;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Network;
import org.mdse.pts.network.Station;
import org.mdse.pts.schedule.DateTime;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Spot;
import org.mdse.pts.schedule.TimeDescription;

public class ScheduleValidation extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(SchedulePackage.eINSTANCE, new ScheduleValidation());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		
		// Validate Schedule depots
		if (SchedulePackage.eINSTANCE.getSchedule().equals(eClass)) {
			Schedule schedule = (Schedule) eObject;
			modelIsValid &= validateSchedule(schedule);
		}
		
		// Not repeated time description
		if (SchedulePackage.eINSTANCE.getTimeDescription().equals(eClass)) {
			TimeDescription timeDescription = (TimeDescription) eObject;
			modelIsValid &= validateTimeDescription(timeDescription);
		}
		
		// Validate Route
		if (SchedulePackage.eINSTANCE.getRoute().equals(eClass)) {
			Route route = (Route) eObject;
			modelIsValid &= validateRoute(route);
		}
		
		return modelIsValid;
	}
	
	private boolean validateRoute(Route route) {
		EObject root = EcoreUtil.getRootContainer(route);
		if (!(root instanceof Schedule)) {
			System.err.println("Root element is not a Schedule");
			return false;
		}
		Network network = ((Schedule) root).getNetwork();
		EList<Leg> legs = network.getLegs();
		
		boolean first = true;
		Station previous = null;
		for (Spot spot : route.getSpots()) {
			if (first) {
				first = false;
			} else {
				Station current = spot.getStation();
				// Check that previous--current exists
				// in the existing legs
				for (Leg a : legs) {
					Station s1 = a.getStations().get(0);
					Station s2 = a.getStations().get(1);
					
					if (!(s1.equals(current) && s2.equals(previous)) &&
						!(s1.equals(previous) && s2.equals(current))) {
						return constraintViolated(spot, "This leg doesn't exist in the provided network");
					}
				}
			}
			previous = spot.getStation();
		}
		return false;
	}

	private boolean validateTimeDescription(TimeDescription timeDescription) {
		EList<DateTime> dateTimes = timeDescription.getDateTimes();
		for (int i = 0; i < dateTimes.size(); i++) {
			for (int j = i + 1; j < dateTimes.size(); ++j) {
				
				DateTime datetime1 = dateTimes.get(i);
				DateTime datetime2 = dateTimes.get(j);
				
				if (datetime1.getTime().getHours() == datetime2.getTime().getHours() &&
					datetime1.getTime().getMinutes() == datetime2.getTime().getMinutes()) {
					
					for (org.mdse.pts.shared.DaysOfTheWeek dw1 : datetime1.getWeekdays()) {
						for (org.mdse.pts.shared.DaysOfTheWeek dw2 : datetime2.getWeekdays()) {
							if (dw1.equals(dw2)) {
								return constraintViolated(datetime1, "Schedule on " +
										dw1.toString() + " at " +
										datetime1.getTime().getHours().toString() + ":" + datetime1.getTime().getMinutes() +
										"h  is repeated");
							}
						}
					}
				}
			}
		}
		return true;
	}

	private boolean validateSchedule(Schedule schedule) {		
		// Non repeated 
		Set<String> uniqueNames = new HashSet<>();
		for (org.mdse.pts.depot.Depot d : schedule.getDepots()) {
			uniqueNames.add(d.getName());
		}
		
		if (uniqueNames.size() != schedule.getDepots().size()) {
			constraintViolated(schedule, "There are repeated depots");
		}
		
		return true;
	}

	// Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}

}
