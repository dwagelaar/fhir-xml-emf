/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Condition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getOnsetDateTime <em>Onset Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getOnsetAge <em>Onset Age</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getOnsetPeriod <em>Onset Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getOnsetRange <em>Onset Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getOnsetString <em>Onset String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getAbatementDateTime <em>Abatement Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getAbatementAge <em>Abatement Age</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getAbatementPeriod <em>Abatement Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getAbatementRange <em>Abatement Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getAbatementString <em>Abatement String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getStage <em>Stage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Condition#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getCondition()
 * @model extendedMetaData="name='Condition' kind='elementOnly'"
 * @generated
 */
public interface Condition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this condition by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Clinical Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical status of the condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Status</em>' containment reference.
	 * @see #setClinicalStatus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_ClinicalStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='clinicalStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClinicalStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getClinicalStatus <em>Clinical Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Status</em>' containment reference.
	 * @see #getClinicalStatus()
	 * @generated
	 */
	void setClinicalStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Verification Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The verification status to support the clinical status of the condition.  The verification status pertains to the condition, itself, not to any specific condition attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Status</em>' containment reference.
	 * @see #setVerificationStatus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_VerificationStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verificationStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVerificationStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getVerificationStatus <em>Verification Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Status</em>' containment reference.
	 * @see #getVerificationStatus()
	 * @generated
	 */
	void setVerificationStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A category assigned to the condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subjective assessment of the severity of the condition as evaluated by the clinician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the condition, problem or diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The anatomical location where this condition manifests itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getBodySite();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the patient or group who the condition record is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter during which this Condition was created or to which the creation of this record is tightly associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Onset Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Date Time</em>' containment reference.
	 * @see #setOnsetDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_OnsetDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOnsetDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getOnsetDateTime <em>Onset Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Date Time</em>' containment reference.
	 * @see #getOnsetDateTime()
	 * @generated
	 */
	void setOnsetDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Onset Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Age</em>' containment reference.
	 * @see #setOnsetAge(Age)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_OnsetAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getOnsetAge();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getOnsetAge <em>Onset Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Age</em>' containment reference.
	 * @see #getOnsetAge()
	 * @generated
	 */
	void setOnsetAge(Age value);

	/**
	 * Returns the value of the '<em><b>Onset Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Period</em>' containment reference.
	 * @see #setOnsetPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_OnsetPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOnsetPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getOnsetPeriod <em>Onset Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Period</em>' containment reference.
	 * @see #getOnsetPeriod()
	 * @generated
	 */
	void setOnsetPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Onset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Range</em>' containment reference.
	 * @see #setOnsetRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_OnsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOnsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getOnsetRange <em>Onset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Range</em>' containment reference.
	 * @see #getOnsetRange()
	 * @generated
	 */
	void setOnsetRange(Range value);

	/**
	 * Returns the value of the '<em><b>Onset String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset String</em>' containment reference.
	 * @see #setOnsetString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_OnsetString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getOnsetString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getOnsetString <em>Onset String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset String</em>' containment reference.
	 * @see #getOnsetString()
	 * @generated
	 */
	void setOnsetString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Abatement Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement Date Time</em>' containment reference.
	 * @see #setAbatementDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_AbatementDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAbatementDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getAbatementDateTime <em>Abatement Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement Date Time</em>' containment reference.
	 * @see #getAbatementDateTime()
	 * @generated
	 */
	void setAbatementDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Abatement Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement Age</em>' containment reference.
	 * @see #setAbatementAge(Age)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_AbatementAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getAbatementAge();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getAbatementAge <em>Abatement Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement Age</em>' containment reference.
	 * @see #getAbatementAge()
	 * @generated
	 */
	void setAbatementAge(Age value);

	/**
	 * Returns the value of the '<em><b>Abatement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement Period</em>' containment reference.
	 * @see #setAbatementPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_AbatementPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getAbatementPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getAbatementPeriod <em>Abatement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement Period</em>' containment reference.
	 * @see #getAbatementPeriod()
	 * @generated
	 */
	void setAbatementPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Abatement Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement Range</em>' containment reference.
	 * @see #setAbatementRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_AbatementRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAbatementRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getAbatementRange <em>Abatement Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement Range</em>' containment reference.
	 * @see #getAbatementRange()
	 * @generated
	 */
	void setAbatementRange(Range value);

	/**
	 * Returns the value of the '<em><b>Abatement String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement String</em>' containment reference.
	 * @see #setAbatementString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_AbatementString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getAbatementString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getAbatementString <em>Abatement String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement String</em>' containment reference.
	 * @see #getAbatementString()
	 * @generated
	 */
	void setAbatementString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Recorded Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recordedDate represents when this particular Condition record was created in the system, which is often a system-generated date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded Date</em>' containment reference.
	 * @see #setRecordedDate(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_RecordedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recordedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecordedDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Condition#getRecordedDate <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Date</em>' containment reference.
	 * @see #getRecordedDate()
	 * @generated
	 */
	void setRecordedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ConditionParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what participated in the activities related to the condition and how they were involved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ConditionStage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple summary of the stage such as "Stage 3" or "Early Onset". The determination of the stage is disease-specific, such as cancer, retinopathy of prematurity, kidney diseases, Alzheimer's, or Parkinson disease.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Stage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionStage> getStage();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that confirmed or refuted the condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Evidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getEvidence();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCondition_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // Condition
