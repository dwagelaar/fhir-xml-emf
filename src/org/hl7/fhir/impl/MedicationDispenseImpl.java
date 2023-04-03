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
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispensePerformer;
import org.hl7.fhir.MedicationDispenseStatusCodes;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getNotPerformedReason <em>Not Performed Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getStatusChanged <em>Status Changed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getAuthorizingPrescription <em>Authorizing Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getDaysSupply <em>Days Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getWhenPrepared <em>When Prepared</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getRenderedDosageInstruction <em>Rendered Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationDispenseImpl extends DomainResourceImpl implements MedicationDispense {
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
	protected MedicationDispenseStatusCodes status;

	/**
	 * The cached value of the '{@link #getNotPerformedReason() <em>Not Performed Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotPerformedReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference notPerformedReason;

	/**
	 * The cached value of the '{@link #getStatusChanged() <em>Status Changed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusChanged()
	 * @generated
	 * @ordered
	 */
	protected DateTime statusChanged;

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
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationDispensePerformer> performer;

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
	 * The cached value of the '{@link #getAuthorizingPrescription() <em>Authorizing Prescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizingPrescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authorizingPrescription;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getDaysSupply() <em>Days Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysSupply()
	 * @generated
	 * @ordered
	 */
	protected Quantity daysSupply;

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
	 * The cached value of the '{@link #getWhenPrepared() <em>When Prepared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPrepared()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenPrepared;

	/**
	 * The cached value of the '{@link #getWhenHandedOver() <em>When Handed Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenHandedOver()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenHandedOver;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Reference destination;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> receiver;

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
	 * The cached value of the '{@link #getRenderedDosageInstruction() <em>Rendered Dosage Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderedDosageInstruction()
	 * @generated
	 * @ordered
	 */
	protected Markdown renderedDosageInstruction;

	/**
	 * The cached value of the '{@link #getDosageInstruction() <em>Dosage Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosageInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Dosage> dosageInstruction;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationDispenseSubstitution substitution;

	/**
	 * The cached value of the '{@link #getEventHistory() <em>Event History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> eventHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationDispense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_DISPENSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__BASED_ON);
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
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationDispenseStatusCodes newStatus, NotificationChain msgs) {
		MedicationDispenseStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationDispenseStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getNotPerformedReason() {
		return notPerformedReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotPerformedReason(CodeableReference newNotPerformedReason, NotificationChain msgs) {
		CodeableReference oldNotPerformedReason = notPerformedReason;
		notPerformedReason = newNotPerformedReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__NOT_PERFORMED_REASON, oldNotPerformedReason, newNotPerformedReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotPerformedReason(CodeableReference newNotPerformedReason) {
		if (newNotPerformedReason != notPerformedReason) {
			NotificationChain msgs = null;
			if (notPerformedReason != null)
				msgs = ((InternalEObject)notPerformedReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__NOT_PERFORMED_REASON, null, msgs);
			if (newNotPerformedReason != null)
				msgs = ((InternalEObject)newNotPerformedReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__NOT_PERFORMED_REASON, null, msgs);
			msgs = basicSetNotPerformedReason(newNotPerformedReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__NOT_PERFORMED_REASON, newNotPerformedReason, newNotPerformedReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStatusChanged() {
		return statusChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusChanged(DateTime newStatusChanged, NotificationChain msgs) {
		DateTime oldStatusChanged = statusChanged;
		statusChanged = newStatusChanged;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__STATUS_CHANGED, oldStatusChanged, newStatusChanged);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusChanged(DateTime newStatusChanged) {
		if (newStatusChanged != statusChanged) {
			NotificationChain msgs = null;
			if (statusChanged != null)
				msgs = ((InternalEObject)statusChanged).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__STATUS_CHANGED, null, msgs);
			if (newStatusChanged != null)
				msgs = ((InternalEObject)newStatusChanged).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__STATUS_CHANGED, null, msgs);
			msgs = basicSetStatusChanged(newStatusChanged, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__STATUS_CHANGED, newStatusChanged, newStatusChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_DISPENSE__CATEGORY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__MEDICATION, oldMedication, newMedication);
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
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__MEDICATION, newMedication, newMedication));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationDispensePerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<MedicationDispensePerformer>(MedicationDispensePerformer.class, this, FhirPackage.MEDICATION_DISPENSE__PERFORMER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthorizingPrescription() {
		if (authorizingPrescription == null) {
			authorizingPrescription = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION);
		}
		return authorizingPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDaysSupply() {
		return daysSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDaysSupply(Quantity newDaysSupply, NotificationChain msgs) {
		Quantity oldDaysSupply = daysSupply;
		daysSupply = newDaysSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, oldDaysSupply, newDaysSupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaysSupply(Quantity newDaysSupply) {
		if (newDaysSupply != daysSupply) {
			NotificationChain msgs = null;
			if (daysSupply != null)
				msgs = ((InternalEObject)daysSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, null, msgs);
			if (newDaysSupply != null)
				msgs = ((InternalEObject)newDaysSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, null, msgs);
			msgs = basicSetDaysSupply(newDaysSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, newDaysSupply, newDaysSupply));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__RECORDED, oldRecorded, newRecorded);
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
				msgs = ((InternalEObject)recorded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__RECORDED, null, msgs);
			if (newRecorded != null)
				msgs = ((InternalEObject)newRecorded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__RECORDED, null, msgs);
			msgs = basicSetRecorded(newRecorded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__RECORDED, newRecorded, newRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenPrepared() {
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenPrepared(DateTime newWhenPrepared, NotificationChain msgs) {
		DateTime oldWhenPrepared = whenPrepared;
		whenPrepared = newWhenPrepared;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED, oldWhenPrepared, newWhenPrepared);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenPrepared(DateTime newWhenPrepared) {
		if (newWhenPrepared != whenPrepared) {
			NotificationChain msgs = null;
			if (whenPrepared != null)
				msgs = ((InternalEObject)whenPrepared).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED, null, msgs);
			if (newWhenPrepared != null)
				msgs = ((InternalEObject)newWhenPrepared).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED, null, msgs);
			msgs = basicSetWhenPrepared(newWhenPrepared, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED, newWhenPrepared, newWhenPrepared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenHandedOver() {
		return whenHandedOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenHandedOver(DateTime newWhenHandedOver, NotificationChain msgs) {
		DateTime oldWhenHandedOver = whenHandedOver;
		whenHandedOver = newWhenHandedOver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, oldWhenHandedOver, newWhenHandedOver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenHandedOver(DateTime newWhenHandedOver) {
		if (newWhenHandedOver != whenHandedOver) {
			NotificationChain msgs = null;
			if (whenHandedOver != null)
				msgs = ((InternalEObject)whenHandedOver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			if (newWhenHandedOver != null)
				msgs = ((InternalEObject)newWhenHandedOver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			msgs = basicSetWhenHandedOver(newWhenHandedOver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, newWhenHandedOver, newWhenHandedOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Reference newDestination, NotificationChain msgs) {
		Reference oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Reference newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReceiver() {
		if (receiver == null) {
			receiver = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__RECEIVER);
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_DISPENSE__NOTE);
		}
		return note;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__RENDERED_DOSAGE_INSTRUCTION, oldRenderedDosageInstruction, newRenderedDosageInstruction);
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
				msgs = ((InternalEObject)renderedDosageInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__RENDERED_DOSAGE_INSTRUCTION, null, msgs);
			if (newRenderedDosageInstruction != null)
				msgs = ((InternalEObject)newRenderedDosageInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__RENDERED_DOSAGE_INSTRUCTION, null, msgs);
			msgs = basicSetRenderedDosageInstruction(newRenderedDosageInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__RENDERED_DOSAGE_INSTRUCTION, newRenderedDosageInstruction, newRenderedDosageInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dosage> getDosageInstruction() {
		if (dosageInstruction == null) {
			dosageInstruction = new EObjectContainmentEList<Dosage>(Dosage.class, this, FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION);
		}
		return dosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationDispenseSubstitution newSubstitution, NotificationChain msgs) {
		MedicationDispenseSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationDispenseSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEventHistory() {
		if (eventHistory == null) {
			eventHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY);
		}
		return eventHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__NOT_PERFORMED_REASON:
				return basicSetNotPerformedReason(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__STATUS_CHANGED:
				return basicSetStatusChanged(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return ((InternalEList<?>)getAuthorizingPrescription()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return basicSetDaysSupply(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__RECORDED:
				return basicSetRecorded(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return basicSetWhenPrepared(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return basicSetWhenHandedOver(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				return basicSetDestination(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				return ((InternalEList<?>)getReceiver()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__RENDERED_DOSAGE_INSTRUCTION:
				return basicSetRenderedDosageInstruction(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstruction()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				return ((InternalEList<?>)getEventHistory()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_DISPENSE__BASED_ON:
				return getBasedOn();
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				return getPartOf();
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_DISPENSE__NOT_PERFORMED_REASON:
				return getNotPerformedReason();
			case FhirPackage.MEDICATION_DISPENSE__STATUS_CHANGED:
				return getStatusChanged();
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				return getCategory();
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION:
				return getMedication();
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				return getSubject();
			case FhirPackage.MEDICATION_DISPENSE__ENCOUNTER:
				return getEncounter();
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				return getPerformer();
			case FhirPackage.MEDICATION_DISPENSE__LOCATION:
				return getLocation();
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return getAuthorizingPrescription();
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				return getType();
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				return getQuantity();
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return getDaysSupply();
			case FhirPackage.MEDICATION_DISPENSE__RECORDED:
				return getRecorded();
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return getWhenPrepared();
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return getWhenHandedOver();
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				return getDestination();
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				return getReceiver();
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_DISPENSE__RENDERED_DOSAGE_INSTRUCTION:
				return getRenderedDosageInstruction();
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return getDosageInstruction();
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return getSubstitution();
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				return getEventHistory();
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
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				setStatus((MedicationDispenseStatusCodes)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOT_PERFORMED_REASON:
				setNotPerformedReason((CodeableReference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__STATUS_CHANGED:
				setStatusChanged((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION:
				setMedication((CodeableReference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends MedicationDispensePerformer>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescription().clear();
				getAuthorizingPrescription().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__RECORDED:
				setRecorded((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				getReceiver().clear();
				getReceiver().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__RENDERED_DOSAGE_INSTRUCTION:
				setRenderedDosageInstruction((Markdown)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				getDosageInstruction().addAll((Collection<? extends Dosage>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				getEventHistory().clear();
				getEventHistory().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				setStatus((MedicationDispenseStatusCodes)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOT_PERFORMED_REASON:
				setNotPerformedReason((CodeableReference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__STATUS_CHANGED:
				setStatusChanged((DateTime)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION:
				setMedication((CodeableReference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescription().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((Quantity)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__RECORDED:
				setRecorded((DateTime)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Reference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				getReceiver().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__RENDERED_DOSAGE_INSTRUCTION:
				setRenderedDosageInstruction((Markdown)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				getEventHistory().clear();
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
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_DISPENSE__NOT_PERFORMED_REASON:
				return notPerformedReason != null;
			case FhirPackage.MEDICATION_DISPENSE__STATUS_CHANGED:
				return statusChanged != null;
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION:
				return medication != null;
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				return subject != null;
			case FhirPackage.MEDICATION_DISPENSE__ENCOUNTER:
				return encounter != null;
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__LOCATION:
				return location != null;
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return authorizingPrescription != null && !authorizingPrescription.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				return type != null;
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				return quantity != null;
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return daysSupply != null;
			case FhirPackage.MEDICATION_DISPENSE__RECORDED:
				return recorded != null;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return whenPrepared != null;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return whenHandedOver != null;
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				return destination != null;
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				return receiver != null && !receiver.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__RENDERED_DOSAGE_INSTRUCTION:
				return renderedDosageInstruction != null;
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return dosageInstruction != null && !dosageInstruction.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return substitution != null;
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				return eventHistory != null && !eventHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationDispenseImpl
