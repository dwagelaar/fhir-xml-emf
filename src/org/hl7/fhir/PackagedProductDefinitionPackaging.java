/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Product Definition Packaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medically related item or items, in a container or package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getComponentPart <em>Component Part</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getAlternateMaterial <em>Alternate Material</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getShelfLifeStorage <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getContainedItem <em>Contained Item</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getPackaging <em>Packaging</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging()
 * @model extendedMetaData="name='PackagedProductDefinition.Packaging' kind='elementOnly'"
 * @generated
 */
public interface PackagedProductDefinitionPackaging extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A business identifier that is specific to this particular part of the packaging, often assigned by the manufacturer. Including possibly Data Carrier Identifier (a GS1 barcode).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical type of the container of the items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Component Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this a part of the packaging (e.g. a cap or bottle stopper), rather than the packaging itself (e.g. a bottle or vial). The latter type are designed be a container, but the former are not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Part</em>' containment reference.
	 * @see #setComponentPart(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_ComponentPart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentPart' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getComponentPart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getComponentPart <em>Component Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Part</em>' containment reference.
	 * @see #getComponentPart()
	 * @generated
	 */
	void setComponentPart(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of packaging items contained at this layer of the package. This does not relate to the number of contained items but relates solely to the number of packaging items. When looking at the outermost layer it is always 1. If there are two boxes within, at the next layer it would be 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionPackaging#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material type of the package item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_Material()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getMaterial();

	/**
	 * Returns the value of the '<em><b>Alternate Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A possible alternate material for this part of the packaging, that is allowed to be used instead of the usual material (e.g. different types of plastic for a blister sleeve).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate Material</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_AlternateMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternateMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAlternateMaterial();

	/**
	 * Returns the value of the '<em><b>Shelf Life Storage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProductShelfLife}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shelf Life and storage information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shelf Life Storage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_ShelfLifeStorage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shelfLifeStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductShelfLife> getShelfLifeStorage();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this packaging item. When there are multiple values each one is a potential manufacturer of this packaging item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PackagedProductDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General characteristics of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackagedProductDefinitionProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Contained Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PackagedProductDefinitionContainedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The item(s) within the packaging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_ContainedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackagedProductDefinitionContainedItem> getContainedItem();

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PackagedProductDefinitionPackaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows containers (and parts of containers) within containers, still as a part of a single packaged product. See also PackagedProductDefinition.packaging.containedItem.item(PackagedProductDefinition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackaging_Packaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackagedProductDefinitionPackaging> getPackaging();

} // PackagedProductDefinitionPackaging
