/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Use Definition Undesirable Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionUndesirableEffectImpl#getSymptomConditionEffect <em>Symptom Condition Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionUndesirableEffectImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionUndesirableEffectImpl#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalUseDefinitionUndesirableEffectImpl extends BackboneElementImpl implements ClinicalUseDefinitionUndesirableEffect {
	/**
	 * The cached value of the '{@link #getSymptomConditionEffect() <em>Symptom Condition Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptomConditionEffect()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference symptomConditionEffect;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept classification;

	/**
	 * The cached value of the '{@link #getFrequencyOfOccurrence() <em>Frequency Of Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyOfOccurrence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept frequencyOfOccurrence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalUseDefinitionUndesirableEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClinicalUseDefinitionUndesirableEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getSymptomConditionEffect() {
		return symptomConditionEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymptomConditionEffect(CodeableReference newSymptomConditionEffect, NotificationChain msgs) {
		CodeableReference oldSymptomConditionEffect = symptomConditionEffect;
		symptomConditionEffect = newSymptomConditionEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, oldSymptomConditionEffect, newSymptomConditionEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymptomConditionEffect(CodeableReference newSymptomConditionEffect) {
		if (newSymptomConditionEffect != symptomConditionEffect) {
			NotificationChain msgs = null;
			if (symptomConditionEffect != null)
				msgs = ((InternalEObject)symptomConditionEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, null, msgs);
			if (newSymptomConditionEffect != null)
				msgs = ((InternalEObject)newSymptomConditionEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, null, msgs);
			msgs = basicSetSymptomConditionEffect(newSymptomConditionEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, newSymptomConditionEffect, newSymptomConditionEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(CodeableConcept newClassification, NotificationChain msgs) {
		CodeableConcept oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__CLASSIFICATION, oldClassification, newClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(CodeableConcept newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFrequencyOfOccurrence() {
		return frequencyOfOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequencyOfOccurrence(CodeableConcept newFrequencyOfOccurrence, NotificationChain msgs) {
		CodeableConcept oldFrequencyOfOccurrence = frequencyOfOccurrence;
		frequencyOfOccurrence = newFrequencyOfOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, oldFrequencyOfOccurrence, newFrequencyOfOccurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyOfOccurrence(CodeableConcept newFrequencyOfOccurrence) {
		if (newFrequencyOfOccurrence != frequencyOfOccurrence) {
			NotificationChain msgs = null;
			if (frequencyOfOccurrence != null)
				msgs = ((InternalEObject)frequencyOfOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, null, msgs);
			if (newFrequencyOfOccurrence != null)
				msgs = ((InternalEObject)newFrequencyOfOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, null, msgs);
			msgs = basicSetFrequencyOfOccurrence(newFrequencyOfOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, newFrequencyOfOccurrence, newFrequencyOfOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				return basicSetSymptomConditionEffect(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				return basicSetFrequencyOfOccurrence(null, msgs);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				return getSymptomConditionEffect();
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__CLASSIFICATION:
				return getClassification();
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				return getFrequencyOfOccurrence();
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
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				setSymptomConditionEffect((CodeableReference)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__CLASSIFICATION:
				setClassification((CodeableConcept)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				setFrequencyOfOccurrence((CodeableConcept)newValue);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				setSymptomConditionEffect((CodeableReference)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__CLASSIFICATION:
				setClassification((CodeableConcept)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				setFrequencyOfOccurrence((CodeableConcept)null);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				return symptomConditionEffect != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__CLASSIFICATION:
				return classification != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				return frequencyOfOccurrence != null;
		}
		return super.eIsSet(featureID);
	}

} //ClinicalUseDefinitionUndesirableEffectImpl
