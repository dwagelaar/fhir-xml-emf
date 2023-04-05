/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufactured Item Definition Constituent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinitionConstituent#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinitionConstituent#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinitionConstituent#getFunction <em>Function</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinitionConstituent#getHasIngredient <em>Has Ingredient</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinitionConstituent()
 * @model extendedMetaData="name='ManufacturedItemDefinition.Constituent' kind='elementOnly'"
 * @generated
 */
public interface ManufacturedItemDefinitionConstituent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measurable amount of the substance, expressable in different ways (e.g. by mass or volume).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinitionConstituent_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getAmount();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical location of the constituent/ingredient within the component. Example – if the component is the bead in the capsule, then the location would be where the ingredient resides within the product part – intragranular, extra-granular, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinitionConstituent_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getLocation();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function of this constituent within the component e.g. binder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinitionConstituent_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFunction();

	/**
	 * Returns the value of the '<em><b>Has Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingredient that is the constituent of the given component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Ingredient</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinitionConstituent_HasIngredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasIngredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getHasIngredient();

} // ManufacturedItemDefinitionConstituent
