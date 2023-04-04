/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getHierarchyMeaning <em>Hierarchy Meaning</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getVersionNeeded <em>Version Needed</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getSupplements <em>Supplements</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CodeSystem#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem()
 * @model extendedMetaData="name='CodeSystem' kind='elementOnly'"
 * @generated
 */
public interface CodeSystem extends MetadataResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to identify this code system when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this code system is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the code system is stored on different servers. This is used in [Coding](datatypes.html#Coding).system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Identifier()
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
	 * The identifier that is used to identify this version of the code system when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the code system author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. This is used in [Coding](datatypes.html#Coding).version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version Algorithm String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Algorithm String</em>' containment reference.
	 * @see #setVersionAlgorithmString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_VersionAlgorithmString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersionAlgorithmString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getVersionAlgorithmString <em>Version Algorithm String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Algorithm String</em>' containment reference.
	 * @see #getVersionAlgorithmString()
	 * @generated
	 */
	void setVersionAlgorithmString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version Algorithm Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Algorithm Coding</em>' containment reference.
	 * @see #setVersionAlgorithmCoding(Coding)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_VersionAlgorithmCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getVersionAlgorithmCoding();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}' containment reference.
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
	 * A natural language name identifying the code system. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, descriptive, user-friendly title for the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this code system. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getStatus <em>Status</em>}' containment reference.
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
	 * A Boolean value to indicate that this code system is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date  (and optionally time) when the code system was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the code system changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization or individual responsible for the release and ongoing maintenance of the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getContact();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the code system from a consumer's perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate code system instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getUseContext();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A legal or geographic region in which the code system is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdiction();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explanation of why this code system is needed and why it has been designed as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getPurpose <em>Purpose</em>}' containment reference.
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
	 * A copyright statement relating to the code system and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getCopyright <em>Copyright</em>}' containment reference.
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
	 * @see #setCopyrightLabel(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_CopyrightLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyrightLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getCopyrightLabel();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getCopyrightLabel <em>Copyright Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Label</em>' containment reference.
	 * @see #getCopyrightLabel()
	 * @generated
	 */
	void setCopyrightLabel(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Date</em>' containment reference.
	 * @see #setApprovalDate(Date)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_ApprovalDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approvalDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getApprovalDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getApprovalDate <em>Approval Date</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_LastReviewDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastReviewDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastReviewDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getLastReviewDate <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Review Date</em>' containment reference.
	 * @see #getLastReviewDate()
	 * @generated
	 */
	void setLastReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period during which the CodeSystem content was or is planned to be in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptions related to the content of the CodeSystem. Topics provide a high-level categorization as well as keywords for the CodeSystem that can be useful for filtering and searching.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Topic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getTopic();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individiual or organization primarily involved in the creation and maintenance of the CodeSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getAuthor();

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual or organization primarily responsible for internal coherence of the CodeSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Editor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='editor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getEditor();

	/**
	 * Returns the value of the '<em><b>Reviewer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual or organization asserted by the publisher to be primarily responsible for review of some aspect of the CodeSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reviewer</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Reviewer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reviewer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getReviewer();

	/**
	 * Returns the value of the '<em><b>Endorser</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual or organization asserted by the publisher to be responsible for officially endorsing the CodeSystem for use in some setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorser</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Endorser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endorser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getEndorser();

	/**
	 * Returns the value of the '<em><b>Related Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related artifacts such as additional documentation, justification, dependencies, bibliographic references, and predecessor and successor artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Artifact</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_RelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifact();

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If code comparison is case sensitive when codes within this system are compared to each other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' containment reference.
	 * @see #setCaseSensitive(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_CaseSensitive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caseSensitive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getCaseSensitive();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getCaseSensitive <em>Case Sensitive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' containment reference.
	 * @see #getCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Canonical reference to the value set that contains all codes in the code system independent of code status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(Canonical value);

	/**
	 * Returns the value of the '<em><b>Hierarchy Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The meaning of the hierarchy of concepts as represented in this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hierarchy Meaning</em>' containment reference.
	 * @see #setHierarchyMeaning(CodeSystemHierarchyMeaning)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_HierarchyMeaning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hierarchyMeaning' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemHierarchyMeaning getHierarchyMeaning();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getHierarchyMeaning <em>Hierarchy Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy Meaning</em>' containment reference.
	 * @see #getHierarchyMeaning()
	 * @generated
	 */
	void setHierarchyMeaning(CodeSystemHierarchyMeaning value);

	/**
	 * Returns the value of the '<em><b>Compositional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code system defines a compositional (post-coordination) grammar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compositional</em>' containment reference.
	 * @see #setCompositional(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Compositional()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compositional' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getCompositional();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getCompositional <em>Compositional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositional</em>' containment reference.
	 * @see #getCompositional()
	 * @generated
	 */
	void setCompositional(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Version Needed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This flag is used to signify that the code system does not commit to concept permanence across versions. If true, a version must be specified when referencing this code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Needed</em>' containment reference.
	 * @see #setVersionNeeded(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_VersionNeeded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionNeeded' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getVersionNeeded();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getVersionNeeded <em>Version Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Needed</em>' containment reference.
	 * @see #getVersionNeeded()
	 * @generated
	 */
	void setVersionNeeded(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(CodeSystemContentMode)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemContentMode getContent();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(CodeSystemContentMode value);

	/**
	 * Returns the value of the '<em><b>Supplements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The canonical URL of the code system that this code system supplement is adding designations and properties to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplements</em>' containment reference.
	 * @see #setSupplements(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Supplements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplements' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getSupplements();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getSupplements <em>Supplements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplements</em>' containment reference.
	 * @see #getSupplements()
	 * @generated
	 */
	void setSupplements(Canonical value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of concepts defined by the code system. Where the code system has a compositional grammar, the basis of this count is defined by the system steward.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(UnsignedInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getCount();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CodeSystem#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeSystemFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A filter that can be used in a value set compose statement when selecting concepts using a filter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemFilter> getFilter();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeSystemProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property defines an additional slot through which additional information can be provided about a concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeSystemConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meanings of the hierarchical relationships are.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCodeSystem_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemConcept> getConcept();

} // CodeSystem
