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

import org.hl7.emf.fhir.AdverseEvent;
import org.hl7.emf.fhir.AdverseEventActuality;
import org.hl7.emf.fhir.AdverseEventContributingFactor;
import org.hl7.emf.fhir.AdverseEventMitigatingAction;
import org.hl7.emf.fhir.AdverseEventParticipant;
import org.hl7.emf.fhir.AdverseEventPreventiveAction;
import org.hl7.emf.fhir.AdverseEventStatus;
import org.hl7.emf.fhir.AdverseEventSupportingInfo;
import org.hl7.emf.fhir.AdverseEventSuspectEntity;
import org.hl7.emf.fhir.Annotation;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getActuality <em>Actuality</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getDetected <em>Detected</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getResultingEffect <em>Resulting Effect</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getSeriousness <em>Seriousness</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getStudy <em>Study</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getExpectedInResearchStudy <em>Expected In Research Study</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getSuspectEntity <em>Suspect Entity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getContributingFactor <em>Contributing Factor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getPreventiveAction <em>Preventive Action</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getMitigatingAction <em>Mitigating Action</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdverseEventImpl extends DomainResourceImpl implements AdverseEvent {
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
	protected AdverseEventStatus status;

	/**
	 * The cached value of the '{@link #getActuality() <em>Actuality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuality()
	 * @generated
	 * @ordered
	 */
	protected AdverseEventActuality actuality;

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
	 * The cached value of the '{@link #getOccurrenceTiming() <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing occurrenceTiming;

	/**
	 * The cached value of the '{@link #getDetected() <em>Detected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetected()
	 * @generated
	 * @ordered
	 */
	protected DateTime detected;

	/**
	 * The cached value of the '{@link #getRecordedDate() <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime recordedDate;

	/**
	 * The cached value of the '{@link #getResultingEffect() <em>Resulting Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> resultingEffect;

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
	 * The cached value of the '{@link #getSeriousness() <em>Seriousness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriousness()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept seriousness;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> outcome;

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
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<AdverseEventParticipant> participant;

	/**
	 * The cached value of the '{@link #getStudy() <em>Study</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudy()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> study;

	/**
	 * The cached value of the '{@link #getExpectedInResearchStudy() <em>Expected In Research Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedInResearchStudy()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean expectedInResearchStudy;

	/**
	 * The cached value of the '{@link #getSuspectEntity() <em>Suspect Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspectEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<AdverseEventSuspectEntity> suspectEntity;

	/**
	 * The cached value of the '{@link #getContributingFactor() <em>Contributing Factor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributingFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<AdverseEventContributingFactor> contributingFactor;

	/**
	 * The cached value of the '{@link #getPreventiveAction() <em>Preventive Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreventiveAction()
	 * @generated
	 * @ordered
	 */
	protected EList<AdverseEventPreventiveAction> preventiveAction;

	/**
	 * The cached value of the '{@link #getMitigatingAction() <em>Mitigating Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigatingAction()
	 * @generated
	 * @ordered
	 */
	protected EList<AdverseEventMitigatingAction> mitigatingAction;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<AdverseEventSupportingInfo> supportingInfo;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAdverseEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ADVERSE_EVENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEventStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(AdverseEventStatus newStatus, NotificationChain msgs) {
		AdverseEventStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__STATUS, oldStatus, newStatus);
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
	public void setStatus(AdverseEventStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEventActuality getActuality() {
		return actuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuality(AdverseEventActuality newActuality, NotificationChain msgs) {
		AdverseEventActuality oldActuality = actuality;
		actuality = newActuality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__ACTUALITY, oldActuality, newActuality);
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
	public void setActuality(AdverseEventActuality newActuality) {
		if (newActuality != actuality) {
			NotificationChain msgs = null;
			if (actuality != null)
				msgs = ((InternalEObject)actuality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__ACTUALITY, null, msgs);
			if (newActuality != null)
				msgs = ((InternalEObject)newActuality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__ACTUALITY, null, msgs);
			msgs = basicSetActuality(newActuality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__ACTUALITY, newActuality, newActuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ADVERSE_EVENT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__ENCOUNTER, oldEncounter, newEncounter);
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
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
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
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__OCCURRENCE_PERIOD, oldOccurrencePeriod, newOccurrencePeriod);
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
	public void setOccurrencePeriod(Period newOccurrencePeriod) {
		if (newOccurrencePeriod != occurrencePeriod) {
			NotificationChain msgs = null;
			if (occurrencePeriod != null)
				msgs = ((InternalEObject)occurrencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__OCCURRENCE_PERIOD, null, msgs);
			if (newOccurrencePeriod != null)
				msgs = ((InternalEObject)newOccurrencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__OCCURRENCE_PERIOD, null, msgs);
			msgs = basicSetOccurrencePeriod(newOccurrencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__OCCURRENCE_PERIOD, newOccurrencePeriod, newOccurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__OCCURRENCE_TIMING, oldOccurrenceTiming, newOccurrenceTiming);
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
	public void setOccurrenceTiming(Timing newOccurrenceTiming) {
		if (newOccurrenceTiming != occurrenceTiming) {
			NotificationChain msgs = null;
			if (occurrenceTiming != null)
				msgs = ((InternalEObject)occurrenceTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__OCCURRENCE_TIMING, null, msgs);
			if (newOccurrenceTiming != null)
				msgs = ((InternalEObject)newOccurrenceTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__OCCURRENCE_TIMING, null, msgs);
			msgs = basicSetOccurrenceTiming(newOccurrenceTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__OCCURRENCE_TIMING, newOccurrenceTiming, newOccurrenceTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDetected() {
		return detected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetected(DateTime newDetected, NotificationChain msgs) {
		DateTime oldDetected = detected;
		detected = newDetected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__DETECTED, oldDetected, newDetected);
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
	public void setDetected(DateTime newDetected) {
		if (newDetected != detected) {
			NotificationChain msgs = null;
			if (detected != null)
				msgs = ((InternalEObject)detected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__DETECTED, null, msgs);
			if (newDetected != null)
				msgs = ((InternalEObject)newDetected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__DETECTED, null, msgs);
			msgs = basicSetDetected(newDetected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__DETECTED, newDetected, newDetected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getRecordedDate() {
		return recordedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordedDate(DateTime newRecordedDate, NotificationChain msgs) {
		DateTime oldRecordedDate = recordedDate;
		recordedDate = newRecordedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__RECORDED_DATE, oldRecordedDate, newRecordedDate);
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
	public void setRecordedDate(DateTime newRecordedDate) {
		if (newRecordedDate != recordedDate) {
			NotificationChain msgs = null;
			if (recordedDate != null)
				msgs = ((InternalEObject)recordedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__RECORDED_DATE, null, msgs);
			if (newRecordedDate != null)
				msgs = ((InternalEObject)newRecordedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__RECORDED_DATE, null, msgs);
			msgs = basicSetRecordedDate(newRecordedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__RECORDED_DATE, newRecordedDate, newRecordedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getResultingEffect() {
		if (resultingEffect == null) {
			resultingEffect = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ADVERSE_EVENT__RESULTING_EFFECT);
		}
		return resultingEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSeriousness() {
		return seriousness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriousness(CodeableConcept newSeriousness, NotificationChain msgs) {
		CodeableConcept oldSeriousness = seriousness;
		seriousness = newSeriousness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SERIOUSNESS, oldSeriousness, newSeriousness);
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
	public void setSeriousness(CodeableConcept newSeriousness) {
		if (newSeriousness != seriousness) {
			NotificationChain msgs = null;
			if (seriousness != null)
				msgs = ((InternalEObject)seriousness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SERIOUSNESS, null, msgs);
			if (newSeriousness != null)
				msgs = ((InternalEObject)newSeriousness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SERIOUSNESS, null, msgs);
			msgs = basicSetSeriousness(newSeriousness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SERIOUSNESS, newSeriousness, newSeriousness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getOutcome() {
		if (outcome == null) {
			outcome = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ADVERSE_EVENT__OUTCOME);
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__RECORDER, oldRecorder, newRecorder);
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
	public void setRecorder(Reference newRecorder) {
		if (newRecorder != recorder) {
			NotificationChain msgs = null;
			if (recorder != null)
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__RECORDER, newRecorder, newRecorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdverseEventParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<AdverseEventParticipant>(AdverseEventParticipant.class, this, FhirPackage.ADVERSE_EVENT__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getStudy() {
		if (study == null) {
			study = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ADVERSE_EVENT__STUDY);
		}
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getExpectedInResearchStudy() {
		return expectedInResearchStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedInResearchStudy(org.hl7.emf.fhir.Boolean newExpectedInResearchStudy, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldExpectedInResearchStudy = expectedInResearchStudy;
		expectedInResearchStudy = newExpectedInResearchStudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__EXPECTED_IN_RESEARCH_STUDY, oldExpectedInResearchStudy, newExpectedInResearchStudy);
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
	public void setExpectedInResearchStudy(org.hl7.emf.fhir.Boolean newExpectedInResearchStudy) {
		if (newExpectedInResearchStudy != expectedInResearchStudy) {
			NotificationChain msgs = null;
			if (expectedInResearchStudy != null)
				msgs = ((InternalEObject)expectedInResearchStudy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__EXPECTED_IN_RESEARCH_STUDY, null, msgs);
			if (newExpectedInResearchStudy != null)
				msgs = ((InternalEObject)newExpectedInResearchStudy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__EXPECTED_IN_RESEARCH_STUDY, null, msgs);
			msgs = basicSetExpectedInResearchStudy(newExpectedInResearchStudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__EXPECTED_IN_RESEARCH_STUDY, newExpectedInResearchStudy, newExpectedInResearchStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdverseEventSuspectEntity> getSuspectEntity() {
		if (suspectEntity == null) {
			suspectEntity = new EObjectContainmentEList<AdverseEventSuspectEntity>(AdverseEventSuspectEntity.class, this, FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY);
		}
		return suspectEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdverseEventContributingFactor> getContributingFactor() {
		if (contributingFactor == null) {
			contributingFactor = new EObjectContainmentEList<AdverseEventContributingFactor>(AdverseEventContributingFactor.class, this, FhirPackage.ADVERSE_EVENT__CONTRIBUTING_FACTOR);
		}
		return contributingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdverseEventPreventiveAction> getPreventiveAction() {
		if (preventiveAction == null) {
			preventiveAction = new EObjectContainmentEList<AdverseEventPreventiveAction>(AdverseEventPreventiveAction.class, this, FhirPackage.ADVERSE_EVENT__PREVENTIVE_ACTION);
		}
		return preventiveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdverseEventMitigatingAction> getMitigatingAction() {
		if (mitigatingAction == null) {
			mitigatingAction = new EObjectContainmentEList<AdverseEventMitigatingAction>(AdverseEventMitigatingAction.class, this, FhirPackage.ADVERSE_EVENT__MITIGATING_ACTION);
		}
		return mitigatingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdverseEventSupportingInfo> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<AdverseEventSupportingInfo>(AdverseEventSupportingInfo.class, this, FhirPackage.ADVERSE_EVENT__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.ADVERSE_EVENT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				return basicSetActuality(null, msgs);
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.ADVERSE_EVENT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_PERIOD:
				return basicSetOccurrencePeriod(null, msgs);
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_TIMING:
				return basicSetOccurrenceTiming(null, msgs);
			case FhirPackage.ADVERSE_EVENT__DETECTED:
				return basicSetDetected(null, msgs);
			case FhirPackage.ADVERSE_EVENT__RECORDED_DATE:
				return basicSetRecordedDate(null, msgs);
			case FhirPackage.ADVERSE_EVENT__RESULTING_EFFECT:
				return ((InternalEList<?>)getResultingEffect()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				return basicSetSeriousness(null, msgs);
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				return ((InternalEList<?>)getOutcome()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				return basicSetRecorder(null, msgs);
			case FhirPackage.ADVERSE_EVENT__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__STUDY:
				return ((InternalEList<?>)getStudy()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__EXPECTED_IN_RESEARCH_STUDY:
				return basicSetExpectedInResearchStudy(null, msgs);
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				return ((InternalEList<?>)getSuspectEntity()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__CONTRIBUTING_FACTOR:
				return ((InternalEList<?>)getContributingFactor()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__PREVENTIVE_ACTION:
				return ((InternalEList<?>)getPreventiveAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__MITIGATING_ACTION:
				return ((InternalEList<?>)getMitigatingAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ADVERSE_EVENT__STATUS:
				return getStatus();
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				return getActuality();
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				return getCategory();
			case FhirPackage.ADVERSE_EVENT__CODE:
				return getCode();
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				return getSubject();
			case FhirPackage.ADVERSE_EVENT__ENCOUNTER:
				return getEncounter();
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_PERIOD:
				return getOccurrencePeriod();
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_TIMING:
				return getOccurrenceTiming();
			case FhirPackage.ADVERSE_EVENT__DETECTED:
				return getDetected();
			case FhirPackage.ADVERSE_EVENT__RECORDED_DATE:
				return getRecordedDate();
			case FhirPackage.ADVERSE_EVENT__RESULTING_EFFECT:
				return getResultingEffect();
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				return getLocation();
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				return getSeriousness();
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				return getOutcome();
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				return getRecorder();
			case FhirPackage.ADVERSE_EVENT__PARTICIPANT:
				return getParticipant();
			case FhirPackage.ADVERSE_EVENT__STUDY:
				return getStudy();
			case FhirPackage.ADVERSE_EVENT__EXPECTED_IN_RESEARCH_STUDY:
				return getExpectedInResearchStudy();
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				return getSuspectEntity();
			case FhirPackage.ADVERSE_EVENT__CONTRIBUTING_FACTOR:
				return getContributingFactor();
			case FhirPackage.ADVERSE_EVENT__PREVENTIVE_ACTION:
				return getPreventiveAction();
			case FhirPackage.ADVERSE_EVENT__MITIGATING_ACTION:
				return getMitigatingAction();
			case FhirPackage.ADVERSE_EVENT__SUPPORTING_INFO:
				return getSupportingInfo();
			case FhirPackage.ADVERSE_EVENT__NOTE:
				return getNote();
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
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__STATUS:
				setStatus((AdverseEventStatus)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				setActuality((AdverseEventActuality)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__DETECTED:
				setDetected((DateTime)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__RECORDED_DATE:
				setRecordedDate((DateTime)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__RESULTING_EFFECT:
				getResultingEffect().clear();
				getResultingEffect().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				setSeriousness((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				getOutcome().clear();
				getOutcome().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends AdverseEventParticipant>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__STUDY:
				getStudy().clear();
				getStudy().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__EXPECTED_IN_RESEARCH_STUDY:
				setExpectedInResearchStudy((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				getSuspectEntity().clear();
				getSuspectEntity().addAll((Collection<? extends AdverseEventSuspectEntity>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__CONTRIBUTING_FACTOR:
				getContributingFactor().clear();
				getContributingFactor().addAll((Collection<? extends AdverseEventContributingFactor>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__PREVENTIVE_ACTION:
				getPreventiveAction().clear();
				getPreventiveAction().addAll((Collection<? extends AdverseEventPreventiveAction>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__MITIGATING_ACTION:
				getMitigatingAction().clear();
				getMitigatingAction().addAll((Collection<? extends AdverseEventMitigatingAction>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends AdverseEventSupportingInfo>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__STATUS:
				setStatus((AdverseEventStatus)null);
				return;
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				setActuality((AdverseEventActuality)null);
				return;
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)null);
				return;
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)null);
				return;
			case FhirPackage.ADVERSE_EVENT__DETECTED:
				setDetected((DateTime)null);
				return;
			case FhirPackage.ADVERSE_EVENT__RECORDED_DATE:
				setRecordedDate((DateTime)null);
				return;
			case FhirPackage.ADVERSE_EVENT__RESULTING_EFFECT:
				getResultingEffect().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				setSeriousness((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				getOutcome().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				setRecorder((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__STUDY:
				getStudy().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__EXPECTED_IN_RESEARCH_STUDY:
				setExpectedInResearchStudy((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				getSuspectEntity().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__CONTRIBUTING_FACTOR:
				getContributingFactor().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__PREVENTIVE_ACTION:
				getPreventiveAction().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__MITIGATING_ACTION:
				getMitigatingAction().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__NOTE:
				getNote().clear();
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
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ADVERSE_EVENT__STATUS:
				return status != null;
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				return actuality != null;
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.ADVERSE_EVENT__CODE:
				return code != null;
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				return subject != null;
			case FhirPackage.ADVERSE_EVENT__ENCOUNTER:
				return encounter != null;
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_PERIOD:
				return occurrencePeriod != null;
			case FhirPackage.ADVERSE_EVENT__OCCURRENCE_TIMING:
				return occurrenceTiming != null;
			case FhirPackage.ADVERSE_EVENT__DETECTED:
				return detected != null;
			case FhirPackage.ADVERSE_EVENT__RECORDED_DATE:
				return recordedDate != null;
			case FhirPackage.ADVERSE_EVENT__RESULTING_EFFECT:
				return resultingEffect != null && !resultingEffect.isEmpty();
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				return location != null;
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				return seriousness != null;
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				return outcome != null && !outcome.isEmpty();
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				return recorder != null;
			case FhirPackage.ADVERSE_EVENT__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.ADVERSE_EVENT__STUDY:
				return study != null && !study.isEmpty();
			case FhirPackage.ADVERSE_EVENT__EXPECTED_IN_RESEARCH_STUDY:
				return expectedInResearchStudy != null;
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				return suspectEntity != null && !suspectEntity.isEmpty();
			case FhirPackage.ADVERSE_EVENT__CONTRIBUTING_FACTOR:
				return contributingFactor != null && !contributingFactor.isEmpty();
			case FhirPackage.ADVERSE_EVENT__PREVENTIVE_ACTION:
				return preventiveAction != null && !preventiveAction.isEmpty();
			case FhirPackage.ADVERSE_EVENT__MITIGATING_ACTION:
				return mitigatingAction != null && !mitigatingAction.isEmpty();
			case FhirPackage.ADVERSE_EVENT__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FhirPackage.ADVERSE_EVENT__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdverseEventImpl
