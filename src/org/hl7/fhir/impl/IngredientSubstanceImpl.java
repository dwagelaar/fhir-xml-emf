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

import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.IngredientStrength;
import org.hl7.fhir.IngredientSubstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient Substance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.IngredientSubstanceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientSubstanceImpl#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngredientSubstanceImpl extends BackboneElementImpl implements IngredientSubstance {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference code;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected EList<IngredientStrength> strength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngredientSubstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getIngredientSubstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableReference newCode, NotificationChain msgs) {
		CodeableReference oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_SUBSTANCE__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableReference newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_SUBSTANCE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_SUBSTANCE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_SUBSTANCE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IngredientStrength> getStrength() {
		if (strength == null) {
			strength = new EObjectContainmentEList<IngredientStrength>(IngredientStrength.class, this, FhirPackage.INGREDIENT_SUBSTANCE__STRENGTH);
		}
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INGREDIENT_SUBSTANCE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.INGREDIENT_SUBSTANCE__STRENGTH:
				return ((InternalEList<?>)getStrength()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.INGREDIENT_SUBSTANCE__CODE:
				return getCode();
			case FhirPackage.INGREDIENT_SUBSTANCE__STRENGTH:
				return getStrength();
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
			case FhirPackage.INGREDIENT_SUBSTANCE__CODE:
				setCode((CodeableReference)newValue);
				return;
			case FhirPackage.INGREDIENT_SUBSTANCE__STRENGTH:
				getStrength().clear();
				getStrength().addAll((Collection<? extends IngredientStrength>)newValue);
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
			case FhirPackage.INGREDIENT_SUBSTANCE__CODE:
				setCode((CodeableReference)null);
				return;
			case FhirPackage.INGREDIENT_SUBSTANCE__STRENGTH:
				getStrength().clear();
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
			case FhirPackage.INGREDIENT_SUBSTANCE__CODE:
				return code != null;
			case FhirPackage.INGREDIENT_SUBSTANCE__STRENGTH:
				return strength != null && !strength.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IngredientSubstanceImpl
