/**
 */
package org.hl7.emf.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.EncounterDiagnosis;
import org.hl7.emf.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.EncounterDiagnosisImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EncounterDiagnosisImpl#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterDiagnosisImpl extends BackboneElementImpl implements EncounterDiagnosis {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> condition;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> use;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEncounterDiagnosis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.ENCOUNTER_DIAGNOSIS__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getUse() {
		if (use == null) {
			use = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER_DIAGNOSIS__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER_DIAGNOSIS__USE:
				return ((InternalEList<?>)getUse()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				return getCondition();
			case FhirPackage.ENCOUNTER_DIAGNOSIS__USE:
				return getUse();
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
			case FhirPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.ENCOUNTER_DIAGNOSIS__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				getCondition().clear();
				return;
			case FhirPackage.ENCOUNTER_DIAGNOSIS__USE:
				getUse().clear();
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
			case FhirPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				return condition != null && !condition.isEmpty();
			case FhirPackage.ENCOUNTER_DIAGNOSIS__USE:
				return use != null && !use.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EncounterDiagnosisImpl
