/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action that is or was performed on or for a patient, practitioner, device, organization, or location. For example, this can be a physical intervention on a patient like an operation, or less invasive like long term services, counseling, or hypnotherapy.  This can be a quality or safety inspection for a location, organization, or device.  This can be an accreditation procedure on a practitioner for licensing.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getOccurrenceString <em>Occurrence String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getOccurrenceAge <em>Occurrence Age</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getOccurrenceRange <em>Occurrence Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getReportedBoolean <em>Reported Boolean</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getReportedReference <em>Reported Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getReport <em>Report</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getComplication <em>Complication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getFollowUp <em>Follow Up</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getFocalDevice <em>Focal Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getUsed <em>Used</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Procedure#getSupportingInfo <em>Supporting Info</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getProcedure()
 * @model extendedMetaData="name='Procedure' kind='elementOnly'"
 * @generated
 */
public interface Procedure extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this procedure by the performer or other systems which remain constant as the resource is updated and is propagated from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_InstantiatesCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getInstantiatesCanonical();

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to an externally maintained protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_InstantiatesUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesUri' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getInstantiatesUri();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a resource that contains details of the request for this procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger event of which this particular procedure is a component or step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the procedure. Generally, this will be the in-progress or completed state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EventStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EventStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EventStatus value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures the reason for the current state of the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Category()
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
	 * The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getCode <em>Code</em>}' containment reference.
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
	 * On whom or on what the procedure was performed. This is usually an individual human, but can also be performed on animals, groups of humans or animals, organizations or practitioners (for licensing), locations or devices (for safety inspections or regulatory authorizations).  If the actual focus of the procedure is different from the subject, the focus element specifies the actual focus of the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who is the target of the procedure when it is not the subject of record only.  If focus is not present, then subject is the focus.  If focus is present and the subject is one of the targets of the procedure, include subject as a focus as well. If focus is present and the subject is not included in focus, it implies that the procedure was only targeted on the focus. For example, when a caregiver is given education for a patient, the caregiver would be the focus and the procedure record is associated with the subject (e.g. patient).  For example, use focus when recording the target of the education, training, or counseling is the parent or relative of a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFocus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter during which this Procedure was created or performed or to which the creation of this record is tightly associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getEncounter <em>Encounter</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_OccurrencePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrencePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurrencePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getOccurrencePeriod <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #getOccurrencePeriod()
	 * @generated
	 */
	void setOccurrencePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Occurrence String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence String</em>' containment reference.
	 * @see #setOccurrenceString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_OccurrenceString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getOccurrenceString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getOccurrenceString <em>Occurrence String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence String</em>' containment reference.
	 * @see #getOccurrenceString()
	 * @generated
	 */
	void setOccurrenceString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Occurrence Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Age</em>' containment reference.
	 * @see #setOccurrenceAge(Age)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_OccurrenceAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getOccurrenceAge();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getOccurrenceAge <em>Occurrence Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Age</em>' containment reference.
	 * @see #getOccurrenceAge()
	 * @generated
	 */
	void setOccurrenceAge(Age value);

	/**
	 * Returns the value of the '<em><b>Occurrence Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Range</em>' containment reference.
	 * @see #setOccurrenceRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_OccurrenceRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOccurrenceRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getOccurrenceRange <em>Occurrence Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Range</em>' containment reference.
	 * @see #getOccurrenceRange()
	 * @generated
	 */
	void setOccurrenceRange(Range value);

	/**
	 * Returns the value of the '<em><b>Occurrence Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #setOccurrenceTiming(Timing)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_OccurrenceTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getOccurrenceTiming();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getOccurrenceTiming <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #getOccurrenceTiming()
	 * @generated
	 */
	void setOccurrenceTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the occurrence of the procedure was first captured in the record regardless of Procedure.status (potentially after the occurrence of the event).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded</em>' containment reference.
	 * @see #setRecorded(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Recorded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorded' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecorded();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual who recorded the record and takes responsibility for its content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Recorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Reported Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reported Boolean</em>' containment reference.
	 * @see #setReportedBoolean(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_ReportedBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportedBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getReportedBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getReportedBoolean <em>Reported Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported Boolean</em>' containment reference.
	 * @see #getReportedBoolean()
	 * @generated
	 */
	void setReportedBoolean(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Reported Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reported Reference</em>' containment reference.
	 * @see #setReportedReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_ReportedReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportedReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReportedReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getReportedReference <em>Reported Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported Reference</em>' containment reference.
	 * @see #getReportedReference()
	 * @generated
	 */
	void setReportedReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ProcedurePerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what performed the procedure and how they were involved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedurePerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coded reason or reference why the procedure was performed. This may be a coded entity of some type, be present as text, or be a reference to one of several resources that justify the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getBodySite();

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outcome of the procedure - did it resolve the reasons for the procedure being performed?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Procedure#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This could be a histology result, pathology report, surgical report, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Report()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReport();

	/**
	 * Returns the value of the '<em><b>Complication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complication</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Complication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getComplication();

	/**
	 * Returns the value of the '<em><b>Follow Up</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note or could potentially be more complex, in which case the CarePlan resource can be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Follow Up</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_FollowUp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='followUp' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFollowUp();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other notes and comments about the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Focal Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ProcedureFocalDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal Device</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_FocalDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focalDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedureFocalDevice> getFocalDevice();

	/**
	 * Returns the value of the '<em><b>Used</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies medications, devices and any other substance used as part of the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_Used()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='used' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getUsed();

	/**
	 * Returns the value of the '<em><b>Supporting Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other resources from the patient record that may be relevant to the procedure.  The information from these resources was either used to create the instance or is provided to help with its interpretation. This extension should not be used if more specific inline elements or extensions are available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Info</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getProcedure_SupportingInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInfo();

} // Procedure
