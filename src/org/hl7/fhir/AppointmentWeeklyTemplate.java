/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment Weekly Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AppointmentWeeklyTemplate#getMonday <em>Monday</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentWeeklyTemplate#getTuesday <em>Tuesday</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentWeeklyTemplate#getWednesday <em>Wednesday</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentWeeklyTemplate#getThursday <em>Thursday</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentWeeklyTemplate#getFriday <em>Friday</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentWeeklyTemplate#getSaturday <em>Saturday</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentWeeklyTemplate#getSunday <em>Sunday</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentWeeklyTemplate#getWeekInterval <em>Week Interval</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAppointmentWeeklyTemplate()
 * @model extendedMetaData="name='Appointment.WeeklyTemplate' kind='elementOnly'"
 * @generated
 */
public interface AppointmentWeeklyTemplate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Monday</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that recurring appointments should occur on Mondays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monday</em>' containment reference.
	 * @see #setMonday(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentWeeklyTemplate_Monday()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monday' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getMonday();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentWeeklyTemplate#getMonday <em>Monday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monday</em>' containment reference.
	 * @see #getMonday()
	 * @generated
	 */
	void setMonday(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Tuesday</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that recurring appointments should occur on Tuesdays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuesday</em>' containment reference.
	 * @see #setTuesday(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentWeeklyTemplate_Tuesday()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tuesday' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getTuesday();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentWeeklyTemplate#getTuesday <em>Tuesday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuesday</em>' containment reference.
	 * @see #getTuesday()
	 * @generated
	 */
	void setTuesday(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Wednesday</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that recurring appointments should occur on Wednesdays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wednesday</em>' containment reference.
	 * @see #setWednesday(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentWeeklyTemplate_Wednesday()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wednesday' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getWednesday();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentWeeklyTemplate#getWednesday <em>Wednesday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wednesday</em>' containment reference.
	 * @see #getWednesday()
	 * @generated
	 */
	void setWednesday(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Thursday</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that recurring appointments should occur on Thursdays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thursday</em>' containment reference.
	 * @see #setThursday(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentWeeklyTemplate_Thursday()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thursday' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getThursday();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentWeeklyTemplate#getThursday <em>Thursday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thursday</em>' containment reference.
	 * @see #getThursday()
	 * @generated
	 */
	void setThursday(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Friday</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that recurring appointments should occur on Fridays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Friday</em>' containment reference.
	 * @see #setFriday(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentWeeklyTemplate_Friday()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='friday' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getFriday();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentWeeklyTemplate#getFriday <em>Friday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friday</em>' containment reference.
	 * @see #getFriday()
	 * @generated
	 */
	void setFriday(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Saturday</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that recurring appointments should occur on Saturdays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Saturday</em>' containment reference.
	 * @see #setSaturday(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentWeeklyTemplate_Saturday()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='saturday' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getSaturday();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentWeeklyTemplate#getSaturday <em>Saturday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saturday</em>' containment reference.
	 * @see #getSaturday()
	 * @generated
	 */
	void setSaturday(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Sunday</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that recurring appointments should occur on Sundays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sunday</em>' containment reference.
	 * @see #setSunday(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentWeeklyTemplate_Sunday()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sunday' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getSunday();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentWeeklyTemplate#getSunday <em>Sunday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sunday</em>' containment reference.
	 * @see #getSunday()
	 * @generated
	 */
	void setSunday(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Week Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interval defines if the recurrence is every nth week. The default is every week, so it is expected that this value will be 2 or more.
	 * 
	 * e.g. For recurring every second week this interval would be 2, or every third week the interval would be 3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Week Interval</em>' containment reference.
	 * @see #setWeekInterval(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentWeeklyTemplate_WeekInterval()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weekInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getWeekInterval();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentWeeklyTemplate#getWeekInterval <em>Week Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Interval</em>' containment reference.
	 * @see #getWeekInterval()
	 * @generated
	 */
	void setWeekInterval(PositiveInt value);

} // AppointmentWeeklyTemplate
