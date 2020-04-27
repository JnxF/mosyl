/**
 */
package org.mdse.pts.depot.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.pts.depot.Coach;
import org.mdse.pts.depot.Depot;
import org.mdse.pts.depot.DepotFactory;
import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.DinnerCoach;
import org.mdse.pts.depot.InnerCoach;
import org.mdse.pts.depot.Locomotive;
import org.mdse.pts.depot.PassengerClass;
import org.mdse.pts.depot.PassengerCoach;
import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.TrainType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepotPackageImpl extends EPackageImpl implements DepotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coachEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerCoachEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locomotiveEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerCoachEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dinnerCoachEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trainTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum passengerClassEEnum = null;

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
	 * @see org.mdse.pts.depot.DepotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DepotPackageImpl() {
		super(eNS_URI, DepotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DepotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DepotPackage init() {
		if (isInited) return (DepotPackage)EPackage.Registry.INSTANCE.getEPackage(DepotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDepotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DepotPackageImpl theDepotPackage = registeredDepotPackage instanceof DepotPackageImpl ? (DepotPackageImpl)registeredDepotPackage : new DepotPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDepotPackage.createPackageContents();

		// Initialize created meta-data
		theDepotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDepotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DepotPackage.eNS_URI, theDepotPackage);
		return theDepotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepot() {
		return depotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepot_Trains() {
		return (EReference)depotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrain() {
		return trainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrain_Name() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrain_Coaches() {
		return (EReference)trainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrain_Type() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoach() {
		return coachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerCoach() {
		return innerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInnerCoach_Number() {
		return (EAttribute)innerCoachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocomotive() {
		return locomotiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassengerCoach() {
		return passengerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCoach_Class() {
		return (EAttribute)passengerCoachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDinnerCoach() {
		return dinnerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTrainType() {
		return trainTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPassengerClass() {
		return passengerClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepotFactory getDepotFactory() {
		return (DepotFactory)getEFactoryInstance();
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
		depotEClass = createEClass(DEPOT);
		createEReference(depotEClass, DEPOT__TRAINS);

		trainEClass = createEClass(TRAIN);
		createEAttribute(trainEClass, TRAIN__NAME);
		createEReference(trainEClass, TRAIN__COACHES);
		createEAttribute(trainEClass, TRAIN__TYPE);

		coachEClass = createEClass(COACH);

		innerCoachEClass = createEClass(INNER_COACH);
		createEAttribute(innerCoachEClass, INNER_COACH__NUMBER);

		locomotiveEClass = createEClass(LOCOMOTIVE);

		passengerCoachEClass = createEClass(PASSENGER_COACH);
		createEAttribute(passengerCoachEClass, PASSENGER_COACH__CLASS);

		dinnerCoachEClass = createEClass(DINNER_COACH);

		// Create enums
		trainTypeEEnum = createEEnum(TRAIN_TYPE);
		passengerClassEEnum = createEEnum(PASSENGER_CLASS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		innerCoachEClass.getESuperTypes().add(this.getCoach());
		locomotiveEClass.getESuperTypes().add(this.getCoach());
		passengerCoachEClass.getESuperTypes().add(this.getInnerCoach());
		dinnerCoachEClass.getESuperTypes().add(this.getInnerCoach());

		// Initialize classes, features, and operations; add parameters
		initEClass(depotEClass, Depot.class, "Depot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepot_Trains(), this.getTrain(), null, "trains", null, 0, -1, Depot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrain_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_Coaches(), this.getCoach(), null, "coaches", null, 1, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_Type(), this.getTrainType(), "Type", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coachEClass, Coach.class, "Coach", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(innerCoachEClass, InnerCoach.class, "InnerCoach", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInnerCoach_Number(), ecorePackage.getEInt(), "Number", null, 1, 1, InnerCoach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locomotiveEClass, Locomotive.class, "Locomotive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(passengerCoachEClass, PassengerCoach.class, "PassengerCoach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerCoach_Class(), this.getPassengerClass(), "Class", null, 1, 1, PassengerCoach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dinnerCoachEClass, DinnerCoach.class, "DinnerCoach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(trainTypeEEnum, TrainType.class, "TrainType");
		addEEnumLiteral(trainTypeEEnum, TrainType.REGIONAL);
		addEEnumLiteral(trainTypeEEnum, TrainType.INTERCITY);

		initEEnum(passengerClassEEnum, PassengerClass.class, "PassengerClass");
		addEEnumLiteral(passengerClassEEnum, PassengerClass.FIRST);
		addEEnumLiteral(passengerClassEEnum, PassengerClass.SECOND);

		// Create resource
		createResource(eNS_URI);
	}

} //DepotPackageImpl
