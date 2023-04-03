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
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.PaymentOutcome;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationAllocation;
import org.hl7.fhir.PaymentReconciliationProcessNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Reconciliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getIssuerType <em>Issuer Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getPaymentIssuer <em>Payment Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getCardBrand <em>Card Brand</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getTenderedAmount <em>Tendered Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getReturnedAmount <em>Returned Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getPaymentIdentifier <em>Payment Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getProcessNote <em>Process Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentReconciliationImpl extends DomainResourceImpl implements PaymentReconciliation {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FinancialResourceStatusCodes status;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept kind;

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
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Reference enterer;

	/**
	 * The cached value of the '{@link #getIssuerType() <em>Issuer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept issuerType;

	/**
	 * The cached value of the '{@link #getPaymentIssuer() <em>Payment Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentIssuer()
	 * @generated
	 * @ordered
	 */
	protected Reference paymentIssuer;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected Reference requestor;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected PaymentOutcome outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String disposition;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getCardBrand() <em>Card Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardBrand()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String cardBrand;

	/**
	 * The cached value of the '{@link #getAccountNumber() <em>Account Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String accountNumber;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String processor;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String referenceNumber;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String authorization;

	/**
	 * The cached value of the '{@link #getTenderedAmount() <em>Tendered Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenderedAmount()
	 * @generated
	 * @ordered
	 */
	protected Money tenderedAmount;

	/**
	 * The cached value of the '{@link #getReturnedAmount() <em>Returned Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnedAmount()
	 * @generated
	 * @ordered
	 */
	protected Money returnedAmount;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Money amount;

	/**
	 * The cached value of the '{@link #getPaymentIdentifier() <em>Payment Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier paymentIdentifier;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentReconciliationAllocation> allocation;

	/**
	 * The cached value of the '{@link #getFormCode() <em>Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept formCode;

	/**
	 * The cached value of the '{@link #getProcessNote() <em>Process Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNote()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentReconciliationProcessNote> processNote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentReconciliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPaymentReconciliation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(FinancialResourceStatusCodes newStatus, NotificationChain msgs) {
		FinancialResourceStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(FinancialResourceStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(CodeableConcept newKind, NotificationChain msgs) {
		CodeableConcept oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__KIND, oldKind, newKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CodeableConcept newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterer(Reference newEnterer, NotificationChain msgs) {
		Reference oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ENTERER, oldEnterer, newEnterer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterer(Reference newEnterer) {
		if (newEnterer != enterer) {
			NotificationChain msgs = null;
			if (enterer != null)
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ENTERER, newEnterer, newEnterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getIssuerType() {
		return issuerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuerType(CodeableConcept newIssuerType, NotificationChain msgs) {
		CodeableConcept oldIssuerType = issuerType;
		issuerType = newIssuerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ISSUER_TYPE, oldIssuerType, newIssuerType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuerType(CodeableConcept newIssuerType) {
		if (newIssuerType != issuerType) {
			NotificationChain msgs = null;
			if (issuerType != null)
				msgs = ((InternalEObject)issuerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ISSUER_TYPE, null, msgs);
			if (newIssuerType != null)
				msgs = ((InternalEObject)newIssuerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ISSUER_TYPE, null, msgs);
			msgs = basicSetIssuerType(newIssuerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ISSUER_TYPE, newIssuerType, newIssuerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPaymentIssuer() {
		return paymentIssuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentIssuer(Reference newPaymentIssuer, NotificationChain msgs) {
		Reference oldPaymentIssuer = paymentIssuer;
		paymentIssuer = newPaymentIssuer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER, oldPaymentIssuer, newPaymentIssuer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentIssuer(Reference newPaymentIssuer) {
		if (newPaymentIssuer != paymentIssuer) {
			NotificationChain msgs = null;
			if (paymentIssuer != null)
				msgs = ((InternalEObject)paymentIssuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER, null, msgs);
			if (newPaymentIssuer != null)
				msgs = ((InternalEObject)newPaymentIssuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER, null, msgs);
			msgs = basicSetPaymentIssuer(newPaymentIssuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER, newPaymentIssuer, newPaymentIssuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestor() {
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestor(Reference newRequestor, NotificationChain msgs) {
		Reference oldRequestor = requestor;
		requestor = newRequestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR, oldRequestor, newRequestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestor(Reference newRequestor) {
		if (newRequestor != requestor) {
			NotificationChain msgs = null;
			if (requestor != null)
				msgs = ((InternalEObject)requestor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR, null, msgs);
			if (newRequestor != null)
				msgs = ((InternalEObject)newRequestor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR, null, msgs);
			msgs = basicSetRequestor(newRequestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR, newRequestor, newRequestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentOutcome getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(PaymentOutcome newOutcome, NotificationChain msgs) {
		PaymentOutcome oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(PaymentOutcome newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(org.hl7.fhir.String newDisposition, NotificationChain msgs) {
		org.hl7.fhir.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, oldDisposition, newDisposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.hl7.fhir.String newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCardBrand() {
		return cardBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardBrand(org.hl7.fhir.String newCardBrand, NotificationChain msgs) {
		org.hl7.fhir.String oldCardBrand = cardBrand;
		cardBrand = newCardBrand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__CARD_BRAND, oldCardBrand, newCardBrand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardBrand(org.hl7.fhir.String newCardBrand) {
		if (newCardBrand != cardBrand) {
			NotificationChain msgs = null;
			if (cardBrand != null)
				msgs = ((InternalEObject)cardBrand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__CARD_BRAND, null, msgs);
			if (newCardBrand != null)
				msgs = ((InternalEObject)newCardBrand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__CARD_BRAND, null, msgs);
			msgs = basicSetCardBrand(newCardBrand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__CARD_BRAND, newCardBrand, newCardBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccountNumber(org.hl7.fhir.String newAccountNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldAccountNumber = accountNumber;
		accountNumber = newAccountNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ACCOUNT_NUMBER, oldAccountNumber, newAccountNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountNumber(org.hl7.fhir.String newAccountNumber) {
		if (newAccountNumber != accountNumber) {
			NotificationChain msgs = null;
			if (accountNumber != null)
				msgs = ((InternalEObject)accountNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ACCOUNT_NUMBER, null, msgs);
			if (newAccountNumber != null)
				msgs = ((InternalEObject)newAccountNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ACCOUNT_NUMBER, null, msgs);
			msgs = basicSetAccountNumber(newAccountNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ACCOUNT_NUMBER, newAccountNumber, newAccountNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationDate(Date newExpirationDate, NotificationChain msgs) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__EXPIRATION_DATE, oldExpirationDate, newExpirationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate) {
		if (newExpirationDate != expirationDate) {
			NotificationChain msgs = null;
			if (expirationDate != null)
				msgs = ((InternalEObject)expirationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__EXPIRATION_DATE, null, msgs);
			if (newExpirationDate != null)
				msgs = ((InternalEObject)newExpirationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__EXPIRATION_DATE, null, msgs);
			msgs = basicSetExpirationDate(newExpirationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__EXPIRATION_DATE, newExpirationDate, newExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessor(org.hl7.fhir.String newProcessor, NotificationChain msgs) {
		org.hl7.fhir.String oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PROCESSOR, oldProcessor, newProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(org.hl7.fhir.String newProcessor) {
		if (newProcessor != processor) {
			NotificationChain msgs = null;
			if (processor != null)
				msgs = ((InternalEObject)processor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PROCESSOR, null, msgs);
			if (newProcessor != null)
				msgs = ((InternalEObject)newProcessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PROCESSOR, null, msgs);
			msgs = basicSetProcessor(newProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PROCESSOR, newProcessor, newProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceNumber(org.hl7.fhir.String newReferenceNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REFERENCE_NUMBER, oldReferenceNumber, newReferenceNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNumber(org.hl7.fhir.String newReferenceNumber) {
		if (newReferenceNumber != referenceNumber) {
			NotificationChain msgs = null;
			if (referenceNumber != null)
				msgs = ((InternalEObject)referenceNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REFERENCE_NUMBER, null, msgs);
			if (newReferenceNumber != null)
				msgs = ((InternalEObject)newReferenceNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REFERENCE_NUMBER, null, msgs);
			msgs = basicSetReferenceNumber(newReferenceNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REFERENCE_NUMBER, newReferenceNumber, newReferenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAuthorization() {
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorization(org.hl7.fhir.String newAuthorization, NotificationChain msgs) {
		org.hl7.fhir.String oldAuthorization = authorization;
		authorization = newAuthorization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__AUTHORIZATION, oldAuthorization, newAuthorization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(org.hl7.fhir.String newAuthorization) {
		if (newAuthorization != authorization) {
			NotificationChain msgs = null;
			if (authorization != null)
				msgs = ((InternalEObject)authorization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__AUTHORIZATION, null, msgs);
			if (newAuthorization != null)
				msgs = ((InternalEObject)newAuthorization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__AUTHORIZATION, null, msgs);
			msgs = basicSetAuthorization(newAuthorization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__AUTHORIZATION, newAuthorization, newAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTenderedAmount() {
		return tenderedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTenderedAmount(Money newTenderedAmount, NotificationChain msgs) {
		Money oldTenderedAmount = tenderedAmount;
		tenderedAmount = newTenderedAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__TENDERED_AMOUNT, oldTenderedAmount, newTenderedAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenderedAmount(Money newTenderedAmount) {
		if (newTenderedAmount != tenderedAmount) {
			NotificationChain msgs = null;
			if (tenderedAmount != null)
				msgs = ((InternalEObject)tenderedAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__TENDERED_AMOUNT, null, msgs);
			if (newTenderedAmount != null)
				msgs = ((InternalEObject)newTenderedAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__TENDERED_AMOUNT, null, msgs);
			msgs = basicSetTenderedAmount(newTenderedAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__TENDERED_AMOUNT, newTenderedAmount, newTenderedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getReturnedAmount() {
		return returnedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnedAmount(Money newReturnedAmount, NotificationChain msgs) {
		Money oldReturnedAmount = returnedAmount;
		returnedAmount = newReturnedAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__RETURNED_AMOUNT, oldReturnedAmount, newReturnedAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnedAmount(Money newReturnedAmount) {
		if (newReturnedAmount != returnedAmount) {
			NotificationChain msgs = null;
			if (returnedAmount != null)
				msgs = ((InternalEObject)returnedAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__RETURNED_AMOUNT, null, msgs);
			if (newReturnedAmount != null)
				msgs = ((InternalEObject)newReturnedAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__RETURNED_AMOUNT, null, msgs);
			msgs = basicSetReturnedAmount(newReturnedAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__RETURNED_AMOUNT, newReturnedAmount, newReturnedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Money newAmount, NotificationChain msgs) {
		Money oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(Money newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPaymentIdentifier() {
		return paymentIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentIdentifier(Identifier newPaymentIdentifier, NotificationChain msgs) {
		Identifier oldPaymentIdentifier = paymentIdentifier;
		paymentIdentifier = newPaymentIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER, oldPaymentIdentifier, newPaymentIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentIdentifier(Identifier newPaymentIdentifier) {
		if (newPaymentIdentifier != paymentIdentifier) {
			NotificationChain msgs = null;
			if (paymentIdentifier != null)
				msgs = ((InternalEObject)paymentIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER, null, msgs);
			if (newPaymentIdentifier != null)
				msgs = ((InternalEObject)newPaymentIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER, null, msgs);
			msgs = basicSetPaymentIdentifier(newPaymentIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER, newPaymentIdentifier, newPaymentIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaymentReconciliationAllocation> getAllocation() {
		if (allocation == null) {
			allocation = new EObjectContainmentEList<PaymentReconciliationAllocation>(PaymentReconciliationAllocation.class, this, FhirPackage.PAYMENT_RECONCILIATION__ALLOCATION);
		}
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFormCode() {
		return formCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormCode(CodeableConcept newFormCode, NotificationChain msgs) {
		CodeableConcept oldFormCode = formCode;
		formCode = newFormCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE, oldFormCode, newFormCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormCode(CodeableConcept newFormCode) {
		if (newFormCode != formCode) {
			NotificationChain msgs = null;
			if (formCode != null)
				msgs = ((InternalEObject)formCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE, null, msgs);
			if (newFormCode != null)
				msgs = ((InternalEObject)newFormCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE, null, msgs);
			msgs = basicSetFormCode(newFormCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE, newFormCode, newFormCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaymentReconciliationProcessNote> getProcessNote() {
		if (processNote == null) {
			processNote = new EObjectContainmentEList<PaymentReconciliationProcessNote>(PaymentReconciliationProcessNote.class, this, FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE);
		}
		return processNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__KIND:
				return basicSetKind(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__ENTERER:
				return basicSetEnterer(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__ISSUER_TYPE:
				return basicSetIssuerType(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				return basicSetPaymentIssuer(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				return basicSetRequestor(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__CARD_BRAND:
				return basicSetCardBrand(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__ACCOUNT_NUMBER:
				return basicSetAccountNumber(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__EXPIRATION_DATE:
				return basicSetExpirationDate(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESSOR:
				return basicSetProcessor(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__REFERENCE_NUMBER:
				return basicSetReferenceNumber(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__AUTHORIZATION:
				return basicSetAuthorization(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__TENDERED_AMOUNT:
				return basicSetTenderedAmount(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__RETURNED_AMOUNT:
				return basicSetReturnedAmount(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__AMOUNT:
				return basicSetAmount(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				return basicSetPaymentIdentifier(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__ALLOCATION:
				return ((InternalEList<?>)getAllocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				return basicSetFormCode(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				return ((InternalEList<?>)getProcessNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION__TYPE:
				return getType();
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				return getStatus();
			case FhirPackage.PAYMENT_RECONCILIATION__KIND:
				return getKind();
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				return getPeriod();
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				return getCreated();
			case FhirPackage.PAYMENT_RECONCILIATION__ENTERER:
				return getEnterer();
			case FhirPackage.PAYMENT_RECONCILIATION__ISSUER_TYPE:
				return getIssuerType();
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				return getPaymentIssuer();
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				return getRequest();
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				return getRequestor();
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				return getOutcome();
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				return getDisposition();
			case FhirPackage.PAYMENT_RECONCILIATION__DATE:
				return getDate();
			case FhirPackage.PAYMENT_RECONCILIATION__LOCATION:
				return getLocation();
			case FhirPackage.PAYMENT_RECONCILIATION__METHOD:
				return getMethod();
			case FhirPackage.PAYMENT_RECONCILIATION__CARD_BRAND:
				return getCardBrand();
			case FhirPackage.PAYMENT_RECONCILIATION__ACCOUNT_NUMBER:
				return getAccountNumber();
			case FhirPackage.PAYMENT_RECONCILIATION__EXPIRATION_DATE:
				return getExpirationDate();
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESSOR:
				return getProcessor();
			case FhirPackage.PAYMENT_RECONCILIATION__REFERENCE_NUMBER:
				return getReferenceNumber();
			case FhirPackage.PAYMENT_RECONCILIATION__AUTHORIZATION:
				return getAuthorization();
			case FhirPackage.PAYMENT_RECONCILIATION__TENDERED_AMOUNT:
				return getTenderedAmount();
			case FhirPackage.PAYMENT_RECONCILIATION__RETURNED_AMOUNT:
				return getReturnedAmount();
			case FhirPackage.PAYMENT_RECONCILIATION__AMOUNT:
				return getAmount();
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				return getPaymentIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION__ALLOCATION:
				return getAllocation();
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				return getFormCode();
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				return getProcessNote();
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				setStatus((FinancialResourceStatusCodes)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__KIND:
				setKind((CodeableConcept)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ISSUER_TYPE:
				setIssuerType((CodeableConcept)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				setPaymentIssuer((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				setRequestor((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				setOutcome((PaymentOutcome)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__CARD_BRAND:
				setCardBrand((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ACCOUNT_NUMBER:
				setAccountNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESSOR:
				setProcessor((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REFERENCE_NUMBER:
				setReferenceNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__AUTHORIZATION:
				setAuthorization((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__TENDERED_AMOUNT:
				setTenderedAmount((Money)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__RETURNED_AMOUNT:
				setReturnedAmount((Money)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__AMOUNT:
				setAmount((Money)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				setPaymentIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ALLOCATION:
				getAllocation().clear();
				getAllocation().addAll((Collection<? extends PaymentReconciliationAllocation>)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				setFormCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				getProcessNote().clear();
				getProcessNote().addAll((Collection<? extends PaymentReconciliationProcessNote>)newValue);
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				setStatus((FinancialResourceStatusCodes)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__KIND:
				setKind((CodeableConcept)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ENTERER:
				setEnterer((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ISSUER_TYPE:
				setIssuerType((CodeableConcept)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				setPaymentIssuer((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				setRequestor((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				setOutcome((PaymentOutcome)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DATE:
				setDate((Date)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__CARD_BRAND:
				setCardBrand((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ACCOUNT_NUMBER:
				setAccountNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__EXPIRATION_DATE:
				setExpirationDate((Date)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESSOR:
				setProcessor((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REFERENCE_NUMBER:
				setReferenceNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__AUTHORIZATION:
				setAuthorization((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__TENDERED_AMOUNT:
				setTenderedAmount((Money)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__RETURNED_AMOUNT:
				setReturnedAmount((Money)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__AMOUNT:
				setAmount((Money)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				setPaymentIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ALLOCATION:
				getAllocation().clear();
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				setFormCode((CodeableConcept)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				getProcessNote().clear();
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PAYMENT_RECONCILIATION__TYPE:
				return type != null;
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				return status != null;
			case FhirPackage.PAYMENT_RECONCILIATION__KIND:
				return kind != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				return period != null;
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				return created != null;
			case FhirPackage.PAYMENT_RECONCILIATION__ENTERER:
				return enterer != null;
			case FhirPackage.PAYMENT_RECONCILIATION__ISSUER_TYPE:
				return issuerType != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				return paymentIssuer != null;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				return request != null;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				return requestor != null;
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				return outcome != null;
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				return disposition != null;
			case FhirPackage.PAYMENT_RECONCILIATION__DATE:
				return date != null;
			case FhirPackage.PAYMENT_RECONCILIATION__LOCATION:
				return location != null;
			case FhirPackage.PAYMENT_RECONCILIATION__METHOD:
				return method != null;
			case FhirPackage.PAYMENT_RECONCILIATION__CARD_BRAND:
				return cardBrand != null;
			case FhirPackage.PAYMENT_RECONCILIATION__ACCOUNT_NUMBER:
				return accountNumber != null;
			case FhirPackage.PAYMENT_RECONCILIATION__EXPIRATION_DATE:
				return expirationDate != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESSOR:
				return processor != null;
			case FhirPackage.PAYMENT_RECONCILIATION__REFERENCE_NUMBER:
				return referenceNumber != null;
			case FhirPackage.PAYMENT_RECONCILIATION__AUTHORIZATION:
				return authorization != null;
			case FhirPackage.PAYMENT_RECONCILIATION__TENDERED_AMOUNT:
				return tenderedAmount != null;
			case FhirPackage.PAYMENT_RECONCILIATION__RETURNED_AMOUNT:
				return returnedAmount != null;
			case FhirPackage.PAYMENT_RECONCILIATION__AMOUNT:
				return amount != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				return paymentIdentifier != null;
			case FhirPackage.PAYMENT_RECONCILIATION__ALLOCATION:
				return allocation != null && !allocation.isEmpty();
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				return formCode != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				return processNote != null && !processNote.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PaymentReconciliationImpl
