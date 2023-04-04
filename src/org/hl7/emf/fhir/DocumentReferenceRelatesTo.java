/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Relates To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this "document" encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DocumentReferenceRelatesTo#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReferenceRelatesTo#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReferenceRelatesTo()
 * @model extendedMetaData="name='DocumentReference.RelatesTo' kind='elementOnly'"
 * @generated
 */
public interface DocumentReferenceRelatesTo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relationship that this document has with anther document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReferenceRelatesTo_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReferenceRelatesTo#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target document of this relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReferenceRelatesTo_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReferenceRelatesTo#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

} // DocumentReferenceRelatesTo
