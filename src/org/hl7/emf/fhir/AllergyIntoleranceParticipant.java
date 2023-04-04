/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Risk of harmful or undesirable physiological response which is specific to an individual and associated with exposure to a substance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.AllergyIntoleranceParticipant#getFunction <em>Function</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AllergyIntoleranceParticipant#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAllergyIntoleranceParticipant()
 * @model extendedMetaData="name='AllergyIntolerance.Participant' kind='elementOnly'"
 * @generated
 */
public interface AllergyIntoleranceParticipant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distinguishes the type of involvement of the actor in the activities related to the allergy or intolerance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAllergyIntoleranceParticipant_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFunction();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AllergyIntoleranceParticipant#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what participated in the activities related to the allergy or intolerance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAllergyIntoleranceParticipant_Actor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AllergyIntoleranceParticipant#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

} // AllergyIntoleranceParticipant
