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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.EncounterHistory;
import org.hl7.fhir.EncounterHistoryLocation;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getSubjectStatus <em>Subject Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getActualPeriod <em>Actual Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getPlannedStartDate <em>Planned Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getPlannedEndDate <em>Planned End Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHistoryImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterHistoryImpl extends DomainResourceImpl implements EncounterHistory {
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
	protected EncounterStatus status;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept class_;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getSubjectStatus() <em>Subject Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subjectStatus;

	/**
	 * The cached value of the '{@link #getActualPeriod() <em>Actual Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period actualPeriod;

	/**
	 * The cached value of the '{@link #getPlannedStartDate() <em>Planned Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStartDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime plannedStartDate;

	/**
	 * The cached value of the '{@link #getPlannedEndDate() <em>Planned End Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedEndDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime plannedEndDate;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Duration length;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterHistoryLocation> location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEncounterHistory();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ENCOUNTER_HISTORY__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EncounterStatus newStatus, NotificationChain msgs) {
		EncounterStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EncounterStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(CodeableConcept newClass, NotificationChain msgs) {
		CodeableConcept oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(CodeableConcept newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER_HISTORY__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getServiceType() {
		if (serviceType == null) {
			serviceType = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.ENCOUNTER_HISTORY__SERVICE_TYPE);
		}
		return serviceType;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubjectStatus() {
		return subjectStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectStatus(CodeableConcept newSubjectStatus, NotificationChain msgs) {
		CodeableConcept oldSubjectStatus = subjectStatus;
		subjectStatus = newSubjectStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__SUBJECT_STATUS, oldSubjectStatus, newSubjectStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectStatus(CodeableConcept newSubjectStatus) {
		if (newSubjectStatus != subjectStatus) {
			NotificationChain msgs = null;
			if (subjectStatus != null)
				msgs = ((InternalEObject)subjectStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__SUBJECT_STATUS, null, msgs);
			if (newSubjectStatus != null)
				msgs = ((InternalEObject)newSubjectStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__SUBJECT_STATUS, null, msgs);
			msgs = basicSetSubjectStatus(newSubjectStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__SUBJECT_STATUS, newSubjectStatus, newSubjectStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getActualPeriod() {
		return actualPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualPeriod(Period newActualPeriod, NotificationChain msgs) {
		Period oldActualPeriod = actualPeriod;
		actualPeriod = newActualPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__ACTUAL_PERIOD, oldActualPeriod, newActualPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualPeriod(Period newActualPeriod) {
		if (newActualPeriod != actualPeriod) {
			NotificationChain msgs = null;
			if (actualPeriod != null)
				msgs = ((InternalEObject)actualPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__ACTUAL_PERIOD, null, msgs);
			if (newActualPeriod != null)
				msgs = ((InternalEObject)newActualPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__ACTUAL_PERIOD, null, msgs);
			msgs = basicSetActualPeriod(newActualPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__ACTUAL_PERIOD, newActualPeriod, newActualPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPlannedStartDate() {
		return plannedStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedStartDate(DateTime newPlannedStartDate, NotificationChain msgs) {
		DateTime oldPlannedStartDate = plannedStartDate;
		plannedStartDate = newPlannedStartDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__PLANNED_START_DATE, oldPlannedStartDate, newPlannedStartDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedStartDate(DateTime newPlannedStartDate) {
		if (newPlannedStartDate != plannedStartDate) {
			NotificationChain msgs = null;
			if (plannedStartDate != null)
				msgs = ((InternalEObject)plannedStartDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__PLANNED_START_DATE, null, msgs);
			if (newPlannedStartDate != null)
				msgs = ((InternalEObject)newPlannedStartDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__PLANNED_START_DATE, null, msgs);
			msgs = basicSetPlannedStartDate(newPlannedStartDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__PLANNED_START_DATE, newPlannedStartDate, newPlannedStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPlannedEndDate() {
		return plannedEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedEndDate(DateTime newPlannedEndDate, NotificationChain msgs) {
		DateTime oldPlannedEndDate = plannedEndDate;
		plannedEndDate = newPlannedEndDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__PLANNED_END_DATE, oldPlannedEndDate, newPlannedEndDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedEndDate(DateTime newPlannedEndDate) {
		if (newPlannedEndDate != plannedEndDate) {
			NotificationChain msgs = null;
			if (plannedEndDate != null)
				msgs = ((InternalEObject)plannedEndDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__PLANNED_END_DATE, null, msgs);
			if (newPlannedEndDate != null)
				msgs = ((InternalEObject)newPlannedEndDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__PLANNED_END_DATE, null, msgs);
			msgs = basicSetPlannedEndDate(newPlannedEndDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__PLANNED_END_DATE, newPlannedEndDate, newPlannedEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(Duration newLength, NotificationChain msgs) {
		Duration oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Duration newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HISTORY__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HISTORY__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterHistoryLocation> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<EncounterHistoryLocation>(EncounterHistoryLocation.class, this, FhirPackage.ENCOUNTER_HISTORY__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENCOUNTER_HISTORY__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__CLASS:
				return basicSetClass(null, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT_STATUS:
				return basicSetSubjectStatus(null, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__ACTUAL_PERIOD:
				return basicSetActualPeriod(null, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_START_DATE:
				return basicSetPlannedStartDate(null, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_END_DATE:
				return basicSetPlannedEndDate(null, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__LENGTH:
				return basicSetLength(null, msgs);
			case FhirPackage.ENCOUNTER_HISTORY__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ENCOUNTER_HISTORY__ENCOUNTER:
				return getEncounter();
			case FhirPackage.ENCOUNTER_HISTORY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ENCOUNTER_HISTORY__STATUS:
				return getStatus();
			case FhirPackage.ENCOUNTER_HISTORY__CLASS:
				return getClass_();
			case FhirPackage.ENCOUNTER_HISTORY__TYPE:
				return getType();
			case FhirPackage.ENCOUNTER_HISTORY__SERVICE_TYPE:
				return getServiceType();
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT:
				return getSubject();
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT_STATUS:
				return getSubjectStatus();
			case FhirPackage.ENCOUNTER_HISTORY__ACTUAL_PERIOD:
				return getActualPeriod();
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_START_DATE:
				return getPlannedStartDate();
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_END_DATE:
				return getPlannedEndDate();
			case FhirPackage.ENCOUNTER_HISTORY__LENGTH:
				return getLength();
			case FhirPackage.ENCOUNTER_HISTORY__LOCATION:
				return getLocation();
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
			case FhirPackage.ENCOUNTER_HISTORY__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__STATUS:
				setStatus((EncounterStatus)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__CLASS:
				setClass((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__SERVICE_TYPE:
				getServiceType().clear();
				getServiceType().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT_STATUS:
				setSubjectStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__ACTUAL_PERIOD:
				setActualPeriod((Period)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_START_DATE:
				setPlannedStartDate((DateTime)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_END_DATE:
				setPlannedEndDate((DateTime)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__LENGTH:
				setLength((Duration)newValue);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends EncounterHistoryLocation>)newValue);
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
			case FhirPackage.ENCOUNTER_HISTORY__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ENCOUNTER_HISTORY__STATUS:
				setStatus((EncounterStatus)null);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__CLASS:
				setClass((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__TYPE:
				getType().clear();
				return;
			case FhirPackage.ENCOUNTER_HISTORY__SERVICE_TYPE:
				getServiceType().clear();
				return;
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT_STATUS:
				setSubjectStatus((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__ACTUAL_PERIOD:
				setActualPeriod((Period)null);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_START_DATE:
				setPlannedStartDate((DateTime)null);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_END_DATE:
				setPlannedEndDate((DateTime)null);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__LENGTH:
				setLength((Duration)null);
				return;
			case FhirPackage.ENCOUNTER_HISTORY__LOCATION:
				getLocation().clear();
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
			case FhirPackage.ENCOUNTER_HISTORY__ENCOUNTER:
				return encounter != null;
			case FhirPackage.ENCOUNTER_HISTORY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ENCOUNTER_HISTORY__STATUS:
				return status != null;
			case FhirPackage.ENCOUNTER_HISTORY__CLASS:
				return class_ != null;
			case FhirPackage.ENCOUNTER_HISTORY__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.ENCOUNTER_HISTORY__SERVICE_TYPE:
				return serviceType != null && !serviceType.isEmpty();
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT:
				return subject != null;
			case FhirPackage.ENCOUNTER_HISTORY__SUBJECT_STATUS:
				return subjectStatus != null;
			case FhirPackage.ENCOUNTER_HISTORY__ACTUAL_PERIOD:
				return actualPeriod != null;
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_START_DATE:
				return plannedStartDate != null;
			case FhirPackage.ENCOUNTER_HISTORY__PLANNED_END_DATE:
				return plannedEndDate != null;
			case FhirPackage.ENCOUNTER_HISTORY__LENGTH:
				return length != null;
			case FhirPackage.ENCOUNTER_HISTORY__LOCATION:
				return location != null && !location.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EncounterHistoryImpl
