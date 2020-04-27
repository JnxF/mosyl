/**
 */
package org.mdse.pts.schedule.impl;

import depot.Depot;
import java.util.Collection;
import network.Network;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getDepots <em>Depots</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getTrainSchedules <em>Train Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;
	/**
	 * The cached value of the '{@link #getDepots() <em>Depots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepots()
	 * @generated
	 * @ordered
	 */
	protected EList<Depot> depots;
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
	public Network getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (Network)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.SCHEDULE__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(Network newNetwork) {
		Network oldNetwork = network;
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
	public EList<Depot> getDepots() {
		if (depots == null) {
			depots = new EObjectResolvingEList<Depot>(Depot.class, this, SchedulePackage.SCHEDULE__DEPOTS);
		}
		return depots;
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
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case SchedulePackage.SCHEDULE__DEPOTS:
				return getDepots();
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
				setNetwork((Network)newValue);
				return;
			case SchedulePackage.SCHEDULE__DEPOTS:
				getDepots().clear();
				getDepots().addAll((Collection<? extends Depot>)newValue);
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
				setNetwork((Network)null);
				return;
			case SchedulePackage.SCHEDULE__DEPOTS:
				getDepots().clear();
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
				return network != null;
			case SchedulePackage.SCHEDULE__DEPOTS:
				return depots != null && !depots.isEmpty();
			case SchedulePackage.SCHEDULE__TRAIN_SCHEDULES:
				return trainSchedules != null && !trainSchedules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
