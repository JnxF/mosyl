package org.mdse.pts.timetable;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.mdse.pts.common.util.EcoreIOUtil;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import depot.Depot;
import depot.DepotFactory;
import depot.DepotPackage;
import depot.Train;
import depot.TrainType;
import network.Leg;
import network.Network;
import network.NetworkFactory;
import network.NetworkPackage;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.ScheduleFactory;
import org.mdse.pts.schedule.Spot;
import org.mdse.pts.schedule.TimeDescription;
import org.mdse.pts.schedule.TrainSchedule;
import org.mdse.pts.schedule.dsl.ScheduleRuntimeModule;
import org.mdse.pts.schedule.dsl.ScheduleStandaloneSetup;
import network.Station;
import shared.DaysOfTheWeek;
import shared.SharedFactory;
import shared.Time;

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
		URI networkURI = URI.createFileURI("D:/User files/eclipse-workspace/mosyl/Runtime/PTSFiles/Networkia.network");
		URI depotURI = URI.createFileURI("D:/User files/eclipse-workspace/mosyl/Runtime/PTSFiles/Depotia.depot");
		Network network = EcoreIOUtil.loadModel(networkURI,rs);
		Depot depot = EcoreIOUtil.loadModel(depotURI,rs);

		/*Injector injector = new ScheduleStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("test.schedule")); 
		try {
			resource.load(new ByteArrayInputStream("schedule for Networkia with Depotia:\r\n	train Regionalido on Monday, Wednesday at 15:30\r\n	and Monday at 15:30:\r\n	start at CityAA  \r\n	drive via Connectia  \r\n	terminate at CityB".getBytes("UTF-8")), new HashMap<>());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		Schedule schedule = (Schedule) resource.getContents().get(0);*/
		
		Schedule schedule = ScheduleFactory.eINSTANCE.createSchedule();
		schedule.setNetwork((network.Network) network);
		schedule.getDepots().add((depot.Depot) depot);
		
		TrainSchedule ts = ScheduleFactory.eINSTANCE.createTrainSchedule();
		ts.setTrain((depot.Train) depot.getTrains().get(0));
		
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
