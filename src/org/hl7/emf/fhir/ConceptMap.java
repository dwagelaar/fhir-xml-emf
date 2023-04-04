/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getAdditionalAttribute <em>Additional Attribute</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getSourceScopeUri <em>Source Scope Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getSourceScopeCanonical <em>Source Scope Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getTargetScopeUri <em>Target Scope Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getTargetScopeCanonical <em>Target Scope Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMap#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap()
 * @model extendedMetaData="name='ConceptMap' kind='elementOnly'"
 * @generated
 */
public interface ConceptMap extends MetadataResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to identify this concept map when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this concept map is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the concept map is stored on different servers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getUrl <em>Url</em>}' containment reference.
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
	 * A formal identifier that is used to identify this concept map when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Identifier()
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
	 * The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the concept map author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getVersion <em>Version</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_VersionAlgorithmString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersionAlgorithmString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getVersionAlgorithmString <em>Version Algorithm String</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_VersionAlgorithmCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getVersionAlgorithmCoding();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}' containment reference.
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
	 * A natural language name identifying the concept map. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getName <em>Name</em>}' containment reference.
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
	 * A short, descriptive, user-friendly title for the concept map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getTitle <em>Title</em>}' containment reference.
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
	 * The status of this concept map. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getStatus <em>Status</em>}' containment reference.
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
	 * A Boolean value to indicate that this concept map is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getExperimental <em>Experimental</em>}' containment reference.
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
	 * The date  (and optionally time) when the concept map was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the concept map changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getDate <em>Date</em>}' containment reference.
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
	 * The name of the organization or individual responsible for the release and ongoing maintenance of the concept map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Contact()
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
	 * A free text natural language description of the concept map from a consumer's perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getDescription <em>Description</em>}' containment reference.
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
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate concept map instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_UseContext()
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
	 * A legal or geographic region in which the concept map is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Jurisdiction()
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
	 * Explanation of why this concept map is needed and why it has been designed as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getPurpose <em>Purpose</em>}' containment reference.
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
	 * A copyright statement relating to the concept map and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the concept map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getCopyright <em>Copyright</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_CopyrightLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyrightLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getCopyrightLabel();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getCopyrightLabel <em>Copyright Label</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_ApprovalDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approvalDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getApprovalDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getApprovalDate <em>Approval Date</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_LastReviewDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastReviewDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastReviewDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getLastReviewDate <em>Last Review Date</em>}' containment reference.
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
	 * The period during which the ConceptMap content was or is planned to be in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getEffectivePeriod <em>Effective Period</em>}' containment reference.
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
	 * Descriptions related to the content of the ConceptMap. Topics provide a high-level categorization as well as keywords for the ConceptMap that can be useful for filtering and searching.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Topic()
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
	 * An individiual or organization primarily involved in the creation and maintenance of the ConceptMap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Author()
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
	 * An individual or organization primarily responsible for internal coherence of the ConceptMap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Editor()
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
	 * An individual or organization asserted by the publisher to be primarily responsible for review of some aspect of the ConceptMap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reviewer</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Reviewer()
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
	 * An individual or organization asserted by the publisher to be responsible for officially endorsing the ConceptMap for use in some setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorser</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Endorser()
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
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_RelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifact();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ConceptMapProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property defines a slot through which additional information can be provided about a map from source -> target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Additional Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ConceptMapAdditionalAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additionalAttribute defines an additional data element found in the source or target data model where the data will come from or be mapped to. Some mappings are based on data in addition to the source data element, where codes in multiple fields are combined to a single field (or vice versa).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Attribute</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_AdditionalAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapAdditionalAttribute> getAdditionalAttribute();

	/**
	 * Returns the value of the '<em><b>Source Scope Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Scope Uri</em>' containment reference.
	 * @see #setSourceScopeUri(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_SourceScopeUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceScopeUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSourceScopeUri();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getSourceScopeUri <em>Source Scope Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Scope Uri</em>' containment reference.
	 * @see #getSourceScopeUri()
	 * @generated
	 */
	void setSourceScopeUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Source Scope Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Scope Canonical</em>' containment reference.
	 * @see #setSourceScopeCanonical(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_SourceScopeCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceScopeCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getSourceScopeCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getSourceScopeCanonical <em>Source Scope Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Scope Canonical</em>' containment reference.
	 * @see #getSourceScopeCanonical()
	 * @generated
	 */
	void setSourceScopeCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Target Scope Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Scope Uri</em>' containment reference.
	 * @see #setTargetScopeUri(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_TargetScopeUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetScopeUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getTargetScopeUri();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getTargetScopeUri <em>Target Scope Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Scope Uri</em>' containment reference.
	 * @see #getTargetScopeUri()
	 * @generated
	 */
	void setTargetScopeUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Target Scope Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Scope Canonical</em>' containment reference.
	 * @see #setTargetScopeCanonical(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_TargetScopeCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetScopeCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getTargetScopeCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMap#getTargetScopeCanonical <em>Target Scope Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Scope Canonical</em>' containment reference.
	 * @see #getTargetScopeCanonical()
	 * @generated
	 */
	void setTargetScopeCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ConceptMapGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group of mappings that all have the same source and target system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMap_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapGroup> getGroup();

} // ConceptMap
