/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.Date;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Money;
import org.hl7.emf.fhir.PaymentReconciliationAllocation;
import org.hl7.emf.fhir.PositiveInt;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Reconciliation Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getTargetItemString <em>Target Item String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getTargetItemIdentifier <em>Target Item Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getTargetItemPositiveInt <em>Target Item Positive Int</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PaymentReconciliationAllocationImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentReconciliationAllocationImpl extends BackboneElementImpl implements PaymentReconciliationAllocation {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Identifier predecessor;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Reference target;

	/**
	 * The cached value of the '{@link #getTargetItemString() <em>Target Item String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetItemString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String targetItemString;

	/**
	 * The cached value of the '{@link #getTargetItemIdentifier() <em>Target Item Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetItemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier targetItemIdentifier;

	/**
	 * The cached value of the '{@link #getTargetItemPositiveInt() <em>Target Item Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetItemPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt targetItemPositiveInt;

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
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected Reference account;

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
	 * The cached value of the '{@link #getSubmitter() <em>Submitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitter()
	 * @generated
	 * @ordered
	 */
	protected Reference submitter;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Reference response;

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
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Reference responsible;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected Reference payee;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentReconciliationAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPaymentReconciliationAllocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(Identifier newPredecessor, NotificationChain msgs) {
		Identifier oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PREDECESSOR, oldPredecessor, newPredecessor);
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
	public void setPredecessor(Identifier newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null)
				msgs = ((InternalEObject)predecessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PREDECESSOR, null, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject)newPredecessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PREDECESSOR, null, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PREDECESSOR, newPredecessor, newPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Reference newTarget, NotificationChain msgs) {
		Reference oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET, oldTarget, newTarget);
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
	public void setTarget(Reference newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getTargetItemString() {
		return targetItemString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetItemString(org.hl7.emf.fhir.String newTargetItemString, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldTargetItemString = targetItemString;
		targetItemString = newTargetItemString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_STRING, oldTargetItemString, newTargetItemString);
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
	public void setTargetItemString(org.hl7.emf.fhir.String newTargetItemString) {
		if (newTargetItemString != targetItemString) {
			NotificationChain msgs = null;
			if (targetItemString != null)
				msgs = ((InternalEObject)targetItemString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_STRING, null, msgs);
			if (newTargetItemString != null)
				msgs = ((InternalEObject)newTargetItemString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_STRING, null, msgs);
			msgs = basicSetTargetItemString(newTargetItemString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_STRING, newTargetItemString, newTargetItemString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getTargetItemIdentifier() {
		return targetItemIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetItemIdentifier(Identifier newTargetItemIdentifier, NotificationChain msgs) {
		Identifier oldTargetItemIdentifier = targetItemIdentifier;
		targetItemIdentifier = newTargetItemIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_IDENTIFIER, oldTargetItemIdentifier, newTargetItemIdentifier);
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
	public void setTargetItemIdentifier(Identifier newTargetItemIdentifier) {
		if (newTargetItemIdentifier != targetItemIdentifier) {
			NotificationChain msgs = null;
			if (targetItemIdentifier != null)
				msgs = ((InternalEObject)targetItemIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_IDENTIFIER, null, msgs);
			if (newTargetItemIdentifier != null)
				msgs = ((InternalEObject)newTargetItemIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_IDENTIFIER, null, msgs);
			msgs = basicSetTargetItemIdentifier(newTargetItemIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_IDENTIFIER, newTargetItemIdentifier, newTargetItemIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getTargetItemPositiveInt() {
		return targetItemPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetItemPositiveInt(PositiveInt newTargetItemPositiveInt, NotificationChain msgs) {
		PositiveInt oldTargetItemPositiveInt = targetItemPositiveInt;
		targetItemPositiveInt = newTargetItemPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_POSITIVE_INT, oldTargetItemPositiveInt, newTargetItemPositiveInt);
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
	public void setTargetItemPositiveInt(PositiveInt newTargetItemPositiveInt) {
		if (newTargetItemPositiveInt != targetItemPositiveInt) {
			NotificationChain msgs = null;
			if (targetItemPositiveInt != null)
				msgs = ((InternalEObject)targetItemPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_POSITIVE_INT, null, msgs);
			if (newTargetItemPositiveInt != null)
				msgs = ((InternalEObject)newTargetItemPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_POSITIVE_INT, null, msgs);
			msgs = basicSetTargetItemPositiveInt(newTargetItemPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_POSITIVE_INT, newTargetItemPositiveInt, newTargetItemPositiveInt));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccount(Reference newAccount, NotificationChain msgs) {
		Reference oldAccount = account;
		account = newAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ACCOUNT, oldAccount, newAccount);
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
	public void setAccount(Reference newAccount) {
		if (newAccount != account) {
			NotificationChain msgs = null;
			if (account != null)
				msgs = ((InternalEObject)account).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ACCOUNT, null, msgs);
			if (newAccount != null)
				msgs = ((InternalEObject)newAccount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ACCOUNT, null, msgs);
			msgs = basicSetAccount(newAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ACCOUNT, newAccount, newAccount));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubmitter() {
		return submitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmitter(Reference newSubmitter, NotificationChain msgs) {
		Reference oldSubmitter = submitter;
		submitter = newSubmitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__SUBMITTER, oldSubmitter, newSubmitter);
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
	public void setSubmitter(Reference newSubmitter) {
		if (newSubmitter != submitter) {
			NotificationChain msgs = null;
			if (submitter != null)
				msgs = ((InternalEObject)submitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__SUBMITTER, null, msgs);
			if (newSubmitter != null)
				msgs = ((InternalEObject)newSubmitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__SUBMITTER, null, msgs);
			msgs = basicSetSubmitter(newSubmitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__SUBMITTER, newSubmitter, newSubmitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(Reference newResponse, NotificationChain msgs) {
		Reference oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSE, oldResponse, newResponse);
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
	public void setResponse(Reference newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__DATE, oldDate, newDate);
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
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible(Reference newResponsible, NotificationChain msgs) {
		Reference oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSIBLE, oldResponsible, newResponsible);
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
	public void setResponsible(Reference newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject)responsible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject)newResponsible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSIBLE, newResponsible, newResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(Reference newPayee, NotificationChain msgs) {
		Reference oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PAYEE, oldPayee, newPayee);
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
	public void setPayee(Reference newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__AMOUNT, oldAmount, newAmount);
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
	public void setAmount(Money newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PREDECESSOR:
				return basicSetPredecessor(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_STRING:
				return basicSetTargetItemString(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_IDENTIFIER:
				return basicSetTargetItemIdentifier(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_POSITIVE_INT:
				return basicSetTargetItemPositiveInt(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ACCOUNT:
				return basicSetAccount(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__SUBMITTER:
				return basicSetSubmitter(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSE:
				return basicSetResponse(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSIBLE:
				return basicSetResponsible(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PAYEE:
				return basicSetPayee(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__AMOUNT:
				return basicSetAmount(null, msgs);
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
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PREDECESSOR:
				return getPredecessor();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET:
				return getTarget();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_STRING:
				return getTargetItemString();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_IDENTIFIER:
				return getTargetItemIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_POSITIVE_INT:
				return getTargetItemPositiveInt();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ACCOUNT:
				return getAccount();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TYPE:
				return getType();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__SUBMITTER:
				return getSubmitter();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSE:
				return getResponse();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__DATE:
				return getDate();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSIBLE:
				return getResponsible();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PAYEE:
				return getPayee();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__AMOUNT:
				return getAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PREDECESSOR:
				setPredecessor((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET:
				setTarget((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_STRING:
				setTargetItemString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_IDENTIFIER:
				setTargetItemIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_POSITIVE_INT:
				setTargetItemPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ACCOUNT:
				setAccount((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__SUBMITTER:
				setSubmitter((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSE:
				setResponse((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSIBLE:
				setResponsible((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PAYEE:
				setPayee((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__AMOUNT:
				setAmount((Money)newValue);
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
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PREDECESSOR:
				setPredecessor((Identifier)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET:
				setTarget((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_STRING:
				setTargetItemString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_IDENTIFIER:
				setTargetItemIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_POSITIVE_INT:
				setTargetItemPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ACCOUNT:
				setAccount((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__SUBMITTER:
				setSubmitter((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSE:
				setResponse((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__DATE:
				setDate((Date)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSIBLE:
				setResponsible((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PAYEE:
				setPayee((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__AMOUNT:
				setAmount((Money)null);
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
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PREDECESSOR:
				return predecessor != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET:
				return target != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_STRING:
				return targetItemString != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_IDENTIFIER:
				return targetItemIdentifier != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TARGET_ITEM_POSITIVE_INT:
				return targetItemPositiveInt != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__ACCOUNT:
				return account != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__TYPE:
				return type != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__SUBMITTER:
				return submitter != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSE:
				return response != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__DATE:
				return date != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__RESPONSIBLE:
				return responsible != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__PAYEE:
				return payee != null;
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentReconciliationAllocationImpl
