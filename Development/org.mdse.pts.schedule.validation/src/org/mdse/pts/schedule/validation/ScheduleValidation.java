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
import org.eclipse.ui.IStartup;
import org.mdse.pts.schedule.DateTime;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.TimeDescription;

import depot.Depot;
import shared.DaysOfTheWeek;
import shared.SharedPackage;
import shared.Time;

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
		
		// Validate datetime 00:00 - 23:59
		if (SharedPackage.eINSTANCE.getTime().equals(eClass)) {
			Time time = (Time) eObject;
			modelIsValid &= validateTime(time);
		}
		
		if (SchedulePackage.eINSTANCE.getTimeDescription().equals(eClass)) {
			TimeDescription timeDescription = (TimeDescription) eObject;
			modelIsValid &= validateTimeDescription(timeDescription);
		}
		return modelIsValid;
	}
	
	
	private boolean validateTimeDescription(TimeDescription timeDescription) {
		EList<DateTime> dateTimes = timeDescription.getDateTimes();
		for (int i = 0; i < dateTimes.size(); i++) {
			for (int j = i + 1; j < dateTimes.size(); ++j) {
				
				DateTime datetime1 = dateTimes.get(i);
				DateTime datetime2 = dateTimes.get(j);
				
				if (datetime1.getTime().getHours() == datetime2.getTime().getHours() &&
					datetime1.getTime().getMinutes() == datetime2.getTime().getMinutes()) {
					
					for (DaysOfTheWeek dw1 : datetime1.getWeekdays()) {
						for (DaysOfTheWeek dw2 : datetime2.getWeekdays()) {
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

	private boolean validateTime(Time time) {
		boolean ok = true;
		
		ok &= 0 <= time.getHours() && time.getHours() <= 23;
		ok &= 0 <= time.getMinutes() && time.getMinutes() <= 59;
	
		if (!ok) {
			constraintViolated(time, "Time should go from 00:00 to 23:59");
		}
		
		return false;
	}

	private boolean validateSchedule(Schedule schedule) {		
		// Non repeated 
		Set<String> uniqueNames = new HashSet<>();
		for (Depot d : schedule.getDepots()) {
			uniqueNames.add(d.getName());
		}
		
		if (uniqueNames.size() != schedule.getDepots().size()) {
			constraintViolated(schedule, "There are repeated depots");
		}
		
		return true;
	}

	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}

}
