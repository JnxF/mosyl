package org.mdse.pts.timetable;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.mdse.pts.common.util.EcoreIOUtil;
import org.mdse.pts.depot.Depot;
import org.mdse.pts.depot.DepotFactory;
import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.TrainType;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Network;
import org.mdse.pts.network.NetworkFactory;
import org.mdse.pts.network.NetworkPackage;
import org.mdse.pts.network.Station;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.ScheduleFactory;
import org.mdse.pts.schedule.Spot;
import org.mdse.pts.schedule.TimeDescription;
import org.mdse.pts.schedule.TrainSchedule;
import org.mdse.pts.shared.DaysOfTheWeek;
import org.mdse.pts.shared.SharedFactory;
import org.mdse.pts.shared.Time;

public class Main {
	public static void main(String[] args) {
		//dateTimeTest();
		//trainTest();
		Set<Timetable> tt = makeTimetablesFromExampleSchedule();
	}
	
	public static Set<Timetable> makeTimetablesFromExampleSchedule() {
		ResourceSet rs = EcoreIOUtil.getDefaultResourceSet();
		EPackage.Registry.INSTANCE.put(NetworkPackage.eNS_URI, NetworkPackage.eINSTANCE);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("network", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(DepotPackage.eNS_URI, DepotPackage.eINSTANCE);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("depot", new XMIResourceFactoryImpl());
		URI networkURI = URI.createFileURI("../../Runtime/PTSFiles/Networkia.network");
		URI depotURI = URI.createFileURI("../../Runtime/PTSFiles/Depotia.depot");
		Network network = EcoreIOUtil.loadModel(networkURI,rs);
		Depot depot = EcoreIOUtil.loadModel(depotURI,rs);
		
		Schedule schedule = ScheduleFactory.eINSTANCE.createSchedule();
		schedule.setNetwork((Network) network);
		schedule.getDepots().add((Depot) depot);
		
		TrainSchedule ts = ScheduleFactory.eINSTANCE.createTrainSchedule();
		ts.setTrain((Train) depot.getTrains().get(0));
		
		Route r = ScheduleFactory.eINSTANCE.createRoute();
		Spot s1 = ScheduleFactory.eINSTANCE.createSpot();
		s1.setStation((Station) network.getStations().get(0));
		s1.setPlatform("Q");
		Spot s2 = ScheduleFactory.eINSTANCE.createSpot();
		s2.setStation((Station) network.getStations().get(1));
		s2.setPlatform("R");
		s1.setLeg(network.getLegs().get(0));
		
		r.getSpots().add(s1);
		r.getSpots().add(s2);
		
		ts.setRoute(r);
		
		org.mdse.pts.schedule.DateTime dt1 = ScheduleFactory.eINSTANCE.createDateTime();
		dt1.getWeekdays().add(DaysOfTheWeek.MONDAY);
		dt1.getWeekdays().add(DaysOfTheWeek.THURSDAY);
		Time t1 = SharedFactory.eINSTANCE.createTime();
		t1.setHours(5);
		t1.setMinutes(30);
		dt1.setTime(t1);

		org.mdse.pts.schedule.DateTime dt2 = ScheduleFactory.eINSTANCE.createDateTime();
		dt2.getWeekdays().add(DaysOfTheWeek.TUESDAY);
		dt2.getWeekdays().add(DaysOfTheWeek.WEDNESDAY);
		Time t2 = SharedFactory.eINSTANCE.createTime();
		t2.setHours(8);
		t2.setMinutes(15);
		dt2.setTime(t2);
		
		TimeDescription td = ScheduleFactory.eINSTANCE.createTimeDescription();
		ts.setTimeDescription(td);
		ts.getTimeDescription().getDateTimes().add(dt1);
		ts.getTimeDescription().getDateTimes().add(dt2);
		
		schedule.getTrainSchedules().add(ts);
		
		ScheduleTransformation transform = new ScheduleTransformation();
		
		return transform.interpret(schedule);
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
