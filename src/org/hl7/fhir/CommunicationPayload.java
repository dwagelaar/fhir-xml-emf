/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CommunicationPayload#getContentAttachment <em>Content Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationPayload#getContentReference <em>Content Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationPayload#getContentCodeableConcept <em>Content Codeable Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCommunicationPayload()
 * @model extendedMetaData="name='Communication.Payload' kind='elementOnly'"
 * @generated
 */
public interface CommunicationPayload extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Content Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Attachment</em>' containment reference.
	 * @see #setContentAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationPayload_ContentAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getContentAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationPayload#getContentAttachment <em>Content Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Attachment</em>' containment reference.
	 * @see #getContentAttachment()
	 * @generated
	 */
	void setContentAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Content Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Reference</em>' containment reference.
	 * @see #setContentReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationPayload_ContentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContentReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationPayload#getContentReference <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Reference</em>' containment reference.
	 * @see #getContentReference()
	 * @generated
	 */
	void setContentReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Content Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Codeable Concept</em>' containment reference.
	 * @see #setContentCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationPayload_ContentCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContentCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationPayload#getContentCodeableConcept <em>Content Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Codeable Concept</em>' containment reference.
	 * @see #getContentCodeableConcept()
	 * @generated
	 */
	void setContentCodeableConcept(CodeableConcept value);

} // CommunicationPayload
