/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Profile</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DocumentReferenceProfile#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceProfile#getValueUri <em>Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceProfile#getValueCanonical <em>Value Canonical</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceProfile()
 * @model extendedMetaData="name='DocumentReference.Profile' kind='elementOnly'"
 * @generated
 */
public interface DocumentReferenceProfile extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Coding</em>' containment reference.
	 * @see #setValueCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceProfile_ValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getValueCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceProfile#getValueCoding <em>Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Coding</em>' containment reference.
	 * @see #getValueCoding()
	 * @generated
	 */
	void setValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Uri</em>' containment reference.
	 * @see #setValueUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceProfile_ValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceProfile#getValueUri <em>Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Uri</em>' containment reference.
	 * @see #getValueUri()
	 * @generated
	 */
	void setValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Value Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Canonical</em>' containment reference.
	 * @see #setValueCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceProfile_ValueCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getValueCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceProfile#getValueCanonical <em>Value Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Canonical</em>' containment reference.
	 * @see #getValueCanonical()
	 * @generated
	 */
	void setValueCanonical(Canonical value);

} // DocumentReferenceProfile
