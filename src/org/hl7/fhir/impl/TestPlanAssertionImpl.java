/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.TestPlanAssertion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Plan Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestPlanAssertionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestPlanAssertionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestPlanAssertionImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestPlanAssertionImpl extends BackboneElementImpl implements TestPlanAssertion {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> object;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPlanAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestPlanAssertion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.TEST_PLAN_ASSERTION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.TEST_PLAN_ASSERTION__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.TEST_PLAN_ASSERTION__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_PLAN_ASSERTION__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_PLAN_ASSERTION__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_PLAN_ASSERTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.TEST_PLAN_ASSERTION__TYPE:
				return getType();
			case FhirPackage.TEST_PLAN_ASSERTION__OBJECT:
				return getObject();
			case FhirPackage.TEST_PLAN_ASSERTION__RESULT:
				return getResult();
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
			case FhirPackage.TEST_PLAN_ASSERTION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.TEST_PLAN_ASSERTION__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.TEST_PLAN_ASSERTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends CodeableReference>)newValue);
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
			case FhirPackage.TEST_PLAN_ASSERTION__TYPE:
				getType().clear();
				return;
			case FhirPackage.TEST_PLAN_ASSERTION__OBJECT:
				getObject().clear();
				return;
			case FhirPackage.TEST_PLAN_ASSERTION__RESULT:
				getResult().clear();
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
			case FhirPackage.TEST_PLAN_ASSERTION__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.TEST_PLAN_ASSERTION__OBJECT:
				return object != null && !object.isEmpty();
			case FhirPackage.TEST_PLAN_ASSERTION__RESULT:
				return result != null && !result.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestPlanAssertionImpl
