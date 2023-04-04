/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getOccurredPeriod <em>Occurred Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getOccurredDateTime <em>Occurred Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEvent#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent()
 * @model extendedMetaData="name='AuditEvent' kind='elementOnly'"
 * @generated
 */
public interface AuditEvent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classification of the type of event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Category()
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
	 * Describes what happened. The most specific code for the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicator for type of action performed during the event that generated the audit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(AuditEventAction)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventAction getAction();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AuditEventAction value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates and enables segmentation of various severity including debugging from critical.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(AuditEventSeverity)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(AuditEventSeverity value);

	/**
	 * Returns the value of the '<em><b>Occurred Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurred Period</em>' containment reference.
	 * @see #setOccurredPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_OccurredPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurredPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurredPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getOccurredPeriod <em>Occurred Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurred Period</em>' containment reference.
	 * @see #getOccurredPeriod()
	 * @generated
	 */
	void setOccurredPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Occurred Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurred Date Time</em>' containment reference.
	 * @see #setOccurredDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_OccurredDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurredDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurredDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getOccurredDateTime <em>Occurred Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurred Date Time</em>' containment reference.
	 * @see #getOccurredDateTime()
	 * @generated
	 */
	void setOccurredDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the event was recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded</em>' containment reference.
	 * @see #setRecorded(Instant)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Recorded()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='recorded' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getRecorded();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(Instant value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the event succeeded or failed. A free text descripiton can be given in outcome.text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(AuditEventOutcome)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventOutcome getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(AuditEventOutcome value);

	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The authorization (e.g., PurposeOfUse) that was used during the event being recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Authorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAuthorization();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows tracing of authorizatino for the events and tracking whether proposals/recommendations were acted upon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient element is available to enable deterministic tracking of activities that involve the patient as the subject of the data used in an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This will typically be the encounter the event occurred, but some events may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter (e.g. pre-admission lab tests).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AuditEventAgent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An actor taking an active role in the event or activity that is logged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Agent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuditEventAgent> getAgent();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actor that is reporting the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(AuditEventSource)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventSource getSource();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEvent#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AuditEventSource value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AuditEventEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific instances of data or objects that have been accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEvent_Entity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuditEventEntity> getEntity();

} // AuditEvent
