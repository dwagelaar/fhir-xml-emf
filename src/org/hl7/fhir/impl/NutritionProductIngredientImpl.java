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
import org.hl7.fhir.NutritionProductIngredient;
import org.hl7.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Product Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionProductIngredientImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionProductIngredientImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionProductIngredientImpl extends BackboneElementImpl implements NutritionProductIngredient {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference item;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Ratio> amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionProductIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionProductIngredient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(CodeableReference newItem, NotificationChain msgs) {
		CodeableReference oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INGREDIENT__ITEM, oldItem, newItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(CodeableReference newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INGREDIENT__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INGREDIENT__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INGREDIENT__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ratio> getAmount() {
		if (amount == null) {
			amount = new EObjectContainmentEList<Ratio>(Ratio.class, this, FhirPackage.NUTRITION_PRODUCT_INGREDIENT__AMOUNT);
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__ITEM:
				return basicSetItem(null, msgs);
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__AMOUNT:
				return ((InternalEList<?>)getAmount()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__ITEM:
				return getItem();
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__AMOUNT:
				return getAmount();
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
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__ITEM:
				setItem((CodeableReference)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__AMOUNT:
				getAmount().clear();
				getAmount().addAll((Collection<? extends Ratio>)newValue);
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
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__ITEM:
				setItem((CodeableReference)null);
				return;
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__AMOUNT:
				getAmount().clear();
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
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__ITEM:
				return item != null;
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT__AMOUNT:
				return amount != null && !amount.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NutritionProductIngredientImpl
