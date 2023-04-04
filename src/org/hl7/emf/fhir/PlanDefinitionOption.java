/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, and drug quality specifications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionOption#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionOption#getTypeCanonical <em>Type Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionOption#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionOption#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionOption()
 * @model extendedMetaData="name='PlanDefinition.Option' kind='elementOnly'"
 * @generated
 */
public interface PlanDefinitionOption extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ActionParticipantType)
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionOption_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionParticipantType getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionOption#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionParticipantType value);

	/**
	 * Returns the value of the '<em><b>Type Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Canonical</em>' containment reference.
	 * @see #setTypeCanonical(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionOption_TypeCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getTypeCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionOption#getTypeCanonical <em>Type Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Canonical</em>' containment reference.
	 * @see #getTypeCanonical()
	 * @generated
	 */
	void setTypeCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference.
	 * @see #setTypeReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionOption_TypeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTypeReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionOption#getTypeReference <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Reference</em>' containment reference.
	 * @see #getTypeReference()
	 * @generated
	 */
	void setTypeReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role the participant should play in performing the described action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionOption_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionOption#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

} // PlanDefinitionOption
