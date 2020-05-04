/**
 */
package org.mdse.pts.schedule;

import depot.Depot;

import network.Network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getDepots <em>Depots</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getTrainSchedules <em>Train Schedules</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Network()
	 * @model required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Schedule#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Depots</b></em>' reference list.
	 * The list contents are of type {@link depot.Depot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depots</em>' reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Depots()
	 * @model required="true"
	 * @generated
	 */
	EList<Depot> getDepots();

	/**
	 * Returns the value of the '<em><b>Train Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.TrainSchedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Schedules</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_TrainSchedules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrainSchedule> getTrainSchedules();

} // Schedule
