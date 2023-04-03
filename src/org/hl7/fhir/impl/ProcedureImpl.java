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

import org.hl7.fhir.Age;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EventStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOccurrenceString <em>Occurrence String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOccurrenceAge <em>Occurrence Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOccurrenceRange <em>Occurrence Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReportedBoolean <em>Reported Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReportedReference <em>Reported Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReport <em>Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getComplication <em>Complication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getFollowUp <em>Follow Up</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getFocalDevice <em>Focal Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getUsed <em>Used</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends DomainResourceImpl implements Procedure {
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
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesUri() <em>Instantiates Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUri()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiatesUri;

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
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOf;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EventStatus status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Reference focus;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurrencePeriod() <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurrencePeriod;

	/**
	 * The cached value of the '{@link #getOccurrenceString() <em>Occurrence String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String occurrenceString;

	/**
	 * The cached value of the '{@link #getOccurrenceAge() <em>Occurrence Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceAge()
	 * @generated
	 * @ordered
	 */
	protected Age occurrenceAge;

	/**
	 * The cached value of the '{@link #getOccurrenceRange() <em>Occurrence Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceRange()
	 * @generated
	 * @ordered
	 */
	protected Range occurrenceRange;

	/**
	 * The cached value of the '{@link #getOccurrenceTiming() <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing occurrenceTiming;

	/**
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected DateTime recorded;

	/**
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected Reference recorder;

	/**
	 * The cached value of the '{@link #getReportedBoolean() <em>Reported Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean reportedBoolean;

	/**
	 * The cached value of the '{@link #getReportedReference() <em>Reported Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reportedReference;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedurePerformer> performer;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

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
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySite;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getReport() <em>Report</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> report;

	/**
	 * The cached value of the '{@link #getComplication() <em>Complication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> complication;

	/**
	 * The cached value of the '{@link #getFollowUp() <em>Follow Up</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowUp()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> followUp;

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
	 * The cached value of the '{@link #getFocalDevice() <em>Focal Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureFocalDevice> focalDevice;

	/**
	 * The cached value of the '{@link #getUsed() <em>Used</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> used;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PROCEDURE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Canonical> getInstantiatesCanonical() {
		if (instantiatesCanonical == null) {
			instantiatesCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.PROCEDURE__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getInstantiatesUri() {
		if (instantiatesUri == null) {
			instantiatesUri = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.PROCEDURE__INSTANTIATES_URI);
		}
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EventStatus newStatus, NotificationChain msgs) {
		EventStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EventStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(CodeableConcept newStatusReason, NotificationChain msgs) {
		CodeableConcept oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS_REASON, oldStatusReason, newStatusReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(Reference newFocus, NotificationChain msgs) {
		Reference oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__FOCUS, oldFocus, newFocus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(Reference newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getOccurrencePeriod() {
		return occurrencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencePeriod(Period newOccurrencePeriod, NotificationChain msgs) {
		Period oldOccurrencePeriod = occurrencePeriod;
		occurrencePeriod = newOccurrencePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_PERIOD, oldOccurrencePeriod, newOccurrencePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencePeriod(Period newOccurrencePeriod) {
		if (newOccurrencePeriod != occurrencePeriod) {
			NotificationChain msgs = null;
			if (occurrencePeriod != null)
				msgs = ((InternalEObject)occurrencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_PERIOD, null, msgs);
			if (newOccurrencePeriod != null)
				msgs = ((InternalEObject)newOccurrencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_PERIOD, null, msgs);
			msgs = basicSetOccurrencePeriod(newOccurrencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_PERIOD, newOccurrencePeriod, newOccurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getOccurrenceString() {
		return occurrenceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceString(org.hl7.fhir.String newOccurrenceString, NotificationChain msgs) {
		org.hl7.fhir.String oldOccurrenceString = occurrenceString;
		occurrenceString = newOccurrenceString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_STRING, oldOccurrenceString, newOccurrenceString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceString(org.hl7.fhir.String newOccurrenceString) {
		if (newOccurrenceString != occurrenceString) {
			NotificationChain msgs = null;
			if (occurrenceString != null)
				msgs = ((InternalEObject)occurrenceString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_STRING, null, msgs);
			if (newOccurrenceString != null)
				msgs = ((InternalEObject)newOccurrenceString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_STRING, null, msgs);
			msgs = basicSetOccurrenceString(newOccurrenceString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_STRING, newOccurrenceString, newOccurrenceString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age getOccurrenceAge() {
		return occurrenceAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceAge(Age newOccurrenceAge, NotificationChain msgs) {
		Age oldOccurrenceAge = occurrenceAge;
		occurrenceAge = newOccurrenceAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_AGE, oldOccurrenceAge, newOccurrenceAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceAge(Age newOccurrenceAge) {
		if (newOccurrenceAge != occurrenceAge) {
			NotificationChain msgs = null;
			if (occurrenceAge != null)
				msgs = ((InternalEObject)occurrenceAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_AGE, null, msgs);
			if (newOccurrenceAge != null)
				msgs = ((InternalEObject)newOccurrenceAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_AGE, null, msgs);
			msgs = basicSetOccurrenceAge(newOccurrenceAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_AGE, newOccurrenceAge, newOccurrenceAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getOccurrenceRange() {
		return occurrenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceRange(Range newOccurrenceRange, NotificationChain msgs) {
		Range oldOccurrenceRange = occurrenceRange;
		occurrenceRange = newOccurrenceRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_RANGE, oldOccurrenceRange, newOccurrenceRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceRange(Range newOccurrenceRange) {
		if (newOccurrenceRange != occurrenceRange) {
			NotificationChain msgs = null;
			if (occurrenceRange != null)
				msgs = ((InternalEObject)occurrenceRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_RANGE, null, msgs);
			if (newOccurrenceRange != null)
				msgs = ((InternalEObject)newOccurrenceRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_RANGE, null, msgs);
			msgs = basicSetOccurrenceRange(newOccurrenceRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_RANGE, newOccurrenceRange, newOccurrenceRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getOccurrenceTiming() {
		return occurrenceTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceTiming(Timing newOccurrenceTiming, NotificationChain msgs) {
		Timing oldOccurrenceTiming = occurrenceTiming;
		occurrenceTiming = newOccurrenceTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_TIMING, oldOccurrenceTiming, newOccurrenceTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceTiming(Timing newOccurrenceTiming) {
		if (newOccurrenceTiming != occurrenceTiming) {
			NotificationChain msgs = null;
			if (occurrenceTiming != null)
				msgs = ((InternalEObject)occurrenceTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_TIMING, null, msgs);
			if (newOccurrenceTiming != null)
				msgs = ((InternalEObject)newOccurrenceTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OCCURRENCE_TIMING, null, msgs);
			msgs = basicSetOccurrenceTiming(newOccurrenceTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OCCURRENCE_TIMING, newOccurrenceTiming, newOccurrenceTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRecorded() {
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorded(DateTime newRecorded, NotificationChain msgs) {
		DateTime oldRecorded = recorded;
		recorded = newRecorded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__RECORDED, oldRecorded, newRecorded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorded(DateTime newRecorded) {
		if (newRecorded != recorded) {
			NotificationChain msgs = null;
			if (recorded != null)
				msgs = ((InternalEObject)recorded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__RECORDED, null, msgs);
			if (newRecorded != null)
				msgs = ((InternalEObject)newRecorded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__RECORDED, null, msgs);
			msgs = basicSetRecorded(newRecorded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__RECORDED, newRecorded, newRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRecorder() {
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorder(Reference newRecorder, NotificationChain msgs) {
		Reference oldRecorder = recorder;
		recorder = newRecorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__RECORDER, oldRecorder, newRecorder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorder(Reference newRecorder) {
		if (newRecorder != recorder) {
			NotificationChain msgs = null;
			if (recorder != null)
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__RECORDER, newRecorder, newRecorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getReportedBoolean() {
		return reportedBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportedBoolean(org.hl7.fhir.Boolean newReportedBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldReportedBoolean = reportedBoolean;
		reportedBoolean = newReportedBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REPORTED_BOOLEAN, oldReportedBoolean, newReportedBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportedBoolean(org.hl7.fhir.Boolean newReportedBoolean) {
		if (newReportedBoolean != reportedBoolean) {
			NotificationChain msgs = null;
			if (reportedBoolean != null)
				msgs = ((InternalEObject)reportedBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REPORTED_BOOLEAN, null, msgs);
			if (newReportedBoolean != null)
				msgs = ((InternalEObject)newReportedBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REPORTED_BOOLEAN, null, msgs);
			msgs = basicSetReportedBoolean(newReportedBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REPORTED_BOOLEAN, newReportedBoolean, newReportedBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReportedReference() {
		return reportedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportedReference(Reference newReportedReference, NotificationChain msgs) {
		Reference oldReportedReference = reportedReference;
		reportedReference = newReportedReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REPORTED_REFERENCE, oldReportedReference, newReportedReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportedReference(Reference newReportedReference) {
		if (newReportedReference != reportedReference) {
			NotificationChain msgs = null;
			if (reportedReference != null)
				msgs = ((InternalEObject)reportedReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REPORTED_REFERENCE, null, msgs);
			if (newReportedReference != null)
				msgs = ((InternalEObject)newReportedReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REPORTED_REFERENCE, null, msgs);
			msgs = basicSetReportedReference(newReportedReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REPORTED_REFERENCE, newReportedReference, newReportedReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedurePerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<ProcedurePerformer>(ProcedurePerformer.class, this, FhirPackage.PROCEDURE__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.PROCEDURE__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__BODY_SITE);
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(CodeableConcept newOutcome, NotificationChain msgs) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReport() {
		if (report == null) {
			report = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__REPORT);
		}
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getComplication() {
		if (complication == null) {
			complication = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.PROCEDURE__COMPLICATION);
		}
		return complication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFollowUp() {
		if (followUp == null) {
			followUp = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__FOLLOW_UP);
		}
		return followUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.PROCEDURE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureFocalDevice> getFocalDevice() {
		if (focalDevice == null) {
			focalDevice = new EObjectContainmentEList<ProcedureFocalDevice>(ProcedureFocalDevice.class, this, FhirPackage.PROCEDURE__FOCAL_DEVICE);
		}
		return focalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getUsed() {
		if (used == null) {
			used = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.PROCEDURE__USED);
		}
		return used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonical()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUri()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PROCEDURE__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FhirPackage.PROCEDURE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.PROCEDURE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.PROCEDURE__FOCUS:
				return basicSetFocus(null, msgs);
			case FhirPackage.PROCEDURE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.PROCEDURE__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.PROCEDURE__OCCURRENCE_PERIOD:
				return basicSetOccurrencePeriod(null, msgs);
			case FhirPackage.PROCEDURE__OCCURRENCE_STRING:
				return basicSetOccurrenceString(null, msgs);
			case FhirPackage.PROCEDURE__OCCURRENCE_AGE:
				return basicSetOccurrenceAge(null, msgs);
			case FhirPackage.PROCEDURE__OCCURRENCE_RANGE:
				return basicSetOccurrenceRange(null, msgs);
			case FhirPackage.PROCEDURE__OCCURRENCE_TIMING:
				return basicSetOccurrenceTiming(null, msgs);
			case FhirPackage.PROCEDURE__RECORDED:
				return basicSetRecorded(null, msgs);
			case FhirPackage.PROCEDURE__RECORDER:
				return basicSetRecorder(null, msgs);
			case FhirPackage.PROCEDURE__REPORTED_BOOLEAN:
				return basicSetReportedBoolean(null, msgs);
			case FhirPackage.PROCEDURE__REPORTED_REFERENCE:
				return basicSetReportedReference(null, msgs);
			case FhirPackage.PROCEDURE__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.PROCEDURE__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.PROCEDURE__REPORT:
				return ((InternalEList<?>)getReport()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__COMPLICATION:
				return ((InternalEList<?>)getComplication()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return ((InternalEList<?>)getFollowUp()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				return ((InternalEList<?>)getFocalDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__USED:
				return ((InternalEList<?>)getUsed()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FhirPackage.PROCEDURE__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FhirPackage.PROCEDURE__BASED_ON:
				return getBasedOn();
			case FhirPackage.PROCEDURE__PART_OF:
				return getPartOf();
			case FhirPackage.PROCEDURE__STATUS:
				return getStatus();
			case FhirPackage.PROCEDURE__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.PROCEDURE__CATEGORY:
				return getCategory();
			case FhirPackage.PROCEDURE__CODE:
				return getCode();
			case FhirPackage.PROCEDURE__SUBJECT:
				return getSubject();
			case FhirPackage.PROCEDURE__FOCUS:
				return getFocus();
			case FhirPackage.PROCEDURE__ENCOUNTER:
				return getEncounter();
			case FhirPackage.PROCEDURE__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.PROCEDURE__OCCURRENCE_PERIOD:
				return getOccurrencePeriod();
			case FhirPackage.PROCEDURE__OCCURRENCE_STRING:
				return getOccurrenceString();
			case FhirPackage.PROCEDURE__OCCURRENCE_AGE:
				return getOccurrenceAge();
			case FhirPackage.PROCEDURE__OCCURRENCE_RANGE:
				return getOccurrenceRange();
			case FhirPackage.PROCEDURE__OCCURRENCE_TIMING:
				return getOccurrenceTiming();
			case FhirPackage.PROCEDURE__RECORDED:
				return getRecorded();
			case FhirPackage.PROCEDURE__RECORDER:
				return getRecorder();
			case FhirPackage.PROCEDURE__REPORTED_BOOLEAN:
				return getReportedBoolean();
			case FhirPackage.PROCEDURE__REPORTED_REFERENCE:
				return getReportedReference();
			case FhirPackage.PROCEDURE__PERFORMER:
				return getPerformer();
			case FhirPackage.PROCEDURE__LOCATION:
				return getLocation();
			case FhirPackage.PROCEDURE__REASON:
				return getReason();
			case FhirPackage.PROCEDURE__BODY_SITE:
				return getBodySite();
			case FhirPackage.PROCEDURE__OUTCOME:
				return getOutcome();
			case FhirPackage.PROCEDURE__REPORT:
				return getReport();
			case FhirPackage.PROCEDURE__COMPLICATION:
				return getComplication();
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return getFollowUp();
			case FhirPackage.PROCEDURE__NOTE:
				return getNote();
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				return getFocalDevice();
			case FhirPackage.PROCEDURE__USED:
				return getUsed();
			case FhirPackage.PROCEDURE__SUPPORTING_INFO:
				return getSupportingInfo();
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				getInstantiatesCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.PROCEDURE__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				getInstantiatesUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.PROCEDURE__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__STATUS:
				setStatus((EventStatus)newValue);
				return;
			case FhirPackage.PROCEDURE__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__FOCUS:
				setFocus((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)newValue);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_STRING:
				setOccurrenceString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_AGE:
				setOccurrenceAge((Age)newValue);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_RANGE:
				setOccurrenceRange((Range)newValue);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)newValue);
				return;
			case FhirPackage.PROCEDURE__RECORDED:
				setRecorded((DateTime)newValue);
				return;
			case FhirPackage.PROCEDURE__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__REPORTED_BOOLEAN:
				setReportedBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PROCEDURE__REPORTED_REFERENCE:
				setReportedReference((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends ProcedurePerformer>)newValue);
				return;
			case FhirPackage.PROCEDURE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.PROCEDURE__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__REPORT:
				getReport().clear();
				getReport().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__COMPLICATION:
				getComplication().clear();
				getComplication().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				getFollowUp().clear();
				getFollowUp().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevice().clear();
				getFocalDevice().addAll((Collection<? extends ProcedureFocalDevice>)newValue);
				return;
			case FhirPackage.PROCEDURE__USED:
				getUsed().clear();
				getUsed().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.PROCEDURE__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				return;
			case FhirPackage.PROCEDURE__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				return;
			case FhirPackage.PROCEDURE__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.PROCEDURE__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.PROCEDURE__STATUS:
				setStatus((EventStatus)null);
				return;
			case FhirPackage.PROCEDURE__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.PROCEDURE__FOCUS:
				setFocus((Reference)null);
				return;
			case FhirPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)null);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_STRING:
				setOccurrenceString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_AGE:
				setOccurrenceAge((Age)null);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_RANGE:
				setOccurrenceRange((Range)null);
				return;
			case FhirPackage.PROCEDURE__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)null);
				return;
			case FhirPackage.PROCEDURE__RECORDED:
				setRecorded((DateTime)null);
				return;
			case FhirPackage.PROCEDURE__RECORDER:
				setRecorder((Reference)null);
				return;
			case FhirPackage.PROCEDURE__REPORTED_BOOLEAN:
				setReportedBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PROCEDURE__REPORTED_REFERENCE:
				setReportedReference((Reference)null);
				return;
			case FhirPackage.PROCEDURE__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.PROCEDURE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.PROCEDURE__REASON:
				getReason().clear();
				return;
			case FhirPackage.PROCEDURE__BODY_SITE:
				getBodySite().clear();
				return;
			case FhirPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__REPORT:
				getReport().clear();
				return;
			case FhirPackage.PROCEDURE__COMPLICATION:
				getComplication().clear();
				return;
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				getFollowUp().clear();
				return;
			case FhirPackage.PROCEDURE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevice().clear();
				return;
			case FhirPackage.PROCEDURE__USED:
				getUsed().clear();
				return;
			case FhirPackage.PROCEDURE__SUPPORTING_INFO:
				getSupportingInfo().clear();
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null && !instantiatesCanonical.isEmpty();
			case FhirPackage.PROCEDURE__INSTANTIATES_URI:
				return instantiatesUri != null && !instantiatesUri.isEmpty();
			case FhirPackage.PROCEDURE__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.PROCEDURE__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.PROCEDURE__STATUS:
				return status != null;
			case FhirPackage.PROCEDURE__STATUS_REASON:
				return statusReason != null;
			case FhirPackage.PROCEDURE__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.PROCEDURE__CODE:
				return code != null;
			case FhirPackage.PROCEDURE__SUBJECT:
				return subject != null;
			case FhirPackage.PROCEDURE__FOCUS:
				return focus != null;
			case FhirPackage.PROCEDURE__ENCOUNTER:
				return encounter != null;
			case FhirPackage.PROCEDURE__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.PROCEDURE__OCCURRENCE_PERIOD:
				return occurrencePeriod != null;
			case FhirPackage.PROCEDURE__OCCURRENCE_STRING:
				return occurrenceString != null;
			case FhirPackage.PROCEDURE__OCCURRENCE_AGE:
				return occurrenceAge != null;
			case FhirPackage.PROCEDURE__OCCURRENCE_RANGE:
				return occurrenceRange != null;
			case FhirPackage.PROCEDURE__OCCURRENCE_TIMING:
				return occurrenceTiming != null;
			case FhirPackage.PROCEDURE__RECORDED:
				return recorded != null;
			case FhirPackage.PROCEDURE__RECORDER:
				return recorder != null;
			case FhirPackage.PROCEDURE__REPORTED_BOOLEAN:
				return reportedBoolean != null;
			case FhirPackage.PROCEDURE__REPORTED_REFERENCE:
				return reportedReference != null;
			case FhirPackage.PROCEDURE__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.PROCEDURE__LOCATION:
				return location != null;
			case FhirPackage.PROCEDURE__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.PROCEDURE__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FhirPackage.PROCEDURE__OUTCOME:
				return outcome != null;
			case FhirPackage.PROCEDURE__REPORT:
				return report != null && !report.isEmpty();
			case FhirPackage.PROCEDURE__COMPLICATION:
				return complication != null && !complication.isEmpty();
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return followUp != null && !followUp.isEmpty();
			case FhirPackage.PROCEDURE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				return focalDevice != null && !focalDevice.isEmpty();
			case FhirPackage.PROCEDURE__USED:
				return used != null && !used.isEmpty();
			case FhirPackage.PROCEDURE__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcedureImpl
