/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Request Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.CoverageEligibilityRequestEvent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CoverageEligibilityRequestEvent#getWhenDateTime <em>When Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CoverageEligibilityRequestEvent#getWhenPeriod <em>When Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getCoverageEligibilityRequestEvent()
 * @model extendedMetaData="name='CoverageEligibilityRequest.Event' kind='elementOnly'"
 * @generated
 */
public interface CoverageEligibilityRequestEvent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded event such as when a service is expected or a card printed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverageEligibilityRequestEvent_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CoverageEligibilityRequestEvent#getType <em>Type</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverageEligibilityRequestEvent_WhenDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getWhenDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CoverageEligibilityRequestEvent#getWhenDateTime <em>When Date Time</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverageEligibilityRequestEvent_WhenPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getWhenPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CoverageEligibilityRequestEvent#getWhenPeriod <em>When Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Period</em>' containment reference.
	 * @see #getWhenPeriod()
	 * @generated
	 */
	void setWhenPeriod(Period value);

} // CoverageEligibilityRequestEvent
