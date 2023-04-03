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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ImagingSelection;
import org.hl7.fhir.ImagingSelectionInstance;
import org.hl7.fhir.ImagingSelectionPerformer;
import org.hl7.fhir.ImagingSelectionStatus;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getStudyUid <em>Study Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getSeriesUid <em>Series Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getFrameOfReferenceUid <em>Frame Of Reference Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingSelectionImpl extends DomainResourceImpl implements ImagingSelection {
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
	protected ImagingSelectionStatus status;

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
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Instant issued;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingSelectionPerformer> performer;

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
	 * The cached value of the '{@link #getStudyUid() <em>Study Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyUid()
	 * @generated
	 * @ordered
	 */
	protected Id studyUid;

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
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * The cached value of the '{@link #getSeriesUid() <em>Series Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesUid()
	 * @generated
	 * @ordered
	 */
	protected Id seriesUid;

	/**
	 * The cached value of the '{@link #getSeriesNumber() <em>Series Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesNumber()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt seriesNumber;

	/**
	 * The cached value of the '{@link #getFrameOfReferenceUid() <em>Frame Of Reference Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameOfReferenceUid()
	 * @generated
	 * @ordered
	 */
	protected Id frameOfReferenceUid;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference bodySite;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> focus;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingSelectionInstance> instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingSelection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.IMAGING_SELECTION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ImagingSelectionStatus newStatus, NotificationChain msgs) {
		ImagingSelectionStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ImagingSelectionStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(Instant newIssued, NotificationChain msgs) {
		Instant oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__ISSUED, oldIssued, newIssued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(Instant newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingSelectionPerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<ImagingSelectionPerformer>(ImagingSelectionPerformer.class, this, FhirPackage.IMAGING_SELECTION__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_SELECTION__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMAGING_SELECTION__CATEGORY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getStudyUid() {
		return studyUid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyUid(Id newStudyUid, NotificationChain msgs) {
		Id oldStudyUid = studyUid;
		studyUid = newStudyUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__STUDY_UID, oldStudyUid, newStudyUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyUid(Id newStudyUid) {
		if (newStudyUid != studyUid) {
			NotificationChain msgs = null;
			if (studyUid != null)
				msgs = ((InternalEObject)studyUid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__STUDY_UID, null, msgs);
			if (newStudyUid != null)
				msgs = ((InternalEObject)newStudyUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__STUDY_UID, null, msgs);
			msgs = basicSetStudyUid(newStudyUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__STUDY_UID, newStudyUid, newStudyUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_SELECTION__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_SELECTION__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getSeriesUid() {
		return seriesUid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesUid(Id newSeriesUid, NotificationChain msgs) {
		Id oldSeriesUid = seriesUid;
		seriesUid = newSeriesUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__SERIES_UID, oldSeriesUid, newSeriesUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesUid(Id newSeriesUid) {
		if (newSeriesUid != seriesUid) {
			NotificationChain msgs = null;
			if (seriesUid != null)
				msgs = ((InternalEObject)seriesUid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__SERIES_UID, null, msgs);
			if (newSeriesUid != null)
				msgs = ((InternalEObject)newSeriesUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__SERIES_UID, null, msgs);
			msgs = basicSetSeriesUid(newSeriesUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__SERIES_UID, newSeriesUid, newSeriesUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getSeriesNumber() {
		return seriesNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesNumber(UnsignedInt newSeriesNumber, NotificationChain msgs) {
		UnsignedInt oldSeriesNumber = seriesNumber;
		seriesNumber = newSeriesNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__SERIES_NUMBER, oldSeriesNumber, newSeriesNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesNumber(UnsignedInt newSeriesNumber) {
		if (newSeriesNumber != seriesNumber) {
			NotificationChain msgs = null;
			if (seriesNumber != null)
				msgs = ((InternalEObject)seriesNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__SERIES_NUMBER, null, msgs);
			if (newSeriesNumber != null)
				msgs = ((InternalEObject)newSeriesNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__SERIES_NUMBER, null, msgs);
			msgs = basicSetSeriesNumber(newSeriesNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__SERIES_NUMBER, newSeriesNumber, newSeriesNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getFrameOfReferenceUid() {
		return frameOfReferenceUid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrameOfReferenceUid(Id newFrameOfReferenceUid, NotificationChain msgs) {
		Id oldFrameOfReferenceUid = frameOfReferenceUid;
		frameOfReferenceUid = newFrameOfReferenceUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__FRAME_OF_REFERENCE_UID, oldFrameOfReferenceUid, newFrameOfReferenceUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameOfReferenceUid(Id newFrameOfReferenceUid) {
		if (newFrameOfReferenceUid != frameOfReferenceUid) {
			NotificationChain msgs = null;
			if (frameOfReferenceUid != null)
				msgs = ((InternalEObject)frameOfReferenceUid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__FRAME_OF_REFERENCE_UID, null, msgs);
			if (newFrameOfReferenceUid != null)
				msgs = ((InternalEObject)newFrameOfReferenceUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__FRAME_OF_REFERENCE_UID, null, msgs);
			msgs = basicSetFrameOfReferenceUid(newFrameOfReferenceUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__FRAME_OF_REFERENCE_UID, newFrameOfReferenceUid, newFrameOfReferenceUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableReference newBodySite, NotificationChain msgs) {
		CodeableReference oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableReference newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getFocus() {
		if (focus == null) {
			focus = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_SELECTION__FOCUS);
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingSelectionInstance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList<ImagingSelectionInstance>(ImagingSelectionInstance.class, this, FhirPackage.IMAGING_SELECTION__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_SELECTION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_SELECTION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.IMAGING_SELECTION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.IMAGING_SELECTION__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.IMAGING_SELECTION__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_SELECTION__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_SELECTION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_SELECTION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.IMAGING_SELECTION__STUDY_UID:
				return basicSetStudyUid(null, msgs);
			case FhirPackage.IMAGING_SELECTION__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_SELECTION__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_SELECTION__SERIES_UID:
				return basicSetSeriesUid(null, msgs);
			case FhirPackage.IMAGING_SELECTION__SERIES_NUMBER:
				return basicSetSeriesNumber(null, msgs);
			case FhirPackage.IMAGING_SELECTION__FRAME_OF_REFERENCE_UID:
				return basicSetFrameOfReferenceUid(null, msgs);
			case FhirPackage.IMAGING_SELECTION__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.IMAGING_SELECTION__FOCUS:
				return ((InternalEList<?>)getFocus()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_SELECTION__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_SELECTION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.IMAGING_SELECTION__STATUS:
				return getStatus();
			case FhirPackage.IMAGING_SELECTION__SUBJECT:
				return getSubject();
			case FhirPackage.IMAGING_SELECTION__ISSUED:
				return getIssued();
			case FhirPackage.IMAGING_SELECTION__PERFORMER:
				return getPerformer();
			case FhirPackage.IMAGING_SELECTION__BASED_ON:
				return getBasedOn();
			case FhirPackage.IMAGING_SELECTION__CATEGORY:
				return getCategory();
			case FhirPackage.IMAGING_SELECTION__CODE:
				return getCode();
			case FhirPackage.IMAGING_SELECTION__STUDY_UID:
				return getStudyUid();
			case FhirPackage.IMAGING_SELECTION__DERIVED_FROM:
				return getDerivedFrom();
			case FhirPackage.IMAGING_SELECTION__ENDPOINT:
				return getEndpoint();
			case FhirPackage.IMAGING_SELECTION__SERIES_UID:
				return getSeriesUid();
			case FhirPackage.IMAGING_SELECTION__SERIES_NUMBER:
				return getSeriesNumber();
			case FhirPackage.IMAGING_SELECTION__FRAME_OF_REFERENCE_UID:
				return getFrameOfReferenceUid();
			case FhirPackage.IMAGING_SELECTION__BODY_SITE:
				return getBodySite();
			case FhirPackage.IMAGING_SELECTION__FOCUS:
				return getFocus();
			case FhirPackage.IMAGING_SELECTION__INSTANCE:
				return getInstance();
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
			case FhirPackage.IMAGING_SELECTION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__STATUS:
				setStatus((ImagingSelectionStatus)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__ISSUED:
				setIssued((Instant)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends ImagingSelectionPerformer>)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__STUDY_UID:
				setStudyUid((Id)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__SERIES_UID:
				setSeriesUid((Id)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__SERIES_NUMBER:
				setSeriesNumber((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__FRAME_OF_REFERENCE_UID:
				setFrameOfReferenceUid((Id)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__BODY_SITE:
				setBodySite((CodeableReference)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__FOCUS:
				getFocus().clear();
				getFocus().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends ImagingSelectionInstance>)newValue);
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
			case FhirPackage.IMAGING_SELECTION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.IMAGING_SELECTION__STATUS:
				setStatus((ImagingSelectionStatus)null);
				return;
			case FhirPackage.IMAGING_SELECTION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.IMAGING_SELECTION__ISSUED:
				setIssued((Instant)null);
				return;
			case FhirPackage.IMAGING_SELECTION__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.IMAGING_SELECTION__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.IMAGING_SELECTION__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.IMAGING_SELECTION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.IMAGING_SELECTION__STUDY_UID:
				setStudyUid((Id)null);
				return;
			case FhirPackage.IMAGING_SELECTION__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case FhirPackage.IMAGING_SELECTION__ENDPOINT:
				getEndpoint().clear();
				return;
			case FhirPackage.IMAGING_SELECTION__SERIES_UID:
				setSeriesUid((Id)null);
				return;
			case FhirPackage.IMAGING_SELECTION__SERIES_NUMBER:
				setSeriesNumber((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_SELECTION__FRAME_OF_REFERENCE_UID:
				setFrameOfReferenceUid((Id)null);
				return;
			case FhirPackage.IMAGING_SELECTION__BODY_SITE:
				setBodySite((CodeableReference)null);
				return;
			case FhirPackage.IMAGING_SELECTION__FOCUS:
				getFocus().clear();
				return;
			case FhirPackage.IMAGING_SELECTION__INSTANCE:
				getInstance().clear();
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
			case FhirPackage.IMAGING_SELECTION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.IMAGING_SELECTION__STATUS:
				return status != null;
			case FhirPackage.IMAGING_SELECTION__SUBJECT:
				return subject != null;
			case FhirPackage.IMAGING_SELECTION__ISSUED:
				return issued != null;
			case FhirPackage.IMAGING_SELECTION__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.IMAGING_SELECTION__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.IMAGING_SELECTION__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.IMAGING_SELECTION__CODE:
				return code != null;
			case FhirPackage.IMAGING_SELECTION__STUDY_UID:
				return studyUid != null;
			case FhirPackage.IMAGING_SELECTION__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case FhirPackage.IMAGING_SELECTION__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case FhirPackage.IMAGING_SELECTION__SERIES_UID:
				return seriesUid != null;
			case FhirPackage.IMAGING_SELECTION__SERIES_NUMBER:
				return seriesNumber != null;
			case FhirPackage.IMAGING_SELECTION__FRAME_OF_REFERENCE_UID:
				return frameOfReferenceUid != null;
			case FhirPackage.IMAGING_SELECTION__BODY_SITE:
				return bodySite != null;
			case FhirPackage.IMAGING_SELECTION__FOCUS:
				return focus != null && !focus.isEmpty();
			case FhirPackage.IMAGING_SELECTION__INSTANCE:
				return instance != null && !instance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingSelectionImpl
