/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment Yearly Template</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.AppointmentYearlyTemplate#getYearInterval <em>Year Interval</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAppointmentYearlyTemplate()
 * @model extendedMetaData="name='Appointment.YearlyTemplate' kind='elementOnly'"
 * @generated
 */
public interface AppointmentYearlyTemplate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Year Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment recurs every nth year.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Year Interval</em>' containment reference.
	 * @see #setYearInterval(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getAppointmentYearlyTemplate_YearInterval()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='yearInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getYearInterval();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AppointmentYearlyTemplate#getYearInterval <em>Year Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Interval</em>' containment reference.
	 * @see #getYearInterval()
	 * @generated
	 */
	void setYearInterval(PositiveInt value);

} // AppointmentYearlyTemplate
