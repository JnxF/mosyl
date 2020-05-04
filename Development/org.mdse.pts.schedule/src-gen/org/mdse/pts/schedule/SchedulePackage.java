/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mdse.pts.schedule.ScheduleFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schedule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/schedule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schedule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulePackage eINSTANCE = org.mdse.pts.schedule.impl.SchedulePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.ScheduleImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Depots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DEPOTS = 1;

	/**
	 * The feature id for the '<em><b>Train Schedules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__TRAIN_SCHEDULES = 2;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TrainScheduleImpl <em>Train Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TrainScheduleImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrainSchedule()
	 * @generated
	 */
	int TRAIN_SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE__TRAIN = 0;

	/**
	 * The feature id for the '<em><b>Time Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE__TIME_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE__ROUTE = 2;

	/**
	 * The number of structural features of the '<em>Train Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TimeDescriptionImpl <em>Time Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TimeDescriptionImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTimeDescription()
	 * @generated
	 */
	int TIME_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Date Times</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DESCRIPTION__DATE_TIMES = 0;

	/**
	 * The number of structural features of the '<em>Time Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.DateTimeImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Weekday</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__WEEKDAY = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__TIME = 1;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TimeImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 4;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__HOURS = 0;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MINUTES = 1;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.RouteImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 5;

	/**
	 * The feature id for the '<em><b>Spots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__SPOTS = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.SpotImpl <em>Spot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.SpotImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSpot()
	 * @generated
	 */
	int SPOT = 6;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT__STATION = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT__PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Waiting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT__WAITING_TIME = 2;

	/**
	 * The feature id for the '<em><b>Turn Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT__TURN_STATION = 3;

	/**
	 * The feature id for the '<em><b>Leg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT__LEG = 4;

	/**
	 * The number of structural features of the '<em>Spot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Spot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.WeekDays <em>Week Days</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.WeekDays
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getWeekDays()
	 * @generated
	 */
	int WEEK_DAYS = 7;


	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see org.mdse.pts.schedule.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Schedule#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getNetwork()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Network();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.pts.schedule.Schedule#getDepots <em>Depots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depots</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getDepots()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Depots();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Schedule#getTrainSchedules <em>Train Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Schedules</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getTrainSchedules()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_TrainSchedules();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.TrainSchedule <em>Train Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Schedule</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule
	 * @generated
	 */
	EClass getTrainSchedule();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.TrainSchedule#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule#getTrain()
	 * @see #getTrainSchedule()
	 * @generated
	 */
	EReference getTrainSchedule_Train();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.schedule.TrainSchedule#getTimeDescription <em>Time Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Description</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule#getTimeDescription()
	 * @see #getTrainSchedule()
	 * @generated
	 */
	EReference getTrainSchedule_TimeDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.schedule.TrainSchedule#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule#getRoute()
	 * @see #getTrainSchedule()
	 * @generated
	 */
	EReference getTrainSchedule_Route();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.TimeDescription <em>Time Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Description</em>'.
	 * @see org.mdse.pts.schedule.TimeDescription
	 * @generated
	 */
	EClass getTimeDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.TimeDescription#getDateTimes <em>Date Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Times</em>'.
	 * @see org.mdse.pts.schedule.TimeDescription#getDateTimes()
	 * @see #getTimeDescription()
	 * @generated
	 */
	EReference getTimeDescription_DateTimes();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see org.mdse.pts.schedule.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the attribute list '{@link org.mdse.pts.schedule.DateTime#getWeekday <em>Weekday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weekday</em>'.
	 * @see org.mdse.pts.schedule.DateTime#getWeekday()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Weekday();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.schedule.DateTime#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.mdse.pts.schedule.DateTime#getTime()
	 * @see #getDateTime()
	 * @generated
	 */
	EReference getDateTime_Time();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.mdse.pts.schedule.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Time#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see org.mdse.pts.schedule.Time#getHours()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Hours();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Time#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see org.mdse.pts.schedule.Time#getMinutes()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Minutes();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see org.mdse.pts.schedule.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Route#getSpots <em>Spots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spots</em>'.
	 * @see org.mdse.pts.schedule.Route#getSpots()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Spots();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Spot <em>Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spot</em>'.
	 * @see org.mdse.pts.schedule.Spot
	 * @generated
	 */
	EClass getSpot();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Spot#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see org.mdse.pts.schedule.Spot#getStation()
	 * @see #getSpot()
	 * @generated
	 */
	EReference getSpot_Station();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Spot#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see org.mdse.pts.schedule.Spot#getPlatform()
	 * @see #getSpot()
	 * @generated
	 */
	EAttribute getSpot_Platform();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Spot#getWaitingTime <em>Waiting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Time</em>'.
	 * @see org.mdse.pts.schedule.Spot#getWaitingTime()
	 * @see #getSpot()
	 * @generated
	 */
	EAttribute getSpot_WaitingTime();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Spot#getTurnStation <em>Turn Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turn Station</em>'.
	 * @see org.mdse.pts.schedule.Spot#getTurnStation()
	 * @see #getSpot()
	 * @generated
	 */
	EAttribute getSpot_TurnStation();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Spot#getLeg <em>Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leg</em>'.
	 * @see org.mdse.pts.schedule.Spot#getLeg()
	 * @see #getSpot()
	 * @generated
	 */
	EReference getSpot_Leg();

	/**
	 * Returns the meta object for enum '{@link org.mdse.pts.schedule.WeekDays <em>Week Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Days</em>'.
	 * @see org.mdse.pts.schedule.WeekDays
	 * @generated
	 */
	EEnum getWeekDays();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScheduleFactory getScheduleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.ScheduleImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__NETWORK = eINSTANCE.getSchedule_Network();

		/**
		 * The meta object literal for the '<em><b>Depots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__DEPOTS = eINSTANCE.getSchedule_Depots();

		/**
		 * The meta object literal for the '<em><b>Train Schedules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__TRAIN_SCHEDULES = eINSTANCE.getSchedule_TrainSchedules();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.TrainScheduleImpl <em>Train Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.TrainScheduleImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrainSchedule()
		 * @generated
		 */
		EClass TRAIN_SCHEDULE = eINSTANCE.getTrainSchedule();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SCHEDULE__TRAIN = eINSTANCE.getTrainSchedule_Train();

		/**
		 * The meta object literal for the '<em><b>Time Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SCHEDULE__TIME_DESCRIPTION = eINSTANCE.getTrainSchedule_TimeDescription();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SCHEDULE__ROUTE = eINSTANCE.getTrainSchedule_Route();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.TimeDescriptionImpl <em>Time Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.TimeDescriptionImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTimeDescription()
		 * @generated
		 */
		EClass TIME_DESCRIPTION = eINSTANCE.getTimeDescription();

		/**
		 * The meta object literal for the '<em><b>Date Times</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DESCRIPTION__DATE_TIMES = eINSTANCE.getTimeDescription_DateTimes();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.DateTimeImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em><b>Weekday</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__WEEKDAY = eINSTANCE.getDateTime_Weekday();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_TIME__TIME = eINSTANCE.getDateTime_Time();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.TimeImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__HOURS = eINSTANCE.getTime_Hours();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__MINUTES = eINSTANCE.getTime_Minutes();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.RouteImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Spots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__SPOTS = eINSTANCE.getRoute_Spots();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.SpotImpl <em>Spot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.SpotImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSpot()
		 * @generated
		 */
		EClass SPOT = eINSTANCE.getSpot();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOT__STATION = eINSTANCE.getSpot_Station();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOT__PLATFORM = eINSTANCE.getSpot_Platform();

		/**
		 * The meta object literal for the '<em><b>Waiting Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOT__WAITING_TIME = eINSTANCE.getSpot_WaitingTime();

		/**
		 * The meta object literal for the '<em><b>Turn Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOT__TURN_STATION = eINSTANCE.getSpot_TurnStation();

		/**
		 * The meta object literal for the '<em><b>Leg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOT__LEG = eINSTANCE.getSpot_Leg();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.WeekDays <em>Week Days</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.WeekDays
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getWeekDays()
		 * @generated
		 */
		EEnum WEEK_DAYS = eINSTANCE.getWeekDays();

	}

} //SchedulePackage
