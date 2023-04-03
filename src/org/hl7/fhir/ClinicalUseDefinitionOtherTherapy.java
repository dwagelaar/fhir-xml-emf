/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Use Definition Other Therapy</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionOtherTherapy#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionOtherTherapy#getTreatment <em>Treatment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionOtherTherapy()
 * @model extendedMetaData="name='ClinicalUseDefinition.OtherTherapy' kind='elementOnly'"
 * @generated
 */
public interface ClinicalUseDefinitionOtherTherapy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relationship between the medicinal product indication or contraindication and another therapy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Type</em>' containment reference.
	 * @see #setRelationshipType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionOtherTherapy_RelationshipType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationshipType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationshipType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinitionOtherTherapy#getRelationshipType <em>Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' containment reference.
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a specific medication (active substance, medicinal product or class of products, biological, food etc.) as part of an indication or contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment</em>' containment reference.
	 * @see #setTreatment(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionOtherTherapy_Treatment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='treatment' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getTreatment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinitionOtherTherapy#getTreatment <em>Treatment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment</em>' containment reference.
	 * @see #getTreatment()
	 * @generated
	 */
	void setTreatment(CodeableReference value);

} // ClinicalUseDefinitionOtherTherapy
