package org.mdse.pts.schedule.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IStartup;
import org.mdse.pts.depot.Depot;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Network;
import org.mdse.pts.network.Station;
import org.mdse.pts.schedule.DateTime;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Spot;
import org.mdse.pts.schedule.TimeDescription;
import org.mdse.pts.shared.DaysOfTheWeek;
import org.mdse.pts.shared.Time;

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
			modelIsValid &= validateScheduleNoRepeatedDepots(schedule);
		}

		// Validate Time Description
		if (SchedulePackage.eINSTANCE.getTimeDescription().equals(eClass)) {
			TimeDescription timeDescription = (TimeDescription) eObject;
			modelIsValid &= validateTimeDescriptionNoRepeatedDateTime(timeDescription);
			modelIsValid &= validateTimeDescriptionNoRepeatedWeekDay(timeDescription);
			modelIsValid &= validateTimeDescriptionCorrectTimeFormat(timeDescription);
		}

		// Validate Route
		if (SchedulePackage.eINSTANCE.getRoute().equals(eClass)) {
			Route route = (Route) eObject;
			modelIsValid &= validateRoute(route);
		}

		return modelIsValid;
	}

	// Validate Schedule depots

	/**
	 * Schedules cannot have repeated depots
	 */
	private boolean validateScheduleNoRepeatedDepots(Schedule schedule) {
		// Non repeated
		boolean res = true;
		Set<String> uniqueNames = new HashSet<>();
		List<Depot> depots = schedule.getDepots();
		for (Depot depot : depots) {
			uniqueNames.add(depot.getName());
		}
		if (uniqueNames.size() != depots.size()) {
			res &= constraintViolated(schedule, "There cannot be repeated depots.");
		}
		return res;
	}

	// Validate Time Description

	/**
	 * Two time descriptions cannot have the same pair (weekday, hour and minutes)
	 */
	private boolean validateTimeDescriptionNoRepeatedDateTime(TimeDescription timeDescription) {
		boolean res = true;
		List<DateTime> dateTimes = timeDescription.getDateTimes();
		// Two date times cannot share the same hour
		// and the same day of the week
		for (int i = 0; i < dateTimes.size(); i++) {
			for (int j = i + 1; j < dateTimes.size(); ++j) {

				DateTime datetime1 = dateTimes.get(i);
				DateTime datetime2 = dateTimes.get(j);

				if (datetime1.getTime().getHours() == datetime2.getTime().getHours()
						&& datetime1.getTime().getMinutes() == datetime2.getTime().getMinutes()) {

					for (DaysOfTheWeek dw1 : datetime1.getWeekdays()) {
						for (DaysOfTheWeek dw2 : datetime2.getWeekdays()) {
							if (dw1.equals(dw2)) {
								res &= constraintViolated(datetime1,
										"Schedule on " + dw1.toString() + " at "
												+ datetime1.getTime().getHours().toString() + ":"
												+ datetime1.getTime().getMinutes() + "h is repeated.");
							}
						}
					}
				}
			}
		}
		return res;
	}

	/**
	 * A date time cannot have repeated days of the week
	 */
	private boolean validateTimeDescriptionNoRepeatedWeekDay(TimeDescription timeDescription) {
		boolean res = true;
		List<DateTime> dateTimes = timeDescription.getDateTimes();

		for (DateTime datetime : dateTimes) {
			List<DaysOfTheWeek> daysOfTheWeek = datetime.getWeekdays();
			HashSet<DaysOfTheWeek> daysOfTheWeekUnique = new HashSet<>(daysOfTheWeek);
			if (daysOfTheWeek.size() != daysOfTheWeekUnique.size()) {
				res &= constraintViolated(datetime, "There cannot be repeated days of the week");
			}
		}
		return res;
	}

	/**
	 * A date time should have correct 24-hours time format
	 */
	private boolean validateTimeDescriptionCorrectTimeFormat(TimeDescription timeDescription) {
		boolean res = true;
		List<DateTime> dateTimes = timeDescription.getDateTimes();
		for (DateTime datetime : dateTimes) {
			Time time = datetime.getTime();
			int hours = time.getHours();
			int minutes = time.getMinutes();
			if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
				res &= constraintViolated(datetime, "Time has to be expressed from 00:00 to 23:59");
			}
		}
		return res;
	}

	// Validate Route

	/**
	 * A route should have existing legs in the network for all the stations it
	 * connects, and should have exactly one leg connecting two stations if no leg
	 * to drive through is specified
	 */
	private boolean validateRoute(Route route) {
		boolean res = true;

		EObject root = EcoreUtil.getRootContainer(route);
		if (!(root instanceof Schedule)) {
			System.err.println("Root element is not a Schedule");
			return false;
		}
		Network network = ((Schedule) root).getNetwork();
		List<Leg> legs = network.getLegs();

		boolean first = true;
		Station previousStation = null;
		Leg previousLeg = null;
		for (Spot spot : route.getSpots()) {
			if (first) {
				first = false;
			} else {
				Station currentStation = spot.getStation();

				// If let was defined previously,
				// check that we are using both of the
				// ends of the leg
				if (previousLeg != null) {
					Station s1 = previousLeg.getStations().get(0);
					Station s2 = previousLeg.getStations().get(1);

					if (s1.equals(previousStation) && s2.equals(currentStation)) {
						// OK
					} else if (s1.equals(currentStation) && s2.equals(previousStation)) {
						// OK
					} else {
						res &= constraintViolated(spot, "Leg " + previousLeg.getName() + " doesn't connect "
								+ s1.getName() + " and " + s2.getName());
					}
				}

				// Else, check that exists any leg
				// that connects the previous and the current
				else {
					int connectingLegs = 0;
					for (Leg a : legs) {
						Station s1 = a.getStations().get(0);
						Station s2 = a.getStations().get(1);
						if ((s1.equals(currentStation) && s2.equals(previousStation))
								|| (s1.equals(previousStation) && s2.equals(currentStation))) {
							++connectingLegs;
						}
					}

					if (connectingLegs == 0) {
						res &= constraintViolated(spot, "There is no leg connecting " + previousStation.getName()
								+ " and " + currentStation.getName() + ".");
					} else if (connectingLegs == 1) {
						// OK
					} else {
						res &= constraintViolated(spot,
								"There are multiple legs connecting " + previousStation.getName() + " and "
										+ currentStation.getName() + ". Please specify which one to use.");
					}
				}
			}
			previousStation = spot.getStation();
			previousLeg = spot.getLeg();
		}
		return res;
	}

	// Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message,
				new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}

}
