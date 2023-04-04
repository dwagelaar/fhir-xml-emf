/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufactured Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getManufacturedDoseForm <em>Manufactured Dose Form</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getMarketingStatus <em>Marketing Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition()
 * @model extendedMetaData="name='ManufacturedItemDefinition' kind='elementOnly'"
 * @generated
 */
public interface ManufacturedItemDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this item. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A descriptive name applied to this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Manufactured Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dose form as manufactured and before any transformation into the pharmaceutical product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufactured Dose Form</em>' containment reference.
	 * @see #setManufacturedDoseForm(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_ManufacturedDoseForm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='manufacturedDoseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getManufacturedDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getManufacturedDoseForm <em>Manufactured Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Dose Form</em>' containment reference.
	 * @see #getManufacturedDoseForm()
	 * @generated
	 */
	void setManufacturedDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit Of Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The “real-world” units in which the quantity of the manufactured item is described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #setUnitOfPresentation(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_UnitOfPresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitOfPresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnitOfPresentation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ManufacturedItemDefinition#getUnitOfPresentation <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #getUnitOfPresentation()
	 * @generated
	 */
	void setUnitOfPresentation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of the item, one of several possible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Marketing Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MarketingStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows specifying that an item is on the market for sale, or that it is not available, and the dates and locations associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marketing Status</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_MarketingStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='marketingStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MarketingStatus> getMarketingStatus();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingredients of this manufactured item. This is only needed if the ingredients are not specified by incoming references from the Ingredient resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIngredient();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ManufacturedItemDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General characteristics of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ManufacturedItemDefinitionProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ManufacturedItemDefinitionComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical parts of the manufactured item, that it is intrisically made from. This is distinct from the ingredients that are part of its chemical makeup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getManufacturedItemDefinition_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ManufacturedItemDefinitionComponent> getComponent();

} // ManufacturedItemDefinition
