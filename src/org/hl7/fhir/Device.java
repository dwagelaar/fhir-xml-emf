/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Device#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getUdiCarrier <em>Udi Carrier</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getAvailabilityStatus <em>Availability Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getBiologicalSourceEvent <em>Biological Source Event</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getCycle <em>Cycle</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getSafety <em>Safety</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDevice()
 * @model extendedMetaData="name='Device' kind='elementOnly'"
 * @generated
 */
public interface Device extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name used to display by default when the device is referenced. Based on intent of use by the resource creator, this may reflect one of the names in Device.name, or may be another simple name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #setDisplayName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisplayName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to the definition for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Udi Carrier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceUdiCarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi Carrier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_UdiCarrier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udiCarrier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceUdiCarrier> getUdiCarrier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Device record status. This is not the status of the device like availability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(FHIRDeviceStatus)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	FHIRDeviceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FHIRDeviceStatus value);

	/**
	 * Returns the value of the '<em><b>Availability Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The availability of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Status</em>' containment reference.
	 * @see #setAvailabilityStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDevice_AvailabilityStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availabilityStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAvailabilityStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getAvailabilityStatus <em>Availability Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Status</em>' containment reference.
	 * @see #getAvailabilityStatus()
	 * @generated
	 */
	void setAvailabilityStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Biological Source Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that supports traceability to the event during which material in this product from one or more biological entities was obtained or pooled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Biological Source Event</em>' containment reference.
	 * @see #setBiologicalSourceEvent(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getDevice_BiologicalSourceEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='biologicalSourceEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getBiologicalSourceEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getBiologicalSourceEvent <em>Biological Source Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biological Source Event</em>' containment reference.
	 * @see #getBiologicalSourceEvent()
	 * @generated
	 */
	void setBiologicalSourceEvent(Identifier value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the manufacturer or entity legally responsible for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Manufacture Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when the device was manufactured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #setManufactureDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDevice_ManufactureDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufactureDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getManufactureDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getManufactureDate <em>Manufacture Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #getManufactureDate()
	 * @generated
	 */
	void setManufactureDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time beyond which this device is no longer valid or should not be used (if applicable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDevice_ExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExpirationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lot number assigned by the manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The serial number assigned by the organization when the device was manufactured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' containment reference.
	 * @see #setSerialNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_SerialNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getSerialNumber <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' containment reference.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceName> getName();

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manufacturer's model number for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Number</em>' containment reference.
	 * @see #setModelNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_ModelNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getModelNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getModelNumber <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' containment reference.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The part number or catalog number of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Number</em>' containment reference.
	 * @see #setPartNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_PartNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPartNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getPartNumber <em>Part Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' containment reference.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Devices may be associated with one or more categories.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind or type of device. A device instance may have more than one type - in which case those are the types that apply to the specific instance of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual design of the device or software version running on the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceVersion> getVersion();

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceConformsTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the standards, specifications, or formal guidances for the capabilities supported by the device. The device may be certified as conformant to these specifications e.g., communication, performance, process, measurement, or specialization standards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conforms To</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_ConformsTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conformsTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceConformsTo> getConformsTo();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Static or essentially fixed characteristics or features of the device (e.g., time or timing attributes, resolution, accuracy, intended use or instructions for use, and physical attributes) that are not otherwise captured in more specific attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The designated condition for performing a task with the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Mode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The series of occurrences that repeats during the operation of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cycle</em>' containment reference.
	 * @see #setCycle(Count)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Cycle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cycle' namespace='##targetNamespace'"
	 * @generated
	 */
	Count getCycle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getCycle <em>Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle</em>' containment reference.
	 * @see #getCycle()
	 * @generated
	 */
	void setCycle(Count value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of time during the device's operation (e.g., days, hours, mins, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that is responsible for the provision and ongoing maintenance of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for an organization or a particular human that is responsible for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getContact();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The place where the device can be found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A network address on which the device may be contacted directly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technical endpoints providing access to services provided by the device defined at this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The linked device acting as a communication controller, data collector, translator, or concentrator for the current device (e.g., mobile phone application that relays a blood pressure device's data).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gateway</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Gateway()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gateway' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getGateway();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information, usage information or implantation information that is not captured in an existing element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional safety characteristics about a medical device.  For example devices containing latex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Safety</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Safety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='safety' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSafety();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The higher level or encompassing device that this device is a logical part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Reference value);

} // Device
