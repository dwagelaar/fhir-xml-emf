/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research participant. The unintended effects may require additional monitoring, treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to potential or avoided events that could have had such effects. There are two major domains where the AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and the other is in reporting adverse events in clinical  research trial management. Adverse events can be reported by healthcare providers, patients, caregivers or by medical products manufacturers. Given the differences between these two concepts, we recommend consulting the domain specific implementation guides when implementing the AdverseEvent Resource. The implementation guides include specific extensions, value sets and constraints.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getActuality <em>Actuality</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getDetected <em>Detected</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getResultingEffect <em>Resulting Effect</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getSeriousness <em>Seriousness</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getStudy <em>Study</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getExpectedInResearchStudy <em>Expected In Research Study</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getSuspectEntity <em>Suspect Entity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getContributingFactor <em>Contributing Factor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getPreventiveAction <em>Preventive Action</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getMitigatingAction <em>Mitigating Action</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEvent#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent()
 * @model extendedMetaData="name='AdverseEvent' kind='elementOnly'"
 * @generated
 */
public interface AdverseEvent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this adverse event by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the adverse event or potential adverse event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(AdverseEventStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	AdverseEventStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AdverseEventStatus value);

	/**
	 * Returns the value of the '<em><b>Actuality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the event actually happened or was a near miss. Note that this is independent of whether anyone was affected or harmed or how severely.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuality</em>' containment reference.
	 * @see #setActuality(AdverseEventActuality)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Actuality()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actuality' namespace='##targetNamespace'"
	 * @generated
	 */
	AdverseEventActuality getActuality();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getActuality <em>Actuality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuality</em>' containment reference.
	 * @see #getActuality()
	 * @generated
	 */
	void setActuality(AdverseEventActuality value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overall type of event, intended for search and filtering purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific event that occurred or that was averted, such as patient fall, wrong organ removed, or wrong blood transfused.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This subject or group impacted by the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getSubject <em>Subject</em>}' containment reference.
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
	 * The Encounter associated with the start of the AdverseEvent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Occurrence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #setOccurrenceDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #getOccurrenceDateTime()
	 * @generated
	 */
	void setOccurrenceDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Occurrence Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #setOccurrencePeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_OccurrencePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrencePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurrencePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getOccurrencePeriod <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #getOccurrencePeriod()
	 * @generated
	 */
	void setOccurrencePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Occurrence Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #setOccurrenceTiming(Timing)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_OccurrenceTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getOccurrenceTiming();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getOccurrenceTiming <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #getOccurrenceTiming()
	 * @generated
	 */
	void setOccurrenceTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Detected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date the AdverseEvent began, in the opinion of the reporter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detected</em>' containment reference.
	 * @see #setDetected(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Detected()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detected' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDetected();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getDetected <em>Detected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detected</em>' containment reference.
	 * @see #getDetected()
	 * @generated
	 */
	void setDetected(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorded Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the existence of the AdverseEvent was first recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded Date</em>' containment reference.
	 * @see #setRecordedDate(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_RecordedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recordedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecordedDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getRecordedDate <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Date</em>' containment reference.
	 * @see #getRecordedDate()
	 * @generated
	 */
	void setRecordedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Resulting Effect</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the condition that occurred as a result of the adverse event, such as hives due to the exposure to a substance (for example, a drug or a chemical) or a broken leg as a result of the fall.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resulting Effect</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_ResultingEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resultingEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getResultingEffect();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The information about where the adverse event occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Seriousness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment whether this event, or averted event, was of clinical importance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seriousness</em>' containment reference.
	 * @see #setSeriousness(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Seriousness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriousness' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSeriousness();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getSeriousness <em>Seriousness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seriousness</em>' containment reference.
	 * @see #getSeriousness()
	 * @generated
	 */
	void setSeriousness(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the type of outcome from the adverse event, such as resolved, recovering, ongoing, resolved-with-sequelae, or fatal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getOutcome();

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on who recorded the adverse event.  May be the patient or a practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Recorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AdverseEventParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what participated in the adverse event and how they were involved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdverseEventParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The research study that the subject is enrolled in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Study()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='study' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getStudy();

	/**
	 * Returns the value of the '<em><b>Expected In Research Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Considered likely or probable or anticipated in the research study.  Whether the reported event matches any of the outcomes for the patient that are considered by the study as known or likely.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected In Research Study</em>' containment reference.
	 * @see #setExpectedInResearchStudy(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_ExpectedInResearchStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expectedInResearchStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getExpectedInResearchStudy();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEvent#getExpectedInResearchStudy <em>Expected In Research Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected In Research Study</em>' containment reference.
	 * @see #getExpectedInResearchStudy()
	 * @generated
	 */
	void setExpectedInResearchStudy(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Suspect Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AdverseEventSuspectEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the entity that is suspected to have caused the adverse event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suspect Entity</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_SuspectEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='suspectEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdverseEventSuspectEntity> getSuspectEntity();

	/**
	 * Returns the value of the '<em><b>Contributing Factor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AdverseEventContributingFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contributing factors suspected to have increased the probability or severity of the adverse event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributing Factor</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_ContributingFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributingFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdverseEventContributingFactor> getContributingFactor();

	/**
	 * Returns the value of the '<em><b>Preventive Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AdverseEventPreventiveAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preventive actions that contributed to avoiding the adverse event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preventive Action</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_PreventiveAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preventiveAction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdverseEventPreventiveAction> getPreventiveAction();

	/**
	 * Returns the value of the '<em><b>Mitigating Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AdverseEventMitigatingAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ameliorating action taken after the adverse event occured in order to reduce the extent of harm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigating Action</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_MitigatingAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mitigatingAction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdverseEventMitigatingAction> getMitigatingAction();

	/**
	 * Returns the value of the '<em><b>Supporting Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AdverseEventSupportingInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting information relevant to the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Info</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_SupportingInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdverseEventSupportingInfo> getSupportingInfo();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made about the adverse event by the performer, subject or other participants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEvent_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // AdverseEvent
