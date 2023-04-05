/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment Monthly Template</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.AppointmentMonthlyTemplate#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AppointmentMonthlyTemplate#getNthWeekOfMonth <em>Nth Week Of Month</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AppointmentMonthlyTemplate#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AppointmentMonthlyTemplate#getMonthInterval <em>Month Interval</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAppointmentMonthlyTemplate()
 * @model extendedMetaData="name='Appointment.MonthlyTemplate' kind='elementOnly'"
 * @generated
 */
public interface AppointmentMonthlyTemplate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Day Of Month</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that appointments in the series of recurring appointments should occur on a specific day of the month.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day Of Month</em>' containment reference.
	 * @see #setDayOfMonth(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getAppointmentMonthlyTemplate_DayOfMonth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dayOfMonth' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDayOfMonth();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AppointmentMonthlyTemplate#getDayOfMonth <em>Day Of Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Month</em>' containment reference.
	 * @see #getDayOfMonth()
	 * @generated
	 */
	void setDayOfMonth(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Nth Week Of Month</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which week within a month the appointments in the series of recurring appointments should occur on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nth Week Of Month</em>' containment reference.
	 * @see #setNthWeekOfMonth(Coding)
	 * @see org.hl7.emf.fhir.FhirPackage#getAppointmentMonthlyTemplate_NthWeekOfMonth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nthWeekOfMonth' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getNthWeekOfMonth();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AppointmentMonthlyTemplate#getNthWeekOfMonth <em>Nth Week Of Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nth Week Of Month</em>' containment reference.
	 * @see #getNthWeekOfMonth()
	 * @generated
	 */
	void setNthWeekOfMonth(Coding value);

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which day of the week the recurring appointments should occur each nth week.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day Of Week</em>' containment reference.
	 * @see #setDayOfWeek(Coding)
	 * @see org.hl7.emf.fhir.FhirPackage#getAppointmentMonthlyTemplate_DayOfWeek()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dayOfWeek' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getDayOfWeek();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AppointmentMonthlyTemplate#getDayOfWeek <em>Day Of Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Week</em>' containment reference.
	 * @see #getDayOfWeek()
	 * @generated
	 */
	void setDayOfWeek(Coding value);

	/**
	 * Returns the value of the '<em><b>Month Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that recurring appointments should occur every nth month.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month Interval</em>' containment reference.
	 * @see #setMonthInterval(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getAppointmentMonthlyTemplate_MonthInterval()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='monthInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getMonthInterval();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AppointmentMonthlyTemplate#getMonthInterval <em>Month Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month Interval</em>' containment reference.
	 * @see #getMonthInterval()
	 * @generated
	 */
	void setMonthInterval(PositiveInt value);

} // AppointmentMonthlyTemplate
