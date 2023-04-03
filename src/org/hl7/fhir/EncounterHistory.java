/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of significant events/milestones key data throughout the history of an Encounter, often tracked for specific purposes such as billing.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getSubjectStatus <em>Subject Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getActualPeriod <em>Actual Period</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getPlannedStartDate <em>Planned Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getPlannedEndDate <em>Planned End Date</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistory#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEncounterHistory()
 * @model extendedMetaData="name='EncounterHistory' kind='elementOnly'"
 * @generated
 */
public interface EncounterHistory extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter associated with this set of historic values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistory#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier(s) by which this encounter is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_Identifier()
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
	 * planned | in-progress | on-hold | discharged | completed | cancelled | discontinued | entered-in-error | unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EncounterStatus)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EncounterStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistory#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EncounterStatus value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home health or others due to local variations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_Class()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClass_();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistory#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_Type()
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
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_ServiceType()
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
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistory#getSubject <em>Subject</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_SubjectStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubjectStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistory#getSubjectStatus <em>Subject Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Status</em>' containment reference.
	 * @see #getSubjectStatus()
	 * @generated
	 */
	void setSubjectStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Actual Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and end time associated with this set of values associated with the encounter, may be different to the planned times for various reasons.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Period</em>' containment reference.
	 * @see #setActualPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_ActualPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actualPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getActualPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistory#getActualPeriod <em>Actual Period</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_PlannedStartDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plannedStartDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPlannedStartDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistory#getPlannedStartDate <em>Planned Start Date</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_PlannedEndDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plannedEndDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPlannedEndDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistory#getPlannedEndDate <em>Planned End Date</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistory#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Duration value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EncounterHistoryLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location of the patient at this point in the encounter, the multiple cardinality permits de-normalizing the levels of the location hierarchy, such as site/ward/room/bed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistory_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncounterHistoryLocation> getLocation();

} // EncounterHistory
