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

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.CompositionStatus;
import org.hl7.emf.fhir.DocumentReference;
import org.hl7.emf.fhir.DocumentReferenceAttester;
import org.hl7.emf.fhir.DocumentReferenceContent;
import org.hl7.emf.fhir.DocumentReferenceRelatesTo;
import org.hl7.emf.fhir.DocumentReferenceStatus;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Instant;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getFacilityType <em>Facility Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getPracticeSetting <em>Practice Setting</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getAttester <em>Attester</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceImpl extends DomainResourceImpl implements DocumentReference {
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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String version;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferenceStatus status;

	/**
	 * The cached value of the '{@link #getDocStatus() <em>Doc Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocStatus()
	 * @generated
	 * @ordered
	 */
	protected CompositionStatus docStatus;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modality;

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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> context;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> event;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> bodySite;

	/**
	 * The cached value of the '{@link #getFacilityType() <em>Facility Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept facilityType;

	/**
	 * The cached value of the '{@link #getPracticeSetting() <em>Practice Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPracticeSetting()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept practiceSetting;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Instant date;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> author;

	/**
	 * The cached value of the '{@link #getAttester() <em>Attester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttester()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceAttester> attester;

	/**
	 * The cached value of the '{@link #getCustodian() <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected Reference custodian;

	/**
	 * The cached value of the '{@link #getRelatesTo() <em>Relates To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceRelatesTo> relatesTo;

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
	 * The cached value of the '{@link #getSecurityLabel() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> securityLabel;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceContent> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDocumentReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.emf.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__VERSION, oldVersion, newVersion);
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
	public void setVersion(org.hl7.emf.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DOCUMENT_REFERENCE__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DocumentReferenceStatus newStatus, NotificationChain msgs) {
		DocumentReferenceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__STATUS, oldStatus, newStatus);
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
	public void setStatus(DocumentReferenceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionStatus getDocStatus() {
		return docStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocStatus(CompositionStatus newDocStatus, NotificationChain msgs) {
		CompositionStatus oldDocStatus = docStatus;
		docStatus = newDocStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS, oldDocStatus, newDocStatus);
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
	public void setDocStatus(CompositionStatus newDocStatus) {
		if (newDocStatus != docStatus) {
			NotificationChain msgs = null;
			if (docStatus != null)
				msgs = ((InternalEObject)docStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS, null, msgs);
			if (newDocStatus != null)
				msgs = ((InternalEObject)newDocStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS, null, msgs);
			msgs = basicSetDocStatus(newDocStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS, newDocStatus, newDocStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getModality() {
		if (modality == null) {
			modality = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DOCUMENT_REFERENCE__MODALITY);
		}
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DOCUMENT_REFERENCE__CATEGORY);
		}
		return category;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getContext() {
		if (context == null) {
			context = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DOCUMENT_REFERENCE__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.DOCUMENT_REFERENCE__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.DOCUMENT_REFERENCE__BODY_SITE);
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFacilityType() {
		return facilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilityType(CodeableConcept newFacilityType, NotificationChain msgs) {
		CodeableConcept oldFacilityType = facilityType;
		facilityType = newFacilityType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__FACILITY_TYPE, oldFacilityType, newFacilityType);
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
	public void setFacilityType(CodeableConcept newFacilityType) {
		if (newFacilityType != facilityType) {
			NotificationChain msgs = null;
			if (facilityType != null)
				msgs = ((InternalEObject)facilityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__FACILITY_TYPE, null, msgs);
			if (newFacilityType != null)
				msgs = ((InternalEObject)newFacilityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__FACILITY_TYPE, null, msgs);
			msgs = basicSetFacilityType(newFacilityType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__FACILITY_TYPE, newFacilityType, newFacilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPracticeSetting() {
		return practiceSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPracticeSetting(CodeableConcept newPracticeSetting, NotificationChain msgs) {
		CodeableConcept oldPracticeSetting = practiceSetting;
		practiceSetting = newPracticeSetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__PRACTICE_SETTING, oldPracticeSetting, newPracticeSetting);
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
	public void setPracticeSetting(CodeableConcept newPracticeSetting) {
		if (newPracticeSetting != practiceSetting) {
			NotificationChain msgs = null;
			if (practiceSetting != null)
				msgs = ((InternalEObject)practiceSetting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__PRACTICE_SETTING, null, msgs);
			if (newPracticeSetting != null)
				msgs = ((InternalEObject)newPracticeSetting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__PRACTICE_SETTING, null, msgs);
			msgs = basicSetPracticeSetting(newPracticeSetting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__PRACTICE_SETTING, newPracticeSetting, newPracticeSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Instant newDate, NotificationChain msgs) {
		Instant oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DATE, oldDate, newDate);
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
	public void setDate(Instant newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DOCUMENT_REFERENCE__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentReferenceAttester> getAttester() {
		if (attester == null) {
			attester = new EObjectContainmentEList<DocumentReferenceAttester>(DocumentReferenceAttester.class, this, FhirPackage.DOCUMENT_REFERENCE__ATTESTER);
		}
		return attester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCustodian() {
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustodian(Reference newCustodian, NotificationChain msgs) {
		Reference oldCustodian = custodian;
		custodian = newCustodian;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN, oldCustodian, newCustodian);
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
	public void setCustodian(Reference newCustodian) {
		if (newCustodian != custodian) {
			NotificationChain msgs = null;
			if (custodian != null)
				msgs = ((InternalEObject)custodian).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN, null, msgs);
			if (newCustodian != null)
				msgs = ((InternalEObject)newCustodian).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN, null, msgs);
			msgs = basicSetCustodian(newCustodian, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN, newCustodian, newCustodian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentReferenceRelatesTo> getRelatesTo() {
		if (relatesTo == null) {
			relatesTo = new EObjectContainmentEList<DocumentReferenceRelatesTo>(DocumentReferenceRelatesTo.class, this, FhirPackage.DOCUMENT_REFERENCE__RELATES_TO);
		}
		return relatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSecurityLabel() {
		if (securityLabel == null) {
			securityLabel = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL);
		}
		return securityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentReferenceContent> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<DocumentReferenceContent>(DocumentReferenceContent.class, this, FhirPackage.DOCUMENT_REFERENCE__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				return basicSetDocStatus(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__MODALITY:
				return ((InternalEList<?>)getModality()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__FACILITY_TYPE:
				return basicSetFacilityType(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__PRACTICE_SETTING:
				return basicSetPracticeSetting(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__ATTESTER:
				return ((InternalEList<?>)getAttester()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				return basicSetCustodian(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				return ((InternalEList<?>)getRelatesTo()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabel()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DOCUMENT_REFERENCE__VERSION:
				return getVersion();
			case FhirPackage.DOCUMENT_REFERENCE__BASED_ON:
				return getBasedOn();
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				return getStatus();
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				return getDocStatus();
			case FhirPackage.DOCUMENT_REFERENCE__MODALITY:
				return getModality();
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				return getType();
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				return getCategory();
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				return getSubject();
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				return getContext();
			case FhirPackage.DOCUMENT_REFERENCE__EVENT:
				return getEvent();
			case FhirPackage.DOCUMENT_REFERENCE__BODY_SITE:
				return getBodySite();
			case FhirPackage.DOCUMENT_REFERENCE__FACILITY_TYPE:
				return getFacilityType();
			case FhirPackage.DOCUMENT_REFERENCE__PRACTICE_SETTING:
				return getPracticeSetting();
			case FhirPackage.DOCUMENT_REFERENCE__PERIOD:
				return getPeriod();
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				return getDate();
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				return getAuthor();
			case FhirPackage.DOCUMENT_REFERENCE__ATTESTER:
				return getAttester();
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				return getCustodian();
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				return getRelatesTo();
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				return getSecurityLabel();
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				return getContent();
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
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__VERSION:
				setVersion((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				setStatus((DocumentReferenceStatus)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				setDocStatus((CompositionStatus)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__MODALITY:
				getModality().clear();
				getModality().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__FACILITY_TYPE:
				setFacilityType((CodeableConcept)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__PRACTICE_SETTING:
				setPracticeSetting((CodeableConcept)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				setDate((Instant)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__ATTESTER:
				getAttester().clear();
				getAttester().addAll((Collection<? extends DocumentReferenceAttester>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				setCustodian((Reference)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				getRelatesTo().clear();
				getRelatesTo().addAll((Collection<? extends DocumentReferenceRelatesTo>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				getSecurityLabel().clear();
				getSecurityLabel().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends DocumentReferenceContent>)newValue);
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
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__VERSION:
				setVersion((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				setStatus((DocumentReferenceStatus)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				setDocStatus((CompositionStatus)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__MODALITY:
				getModality().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				getContext().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__EVENT:
				getEvent().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__BODY_SITE:
				getBodySite().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__FACILITY_TYPE:
				setFacilityType((CodeableConcept)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__PRACTICE_SETTING:
				setPracticeSetting((CodeableConcept)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				setDate((Instant)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__ATTESTER:
				getAttester().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				setCustodian((Reference)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				getRelatesTo().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				getSecurityLabel().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				getContent().clear();
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
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__VERSION:
				return version != null;
			case FhirPackage.DOCUMENT_REFERENCE__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				return status != null;
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				return docStatus != null;
			case FhirPackage.DOCUMENT_REFERENCE__MODALITY:
				return modality != null && !modality.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				return type != null;
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				return subject != null;
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				return context != null && !context.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__EVENT:
				return event != null && !event.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__FACILITY_TYPE:
				return facilityType != null;
			case FhirPackage.DOCUMENT_REFERENCE__PRACTICE_SETTING:
				return practiceSetting != null;
			case FhirPackage.DOCUMENT_REFERENCE__PERIOD:
				return period != null;
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				return date != null;
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__ATTESTER:
				return attester != null && !attester.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				return custodian != null;
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				return relatesTo != null && !relatesTo.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				return description != null;
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				return securityLabel != null && !securityLabel.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				return content != null && !content.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceImpl
