/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentResponseStatus;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getProposedNewTime <em>Proposed New Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getParticipantType <em>Participant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getParticipantStatus <em>Participant Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getRecurring <em>Recurring</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getOccurrenceDate <em>Occurrence Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getRecurrenceId <em>Recurrence Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentResponseImpl extends DomainResourceImpl implements AppointmentResponse {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected Reference appointment;

	/**
	 * The cached value of the '{@link #getProposedNewTime() <em>Proposed New Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposedNewTime()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean proposedNewTime;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Instant start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getParticipantType() <em>Participant Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> participantType;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Reference actor;

	/**
	 * The cached value of the '{@link #getParticipantStatus() <em>Participant Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantStatus()
	 * @generated
	 * @ordered
	 */
	protected AppointmentResponseStatus participantStatus;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected Markdown comment;

	/**
	 * The cached value of the '{@link #getRecurring() <em>Recurring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurring()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean recurring;

	/**
	 * The cached value of the '{@link #getOccurrenceDate() <em>Occurrence Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDate()
	 * @generated
	 * @ordered
	 */
	protected Date occurrenceDate;

	/**
	 * The cached value of the '{@link #getRecurrenceId() <em>Recurrence Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt recurrenceId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAppointmentResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAppointment() {
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointment(Reference newAppointment, NotificationChain msgs) {
		Reference oldAppointment = appointment;
		appointment = newAppointment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT, oldAppointment, newAppointment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointment(Reference newAppointment) {
		if (newAppointment != appointment) {
			NotificationChain msgs = null;
			if (appointment != null)
				msgs = ((InternalEObject)appointment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT, null, msgs);
			if (newAppointment != null)
				msgs = ((InternalEObject)newAppointment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT, null, msgs);
			msgs = basicSetAppointment(newAppointment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT, newAppointment, newAppointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getProposedNewTime() {
		return proposedNewTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProposedNewTime(org.hl7.fhir.Boolean newProposedNewTime, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldProposedNewTime = proposedNewTime;
		proposedNewTime = newProposedNewTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__PROPOSED_NEW_TIME, oldProposedNewTime, newProposedNewTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedNewTime(org.hl7.fhir.Boolean newProposedNewTime) {
		if (newProposedNewTime != proposedNewTime) {
			NotificationChain msgs = null;
			if (proposedNewTime != null)
				msgs = ((InternalEObject)proposedNewTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__PROPOSED_NEW_TIME, null, msgs);
			if (newProposedNewTime != null)
				msgs = ((InternalEObject)newProposedNewTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__PROPOSED_NEW_TIME, null, msgs);
			msgs = basicSetProposedNewTime(newProposedNewTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__PROPOSED_NEW_TIME, newProposedNewTime, newProposedNewTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Instant newStart, NotificationChain msgs) {
		Instant oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Instant newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Instant newEnd, NotificationChain msgs) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getParticipantType() {
		if (participantType == null) {
			participantType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE);
		}
		return participantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActor(Reference newActor, NotificationChain msgs) {
		Reference oldActor = actor;
		actor = newActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__ACTOR, oldActor, newActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Reference newActor) {
		if (newActor != actor) {
			NotificationChain msgs = null;
			if (actor != null)
				msgs = ((InternalEObject)actor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__ACTOR, null, msgs);
			if (newActor != null)
				msgs = ((InternalEObject)newActor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__ACTOR, null, msgs);
			msgs = basicSetActor(newActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__ACTOR, newActor, newActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponseStatus getParticipantStatus() {
		return participantStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantStatus(AppointmentResponseStatus newParticipantStatus, NotificationChain msgs) {
		AppointmentResponseStatus oldParticipantStatus = participantStatus;
		participantStatus = newParticipantStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, oldParticipantStatus, newParticipantStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantStatus(AppointmentResponseStatus newParticipantStatus) {
		if (newParticipantStatus != participantStatus) {
			NotificationChain msgs = null;
			if (participantStatus != null)
				msgs = ((InternalEObject)participantStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, null, msgs);
			if (newParticipantStatus != null)
				msgs = ((InternalEObject)newParticipantStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, null, msgs);
			msgs = basicSetParticipantStatus(newParticipantStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, newParticipantStatus, newParticipantStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Markdown newComment, NotificationChain msgs) {
		Markdown oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Markdown newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRecurring() {
		return recurring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecurring(org.hl7.fhir.Boolean newRecurring, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRecurring = recurring;
		recurring = newRecurring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__RECURRING, oldRecurring, newRecurring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurring(org.hl7.fhir.Boolean newRecurring) {
		if (newRecurring != recurring) {
			NotificationChain msgs = null;
			if (recurring != null)
				msgs = ((InternalEObject)recurring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__RECURRING, null, msgs);
			if (newRecurring != null)
				msgs = ((InternalEObject)newRecurring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__RECURRING, null, msgs);
			msgs = basicSetRecurring(newRecurring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__RECURRING, newRecurring, newRecurring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOccurrenceDate() {
		return occurrenceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDate(Date newOccurrenceDate, NotificationChain msgs) {
		Date oldOccurrenceDate = occurrenceDate;
		occurrenceDate = newOccurrenceDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__OCCURRENCE_DATE, oldOccurrenceDate, newOccurrenceDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceDate(Date newOccurrenceDate) {
		if (newOccurrenceDate != occurrenceDate) {
			NotificationChain msgs = null;
			if (occurrenceDate != null)
				msgs = ((InternalEObject)occurrenceDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__OCCURRENCE_DATE, null, msgs);
			if (newOccurrenceDate != null)
				msgs = ((InternalEObject)newOccurrenceDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__OCCURRENCE_DATE, null, msgs);
			msgs = basicSetOccurrenceDate(newOccurrenceDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__OCCURRENCE_DATE, newOccurrenceDate, newOccurrenceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getRecurrenceId() {
		return recurrenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecurrenceId(PositiveInt newRecurrenceId, NotificationChain msgs) {
		PositiveInt oldRecurrenceId = recurrenceId;
		recurrenceId = newRecurrenceId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__RECURRENCE_ID, oldRecurrenceId, newRecurrenceId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurrenceId(PositiveInt newRecurrenceId) {
		if (newRecurrenceId != recurrenceId) {
			NotificationChain msgs = null;
			if (recurrenceId != null)
				msgs = ((InternalEObject)recurrenceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__RECURRENCE_ID, null, msgs);
			if (newRecurrenceId != null)
				msgs = ((InternalEObject)newRecurrenceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__RECURRENCE_ID, null, msgs);
			msgs = basicSetRecurrenceId(newRecurrenceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__RECURRENCE_ID, newRecurrenceId, newRecurrenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				return basicSetAppointment(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__PROPOSED_NEW_TIME:
				return basicSetProposedNewTime(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				return basicSetStart(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				return ((InternalEList<?>)getParticipantType()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				return basicSetActor(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				return basicSetParticipantStatus(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRING:
				return basicSetRecurring(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__OCCURRENCE_DATE:
				return basicSetOccurrenceDate(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRENCE_ID:
				return basicSetRecurrenceId(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				return getAppointment();
			case FhirPackage.APPOINTMENT_RESPONSE__PROPOSED_NEW_TIME:
				return getProposedNewTime();
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				return getStart();
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				return getEnd();
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				return getParticipantType();
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				return getActor();
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				return getParticipantStatus();
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				return getComment();
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRING:
				return getRecurring();
			case FhirPackage.APPOINTMENT_RESPONSE__OCCURRENCE_DATE:
				return getOccurrenceDate();
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRENCE_ID:
				return getRecurrenceId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				setAppointment((Reference)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PROPOSED_NEW_TIME:
				setProposedNewTime((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				setStart((Instant)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				setEnd((Instant)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				getParticipantType().clear();
				getParticipantType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				setActor((Reference)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				setParticipantStatus((AppointmentResponseStatus)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				setComment((Markdown)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRING:
				setRecurring((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__OCCURRENCE_DATE:
				setOccurrenceDate((Date)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRENCE_ID:
				setRecurrenceId((PositiveInt)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				setAppointment((Reference)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PROPOSED_NEW_TIME:
				setProposedNewTime((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				setStart((Instant)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				setEnd((Instant)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				getParticipantType().clear();
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				setActor((Reference)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				setParticipantStatus((AppointmentResponseStatus)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				setComment((Markdown)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRING:
				setRecurring((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__OCCURRENCE_DATE:
				setOccurrenceDate((Date)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRENCE_ID:
				setRecurrenceId((PositiveInt)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				return appointment != null;
			case FhirPackage.APPOINTMENT_RESPONSE__PROPOSED_NEW_TIME:
				return proposedNewTime != null;
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				return start != null;
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				return end != null;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				return participantType != null && !participantType.isEmpty();
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				return actor != null;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				return participantStatus != null;
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				return comment != null;
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRING:
				return recurring != null;
			case FhirPackage.APPOINTMENT_RESPONSE__OCCURRENCE_DATE:
				return occurrenceDate != null;
			case FhirPackage.APPOINTMENT_RESPONSE__RECURRENCE_ID:
				return recurrenceId != null;
		}
		return super.eIsSet(featureID);
	}

} //AppointmentResponseImpl
