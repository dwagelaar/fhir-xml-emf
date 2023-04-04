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
import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.RequestPriority;
import org.hl7.emf.fhir.Transport;
import org.hl7.emf.fhir.TransportInput;
import org.hl7.emf.fhir.TransportIntent;
import org.hl7.emf.fhir.TransportOutput;
import org.hl7.emf.fhir.TransportRestriction;
import org.hl7.emf.fhir.TransportStatus;
import org.hl7.emf.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getCompletionTime <em>Completion Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getRelevantHistory <em>Relevant History</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getRequestedLocation <em>Requested Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getCurrentLocation <em>Current Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TransportImpl#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportImpl extends DomainResourceImpl implements Transport {
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
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesUri() <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUri()
	 * @generated
	 * @ordered
	 */
	protected Uri instantiatesUri;

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
	 * The cached value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier groupIdentifier;

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
	protected TransportStatus status;

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
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected TransportIntent intent;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Reference focus;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected Reference for_;

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
	 * The cached value of the '{@link #getCompletionTime() <em>Completion Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime completionTime;

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
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastModified;

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
	 * The cached value of the '{@link #getPerformerType() <em>Performer Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> performerType;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Reference owner;

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
	 * The cached value of the '{@link #getRelevantHistory() <em>Relevant History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> relevantHistory;

	/**
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected TransportRestriction restriction;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportInput> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportOutput> output;

	/**
	 * The cached value of the '{@link #getRequestedLocation() <em>Requested Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference requestedLocation;

	/**
	 * The cached value of the '{@link #getCurrentLocation() <em>Current Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference currentLocation;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference reason;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected Reference history;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTransport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.TRANSPORT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getInstantiatesCanonical() {
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesCanonical(Canonical newInstantiatesCanonical, NotificationChain msgs) {
		Canonical oldInstantiatesCanonical = instantiatesCanonical;
		instantiatesCanonical = newInstantiatesCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__INSTANTIATES_CANONICAL, oldInstantiatesCanonical, newInstantiatesCanonical);
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
	public void setInstantiatesCanonical(Canonical newInstantiatesCanonical) {
		if (newInstantiatesCanonical != instantiatesCanonical) {
			NotificationChain msgs = null;
			if (instantiatesCanonical != null)
				msgs = ((InternalEObject)instantiatesCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__INSTANTIATES_CANONICAL, null, msgs);
			if (newInstantiatesCanonical != null)
				msgs = ((InternalEObject)newInstantiatesCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__INSTANTIATES_CANONICAL, null, msgs);
			msgs = basicSetInstantiatesCanonical(newInstantiatesCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__INSTANTIATES_CANONICAL, newInstantiatesCanonical, newInstantiatesCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getInstantiatesUri() {
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesUri(Uri newInstantiatesUri, NotificationChain msgs) {
		Uri oldInstantiatesUri = instantiatesUri;
		instantiatesUri = newInstantiatesUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__INSTANTIATES_URI, oldInstantiatesUri, newInstantiatesUri);
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
	public void setInstantiatesUri(Uri newInstantiatesUri) {
		if (newInstantiatesUri != instantiatesUri) {
			NotificationChain msgs = null;
			if (instantiatesUri != null)
				msgs = ((InternalEObject)instantiatesUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__INSTANTIATES_URI, null, msgs);
			if (newInstantiatesUri != null)
				msgs = ((InternalEObject)newInstantiatesUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__INSTANTIATES_URI, null, msgs);
			msgs = basicSetInstantiatesUri(newInstantiatesUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__INSTANTIATES_URI, newInstantiatesUri, newInstantiatesUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.TRANSPORT__BASED_ON);
		}
		return basedOn;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__GROUP_IDENTIFIER, oldGroupIdentifier, newGroupIdentifier);
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
				msgs = ((InternalEObject)groupIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__GROUP_IDENTIFIER, null, msgs);
			if (newGroupIdentifier != null)
				msgs = ((InternalEObject)newGroupIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__GROUP_IDENTIFIER, null, msgs);
			msgs = basicSetGroupIdentifier(newGroupIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__GROUP_IDENTIFIER, newGroupIdentifier, newGroupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.TRANSPORT__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(TransportStatus newStatus, NotificationChain msgs) {
		TransportStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__STATUS, oldStatus, newStatus);
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
	public void setStatus(TransportStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__STATUS_REASON, oldStatusReason, newStatusReason);
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
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportIntent getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(TransportIntent newIntent, NotificationChain msgs) {
		TransportIntent oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__INTENT, oldIntent, newIntent);
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
	public void setIntent(TransportIntent newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__INTENT, newIntent, newIntent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__PRIORITY, newPriority, newPriority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__FOCUS, oldFocus, newFocus);
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
	public void setFocus(Reference newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor(Reference newFor, NotificationChain msgs) {
		Reference oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__FOR, oldFor, newFor);
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
	public void setFor(Reference newFor) {
		if (newFor != for_) {
			NotificationChain msgs = null;
			if (for_ != null)
				msgs = ((InternalEObject)for_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__FOR, null, msgs);
			if (newFor != null)
				msgs = ((InternalEObject)newFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__FOR, null, msgs);
			msgs = basicSetFor(newFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__FOR, newFor, newFor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCompletionTime() {
		return completionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionTime(DateTime newCompletionTime, NotificationChain msgs) {
		DateTime oldCompletionTime = completionTime;
		completionTime = newCompletionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__COMPLETION_TIME, oldCompletionTime, newCompletionTime);
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
	public void setCompletionTime(DateTime newCompletionTime) {
		if (newCompletionTime != completionTime) {
			NotificationChain msgs = null;
			if (completionTime != null)
				msgs = ((InternalEObject)completionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__COMPLETION_TIME, null, msgs);
			if (newCompletionTime != null)
				msgs = ((InternalEObject)newCompletionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__COMPLETION_TIME, null, msgs);
			msgs = basicSetCompletionTime(newCompletionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__COMPLETION_TIME, newCompletionTime, newCompletionTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
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
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastModified(DateTime newLastModified, NotificationChain msgs) {
		DateTime oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__LAST_MODIFIED, oldLastModified, newLastModified);
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
	public void setLastModified(DateTime newLastModified) {
		if (newLastModified != lastModified) {
			NotificationChain msgs = null;
			if (lastModified != null)
				msgs = ((InternalEObject)lastModified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__LAST_MODIFIED, null, msgs);
			if (newLastModified != null)
				msgs = ((InternalEObject)newLastModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__LAST_MODIFIED, null, msgs);
			msgs = basicSetLastModified(newLastModified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__LAST_MODIFIED, newLastModified, newLastModified));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__REQUESTER, oldRequester, newRequester);
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
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPerformerType() {
		if (performerType == null) {
			performerType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.TRANSPORT__PERFORMER_TYPE);
		}
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Reference newOwner, NotificationChain msgs) {
		Reference oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__OWNER, oldOwner, newOwner);
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
	public void setOwner(Reference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__OWNER, newOwner, newOwner));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getInsurance() {
		if (insurance == null) {
			insurance = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.TRANSPORT__INSURANCE);
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
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.TRANSPORT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRelevantHistory() {
		if (relevantHistory == null) {
			relevantHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.TRANSPORT__RELEVANT_HISTORY);
		}
		return relevantHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportRestriction getRestriction() {
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestriction(TransportRestriction newRestriction, NotificationChain msgs) {
		TransportRestriction oldRestriction = restriction;
		restriction = newRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__RESTRICTION, oldRestriction, newRestriction);
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
	public void setRestriction(TransportRestriction newRestriction) {
		if (newRestriction != restriction) {
			NotificationChain msgs = null;
			if (restriction != null)
				msgs = ((InternalEObject)restriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__RESTRICTION, null, msgs);
			if (newRestriction != null)
				msgs = ((InternalEObject)newRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__RESTRICTION, null, msgs);
			msgs = basicSetRestriction(newRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__RESTRICTION, newRestriction, newRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransportInput> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<TransportInput>(TransportInput.class, this, FhirPackage.TRANSPORT__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransportOutput> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<TransportOutput>(TransportOutput.class, this, FhirPackage.TRANSPORT__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRequestedLocation() {
		return requestedLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedLocation(Reference newRequestedLocation, NotificationChain msgs) {
		Reference oldRequestedLocation = requestedLocation;
		requestedLocation = newRequestedLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__REQUESTED_LOCATION, oldRequestedLocation, newRequestedLocation);
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
	public void setRequestedLocation(Reference newRequestedLocation) {
		if (newRequestedLocation != requestedLocation) {
			NotificationChain msgs = null;
			if (requestedLocation != null)
				msgs = ((InternalEObject)requestedLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__REQUESTED_LOCATION, null, msgs);
			if (newRequestedLocation != null)
				msgs = ((InternalEObject)newRequestedLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__REQUESTED_LOCATION, null, msgs);
			msgs = basicSetRequestedLocation(newRequestedLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__REQUESTED_LOCATION, newRequestedLocation, newRequestedLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCurrentLocation() {
		return currentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentLocation(Reference newCurrentLocation, NotificationChain msgs) {
		Reference oldCurrentLocation = currentLocation;
		currentLocation = newCurrentLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__CURRENT_LOCATION, oldCurrentLocation, newCurrentLocation);
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
	public void setCurrentLocation(Reference newCurrentLocation) {
		if (newCurrentLocation != currentLocation) {
			NotificationChain msgs = null;
			if (currentLocation != null)
				msgs = ((InternalEObject)currentLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__CURRENT_LOCATION, null, msgs);
			if (newCurrentLocation != null)
				msgs = ((InternalEObject)newCurrentLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__CURRENT_LOCATION, null, msgs);
			msgs = basicSetCurrentLocation(newCurrentLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__CURRENT_LOCATION, newCurrentLocation, newCurrentLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableReference newReason, NotificationChain msgs) {
		CodeableReference oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__REASON, oldReason, newReason);
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
	public void setReason(CodeableReference newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistory(Reference newHistory, NotificationChain msgs) {
		Reference oldHistory = history;
		history = newHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__HISTORY, oldHistory, newHistory);
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
	public void setHistory(Reference newHistory) {
		if (newHistory != history) {
			NotificationChain msgs = null;
			if (history != null)
				msgs = ((InternalEObject)history).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__HISTORY, null, msgs);
			if (newHistory != null)
				msgs = ((InternalEObject)newHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRANSPORT__HISTORY, null, msgs);
			msgs = basicSetHistory(newHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRANSPORT__HISTORY, newHistory, newHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TRANSPORT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.TRANSPORT__INSTANTIATES_CANONICAL:
				return basicSetInstantiatesCanonical(null, msgs);
			case FhirPackage.TRANSPORT__INSTANTIATES_URI:
				return basicSetInstantiatesUri(null, msgs);
			case FhirPackage.TRANSPORT__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.TRANSPORT__GROUP_IDENTIFIER:
				return basicSetGroupIdentifier(null, msgs);
			case FhirPackage.TRANSPORT__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.TRANSPORT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.TRANSPORT__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FhirPackage.TRANSPORT__INTENT:
				return basicSetIntent(null, msgs);
			case FhirPackage.TRANSPORT__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.TRANSPORT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.TRANSPORT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.TRANSPORT__FOCUS:
				return basicSetFocus(null, msgs);
			case FhirPackage.TRANSPORT__FOR:
				return basicSetFor(null, msgs);
			case FhirPackage.TRANSPORT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.TRANSPORT__COMPLETION_TIME:
				return basicSetCompletionTime(null, msgs);
			case FhirPackage.TRANSPORT__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case FhirPackage.TRANSPORT__LAST_MODIFIED:
				return basicSetLastModified(null, msgs);
			case FhirPackage.TRANSPORT__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.TRANSPORT__PERFORMER_TYPE:
				return ((InternalEList<?>)getPerformerType()).basicRemove(otherEnd, msgs);
			case FhirPackage.TRANSPORT__OWNER:
				return basicSetOwner(null, msgs);
			case FhirPackage.TRANSPORT__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.TRANSPORT__INSURANCE:
				return ((InternalEList<?>)getInsurance()).basicRemove(otherEnd, msgs);
			case FhirPackage.TRANSPORT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.TRANSPORT__RELEVANT_HISTORY:
				return ((InternalEList<?>)getRelevantHistory()).basicRemove(otherEnd, msgs);
			case FhirPackage.TRANSPORT__RESTRICTION:
				return basicSetRestriction(null, msgs);
			case FhirPackage.TRANSPORT__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case FhirPackage.TRANSPORT__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case FhirPackage.TRANSPORT__REQUESTED_LOCATION:
				return basicSetRequestedLocation(null, msgs);
			case FhirPackage.TRANSPORT__CURRENT_LOCATION:
				return basicSetCurrentLocation(null, msgs);
			case FhirPackage.TRANSPORT__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.TRANSPORT__HISTORY:
				return basicSetHistory(null, msgs);
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
			case FhirPackage.TRANSPORT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.TRANSPORT__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FhirPackage.TRANSPORT__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FhirPackage.TRANSPORT__BASED_ON:
				return getBasedOn();
			case FhirPackage.TRANSPORT__GROUP_IDENTIFIER:
				return getGroupIdentifier();
			case FhirPackage.TRANSPORT__PART_OF:
				return getPartOf();
			case FhirPackage.TRANSPORT__STATUS:
				return getStatus();
			case FhirPackage.TRANSPORT__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.TRANSPORT__INTENT:
				return getIntent();
			case FhirPackage.TRANSPORT__PRIORITY:
				return getPriority();
			case FhirPackage.TRANSPORT__CODE:
				return getCode();
			case FhirPackage.TRANSPORT__DESCRIPTION:
				return getDescription();
			case FhirPackage.TRANSPORT__FOCUS:
				return getFocus();
			case FhirPackage.TRANSPORT__FOR:
				return getFor();
			case FhirPackage.TRANSPORT__ENCOUNTER:
				return getEncounter();
			case FhirPackage.TRANSPORT__COMPLETION_TIME:
				return getCompletionTime();
			case FhirPackage.TRANSPORT__AUTHORED_ON:
				return getAuthoredOn();
			case FhirPackage.TRANSPORT__LAST_MODIFIED:
				return getLastModified();
			case FhirPackage.TRANSPORT__REQUESTER:
				return getRequester();
			case FhirPackage.TRANSPORT__PERFORMER_TYPE:
				return getPerformerType();
			case FhirPackage.TRANSPORT__OWNER:
				return getOwner();
			case FhirPackage.TRANSPORT__LOCATION:
				return getLocation();
			case FhirPackage.TRANSPORT__INSURANCE:
				return getInsurance();
			case FhirPackage.TRANSPORT__NOTE:
				return getNote();
			case FhirPackage.TRANSPORT__RELEVANT_HISTORY:
				return getRelevantHistory();
			case FhirPackage.TRANSPORT__RESTRICTION:
				return getRestriction();
			case FhirPackage.TRANSPORT__INPUT:
				return getInput();
			case FhirPackage.TRANSPORT__OUTPUT:
				return getOutput();
			case FhirPackage.TRANSPORT__REQUESTED_LOCATION:
				return getRequestedLocation();
			case FhirPackage.TRANSPORT__CURRENT_LOCATION:
				return getCurrentLocation();
			case FhirPackage.TRANSPORT__REASON:
				return getReason();
			case FhirPackage.TRANSPORT__HISTORY:
				return getHistory();
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
			case FhirPackage.TRANSPORT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.TRANSPORT__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Canonical)newValue);
				return;
			case FhirPackage.TRANSPORT__INSTANTIATES_URI:
				setInstantiatesUri((Uri)newValue);
				return;
			case FhirPackage.TRANSPORT__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.TRANSPORT__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case FhirPackage.TRANSPORT__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.TRANSPORT__STATUS:
				setStatus((TransportStatus)newValue);
				return;
			case FhirPackage.TRANSPORT__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case FhirPackage.TRANSPORT__INTENT:
				setIntent((TransportIntent)newValue);
				return;
			case FhirPackage.TRANSPORT__PRIORITY:
				setPriority((RequestPriority)newValue);
				return;
			case FhirPackage.TRANSPORT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.TRANSPORT__DESCRIPTION:
				setDescription((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.TRANSPORT__FOCUS:
				setFocus((Reference)newValue);
				return;
			case FhirPackage.TRANSPORT__FOR:
				setFor((Reference)newValue);
				return;
			case FhirPackage.TRANSPORT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.TRANSPORT__COMPLETION_TIME:
				setCompletionTime((DateTime)newValue);
				return;
			case FhirPackage.TRANSPORT__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case FhirPackage.TRANSPORT__LAST_MODIFIED:
				setLastModified((DateTime)newValue);
				return;
			case FhirPackage.TRANSPORT__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case FhirPackage.TRANSPORT__PERFORMER_TYPE:
				getPerformerType().clear();
				getPerformerType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.TRANSPORT__OWNER:
				setOwner((Reference)newValue);
				return;
			case FhirPackage.TRANSPORT__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.TRANSPORT__INSURANCE:
				getInsurance().clear();
				getInsurance().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.TRANSPORT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.TRANSPORT__RELEVANT_HISTORY:
				getRelevantHistory().clear();
				getRelevantHistory().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.TRANSPORT__RESTRICTION:
				setRestriction((TransportRestriction)newValue);
				return;
			case FhirPackage.TRANSPORT__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends TransportInput>)newValue);
				return;
			case FhirPackage.TRANSPORT__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends TransportOutput>)newValue);
				return;
			case FhirPackage.TRANSPORT__REQUESTED_LOCATION:
				setRequestedLocation((Reference)newValue);
				return;
			case FhirPackage.TRANSPORT__CURRENT_LOCATION:
				setCurrentLocation((Reference)newValue);
				return;
			case FhirPackage.TRANSPORT__REASON:
				setReason((CodeableReference)newValue);
				return;
			case FhirPackage.TRANSPORT__HISTORY:
				setHistory((Reference)newValue);
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
			case FhirPackage.TRANSPORT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.TRANSPORT__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Canonical)null);
				return;
			case FhirPackage.TRANSPORT__INSTANTIATES_URI:
				setInstantiatesUri((Uri)null);
				return;
			case FhirPackage.TRANSPORT__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.TRANSPORT__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case FhirPackage.TRANSPORT__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.TRANSPORT__STATUS:
				setStatus((TransportStatus)null);
				return;
			case FhirPackage.TRANSPORT__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case FhirPackage.TRANSPORT__INTENT:
				setIntent((TransportIntent)null);
				return;
			case FhirPackage.TRANSPORT__PRIORITY:
				setPriority((RequestPriority)null);
				return;
			case FhirPackage.TRANSPORT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.TRANSPORT__DESCRIPTION:
				setDescription((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.TRANSPORT__FOCUS:
				setFocus((Reference)null);
				return;
			case FhirPackage.TRANSPORT__FOR:
				setFor((Reference)null);
				return;
			case FhirPackage.TRANSPORT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.TRANSPORT__COMPLETION_TIME:
				setCompletionTime((DateTime)null);
				return;
			case FhirPackage.TRANSPORT__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case FhirPackage.TRANSPORT__LAST_MODIFIED:
				setLastModified((DateTime)null);
				return;
			case FhirPackage.TRANSPORT__REQUESTER:
				setRequester((Reference)null);
				return;
			case FhirPackage.TRANSPORT__PERFORMER_TYPE:
				getPerformerType().clear();
				return;
			case FhirPackage.TRANSPORT__OWNER:
				setOwner((Reference)null);
				return;
			case FhirPackage.TRANSPORT__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.TRANSPORT__INSURANCE:
				getInsurance().clear();
				return;
			case FhirPackage.TRANSPORT__NOTE:
				getNote().clear();
				return;
			case FhirPackage.TRANSPORT__RELEVANT_HISTORY:
				getRelevantHistory().clear();
				return;
			case FhirPackage.TRANSPORT__RESTRICTION:
				setRestriction((TransportRestriction)null);
				return;
			case FhirPackage.TRANSPORT__INPUT:
				getInput().clear();
				return;
			case FhirPackage.TRANSPORT__OUTPUT:
				getOutput().clear();
				return;
			case FhirPackage.TRANSPORT__REQUESTED_LOCATION:
				setRequestedLocation((Reference)null);
				return;
			case FhirPackage.TRANSPORT__CURRENT_LOCATION:
				setCurrentLocation((Reference)null);
				return;
			case FhirPackage.TRANSPORT__REASON:
				setReason((CodeableReference)null);
				return;
			case FhirPackage.TRANSPORT__HISTORY:
				setHistory((Reference)null);
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
			case FhirPackage.TRANSPORT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.TRANSPORT__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null;
			case FhirPackage.TRANSPORT__INSTANTIATES_URI:
				return instantiatesUri != null;
			case FhirPackage.TRANSPORT__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.TRANSPORT__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case FhirPackage.TRANSPORT__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.TRANSPORT__STATUS:
				return status != null;
			case FhirPackage.TRANSPORT__STATUS_REASON:
				return statusReason != null;
			case FhirPackage.TRANSPORT__INTENT:
				return intent != null;
			case FhirPackage.TRANSPORT__PRIORITY:
				return priority != null;
			case FhirPackage.TRANSPORT__CODE:
				return code != null;
			case FhirPackage.TRANSPORT__DESCRIPTION:
				return description != null;
			case FhirPackage.TRANSPORT__FOCUS:
				return focus != null;
			case FhirPackage.TRANSPORT__FOR:
				return for_ != null;
			case FhirPackage.TRANSPORT__ENCOUNTER:
				return encounter != null;
			case FhirPackage.TRANSPORT__COMPLETION_TIME:
				return completionTime != null;
			case FhirPackage.TRANSPORT__AUTHORED_ON:
				return authoredOn != null;
			case FhirPackage.TRANSPORT__LAST_MODIFIED:
				return lastModified != null;
			case FhirPackage.TRANSPORT__REQUESTER:
				return requester != null;
			case FhirPackage.TRANSPORT__PERFORMER_TYPE:
				return performerType != null && !performerType.isEmpty();
			case FhirPackage.TRANSPORT__OWNER:
				return owner != null;
			case FhirPackage.TRANSPORT__LOCATION:
				return location != null;
			case FhirPackage.TRANSPORT__INSURANCE:
				return insurance != null && !insurance.isEmpty();
			case FhirPackage.TRANSPORT__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.TRANSPORT__RELEVANT_HISTORY:
				return relevantHistory != null && !relevantHistory.isEmpty();
			case FhirPackage.TRANSPORT__RESTRICTION:
				return restriction != null;
			case FhirPackage.TRANSPORT__INPUT:
				return input != null && !input.isEmpty();
			case FhirPackage.TRANSPORT__OUTPUT:
				return output != null && !output.isEmpty();
			case FhirPackage.TRANSPORT__REQUESTED_LOCATION:
				return requestedLocation != null;
			case FhirPackage.TRANSPORT__CURRENT_LOCATION:
				return currentLocation != null;
			case FhirPackage.TRANSPORT__REASON:
				return reason != null;
			case FhirPackage.TRANSPORT__HISTORY:
				return history != null;
		}
		return super.eIsSet(featureID);
	}

} //TransportImpl
