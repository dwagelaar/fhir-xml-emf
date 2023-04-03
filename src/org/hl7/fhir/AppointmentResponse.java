/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getProposedNewTime <em>Proposed New Time</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getParticipantType <em>Participant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getParticipantStatus <em>Participant Status</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getRecurring <em>Recurring</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getOccurrenceDate <em>Occurrence Date</em>}</li>
 *   <li>{@link org.hl7.fhir.AppointmentResponse#getRecurrenceId <em>Recurrence Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse()
 * @model extendedMetaData="name='AppointmentResponse' kind='elementOnly'"
 * @generated
 */
public interface AppointmentResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment that this response is replying to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference.
	 * @see #setAppointment(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_Appointment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='appointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAppointment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getAppointment <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' containment reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Reference value);

	/**
	 * Returns the value of the '<em><b>Proposed New Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the response is proposing a different time that was initially requested.  The new proposed time will be indicated in the start and end properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proposed New Time</em>' containment reference.
	 * @see #setProposedNewTime(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_ProposedNewTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='proposedNewTime' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getProposedNewTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getProposedNewTime <em>Proposed New Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed New Time</em>' containment reference.
	 * @see #getProposedNewTime()
	 * @generated
	 */
	void setProposedNewTime(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/Time that the appointment is to take place, or requested new start time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Instant)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getStart <em>Start</em>}' containment reference.
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
	 * This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Participant Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role of participant in the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_ParticipantType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getParticipantType();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Person, Location, HealthcareService, or Device that is participating in the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

	/**
	 * Returns the value of the '<em><b>Participant Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Status</em>' containment reference.
	 * @see #setParticipantStatus(AppointmentResponseStatus)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_ParticipantStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='participantStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentResponseStatus getParticipantStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getParticipantStatus <em>Participant Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Status</em>' containment reference.
	 * @see #getParticipantStatus()
	 * @generated
	 */
	void setParticipantStatus(AppointmentResponseStatus value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional comments about the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Markdown value);

	/**
	 * Returns the value of the '<em><b>Recurring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that this AppointmentResponse applies to all occurrences in a recurring request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurring</em>' containment reference.
	 * @see #setRecurring(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_Recurring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recurring' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRecurring();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getRecurring <em>Recurring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurring</em>' containment reference.
	 * @see #getRecurring()
	 * @generated
	 */
	void setRecurring(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Occurrence Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The original date within a recurring request. This could be used in place of the recurrenceId to be more direct (or where the template is provided through the simple list of dates in `Appointment.occurrenceDate`).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Date</em>' containment reference.
	 * @see #setOccurrenceDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_OccurrenceDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getOccurrenceDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getOccurrenceDate <em>Occurrence Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Date</em>' containment reference.
	 * @see #getOccurrenceDate()
	 * @generated
	 */
	void setOccurrenceDate(Date value);

	/**
	 * Returns the value of the '<em><b>Recurrence Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recurrence ID (sequence number) of the specific appointment when responding to a recurring request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurrence Id</em>' containment reference.
	 * @see #setRecurrenceId(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getAppointmentResponse_RecurrenceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recurrenceId' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getRecurrenceId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AppointmentResponse#getRecurrenceId <em>Recurrence Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Id</em>' containment reference.
	 * @see #getRecurrenceId()
	 * @generated
	 */
	void setRecurrenceId(PositiveInt value);

} // AppointmentResponse
