/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EvidenceReport Resource is a specialized container for a collection of resources and codeable concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation resources and related concepts.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getRelatedIdentifier <em>Related Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getCiteAsReference <em>Cite As Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getCiteAsMarkdown <em>Cite As Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReport#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidenceReport()
 * @model extendedMetaData="name='EvidenceReport' kind='elementOnly'"
 * @generated
 */
public interface EvidenceReport extends MetadataResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to identify this EvidenceReport when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the summary is stored on different servers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReport#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this summary. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReport#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence report instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getUseContext();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify this EvidenceReport when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Related Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify things closely related to this EvidenceReport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_RelatedIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getRelatedIdentifier();

	/**
	 * Returns the value of the '<em><b>Cite As Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite As Reference</em>' containment reference.
	 * @see #setCiteAsReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_CiteAsReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citeAsReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCiteAsReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReport#getCiteAsReference <em>Cite As Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite As Reference</em>' containment reference.
	 * @see #getCiteAsReference()
	 * @generated
	 */
	void setCiteAsReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Cite As Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite As Markdown</em>' containment reference.
	 * @see #setCiteAsMarkdown(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_CiteAsMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citeAsMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCiteAsMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReport#getCiteAsMarkdown <em>Cite As Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite As Markdown</em>' containment reference.
	 * @see #getCiteAsMarkdown()
	 * @generated
	 */
	void setCiteAsMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the kind of report, such as grouping of classifiers, search results, or human-compiled expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReport#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for footnotes and annotations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Related Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link, description or reference to artifact associated with the report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Artifact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_RelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifact();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the subject or focus of the report. Answers "What is this report about?".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(EvidenceReportSubject)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceReportSubject getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReport#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(EvidenceReportSubject value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization or individual responsible for the release and ongoing maintenance of the evidence report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReport#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getContact();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individiual, organization, or device primarily involved in the creation and maintenance of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getAuthor();

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individiual, organization, or device primarily responsible for internal coherence of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Editor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='editor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getEditor();

	/**
	 * Returns the value of the '<em><b>Reviewer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individiual, organization, or device primarily responsible for review of some aspect of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reviewer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Reviewer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reviewer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getReviewer();

	/**
	 * Returns the value of the '<em><b>Endorser</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individiual, organization, or device responsible for officially endorsing the content for use in some setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorser</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Endorser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endorser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getEndorser();

	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceReportRelatesTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationships that this composition has with other compositions or documents that already exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relates To</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_RelatesTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceReportRelatesTo> getRelatesTo();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceReportSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root of the sections that make up the composition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReport_Section()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceReportSection> getSection();

} // EvidenceReport
