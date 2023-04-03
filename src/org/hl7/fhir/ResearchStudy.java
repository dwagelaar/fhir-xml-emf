/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A scientific study of nature that sometimes includes processes involved in health and disease. For example, clinical trials are research studies that involve people. These studies may be related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes and certain groups of people by looking at data collected in the past or future.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getPrimaryPurposeType <em>Primary Purpose Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getStudyDesign <em>Study Design</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getRegion <em>Region</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getDescriptionSummary <em>Description Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getAssociatedParty <em>Associated Party</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getProgressStatus <em>Progress Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getWhyStopped <em>Why Stopped</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getRecruitment <em>Recruitment</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getComparisonGroup <em>Comparison Group</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getOutcomeMeasure <em>Outcome Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getResearchStudy()
 * @model extendedMetaData="name='ResearchStudy' kind='elementOnly'"
 * @generated
 */
public interface ResearchStudy extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Canonical identifier for this study resource, represented as a globally unique URI.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getUrl <em>Url</em>}' containment reference.
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
	 * Identifiers assigned to this research study by the sponsor or other systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Identifier()
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
	 * The business version for the study record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name for this study (computer friendly).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getName <em>Name</em>}' containment reference.
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
	 * The human readable name of the research study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ResearchStudyLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional names for the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResearchStudyLabel> getLabel();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of steps expected to be performed as part of the execution of the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProtocol();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger research study of which this particular study is a component or step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Related Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citations, references, URLs and other related documents.  When using relatedArtifact to share URLs, the relatedArtifact.type will often be set to one of "documentation" or "supported-with" and the URL value will often be in relatedArtifact.document.url but another possible location is relatedArtifact.resource when it is a canonical URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Artifact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_RelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifact();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The publication state of the resource (not of the study).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Primary Purpose Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of study based upon the intent of the study activities. A classification of the intent of the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Purpose Type</em>' containment reference.
	 * @see #setPrimaryPurposeType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_PrimaryPurposeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='primaryPurposeType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPrimaryPurposeType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getPrimaryPurposeType <em>Primary Purpose Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Purpose Type</em>' containment reference.
	 * @see #getPrimaryPurposeType()
	 * @generated
	 */
	void setPrimaryPurposeType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference.
	 * @see #setPhase(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Phase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phase' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPhase();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getPhase <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' containment reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Study Design</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Design</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_StudyDesign()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyDesign' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getStudyDesign();

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getFocus();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition that is the focus of the study.  For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion "healthy volunteer", but the target condition code would be a Lupus SNOMED code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCondition();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key terms to aid in searching for or filtering the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Keyword()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getKeyword();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A country, state or other area where the study is taking place rather than its precise geographic location or address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Region()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='region' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRegion();

	/**
	 * Returns the value of the '<em><b>Description Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief text for explaining the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Summary</em>' containment reference.
	 * @see #setDescriptionSummary(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_DescriptionSummary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descriptionSummary' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescriptionSummary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getDescriptionSummary <em>Description Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Summary</em>' containment reference.
	 * @see #getDescriptionSummary()
	 * @generated
	 */
	void setDescriptionSummary(Markdown value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A detailed and human-readable narrative of the study. E.g., study abstract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the start date and the expected (or actual, depending on status) end date for the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A facility in which study activities are conducted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSite();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made about the study by the performer, subject or other participants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional grouping mechanism or categorization of a research study. Example: FDA regulated device, FDA regulated drug, MPG Paragraph 23b (a German legal requirement), IRB-exempt, etc. Implementation Note: do not use the classifier element to support existing semantics that are already supported thru explicit elements in the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Classifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassifier();

	/**
	 * Returns the value of the '<em><b>Associated Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ResearchStudyAssociatedParty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sponsors, collaborators, and other parties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Party</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_AssociatedParty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associatedParty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResearchStudyAssociatedParty> getAssociatedParty();

	/**
	 * Returns the value of the '<em><b>Progress Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ResearchStudyProgressStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of study with time for that status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Status</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_ProgressStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='progressStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResearchStudyProgressStatus> getProgressStatus();

	/**
	 * Returns the value of the '<em><b>Why Stopped</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description and/or code explaining the premature termination of the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Why Stopped</em>' containment reference.
	 * @see #setWhyStopped(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_WhyStopped()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whyStopped' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getWhyStopped();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getWhyStopped <em>Why Stopped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Why Stopped</em>' containment reference.
	 * @see #getWhyStopped()
	 * @generated
	 */
	void setWhyStopped(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Recruitment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target or actual group of participants enrolled in study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recruitment</em>' containment reference.
	 * @see #setRecruitment(ResearchStudyRecruitment)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Recruitment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recruitment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchStudyRecruitment getRecruitment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getRecruitment <em>Recruitment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recruitment</em>' containment reference.
	 * @see #getRecruitment()
	 * @generated
	 */
	void setRecruitment(ResearchStudyRecruitment value);

	/**
	 * Returns the value of the '<em><b>Comparison Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ResearchStudyComparisonGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes an expected event or sequence of events for one of the subjects of a study. E.g. for a living subject: exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up. E.g. for a stability study: {store sample from lot A at 25 degrees for 1 month}, {store sample from lot A at 40 degrees for 1 month}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparison Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_ComparisonGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comparisonGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResearchStudyComparisonGroup> getComparisonGroup();

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ResearchStudyObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Objective()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='objective' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResearchStudyObjective> getObjective();

	/**
	 * Returns the value of the '<em><b>Outcome Measure</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ResearchStudyOutcomeMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An "outcome measure", "endpoint", "effect measure" or "measure of effect" is a specific measurement or observation used to quantify the effect of experimental variables on the participants in a study, or for observational studies, to describe patterns of diseases or traits or associations with exposures, risk factors or treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome Measure</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_OutcomeMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcomeMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResearchStudyOutcomeMeasure> getOutcomeMeasure();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to one or more sets of results generated by the study.  Could also link to a research registry holding the results such as ClinicalTrials.gov.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Result()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getResult();

} // ResearchStudy
