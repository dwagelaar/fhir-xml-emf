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

import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventSeverity;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getOccurredPeriod <em>Occurred Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getOccurredDateTime <em>Occurred Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventImpl extends DomainResourceImpl implements AuditEvent {
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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected AuditEventAction action;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected AuditEventSeverity severity;

	/**
	 * The cached value of the '{@link #getOccurredPeriod() <em>Occurred Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurredPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurredPeriod;

	/**
	 * The cached value of the '{@link #getOccurredDateTime() <em>Occurred Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurredDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurredDateTime;

	/**
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected Instant recorded;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected AuditEventOutcome outcome;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> authorization;

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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

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
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventAgent> agent;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AuditEventSource source;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventEntity> entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAuditEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.AUDIT_EVENT__CATEGORY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(AuditEventAction newAction, NotificationChain msgs) {
		AuditEventAction oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(AuditEventAction newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(AuditEventSeverity newSeverity, NotificationChain msgs) {
		AuditEventSeverity oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(AuditEventSeverity newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getOccurredPeriod() {
		return occurredPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurredPeriod(Period newOccurredPeriod, NotificationChain msgs) {
		Period oldOccurredPeriod = occurredPeriod;
		occurredPeriod = newOccurredPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__OCCURRED_PERIOD, oldOccurredPeriod, newOccurredPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurredPeriod(Period newOccurredPeriod) {
		if (newOccurredPeriod != occurredPeriod) {
			NotificationChain msgs = null;
			if (occurredPeriod != null)
				msgs = ((InternalEObject)occurredPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__OCCURRED_PERIOD, null, msgs);
			if (newOccurredPeriod != null)
				msgs = ((InternalEObject)newOccurredPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__OCCURRED_PERIOD, null, msgs);
			msgs = basicSetOccurredPeriod(newOccurredPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__OCCURRED_PERIOD, newOccurredPeriod, newOccurredPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOccurredDateTime() {
		return occurredDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurredDateTime(DateTime newOccurredDateTime, NotificationChain msgs) {
		DateTime oldOccurredDateTime = occurredDateTime;
		occurredDateTime = newOccurredDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__OCCURRED_DATE_TIME, oldOccurredDateTime, newOccurredDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurredDateTime(DateTime newOccurredDateTime) {
		if (newOccurredDateTime != occurredDateTime) {
			NotificationChain msgs = null;
			if (occurredDateTime != null)
				msgs = ((InternalEObject)occurredDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__OCCURRED_DATE_TIME, null, msgs);
			if (newOccurredDateTime != null)
				msgs = ((InternalEObject)newOccurredDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__OCCURRED_DATE_TIME, null, msgs);
			msgs = basicSetOccurredDateTime(newOccurredDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__OCCURRED_DATE_TIME, newOccurredDateTime, newOccurredDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getRecorded() {
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorded(Instant newRecorded, NotificationChain msgs) {
		Instant oldRecorded = recorded;
		recorded = newRecorded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__RECORDED, oldRecorded, newRecorded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorded(Instant newRecorded) {
		if (newRecorded != recorded) {
			NotificationChain msgs = null;
			if (recorded != null)
				msgs = ((InternalEObject)recorded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__RECORDED, null, msgs);
			if (newRecorded != null)
				msgs = ((InternalEObject)newRecorded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__RECORDED, null, msgs);
			msgs = basicSetRecorded(newRecorded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__RECORDED, newRecorded, newRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcome getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(AuditEventOutcome newOutcome, NotificationChain msgs) {
		AuditEventOutcome oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(AuditEventOutcome newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAuthorization() {
		if (authorization == null) {
			authorization = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.AUDIT_EVENT__AUTHORIZATION);
		}
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.AUDIT_EVENT__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventAgent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<AuditEventAgent>(AuditEventAgent.class, this, FhirPackage.AUDIT_EVENT__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AuditEventSource newSource, NotificationChain msgs) {
		AuditEventSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AuditEventSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventEntity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<AuditEventEntity>(AuditEventEntity.class, this, FhirPackage.AUDIT_EVENT__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.AUDIT_EVENT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.AUDIT_EVENT__ACTION:
				return basicSetAction(null, msgs);
			case FhirPackage.AUDIT_EVENT__SEVERITY:
				return basicSetSeverity(null, msgs);
			case FhirPackage.AUDIT_EVENT__OCCURRED_PERIOD:
				return basicSetOccurredPeriod(null, msgs);
			case FhirPackage.AUDIT_EVENT__OCCURRED_DATE_TIME:
				return basicSetOccurredDateTime(null, msgs);
			case FhirPackage.AUDIT_EVENT__RECORDED:
				return basicSetRecorded(null, msgs);
			case FhirPackage.AUDIT_EVENT__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.AUDIT_EVENT__AUTHORIZATION:
				return ((InternalEList<?>)getAuthorization()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.AUDIT_EVENT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.AUDIT_EVENT__AGENT:
				return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.AUDIT_EVENT__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.AUDIT_EVENT__CATEGORY:
				return getCategory();
			case FhirPackage.AUDIT_EVENT__CODE:
				return getCode();
			case FhirPackage.AUDIT_EVENT__ACTION:
				return getAction();
			case FhirPackage.AUDIT_EVENT__SEVERITY:
				return getSeverity();
			case FhirPackage.AUDIT_EVENT__OCCURRED_PERIOD:
				return getOccurredPeriod();
			case FhirPackage.AUDIT_EVENT__OCCURRED_DATE_TIME:
				return getOccurredDateTime();
			case FhirPackage.AUDIT_EVENT__RECORDED:
				return getRecorded();
			case FhirPackage.AUDIT_EVENT__OUTCOME:
				return getOutcome();
			case FhirPackage.AUDIT_EVENT__AUTHORIZATION:
				return getAuthorization();
			case FhirPackage.AUDIT_EVENT__BASED_ON:
				return getBasedOn();
			case FhirPackage.AUDIT_EVENT__PATIENT:
				return getPatient();
			case FhirPackage.AUDIT_EVENT__ENCOUNTER:
				return getEncounter();
			case FhirPackage.AUDIT_EVENT__AGENT:
				return getAgent();
			case FhirPackage.AUDIT_EVENT__SOURCE:
				return getSource();
			case FhirPackage.AUDIT_EVENT__ENTITY:
				return getEntity();
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
			case FhirPackage.AUDIT_EVENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__ACTION:
				setAction((AuditEventAction)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__SEVERITY:
				setSeverity((AuditEventSeverity)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__OCCURRED_PERIOD:
				setOccurredPeriod((Period)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__OCCURRED_DATE_TIME:
				setOccurredDateTime((DateTime)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__RECORDED:
				setRecorded((Instant)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__OUTCOME:
				setOutcome((AuditEventOutcome)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__AUTHORIZATION:
				getAuthorization().clear();
				getAuthorization().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__AGENT:
				getAgent().clear();
				getAgent().addAll((Collection<? extends AuditEventAgent>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends AuditEventEntity>)newValue);
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
			case FhirPackage.AUDIT_EVENT__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.AUDIT_EVENT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.AUDIT_EVENT__ACTION:
				setAction((AuditEventAction)null);
				return;
			case FhirPackage.AUDIT_EVENT__SEVERITY:
				setSeverity((AuditEventSeverity)null);
				return;
			case FhirPackage.AUDIT_EVENT__OCCURRED_PERIOD:
				setOccurredPeriod((Period)null);
				return;
			case FhirPackage.AUDIT_EVENT__OCCURRED_DATE_TIME:
				setOccurredDateTime((DateTime)null);
				return;
			case FhirPackage.AUDIT_EVENT__RECORDED:
				setRecorded((Instant)null);
				return;
			case FhirPackage.AUDIT_EVENT__OUTCOME:
				setOutcome((AuditEventOutcome)null);
				return;
			case FhirPackage.AUDIT_EVENT__AUTHORIZATION:
				getAuthorization().clear();
				return;
			case FhirPackage.AUDIT_EVENT__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.AUDIT_EVENT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT__AGENT:
				getAgent().clear();
				return;
			case FhirPackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)null);
				return;
			case FhirPackage.AUDIT_EVENT__ENTITY:
				getEntity().clear();
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
			case FhirPackage.AUDIT_EVENT__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.AUDIT_EVENT__CODE:
				return code != null;
			case FhirPackage.AUDIT_EVENT__ACTION:
				return action != null;
			case FhirPackage.AUDIT_EVENT__SEVERITY:
				return severity != null;
			case FhirPackage.AUDIT_EVENT__OCCURRED_PERIOD:
				return occurredPeriod != null;
			case FhirPackage.AUDIT_EVENT__OCCURRED_DATE_TIME:
				return occurredDateTime != null;
			case FhirPackage.AUDIT_EVENT__RECORDED:
				return recorded != null;
			case FhirPackage.AUDIT_EVENT__OUTCOME:
				return outcome != null;
			case FhirPackage.AUDIT_EVENT__AUTHORIZATION:
				return authorization != null && !authorization.isEmpty();
			case FhirPackage.AUDIT_EVENT__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.AUDIT_EVENT__PATIENT:
				return patient != null;
			case FhirPackage.AUDIT_EVENT__ENCOUNTER:
				return encounter != null;
			case FhirPackage.AUDIT_EVENT__AGENT:
				return agent != null && !agent.isEmpty();
			case FhirPackage.AUDIT_EVENT__SOURCE:
				return source != null;
			case FhirPackage.AUDIT_EVENT__ENTITY:
				return entity != null && !entity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventImpl
