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
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.Dosage;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.MedicationRequest;
import org.hl7.emf.fhir.MedicationRequestDispenseRequest;
import org.hl7.emf.fhir.MedicationRequestIntent;
import org.hl7.emf.fhir.MedicationRequestSubstitution;
import org.hl7.emf.fhir.MedicationrequestStatus;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.RequestPriority;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getPriorPrescription <em>Prior Prescription</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getStatusChanged <em>Status Changed</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getReported <em>Reported</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getCourseOfTherapyType <em>Course Of Therapy Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getRenderedDosageInstruction <em>Rendered Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getEffectiveDosePeriod <em>Effective Dose Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getDispenseRequest <em>Dispense Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationRequestImpl#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationRequestImpl extends DomainResourceImpl implements MedicationRequest {
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
	 * The cached value of the '{@link #getPriorPrescription() <em>Prior Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference priorPrescription;

	/**
	 * The cached value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier groupIdentifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationrequestStatus status;

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
	 * The cached value of the '{@link #getStatusChanged() <em>Status Changed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusChanged()
	 * @generated
	 * @ordered
	 */
	protected DateTime statusChanged;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequestIntent intent;

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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected RequestPriority priority;

	/**
	 * The cached value of the '{@link #getDoNotPerform() <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoNotPerform()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean doNotPerform;

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
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> informationSource;

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
	 * The cached value of the '{@link #getAuthoredOn() <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime authoredOn;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Reference requester;

	/**
	 * The cached value of the '{@link #getReported() <em>Reported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReported()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean reported;

	/**
	 * The cached value of the '{@link #getPerformerType() <em>Performer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept performerType;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performer;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> device;

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
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> reason;

	/**
	 * The cached value of the '{@link #getCourseOfTherapyType() <em>Course Of Therapy Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseOfTherapyType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept courseOfTherapyType;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> insurance;

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
	 * The cached value of the '{@link #getEffectiveDosePeriod() <em>Effective Dose Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDosePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectiveDosePeriod;

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
	 * The cached value of the '{@link #getDispenseRequest() <em>Dispense Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenseRequest()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequestDispenseRequest dispenseRequest;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequestSubstitution substitution;

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
	protected MedicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPriorPrescription() {
		return priorPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorPrescription(Reference newPriorPrescription, NotificationChain msgs) {
		Reference oldPriorPrescription = priorPrescription;
		priorPrescription = newPriorPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, oldPriorPrescription, newPriorPrescription);
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
	public void setPriorPrescription(Reference newPriorPrescription) {
		if (newPriorPrescription != priorPrescription) {
			NotificationChain msgs = null;
			if (priorPrescription != null)
				msgs = ((InternalEObject)priorPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, null, msgs);
			if (newPriorPrescription != null)
				msgs = ((InternalEObject)newPriorPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, null, msgs);
			msgs = basicSetPriorPrescription(newPriorPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, newPriorPrescription, newPriorPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getGroupIdentifier() {
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupIdentifier(Identifier newGroupIdentifier, NotificationChain msgs) {
		Identifier oldGroupIdentifier = groupIdentifier;
		groupIdentifier = newGroupIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER, oldGroupIdentifier, newGroupIdentifier);
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
	public void setGroupIdentifier(Identifier newGroupIdentifier) {
		if (newGroupIdentifier != groupIdentifier) {
			NotificationChain msgs = null;
			if (groupIdentifier != null)
				msgs = ((InternalEObject)groupIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER, null, msgs);
			if (newGroupIdentifier != null)
				msgs = ((InternalEObject)newGroupIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER, null, msgs);
			msgs = basicSetGroupIdentifier(newGroupIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER, newGroupIdentifier, newGroupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationrequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationrequestStatus newStatus, NotificationChain msgs) {
		MedicationrequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STATUS, oldStatus, newStatus);
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
	public void setStatus(MedicationrequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STATUS_REASON, oldStatusReason, newStatusReason);
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
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STATUS_CHANGED, oldStatusChanged, newStatusChanged);
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
	public void setStatusChanged(DateTime newStatusChanged) {
		if (newStatusChanged != statusChanged) {
			NotificationChain msgs = null;
			if (statusChanged != null)
				msgs = ((InternalEObject)statusChanged).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STATUS_CHANGED, null, msgs);
			if (newStatusChanged != null)
				msgs = ((InternalEObject)newStatusChanged).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STATUS_CHANGED, null, msgs);
			msgs = basicSetStatusChanged(newStatusChanged, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STATUS_CHANGED, newStatusChanged, newStatusChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestIntent getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(MedicationRequestIntent newIntent, NotificationChain msgs) {
		MedicationRequestIntent oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__INTENT, oldIntent, newIntent);
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
	public void setIntent(MedicationRequestIntent newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_REQUEST__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(RequestPriority newPriority, NotificationChain msgs) {
		RequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(RequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getDoNotPerform() {
		return doNotPerform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoNotPerform(org.hl7.emf.fhir.Boolean newDoNotPerform, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldDoNotPerform = doNotPerform;
		doNotPerform = newDoNotPerform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__DO_NOT_PERFORM, oldDoNotPerform, newDoNotPerform);
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
	public void setDoNotPerform(org.hl7.emf.fhir.Boolean newDoNotPerform) {
		if (newDoNotPerform != doNotPerform) {
			NotificationChain msgs = null;
			if (doNotPerform != null)
				msgs = ((InternalEObject)doNotPerform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__DO_NOT_PERFORM, null, msgs);
			if (newDoNotPerform != null)
				msgs = ((InternalEObject)newDoNotPerform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__DO_NOT_PERFORM, null, msgs);
			msgs = basicSetDoNotPerform(newDoNotPerform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__DO_NOT_PERFORM, newDoNotPerform, newDoNotPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__MEDICATION, oldMedication, newMedication);
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
	public void setMedication(CodeableReference newMedication) {
		if (newMedication != medication) {
			NotificationChain msgs = null;
			if (medication != null)
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__MEDICATION, newMedication, newMedication));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getInformationSource() {
		if (informationSource == null) {
			informationSource = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__INFORMATION_SOURCE);
		}
		return informationSource;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getAuthoredOn() {
		return authoredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoredOn(DateTime newAuthoredOn, NotificationChain msgs) {
		DateTime oldAuthoredOn = authoredOn;
		authoredOn = newAuthoredOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
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
	public void setAuthoredOn(DateTime newAuthoredOn) {
		if (newAuthoredOn != authoredOn) {
			NotificationChain msgs = null;
			if (authoredOn != null)
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(Reference newRequester, NotificationChain msgs) {
		Reference oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__REQUESTER, oldRequester, newRequester);
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
	public void setRequester(Reference newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getReported() {
		return reported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReported(org.hl7.emf.fhir.Boolean newReported, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldReported = reported;
		reported = newReported;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__REPORTED, oldReported, newReported);
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
	public void setReported(org.hl7.emf.fhir.Boolean newReported) {
		if (newReported != reported) {
			NotificationChain msgs = null;
			if (reported != null)
				msgs = ((InternalEObject)reported).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__REPORTED, null, msgs);
			if (newReported != null)
				msgs = ((InternalEObject)newReported).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__REPORTED, null, msgs);
			msgs = basicSetReported(newReported, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__REPORTED, newReported, newReported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPerformerType() {
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformerType(CodeableConcept newPerformerType, NotificationChain msgs) {
		CodeableConcept oldPerformerType = performerType;
		performerType = newPerformerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PERFORMER_TYPE, oldPerformerType, newPerformerType);
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
	public void setPerformerType(CodeableConcept newPerformerType) {
		if (newPerformerType != performerType) {
			NotificationChain msgs = null;
			if (performerType != null)
				msgs = ((InternalEObject)performerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PERFORMER_TYPE, null, msgs);
			if (newPerformerType != null)
				msgs = ((InternalEObject)newPerformerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PERFORMER_TYPE, null, msgs);
			msgs = basicSetPerformerType(newPerformerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PERFORMER_TYPE, newPerformerType, newPerformerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.MEDICATION_REQUEST__DEVICE);
		}
		return device;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__RECORDER, oldRecorder, newRecorder);
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
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__RECORDER, newRecorder, newRecorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.MEDICATION_REQUEST__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCourseOfTherapyType() {
		return courseOfTherapyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseOfTherapyType(CodeableConcept newCourseOfTherapyType, NotificationChain msgs) {
		CodeableConcept oldCourseOfTherapyType = courseOfTherapyType;
		courseOfTherapyType = newCourseOfTherapyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE, oldCourseOfTherapyType, newCourseOfTherapyType);
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
	public void setCourseOfTherapyType(CodeableConcept newCourseOfTherapyType) {
		if (newCourseOfTherapyType != courseOfTherapyType) {
			NotificationChain msgs = null;
			if (courseOfTherapyType != null)
				msgs = ((InternalEObject)courseOfTherapyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE, null, msgs);
			if (newCourseOfTherapyType != null)
				msgs = ((InternalEObject)newCourseOfTherapyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE, null, msgs);
			msgs = basicSetCourseOfTherapyType(newCourseOfTherapyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE, newCourseOfTherapyType, newCourseOfTherapyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getInsurance() {
		if (insurance == null) {
			insurance = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__INSURANCE);
		}
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_REQUEST__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__RENDERED_DOSAGE_INSTRUCTION, oldRenderedDosageInstruction, newRenderedDosageInstruction);
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
	public void setRenderedDosageInstruction(Markdown newRenderedDosageInstruction) {
		if (newRenderedDosageInstruction != renderedDosageInstruction) {
			NotificationChain msgs = null;
			if (renderedDosageInstruction != null)
				msgs = ((InternalEObject)renderedDosageInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__RENDERED_DOSAGE_INSTRUCTION, null, msgs);
			if (newRenderedDosageInstruction != null)
				msgs = ((InternalEObject)newRenderedDosageInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__RENDERED_DOSAGE_INSTRUCTION, null, msgs);
			msgs = basicSetRenderedDosageInstruction(newRenderedDosageInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__RENDERED_DOSAGE_INSTRUCTION, newRenderedDosageInstruction, newRenderedDosageInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getEffectiveDosePeriod() {
		return effectiveDosePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDosePeriod(Period newEffectiveDosePeriod, NotificationChain msgs) {
		Period oldEffectiveDosePeriod = effectiveDosePeriod;
		effectiveDosePeriod = newEffectiveDosePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__EFFECTIVE_DOSE_PERIOD, oldEffectiveDosePeriod, newEffectiveDosePeriod);
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
	public void setEffectiveDosePeriod(Period newEffectiveDosePeriod) {
		if (newEffectiveDosePeriod != effectiveDosePeriod) {
			NotificationChain msgs = null;
			if (effectiveDosePeriod != null)
				msgs = ((InternalEObject)effectiveDosePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__EFFECTIVE_DOSE_PERIOD, null, msgs);
			if (newEffectiveDosePeriod != null)
				msgs = ((InternalEObject)newEffectiveDosePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__EFFECTIVE_DOSE_PERIOD, null, msgs);
			msgs = basicSetEffectiveDosePeriod(newEffectiveDosePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__EFFECTIVE_DOSE_PERIOD, newEffectiveDosePeriod, newEffectiveDosePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dosage> getDosageInstruction() {
		if (dosageInstruction == null) {
			dosageInstruction = new EObjectContainmentEList<Dosage>(Dosage.class, this, FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION);
		}
		return dosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestDispenseRequest getDispenseRequest() {
		return dispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispenseRequest(MedicationRequestDispenseRequest newDispenseRequest, NotificationChain msgs) {
		MedicationRequestDispenseRequest oldDispenseRequest = dispenseRequest;
		dispenseRequest = newDispenseRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, oldDispenseRequest, newDispenseRequest);
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
	public void setDispenseRequest(MedicationRequestDispenseRequest newDispenseRequest) {
		if (newDispenseRequest != dispenseRequest) {
			NotificationChain msgs = null;
			if (dispenseRequest != null)
				msgs = ((InternalEObject)dispenseRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, null, msgs);
			if (newDispenseRequest != null)
				msgs = ((InternalEObject)newDispenseRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, null, msgs);
			msgs = basicSetDispenseRequest(newDispenseRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, newDispenseRequest, newDispenseRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationRequestSubstitution newSubstitution, NotificationChain msgs) {
		MedicationRequestSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__SUBSTITUTION, oldSubstitution, newSubstitution);
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
	public void setSubstitution(MedicationRequestSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEventHistory() {
		if (eventHistory == null) {
			eventHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY);
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
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return basicSetPriorPrescription(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				return basicSetGroupIdentifier(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__STATUS_CHANGED:
				return basicSetStatusChanged(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__INTENT:
				return basicSetIntent(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				return basicSetDoNotPerform(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__INFORMATION_SOURCE:
				return ((InternalEList<?>)getInformationSource()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__REPORTED:
				return basicSetReported(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				return basicSetPerformerType(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__RECORDER:
				return basicSetRecorder(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				return basicSetCourseOfTherapyType(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__INSURANCE:
				return ((InternalEList<?>)getInsurance()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__RENDERED_DOSAGE_INSTRUCTION:
				return basicSetRenderedDosageInstruction(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__EFFECTIVE_DOSE_PERIOD:
				return basicSetEffectiveDosePeriod(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstruction()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return basicSetDispenseRequest(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
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
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				return getBasedOn();
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return getPriorPrescription();
			case FhirPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				return getGroupIdentifier();
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_REQUEST__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.MEDICATION_REQUEST__STATUS_CHANGED:
				return getStatusChanged();
			case FhirPackage.MEDICATION_REQUEST__INTENT:
				return getIntent();
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				return getCategory();
			case FhirPackage.MEDICATION_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				return getDoNotPerform();
			case FhirPackage.MEDICATION_REQUEST__MEDICATION:
				return getMedication();
			case FhirPackage.MEDICATION_REQUEST__SUBJECT:
				return getSubject();
			case FhirPackage.MEDICATION_REQUEST__INFORMATION_SOURCE:
				return getInformationSource();
			case FhirPackage.MEDICATION_REQUEST__ENCOUNTER:
				return getEncounter();
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FhirPackage.MEDICATION_REQUEST__AUTHORED_ON:
				return getAuthoredOn();
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				return getRequester();
			case FhirPackage.MEDICATION_REQUEST__REPORTED:
				return getReported();
			case FhirPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				return getPerformerType();
			case FhirPackage.MEDICATION_REQUEST__PERFORMER:
				return getPerformer();
			case FhirPackage.MEDICATION_REQUEST__DEVICE:
				return getDevice();
			case FhirPackage.MEDICATION_REQUEST__RECORDER:
				return getRecorder();
			case FhirPackage.MEDICATION_REQUEST__REASON:
				return getReason();
			case FhirPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				return getCourseOfTherapyType();
			case FhirPackage.MEDICATION_REQUEST__INSURANCE:
				return getInsurance();
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_REQUEST__RENDERED_DOSAGE_INSTRUCTION:
				return getRenderedDosageInstruction();
			case FhirPackage.MEDICATION_REQUEST__EFFECTIVE_DOSE_PERIOD:
				return getEffectiveDosePeriod();
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return getDosageInstruction();
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return getDispenseRequest();
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return getSubstitution();
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
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
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				setStatus((MedicationrequestStatus)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__STATUS_CHANGED:
				setStatusChanged((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__INTENT:
				setIntent((MedicationRequestIntent)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__PRIORITY:
				setPriority((RequestPriority)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				setDoNotPerform((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__MEDICATION:
				setMedication((CodeableReference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__INFORMATION_SOURCE:
				getInformationSource().clear();
				getInformationSource().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__REPORTED:
				setReported((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				setCourseOfTherapyType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__INSURANCE:
				getInsurance().clear();
				getInsurance().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__RENDERED_DOSAGE_INSTRUCTION:
				setRenderedDosageInstruction((Markdown)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__EFFECTIVE_DOSE_PERIOD:
				setEffectiveDosePeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				getDosageInstruction().addAll((Collection<? extends Dosage>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				setDispenseRequest((MedicationRequestDispenseRequest)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				setSubstitution((MedicationRequestSubstitution)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
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
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				setStatus((MedicationrequestStatus)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__STATUS_CHANGED:
				setStatusChanged((DateTime)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__INTENT:
				setIntent((MedicationRequestIntent)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__PRIORITY:
				setPriority((RequestPriority)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				setDoNotPerform((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__MEDICATION:
				setMedication((CodeableReference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__INFORMATION_SOURCE:
				getInformationSource().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__REPORTED:
				setReported((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__DEVICE:
				getDevice().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__RECORDER:
				setRecorder((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__REASON:
				getReason().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				setCourseOfTherapyType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__INSURANCE:
				getInsurance().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				getNote().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__RENDERED_DOSAGE_INSTRUCTION:
				setRenderedDosageInstruction((Markdown)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__EFFECTIVE_DOSE_PERIOD:
				setEffectiveDosePeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				setDispenseRequest((MedicationRequestDispenseRequest)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				setSubstitution((MedicationRequestSubstitution)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
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
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return priorPrescription != null;
			case FhirPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_REQUEST__STATUS_REASON:
				return statusReason != null;
			case FhirPackage.MEDICATION_REQUEST__STATUS_CHANGED:
				return statusChanged != null;
			case FhirPackage.MEDICATION_REQUEST__INTENT:
				return intent != null;
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				return doNotPerform != null;
			case FhirPackage.MEDICATION_REQUEST__MEDICATION:
				return medication != null;
			case FhirPackage.MEDICATION_REQUEST__SUBJECT:
				return subject != null;
			case FhirPackage.MEDICATION_REQUEST__INFORMATION_SOURCE:
				return informationSource != null && !informationSource.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__ENCOUNTER:
				return encounter != null;
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				return requester != null;
			case FhirPackage.MEDICATION_REQUEST__REPORTED:
				return reported != null;
			case FhirPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				return performerType != null;
			case FhirPackage.MEDICATION_REQUEST__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__DEVICE:
				return device != null && !device.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__RECORDER:
				return recorder != null;
			case FhirPackage.MEDICATION_REQUEST__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				return courseOfTherapyType != null;
			case FhirPackage.MEDICATION_REQUEST__INSURANCE:
				return insurance != null && !insurance.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__RENDERED_DOSAGE_INSTRUCTION:
				return renderedDosageInstruction != null;
			case FhirPackage.MEDICATION_REQUEST__EFFECTIVE_DOSE_PERIOD:
				return effectiveDosePeriod != null;
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return dosageInstruction != null && !dosageInstruction.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return dispenseRequest != null;
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return substitution != null;
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				return eventHistory != null && !eventHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationRequestImpl
