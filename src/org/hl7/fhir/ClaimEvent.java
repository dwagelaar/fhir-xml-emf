/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimEvent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimEvent#getWhenDateTime <em>When Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimEvent#getWhenPeriod <em>When Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimEvent()
 * @model extendedMetaData="name='Claim.Event' kind='elementOnly'"
 * @generated
 */
public interface ClaimEvent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded event such as when a service is expected or a card printed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimEvent_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimEvent#getType <em>Type</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimEvent_WhenDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getWhenDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimEvent#getWhenDateTime <em>When Date Time</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimEvent_WhenPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getWhenPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimEvent#getWhenPeriod <em>When Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Period</em>' containment reference.
	 * @see #getWhenPeriod()
	 * @generated
	 */
	void setWhenPeriod(Period value);

} // ClaimEvent
