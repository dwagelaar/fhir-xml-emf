/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A food or supplement that is consumed by patients.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getNutrient <em>Nutrient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getKnownAllergen <em>Known Allergen</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionProduct#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct()
 * @model extendedMetaData="name='NutritionProduct' kind='elementOnly'"
 * @generated
 */
public interface NutritionProduct extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code assigned to the product, for example a USDA NDB number, a USDA FDC ID number, or a Langual code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NutritionProduct#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(NutritionProductStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionProductStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NutritionProduct#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(NutritionProductStatus value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nutrition products can have different classifications - according to its nutritional properties, preparation methods, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organisation (manufacturer, representative or legal authorization holder) that is responsible for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Nutrient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.NutritionProductNutrient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product's nutritional information expressed by the nutrients.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutrient</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_Nutrient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nutrient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionProductNutrient> getNutrient();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.NutritionProductIngredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ingredients contained in this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionProductIngredient> getIngredient();

	/**
	 * Returns the value of the '<em><b>Known Allergen</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allergens that are known or suspected to be a part of this nutrition product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Known Allergen</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_KnownAllergen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='knownAllergen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getKnownAllergen();

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.NutritionProductCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies descriptive properties of the nutrition product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_Characteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionProductCharacteristic> getCharacteristic();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.NutritionProductInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conveys instance-level information about this product item. One or several physical, countable instances or occurrences of the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_Instance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionProductInstance> getInstance();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made about the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionProduct_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // NutritionProduct
