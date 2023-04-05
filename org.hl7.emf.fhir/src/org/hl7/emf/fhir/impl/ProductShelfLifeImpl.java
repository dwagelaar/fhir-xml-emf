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
import org.hl7.emf.fhir.Duration;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.ProductShelfLife;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Shelf Life</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ProductShelfLifeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ProductShelfLifeImpl#getPeriodDuration <em>Period Duration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ProductShelfLifeImpl#getPeriodString <em>Period String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ProductShelfLifeImpl#getSpecialPrecautionsForStorage <em>Special Precautions For Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductShelfLifeImpl extends BackboneTypeImpl implements ProductShelfLife {
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
	 * The cached value of the '{@link #getPeriodDuration() <em>Period Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration periodDuration;

	/**
	 * The cached value of the '{@link #getPeriodString() <em>Period String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String periodString;

	/**
	 * The cached value of the '{@link #getSpecialPrecautionsForStorage() <em>Special Precautions For Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPrecautionsForStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialPrecautionsForStorage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductShelfLifeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProductShelfLife();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getPeriodDuration() {
		return periodDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodDuration(Duration newPeriodDuration, NotificationChain msgs) {
		Duration oldPeriodDuration = periodDuration;
		periodDuration = newPeriodDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_DURATION, oldPeriodDuration, newPeriodDuration);
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
	public void setPeriodDuration(Duration newPeriodDuration) {
		if (newPeriodDuration != periodDuration) {
			NotificationChain msgs = null;
			if (periodDuration != null)
				msgs = ((InternalEObject)periodDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_DURATION, null, msgs);
			if (newPeriodDuration != null)
				msgs = ((InternalEObject)newPeriodDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_DURATION, null, msgs);
			msgs = basicSetPeriodDuration(newPeriodDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_DURATION, newPeriodDuration, newPeriodDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getPeriodString() {
		return periodString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodString(org.hl7.emf.fhir.String newPeriodString, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldPeriodString = periodString;
		periodString = newPeriodString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_STRING, oldPeriodString, newPeriodString);
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
	public void setPeriodString(org.hl7.emf.fhir.String newPeriodString) {
		if (newPeriodString != periodString) {
			NotificationChain msgs = null;
			if (periodString != null)
				msgs = ((InternalEObject)periodString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_STRING, null, msgs);
			if (newPeriodString != null)
				msgs = ((InternalEObject)newPeriodString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_STRING, null, msgs);
			msgs = basicSetPeriodString(newPeriodString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_STRING, newPeriodString, newPeriodString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSpecialPrecautionsForStorage() {
		if (specialPrecautionsForStorage == null) {
			specialPrecautionsForStorage = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE);
		}
		return specialPrecautionsForStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_DURATION:
				return basicSetPeriodDuration(null, msgs);
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_STRING:
				return basicSetPeriodString(null, msgs);
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				return ((InternalEList<?>)getSpecialPrecautionsForStorage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				return getType();
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_DURATION:
				return getPeriodDuration();
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_STRING:
				return getPeriodString();
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				return getSpecialPrecautionsForStorage();
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
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_DURATION:
				setPeriodDuration((Duration)newValue);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_STRING:
				setPeriodString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				getSpecialPrecautionsForStorage().clear();
				getSpecialPrecautionsForStorage().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_DURATION:
				setPeriodDuration((Duration)null);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_STRING:
				setPeriodString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				getSpecialPrecautionsForStorage().clear();
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
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				return type != null;
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_DURATION:
				return periodDuration != null;
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD_STRING:
				return periodString != null;
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				return specialPrecautionsForStorage != null && !specialPrecautionsForStorage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductShelfLifeImpl
