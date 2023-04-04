/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A functional description of an inventory item used in inventory and supply-related workflows.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getResponsibleOrganization <em>Responsible Organization</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getInventoryStatus <em>Inventory Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getNetContent <em>Net Content</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItem#getProductReference <em>Product Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem()
 * @model extendedMetaData="name='InventoryItem' kind='elementOnly'"
 * @generated
 */
public interface InventoryItem extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier for the inventory item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_Identifier()
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
	 * Status of the item entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(InventoryItemStatusCodes)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	InventoryItemStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItem#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(InventoryItemStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category or class of the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code designating the specific type of item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.InventoryItemName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The item name(s) - the brand name, or common name, functional name, generic name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InventoryItemName> getName();

	/**
	 * Returns the value of the '<em><b>Responsible Organization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.InventoryItemResponsibleOrganization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization(s) responsible for the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible Organization</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_ResponsibleOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsibleOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InventoryItemResponsibleOrganization> getResponsibleOrganization();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive characteristics of the inventory item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(InventoryItemDescription)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	InventoryItemDescription getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(InventoryItemDescription value);

	/**
	 * Returns the value of the '<em><b>Inventory Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The usage status e.g. recalled, in use, discarded... This can be used to indicate that the items have been taken out of inventory, or are in use, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventory Status</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_InventoryStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inventoryStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getInventoryStatus();

	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base unit of measure - the unit in which the product is used or counted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Unit</em>' containment reference.
	 * @see #setBaseUnit(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_BaseUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBaseUnit();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItem#getBaseUnit <em>Base Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit</em>' containment reference.
	 * @see #getBaseUnit()
	 * @generated
	 */
	void setBaseUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Net Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net content or amount present in the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Content</em>' containment reference.
	 * @see #setNetContent(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_NetContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='netContent' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getNetContent();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItem#getNetContent <em>Net Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Content</em>' containment reference.
	 * @see #getNetContent()
	 * @generated
	 */
	void setNetContent(Quantity value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.InventoryItemAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association with other items or products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_Association()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='association' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InventoryItemAssociation> getAssociation();

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.InventoryItemCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive or identifying characteristics of the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_Characteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InventoryItemCharacteristic> getCharacteristic();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances or occurrences of the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(InventoryItemInstance)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_Instance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	InventoryItemInstance getInstance();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItem#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(InventoryItemInstance value);

	/**
	 * Returns the value of the '<em><b>Product Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to a product resource used in clinical workflows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Reference</em>' containment reference.
	 * @see #setProductReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItem_ProductReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProductReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItem#getProductReference <em>Product Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Reference</em>' containment reference.
	 * @see #getProductReference()
	 * @generated
	 */
	void setProductReference(Reference value);

} // InventoryItem
