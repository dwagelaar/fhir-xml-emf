/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitEvent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitEvent#getWhenDateTime <em>When Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitEvent#getWhenPeriod <em>When Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitEvent()
 * @model extendedMetaData="name='ExplanationOfBenefit.Event' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitEvent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded event such as when a service is expected or a card printed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitEvent_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitEvent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>When Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Date Time</em>' containment reference.
	 * @see #setWhenDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitEvent_WhenDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getWhenDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitEvent#getWhenDateTime <em>When Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Date Time</em>' containment reference.
	 * @see #getWhenDateTime()
	 * @generated
	 */
	void setWhenDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>When Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Period</em>' containment reference.
	 * @see #setWhenPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitEvent_WhenPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getWhenPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitEvent#getWhenPeriod <em>When Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Period</em>' containment reference.
	 * @see #getWhenPeriod()
	 * @generated
	 */
	void setWhenPeriod(Period value);

} // ExplanationOfBenefitEvent
