/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a device being used by a patient where the record is the result of a report from the patient or a clinician.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getUsageStatus <em>Usage Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getUsageReason <em>Usage Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getAdherence <em>Adherence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceUsage#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage()
 * @model extendedMetaData="name='DeviceUsage' kind='elementOnly'"
 * @generated
 */
public interface DeviceUsage extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An external identifier for this statement such as an IRI.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A plan, proposal or order that is fulfilled in whole or in part by this DeviceUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DeviceUsageStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUsageStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DeviceUsageStatus value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute indicates a category for the statement - The device statement may be made in an inpatient or outpatient settting (inpatient | outpatient | community | patientspecified).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who used the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows linking the DeviceUsage to the underlying Request, or to other information that supports or is used to derive the DeviceUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter or episode of care that establishes the context for this device use statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Timing Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Timing</em>' containment reference.
	 * @see #setTimingTiming(Timing)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_TimingTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTimingTiming();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getTimingTiming <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Timing</em>' containment reference.
	 * @see #getTimingTiming()
	 * @generated
	 */
	void setTimingTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Timing Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Period</em>' containment reference.
	 * @see #setTimingPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_TimingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimingPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getTimingPeriod <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Period</em>' containment reference.
	 * @see #getTimingPeriod()
	 * @generated
	 */
	void setTimingPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #setTimingDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_TimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getTimingDateTime <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #getTimingDateTime()
	 * @generated
	 */
	void setTimingDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Date Asserted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time at which the statement was recorded by informationSource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Asserted</em>' containment reference.
	 * @see #setDateAsserted(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_DateAsserted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateAsserted' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateAsserted();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getDateAsserted <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Asserted</em>' containment reference.
	 * @see #getDateAsserted()
	 * @generated
	 */
	void setDateAsserted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Usage Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the device usage, for example always, sometimes, never. This is not the same as the status of the statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Status</em>' containment reference.
	 * @see #setUsageStatus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_UsageStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUsageStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getUsageStatus <em>Usage Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Status</em>' containment reference.
	 * @see #getUsageStatus()
	 * @generated
	 */
	void setUsageStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Usage Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason for asserting the usage status - for example forgot, lost, stolen, broken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Reason</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_UsageReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getUsageReason();

	/**
	 * Returns the value of the '<em><b>Adherence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This indicates how or if the device is being used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adherence</em>' containment reference.
	 * @see #setAdherence(DeviceUsageAdherence)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_Adherence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adherence' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUsageAdherence getAdherence();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getAdherence <em>Adherence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adherence</em>' containment reference.
	 * @see #getAdherence()
	 * @generated
	 */
	void setAdherence(DeviceUsageAdherence value);

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who reported the device was being used by the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Source</em>' containment reference.
	 * @see #setInformationSource(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_InformationSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationSource' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInformationSource();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getInformationSource <em>Information Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Source</em>' containment reference.
	 * @see #getInformationSource()
	 * @generated
	 */
	void setInformationSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code or Reference to device used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_Device()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason or justification for the use of the device. A coded concept, or another resource whose existence justifies this DeviceUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the anotomic location on the subject's body where the device was used ( i.e. the target).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceUsage#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceUsage_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // DeviceUsage
