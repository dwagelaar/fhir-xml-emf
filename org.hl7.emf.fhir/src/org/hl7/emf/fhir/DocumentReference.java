/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this "document" encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getModality <em>Modality</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getFacilityType <em>Facility Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getPracticeSetting <em>Practice Setting</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getAttester <em>Attester</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DocumentReference#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference()
 * @model extendedMetaData="name='DocumentReference' kind='elementOnly'"
 * @generated
 */
public interface DocumentReference extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other business identifiers associated with the document, including version independent identifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explicitly assigned identifer of a variation of the content in the DocumentReference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A procedure that is fulfilled in whole or in part by the creation of this media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this document reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DocumentReferenceStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentReferenceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DocumentReferenceStatus value);

	/**
	 * Returns the value of the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the underlying document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doc Status</em>' containment reference.
	 * @see #setDocStatus(CompositionStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_DocStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='docStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositionStatus getDocStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getDocStatus <em>Doc Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Status</em>' containment reference.
	 * @see #getDocStatus()
	 * @generated
	 */
	void setDocStatus(CompositionStatus value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imaging modality used. This may include both acquisition and non-acquisition modalities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modality</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Modality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modality' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getModality();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the clinical encounter or type of care that the document content is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getContext();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the type Code, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getEvent();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The anatomic structures included in the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getBodySite();

	/**
	 * Returns the value of the '<em><b>Facility Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of facility where the patient was seen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Type</em>' containment reference.
	 * @see #setFacilityType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_FacilityType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facilityType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFacilityType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getFacilityType <em>Facility Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Type</em>' containment reference.
	 * @see #getFacilityType()
	 * @generated
	 */
	void setFacilityType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Practice Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practice Setting</em>' containment reference.
	 * @see #setPracticeSetting(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_PracticeSetting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='practiceSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPracticeSetting();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getPracticeSetting <em>Practice Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practice Setting</em>' containment reference.
	 * @see #getPracticeSetting()
	 * @generated
	 */
	void setPracticeSetting(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period over which the service that is described by the document was provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the document reference was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Instant)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Instant value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies who is responsible for adding the information to the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthor();

	/**
	 * Returns the value of the '<em><b>Attester</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DocumentReferenceAttester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A participant who has authenticated the accuracy of the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attester</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Attester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attester' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentReferenceAttester> getAttester();

	/**
	 * Returns the value of the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custodian</em>' containment reference.
	 * @see #setCustodian(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Custodian()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custodian' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCustodian();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getCustodian <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custodian</em>' containment reference.
	 * @see #getCustodian()
	 * @generated
	 */
	void setCustodian(Reference value);

	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DocumentReferenceRelatesTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationships that this document has with other document references that already exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relates To</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_RelatesTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentReferenceRelatesTo> getRelatesTo();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable description of the source document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DocumentReference#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Security-Tag codes specifying the level of privacy/security of the Document found at DocumentReference.content.attachment.url. Note that DocumentReference.meta.security contains the security labels of the data elements in DocumentReference, while DocumentReference.securityLabel contains the security labels for the document the reference refers to. The distinction recognizes that the document may contain sensitive information, while the DocumentReference is metadata about the document and thus might not be as sensitive as the document. For example: a psychotherapy episode may contain highly sensitive information, while the metadata may simply indicate that some episode happened.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_SecurityLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSecurityLabel();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DocumentReferenceContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document and format referenced.  If there are multiple content element repetitions, these must all represent the same document in different format, or attachment metadata.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDocumentReference_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentReferenceContent> getContent();

} // DocumentReference
