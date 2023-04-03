/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Additive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionOrderAdditive#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderAdditive#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderAdditive#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionOrderAdditive()
 * @model extendedMetaData="name='NutritionOrder.Additive' kind='elementOnly'"
 * @generated
 */
public interface NutritionOrderAdditive extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderAdditive_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderAdditive#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product or brand name of the type of modular component to be added to the formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Name</em>' containment reference.
	 * @see #setProductName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderAdditive_ProductName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProductName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderAdditive#getProductName <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' containment reference.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of additive to be given in addition or to be mixed in with the base formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderAdditive_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderAdditive#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

} // NutritionOrderAdditive
