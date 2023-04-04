/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability Available Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Availability data for an {item}.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.AvailabilityAvailableTime#getDaysOfWeek <em>Days Of Week</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AvailabilityAvailableTime#getAllDay <em>All Day</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AvailabilityAvailableTime#getAvailableStartTime <em>Available Start Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AvailabilityAvailableTime#getAvailableEndTime <em>Available End Time</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAvailabilityAvailableTime()
 * @model extendedMetaData="name='Availability.AvailableTime' kind='elementOnly'"
 * @generated
 */
public interface AvailabilityAvailableTime extends DataType {
	/**
	 * Returns the value of the '<em><b>Days Of Week</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mon | tue | wed | thu | fri | sat | sun.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Days Of Week</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAvailabilityAvailableTime_DaysOfWeek()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='daysOfWeek' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getDaysOfWeek();

	/**
	 * Returns the value of the '<em><b>All Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Always available? i.e. 24 hour service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Day</em>' containment reference.
	 * @see #setAllDay(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getAvailabilityAvailableTime_AllDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allDay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getAllDay();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AvailabilityAvailableTime#getAllDay <em>All Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Day</em>' containment reference.
	 * @see #getAllDay()
	 * @generated
	 */
	void setAllDay(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Available Start Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opening time of day (ignored if allDay = true).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Start Time</em>' containment reference.
	 * @see #setAvailableStartTime(Time)
	 * @see org.hl7.emf.fhir.FhirPackage#getAvailabilityAvailableTime_AvailableStartTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availableStartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getAvailableStartTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AvailabilityAvailableTime#getAvailableStartTime <em>Available Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Start Time</em>' containment reference.
	 * @see #getAvailableStartTime()
	 * @generated
	 */
	void setAvailableStartTime(Time value);

	/**
	 * Returns the value of the '<em><b>Available End Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Closing time of day (ignored if allDay = true).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available End Time</em>' containment reference.
	 * @see #setAvailableEndTime(Time)
	 * @see org.hl7.emf.fhir.FhirPackage#getAvailabilityAvailableTime_AvailableEndTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availableEndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getAvailableEndTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AvailabilityAvailableTime#getAvailableEndTime <em>Available End Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available End Time</em>' containment reference.
	 * @see #getAvailableEndTime()
	 * @generated
	 */
	void setAvailableEndTime(Time value);

} // AvailabilityAvailableTime
