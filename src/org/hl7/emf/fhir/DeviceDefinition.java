/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getUdiDeviceIdentifier <em>Udi Device Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getRegulatoryIdentifier <em>Regulatory Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getSafety <em>Safety</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getShelfLifeStorage <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getProductionIdentifierInUDI <em>Production Identifier In UDI</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getCorrectiveAction <em>Corrective Action</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinition#getChargeItem <em>Charge Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition()
 * @model extendedMetaData="name='DeviceDefinition' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information to describe the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID. The identifier is typically valued if the udiDeviceIdentifier, partNumber or modelNumber is not valued and represents a different type of identifier.  However, it is permissible to still include those identifiers in DeviceDefinition.identifier with the appropriate identifier.type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Udi Device Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionUdiDeviceIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi Device Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_UdiDeviceIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udiDeviceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionUdiDeviceIdentifier> getUdiDeviceIdentifier();

	/**
	 * Returns the value of the '<em><b>Regulatory Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionRegulatoryIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier associated with the regulatory documentation (certificates, technical documentation, post-market surveillance documentation and reports) of a set of device models sharing the same intended purpose, risk class and essential design and manufacturing characteristics. One example is the Basic UDI-DI in Europe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulatory Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_RegulatoryIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regulatoryIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionRegulatoryIdentifier> getRegulatoryIdentifier();

	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The part number or catalog number of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Number</em>' containment reference.
	 * @see #setPartNumber(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_PartNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getPartNumber();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinition#getPartNumber <em>Part Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' containment reference.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the manufacturer  or legal representative e.g. labeler. Whether this is the actual manufacturer or the labeler or responsible depends on implementation and jurisdiction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinition#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Reference value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionDeviceName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name or names of the device as given by the manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Name</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_DeviceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionDeviceName> getDeviceName();

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model number for the device for example as defined by the manufacturer or labeler, or other agency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Number</em>' containment reference.
	 * @see #setModelNumber(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_ModelNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getModelNumber();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinition#getModelNumber <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' containment reference.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionClassification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What kind of device or device system this is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionClassification> getClassification();

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionConformsTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the standards, specifications, or formal guidances for the capabilities supported by the device. The device may be certified as conformant to these specifications e.g., communication, performance, process, measurement, or specialization standards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conforms To</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_ConformsTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conformsTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionConformsTo> getConformsTo();

	/**
	 * Returns the value of the '<em><b>Has Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionHasPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device that is part (for example a component) of the present device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Part</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_HasPart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasPart' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionHasPart> getHasPart();

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionPackaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the packaging of the device, i.e. how the device is packaged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Packaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionPackaging> getPackaging();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the device or software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionVersion> getVersion();

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Safety characteristics of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Safety</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Safety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='safety' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSafety();

	/**
	 * Returns the value of the '<em><b>Shelf Life Storage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ProductShelfLife}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shelf Life and storage information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shelf Life Storage</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_ShelfLifeStorage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shelfLifeStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductShelfLife> getShelfLifeStorage();

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language code for the human-readable text strings produced by the device (all supported).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Code</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_LanguageCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='languageCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getLanguageCode();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Static or essentially fixed characteristics or features of this kind of device that are otherwise not captured in more specific attributes, e.g., time or timing attributes, resolution, accuracy, and physical attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that is responsible for the provision and ongoing maintenance of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinition#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for an organization or a particular human that is responsible for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getContact();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An associated device, attached to, used with, communicating with or linking a previous or new device model to the focal device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionLink> getLink();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information, usage information or implantation information that is not captured in an existing element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A substance used to create the material(s) of which the device is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Material()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionMaterial> getMaterial();

	/**
	 * Returns the value of the '<em><b>Production Identifier In UDI</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceProductionIdentifierInUDI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the production identifier(s) that are expected to appear in the UDI carrier on the device label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Production Identifier In UDI</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_ProductionIdentifierInUDI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productionIdentifierInUDI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceProductionIdentifierInUDI> getProductionIdentifierInUDI();

	/**
	 * Returns the value of the '<em><b>Guideline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information aimed at providing directions for the usage of this model of device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guideline</em>' containment reference.
	 * @see #setGuideline(DeviceDefinitionGuideline)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_Guideline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guideline' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceDefinitionGuideline getGuideline();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinition#getGuideline <em>Guideline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guideline</em>' containment reference.
	 * @see #getGuideline()
	 * @generated
	 */
	void setGuideline(DeviceDefinitionGuideline value);

	/**
	 * Returns the value of the '<em><b>Corrective Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tracking of latest field safety corrective action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corrective Action</em>' containment reference.
	 * @see #setCorrectiveAction(DeviceDefinitionCorrectiveAction)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_CorrectiveAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correctiveAction' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceDefinitionCorrectiveAction getCorrectiveAction();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinition#getCorrectiveAction <em>Corrective Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corrective Action</em>' containment reference.
	 * @see #getCorrectiveAction()
	 * @generated
	 */
	void setCorrectiveAction(DeviceDefinitionCorrectiveAction value);

	/**
	 * Returns the value of the '<em><b>Charge Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceDefinitionChargeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Billing code or reference associated with the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Item</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinition_ChargeItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chargeItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionChargeItem> getChargeItem();

} // DeviceDefinition
