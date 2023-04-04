/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a stream of resource state changes or events and annotated with labels useful to filter projections from this topic.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getResourceTrigger <em>Resource Trigger</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getEventTrigger <em>Event Trigger</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getCanFilterBy <em>Can Filter By</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopic#getNotificationShape <em>Notification Shape</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic()
 * @model extendedMetaData="name='SubscriptionTopic' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionTopic extends CanonicalResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to identify this subscription topic when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this subscription topic is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the subscription topic is stored on different servers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getUrl <em>Url</em>}' containment reference.
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
	 * Business identifiers assigned to this subscription topic by the performer and/or other systems.  These identifiers remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Identifier()
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
	 * The identifier that is used to identify this version of the subscription topic when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Topic author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions are orderable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getVersion <em>Version</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_VersionAlgorithmString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersionAlgorithmString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getVersionAlgorithmString <em>Version Algorithm String</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_VersionAlgorithmCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getVersionAlgorithmCoding();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}' containment reference.
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
	 * A natural language name identifying the subscription topic This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getName <em>Name</em>}' containment reference.
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
	 * A short, descriptive, user-friendly title for the subscription topic.  For example, "admission".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The canonical URL pointing to another FHIR-defined SubscriptionTopic that is adhered to in whole or in part by this SubscriptionTopic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the SubscriptionTopic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getStatus <em>Status</em>}' containment reference.
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
	 * A flag to indicate that this TopSubscriptionTopicic is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getExperimental <em>Experimental</em>}' containment reference.
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
	 * The date (and optionally time) when the subscription topic was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the subscription topic changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getDate <em>Date</em>}' containment reference.
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
	 * Helps establish the "authority/credibility" of the SubscriptionTopic.  May also allow for contact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Contact()
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
	 * A free text natural language description of the Topic from the consumer's perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getDescription <em>Description</em>}' containment reference.
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
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of code system definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_UseContext()
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
	 * A jurisdiction in which the Topic is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Jurisdiction()
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
	 * Explains why this Topic is needed and why it has been designed as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getPurpose <em>Purpose</em>}' containment reference.
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
	 * A copyright statement relating to the SubscriptionTopic and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the SubscriptionTopic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getCopyright <em>Copyright</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_CopyrightLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyrightLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getCopyrightLabel();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getCopyrightLabel <em>Copyright Label</em>}' containment reference.
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
	 * The date on which the asset content was approved by the publisher. Approval happens once when the content is officially approved for usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Date</em>' containment reference.
	 * @see #setApprovalDate(Date)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_ApprovalDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approvalDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getApprovalDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getApprovalDate <em>Approval Date</em>}' containment reference.
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
	 * The date on which the asset content was last reviewed. Review happens periodically after that, but doesn't change the original approval date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Review Date</em>' containment reference.
	 * @see #setLastReviewDate(Date)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_LastReviewDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastReviewDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastReviewDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getLastReviewDate <em>Last Review Date</em>}' containment reference.
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
	 * The period during which the SubscriptionTopic content was or is planned to be effective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopic#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Resource Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of a resource-based event that triggers a notification based on the SubscriptionTopic. The criteria may be just a human readable description and/or a full FHIR search string or FHIRPath expression. Multiple triggers are considered OR joined (e.g., a resource update matching ANY of the definitions will trigger a notification).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Trigger</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_ResourceTrigger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceTrigger' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscriptionTopicResourceTrigger> getResourceTrigger();

	/**
	 * Returns the value of the '<em><b>Event Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubscriptionTopicEventTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Event definition which can be used to trigger the SubscriptionTopic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Trigger</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_EventTrigger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventTrigger' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscriptionTopicEventTrigger> getEventTrigger();

	/**
	 * Returns the value of the '<em><b>Can Filter By</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubscriptionTopicCanFilterBy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of properties by which Subscriptions on the SubscriptionTopic can be filtered. May be defined Search Parameters (e.g., Encounter.patient) or parameters defined within this SubscriptionTopic context (e.g., hub.event).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Filter By</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_CanFilterBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='canFilterBy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscriptionTopicCanFilterBy> getCanFilterBy();

	/**
	 * Returns the value of the '<em><b>Notification Shape</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubscriptionTopicNotificationShape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of properties to describe the shape (e.g., resources) included in notifications from this Subscription Topic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notification Shape</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopic_NotificationShape()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notificationShape' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscriptionTopicNotificationShape> getNotificationShape();

} // SubscriptionTopic
