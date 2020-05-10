package org.mdse.pts.timetable;

import org.mdse.pts.depot.DepotFactory;
import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.TrainType;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.NetworkFactory;

import shared.DaysOfTheWeek;
import shared.SharedFactory;
import shared.Time;

public class Main {
	public static void main(String[] args) {
		//dateTimeTest();
		//trainTest();
	}
	
	public static void dateTimeTest() {
		DateTime dateTime = TimetableFactory.eINSTANCE.createDateTime();
		Time time = SharedFactory.eINSTANCE.createTime();
		time.setHours(2);
		time.setMinutes(35);
		dateTime.setTime(time);
		dateTime.setDay(DaysOfTheWeek.get(7));
		ScheduleTransformation transform = new ScheduleTransformation();

		printDateTime(dateTime);
		
		DateTime newDateTime = transform.calculateDateTime(dateTime, 75);
		
		printDateTime(newDateTime);
	}
	
	public static void trainTest() {
		DateTime dateTime = TimetableFactory.eINSTANCE.createDateTime();
		Time time = SharedFactory.eINSTANCE.createTime();
		time.setHours(2);
		time.setMinutes(35);
		dateTime.setTime(time);
		dateTime.setDay(DaysOfTheWeek.get(7));
		ScheduleTransformation transform = new ScheduleTransformation();
		
		Leg leg = NetworkFactory.eINSTANCE.createLeg();
		leg.setDistance(150);
		
		Train train = DepotFactory.eINSTANCE.createTrain();
		train.setTrainType(TrainType.INTERCITY);
		for (int i = 0; i < 8; i++) {
			train.getCoaches().add(DepotFactory.eINSTANCE.createPassengerCoach());
		}
		printDateTime(dateTime);
		printDateTime(transform.calculateArrival(dateTime, leg, train));
	}
	
	public static void printDateTime(DateTime dateTime) {
		System.out.println(dateTime.getDay().getName());
		System.out.println(dateTime.getTime().getHours() + ":" + dateTime.getTime().getMinutes());
	}

}
