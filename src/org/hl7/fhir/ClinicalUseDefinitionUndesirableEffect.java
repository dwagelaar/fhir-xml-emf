/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Use Definition Undesirable Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect#getSymptomConditionEffect <em>Symptom Condition Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionUndesirableEffect()
 * @model extendedMetaData="name='ClinicalUseDefinition.UndesirableEffect' kind='elementOnly'"
 * @generated
 */
public interface ClinicalUseDefinitionUndesirableEffect extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Symptom Condition Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The situation in which the undesirable effect may manifest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symptom Condition Effect</em>' containment reference.
	 * @see #setSymptomConditionEffect(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionUndesirableEffect_SymptomConditionEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='symptomConditionEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getSymptomConditionEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect#getSymptomConditionEffect <em>Symptom Condition Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symptom Condition Effect</em>' containment reference.
	 * @see #getSymptomConditionEffect()
	 * @generated
	 */
	void setSymptomConditionEffect(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * High level classification of the effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionUndesirableEffect_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClassification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Frequency Of Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How often the effect is seen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency Of Occurrence</em>' containment reference.
	 * @see #setFrequencyOfOccurrence(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionUndesirableEffect_FrequencyOfOccurrence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frequencyOfOccurrence' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFrequencyOfOccurrence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Of Occurrence</em>' containment reference.
	 * @see #getFrequencyOfOccurrence()
	 * @generated
	 */
	void setFrequencyOfOccurrence(CodeableConcept value);

} // ClinicalUseDefinitionUndesirableEffect
