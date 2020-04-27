/**
 */
package org.mdse.pts.depot;

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
 * @see org.mdse.pts.depot.DepotFactory
 * @model kind="package"
 * @generated
 */
public interface DepotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "depot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/depot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "depot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DepotPackage eINSTANCE = org.mdse.pts.depot.impl.DepotPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.DepotImpl <em>Depot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.DepotImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDepot()
	 * @generated
	 */
	int DEPOT = 0;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT__TRAINS = 0;

	/**
	 * The number of structural features of the '<em>Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.TrainImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__COACHES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.CoachImpl <em>Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.CoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getCoach()
	 * @generated
	 */
	int COACH = 2;

	/**
	 * The number of structural features of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.InnerCoachImpl <em>Inner Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.InnerCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getInnerCoach()
	 * @generated
	 */
	int INNER_COACH = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_COACH__NUMBER = COACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inner Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_COACH_FEATURE_COUNT = COACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inner Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_COACH_OPERATION_COUNT = COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.LocomotiveImpl <em>Locomotive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.LocomotiveImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getLocomotive()
	 * @generated
	 */
	int LOCOMOTIVE = 4;

	/**
	 * The number of structural features of the '<em>Locomotive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE_FEATURE_COUNT = COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Locomotive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE_OPERATION_COUNT = COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.PassengerCoachImpl <em>Passenger Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.PassengerCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getPassengerCoach()
	 * @generated
	 */
	int PASSENGER_COACH = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH__NUMBER = INNER_COACH__NUMBER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH__CLASS = INNER_COACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH_FEATURE_COUNT = INNER_COACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH_OPERATION_COUNT = INNER_COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.DinnerCoachImpl <em>Dinner Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.DinnerCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDinnerCoach()
	 * @generated
	 */
	int DINNER_COACH = 6;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINNER_COACH__NUMBER = INNER_COACH__NUMBER;

	/**
	 * The number of structural features of the '<em>Dinner Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINNER_COACH_FEATURE_COUNT = INNER_COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dinner Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINNER_COACH_OPERATION_COUNT = INNER_COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.TrainType <em>Train Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.TrainType
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrainType()
	 * @generated
	 */
	int TRAIN_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.PassengerClass <em>Passenger Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.PassengerClass
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getPassengerClass()
	 * @generated
	 */
	int PASSENGER_CLASS = 8;


	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Depot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depot</em>'.
	 * @see org.mdse.pts.depot.Depot
	 * @generated
	 */
	EClass getDepot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.depot.Depot#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see org.mdse.pts.depot.Depot#getTrains()
	 * @see #getDepot()
	 * @generated
	 */
	EReference getDepot_Trains();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see org.mdse.pts.depot.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.Train#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mdse.pts.depot.Train#getName()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.depot.Train#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coaches</em>'.
	 * @see org.mdse.pts.depot.Train#getCoaches()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Coaches();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.Train#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mdse.pts.depot.Train#getType()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Type();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach</em>'.
	 * @see org.mdse.pts.depot.Coach
	 * @generated
	 */
	EClass getCoach();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.InnerCoach <em>Inner Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inner Coach</em>'.
	 * @see org.mdse.pts.depot.InnerCoach
	 * @generated
	 */
	EClass getInnerCoach();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.InnerCoach#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.mdse.pts.depot.InnerCoach#getNumber()
	 * @see #getInnerCoach()
	 * @generated
	 */
	EAttribute getInnerCoach_Number();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Locomotive <em>Locomotive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locomotive</em>'.
	 * @see org.mdse.pts.depot.Locomotive
	 * @generated
	 */
	EClass getLocomotive();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.PassengerCoach <em>Passenger Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Coach</em>'.
	 * @see org.mdse.pts.depot.PassengerCoach
	 * @generated
	 */
	EClass getPassengerCoach();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.PassengerCoach#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mdse.pts.depot.PassengerCoach#getClass_()
	 * @see #getPassengerCoach()
	 * @generated
	 */
	EAttribute getPassengerCoach_Class();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.DinnerCoach <em>Dinner Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dinner Coach</em>'.
	 * @see org.mdse.pts.depot.DinnerCoach
	 * @generated
	 */
	EClass getDinnerCoach();

	/**
	 * Returns the meta object for enum '{@link org.mdse.pts.depot.TrainType <em>Train Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Train Type</em>'.
	 * @see org.mdse.pts.depot.TrainType
	 * @generated
	 */
	EEnum getTrainType();

	/**
	 * Returns the meta object for enum '{@link org.mdse.pts.depot.PassengerClass <em>Passenger Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Passenger Class</em>'.
	 * @see org.mdse.pts.depot.PassengerClass
	 * @generated
	 */
	EEnum getPassengerClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DepotFactory getDepotFactory();

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
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.DepotImpl <em>Depot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.DepotImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDepot()
		 * @generated
		 */
		EClass DEPOT = eINSTANCE.getDepot();
		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOT__TRAINS = eINSTANCE.getDepot_Trains();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.TrainImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__NAME = eINSTANCE.getTrain_Name();
		/**
		 * The meta object literal for the '<em><b>Coaches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__COACHES = eINSTANCE.getTrain_Coaches();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__TYPE = eINSTANCE.getTrain_Type();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.CoachImpl <em>Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.CoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getCoach()
		 * @generated
		 */
		EClass COACH = eINSTANCE.getCoach();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.InnerCoachImpl <em>Inner Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.InnerCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getInnerCoach()
		 * @generated
		 */
		EClass INNER_COACH = eINSTANCE.getInnerCoach();
		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INNER_COACH__NUMBER = eINSTANCE.getInnerCoach_Number();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.LocomotiveImpl <em>Locomotive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.LocomotiveImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getLocomotive()
		 * @generated
		 */
		EClass LOCOMOTIVE = eINSTANCE.getLocomotive();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.PassengerCoachImpl <em>Passenger Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.PassengerCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getPassengerCoach()
		 * @generated
		 */
		EClass PASSENGER_COACH = eINSTANCE.getPassengerCoach();
		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COACH__CLASS = eINSTANCE.getPassengerCoach_Class();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.DinnerCoachImpl <em>Dinner Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.DinnerCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDinnerCoach()
		 * @generated
		 */
		EClass DINNER_COACH = eINSTANCE.getDinnerCoach();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.TrainType <em>Train Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.TrainType
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrainType()
		 * @generated
		 */
		EEnum TRAIN_TYPE = eINSTANCE.getTrainType();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.PassengerClass <em>Passenger Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.PassengerClass
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getPassengerClass()
		 * @generated
		 */
		EEnum PASSENGER_CLASS = eINSTANCE.getPassengerClass();

	}

} //DepotPackage
