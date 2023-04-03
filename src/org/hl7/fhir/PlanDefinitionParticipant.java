/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Participant</b></em>'.
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
 *   <li>{@link org.hl7.fhir.PlanDefinitionParticipant#getActorId <em>Actor Id</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionParticipant#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionParticipant#getTypeCanonical <em>Type Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionParticipant#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionParticipant#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionParticipant#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionParticipant()
 * @model extendedMetaData="name='PlanDefinition.Participant' kind='elementOnly'"
 * @generated
 */
public interface PlanDefinitionParticipant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Actor Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the id element of the actor who will participate in this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor Id</em>' containment reference.
	 * @see #setActorId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionParticipant_ActorId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actorId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getActorId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionParticipant#getActorId <em>Actor Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Id</em>' containment reference.
	 * @see #getActorId()
	 * @generated
	 */
	void setActorId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ActionParticipantType)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionParticipant_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionParticipantType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionParticipant#getType <em>Type</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionParticipant_TypeCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getTypeCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionParticipant#getTypeCanonical <em>Type Canonical</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionParticipant_TypeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTypeReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionParticipant#getTypeReference <em>Type Reference</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionParticipant_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionParticipant#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the actor will be involved in the action - author, reviewer, witness, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionParticipant_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFunction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionParticipant#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(CodeableConcept value);

} // PlanDefinitionParticipant
