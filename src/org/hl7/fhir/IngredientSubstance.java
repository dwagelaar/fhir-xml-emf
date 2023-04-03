/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient Substance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ingredient of a manufactured item or pharmaceutical product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.IngredientSubstance#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientSubstance#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getIngredientSubstance()
 * @model extendedMetaData="name='Ingredient.Substance' kind='elementOnly'"
 * @generated
 */
public interface IngredientSubstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code or full resource that represents the ingredient's substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getIngredientSubstance_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientSubstance#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.IngredientStrength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item. The allowed repetitions do not represent different strengths, but are different representations - mathematically equivalent - of a single strength.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getIngredientSubstance_Strength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IngredientStrength> getStrength();

} // IngredientSubstance
