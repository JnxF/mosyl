package org.mdse.pts.timetable;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.TrainType;
import org.mdse.pts.network.Leg;
import org.mdse.pts.schedule.*;

import shared.*;
import shared.DateTime;
import shared.Time;

public class ScheduleTransformation {
	Map<String,Timetable> timetables = new HashMap<>();
	
	public Set<Timetable> interpret(Schedule schedule) {
		for (TrainSchedule trainSchedule : schedule.getTrainSchedules()) {
			Route route = trainSchedule.getRoute();
			for (DateTime dateTime : new HashSet<DateTime>()) {//trainSchedule.getDateTimes()) { // TODO: Fix use of DateTime to shared.
				StartSpot startspot = route.getStartSpot();
				String prevStation = startspot.getStation();
				Leg prevLeg = (Leg) startspot.getLeg();
				DateTime prevDateTime = dateTime;
				
				Timetable timetable = getTimetable(prevStation);
				StationTrain train = TimetableFactory.eINSTANCE.createStationTrain();
				timetable.getStationTrains().add(train);
				train.setTrainName("None"); // TODO: Add train name when available
				
				TimeAndStation arrival;
				TimeAndStation departure = TimetableFactory.eINSTANCE.createTimeAndStation();
				train.setDeparture(departure);
				departure.setArrDepTime(dateTime);
				
				for (MiddleSpot spot : route.getMiddleSpots()) {
					departure.setNextPrevStation(spot.getStation());
					
					timetable = getTimetable(spot.getStation());
					train = TimetableFactory.eINSTANCE.createStationTrain();
					timetable.getStationTrains().add(train);
					train.setTrainName("None"); // TODO: Add train name when available
					
					prevDateTime = calculateArrival(prevDateTime,prevLeg,null); //TODO: Add train when available
					
					arrival = TimetableFactory.eINSTANCE.createTimeAndStation();
					train.setArrival(arrival);
					arrival.setArrDepTime(prevDateTime);
					arrival.setNextPrevStation(prevStation);
					
					prevStation = spot.getStation();
					prevLeg = (Leg) spot.getLeg();
					prevDateTime = calculateDateTime(prevDateTime,spot.getWaitingTime());
					
					departure = TimetableFactory.eINSTANCE.createTimeAndStation();
					train.setDeparture(departure);
					departure.setArrDepTime(prevDateTime);
				}
				FinalSpot finalSpot = route.getFinalSpot();
				departure.setNextPrevStation(finalSpot.getStation());
				
				timetable = getTimetable(finalSpot.getStation());
				train = TimetableFactory.eINSTANCE.createStationTrain();
				timetable.getStationTrains().add(train);
				train.setTrainName("None"); // TODO: Add train name when available

				prevDateTime = calculateArrival(prevDateTime,prevLeg,null); //TODO: Add train when available
				
				arrival = TimetableFactory.eINSTANCE.createTimeAndStation();
				train.setArrival(arrival);
				arrival.setArrDepTime(prevDateTime);
				arrival.setNextPrevStation(prevStation);
			}
		}
		Set<Timetable> set = new HashSet<Timetable>();
		set.addAll(timetables.values());
		return set;
	}
	
	public DateTime calculateArrival(DateTime time, Leg leg, Train train) {
		int speed = 0;
		if (train.getType() == TrainType.REGIONAL) {
			speed = 80;
		}
		if (train.getType() == TrainType.INTERCITY) {
			if (train.getCoaches().size() > 7) {
				speed = 130;
			} else {
				speed = 150;
			}
		}
		
		int distance = leg.getDistance();
		double timeInHours = (double) distance/(double) speed;
		double timeInMinutes = timeInHours*60.;
		int addedMinutes = (int) Math.ceil(timeInMinutes);
		
		return calculateDateTime(time,addedMinutes);
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
			if (day.getValue() == 7) day = DaysOfTheWeek.get(1);
			else day = DaysOfTheWeek.get(day.getValue()+1);
		}
		Time newTime = SharedFactory.eINSTANCE.createTime();
		newTime.setHours(newHours);
		newTime.setMinutes(newMinutes);
		DateTime newDateTime = SharedFactory.eINSTANCE.createDateTime();
		newDateTime.setDay(day);
		newDateTime.setTime(newTime);
		return newDateTime;
	}
	
	public Timetable getTimetable(String station) {
		if (!timetables.containsKey(station)) {
			Timetable timetable = TimetableFactory.eINSTANCE.createTimetable();
			timetable.setStationName(station);
			timetables.put(station,timetable);
			return timetable;
		} else {
			return timetables.get(station);
		}
	}
}
