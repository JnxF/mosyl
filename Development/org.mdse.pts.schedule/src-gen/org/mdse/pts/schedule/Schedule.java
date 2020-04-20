/**
 */
package org.mdse.pts.schedule;

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
 *   <li>{@link org.mdse.pts.schedule.Schedule#getCompany <em>Company</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getTrainSchedules <em>Train Schedules</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {

	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(String)
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Network()
	 * @model required="true"
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Schedule#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' attribute.
	 * @see #setCompany(String)
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Company()
	 * @model required="true"
	 * @generated
	 */
	String getCompany();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Schedule#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' attribute.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(String value);

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
