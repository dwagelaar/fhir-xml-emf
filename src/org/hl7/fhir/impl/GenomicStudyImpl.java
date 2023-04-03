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
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GenomicStudy;
import org.hl7.fhir.GenomicStudyAnalysis;
import org.hl7.fhir.GenomicStudyStatus;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genomic Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyImpl#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenomicStudyImpl extends DomainResourceImpl implements GenomicStudy {
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
	protected GenomicStudyStatus status;

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
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime startDate;

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
	 * The cached value of the '{@link #getReferrer() <em>Referrer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferrer()
	 * @generated
	 * @ordered
	 */
	protected Reference referrer;

	/**
	 * The cached value of the '{@link #getInterpreter() <em>Interpreter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreter()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> interpreter;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<GenomicStudyAnalysis> analysis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenomicStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGenomicStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.GENOMIC_STUDY__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudyStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(GenomicStudyStatus newStatus, NotificationChain msgs) {
		GenomicStudyStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(GenomicStudyStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.GENOMIC_STUDY__TYPE);
		}
		return type;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartDate(DateTime newStartDate, NotificationChain msgs) {
		DateTime oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__START_DATE, oldStartDate, newStartDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(DateTime newStartDate) {
		if (newStartDate != startDate) {
			NotificationChain msgs = null;
			if (startDate != null)
				msgs = ((InternalEObject)startDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__START_DATE, null, msgs);
			if (newStartDate != null)
				msgs = ((InternalEObject)newStartDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__START_DATE, null, msgs);
			msgs = basicSetStartDate(newStartDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__START_DATE, newStartDate, newStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GENOMIC_STUDY__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferrer() {
		return referrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferrer(Reference newReferrer, NotificationChain msgs) {
		Reference oldReferrer = referrer;
		referrer = newReferrer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__REFERRER, oldReferrer, newReferrer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferrer(Reference newReferrer) {
		if (newReferrer != referrer) {
			NotificationChain msgs = null;
			if (referrer != null)
				msgs = ((InternalEObject)referrer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__REFERRER, null, msgs);
			if (newReferrer != null)
				msgs = ((InternalEObject)newReferrer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__REFERRER, null, msgs);
			msgs = basicSetReferrer(newReferrer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__REFERRER, newReferrer, newReferrer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getInterpreter() {
		if (interpreter == null) {
			interpreter = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GENOMIC_STUDY__INTERPRETER);
		}
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.GENOMIC_STUDY__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__INSTANTIATES_CANONICAL, oldInstantiatesCanonical, newInstantiatesCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatesCanonical(Canonical newInstantiatesCanonical) {
		if (newInstantiatesCanonical != instantiatesCanonical) {
			NotificationChain msgs = null;
			if (instantiatesCanonical != null)
				msgs = ((InternalEObject)instantiatesCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__INSTANTIATES_CANONICAL, null, msgs);
			if (newInstantiatesCanonical != null)
				msgs = ((InternalEObject)newInstantiatesCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__INSTANTIATES_CANONICAL, null, msgs);
			msgs = basicSetInstantiatesCanonical(newInstantiatesCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__INSTANTIATES_CANONICAL, newInstantiatesCanonical, newInstantiatesCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__INSTANTIATES_URI, oldInstantiatesUri, newInstantiatesUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatesUri(Uri newInstantiatesUri) {
		if (newInstantiatesUri != instantiatesUri) {
			NotificationChain msgs = null;
			if (instantiatesUri != null)
				msgs = ((InternalEObject)instantiatesUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__INSTANTIATES_URI, null, msgs);
			if (newInstantiatesUri != null)
				msgs = ((InternalEObject)newInstantiatesUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__INSTANTIATES_URI, null, msgs);
			msgs = basicSetInstantiatesUri(newInstantiatesUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__INSTANTIATES_URI, newInstantiatesUri, newInstantiatesUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.GENOMIC_STUDY__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenomicStudyAnalysis> getAnalysis() {
		if (analysis == null) {
			analysis = new EObjectContainmentEList<GenomicStudyAnalysis>(GenomicStudyAnalysis.class, this, FhirPackage.GENOMIC_STUDY__ANALYSIS);
		}
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GENOMIC_STUDY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.GENOMIC_STUDY__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.GENOMIC_STUDY__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.GENOMIC_STUDY__START_DATE:
				return basicSetStartDate(null, msgs);
			case FhirPackage.GENOMIC_STUDY__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY__REFERRER:
				return basicSetReferrer(null, msgs);
			case FhirPackage.GENOMIC_STUDY__INTERPRETER:
				return ((InternalEList<?>)getInterpreter()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_CANONICAL:
				return basicSetInstantiatesCanonical(null, msgs);
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_URI:
				return basicSetInstantiatesUri(null, msgs);
			case FhirPackage.GENOMIC_STUDY__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.GENOMIC_STUDY__ANALYSIS:
				return ((InternalEList<?>)getAnalysis()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.GENOMIC_STUDY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.GENOMIC_STUDY__STATUS:
				return getStatus();
			case FhirPackage.GENOMIC_STUDY__TYPE:
				return getType();
			case FhirPackage.GENOMIC_STUDY__SUBJECT:
				return getSubject();
			case FhirPackage.GENOMIC_STUDY__ENCOUNTER:
				return getEncounter();
			case FhirPackage.GENOMIC_STUDY__START_DATE:
				return getStartDate();
			case FhirPackage.GENOMIC_STUDY__BASED_ON:
				return getBasedOn();
			case FhirPackage.GENOMIC_STUDY__REFERRER:
				return getReferrer();
			case FhirPackage.GENOMIC_STUDY__INTERPRETER:
				return getInterpreter();
			case FhirPackage.GENOMIC_STUDY__REASON:
				return getReason();
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FhirPackage.GENOMIC_STUDY__NOTE:
				return getNote();
			case FhirPackage.GENOMIC_STUDY__DESCRIPTION:
				return getDescription();
			case FhirPackage.GENOMIC_STUDY__ANALYSIS:
				return getAnalysis();
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
			case FhirPackage.GENOMIC_STUDY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__STATUS:
				setStatus((GenomicStudyStatus)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__START_DATE:
				setStartDate((DateTime)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__REFERRER:
				setReferrer((Reference)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__INTERPRETER:
				getInterpreter().clear();
				getInterpreter().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Canonical)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_URI:
				setInstantiatesUri((Uri)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY__ANALYSIS:
				getAnalysis().clear();
				getAnalysis().addAll((Collection<? extends GenomicStudyAnalysis>)newValue);
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
			case FhirPackage.GENOMIC_STUDY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.GENOMIC_STUDY__STATUS:
				setStatus((GenomicStudyStatus)null);
				return;
			case FhirPackage.GENOMIC_STUDY__TYPE:
				getType().clear();
				return;
			case FhirPackage.GENOMIC_STUDY__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.GENOMIC_STUDY__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.GENOMIC_STUDY__START_DATE:
				setStartDate((DateTime)null);
				return;
			case FhirPackage.GENOMIC_STUDY__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.GENOMIC_STUDY__REFERRER:
				setReferrer((Reference)null);
				return;
			case FhirPackage.GENOMIC_STUDY__INTERPRETER:
				getInterpreter().clear();
				return;
			case FhirPackage.GENOMIC_STUDY__REASON:
				getReason().clear();
				return;
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Canonical)null);
				return;
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_URI:
				setInstantiatesUri((Uri)null);
				return;
			case FhirPackage.GENOMIC_STUDY__NOTE:
				getNote().clear();
				return;
			case FhirPackage.GENOMIC_STUDY__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.GENOMIC_STUDY__ANALYSIS:
				getAnalysis().clear();
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
			case FhirPackage.GENOMIC_STUDY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.GENOMIC_STUDY__STATUS:
				return status != null;
			case FhirPackage.GENOMIC_STUDY__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.GENOMIC_STUDY__SUBJECT:
				return subject != null;
			case FhirPackage.GENOMIC_STUDY__ENCOUNTER:
				return encounter != null;
			case FhirPackage.GENOMIC_STUDY__START_DATE:
				return startDate != null;
			case FhirPackage.GENOMIC_STUDY__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.GENOMIC_STUDY__REFERRER:
				return referrer != null;
			case FhirPackage.GENOMIC_STUDY__INTERPRETER:
				return interpreter != null && !interpreter.isEmpty();
			case FhirPackage.GENOMIC_STUDY__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null;
			case FhirPackage.GENOMIC_STUDY__INSTANTIATES_URI:
				return instantiatesUri != null;
			case FhirPackage.GENOMIC_STUDY__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.GENOMIC_STUDY__DESCRIPTION:
				return description != null;
			case FhirPackage.GENOMIC_STUDY__ANALYSIS:
				return analysis != null && !analysis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenomicStudyImpl
