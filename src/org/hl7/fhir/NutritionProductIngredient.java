/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Product Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A food or supplement that is consumed by patients.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionProductIngredient#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionProductIngredient#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionProductIngredient()
 * @model extendedMetaData="name='NutritionProduct.Ingredient' kind='elementOnly'"
 * @generated
 */
public interface NutritionProductIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingredient contained in the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionProductIngredient_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionProductIngredient#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Ratio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of ingredient that is in the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionProductIngredient_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Ratio> getAmount();

} // NutritionProductIngredient
