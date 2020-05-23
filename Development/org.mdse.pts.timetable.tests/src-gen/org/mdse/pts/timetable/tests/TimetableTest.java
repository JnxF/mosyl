/**
 */
package org.mdse.pts.timetable.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.mdse.pts.depot.DepotFactory;
import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.TrainType;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.NetworkFactory;
import org.mdse.pts.shared.DaysOfTheWeek;
import org.mdse.pts.shared.SharedFactory;
import org.mdse.pts.shared.Time;
import org.mdse.pts.timetable.DateTime;
import org.mdse.pts.timetable.DateTimeComparator;
import org.mdse.pts.timetable.ScheduleTransformation;
import org.mdse.pts.timetable.Timetable;
import org.mdse.pts.timetable.TimetableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimetableTest extends TestCase {
	static DateTimeComparator dtc = new DateTimeComparator();
	static ScheduleTransformation transform = new ScheduleTransformation();

	public void testDateTimeAdding1() {
		DateTime dateTime = TimetableFactory.eINSTANCE.createDateTime();
		Time time = SharedFactory.eINSTANCE.createTime();
		time.setHours(2);
		time.setMinutes(35);
		dateTime.setTime(time);
		dateTime.setDay(DaysOfTheWeek.get(7));
		
		// Adding one week in minutes, should be the same as original time.
		DateTime newDateTime = transform.calculateDateTime(dateTime, 10080);
		
		assertTrue(dtc.compare(dateTime, newDateTime) == 0);
	}
	
	public void testDateTimeAdding2() {
		DateTime dateTime = TimetableFactory.eINSTANCE.createDateTime();
		Time time = SharedFactory.eINSTANCE.createTime();
		time.setHours(2);
		time.setMinutes(35);
		dateTime.setTime(time);
		dateTime.setDay(DaysOfTheWeek.get(7));
		
		// Adding one week + 1 minute, difference should be bigger than 0.
		DateTime newDateTime = transform.calculateDateTime(dateTime, 10079);
		
		assertTrue(dtc.compare(dateTime, newDateTime) > 0);
	}
	
	public void testDateTimeAdding3() {
		DateTime dateTime = TimetableFactory.eINSTANCE.createDateTime();
		Time time = SharedFactory.eINSTANCE.createTime();
		time.setHours(2);
		time.setMinutes(35);
		dateTime.setTime(time);
		dateTime.setDay(DaysOfTheWeek.get(7));
		
		// Adding one week - 1 minute, difference should be smaller than 0.
		DateTime newDateTime = transform.calculateDateTime(dateTime, 10081);
		
		assertTrue(dtc.compare(dateTime, newDateTime) < 0);
	}
	
	public void testTrainDateTime1() {
		DateTime dateTime = TimetableFactory.eINSTANCE.createDateTime();
		Time time = SharedFactory.eINSTANCE.createTime();
		time.setHours(2);
		time.setMinutes(35);
		dateTime.setTime(time);
		dateTime.setDay(DaysOfTheWeek.get(7));
		ScheduleTransformation transform = new ScheduleTransformation();
		
		Leg leg = NetworkFactory.eINSTANCE.createLeg();
		leg.setDistance(130);
		
		Train train = DepotFactory.eINSTANCE.createTrain();
		train.setTrainType(TrainType.INTERCITY);
		for (int i = 0; i < 8; i++) {
			train.getCoaches().add(DepotFactory.eINSTANCE.createPassengerCoach());
		}
		
		// Testing if INTERCITY with 9 coaches takes an hour to drive 130km
		assertTrue(dtc.compare(transform.calculateDateTime(dateTime, 60), transform.calculateArrival(dateTime, leg, train)) == 0);
	}
	
	public void testTrainDateTime2() {
		DateTime dateTime = TimetableFactory.eINSTANCE.createDateTime();
		Time time = SharedFactory.eINSTANCE.createTime();
		time.setHours(2);
		time.setMinutes(35);
		dateTime.setTime(time);
		dateTime.setDay(DaysOfTheWeek.get(7));
		ScheduleTransformation transform = new ScheduleTransformation();
		
		Leg leg = NetworkFactory.eINSTANCE.createLeg();
		leg.setDistance(80);
		
		Train train = DepotFactory.eINSTANCE.createTrain();
		train.setTrainType(TrainType.REGIONAL);
		
		// Testing if REGIONAL takes an hour to drive 80km
		assertTrue(dtc.compare(transform.calculateDateTime(dateTime, 60), transform.calculateArrival(dateTime, leg, train)) == 0);
	}
	
	public void testTrainDateTime3() {
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
		
		// Testing if INTERCITY takes an hour to drive 150km
		assertTrue(dtc.compare(transform.calculateDateTime(dateTime, 60), transform.calculateArrival(dateTime, leg, train)) == 0);
	}
	
	/**
	 * The fixture for this Timetable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Timetable fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimetableTest.class);
	}

	/**
	 * Constructs a new Timetable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timetable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Timetable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timetable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Timetable getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimetableFactory.eINSTANCE.createTimetable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TimetableTest
