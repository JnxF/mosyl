/**
 */
package org.mdse.pts.schedule.impl;

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
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.TrainSchedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getTrainSchedules <em>Train Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
	/**
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected String network = NETWORK_EDEFAULT;
	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected String company = COMPANY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTrainSchedules() <em>Train Schedules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSchedule> trainSchedules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(String newNetwork) {
		String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.SCHEDULE__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompany(String newCompany) {
		String oldCompany = company;
		company = newCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.SCHEDULE__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrainSchedule> getTrainSchedules() {
		if (trainSchedules == null) {
			trainSchedules = new EObjectContainmentEList<TrainSchedule>(TrainSchedule.class, this, SchedulePackage.SCHEDULE__TRAIN_SCHEDULES);
		}
		return trainSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulePackage.SCHEDULE__TRAIN_SCHEDULES:
				return ((InternalEList<?>)getTrainSchedules()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.SCHEDULE__NETWORK:
				return getNetwork();
			case SchedulePackage.SCHEDULE__COMPANY:
				return getCompany();
			case SchedulePackage.SCHEDULE__TRAIN_SCHEDULES:
				return getTrainSchedules();
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
			case SchedulePackage.SCHEDULE__NETWORK:
				setNetwork((String)newValue);
				return;
			case SchedulePackage.SCHEDULE__COMPANY:
				setCompany((String)newValue);
				return;
			case SchedulePackage.SCHEDULE__TRAIN_SCHEDULES:
				getTrainSchedules().clear();
				getTrainSchedules().addAll((Collection<? extends TrainSchedule>)newValue);
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
			case SchedulePackage.SCHEDULE__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case SchedulePackage.SCHEDULE__COMPANY:
				setCompany(COMPANY_EDEFAULT);
				return;
			case SchedulePackage.SCHEDULE__TRAIN_SCHEDULES:
				getTrainSchedules().clear();
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
			case SchedulePackage.SCHEDULE__NETWORK:
				return NETWORK_EDEFAULT == null ? network != null : !NETWORK_EDEFAULT.equals(network);
			case SchedulePackage.SCHEDULE__COMPANY:
				return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
			case SchedulePackage.SCHEDULE__TRAIN_SCHEDULES:
				return trainSchedules != null && !trainSchedules.isEmpty();
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
		result.append(" (network: ");
		result.append(network);
		result.append(", company: ");
		result.append(company);
		result.append(')');
		return result.toString();
	}

} //ScheduleImpl
