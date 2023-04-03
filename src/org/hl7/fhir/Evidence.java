/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Evidence#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getCiteAsReference <em>Cite As Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getCiteAsMarkdown <em>Cite As Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getVariableDefinition <em>Variable Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getSynthesisType <em>Synthesis Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getStudyDesign <em>Study Design</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getCertainty <em>Certainty</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidence()
 * @model extendedMetaData="name='Evidence' kind='elementOnly'"
 * @generated
 */
public interface Evidence extends MetadataResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to identify this evidence when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the summary is stored on different servers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify this summary when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Identifier()
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
	 * The identifier that is used to identify this version of the summary when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the summary author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version Algorithm String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Algorithm String</em>' containment reference.
	 * @see #setVersionAlgorithmString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_VersionAlgorithmString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersionAlgorithmString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getVersionAlgorithmString <em>Version Algorithm String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Algorithm String</em>' containment reference.
	 * @see #getVersionAlgorithmString()
	 * @generated
	 */
	void setVersionAlgorithmString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version Algorithm Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Algorithm Coding</em>' containment reference.
	 * @see #setVersionAlgorithmCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_VersionAlgorithmCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getVersionAlgorithmCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Algorithm Coding</em>' containment reference.
	 * @see #getVersionAlgorithmCoding()
	 * @generated
	 */
	void setVersionAlgorithmCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A natural language name identifying the evidence. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, descriptive, user-friendly title for the summary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Cite As Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite As Reference</em>' containment reference.
	 * @see #setCiteAsReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_CiteAsReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citeAsReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCiteAsReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getCiteAsReference <em>Cite As Reference</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getEvidence_CiteAsMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citeAsMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCiteAsMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getCiteAsMarkdown <em>Cite As Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite As Markdown</em>' containment reference.
	 * @see #getCiteAsMarkdown()
	 * @generated
	 */
	void setCiteAsMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this summary. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean value to indicate that this resource is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date  (and optionally time) when the summary was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the summary changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Date</em>' containment reference.
	 * @see #setApprovalDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_ApprovalDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approvalDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getApprovalDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getApprovalDate <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Date</em>' containment reference.
	 * @see #getApprovalDate()
	 * @generated
	 */
	void setApprovalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Review Date</em>' containment reference.
	 * @see #setLastReviewDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_LastReviewDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastReviewDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastReviewDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getLastReviewDate <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Review Date</em>' containment reference.
	 * @see #getLastReviewDate()
	 * @generated
	 */
	void setLastReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization or individual responsible for the release and ongoing maintenance of the evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Contact()
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
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Author()
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
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Editor()
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
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Reviewer()
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
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Endorser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endorser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getEndorser();

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getUseContext();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explanation of why this Evidence is needed and why it has been designed as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(Markdown value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright statement relating to the Evidence and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the Evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

	/**
	 * Returns the value of the '<em><b>Copyright Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short string (<50 characters), suitable for inclusion in a page footer that identifies the copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All rights reserved', 'Some rights reserved').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright Label</em>' containment reference.
	 * @see #setCopyrightLabel(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_CopyrightLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyrightLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCopyrightLabel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getCopyrightLabel <em>Copyright Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Label</em>' containment reference.
	 * @see #getCopyrightLabel()
	 * @generated
	 */
	void setCopyrightLabel(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Related Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link or citation to artifact associated with the summary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Artifact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_RelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifact();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the evidence from a consumer's perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Declarative description of the Evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference.
	 * @see #setAssertion(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Assertion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assertion' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getAssertion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getAssertion <em>Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' containment reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(Markdown value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Footnotes and/or explanatory notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Variable Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceVariableDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence variable such as population, exposure, or outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Definition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_VariableDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variableDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceVariableDefinition> getVariableDefinition();

	/**
	 * Returns the value of the '<em><b>Synthesis Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method to combine studies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synthesis Type</em>' containment reference.
	 * @see #setSynthesisType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_SynthesisType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synthesisType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSynthesisType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getSynthesisType <em>Synthesis Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthesis Type</em>' containment reference.
	 * @see #getSynthesisType()
	 * @generated
	 */
	void setSynthesisType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Study Design</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The design of the study that produced this evidence. The design is described with any number of study design characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Design</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_StudyDesign()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyDesign' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getStudyDesign();

	/**
	 * Returns the value of the '<em><b>Statistic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceStatistic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Values and parameters for a single statistic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statistic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Statistic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statistic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceStatistic> getStatistic();

	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceCertainty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment of certainty, confidence in the estimates, or quality of the evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certainty</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Certainty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certainty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceCertainty> getCertainty();

} // Evidence
