/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A plan for executing testing on an artifact or specifications.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getTestTools <em>Test Tools</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getExitCriteria <em>Exit Criteria</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlan#getTestCase <em>Test Case</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan()
 * @model extendedMetaData="name='TestPlan' kind='elementOnly'"
 * @generated
 */
public interface TestPlan extends CanonicalResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to identify this test plan when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this test plan is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the test plan is stored on different servers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getUrl <em>Url</em>}' containment reference.
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
	 * A formal identifier that is used to identify this test plan when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Identifier()
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
	 * The identifier that is used to identify this version of the test plan when it is referenced in a specification, model, design or instance.  This is an arbitrary value managed by the test plan author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getVersion <em>Version</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_VersionAlgorithmString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersionAlgorithmString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getVersionAlgorithmString <em>Version Algorithm String</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_VersionAlgorithmCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getVersionAlgorithmCoding();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}' containment reference.
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
	 * A natural language name identifying the test plan. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getName <em>Name</em>}' containment reference.
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
	 * A short, descriptive, user-friendly title for the test plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getTitle <em>Title</em>}' containment reference.
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
	 * The status of this test plan. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getStatus <em>Status</em>}' containment reference.
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
	 * A Boolean value to indicate that this test plan is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getExperimental <em>Experimental</em>}' containment reference.
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
	 * The date (and optionally time) when the test plan was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the test plan changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getDate <em>Date</em>}' containment reference.
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
	 * The name of the organization or individual responsible for the release and ongoing maintenance of the test plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Contact()
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
	 * A free text natural language description of the test plan from a consumer's perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getDescription <em>Description</em>}' containment reference.
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
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate test plan instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_UseContext()
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
	 * A legal or geographic region in which the test plan is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Jurisdiction()
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
	 * Explanation of why this test plan is needed and why it has been designed as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getPurpose <em>Purpose</em>}' containment reference.
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
	 * A copyright statement relating to the test plan and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the test plan. The short copyright declaration (e.g. (c) '2015+ xyz organization' should be sent in the copyrightLabel element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getCopyright <em>Copyright</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_CopyrightLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyrightLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getCopyrightLabel();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getCopyrightLabel <em>Copyright Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Label</em>' containment reference.
	 * @see #getCopyrightLabel()
	 * @generated
	 */
	void setCopyrightLabel(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category of the Test Plan - can be acceptance, unit, performance, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What is being tested with this Test Plan - a conformance resource, or narrative criteria, or an external reference...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Scope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getScope();

	/**
	 * Returns the value of the '<em><b>Test Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of test tools to be used in the test plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Tools</em>' containment reference.
	 * @see #setTestTools(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_TestTools()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testTools' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getTestTools();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getTestTools <em>Test Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Tools</em>' containment reference.
	 * @see #getTestTools()
	 * @generated
	 */
	void setTestTools(Markdown value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.TestPlanDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required criteria to execute the test plan - e.g. preconditions, previous tests...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_Dependency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestPlanDependency> getDependency();

	/**
	 * Returns the value of the '<em><b>Exit Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The threshold or criteria for the test plan to be considered successfully executed - narrative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Criteria</em>' containment reference.
	 * @see #setExitCriteria(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_ExitCriteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exitCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getExitCriteria();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlan#getExitCriteria <em>Exit Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Criteria</em>' containment reference.
	 * @see #getExitCriteria()
	 * @generated
	 */
	void setExitCriteria(Markdown value);

	/**
	 * Returns the value of the '<em><b>Test Case</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.TestPlanTestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual test cases that are part of this plan, when they they are made explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Case</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlan_TestCase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestPlanTestCase> getTestCase();

} // TestPlan
