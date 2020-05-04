/**
 */
package org.mdse.pts.timetable.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.pts.timetable.DateTime;
import org.mdse.pts.timetable.StationTrain;
import org.mdse.pts.timetable.TimeAndStation;
import org.mdse.pts.timetable.Timetable;
import org.mdse.pts.timetable.TimetableFactory;
import org.mdse.pts.timetable.TimetablePackage;
import shared.SharedPackage;
import shared.impl.SharedPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimetablePackageImpl extends EPackageImpl implements TimetablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timetableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationTrainEClass = null;
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
	private EClass timeAndStationEClass = null;

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
	 * @see org.mdse.pts.timetable.TimetablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimetablePackageImpl() {
		super(eNS_URI, TimetableFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimetablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimetablePackage init() {
		if (isInited) return (TimetablePackage)EPackage.Registry.INSTANCE.getEPackage(TimetablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTimetablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TimetablePackageImpl theTimetablePackage = registeredTimetablePackage instanceof TimetablePackageImpl ? (TimetablePackageImpl)registeredTimetablePackage : new TimetablePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SharedPackage.eNS_URI);
		SharedPackageImpl theSharedPackage = (SharedPackageImpl)(registeredPackage instanceof SharedPackageImpl ? registeredPackage : SharedPackage.eINSTANCE);

		// Create package meta-data objects
		theTimetablePackage.createPackageContents();
		theSharedPackage.createPackageContents();

		// Initialize created meta-data
		theTimetablePackage.initializePackageContents();
		theSharedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimetablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimetablePackage.eNS_URI, theTimetablePackage);
		return theTimetablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimetable() {
		return timetableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimetable_StationTrains() {
		return (EReference)timetableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimetable_StationName() {
		return (EAttribute)timetableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStationTrain() {
		return stationTrainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStationTrain_TrainName() {
		return (EAttribute)stationTrainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStationTrain_Arrival() {
		return (EReference)stationTrainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStationTrain_Departure() {
		return (EReference)stationTrainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStationTrain_Platform() {
		return (EAttribute)stationTrainEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getDateTime_Day() {
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
	public EClass getTimeAndStation() {
		return timeAndStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeAndStation_ArrDepTime() {
		return (EReference)timeAndStationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeAndStation_NextPrevStation() {
		return (EAttribute)timeAndStationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimetableFactory getTimetableFactory() {
		return (TimetableFactory)getEFactoryInstance();
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
		timetableEClass = createEClass(TIMETABLE);
		createEReference(timetableEClass, TIMETABLE__STATION_TRAINS);
		createEAttribute(timetableEClass, TIMETABLE__STATION_NAME);

		stationTrainEClass = createEClass(STATION_TRAIN);
		createEAttribute(stationTrainEClass, STATION_TRAIN__TRAIN_NAME);
		createEReference(stationTrainEClass, STATION_TRAIN__ARRIVAL);
		createEReference(stationTrainEClass, STATION_TRAIN__DEPARTURE);
		createEAttribute(stationTrainEClass, STATION_TRAIN__PLATFORM);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__DAY);
		createEReference(dateTimeEClass, DATE_TIME__TIME);

		timeAndStationEClass = createEClass(TIME_AND_STATION);
		createEReference(timeAndStationEClass, TIME_AND_STATION__ARR_DEP_TIME);
		createEAttribute(timeAndStationEClass, TIME_AND_STATION__NEXT_PREV_STATION);
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
		SharedPackage theSharedPackage = (SharedPackage)EPackage.Registry.INSTANCE.getEPackage(SharedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(timetableEClass, Timetable.class, "Timetable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimetable_StationTrains(), this.getStationTrain(), null, "stationTrains", null, 0, -1, Timetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimetable_StationName(), ecorePackage.getEString(), "stationName", null, 1, 1, Timetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationTrainEClass, StationTrain.class, "StationTrain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStationTrain_TrainName(), ecorePackage.getEString(), "trainName", null, 1, 1, StationTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStationTrain_Arrival(), this.getTimeAndStation(), null, "arrival", null, 0, 1, StationTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStationTrain_Departure(), this.getTimeAndStation(), null, "departure", null, 0, 1, StationTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStationTrain_Platform(), ecorePackage.getEString(), "platform", null, 1, 1, StationTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Day(), theSharedPackage.getDaysOfTheWeek(), "day", null, 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDateTime_Time(), theSharedPackage.getTime(), null, "time", null, 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeAndStationEClass, TimeAndStation.class, "TimeAndStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeAndStation_ArrDepTime(), this.getDateTime(), null, "arrDepTime", null, 1, 1, TimeAndStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeAndStation_NextPrevStation(), ecorePackage.getEString(), "nextPrevStation", null, 1, 1, TimeAndStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TimetablePackageImpl
