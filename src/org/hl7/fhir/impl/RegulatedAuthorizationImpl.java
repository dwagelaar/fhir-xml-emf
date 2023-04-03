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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RegulatedAuthorization;
import org.hl7.fhir.RegulatedAuthorizationCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulated Authorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getRegulator <em>Regulator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getAttachedDocument <em>Attached Document</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationImpl#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatedAuthorizationImpl extends DomainResourceImpl implements RegulatedAuthorization {
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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subject;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> region;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime statusDate;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period validityPeriod;

	/**
	 * The cached value of the '{@link #getIndication() <em>Indication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> indication;

	/**
	 * The cached value of the '{@link #getIntendedUse() <em>Intended Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUse()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept intendedUse;

	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> basis;

	/**
	 * The cached value of the '{@link #getHolder() <em>Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolder()
	 * @generated
	 * @ordered
	 */
	protected Reference holder;

	/**
	 * The cached value of the '{@link #getRegulator() <em>Regulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulator()
	 * @generated
	 * @ordered
	 */
	protected Reference regulator;

	/**
	 * The cached value of the '{@link #getAttachedDocument() <em>Attached Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> attachedDocument;

	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected RegulatedAuthorizationCase case_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatedAuthorizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRegulatedAuthorization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.REGULATED_AUTHORIZATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REGULATED_AUTHORIZATION__SUBJECT);
		}
		return subject;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRegion() {
		if (region == null) {
			region = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.REGULATED_AUTHORIZATION__REGION);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusDate(DateTime newStatusDate, NotificationChain msgs) {
		DateTime oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__STATUS_DATE, oldStatusDate, newStatusDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(DateTime newStatusDate) {
		if (newStatusDate != statusDate) {
			NotificationChain msgs = null;
			if (statusDate != null)
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__STATUS_DATE, newStatusDate, newStatusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityPeriod(Period newValidityPeriod, NotificationChain msgs) {
		Period oldValidityPeriod = validityPeriod;
		validityPeriod = newValidityPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__VALIDITY_PERIOD, oldValidityPeriod, newValidityPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityPeriod(Period newValidityPeriod) {
		if (newValidityPeriod != validityPeriod) {
			NotificationChain msgs = null;
			if (validityPeriod != null)
				msgs = ((InternalEObject)validityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__VALIDITY_PERIOD, null, msgs);
			if (newValidityPeriod != null)
				msgs = ((InternalEObject)newValidityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__VALIDITY_PERIOD, null, msgs);
			msgs = basicSetValidityPeriod(newValidityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__VALIDITY_PERIOD, newValidityPeriod, newValidityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getIndication() {
		if (indication == null) {
			indication = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.REGULATED_AUTHORIZATION__INDICATION);
		}
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getIntendedUse() {
		return intendedUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntendedUse(CodeableConcept newIntendedUse, NotificationChain msgs) {
		CodeableConcept oldIntendedUse = intendedUse;
		intendedUse = newIntendedUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__INTENDED_USE, oldIntendedUse, newIntendedUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntendedUse(CodeableConcept newIntendedUse) {
		if (newIntendedUse != intendedUse) {
			NotificationChain msgs = null;
			if (intendedUse != null)
				msgs = ((InternalEObject)intendedUse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__INTENDED_USE, null, msgs);
			if (newIntendedUse != null)
				msgs = ((InternalEObject)newIntendedUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__INTENDED_USE, null, msgs);
			msgs = basicSetIntendedUse(newIntendedUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__INTENDED_USE, newIntendedUse, newIntendedUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBasis() {
		if (basis == null) {
			basis = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.REGULATED_AUTHORIZATION__BASIS);
		}
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getHolder() {
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolder(Reference newHolder, NotificationChain msgs) {
		Reference oldHolder = holder;
		holder = newHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__HOLDER, oldHolder, newHolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolder(Reference newHolder) {
		if (newHolder != holder) {
			NotificationChain msgs = null;
			if (holder != null)
				msgs = ((InternalEObject)holder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__HOLDER, null, msgs);
			if (newHolder != null)
				msgs = ((InternalEObject)newHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__HOLDER, null, msgs);
			msgs = basicSetHolder(newHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__HOLDER, newHolder, newHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRegulator() {
		return regulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulator(Reference newRegulator, NotificationChain msgs) {
		Reference oldRegulator = regulator;
		regulator = newRegulator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__REGULATOR, oldRegulator, newRegulator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulator(Reference newRegulator) {
		if (newRegulator != regulator) {
			NotificationChain msgs = null;
			if (regulator != null)
				msgs = ((InternalEObject)regulator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__REGULATOR, null, msgs);
			if (newRegulator != null)
				msgs = ((InternalEObject)newRegulator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__REGULATOR, null, msgs);
			msgs = basicSetRegulator(newRegulator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__REGULATOR, newRegulator, newRegulator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAttachedDocument() {
		if (attachedDocument == null) {
			attachedDocument = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REGULATED_AUTHORIZATION__ATTACHED_DOCUMENT);
		}
		return attachedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatedAuthorizationCase getCase() {
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCase(RegulatedAuthorizationCase newCase, NotificationChain msgs) {
		RegulatedAuthorizationCase oldCase = case_;
		case_ = newCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__CASE, oldCase, newCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCase(RegulatedAuthorizationCase newCase) {
		if (newCase != case_) {
			NotificationChain msgs = null;
			if (case_ != null)
				msgs = ((InternalEObject)case_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__CASE, null, msgs);
			if (newCase != null)
				msgs = ((InternalEObject)newCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION__CASE, null, msgs);
			msgs = basicSetCase(newCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION__CASE, newCase, newCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.REGULATED_AUTHORIZATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__VALIDITY_PERIOD:
				return basicSetValidityPeriod(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__INDICATION:
				return ((InternalEList<?>)getIndication()).basicRemove(otherEnd, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__INTENDED_USE:
				return basicSetIntendedUse(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__BASIS:
				return ((InternalEList<?>)getBasis()).basicRemove(otherEnd, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__HOLDER:
				return basicSetHolder(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__REGULATOR:
				return basicSetRegulator(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__ATTACHED_DOCUMENT:
				return ((InternalEList<?>)getAttachedDocument()).basicRemove(otherEnd, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION__CASE:
				return basicSetCase(null, msgs);
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
			case FhirPackage.REGULATED_AUTHORIZATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.REGULATED_AUTHORIZATION__SUBJECT:
				return getSubject();
			case FhirPackage.REGULATED_AUTHORIZATION__TYPE:
				return getType();
			case FhirPackage.REGULATED_AUTHORIZATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.REGULATED_AUTHORIZATION__REGION:
				return getRegion();
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS:
				return getStatus();
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS_DATE:
				return getStatusDate();
			case FhirPackage.REGULATED_AUTHORIZATION__VALIDITY_PERIOD:
				return getValidityPeriod();
			case FhirPackage.REGULATED_AUTHORIZATION__INDICATION:
				return getIndication();
			case FhirPackage.REGULATED_AUTHORIZATION__INTENDED_USE:
				return getIntendedUse();
			case FhirPackage.REGULATED_AUTHORIZATION__BASIS:
				return getBasis();
			case FhirPackage.REGULATED_AUTHORIZATION__HOLDER:
				return getHolder();
			case FhirPackage.REGULATED_AUTHORIZATION__REGULATOR:
				return getRegulator();
			case FhirPackage.REGULATED_AUTHORIZATION__ATTACHED_DOCUMENT:
				return getAttachedDocument();
			case FhirPackage.REGULATED_AUTHORIZATION__CASE:
				return getCase();
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
			case FhirPackage.REGULATED_AUTHORIZATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS_DATE:
				setStatusDate((DateTime)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__INDICATION:
				getIndication().clear();
				getIndication().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__INTENDED_USE:
				setIntendedUse((CodeableConcept)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__BASIS:
				getBasis().clear();
				getBasis().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__HOLDER:
				setHolder((Reference)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__REGULATOR:
				setRegulator((Reference)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__ATTACHED_DOCUMENT:
				getAttachedDocument().clear();
				getAttachedDocument().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__CASE:
				setCase((RegulatedAuthorizationCase)newValue);
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
			case FhirPackage.REGULATED_AUTHORIZATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__REGION:
				getRegion().clear();
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS_DATE:
				setStatusDate((DateTime)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__INDICATION:
				getIndication().clear();
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__INTENDED_USE:
				setIntendedUse((CodeableConcept)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__BASIS:
				getBasis().clear();
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__HOLDER:
				setHolder((Reference)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__REGULATOR:
				setRegulator((Reference)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__ATTACHED_DOCUMENT:
				getAttachedDocument().clear();
				return;
			case FhirPackage.REGULATED_AUTHORIZATION__CASE:
				setCase((RegulatedAuthorizationCase)null);
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
			case FhirPackage.REGULATED_AUTHORIZATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.REGULATED_AUTHORIZATION__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.REGULATED_AUTHORIZATION__TYPE:
				return type != null;
			case FhirPackage.REGULATED_AUTHORIZATION__DESCRIPTION:
				return description != null;
			case FhirPackage.REGULATED_AUTHORIZATION__REGION:
				return region != null && !region.isEmpty();
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS:
				return status != null;
			case FhirPackage.REGULATED_AUTHORIZATION__STATUS_DATE:
				return statusDate != null;
			case FhirPackage.REGULATED_AUTHORIZATION__VALIDITY_PERIOD:
				return validityPeriod != null;
			case FhirPackage.REGULATED_AUTHORIZATION__INDICATION:
				return indication != null && !indication.isEmpty();
			case FhirPackage.REGULATED_AUTHORIZATION__INTENDED_USE:
				return intendedUse != null;
			case FhirPackage.REGULATED_AUTHORIZATION__BASIS:
				return basis != null && !basis.isEmpty();
			case FhirPackage.REGULATED_AUTHORIZATION__HOLDER:
				return holder != null;
			case FhirPackage.REGULATED_AUTHORIZATION__REGULATOR:
				return regulator != null;
			case FhirPackage.REGULATED_AUTHORIZATION__ATTACHED_DOCUMENT:
				return attachedDocument != null && !attachedDocument.isEmpty();
			case FhirPackage.REGULATED_AUTHORIZATION__CASE:
				return case_ != null;
		}
		return super.eIsSet(featureID);
	}

} //RegulatedAuthorizationImpl
