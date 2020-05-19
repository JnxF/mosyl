package org.mdse.pts.timetable;

import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import depot.Train;
import network.Leg;

import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.Spot;
import org.mdse.pts.schedule.TrainSchedule;

import shared.DaysOfTheWeek;
import shared.SharedFactory;
import shared.Time;

public class ScheduleTransformation {
	Map<String, Timetable> timetables = new HashMap<>();

	public Set<Timetable> interpret(Schedule schedule) {
		for (TrainSchedule trainSchedule : schedule.getTrainSchedules()) {
			Route route = trainSchedule.getRoute();
			Train train = (Train) trainSchedule.getTrain();
			for (org.mdse.pts.schedule.DateTime scheduleDateTime : trainSchedule.getTimeDescription().getDateTimes()) {
				for (DaysOfTheWeek day : scheduleDateTime.getWeekdays()) {
					DateTime dateTime = TimetableFactory.eINSTANCE.createDateTime();
					dateTime.setTime(scheduleDateTime.getTime());
					dateTime.setDay(day);
					
					String prevStationName = null;
					Leg prevLeg = null;
					DateTime prevDateTime = dateTime;
					
					Timetable timetable = null;
					StationTrain stationTrain = null;

					TimeAndStation arrival = null;
					TimeAndStation departure = null;

					List<Spot> spots = route.getSpots();
					for (int i = 0; i < spots.size(); i++) {
						Spot spot = spots.get(i);
						String currentStationName = spot.getStation().getName();
						if (i != 0) {
							departure.setNextPrevStation(currentStationName);
						}

						timetable = getTimetable(currentStationName);
						stationTrain = TimetableFactory.eINSTANCE.createStationTrain();
						timetable.getStationTrains().add(stationTrain);
						stationTrain.setTrainName(train.getName());
						stationTrain.setPlatform(spot.getPlatform());

						if (i != 0) {
							prevDateTime = calculateArrival(prevDateTime, prevLeg, train);
							
							arrival = TimetableFactory.eINSTANCE.createTimeAndStation();
							stationTrain.setArrival(arrival);
							arrival.setArrDepTime(prevDateTime);
							arrival.setNextPrevStation(prevStationName);
						}
						if (i != spots.size()-1) {
							prevStationName = currentStationName;
							prevLeg = (Leg) spot.getLeg();
							if (i == 0) {
								prevDateTime = dateTime;
							} else {
								prevDateTime = calculateDateTime(prevDateTime, spot.getWaitingTime());
							}
	
							departure = TimetableFactory.eINSTANCE.createTimeAndStation();
							stationTrain.setDeparture(departure);
							departure.setArrDepTime(prevDateTime);
						}
					}
				}
			}
		}
		Set<Timetable> set = new HashSet<Timetable>();
		set.addAll(timetables.values());
		return set;
	}

	public DateTime calculateArrival(DateTime time, Leg leg, Train train) {
		int speed = 0;

		switch (train.getTrainType()) {
		case REGIONAL:
			speed = 80;
			break;
		case INTERCITY:
			if (train.getCoaches().size() > 7) {
				speed = 130;
			} else {
				speed = 150;
			}
			break;
		}

		int distance = leg.getDistance();
		double timeInHours = (double) distance / (double) speed;
		double timeInMinutes = timeInHours * 60.;
		int addedMinutes = (int) Math.ceil(timeInMinutes);

		return calculateDateTime(time, addedMinutes);
	}

	public DateTime calculateDateTime(DateTime time, int addedMinutes) {
		DaysOfTheWeek day = time.getDay();
		int hours = time.getTime().getHours();
		int minutes = time.getTime().getMinutes();
		int newMinutes = minutes + addedMinutes;
		int newHours = hours + Math.floorDiv(newMinutes, 60);
		newMinutes = newMinutes % 60;
		while (newHours > 23) {
			newHours -= 24;
			if (day.getValue() == 7)
				day = DaysOfTheWeek.get(1);
			else
				day = DaysOfTheWeek.get(day.getValue() + 1);
		}
		Time newTime = SharedFactory.eINSTANCE.createTime();
		newTime.setHours(newHours);
		newTime.setMinutes(newMinutes);
		DateTime newDateTime = TimetableFactory.eINSTANCE.createDateTime();
		newDateTime.setDay(day);
		newDateTime.setTime(newTime);
		return newDateTime;
	}

	public Timetable getTimetable(String station) {
		if (!timetables.containsKey(station)) {
			Timetable timetable = TimetableFactory.eINSTANCE.createTimetable();
			timetable.setStationName(station);
			timetables.put(station, timetable);
			return timetable;
		} else {
			return timetables.get(station);
		}
	}
	
	public static Set<Timetable> staticScheduleToTimetables(Schedule schedule) {
		ScheduleTransformation st = new ScheduleTransformation();
		return st.interpret(schedule);
	}
}
