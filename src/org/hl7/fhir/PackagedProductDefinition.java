/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Product Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medically related item or items, in a container or package.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getPackageFor <em>Package For</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getContainedItemQuantity <em>Contained Item Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getMarketingStatus <em>Marketing Status</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getCopackagedIndicator <em>Copackaged Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getAttachedDocument <em>Attached Document</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinition#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition()
 * @model extendedMetaData="name='PackagedProductDefinition' kind='elementOnly'"
 * @generated
 */
public interface PackagedProductDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this package as whole - not the the content of the package. Unique instance identifiers assigned to a package by manufacturers, regulators, drug catalogue custodians or other organizations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name for this package. Typically what it would be listed as in a drug formulary or catalogue, inventory etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinition#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A high level category e.g. medicinal product, raw material, shipping/transport container, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Package For</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product this package model relates to, not the contents of the package (for which see package.containedItem).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package For</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_PackageFor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packageFor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPackageFor();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status within the lifecycle of this item. A high level status, this is not intended to duplicate details carried elsewhere such as legal status, or authorization or marketing status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date at which the given status became applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStatusDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinition#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Contained Item Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A total of the complete count of contained items of a particular type/form, independent of sub-packaging or organization. This can be considered as the pack size. This attribute differs from containedItem.amount in that it can give a single aggregated count of all tablet types in a pack, even when these are different manufactured items. For example a pill pack of 21 tablets plus 7 sugar tablets, can be denoted here as '28 tablets'. This attribute is repeatable so that the different item types in one pack type can be counted (e.g. a count of vials and count of syringes). Each repeat must have different units, so that it is clear what the different sets of counted items are, and it is not intended to allow different counts of similar items (e.g. not '2 tubes and 3 tubes'). Repeats are not to be used to represent different pack sizes (e.g. 20 pack vs. 50 pack) - which would be different instances of this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Item Quantity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_ContainedItemQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containedItemQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getContainedItemQuantity();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description. Note that this is not the name of the package or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Legal Status Of Supply</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The legal status of supply of the packaged item as classified by the regulator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Status Of Supply</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_LegalStatusOfSupply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legalStatusOfSupply' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackagedProductDefinitionLegalStatusOfSupply> getLegalStatusOfSupply();

	/**
	 * Returns the value of the '<em><b>Marketing Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MarketingStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows specifying that an item is on the market for sale, or that it is not available, and the dates and locations associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marketing Status</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_MarketingStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='marketingStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MarketingStatus> getMarketingStatus();

	/**
	 * Returns the value of the '<em><b>Copackaged Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies if the package contains different items, such as when a drug product is supplied with another item e.g. a diluent or adjuvant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copackaged Indicator</em>' containment reference.
	 * @see #setCopackagedIndicator(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_CopackagedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copackagedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getCopackagedIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinition#getCopackagedIndicator <em>Copackaged Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copackaged Indicator</em>' containment reference.
	 * @see #getCopackagedIndicator()
	 * @generated
	 */
	void setCopackagedIndicator(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this package type. When there are multiple it means these are all possible manufacturers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Attached Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information or supporting documentation about the packaged product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attached Document</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_AttachedDocument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attachedDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAttachedDocument();

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A packaging item, as a container for medically related items, possibly with other packaging items within, or a packaging component, such as bottle cap (which is not a device or a medication manufactured item).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference.
	 * @see #setPackaging(PackagedProductDefinitionPackaging)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_Packaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	PackagedProductDefinitionPackaging getPackaging();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinition#getPackaging <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' containment reference.
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(PackagedProductDefinitionPackaging value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PackagedProductDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the key features to be recorded, such as "hospital pack", "nurse prescribable", "calendar pack".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinition_Characteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackagedProductDefinitionProperty> getCharacteristic();

} // PackagedProductDefinition
