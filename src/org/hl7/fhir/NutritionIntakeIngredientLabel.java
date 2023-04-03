/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Intake Ingredient Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionIntakeIngredientLabel#getNutrient <em>Nutrient</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntakeIngredientLabel#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionIntakeIngredientLabel()
 * @model extendedMetaData="name='NutritionIntake.IngredientLabel' kind='elementOnly'"
 * @generated
 */
public interface NutritionIntakeIngredientLabel extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Nutrient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total nutrient consumed. This could be a macronutrient (protein, fat, carbohydrate), or a vitamin and mineral.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutrient</em>' containment reference.
	 * @see #setNutrient(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntakeIngredientLabel_Nutrient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nutrient' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getNutrient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntakeIngredientLabel#getNutrient <em>Nutrient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrient</em>' containment reference.
	 * @see #getNutrient()
	 * @generated
	 */
	void setNutrient(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total amount of nutrient consumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntakeIngredientLabel_Amount()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntakeIngredientLabel#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Quantity value);

} // NutritionIntakeIngredientLabel
