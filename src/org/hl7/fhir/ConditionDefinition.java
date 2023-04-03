/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of a condition and information relevant to managing it.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getStage <em>Stage</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getHasSeverity <em>Has Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getHasBodySite <em>Has Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getHasStage <em>Has Stage</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getTeam <em>Team</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionDefinition#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConditionDefinition()
 * @model extendedMetaData="name='ConditionDefinition' kind='elementOnly'"
 * @generated
 */
public interface ConditionDefinition extends MetadataResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to identify this condition definition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this condition definition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the condition definition is stored on different servers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getUrl <em>Url</em>}' containment reference.
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
	 * A formal identifier that is used to identify this condition definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Identifier()
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
	 * The identifier that is used to identify this version of the condition definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the condition definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getVersion <em>Version</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_VersionAlgorithmString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersionAlgorithmString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getVersionAlgorithmString <em>Version Algorithm String</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_VersionAlgorithmCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionAlgorithmCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getVersionAlgorithmCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}' containment reference.
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
	 * A natural language name identifying the condition definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getName <em>Name</em>}' containment reference.
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
	 * A short, descriptive, user-friendly title for the condition definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanatory or alternate title for the event definition giving additional information about its content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Subtitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubtitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this condition definition. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getStatus <em>Status</em>}' containment reference.
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
	 * A Boolean value to indicate that this condition definition is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getExperimental <em>Experimental</em>}' containment reference.
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
	 * The date  (and optionally time) when the condition definition was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the condition definition changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getDate <em>Date</em>}' containment reference.
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
	 * The name of the organization or individual responsible for the release and ongoing maintenance of the condition definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Contact()
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
	 * A free text natural language description of the condition definition from a consumer's perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate condition definition instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getUseContext();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A legal or geographic region in which the condition definition is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdiction();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the condition, problem or diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subjective assessment of the severity of the condition as evaluated by the clinician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The anatomical location where this condition manifests itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical stage or grade of a condition. May include formal severity assessments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference.
	 * @see #setStage(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Stage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stage' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getStage <em>Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' containment reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Has Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether Severity is appropriate to collect for this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Severity</em>' containment reference.
	 * @see #setHasSeverity(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_HasSeverity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasSeverity' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getHasSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getHasSeverity <em>Has Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Severity</em>' containment reference.
	 * @see #getHasSeverity()
	 * @generated
	 */
	void setHasSeverity(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether bodySite is appropriate to collect for this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Body Site</em>' containment reference.
	 * @see #setHasBodySite(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_HasBodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasBodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getHasBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getHasBodySite <em>Has Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Body Site</em>' containment reference.
	 * @see #getHasBodySite()
	 * @generated
	 */
	void setHasBodySite(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Stage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether stage is appropriate to collect for this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Stage</em>' containment reference.
	 * @see #setHasStage(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_HasStage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasStage' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getHasStage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionDefinition#getHasStage <em>Has Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Stage</em>' containment reference.
	 * @see #getHasStage()
	 * @generated
	 */
	void setHasStage(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal definitions of the condition. These may be references to ontologies, published clinical protocols or research papers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getDefinition();

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConditionDefinitionObservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observations particularly relevant to this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Observation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionDefinitionObservation> getObservation();

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConditionDefinitionMedication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medications particularly relevant for this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Medication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionDefinitionMedication> getMedication();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConditionDefinitionPrecondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An observation that suggests that this condition applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Precondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionDefinitionPrecondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Team</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appropriate team for this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Team</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Team()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='team' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getTeam();

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConditionDefinitionQuestionnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Questionnaire for this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Questionnaire()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='questionnaire' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionDefinitionQuestionnaire> getQuestionnaire();

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConditionDefinitionPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan that is appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionDefinition_Plan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionDefinitionPlan> getPlan();

} // ConditionDefinition
