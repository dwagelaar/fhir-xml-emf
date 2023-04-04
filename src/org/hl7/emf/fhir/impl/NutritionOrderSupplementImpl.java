/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.NutritionOrderSchedule1;
import org.hl7.emf.fhir.NutritionOrderSupplement;
import org.hl7.emf.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Supplement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderSupplementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderSupplementImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderSupplementImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderSupplementImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderSupplementImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderSupplementImpl extends BackboneElementImpl implements NutritionOrderSupplement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference type;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String productName;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderSchedule1 schedule;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderSupplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionOrderSupplement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableReference newType, NotificationChain msgs) {
		CodeableReference oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, oldType, newType);
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
	public void setType(CodeableReference newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductName(org.hl7.emf.fhir.String newProductName, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, oldProductName, newProductName);
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
	public void setProductName(org.hl7.emf.fhir.String newProductName) {
		if (newProductName != productName) {
			NotificationChain msgs = null;
			if (productName != null)
				msgs = ((InternalEObject)productName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, null, msgs);
			if (newProductName != null)
				msgs = ((InternalEObject)newProductName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, null, msgs);
			msgs = basicSetProductName(newProductName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, newProductName, newProductName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderSchedule1 getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(NutritionOrderSchedule1 newSchedule, NotificationChain msgs) {
		NutritionOrderSchedule1 oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE, oldSchedule, newSchedule);
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
	public void setSchedule(NutritionOrderSchedule1 newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(org.hl7.emf.fhir.String newInstruction, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, oldInstruction, newInstruction);
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
	public void setInstruction(org.hl7.emf.fhir.String newInstruction) {
		if (newInstruction != instruction) {
			NotificationChain msgs = null;
			if (instruction != null)
				msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, null, msgs);
			if (newInstruction != null)
				msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, null, msgs);
			msgs = basicSetInstruction(newInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, newInstruction, newInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				return basicSetProductName(null, msgs);
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				return basicSetInstruction(null, msgs);
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
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				return getType();
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				return getProductName();
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				return getSchedule();
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				return getQuantity();
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				return getInstruction();
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
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				setType((CodeableReference)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				setProductName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				setSchedule((NutritionOrderSchedule1)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				setInstruction((org.hl7.emf.fhir.String)newValue);
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
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				setType((CodeableReference)null);
				return;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				setProductName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				setSchedule((NutritionOrderSchedule1)null);
				return;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				setInstruction((org.hl7.emf.fhir.String)null);
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
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				return type != null;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				return productName != null;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				return schedule != null;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				return quantity != null;
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderSupplementImpl
