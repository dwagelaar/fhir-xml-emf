/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.  Encounter is primarily used to record information about the actual activities that occurred, where Appointment is used to record planned activities.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Encounter#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getSubjectStatus <em>Subject Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getVirtualService <em>Virtual Service</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getActualPeriod <em>Actual Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getPlannedStartDate <em>Planned Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getPlannedEndDate <em>Planned End Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getDietPreference <em>Diet Preference</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getSpecialArrangement <em>Special Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getSpecialCourtesy <em>Special Courtesy</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getAdmission <em>Admission</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEncounter()
 * @model extendedMetaData="name='Encounter' kind='elementOnly'"
 * @generated
 */
public interface Encounter extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier(s) by which this encounter is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Identifier()
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
	 * The current state of the encounter (not the state of the patient within the encounter - that is subjectState).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EncounterStatus)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EncounterStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EncounterStatus value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home health or others due to local variations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClass_();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the urgency of the encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Broad categorization of the service that is to be provided (e.g. cardiology).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_ServiceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getServiceType();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient or group related to this encounter. In some use-cases the patient MAY not be present, such as a case meeting about a patient between several practitioners or a careteam.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Subject Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subjectStatus value can be used to track the patient's status within the encounter. It details whether the patient has arrived or departed, has been triaged or is currently in a waiting status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Status</em>' containment reference.
	 * @see #setSubjectStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_SubjectStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubjectStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getSubjectStatus <em>Subject Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Status</em>' containment reference.
	 * @see #getSubjectStatus()
	 * @generated
	 */
	void setSubjectStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Episode Of Care</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Episode Of Care</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_EpisodeOfCare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='episodeOfCare' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEpisodeOfCare();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request this encounter satisfies (e.g. incoming referral or procedure request).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The group(s) of individuals, organizations that are allocated to participate in this encounter. The participants backbone will record the actuals of when these individuals participated during the encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_CareTeam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careTeam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getCareTeam();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another Encounter of which this encounter is a part of (administratively or in time).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference.
	 * @see #setPartOf(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPartOf();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getPartOf <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' containment reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Reference value);

	/**
	 * Returns the value of the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that is primarily responsible for this Encounter's services. This MAY be the same as the organization on the Patient record, however it could be different, such as if the actor performing the services was from an external organization (which may be billed seperately) for an external consultation.  Refer to the colonoscopy example on the Encounter examples tab.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Provider</em>' containment reference.
	 * @see #setServiceProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_ServiceProvider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getServiceProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getServiceProvider <em>Service Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider</em>' containment reference.
	 * @see #getServiceProvider()
	 * @generated
	 */
	void setServiceProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EncounterParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of people responsible for providing the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncounterParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The appointment that scheduled this encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Appointment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appointment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAppointment();

	/**
	 * Returns the value of the '<em><b>Virtual Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.VirtualServiceDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connection details of a virtual service (e.g. conference call).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Service</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_VirtualService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='virtualService' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VirtualServiceDetail> getVirtualService();

	/**
	 * Returns the value of the '<em><b>Actual Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual start and end time of the encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Period</em>' containment reference.
	 * @see #setActualPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_ActualPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actualPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getActualPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getActualPeriod <em>Actual Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Period</em>' containment reference.
	 * @see #getActualPeriod()
	 * @generated
	 */
	void setActualPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Planned Start Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The planned start date/time (or admission date) of the encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planned Start Date</em>' containment reference.
	 * @see #setPlannedStartDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_PlannedStartDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plannedStartDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPlannedStartDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getPlannedStartDate <em>Planned Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Start Date</em>' containment reference.
	 * @see #getPlannedStartDate()
	 * @generated
	 */
	void setPlannedStartDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Planned End Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The planned end date/time (or discharge date) of the encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planned End Date</em>' containment reference.
	 * @see #setPlannedEndDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_PlannedEndDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plannedEndDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPlannedEndDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getPlannedEndDate <em>Planned End Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned End Date</em>' containment reference.
	 * @see #getPlannedEndDate()
	 * @generated
	 */
	void setPlannedEndDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual quantity of time the encounter lasted. This excludes the time during leaves of absence.
	 * 
	 * When missing it is the time in between the start and end values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(Duration)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Duration value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EncounterReason}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of medical reasons that are expected to be addressed during the episode of care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncounterReason> getReason();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EncounterDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of diagnosis relevant to this encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Diagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncounterDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of accounts that may be used for billing for this Encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Account()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='account' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAccount();

	/**
	 * Returns the value of the '<em><b>Diet Preference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diet preferences reported by the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diet Preference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_DietPreference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dietPreference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getDietPreference();

	/**
	 * Returns the value of the '<em><b>Special Arrangement</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any special requests that have been made for this encounter, such as the provision of specific equipment or other things.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Arrangement</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_SpecialArrangement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialArrangement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialArrangement();

	/**
	 * Returns the value of the '<em><b>Special Courtesy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Special courtesies that may be provided to the patient during the encounter (VIP, board member, professional courtesy).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Courtesy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_SpecialCourtesy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialCourtesy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialCourtesy();

	/**
	 * Returns the value of the '<em><b>Admission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about the stay during which a healthcare service is provided.
	 * 
	 * This does not describe the event of admitting the patient, but rather any information that is relevant from the time of admittance until the time of discharge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admission</em>' containment reference.
	 * @see #setAdmission(EncounterAdmission)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Admission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='admission' namespace='##targetNamespace'"
	 * @generated
	 */
	EncounterAdmission getAdmission();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getAdmission <em>Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admission</em>' containment reference.
	 * @see #getAdmission()
	 * @generated
	 */
	void setAdmission(EncounterAdmission value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EncounterLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of locations where  the patient has been during this encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncounterLocation> getLocation();

} // Encounter
