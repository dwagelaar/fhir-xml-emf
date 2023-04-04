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

import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.DeviceDefinitionChargeItem;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Charge Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionChargeItemImpl#getChargeItemCode <em>Charge Item Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionChargeItemImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionChargeItemImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionChargeItemImpl#getUseContext <em>Use Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionChargeItemImpl extends BackboneElementImpl implements DeviceDefinitionChargeItem {
	/**
	 * The cached value of the '{@link #getChargeItemCode() <em>Charge Item Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeItemCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference chargeItemCode;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected Quantity count;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionChargeItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinitionChargeItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getChargeItemCode() {
		return chargeItemCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeItemCode(CodeableReference newChargeItemCode, NotificationChain msgs) {
		CodeableReference oldChargeItemCode = chargeItemCode;
		chargeItemCode = newChargeItemCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__CHARGE_ITEM_CODE, oldChargeItemCode, newChargeItemCode);
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
	public void setChargeItemCode(CodeableReference newChargeItemCode) {
		if (newChargeItemCode != chargeItemCode) {
			NotificationChain msgs = null;
			if (chargeItemCode != null)
				msgs = ((InternalEObject)chargeItemCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__CHARGE_ITEM_CODE, null, msgs);
			if (newChargeItemCode != null)
				msgs = ((InternalEObject)newChargeItemCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__CHARGE_ITEM_CODE, null, msgs);
			msgs = basicSetChargeItemCode(newChargeItemCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__CHARGE_ITEM_CODE, newChargeItemCode, newChargeItemCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(Quantity newCount, NotificationChain msgs) {
		Quantity oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__COUNT, oldCount, newCount);
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
	public void setCount(Quantity newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__CHARGE_ITEM_CODE:
				return basicSetChargeItemCode(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__COUNT:
				return basicSetCount(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__CHARGE_ITEM_CODE:
				return getChargeItemCode();
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__COUNT:
				return getCount();
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__USE_CONTEXT:
				return getUseContext();
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
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__CHARGE_ITEM_CODE:
				setChargeItemCode((CodeableReference)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__COUNT:
				setCount((Quantity)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
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
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__CHARGE_ITEM_CODE:
				setChargeItemCode((CodeableReference)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__COUNT:
				setCount((Quantity)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__USE_CONTEXT:
				getUseContext().clear();
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
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__CHARGE_ITEM_CODE:
				return chargeItemCode != null;
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__COUNT:
				return count != null;
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionChargeItemImpl
