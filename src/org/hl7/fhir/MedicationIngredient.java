/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getStrengthRatio <em>Strength Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getStrengthCodeableConcept <em>Strength Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getStrengthQuantity <em>Strength Quantity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient()
 * @model extendedMetaData="name='Medication.Ingredient' kind='elementOnly'"
 * @generated
 */
public interface MedicationIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingredient (substance or medication) that the ingredient.strength relates to.  This is represented as a concept from a code system or described in another resource (Substance or Medication).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of whether this ingredient affects the therapeutic action of the drug.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' containment reference.
	 * @see #setIsActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_IsActive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isActive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getIsActive <em>Is Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' containment reference.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Strength Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength Ratio</em>' containment reference.
	 * @see #setStrengthRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_StrengthRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getStrengthRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getStrengthRatio <em>Strength Ratio</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_StrengthCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStrengthCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getStrengthCodeableConcept <em>Strength Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_StrengthQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getStrengthQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getStrengthQuantity <em>Strength Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Quantity</em>' containment reference.
	 * @see #getStrengthQuantity()
	 * @generated
	 */
	void setStrengthQuantity(Quantity value);

} // MedicationIngredient
