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
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.IngredientReferenceStrength;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.Ratio;
import org.hl7.emf.fhir.RatioRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient Reference Strength</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientReferenceStrengthImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientReferenceStrengthImpl#getStrengthRatio <em>Strength Ratio</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientReferenceStrengthImpl#getStrengthRatioRange <em>Strength Ratio Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientReferenceStrengthImpl#getStrengthQuantity <em>Strength Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientReferenceStrengthImpl#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientReferenceStrengthImpl#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngredientReferenceStrengthImpl extends BackboneElementImpl implements IngredientReferenceStrength {
	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference substance;

	/**
	 * The cached value of the '{@link #getStrengthRatio() <em>Strength Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio strengthRatio;

	/**
	 * The cached value of the '{@link #getStrengthRatioRange() <em>Strength Ratio Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthRatioRange()
	 * @generated
	 * @ordered
	 */
	protected RatioRange strengthRatioRange;

	/**
	 * The cached value of the '{@link #getStrengthQuantity() <em>Strength Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity strengthQuantity;

	/**
	 * The cached value of the '{@link #getMeasurementPoint() <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPoint()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String measurementPoint;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> country;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngredientReferenceStrengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getIngredientReferenceStrength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(CodeableReference newSubstance, NotificationChain msgs) {
		CodeableReference oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE, oldSubstance, newSubstance);
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
	public void setSubstance(CodeableReference newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getStrengthRatio() {
		return strengthRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthRatio(Ratio newStrengthRatio, NotificationChain msgs) {
		Ratio oldStrengthRatio = strengthRatio;
		strengthRatio = newStrengthRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO, oldStrengthRatio, newStrengthRatio);
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
	public void setStrengthRatio(Ratio newStrengthRatio) {
		if (newStrengthRatio != strengthRatio) {
			NotificationChain msgs = null;
			if (strengthRatio != null)
				msgs = ((InternalEObject)strengthRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO, null, msgs);
			if (newStrengthRatio != null)
				msgs = ((InternalEObject)newStrengthRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO, null, msgs);
			msgs = basicSetStrengthRatio(newStrengthRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO, newStrengthRatio, newStrengthRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RatioRange getStrengthRatioRange() {
		return strengthRatioRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthRatioRange(RatioRange newStrengthRatioRange, NotificationChain msgs) {
		RatioRange oldStrengthRatioRange = strengthRatioRange;
		strengthRatioRange = newStrengthRatioRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO_RANGE, oldStrengthRatioRange, newStrengthRatioRange);
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
	public void setStrengthRatioRange(RatioRange newStrengthRatioRange) {
		if (newStrengthRatioRange != strengthRatioRange) {
			NotificationChain msgs = null;
			if (strengthRatioRange != null)
				msgs = ((InternalEObject)strengthRatioRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO_RANGE, null, msgs);
			if (newStrengthRatioRange != null)
				msgs = ((InternalEObject)newStrengthRatioRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO_RANGE, null, msgs);
			msgs = basicSetStrengthRatioRange(newStrengthRatioRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO_RANGE, newStrengthRatioRange, newStrengthRatioRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getStrengthQuantity() {
		return strengthQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthQuantity(Quantity newStrengthQuantity, NotificationChain msgs) {
		Quantity oldStrengthQuantity = strengthQuantity;
		strengthQuantity = newStrengthQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_QUANTITY, oldStrengthQuantity, newStrengthQuantity);
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
	public void setStrengthQuantity(Quantity newStrengthQuantity) {
		if (newStrengthQuantity != strengthQuantity) {
			NotificationChain msgs = null;
			if (strengthQuantity != null)
				msgs = ((InternalEObject)strengthQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_QUANTITY, null, msgs);
			if (newStrengthQuantity != null)
				msgs = ((InternalEObject)newStrengthQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_QUANTITY, null, msgs);
			msgs = basicSetStrengthQuantity(newStrengthQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_QUANTITY, newStrengthQuantity, newStrengthQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getMeasurementPoint() {
		return measurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPoint(org.hl7.emf.fhir.String newMeasurementPoint, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldMeasurementPoint = measurementPoint;
		measurementPoint = newMeasurementPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT, oldMeasurementPoint, newMeasurementPoint);
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
	public void setMeasurementPoint(org.hl7.emf.fhir.String newMeasurementPoint) {
		if (newMeasurementPoint != measurementPoint) {
			NotificationChain msgs = null;
			if (measurementPoint != null)
				msgs = ((InternalEObject)measurementPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT, null, msgs);
			if (newMeasurementPoint != null)
				msgs = ((InternalEObject)newMeasurementPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT, null, msgs);
			msgs = basicSetMeasurementPoint(newMeasurementPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT, newMeasurementPoint, newMeasurementPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCountry() {
		if (country == null) {
			country = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.INGREDIENT_REFERENCE_STRENGTH__COUNTRY);
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO:
				return basicSetStrengthRatio(null, msgs);
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO_RANGE:
				return basicSetStrengthRatioRange(null, msgs);
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_QUANTITY:
				return basicSetStrengthQuantity(null, msgs);
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				return basicSetMeasurementPoint(null, msgs);
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				return getSubstance();
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO:
				return getStrengthRatio();
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO_RANGE:
				return getStrengthRatioRange();
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_QUANTITY:
				return getStrengthQuantity();
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				return getMeasurementPoint();
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				return getCountry();
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
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				setSubstance((CodeableReference)newValue);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO:
				setStrengthRatio((Ratio)newValue);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO_RANGE:
				setStrengthRatioRange((RatioRange)newValue);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_QUANTITY:
				setStrengthQuantity((Quantity)newValue);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				setSubstance((CodeableReference)null);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO:
				setStrengthRatio((Ratio)null);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO_RANGE:
				setStrengthRatioRange((RatioRange)null);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_QUANTITY:
				setStrengthQuantity((Quantity)null);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				getCountry().clear();
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
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				return substance != null;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO:
				return strengthRatio != null;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_RATIO_RANGE:
				return strengthRatioRange != null;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__STRENGTH_QUANTITY:
				return strengthQuantity != null;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				return measurementPoint != null;
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				return country != null && !country.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IngredientReferenceStrengthImpl
