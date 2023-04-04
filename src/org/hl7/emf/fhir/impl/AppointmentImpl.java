/**
 */
package org.hl7.emf.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.emf.fhir.Annotation;
import org.hl7.emf.fhir.Appointment;
import org.hl7.emf.fhir.AppointmentParticipant;
import org.hl7.emf.fhir.AppointmentRecurrenceTemplate;
import org.hl7.emf.fhir.AppointmentStatus;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Instant;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.PositiveInt;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.VirtualServiceDetail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getCancellationReason <em>Cancellation Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getVirtualService <em>Virtual Service</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getPreviousAppointment <em>Previous Appointment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getOriginatingAppointment <em>Originating Appointment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getMinutesDuration <em>Minutes Duration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getRequestedPeriod <em>Requested Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getCancellationDate <em>Cancellation Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getPatientInstruction <em>Patient Instruction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getRecurrenceId <em>Recurrence Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getOccurrenceChanged <em>Occurrence Changed</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentImpl#getRecurrenceTemplate <em>Recurrence Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentImpl extends DomainResourceImpl implements Appointment {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected AppointmentStatus status;

	/**
	 * The cached value of the '{@link #getCancellationReason() <em>Cancellation Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancellationReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept cancellationReason;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> class_;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceCategory;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> serviceType;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialty;

	/**
	 * The cached value of the '{@link #getAppointmentType() <em>Appointment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept appointmentType;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> reason;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String description;

	/**
	 * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> replaces;

	/**
	 * The cached value of the '{@link #getVirtualService() <em>Virtual Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualService()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualServiceDetail> virtualService;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * The cached value of the '{@link #getPreviousAppointment() <em>Previous Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousAppointment()
	 * @generated
	 * @ordered
	 */
	protected Reference previousAppointment;

	/**
	 * The cached value of the '{@link #getOriginatingAppointment() <em>Originating Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingAppointment()
	 * @generated
	 * @ordered
	 */
	protected Reference originatingAppointment;

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
	 * The cached value of the '{@link #getMinutesDuration() <em>Minutes Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutesDuration()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt minutesDuration;

	/**
	 * The cached value of the '{@link #getRequestedPeriod() <em>Requested Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> requestedPeriod;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> slot;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> account;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getCancellationDate() <em>Cancellation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancellationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime cancellationDate;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getPatientInstruction() <em>Patient Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> patientInstruction;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<AppointmentParticipant> participant;

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
	 * The cached value of the '{@link #getOccurrenceChanged() <em>Occurrence Changed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceChanged()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean occurrenceChanged;

	/**
	 * The cached value of the '{@link #getRecurrenceTemplate() <em>Recurrence Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<AppointmentRecurrenceTemplate> recurrenceTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAppointment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.APPOINTMENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(AppointmentStatus newStatus, NotificationChain msgs) {
		AppointmentStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(AppointmentStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCancellationReason() {
		return cancellationReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancellationReason(CodeableConcept newCancellationReason, NotificationChain msgs) {
		CodeableConcept oldCancellationReason = cancellationReason;
		cancellationReason = newCancellationReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__CANCELLATION_REASON, oldCancellationReason, newCancellationReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancellationReason(CodeableConcept newCancellationReason) {
		if (newCancellationReason != cancellationReason) {
			NotificationChain msgs = null;
			if (cancellationReason != null)
				msgs = ((InternalEObject)cancellationReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__CANCELLATION_REASON, null, msgs);
			if (newCancellationReason != null)
				msgs = ((InternalEObject)newCancellationReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__CANCELLATION_REASON, null, msgs);
			msgs = basicSetCancellationReason(newCancellationReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__CANCELLATION_REASON, newCancellationReason, newCancellationReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.APPOINTMENT__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getServiceCategory() {
		if (serviceCategory == null) {
			serviceCategory = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.APPOINTMENT__SERVICE_CATEGORY);
		}
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getServiceType() {
		if (serviceType == null) {
			serviceType = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.APPOINTMENT__SERVICE_TYPE);
		}
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.APPOINTMENT__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAppointmentType() {
		return appointmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentType(CodeableConcept newAppointmentType, NotificationChain msgs) {
		CodeableConcept oldAppointmentType = appointmentType;
		appointmentType = newAppointmentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__APPOINTMENT_TYPE, oldAppointmentType, newAppointmentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppointmentType(CodeableConcept newAppointmentType) {
		if (newAppointmentType != appointmentType) {
			NotificationChain msgs = null;
			if (appointmentType != null)
				msgs = ((InternalEObject)appointmentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__APPOINTMENT_TYPE, null, msgs);
			if (newAppointmentType != null)
				msgs = ((InternalEObject)newAppointmentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__APPOINTMENT_TYPE, null, msgs);
			msgs = basicSetAppointmentType(newAppointmentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__APPOINTMENT_TYPE, newAppointmentType, newAppointmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.APPOINTMENT__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.emf.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(org.hl7.emf.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReplaces() {
		if (replaces == null) {
			replaces = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.APPOINTMENT__REPLACES);
		}
		return replaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualServiceDetail> getVirtualService() {
		if (virtualService == null) {
			virtualService = new EObjectContainmentEList<VirtualServiceDetail>(VirtualServiceDetail.class, this, FhirPackage.APPOINTMENT__VIRTUAL_SERVICE);
		}
		return virtualService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.APPOINTMENT__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPreviousAppointment() {
		return previousAppointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousAppointment(Reference newPreviousAppointment, NotificationChain msgs) {
		Reference oldPreviousAppointment = previousAppointment;
		previousAppointment = newPreviousAppointment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__PREVIOUS_APPOINTMENT, oldPreviousAppointment, newPreviousAppointment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousAppointment(Reference newPreviousAppointment) {
		if (newPreviousAppointment != previousAppointment) {
			NotificationChain msgs = null;
			if (previousAppointment != null)
				msgs = ((InternalEObject)previousAppointment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__PREVIOUS_APPOINTMENT, null, msgs);
			if (newPreviousAppointment != null)
				msgs = ((InternalEObject)newPreviousAppointment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__PREVIOUS_APPOINTMENT, null, msgs);
			msgs = basicSetPreviousAppointment(newPreviousAppointment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__PREVIOUS_APPOINTMENT, newPreviousAppointment, newPreviousAppointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOriginatingAppointment() {
		return originatingAppointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginatingAppointment(Reference newOriginatingAppointment, NotificationChain msgs) {
		Reference oldOriginatingAppointment = originatingAppointment;
		originatingAppointment = newOriginatingAppointment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__ORIGINATING_APPOINTMENT, oldOriginatingAppointment, newOriginatingAppointment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatingAppointment(Reference newOriginatingAppointment) {
		if (newOriginatingAppointment != originatingAppointment) {
			NotificationChain msgs = null;
			if (originatingAppointment != null)
				msgs = ((InternalEObject)originatingAppointment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__ORIGINATING_APPOINTMENT, null, msgs);
			if (newOriginatingAppointment != null)
				msgs = ((InternalEObject)newOriginatingAppointment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__ORIGINATING_APPOINTMENT, null, msgs);
			msgs = basicSetOriginatingAppointment(newOriginatingAppointment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__ORIGINATING_APPOINTMENT, newOriginatingAppointment, newOriginatingAppointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Instant newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getMinutesDuration() {
		return minutesDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinutesDuration(PositiveInt newMinutesDuration, NotificationChain msgs) {
		PositiveInt oldMinutesDuration = minutesDuration;
		minutesDuration = newMinutesDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__MINUTES_DURATION, oldMinutesDuration, newMinutesDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinutesDuration(PositiveInt newMinutesDuration) {
		if (newMinutesDuration != minutesDuration) {
			NotificationChain msgs = null;
			if (minutesDuration != null)
				msgs = ((InternalEObject)minutesDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__MINUTES_DURATION, null, msgs);
			if (newMinutesDuration != null)
				msgs = ((InternalEObject)newMinutesDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__MINUTES_DURATION, null, msgs);
			msgs = basicSetMinutesDuration(newMinutesDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__MINUTES_DURATION, newMinutesDuration, newMinutesDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Period> getRequestedPeriod() {
		if (requestedPeriod == null) {
			requestedPeriod = new EObjectContainmentEList<Period>(Period.class, this, FhirPackage.APPOINTMENT__REQUESTED_PERIOD);
		}
		return requestedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.APPOINTMENT__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAccount() {
		if (account == null) {
			account = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.APPOINTMENT__ACCOUNT);
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCancellationDate() {
		return cancellationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancellationDate(DateTime newCancellationDate, NotificationChain msgs) {
		DateTime oldCancellationDate = cancellationDate;
		cancellationDate = newCancellationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__CANCELLATION_DATE, oldCancellationDate, newCancellationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancellationDate(DateTime newCancellationDate) {
		if (newCancellationDate != cancellationDate) {
			NotificationChain msgs = null;
			if (cancellationDate != null)
				msgs = ((InternalEObject)cancellationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__CANCELLATION_DATE, null, msgs);
			if (newCancellationDate != null)
				msgs = ((InternalEObject)newCancellationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__CANCELLATION_DATE, null, msgs);
			msgs = basicSetCancellationDate(newCancellationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__CANCELLATION_DATE, newCancellationDate, newCancellationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.APPOINTMENT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getPatientInstruction() {
		if (patientInstruction == null) {
			patientInstruction = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.APPOINTMENT__PATIENT_INSTRUCTION);
		}
		return patientInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.APPOINTMENT__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AppointmentParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<AppointmentParticipant>(AppointmentParticipant.class, this, FhirPackage.APPOINTMENT__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__RECURRENCE_ID, oldRecurrenceId, newRecurrenceId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceId(PositiveInt newRecurrenceId) {
		if (newRecurrenceId != recurrenceId) {
			NotificationChain msgs = null;
			if (recurrenceId != null)
				msgs = ((InternalEObject)recurrenceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__RECURRENCE_ID, null, msgs);
			if (newRecurrenceId != null)
				msgs = ((InternalEObject)newRecurrenceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__RECURRENCE_ID, null, msgs);
			msgs = basicSetRecurrenceId(newRecurrenceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__RECURRENCE_ID, newRecurrenceId, newRecurrenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getOccurrenceChanged() {
		return occurrenceChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceChanged(org.hl7.emf.fhir.Boolean newOccurrenceChanged, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldOccurrenceChanged = occurrenceChanged;
		occurrenceChanged = newOccurrenceChanged;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__OCCURRENCE_CHANGED, oldOccurrenceChanged, newOccurrenceChanged);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurrenceChanged(org.hl7.emf.fhir.Boolean newOccurrenceChanged) {
		if (newOccurrenceChanged != occurrenceChanged) {
			NotificationChain msgs = null;
			if (occurrenceChanged != null)
				msgs = ((InternalEObject)occurrenceChanged).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__OCCURRENCE_CHANGED, null, msgs);
			if (newOccurrenceChanged != null)
				msgs = ((InternalEObject)newOccurrenceChanged).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__OCCURRENCE_CHANGED, null, msgs);
			msgs = basicSetOccurrenceChanged(newOccurrenceChanged, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__OCCURRENCE_CHANGED, newOccurrenceChanged, newOccurrenceChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AppointmentRecurrenceTemplate> getRecurrenceTemplate() {
		if (recurrenceTemplate == null) {
			recurrenceTemplate = new EObjectContainmentEList<AppointmentRecurrenceTemplate>(AppointmentRecurrenceTemplate.class, this, FhirPackage.APPOINTMENT__RECURRENCE_TEMPLATE);
		}
		return recurrenceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.APPOINTMENT__CANCELLATION_REASON:
				return basicSetCancellationReason(null, msgs);
			case FhirPackage.APPOINTMENT__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				return ((InternalEList<?>)getServiceCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceType()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				return basicSetAppointmentType(null, msgs);
			case FhirPackage.APPOINTMENT__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.APPOINTMENT__REPLACES:
				return ((InternalEList<?>)getReplaces()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__VIRTUAL_SERVICE:
				return ((InternalEList<?>)getVirtualService()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__PREVIOUS_APPOINTMENT:
				return basicSetPreviousAppointment(null, msgs);
			case FhirPackage.APPOINTMENT__ORIGINATING_APPOINTMENT:
				return basicSetOriginatingAppointment(null, msgs);
			case FhirPackage.APPOINTMENT__START:
				return basicSetStart(null, msgs);
			case FhirPackage.APPOINTMENT__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				return basicSetMinutesDuration(null, msgs);
			case FhirPackage.APPOINTMENT__REQUESTED_PERIOD:
				return ((InternalEList<?>)getRequestedPeriod()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__ACCOUNT:
				return ((InternalEList<?>)getAccount()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.APPOINTMENT__CANCELLATION_DATE:
				return basicSetCancellationDate(null, msgs);
			case FhirPackage.APPOINTMENT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				return ((InternalEList<?>)getPatientInstruction()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__RECURRENCE_ID:
				return basicSetRecurrenceId(null, msgs);
			case FhirPackage.APPOINTMENT__OCCURRENCE_CHANGED:
				return basicSetOccurrenceChanged(null, msgs);
			case FhirPackage.APPOINTMENT__RECURRENCE_TEMPLATE:
				return ((InternalEList<?>)getRecurrenceTemplate()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.APPOINTMENT__STATUS:
				return getStatus();
			case FhirPackage.APPOINTMENT__CANCELLATION_REASON:
				return getCancellationReason();
			case FhirPackage.APPOINTMENT__CLASS:
				return getClass_();
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				return getServiceCategory();
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				return getServiceType();
			case FhirPackage.APPOINTMENT__SPECIALTY:
				return getSpecialty();
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				return getAppointmentType();
			case FhirPackage.APPOINTMENT__REASON:
				return getReason();
			case FhirPackage.APPOINTMENT__PRIORITY:
				return getPriority();
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				return getDescription();
			case FhirPackage.APPOINTMENT__REPLACES:
				return getReplaces();
			case FhirPackage.APPOINTMENT__VIRTUAL_SERVICE:
				return getVirtualService();
			case FhirPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FhirPackage.APPOINTMENT__PREVIOUS_APPOINTMENT:
				return getPreviousAppointment();
			case FhirPackage.APPOINTMENT__ORIGINATING_APPOINTMENT:
				return getOriginatingAppointment();
			case FhirPackage.APPOINTMENT__START:
				return getStart();
			case FhirPackage.APPOINTMENT__END:
				return getEnd();
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				return getMinutesDuration();
			case FhirPackage.APPOINTMENT__REQUESTED_PERIOD:
				return getRequestedPeriod();
			case FhirPackage.APPOINTMENT__SLOT:
				return getSlot();
			case FhirPackage.APPOINTMENT__ACCOUNT:
				return getAccount();
			case FhirPackage.APPOINTMENT__CREATED:
				return getCreated();
			case FhirPackage.APPOINTMENT__CANCELLATION_DATE:
				return getCancellationDate();
			case FhirPackage.APPOINTMENT__NOTE:
				return getNote();
			case FhirPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				return getPatientInstruction();
			case FhirPackage.APPOINTMENT__BASED_ON:
				return getBasedOn();
			case FhirPackage.APPOINTMENT__SUBJECT:
				return getSubject();
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				return getParticipant();
			case FhirPackage.APPOINTMENT__RECURRENCE_ID:
				return getRecurrenceId();
			case FhirPackage.APPOINTMENT__OCCURRENCE_CHANGED:
				return getOccurrenceChanged();
			case FhirPackage.APPOINTMENT__RECURRENCE_TEMPLATE:
				return getRecurrenceTemplate();
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.APPOINTMENT__STATUS:
				setStatus((AppointmentStatus)newValue);
				return;
			case FhirPackage.APPOINTMENT__CANCELLATION_REASON:
				setCancellationReason((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				getServiceCategory().clear();
				getServiceCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				getServiceType().clear();
				getServiceType().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				setAppointmentType((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				setDescription((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.APPOINTMENT__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__VIRTUAL_SERVICE:
				getVirtualService().clear();
				getVirtualService().addAll((Collection<? extends VirtualServiceDetail>)newValue);
				return;
			case FhirPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__PREVIOUS_APPOINTMENT:
				setPreviousAppointment((Reference)newValue);
				return;
			case FhirPackage.APPOINTMENT__ORIGINATING_APPOINTMENT:
				setOriginatingAppointment((Reference)newValue);
				return;
			case FhirPackage.APPOINTMENT__START:
				setStart((Instant)newValue);
				return;
			case FhirPackage.APPOINTMENT__END:
				setEnd((Instant)newValue);
				return;
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				setMinutesDuration((PositiveInt)newValue);
				return;
			case FhirPackage.APPOINTMENT__REQUESTED_PERIOD:
				getRequestedPeriod().clear();
				getRequestedPeriod().addAll((Collection<? extends Period>)newValue);
				return;
			case FhirPackage.APPOINTMENT__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__ACCOUNT:
				getAccount().clear();
				getAccount().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.APPOINTMENT__CANCELLATION_DATE:
				setCancellationDate((DateTime)newValue);
				return;
			case FhirPackage.APPOINTMENT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				getPatientInstruction().clear();
				getPatientInstruction().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends AppointmentParticipant>)newValue);
				return;
			case FhirPackage.APPOINTMENT__RECURRENCE_ID:
				setRecurrenceId((PositiveInt)newValue);
				return;
			case FhirPackage.APPOINTMENT__OCCURRENCE_CHANGED:
				setOccurrenceChanged((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT__RECURRENCE_TEMPLATE:
				getRecurrenceTemplate().clear();
				getRecurrenceTemplate().addAll((Collection<? extends AppointmentRecurrenceTemplate>)newValue);
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.APPOINTMENT__STATUS:
				setStatus((AppointmentStatus)null);
				return;
			case FhirPackage.APPOINTMENT__CANCELLATION_REASON:
				setCancellationReason((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT__CLASS:
				getClass_().clear();
				return;
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				getServiceCategory().clear();
				return;
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				getServiceType().clear();
				return;
			case FhirPackage.APPOINTMENT__SPECIALTY:
				getSpecialty().clear();
				return;
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				setAppointmentType((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT__REASON:
				getReason().clear();
				return;
			case FhirPackage.APPOINTMENT__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				setDescription((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.APPOINTMENT__REPLACES:
				getReplaces().clear();
				return;
			case FhirPackage.APPOINTMENT__VIRTUAL_SERVICE:
				getVirtualService().clear();
				return;
			case FhirPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FhirPackage.APPOINTMENT__PREVIOUS_APPOINTMENT:
				setPreviousAppointment((Reference)null);
				return;
			case FhirPackage.APPOINTMENT__ORIGINATING_APPOINTMENT:
				setOriginatingAppointment((Reference)null);
				return;
			case FhirPackage.APPOINTMENT__START:
				setStart((Instant)null);
				return;
			case FhirPackage.APPOINTMENT__END:
				setEnd((Instant)null);
				return;
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				setMinutesDuration((PositiveInt)null);
				return;
			case FhirPackage.APPOINTMENT__REQUESTED_PERIOD:
				getRequestedPeriod().clear();
				return;
			case FhirPackage.APPOINTMENT__SLOT:
				getSlot().clear();
				return;
			case FhirPackage.APPOINTMENT__ACCOUNT:
				getAccount().clear();
				return;
			case FhirPackage.APPOINTMENT__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.APPOINTMENT__CANCELLATION_DATE:
				setCancellationDate((DateTime)null);
				return;
			case FhirPackage.APPOINTMENT__NOTE:
				getNote().clear();
				return;
			case FhirPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				getPatientInstruction().clear();
				return;
			case FhirPackage.APPOINTMENT__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.APPOINTMENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.APPOINTMENT__RECURRENCE_ID:
				setRecurrenceId((PositiveInt)null);
				return;
			case FhirPackage.APPOINTMENT__OCCURRENCE_CHANGED:
				setOccurrenceChanged((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT__RECURRENCE_TEMPLATE:
				getRecurrenceTemplate().clear();
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.APPOINTMENT__STATUS:
				return status != null;
			case FhirPackage.APPOINTMENT__CANCELLATION_REASON:
				return cancellationReason != null;
			case FhirPackage.APPOINTMENT__CLASS:
				return class_ != null && !class_.isEmpty();
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				return serviceCategory != null && !serviceCategory.isEmpty();
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				return serviceType != null && !serviceType.isEmpty();
			case FhirPackage.APPOINTMENT__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				return appointmentType != null;
			case FhirPackage.APPOINTMENT__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.APPOINTMENT__PRIORITY:
				return priority != null;
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				return description != null;
			case FhirPackage.APPOINTMENT__REPLACES:
				return replaces != null && !replaces.isEmpty();
			case FhirPackage.APPOINTMENT__VIRTUAL_SERVICE:
				return virtualService != null && !virtualService.isEmpty();
			case FhirPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FhirPackage.APPOINTMENT__PREVIOUS_APPOINTMENT:
				return previousAppointment != null;
			case FhirPackage.APPOINTMENT__ORIGINATING_APPOINTMENT:
				return originatingAppointment != null;
			case FhirPackage.APPOINTMENT__START:
				return start != null;
			case FhirPackage.APPOINTMENT__END:
				return end != null;
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				return minutesDuration != null;
			case FhirPackage.APPOINTMENT__REQUESTED_PERIOD:
				return requestedPeriod != null && !requestedPeriod.isEmpty();
			case FhirPackage.APPOINTMENT__SLOT:
				return slot != null && !slot.isEmpty();
			case FhirPackage.APPOINTMENT__ACCOUNT:
				return account != null && !account.isEmpty();
			case FhirPackage.APPOINTMENT__CREATED:
				return created != null;
			case FhirPackage.APPOINTMENT__CANCELLATION_DATE:
				return cancellationDate != null;
			case FhirPackage.APPOINTMENT__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				return patientInstruction != null && !patientInstruction.isEmpty();
			case FhirPackage.APPOINTMENT__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.APPOINTMENT__SUBJECT:
				return subject != null;
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.APPOINTMENT__RECURRENCE_ID:
				return recurrenceId != null;
			case FhirPackage.APPOINTMENT__OCCURRENCE_CHANGED:
				return occurrenceChanged != null;
			case FhirPackage.APPOINTMENT__RECURRENCE_TEMPLATE:
				return recurrenceTemplate != null && !recurrenceTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppointmentImpl
