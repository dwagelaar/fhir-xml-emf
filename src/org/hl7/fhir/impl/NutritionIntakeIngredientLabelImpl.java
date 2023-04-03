/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.NutritionIntakeIngredientLabel;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Intake Ingredient Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeIngredientLabelImpl#getNutrient <em>Nutrient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeIngredientLabelImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionIntakeIngredientLabelImpl extends BackboneElementImpl implements NutritionIntakeIngredientLabel {
	/**
	 * The cached value of the '{@link #getNutrient() <em>Nutrient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutrient()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference nutrient;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionIntakeIngredientLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionIntakeIngredientLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getNutrient() {
		return nutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutrient(CodeableReference newNutrient, NotificationChain msgs) {
		CodeableReference oldNutrient = nutrient;
		nutrient = newNutrient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__NUTRIENT, oldNutrient, newNutrient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutrient(CodeableReference newNutrient) {
		if (newNutrient != nutrient) {
			NotificationChain msgs = null;
			if (nutrient != null)
				msgs = ((InternalEObject)nutrient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__NUTRIENT, null, msgs);
			if (newNutrient != null)
				msgs = ((InternalEObject)newNutrient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__NUTRIENT, null, msgs);
			msgs = basicSetNutrient(newNutrient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__NUTRIENT, newNutrient, newNutrient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__AMOUNT, oldAmount, newAmount);
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
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__NUTRIENT:
				return basicSetNutrient(null, msgs);
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__AMOUNT:
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
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__NUTRIENT:
				return getNutrient();
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__AMOUNT:
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
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__NUTRIENT:
				setNutrient((CodeableReference)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__AMOUNT:
				setAmount((Quantity)newValue);
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
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__NUTRIENT:
				setNutrient((CodeableReference)null);
				return;
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__AMOUNT:
				setAmount((Quantity)null);
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
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__NUTRIENT:
				return nutrient != null;
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionIntakeIngredientLabelImpl
