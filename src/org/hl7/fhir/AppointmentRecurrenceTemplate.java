/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment Recurrence Template</b></em>'.
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
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getRecurrenceType <em>Recurrence Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getLastOccurrenceDate <em>Last Occurrence Date</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getOccurrenceCount <em>Occurrence Count</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getOccurrenceDate <em>Occurrence Date</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getWeeklyTemplate <em>Weekly Template</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getMonthlyTemplate <em>Monthly Template</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getYearlyTemplate <em>Yearly Template</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getExcludingDate <em>Excluding Date</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getExcludingRecurrenceId <em>Excluding Recurrence Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate()
 * @model extendedMetaData="name='Appointment.RecurrenceTemplate' kind='elementOnly'"
 * @generated
 */
public interface AppointmentRecurrenceTemplate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timezone of the recurring appointment occurrences.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timezone</em>' containment reference.
	 * @see #setTimezone(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_Timezone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timezone' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTimezone();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getTimezone <em>Timezone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone</em>' containment reference.
	 * @see #getTimezone()
	 * @generated
	 */
	void setTimezone(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Recurrence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How often the appointment series should recur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurrence Type</em>' containment reference.
	 * @see #setRecurrenceType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_RecurrenceType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='recurrenceType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRecurrenceType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getRecurrenceType <em>Recurrence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Type</em>' containment reference.
	 * @see #getRecurrenceType()
	 * @generated
	 */
	void setRecurrenceType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Last Occurrence Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recurring appointments will not occur after this date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Occurrence Date</em>' containment reference.
	 * @see #setLastOccurrenceDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_LastOccurrenceDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastOccurrenceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastOccurrenceDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getLastOccurrenceDate <em>Last Occurrence Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Occurrence Date</em>' containment reference.
	 * @see #getLastOccurrenceDate()
	 * @generated
	 */
	void setLastOccurrenceDate(Date value);

	/**
	 * Returns the value of the '<em><b>Occurrence Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many appointments are planned in the recurrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Count</em>' containment reference.
	 * @see #setOccurrenceCount(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_OccurrenceCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceCount' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getOccurrenceCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getOccurrenceCount <em>Occurrence Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Count</em>' containment reference.
	 * @see #getOccurrenceCount()
	 * @generated
	 */
	void setOccurrenceCount(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Occurrence Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of specific dates that will have appointments generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Date</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_OccurrenceDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Date> getOccurrenceDate();

	/**
	 * Returns the value of the '<em><b>Weekly Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about weekly recurring appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weekly Template</em>' containment reference.
	 * @see #setWeeklyTemplate(AppointmentWeeklyTemplate)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_WeeklyTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weeklyTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentWeeklyTemplate getWeeklyTemplate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getWeeklyTemplate <em>Weekly Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weekly Template</em>' containment reference.
	 * @see #getWeeklyTemplate()
	 * @generated
	 */
	void setWeeklyTemplate(AppointmentWeeklyTemplate value);

	/**
	 * Returns the value of the '<em><b>Monthly Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about monthly recurring appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monthly Template</em>' containment reference.
	 * @see #setMonthlyTemplate(AppointmentMonthlyTemplate)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_MonthlyTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monthlyTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentMonthlyTemplate getMonthlyTemplate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getMonthlyTemplate <em>Monthly Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monthly Template</em>' containment reference.
	 * @see #getMonthlyTemplate()
	 * @generated
	 */
	void setMonthlyTemplate(AppointmentMonthlyTemplate value);

	/**
	 * Returns the value of the '<em><b>Yearly Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about yearly recurring appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yearly Template</em>' containment reference.
	 * @see #setYearlyTemplate(AppointmentYearlyTemplate)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_YearlyTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='yearlyTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentYearlyTemplate getYearlyTemplate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentRecurrenceTemplate#getYearlyTemplate <em>Yearly Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yearly Template</em>' containment reference.
	 * @see #getYearlyTemplate()
	 * @generated
	 */
	void setYearlyTemplate(AppointmentYearlyTemplate value);

	/**
	 * Returns the value of the '<em><b>Excluding Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any dates, such as holidays, that should be excluded from the recurrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluding Date</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_ExcludingDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludingDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Date> getExcludingDate();

	/**
	 * Returns the value of the '<em><b>Excluding Recurrence Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any dates, such as holidays, that should be excluded from the recurrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluding Recurrence Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointmentRecurrenceTemplate_ExcludingRecurrenceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludingRecurrenceId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getExcludingRecurrenceId();

} // AppointmentRecurrenceTemplate
