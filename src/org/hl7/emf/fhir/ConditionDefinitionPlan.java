/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Definition Plan</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ConditionDefinitionPlan#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConditionDefinitionPlan#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getConditionDefinitionPlan()
 * @model extendedMetaData="name='ConditionDefinition.Plan' kind='elementOnly'"
 * @generated
 */
public interface ConditionDefinitionPlan extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use for the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getConditionDefinitionPlan_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConditionDefinitionPlan#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getConditionDefinitionPlan_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConditionDefinitionPlan#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // ConditionDefinitionPlan
