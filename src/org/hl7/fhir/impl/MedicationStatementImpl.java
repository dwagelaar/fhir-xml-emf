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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Dosage;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementAdherence;
import org.hl7.fhir.MedicationStatementStatusCodes;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getEffectiveTiming <em>Effective Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getRelatedClinicalInformation <em>Related Clinical Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getRenderedDosageInstruction <em>Rendered Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getAdherence <em>Adherence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationStatementImpl extends DomainResourceImpl implements MedicationStatement {
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
	protected MedicationStatementStatusCodes status;

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
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference medication;

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
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveDateTime;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getEffectiveTiming() <em>Effective Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing effectiveTiming;

	/**
	 * The cached value of the '{@link #getDateAsserted() <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAsserted()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateAsserted;

	/**
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> informationSource;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> derivedFrom;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getRelatedClinicalInformation() <em>Related Clinical Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedClinicalInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> relatedClinicalInformation;

	/**
	 * The cached value of the '{@link #getRenderedDosageInstruction() <em>Rendered Dosage Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderedDosageInstruction()
	 * @generated
	 * @ordered
	 */
	protected Markdown renderedDosageInstruction;

	/**
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected EList<Dosage> dosage;

	/**
	 * The cached value of the '{@link #getAdherence() <em>Adherence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdherence()
	 * @generated
	 * @ordered
	 */
	protected MedicationStatementAdherence adherence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_STATEMENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_STATEMENT__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationStatementStatusCodes newStatus, NotificationChain msgs) {
		MedicationStatementStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationStatementStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_STATEMENT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getMedication() {
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedication(CodeableReference newMedication, NotificationChain msgs) {
		CodeableReference oldMedication = medication;
		medication = newMedication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__MEDICATION, oldMedication, newMedication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedication(CodeableReference newMedication) {
		if (newMedication != medication) {
			NotificationChain msgs = null;
			if (medication != null)
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__MEDICATION, newMedication, newMedication));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDateTime(DateTime newEffectiveDateTime, NotificationChain msgs) {
		DateTime oldEffectiveDateTime = effectiveDateTime;
		effectiveDateTime = newEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDateTime(DateTime newEffectiveDateTime) {
		if (newEffectiveDateTime != effectiveDateTime) {
			NotificationChain msgs = null;
			if (effectiveDateTime != null)
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getEffectiveTiming() {
		return effectiveTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveTiming(Timing newEffectiveTiming, NotificationChain msgs) {
		Timing oldEffectiveTiming = effectiveTiming;
		effectiveTiming = newEffectiveTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_TIMING, oldEffectiveTiming, newEffectiveTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveTiming(Timing newEffectiveTiming) {
		if (newEffectiveTiming != effectiveTiming) {
			NotificationChain msgs = null;
			if (effectiveTiming != null)
				msgs = ((InternalEObject)effectiveTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_TIMING, null, msgs);
			if (newEffectiveTiming != null)
				msgs = ((InternalEObject)newEffectiveTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_TIMING, null, msgs);
			msgs = basicSetEffectiveTiming(newEffectiveTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_TIMING, newEffectiveTiming, newEffectiveTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateAsserted() {
		return dateAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateAsserted(DateTime newDateAsserted, NotificationChain msgs) {
		DateTime oldDateAsserted = dateAsserted;
		dateAsserted = newDateAsserted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, oldDateAsserted, newDateAsserted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAsserted(DateTime newDateAsserted) {
		if (newDateAsserted != dateAsserted) {
			NotificationChain msgs = null;
			if (dateAsserted != null)
				msgs = ((InternalEObject)dateAsserted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, null, msgs);
			if (newDateAsserted != null)
				msgs = ((InternalEObject)newDateAsserted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, null, msgs);
			msgs = basicSetDateAsserted(newDateAsserted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, newDateAsserted, newDateAsserted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getInformationSource() {
		if (informationSource == null) {
			informationSource = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE);
		}
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.MEDICATION_STATEMENT__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_STATEMENT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRelatedClinicalInformation() {
		if (relatedClinicalInformation == null) {
			relatedClinicalInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_STATEMENT__RELATED_CLINICAL_INFORMATION);
		}
		return relatedClinicalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getRenderedDosageInstruction() {
		return renderedDosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenderedDosageInstruction(Markdown newRenderedDosageInstruction, NotificationChain msgs) {
		Markdown oldRenderedDosageInstruction = renderedDosageInstruction;
		renderedDosageInstruction = newRenderedDosageInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__RENDERED_DOSAGE_INSTRUCTION, oldRenderedDosageInstruction, newRenderedDosageInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderedDosageInstruction(Markdown newRenderedDosageInstruction) {
		if (newRenderedDosageInstruction != renderedDosageInstruction) {
			NotificationChain msgs = null;
			if (renderedDosageInstruction != null)
				msgs = ((InternalEObject)renderedDosageInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__RENDERED_DOSAGE_INSTRUCTION, null, msgs);
			if (newRenderedDosageInstruction != null)
				msgs = ((InternalEObject)newRenderedDosageInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__RENDERED_DOSAGE_INSTRUCTION, null, msgs);
			msgs = basicSetRenderedDosageInstruction(newRenderedDosageInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__RENDERED_DOSAGE_INSTRUCTION, newRenderedDosageInstruction, newRenderedDosageInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dosage> getDosage() {
		if (dosage == null) {
			dosage = new EObjectContainmentEList<Dosage>(Dosage.class, this, FhirPackage.MEDICATION_STATEMENT__DOSAGE);
		}
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementAdherence getAdherence() {
		return adherence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdherence(MedicationStatementAdherence newAdherence, NotificationChain msgs) {
		MedicationStatementAdherence oldAdherence = adherence;
		adherence = newAdherence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__ADHERENCE, oldAdherence, newAdherence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdherence(MedicationStatementAdherence newAdherence) {
		if (newAdherence != adherence) {
			NotificationChain msgs = null;
			if (adherence != null)
				msgs = ((InternalEObject)adherence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__ADHERENCE, null, msgs);
			if (newAdherence != null)
				msgs = ((InternalEObject)newAdherence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__ADHERENCE, null, msgs);
			msgs = basicSetAdherence(newAdherence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__ADHERENCE, newAdherence, newAdherence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_TIMING:
				return basicSetEffectiveTiming(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return basicSetDateAsserted(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return ((InternalEList<?>)getInformationSource()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__RELATED_CLINICAL_INFORMATION:
				return ((InternalEList<?>)getRelatedClinicalInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__RENDERED_DOSAGE_INSTRUCTION:
				return basicSetRenderedDosageInstruction(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				return ((InternalEList<?>)getDosage()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__ADHERENCE:
				return basicSetAdherence(null, msgs);
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				return getPartOf();
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				return getCategory();
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				return getMedication();
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				return getSubject();
			case FhirPackage.MEDICATION_STATEMENT__ENCOUNTER:
				return getEncounter();
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_TIMING:
				return getEffectiveTiming();
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return getDateAsserted();
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return getInformationSource();
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return getDerivedFrom();
			case FhirPackage.MEDICATION_STATEMENT__REASON:
				return getReason();
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_STATEMENT__RELATED_CLINICAL_INFORMATION:
				return getRelatedClinicalInformation();
			case FhirPackage.MEDICATION_STATEMENT__RENDERED_DOSAGE_INSTRUCTION:
				return getRenderedDosageInstruction();
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				return getDosage();
			case FhirPackage.MEDICATION_STATEMENT__ADHERENCE:
				return getAdherence();
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((MedicationStatementStatusCodes)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				setMedication((CodeableReference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_TIMING:
				setEffectiveTiming((Timing)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				getInformationSource().clear();
				getInformationSource().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__RELATED_CLINICAL_INFORMATION:
				getRelatedClinicalInformation().clear();
				getRelatedClinicalInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__RENDERED_DOSAGE_INSTRUCTION:
				setRenderedDosageInstruction((Markdown)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosage().clear();
				getDosage().addAll((Collection<? extends Dosage>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__ADHERENCE:
				setAdherence((MedicationStatementAdherence)newValue);
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((MedicationStatementStatusCodes)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				setMedication((CodeableReference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_TIMING:
				setEffectiveTiming((Timing)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				getInformationSource().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON:
				getReason().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				getNote().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__RELATED_CLINICAL_INFORMATION:
				getRelatedClinicalInformation().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__RENDERED_DOSAGE_INSTRUCTION:
				setRenderedDosageInstruction((Markdown)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosage().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__ADHERENCE:
				setAdherence((MedicationStatementAdherence)null);
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				return medication != null;
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				return subject != null;
			case FhirPackage.MEDICATION_STATEMENT__ENCOUNTER:
				return encounter != null;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_TIMING:
				return effectiveTiming != null;
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return dateAsserted != null;
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return informationSource != null && !informationSource.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__RELATED_CLINICAL_INFORMATION:
				return relatedClinicalInformation != null && !relatedClinicalInformation.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__RENDERED_DOSAGE_INSTRUCTION:
				return renderedDosageInstruction != null;
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				return dosage != null && !dosage.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__ADHERENCE:
				return adherence != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationStatementImpl
