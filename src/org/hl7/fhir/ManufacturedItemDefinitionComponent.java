/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufactured Item Definition Component</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinitionComponent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinitionComponent#getFunction <em>Function</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinitionComponent#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinitionComponent#getConstituent <em>Constituent</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinitionComponent#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinitionComponent#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinitionComponent()
 * @model extendedMetaData="name='ManufacturedItemDefinition.Component' kind='elementOnly'"
 * @generated
 */
public interface ManufacturedItemDefinitionComponent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defining type of the component e.g. shell, layer, ink.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinitionComponent_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ManufacturedItemDefinitionComponent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function of this component within the item e.g. delivers active ingredient, masks taste.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinitionComponent_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFunction();

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measurable amount of total quantity of all substances in the component, expressable in different ways (e.g. by mass or volume).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinitionComponent_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getAmount();

	/**
	 * Returns the value of the '<em><b>Constituent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ManufacturedItemDefinitionConstituent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a constituent of the manufactured item as a whole, linked here so that its component location within the item can be indicated. This not where the item's ingredient are primarily stated (for which see Ingredient.for or ManufacturedItemDefinition.ingredient).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constituent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinitionComponent_Constituent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constituent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ManufacturedItemDefinitionConstituent> getConstituent();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ManufacturedItemDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General characteristics of this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinitionComponent_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ManufacturedItemDefinitionProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ManufacturedItemDefinitionComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component that this component contains or is made from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinitionComponent_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ManufacturedItemDefinitionComponent> getComponent();

} // ManufacturedItemDefinitionComponent
