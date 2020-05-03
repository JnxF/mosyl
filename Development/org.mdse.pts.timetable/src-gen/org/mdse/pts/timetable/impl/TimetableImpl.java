/**
 */
package org.mdse.pts.timetable.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mdse.pts.timetable.StationTrain;
import org.mdse.pts.timetable.Timetable;
import org.mdse.pts.timetable.TimetablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.impl.TimetableImpl#getStationTrains <em>Station Trains</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.impl.TimetableImpl#getStationName <em>Station Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimetableImpl extends MinimalEObjectImpl.Container implements Timetable {
	/**
	 * The cached value of the '{@link #getStationTrains() <em>Station Trains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationTrains()
	 * @generated
	 * @ordered
	 */
	protected EList<StationTrain> stationTrains;
	/**
	 * The default value of the '{@link #getStationName() <em>Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationName()
	 * @generated
	 * @ordered
	 */
	protected static final String STATION_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStationName() <em>Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationName()
	 * @generated
	 * @ordered
	 */
	protected String stationName = STATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StationTrain> getStationTrains() {
		if (stationTrains == null) {
			stationTrains = new EObjectContainmentEList<StationTrain>(StationTrain.class, this, TimetablePackage.TIMETABLE__STATION_TRAINS);
		}
		return stationTrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStationName() {
		return stationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStationName(String newStationName) {
		String oldStationName = stationName;
		stationName = newStationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.TIMETABLE__STATION_NAME, oldStationName, stationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimetablePackage.TIMETABLE__STATION_TRAINS:
				return ((InternalEList<?>)getStationTrains()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimetablePackage.TIMETABLE__STATION_TRAINS:
				return getStationTrains();
			case TimetablePackage.TIMETABLE__STATION_NAME:
				return getStationName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimetablePackage.TIMETABLE__STATION_TRAINS:
				getStationTrains().clear();
				getStationTrains().addAll((Collection<? extends StationTrain>)newValue);
				return;
			case TimetablePackage.TIMETABLE__STATION_NAME:
				setStationName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimetablePackage.TIMETABLE__STATION_TRAINS:
				getStationTrains().clear();
				return;
			case TimetablePackage.TIMETABLE__STATION_NAME:
				setStationName(STATION_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimetablePackage.TIMETABLE__STATION_TRAINS:
				return stationTrains != null && !stationTrains.isEmpty();
			case TimetablePackage.TIMETABLE__STATION_NAME:
				return STATION_NAME_EDEFAULT == null ? stationName != null : !STATION_NAME_EDEFAULT.equals(stationName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (stationName: ");
		result.append(stationName);
		result.append(')');
		return result.toString();
	}

} //TimetableImpl
