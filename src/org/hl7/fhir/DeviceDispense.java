/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of dispensation of a device - i.e., assigning a device to a patient, or to a professional for their use.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getPreparedDate <em>Prepared Date</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getUsageInstruction <em>Usage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDispense#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceDispense()
 * @model extendedMetaData="name='DeviceDispense' kind='elementOnly'"
 * @generated
 */
public interface DeviceDispense extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier for this dispensation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The order or request that this dispense is fulfilling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bigger event that this dispense is a part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the set of dispense events.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DeviceDispenseStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceDispenseStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DeviceDispenseStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the reason why a dispense was or was not performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of device dispense.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the device being dispensed. This is either a link to a resource representing the details of the device or a simple attribute carrying a code that identifies the device from a known list of devices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Device()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing the person to whom the device is intended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the person who picked up the device or the person or location where the device was delivered.  This may be a patient or their caregiver, but some cases exist where it can be a healthcare professional or a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Receiver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiver' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReceiver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter that establishes the context for this event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information that supports the device being dispensed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_SupportingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInformation();

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDispensePerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what performed the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDispensePerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The principal physical location where the dispense was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of dispensing event that is performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of devices that have been dispensed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Prepared Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the dispensed product was packaged and reviewed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prepared Date</em>' containment reference.
	 * @see #setPreparedDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_PreparedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preparedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPreparedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getPreparedDate <em>Prepared Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepared Date</em>' containment reference.
	 * @see #getPreparedDate()
	 * @generated
	 */
	void setPreparedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>When Handed Over</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time the dispensed product was made available to the patient or their representative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Handed Over</em>' containment reference.
	 * @see #setWhenHandedOver(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_WhenHandedOver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenHandedOver' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getWhenHandedOver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getWhenHandedOver <em>When Handed Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Handed Over</em>' containment reference.
	 * @see #getWhenHandedOver()
	 * @generated
	 */
	void setWhenHandedOver(DateTime value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the facility/location where the device was /should be shipped to, as part of the dispense process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDestination();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Reference value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra information about the dispense that could not be conveyed in the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Usage Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full representation of the instructions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Instruction</em>' containment reference.
	 * @see #setUsageInstruction(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_UsageInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getUsageInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDispense#getUsageInstruction <em>Usage Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Instruction</em>' containment reference.
	 * @see #getUsageInstruction()
	 * @generated
	 */
	void setUsageInstruction(Markdown value);

	/**
	 * Returns the value of the '<em><b>Event History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of the events of interest that have occurred, such as when the dispense was verified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDispense_EventHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEventHistory();

} // DeviceDispense
