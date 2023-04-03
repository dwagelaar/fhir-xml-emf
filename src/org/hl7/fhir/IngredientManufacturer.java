/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient Manufacturer</b></em>'.
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
 *   <li>{@link org.hl7.fhir.IngredientManufacturer#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientManufacturer#getManufacturer <em>Manufacturer</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getIngredientManufacturer()
 * @model extendedMetaData="name='Ingredient.Manufacturer' kind='elementOnly'"
 * @generated
 */
public interface IngredientManufacturer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The way in which this manufacturer is associated with the ingredient. For example whether it is a possible one (others allowed), or an exclusive authorized one for this ingredient. Note that this is not the manufacturing process role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(IngredientManufacturerRole)
	 * @see org.hl7.fhir.FhirPackage#getIngredientManufacturer_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	IngredientManufacturerRole getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientManufacturer#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(IngredientManufacturerRole value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that manufactures this ingredient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getIngredientManufacturer_Manufacturer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientManufacturer#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Reference value);

} // IngredientManufacturer
