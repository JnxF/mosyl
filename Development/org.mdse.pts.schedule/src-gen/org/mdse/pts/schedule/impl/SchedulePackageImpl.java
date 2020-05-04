/**
 */
package org.mdse.pts.schedule.impl;

import depot.DepotPackage;

import depot.impl.DepotPackageImpl;

import network.NetworkPackage;

import network.impl.NetworkPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.pts.schedule.DateTime;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.ScheduleFactory;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Spot;
import org.mdse.pts.schedule.Time;
import org.mdse.pts.schedule.TimeDescription;
import org.mdse.pts.schedule.TrainSchedule;
import org.mdse.pts.schedule.WeekDays;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulePackageImpl extends EPackageImpl implements SchedulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weekDaysEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mdse.pts.schedule.SchedulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchedulePackageImpl() {
		super(eNS_URI, ScheduleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SchedulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchedulePackage init() {
		if (isInited) return (SchedulePackage)EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchedulePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchedulePackageImpl theSchedulePackage = registeredSchedulePackage instanceof SchedulePackageImpl ? (SchedulePackageImpl)registeredSchedulePackage : new SchedulePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DepotPackage.eNS_URI);
		DepotPackageImpl theDepotPackage = (DepotPackageImpl)(registeredPackage instanceof DepotPackageImpl ? registeredPackage : DepotPackage.eINSTANCE);

		// Create package meta-data objects
		theSchedulePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theDepotPackage.createPackageContents();

		// Initialize created meta-data
		theSchedulePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theDepotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchedulePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchedulePackage.eNS_URI, theSchedulePackage);
		return theSchedulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedule_Network() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedule_Depots() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedule_TrainSchedules() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrainSchedule() {
		return trainScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrainSchedule_Train() {
		return (EReference)trainScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrainSchedule_TimeDescription() {
		return (EReference)trainScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrainSchedule_Route() {
		return (EReference)trainScheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeDescription() {
		return timeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeDescription_DateTimes() {
		return (EReference)timeDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Weekday() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDateTime_Time() {
		return (EReference)dateTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Hours() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Minutes() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoute_Spots() {
		return (EReference)routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpot() {
		return spotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpot_Station() {
		return (EReference)spotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpot_Platform() {
		return (EAttribute)spotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpot_WaitingTime() {
		return (EAttribute)spotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpot_TurnStation() {
		return (EAttribute)spotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpot_Leg() {
		return (EReference)spotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWeekDays() {
		return weekDaysEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduleFactory getScheduleFactory() {
		return (ScheduleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scheduleEClass = createEClass(SCHEDULE);
		createEReference(scheduleEClass, SCHEDULE__NETWORK);
		createEReference(scheduleEClass, SCHEDULE__DEPOTS);
		createEReference(scheduleEClass, SCHEDULE__TRAIN_SCHEDULES);

		trainScheduleEClass = createEClass(TRAIN_SCHEDULE);
		createEReference(trainScheduleEClass, TRAIN_SCHEDULE__TRAIN);
		createEReference(trainScheduleEClass, TRAIN_SCHEDULE__TIME_DESCRIPTION);
		createEReference(trainScheduleEClass, TRAIN_SCHEDULE__ROUTE);

		timeDescriptionEClass = createEClass(TIME_DESCRIPTION);
		createEReference(timeDescriptionEClass, TIME_DESCRIPTION__DATE_TIMES);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__WEEKDAY);
		createEReference(dateTimeEClass, DATE_TIME__TIME);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__HOURS);
		createEAttribute(timeEClass, TIME__MINUTES);

		routeEClass = createEClass(ROUTE);
		createEReference(routeEClass, ROUTE__SPOTS);

		spotEClass = createEClass(SPOT);
		createEReference(spotEClass, SPOT__STATION);
		createEAttribute(spotEClass, SPOT__PLATFORM);
		createEAttribute(spotEClass, SPOT__WAITING_TIME);
		createEAttribute(spotEClass, SPOT__TURN_STATION);
		createEReference(spotEClass, SPOT__LEG);

		// Create enums
		weekDaysEEnum = createEEnum(WEEK_DAYS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		DepotPackage theDepotPackage = (DepotPackage)EPackage.Registry.INSTANCE.getEPackage(DepotPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedule_Network(), theNetworkPackage.getNetwork(), null, "network", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_Depots(), theDepotPackage.getDepot(), null, "depots", null, 1, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_TrainSchedules(), this.getTrainSchedule(), null, "trainSchedules", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainScheduleEClass, TrainSchedule.class, "TrainSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainSchedule_Train(), theDepotPackage.getTrain(), null, "train", null, 0, 1, TrainSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainSchedule_TimeDescription(), this.getTimeDescription(), null, "timeDescription", null, 1, 1, TrainSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainSchedule_Route(), this.getRoute(), null, "route", null, 1, 1, TrainSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeDescriptionEClass, TimeDescription.class, "TimeDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeDescription_DateTimes(), this.getDateTime(), null, "dateTimes", null, 1, -1, TimeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Weekday(), this.getWeekDays(), "weekday", null, 1, -1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDateTime_Time(), this.getTime(), null, "time", null, 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Hours(), ecorePackage.getEIntegerObject(), "hours", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Minutes(), ecorePackage.getEIntegerObject(), "minutes", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute_Spots(), this.getSpot(), null, "spots", null, 2, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spotEClass, Spot.class, "Spot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpot_Station(), theNetworkPackage.getStation(), null, "station", null, 1, 1, Spot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpot_Platform(), ecorePackage.getEString(), "platform", null, 0, 1, Spot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpot_WaitingTime(), ecorePackage.getEIntegerObject(), "waitingTime", "0", 1, 1, Spot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpot_TurnStation(), ecorePackage.getEBooleanObject(), "turnStation", "false", 1, 1, Spot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpot_Leg(), theNetworkPackage.getLeg(), null, "leg", null, 0, 1, Spot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(weekDaysEEnum, WeekDays.class, "WeekDays");
		addEEnumLiteral(weekDaysEEnum, WeekDays.MONDAY);
		addEEnumLiteral(weekDaysEEnum, WeekDays.TUESDAY);
		addEEnumLiteral(weekDaysEEnum, WeekDays.WEDNESDAY);
		addEEnumLiteral(weekDaysEEnum, WeekDays.THURSDAY);
		addEEnumLiteral(weekDaysEEnum, WeekDays.FRIDAY);
		addEEnumLiteral(weekDaysEEnum, WeekDays.SATURDAY);
		addEEnumLiteral(weekDaysEEnum, WeekDays.SUNDAY);

		// Create resource
		createResource(eNS_URI);
	}

} //SchedulePackageImpl
