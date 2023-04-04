/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Definition Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of a condition and information relevant to managing it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ConditionDefinitionQuestionnaire#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConditionDefinitionQuestionnaire#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getConditionDefinitionQuestionnaire()
 * @model extendedMetaData="name='ConditionDefinition.Questionnaire' kind='elementOnly'"
 * @generated
 */
public interface ConditionDefinitionQuestionnaire extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use of the questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(ConditionQuestionnairePurpose)
	 * @see org.hl7.emf.fhir.FhirPackage#getConditionDefinitionQuestionnaire_Purpose()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionQuestionnairePurpose getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConditionDefinitionQuestionnaire#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(ConditionQuestionnairePurpose value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific Questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getConditionDefinitionQuestionnaire_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConditionDefinitionQuestionnaire#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // ConditionDefinitionQuestionnaire
