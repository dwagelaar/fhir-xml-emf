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

import org.hl7.emf.fhir.Annotation;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.NutritionProduct;
import org.hl7.emf.fhir.NutritionProductCharacteristic;
import org.hl7.emf.fhir.NutritionProductIngredient;
import org.hl7.emf.fhir.NutritionProductInstance;
import org.hl7.emf.fhir.NutritionProductNutrient;
import org.hl7.emf.fhir.NutritionProductStatus;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getNutrient <em>Nutrient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getKnownAllergen <em>Known Allergen</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionProductImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionProductImpl extends DomainResourceImpl implements NutritionProduct {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected NutritionProductStatus status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturer;

	/**
	 * The cached value of the '{@link #getNutrient() <em>Nutrient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutrient()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionProductNutrient> nutrient;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionProductIngredient> ingredient;

	/**
	 * The cached value of the '{@link #getKnownAllergen() <em>Known Allergen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownAllergen()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> knownAllergen;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionProductCharacteristic> characteristic;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionProductInstance> instance;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionProductStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(NutritionProductStatus newStatus, NotificationChain msgs) {
		NutritionProductStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT__STATUS, oldStatus, newStatus);
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
	public void setStatus(NutritionProductStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.NUTRITION_PRODUCT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.NUTRITION_PRODUCT__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionProductNutrient> getNutrient() {
		if (nutrient == null) {
			nutrient = new EObjectContainmentEList<NutritionProductNutrient>(NutritionProductNutrient.class, this, FhirPackage.NUTRITION_PRODUCT__NUTRIENT);
		}
		return nutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionProductIngredient> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<NutritionProductIngredient>(NutritionProductIngredient.class, this, FhirPackage.NUTRITION_PRODUCT__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getKnownAllergen() {
		if (knownAllergen == null) {
			knownAllergen = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.NUTRITION_PRODUCT__KNOWN_ALLERGEN);
		}
		return knownAllergen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionProductCharacteristic> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<NutritionProductCharacteristic>(NutritionProductCharacteristic.class, this, FhirPackage.NUTRITION_PRODUCT__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionProductInstance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList<NutritionProductInstance>(NutritionProductInstance.class, this, FhirPackage.NUTRITION_PRODUCT__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.NUTRITION_PRODUCT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_PRODUCT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.NUTRITION_PRODUCT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.NUTRITION_PRODUCT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_PRODUCT__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_PRODUCT__NUTRIENT:
				return ((InternalEList<?>)getNutrient()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_PRODUCT__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_PRODUCT__KNOWN_ALLERGEN:
				return ((InternalEList<?>)getKnownAllergen()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_PRODUCT__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_PRODUCT__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_PRODUCT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.NUTRITION_PRODUCT__CODE:
				return getCode();
			case FhirPackage.NUTRITION_PRODUCT__STATUS:
				return getStatus();
			case FhirPackage.NUTRITION_PRODUCT__CATEGORY:
				return getCategory();
			case FhirPackage.NUTRITION_PRODUCT__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.NUTRITION_PRODUCT__NUTRIENT:
				return getNutrient();
			case FhirPackage.NUTRITION_PRODUCT__INGREDIENT:
				return getIngredient();
			case FhirPackage.NUTRITION_PRODUCT__KNOWN_ALLERGEN:
				return getKnownAllergen();
			case FhirPackage.NUTRITION_PRODUCT__CHARACTERISTIC:
				return getCharacteristic();
			case FhirPackage.NUTRITION_PRODUCT__INSTANCE:
				return getInstance();
			case FhirPackage.NUTRITION_PRODUCT__NOTE:
				return getNote();
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
			case FhirPackage.NUTRITION_PRODUCT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT__STATUS:
				setStatus((NutritionProductStatus)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT__NUTRIENT:
				getNutrient().clear();
				getNutrient().addAll((Collection<? extends NutritionProductNutrient>)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends NutritionProductIngredient>)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT__KNOWN_ALLERGEN:
				getKnownAllergen().clear();
				getKnownAllergen().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends NutritionProductCharacteristic>)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends NutritionProductInstance>)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.NUTRITION_PRODUCT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.NUTRITION_PRODUCT__STATUS:
				setStatus((NutritionProductStatus)null);
				return;
			case FhirPackage.NUTRITION_PRODUCT__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.NUTRITION_PRODUCT__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FhirPackage.NUTRITION_PRODUCT__NUTRIENT:
				getNutrient().clear();
				return;
			case FhirPackage.NUTRITION_PRODUCT__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.NUTRITION_PRODUCT__KNOWN_ALLERGEN:
				getKnownAllergen().clear();
				return;
			case FhirPackage.NUTRITION_PRODUCT__CHARACTERISTIC:
				getCharacteristic().clear();
				return;
			case FhirPackage.NUTRITION_PRODUCT__INSTANCE:
				getInstance().clear();
				return;
			case FhirPackage.NUTRITION_PRODUCT__NOTE:
				getNote().clear();
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
			case FhirPackage.NUTRITION_PRODUCT__CODE:
				return code != null;
			case FhirPackage.NUTRITION_PRODUCT__STATUS:
				return status != null;
			case FhirPackage.NUTRITION_PRODUCT__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.NUTRITION_PRODUCT__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FhirPackage.NUTRITION_PRODUCT__NUTRIENT:
				return nutrient != null && !nutrient.isEmpty();
			case FhirPackage.NUTRITION_PRODUCT__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.NUTRITION_PRODUCT__KNOWN_ALLERGEN:
				return knownAllergen != null && !knownAllergen.isEmpty();
			case FhirPackage.NUTRITION_PRODUCT__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
			case FhirPackage.NUTRITION_PRODUCT__INSTANCE:
				return instance != null && !instance.isEmpty();
			case FhirPackage.NUTRITION_PRODUCT__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NutritionProductImpl
