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
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.NutritionOrderSchedule2;
import org.hl7.emf.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Schedule2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderSchedule2Impl#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderSchedule2Impl#getAsNeeded <em>As Needed</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderSchedule2Impl#getAsNeededFor <em>As Needed For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderSchedule2Impl extends BackboneElementImpl implements NutritionOrderSchedule2 {
	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected EList<Timing> timing;

	/**
	 * The cached value of the '{@link #getAsNeeded() <em>As Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeeded()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean asNeeded;

	/**
	 * The cached value of the '{@link #getAsNeededFor() <em>As Needed For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededFor()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept asNeededFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderSchedule2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionOrderSchedule2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Timing> getTiming() {
		if (timing == null) {
			timing = new EObjectContainmentEList<Timing>(Timing.class, this, FhirPackage.NUTRITION_ORDER_SCHEDULE2__TIMING);
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getAsNeeded() {
		return asNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeeded(org.hl7.emf.fhir.Boolean newAsNeeded, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldAsNeeded = asNeeded;
		asNeeded = newAsNeeded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED, oldAsNeeded, newAsNeeded);
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
	public void setAsNeeded(org.hl7.emf.fhir.Boolean newAsNeeded) {
		if (newAsNeeded != asNeeded) {
			NotificationChain msgs = null;
			if (asNeeded != null)
				msgs = ((InternalEObject)asNeeded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED, null, msgs);
			if (newAsNeeded != null)
				msgs = ((InternalEObject)newAsNeeded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED, null, msgs);
			msgs = basicSetAsNeeded(newAsNeeded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED, newAsNeeded, newAsNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAsNeededFor() {
		return asNeededFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededFor(CodeableConcept newAsNeededFor, NotificationChain msgs) {
		CodeableConcept oldAsNeededFor = asNeededFor;
		asNeededFor = newAsNeededFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED_FOR, oldAsNeededFor, newAsNeededFor);
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
	public void setAsNeededFor(CodeableConcept newAsNeededFor) {
		if (newAsNeededFor != asNeededFor) {
			NotificationChain msgs = null;
			if (asNeededFor != null)
				msgs = ((InternalEObject)asNeededFor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED_FOR, null, msgs);
			if (newAsNeededFor != null)
				msgs = ((InternalEObject)newAsNeededFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED_FOR, null, msgs);
			msgs = basicSetAsNeededFor(newAsNeededFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED_FOR, newAsNeededFor, newAsNeededFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED:
				return basicSetAsNeeded(null, msgs);
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED_FOR:
				return basicSetAsNeededFor(null, msgs);
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
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__TIMING:
				return getTiming();
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED:
				return getAsNeeded();
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED_FOR:
				return getAsNeededFor();
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
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends Timing>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED:
				setAsNeeded((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED_FOR:
				setAsNeededFor((CodeableConcept)newValue);
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
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__TIMING:
				getTiming().clear();
				return;
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED:
				setAsNeeded((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED_FOR:
				setAsNeededFor((CodeableConcept)null);
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
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__TIMING:
				return timing != null && !timing.isEmpty();
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED:
				return asNeeded != null;
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2__AS_NEEDED_FOR:
				return asNeededFor != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderSchedule2Impl
