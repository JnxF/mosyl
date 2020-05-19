/**
 */
package org.mdse.pts.timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.Timetable#getStationTrains <em>Station Trains</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Timetable#getStationName <em>Station Name</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getTimetable()
 * @model
 * @generated
 */
public interface Timetable extends EObject {
	/**
	 * Returns the value of the '<em><b>Station Trains</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.timetable.StationTrain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Trains</em>' containment reference list.
	 * @see org.mdse.pts.timetable.TimetablePackage#getTimetable_StationTrains()
	 * @model containment="true"
	 * @generated
	 */
	EList<StationTrain> getStationTrains();

	/**
	 * Returns the value of the '<em><b>Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Name</em>' attribute.
	 * @see #setStationName(String)
	 * @see org.mdse.pts.timetable.TimetablePackage#getTimetable_StationName()
	 * @model required="true"
	 * @generated
	 */
	String getStationName();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Timetable#getStationName <em>Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Name</em>' attribute.
	 * @see #getStationName()
	 * @generated
	 */
	void setStationName(String value);

} // Timetable
