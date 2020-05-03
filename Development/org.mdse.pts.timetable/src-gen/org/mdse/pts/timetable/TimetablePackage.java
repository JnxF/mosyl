/**
 */
package org.mdse.pts.timetable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.mdse.pts.timetable.TimetableFactory
 * @model kind="package"
 * @generated
 */
public interface TimetablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timetable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/timetable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timetable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimetablePackage eINSTANCE = org.mdse.pts.timetable.impl.TimetablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.timetable.impl.TimetableImpl <em>Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.timetable.impl.TimetableImpl
	 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getTimetable()
	 * @generated
	 */
	int TIMETABLE = 0;

	/**
	 * The feature id for the '<em><b>Station Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__STATION_TRAINS = 0;

	/**
	 * The feature id for the '<em><b>Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__STATION_NAME = 1;

	/**
	 * The number of structural features of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.mdse.pts.timetable.impl.StationTrainImpl <em>Station Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.timetable.impl.StationTrainImpl
	 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getStationTrain()
	 * @generated
	 */
	int STATION_TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Train Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_TRAIN__TRAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Arrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_TRAIN__ARRIVAL = 1;

	/**
	 * The feature id for the '<em><b>Departure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_TRAIN__DEPARTURE = 2;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_TRAIN__PLATFORM = 3;

	/**
	 * The number of structural features of the '<em>Station Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_TRAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Station Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.timetable.impl.TimeAndStationImpl <em>Time And Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.timetable.impl.TimeAndStationImpl
	 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getTimeAndStation()
	 * @generated
	 */
	int TIME_AND_STATION = 2;

	/**
	 * The feature id for the '<em><b>Arr Dep Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_AND_STATION__ARR_DEP_TIME = 0;

	/**
	 * The feature id for the '<em><b>Next Prev Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_AND_STATION__NEXT_PREV_STATION = 1;

	/**
	 * The number of structural features of the '<em>Time And Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_AND_STATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time And Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_AND_STATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.mdse.pts.timetable.Timetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable</em>'.
	 * @see org.mdse.pts.timetable.Timetable
	 * @generated
	 */
	EClass getTimetable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.timetable.Timetable#getStationTrains <em>Station Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station Trains</em>'.
	 * @see org.mdse.pts.timetable.Timetable#getStationTrains()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_StationTrains();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.timetable.Timetable#getStationName <em>Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Name</em>'.
	 * @see org.mdse.pts.timetable.Timetable#getStationName()
	 * @see #getTimetable()
	 * @generated
	 */
	EAttribute getTimetable_StationName();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.timetable.StationTrain <em>Station Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Train</em>'.
	 * @see org.mdse.pts.timetable.StationTrain
	 * @generated
	 */
	EClass getStationTrain();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.timetable.StationTrain#getTrainName <em>Train Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Name</em>'.
	 * @see org.mdse.pts.timetable.StationTrain#getTrainName()
	 * @see #getStationTrain()
	 * @generated
	 */
	EAttribute getStationTrain_TrainName();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.timetable.StationTrain#getArrival <em>Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival</em>'.
	 * @see org.mdse.pts.timetable.StationTrain#getArrival()
	 * @see #getStationTrain()
	 * @generated
	 */
	EReference getStationTrain_Arrival();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.timetable.StationTrain#getDeparture <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure</em>'.
	 * @see org.mdse.pts.timetable.StationTrain#getDeparture()
	 * @see #getStationTrain()
	 * @generated
	 */
	EReference getStationTrain_Departure();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.timetable.StationTrain#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see org.mdse.pts.timetable.StationTrain#getPlatform()
	 * @see #getStationTrain()
	 * @generated
	 */
	EAttribute getStationTrain_Platform();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.timetable.TimeAndStation <em>Time And Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time And Station</em>'.
	 * @see org.mdse.pts.timetable.TimeAndStation
	 * @generated
	 */
	EClass getTimeAndStation();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.timetable.TimeAndStation#getArrDepTime <em>Arr Dep Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arr Dep Time</em>'.
	 * @see org.mdse.pts.timetable.TimeAndStation#getArrDepTime()
	 * @see #getTimeAndStation()
	 * @generated
	 */
	EReference getTimeAndStation_ArrDepTime();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.timetable.TimeAndStation#getNextPrevStation <em>Next Prev Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Prev Station</em>'.
	 * @see org.mdse.pts.timetable.TimeAndStation#getNextPrevStation()
	 * @see #getTimeAndStation()
	 * @generated
	 */
	EAttribute getTimeAndStation_NextPrevStation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimetableFactory getTimetableFactory();

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
		 * The meta object literal for the '{@link org.mdse.pts.timetable.impl.TimetableImpl <em>Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.timetable.impl.TimetableImpl
		 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getTimetable()
		 * @generated
		 */
		EClass TIMETABLE = eINSTANCE.getTimetable();
		/**
		 * The meta object literal for the '<em><b>Station Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__STATION_TRAINS = eINSTANCE.getTimetable_StationTrains();
		/**
		 * The meta object literal for the '<em><b>Station Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE__STATION_NAME = eINSTANCE.getTimetable_StationName();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.timetable.impl.StationTrainImpl <em>Station Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.timetable.impl.StationTrainImpl
		 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getStationTrain()
		 * @generated
		 */
		EClass STATION_TRAIN = eINSTANCE.getStationTrain();
		/**
		 * The meta object literal for the '<em><b>Train Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION_TRAIN__TRAIN_NAME = eINSTANCE.getStationTrain_TrainName();
		/**
		 * The meta object literal for the '<em><b>Arrival</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_TRAIN__ARRIVAL = eINSTANCE.getStationTrain_Arrival();
		/**
		 * The meta object literal for the '<em><b>Departure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_TRAIN__DEPARTURE = eINSTANCE.getStationTrain_Departure();
		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION_TRAIN__PLATFORM = eINSTANCE.getStationTrain_Platform();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.timetable.impl.TimeAndStationImpl <em>Time And Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.timetable.impl.TimeAndStationImpl
		 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getTimeAndStation()
		 * @generated
		 */
		EClass TIME_AND_STATION = eINSTANCE.getTimeAndStation();
		/**
		 * The meta object literal for the '<em><b>Arr Dep Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_AND_STATION__ARR_DEP_TIME = eINSTANCE.getTimeAndStation_ArrDepTime();
		/**
		 * The meta object literal for the '<em><b>Next Prev Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_AND_STATION__NEXT_PREV_STATION = eINSTANCE.getTimeAndStation_NextPrevStation();

	}

} //TimetablePackage
