/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.NutritionIntakeConsumedItem;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Intake Consumed Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeConsumedItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeConsumedItemImpl#getNutritionProduct <em>Nutrition Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeConsumedItemImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeConsumedItemImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeConsumedItemImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeConsumedItemImpl#getNotConsumed <em>Not Consumed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeConsumedItemImpl#getNotConsumedReason <em>Not Consumed Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionIntakeConsumedItemImpl extends BackboneElementImpl implements NutritionIntakeConsumedItem {
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
	 * The cached value of the '{@link #getNutritionProduct() <em>Nutrition Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionProduct()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference nutritionProduct;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Timing schedule;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Quantity amount;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected Quantity rate;

	/**
	 * The cached value of the '{@link #getNotConsumed() <em>Not Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotConsumed()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean notConsumed;

	/**
	 * The cached value of the '{@link #getNotConsumedReason() <em>Not Consumed Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotConsumedReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept notConsumedReason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionIntakeConsumedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionIntakeConsumedItem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getNutritionProduct() {
		return nutritionProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionProduct(CodeableReference newNutritionProduct, NotificationChain msgs) {
		CodeableReference oldNutritionProduct = nutritionProduct;
		nutritionProduct = newNutritionProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NUTRITION_PRODUCT, oldNutritionProduct, newNutritionProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutritionProduct(CodeableReference newNutritionProduct) {
		if (newNutritionProduct != nutritionProduct) {
			NotificationChain msgs = null;
			if (nutritionProduct != null)
				msgs = ((InternalEObject)nutritionProduct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NUTRITION_PRODUCT, null, msgs);
			if (newNutritionProduct != null)
				msgs = ((InternalEObject)newNutritionProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NUTRITION_PRODUCT, null, msgs);
			msgs = basicSetNutritionProduct(newNutritionProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NUTRITION_PRODUCT, newNutritionProduct, newNutritionProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Timing newSchedule, NotificationChain msgs) {
		Timing oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__SCHEDULE, oldSchedule, newSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Timing newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Quantity newAmount, NotificationChain msgs) {
		Quantity oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(Quantity newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRate(Quantity newRate, NotificationChain msgs) {
		Quantity oldRate = rate;
		rate = newRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__RATE, oldRate, newRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(Quantity newRate) {
		if (newRate != rate) {
			NotificationChain msgs = null;
			if (rate != null)
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__RATE, newRate, newRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getNotConsumed() {
		return notConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotConsumed(org.hl7.fhir.Boolean newNotConsumed, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldNotConsumed = notConsumed;
		notConsumed = newNotConsumed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED, oldNotConsumed, newNotConsumed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotConsumed(org.hl7.fhir.Boolean newNotConsumed) {
		if (newNotConsumed != notConsumed) {
			NotificationChain msgs = null;
			if (notConsumed != null)
				msgs = ((InternalEObject)notConsumed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED, null, msgs);
			if (newNotConsumed != null)
				msgs = ((InternalEObject)newNotConsumed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED, null, msgs);
			msgs = basicSetNotConsumed(newNotConsumed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED, newNotConsumed, newNotConsumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getNotConsumedReason() {
		return notConsumedReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotConsumedReason(CodeableConcept newNotConsumedReason, NotificationChain msgs) {
		CodeableConcept oldNotConsumedReason = notConsumedReason;
		notConsumedReason = newNotConsumedReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED_REASON, oldNotConsumedReason, newNotConsumedReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotConsumedReason(CodeableConcept newNotConsumedReason) {
		if (newNotConsumedReason != notConsumedReason) {
			NotificationChain msgs = null;
			if (notConsumedReason != null)
				msgs = ((InternalEObject)notConsumedReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED_REASON, null, msgs);
			if (newNotConsumedReason != null)
				msgs = ((InternalEObject)newNotConsumedReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED_REASON, null, msgs);
			msgs = basicSetNotConsumedReason(newNotConsumedReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED_REASON, newNotConsumedReason, newNotConsumedReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NUTRITION_PRODUCT:
				return basicSetNutritionProduct(null, msgs);
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__AMOUNT:
				return basicSetAmount(null, msgs);
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__RATE:
				return basicSetRate(null, msgs);
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED:
				return basicSetNotConsumed(null, msgs);
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED_REASON:
				return basicSetNotConsumedReason(null, msgs);
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
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__TYPE:
				return getType();
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NUTRITION_PRODUCT:
				return getNutritionProduct();
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__SCHEDULE:
				return getSchedule();
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__AMOUNT:
				return getAmount();
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__RATE:
				return getRate();
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED:
				return getNotConsumed();
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED_REASON:
				return getNotConsumedReason();
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
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NUTRITION_PRODUCT:
				setNutritionProduct((CodeableReference)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__SCHEDULE:
				setSchedule((Timing)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__AMOUNT:
				setAmount((Quantity)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__RATE:
				setRate((Quantity)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED:
				setNotConsumed((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED_REASON:
				setNotConsumedReason((CodeableConcept)newValue);
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
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NUTRITION_PRODUCT:
				setNutritionProduct((CodeableReference)null);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__SCHEDULE:
				setSchedule((Timing)null);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__AMOUNT:
				setAmount((Quantity)null);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__RATE:
				setRate((Quantity)null);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED:
				setNotConsumed((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED_REASON:
				setNotConsumedReason((CodeableConcept)null);
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
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__TYPE:
				return type != null;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NUTRITION_PRODUCT:
				return nutritionProduct != null;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__SCHEDULE:
				return schedule != null;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__AMOUNT:
				return amount != null;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__RATE:
				return rate != null;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED:
				return notConsumed != null;
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM__NOT_CONSUMED_REASON:
				return notConsumedReason != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionIntakeConsumedItemImpl
