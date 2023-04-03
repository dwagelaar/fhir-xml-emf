/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a medication that is used to support knowledge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIngredient#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIngredient#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIngredient#getStrengthRatio <em>Strength Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIngredient#getStrengthCodeableConcept <em>Strength Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIngredient#getStrengthQuantity <em>Strength Quantity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient()
 * @model extendedMetaData="name='MedicationKnowledge.Ingredient' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the resource that provides information about the ingredient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeIngredient#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of whether this ingredient affects the therapeutic action of the drug.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeIngredient#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Strength Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength Ratio</em>' containment reference.
	 * @see #setStrengthRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient_StrengthRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getStrengthRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeIngredient#getStrengthRatio <em>Strength Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Ratio</em>' containment reference.
	 * @see #getStrengthRatio()
	 * @generated
	 */
	void setStrengthRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Strength Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength Codeable Concept</em>' containment reference.
	 * @see #setStrengthCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient_StrengthCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStrengthCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeIngredient#getStrengthCodeableConcept <em>Strength Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Codeable Concept</em>' containment reference.
	 * @see #getStrengthCodeableConcept()
	 * @generated
	 */
	void setStrengthCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Strength Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength Quantity</em>' containment reference.
	 * @see #setStrengthQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient_StrengthQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getStrengthQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeIngredient#getStrengthQuantity <em>Strength Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Quantity</em>' containment reference.
	 * @see #getStrengthQuantity()
	 * @generated
	 */
	void setStrengthQuantity(Quantity value);

} // MedicationKnowledgeIngredient
