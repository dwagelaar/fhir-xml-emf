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

import org.hl7.emf.fhir.Account;
import org.hl7.emf.fhir.AccountBalance;
import org.hl7.emf.fhir.AccountCoverage;
import org.hl7.emf.fhir.AccountDiagnosis;
import org.hl7.emf.fhir.AccountGuarantor;
import org.hl7.emf.fhir.AccountProcedure;
import org.hl7.emf.fhir.AccountRelatedAccount;
import org.hl7.emf.fhir.AccountStatus;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Instant;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getBillingStatus <em>Billing Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getServicePeriod <em>Service Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getGuarantor <em>Guarantor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getRelatedAccount <em>Related Account</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountImpl#getCalculatedAt <em>Calculated At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends DomainResourceImpl implements Account {
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
	protected AccountStatus status;

	/**
	 * The cached value of the '{@link #getBillingStatus() <em>Billing Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept billingStatus;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String name;

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
	 * The cached value of the '{@link #getServicePeriod() <em>Service Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period servicePeriod;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountCoverage> coverage;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getGuarantor() <em>Guarantor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuarantor()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountGuarantor> guarantor;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountProcedure> procedure;

	/**
	 * The cached value of the '{@link #getRelatedAccount() <em>Related Account</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAccount()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountRelatedAccount> relatedAccount;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept currency;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountBalance> balance;

	/**
	 * The cached value of the '{@link #getCalculatedAt() <em>Calculated At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedAt()
	 * @generated
	 * @ordered
	 */
	protected Instant calculatedAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAccount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ACCOUNT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(AccountStatus newStatus, NotificationChain msgs) {
		AccountStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__STATUS, oldStatus, newStatus);
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
	public void setStatus(AccountStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getBillingStatus() {
		return billingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillingStatus(CodeableConcept newBillingStatus, NotificationChain msgs) {
		CodeableConcept oldBillingStatus = billingStatus;
		billingStatus = newBillingStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__BILLING_STATUS, oldBillingStatus, newBillingStatus);
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
	public void setBillingStatus(CodeableConcept newBillingStatus) {
		if (newBillingStatus != billingStatus) {
			NotificationChain msgs = null;
			if (billingStatus != null)
				msgs = ((InternalEObject)billingStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__BILLING_STATUS, null, msgs);
			if (newBillingStatus != null)
				msgs = ((InternalEObject)newBillingStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__BILLING_STATUS, null, msgs);
			msgs = basicSetBillingStatus(newBillingStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__BILLING_STATUS, newBillingStatus, newBillingStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.emf.fhir.String newName, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__NAME, oldName, newName);
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
	public void setName(org.hl7.emf.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ACCOUNT__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getServicePeriod() {
		return servicePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicePeriod(Period newServicePeriod, NotificationChain msgs) {
		Period oldServicePeriod = servicePeriod;
		servicePeriod = newServicePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__SERVICE_PERIOD, oldServicePeriod, newServicePeriod);
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
	public void setServicePeriod(Period newServicePeriod) {
		if (newServicePeriod != servicePeriod) {
			NotificationChain msgs = null;
			if (servicePeriod != null)
				msgs = ((InternalEObject)servicePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__SERVICE_PERIOD, null, msgs);
			if (newServicePeriod != null)
				msgs = ((InternalEObject)newServicePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__SERVICE_PERIOD, null, msgs);
			msgs = basicSetServicePeriod(newServicePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__SERVICE_PERIOD, newServicePeriod, newServicePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccountCoverage> getCoverage() {
		if (coverage == null) {
			coverage = new EObjectContainmentEList<AccountCoverage>(AccountCoverage.class, this, FhirPackage.ACCOUNT__COVERAGE);
		}
		return coverage;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__OWNER, oldOwner, newOwner);
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
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__OWNER, newOwner, newOwner));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccountGuarantor> getGuarantor() {
		if (guarantor == null) {
			guarantor = new EObjectContainmentEList<AccountGuarantor>(AccountGuarantor.class, this, FhirPackage.ACCOUNT__GUARANTOR);
		}
		return guarantor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccountDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<AccountDiagnosis>(AccountDiagnosis.class, this, FhirPackage.ACCOUNT__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccountProcedure> getProcedure() {
		if (procedure == null) {
			procedure = new EObjectContainmentEList<AccountProcedure>(AccountProcedure.class, this, FhirPackage.ACCOUNT__PROCEDURE);
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccountRelatedAccount> getRelatedAccount() {
		if (relatedAccount == null) {
			relatedAccount = new EObjectContainmentEList<AccountRelatedAccount>(AccountRelatedAccount.class, this, FhirPackage.ACCOUNT__RELATED_ACCOUNT);
		}
		return relatedAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrency(CodeableConcept newCurrency, NotificationChain msgs) {
		CodeableConcept oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__CURRENCY, oldCurrency, newCurrency);
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
	public void setCurrency(CodeableConcept newCurrency) {
		if (newCurrency != currency) {
			NotificationChain msgs = null;
			if (currency != null)
				msgs = ((InternalEObject)currency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__CURRENCY, null, msgs);
			if (newCurrency != null)
				msgs = ((InternalEObject)newCurrency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__CURRENCY, null, msgs);
			msgs = basicSetCurrency(newCurrency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__CURRENCY, newCurrency, newCurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccountBalance> getBalance() {
		if (balance == null) {
			balance = new EObjectContainmentEList<AccountBalance>(AccountBalance.class, this, FhirPackage.ACCOUNT__BALANCE);
		}
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getCalculatedAt() {
		return calculatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculatedAt(Instant newCalculatedAt, NotificationChain msgs) {
		Instant oldCalculatedAt = calculatedAt;
		calculatedAt = newCalculatedAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__CALCULATED_AT, oldCalculatedAt, newCalculatedAt);
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
	public void setCalculatedAt(Instant newCalculatedAt) {
		if (newCalculatedAt != calculatedAt) {
			NotificationChain msgs = null;
			if (calculatedAt != null)
				msgs = ((InternalEObject)calculatedAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__CALCULATED_AT, null, msgs);
			if (newCalculatedAt != null)
				msgs = ((InternalEObject)newCalculatedAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__CALCULATED_AT, null, msgs);
			msgs = basicSetCalculatedAt(newCalculatedAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__CALCULATED_AT, newCalculatedAt, newCalculatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ACCOUNT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ACCOUNT__BILLING_STATUS:
				return basicSetBillingStatus(null, msgs);
			case FhirPackage.ACCOUNT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.ACCOUNT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.ACCOUNT__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT__SERVICE_PERIOD:
				return basicSetServicePeriod(null, msgs);
			case FhirPackage.ACCOUNT__COVERAGE:
				return ((InternalEList<?>)getCoverage()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT__OWNER:
				return basicSetOwner(null, msgs);
			case FhirPackage.ACCOUNT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ACCOUNT__GUARANTOR:
				return ((InternalEList<?>)getGuarantor()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT__RELATED_ACCOUNT:
				return ((InternalEList<?>)getRelatedAccount()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT__CURRENCY:
				return basicSetCurrency(null, msgs);
			case FhirPackage.ACCOUNT__BALANCE:
				return ((InternalEList<?>)getBalance()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT__CALCULATED_AT:
				return basicSetCalculatedAt(null, msgs);
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
			case FhirPackage.ACCOUNT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ACCOUNT__STATUS:
				return getStatus();
			case FhirPackage.ACCOUNT__BILLING_STATUS:
				return getBillingStatus();
			case FhirPackage.ACCOUNT__TYPE:
				return getType();
			case FhirPackage.ACCOUNT__NAME:
				return getName();
			case FhirPackage.ACCOUNT__SUBJECT:
				return getSubject();
			case FhirPackage.ACCOUNT__SERVICE_PERIOD:
				return getServicePeriod();
			case FhirPackage.ACCOUNT__COVERAGE:
				return getCoverage();
			case FhirPackage.ACCOUNT__OWNER:
				return getOwner();
			case FhirPackage.ACCOUNT__DESCRIPTION:
				return getDescription();
			case FhirPackage.ACCOUNT__GUARANTOR:
				return getGuarantor();
			case FhirPackage.ACCOUNT__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.ACCOUNT__PROCEDURE:
				return getProcedure();
			case FhirPackage.ACCOUNT__RELATED_ACCOUNT:
				return getRelatedAccount();
			case FhirPackage.ACCOUNT__CURRENCY:
				return getCurrency();
			case FhirPackage.ACCOUNT__BALANCE:
				return getBalance();
			case FhirPackage.ACCOUNT__CALCULATED_AT:
				return getCalculatedAt();
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
			case FhirPackage.ACCOUNT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ACCOUNT__STATUS:
				setStatus((AccountStatus)newValue);
				return;
			case FhirPackage.ACCOUNT__BILLING_STATUS:
				setBillingStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.ACCOUNT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.ACCOUNT__NAME:
				setName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.ACCOUNT__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ACCOUNT__SERVICE_PERIOD:
				setServicePeriod((Period)newValue);
				return;
			case FhirPackage.ACCOUNT__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends AccountCoverage>)newValue);
				return;
			case FhirPackage.ACCOUNT__OWNER:
				setOwner((Reference)newValue);
				return;
			case FhirPackage.ACCOUNT__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.ACCOUNT__GUARANTOR:
				getGuarantor().clear();
				getGuarantor().addAll((Collection<? extends AccountGuarantor>)newValue);
				return;
			case FhirPackage.ACCOUNT__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends AccountDiagnosis>)newValue);
				return;
			case FhirPackage.ACCOUNT__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends AccountProcedure>)newValue);
				return;
			case FhirPackage.ACCOUNT__RELATED_ACCOUNT:
				getRelatedAccount().clear();
				getRelatedAccount().addAll((Collection<? extends AccountRelatedAccount>)newValue);
				return;
			case FhirPackage.ACCOUNT__CURRENCY:
				setCurrency((CodeableConcept)newValue);
				return;
			case FhirPackage.ACCOUNT__BALANCE:
				getBalance().clear();
				getBalance().addAll((Collection<? extends AccountBalance>)newValue);
				return;
			case FhirPackage.ACCOUNT__CALCULATED_AT:
				setCalculatedAt((Instant)newValue);
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
			case FhirPackage.ACCOUNT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ACCOUNT__STATUS:
				setStatus((AccountStatus)null);
				return;
			case FhirPackage.ACCOUNT__BILLING_STATUS:
				setBillingStatus((CodeableConcept)null);
				return;
			case FhirPackage.ACCOUNT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.ACCOUNT__NAME:
				setName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.ACCOUNT__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.ACCOUNT__SERVICE_PERIOD:
				setServicePeriod((Period)null);
				return;
			case FhirPackage.ACCOUNT__COVERAGE:
				getCoverage().clear();
				return;
			case FhirPackage.ACCOUNT__OWNER:
				setOwner((Reference)null);
				return;
			case FhirPackage.ACCOUNT__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.ACCOUNT__GUARANTOR:
				getGuarantor().clear();
				return;
			case FhirPackage.ACCOUNT__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirPackage.ACCOUNT__PROCEDURE:
				getProcedure().clear();
				return;
			case FhirPackage.ACCOUNT__RELATED_ACCOUNT:
				getRelatedAccount().clear();
				return;
			case FhirPackage.ACCOUNT__CURRENCY:
				setCurrency((CodeableConcept)null);
				return;
			case FhirPackage.ACCOUNT__BALANCE:
				getBalance().clear();
				return;
			case FhirPackage.ACCOUNT__CALCULATED_AT:
				setCalculatedAt((Instant)null);
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
			case FhirPackage.ACCOUNT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ACCOUNT__STATUS:
				return status != null;
			case FhirPackage.ACCOUNT__BILLING_STATUS:
				return billingStatus != null;
			case FhirPackage.ACCOUNT__TYPE:
				return type != null;
			case FhirPackage.ACCOUNT__NAME:
				return name != null;
			case FhirPackage.ACCOUNT__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.ACCOUNT__SERVICE_PERIOD:
				return servicePeriod != null;
			case FhirPackage.ACCOUNT__COVERAGE:
				return coverage != null && !coverage.isEmpty();
			case FhirPackage.ACCOUNT__OWNER:
				return owner != null;
			case FhirPackage.ACCOUNT__DESCRIPTION:
				return description != null;
			case FhirPackage.ACCOUNT__GUARANTOR:
				return guarantor != null && !guarantor.isEmpty();
			case FhirPackage.ACCOUNT__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirPackage.ACCOUNT__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case FhirPackage.ACCOUNT__RELATED_ACCOUNT:
				return relatedAccount != null && !relatedAccount.isEmpty();
			case FhirPackage.ACCOUNT__CURRENCY:
				return currency != null;
			case FhirPackage.ACCOUNT__BALANCE:
				return balance != null && !balance.isEmpty();
			case FhirPackage.ACCOUNT__CALCULATED_AT:
				return calculatedAt != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountImpl
