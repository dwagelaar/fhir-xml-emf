/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Content</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DocumentReferenceContent#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContent#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContent()
 * @model extendedMetaData="name='DocumentReference.Content' kind='elementOnly'"
 * @generated
 */
public interface DocumentReferenceContent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document or URL of the document along with critical metadata to prove content has integrity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContent_Attachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceContent#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DocumentReferenceProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of the document constraints, encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContent_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentReferenceProfile> getProfile();

} // DocumentReferenceContent
