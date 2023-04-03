/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Appointment#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getCancellationReason <em>Cancellation Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getVirtualService <em>Virtual Service</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getPreviousAppointment <em>Previous Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getOriginatingAppointment <em>Originating Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getMinutesDuration <em>Minutes Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getRequestedPeriod <em>Requested Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getCancellationDate <em>Cancellation Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getPatientInstruction <em>Patient Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getRecurrenceId <em>Recurrence Id</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getOccurrenceChanged <em>Occurrence Changed</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getRecurrenceTemplate <em>Recurrence Template</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAppointment()
 * @model extendedMetaData="name='Appointment' kind='elementOnly'"
 * @generated
 */
public interface Appointment extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Identifier()
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
	 * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(AppointmentStatus)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AppointmentStatus value);

	/**
	 * Returns the value of the '<em><b>Cancellation Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coded reason for the appointment being cancelled. This is often used in reporting/billing/futher processing to determine if further actions are required, or specific fees apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cancellation Reason</em>' containment reference.
	 * @see #setCancellationReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_CancellationReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cancellationReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCancellationReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getCancellationReason <em>Cancellation Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancellation Reason</em>' containment reference.
	 * @see #getCancellationReason()
	 * @generated
	 */
	void setCancellationReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home health or others due to local variations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClass_();

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A broad categorization of the service that is to be performed during this appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_ServiceCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getServiceCategory();

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific service that is to be performed during this appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_ServiceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getServiceType();

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specialty of a practitioner that would be required to perform the service requested in this appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Specialty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialty();

	/**
	 * Returns the value of the '<em><b>Appointment Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style of appointment or patient that has been booked in the slot (not service type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment Type</em>' containment reference.
	 * @see #setAppointmentType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_AppointmentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appointmentType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAppointmentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getAppointmentType <em>Appointment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Type</em>' containment reference.
	 * @see #getAppointmentType()
	 * @generated
	 */
	void setAppointmentType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason that this appointment is being scheduled. This is more clinical than administrative. This can be coded, or as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the note field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Replaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment replaced by this Appointment in cases where there is a cancellation, the details of the cancellation can be found in the cancellationReason property (on the referenced resource).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaces</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Replaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replaces' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReplaces();

	/**
	 * Returns the value of the '<em><b>Virtual Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.VirtualServiceDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connection details of a virtual service (e.g. conference call).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Service</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_VirtualService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='virtualService' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VirtualServiceDetail> getVirtualService();

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information to support the appointment provided when making the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_SupportingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInformation();

	/**
	 * Returns the value of the '<em><b>Previous Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The previous appointment in a series of related appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Appointment</em>' containment reference.
	 * @see #setPreviousAppointment(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_PreviousAppointment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='previousAppointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPreviousAppointment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getPreviousAppointment <em>Previous Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Appointment</em>' containment reference.
	 * @see #getPreviousAppointment()
	 * @generated
	 */
	void setPreviousAppointment(Reference value);

	/**
	 * Returns the value of the '<em><b>Originating Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The originating appointment in a recurring set of related appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originating Appointment</em>' containment reference.
	 * @see #setOriginatingAppointment(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_OriginatingAppointment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originatingAppointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOriginatingAppointment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getOriginatingAppointment <em>Originating Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating Appointment</em>' containment reference.
	 * @see #getOriginatingAppointment()
	 * @generated
	 */
	void setOriginatingAppointment(Reference value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/Time that the appointment is to take place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Instant)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Instant value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/Time that the appointment is to conclude.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Minutes Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of minutes that the appointment is to take. This can be less than the duration between the start and end times.  For example, where the actual time of appointment is only an estimate or if a 30 minute appointment is being requested, but any time would work.  Also, if there is, for example, a planned 15 minute break in the middle of a long appointment, the duration may be 15 minutes less than the difference between the start and end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minutes Duration</em>' containment reference.
	 * @see #setMinutesDuration(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_MinutesDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minutesDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getMinutesDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getMinutesDuration <em>Minutes Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes Duration</em>' containment reference.
	 * @see #getMinutesDuration()
	 * @generated
	 */
	void setMinutesDuration(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Requested Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Period}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within.
	 * 
	 * The duration (usually in minutes) could also be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time. However, in other situations the duration may be calculated by the scheduling system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Period</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_RequestedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Period> getRequestedPeriod();

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The slots from the participants' schedules that will be filled by the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Slot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='slot' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSlot();

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of accounts that is expected to be used for billing the activities that result from this Appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Account()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='account' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAccount();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that this appointment was initially created. This could be different to the meta.lastModified value on the initial entry, as this could have been before the resource was created on the FHIR server, and should remain unchanged over the lifespan of the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Cancellation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date/time describing when the appointment was cancelled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cancellation Date</em>' containment reference.
	 * @see #setCancellationDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_CancellationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cancellationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCancellationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getCancellationDate <em>Cancellation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancellation Date</em>' containment reference.
	 * @see #getCancellationDate()
	 * @generated
	 */
	void setCancellationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional notes/comments about the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Patient Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * While Appointment.note contains information for internal use, Appointment.patientInstructions is used to capture patient facing information about the Appointment (e.g. please bring your referral or fast from 8pm night before).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Instruction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_PatientInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getPatientInstruction();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request this appointment is allocated to assess (e.g. incoming referral or procedure request).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient or group associated with the appointment, if they are to be present (usually) then they should also be included in the participant backbone element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AppointmentParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of participants involved in the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Participant()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AppointmentParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Recurrence Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number that identifies a specific appointment in a recurring pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurrence Id</em>' containment reference.
	 * @see #setRecurrenceId(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_RecurrenceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recurrenceId' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getRecurrenceId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getRecurrenceId <em>Recurrence Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Id</em>' containment reference.
	 * @see #getRecurrenceId()
	 * @generated
	 */
	void setRecurrenceId(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Occurrence Changed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This appointment varies from the recurring pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Changed</em>' containment reference.
	 * @see #setOccurrenceChanged(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_OccurrenceChanged()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceChanged' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getOccurrenceChanged();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getOccurrenceChanged <em>Occurrence Changed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Changed</em>' containment reference.
	 * @see #getOccurrenceChanged()
	 * @generated
	 */
	void setOccurrenceChanged(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Recurrence Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AppointmentRecurrenceTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of the recurrence pattern or template that is used to generate recurring appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurrence Template</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_RecurrenceTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recurrenceTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AppointmentRecurrenceTemplate> getRecurrenceTemplate();

} // Appointment
