/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a measurement, calculation or setting capability of a device.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DeviceMetric#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceMetric#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceMetric#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceMetric#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceMetric#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceMetric#getColor <em>Color</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceMetric#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceMetric#getMeasurementFrequency <em>Measurement Frequency</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceMetric#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric()
 * @model extendedMetaData="name='DeviceMetric' kind='elementOnly'"
 * @generated
 */
public interface DeviceMetric extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instance identifiers assigned to a device, by the device or gateway software, manufacturers, other organizations or owners. For example, handle ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric_Identifier()
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
	 * Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceMetric#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceMetric#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the link to the Device.  This is also known as a channel device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric_Device()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceMetric#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates current operational state of the device. For example: On, Off, Standby, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operational Status</em>' containment reference.
	 * @see #setOperationalStatus(DeviceMetricOperationalStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric_OperationalStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationalStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetricOperationalStatus getOperationalStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceMetric#getOperationalStatus <em>Operational Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Status</em>' containment reference.
	 * @see #getOperationalStatus()
	 * @generated
	 */
	void setOperationalStatus(DeviceMetricOperationalStatus value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred color associated with the metric (e.g., display color). This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth; the metrics are displayed in different characteristic colors, such as HR in blue, BP in green, and PR and SpO2 in magenta.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(ColorCodesOrRGB)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorCodesOrRGB getColor();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceMetric#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(ColorCodesOrRGB value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(DeviceMetricCategory)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetricCategory getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceMetric#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(DeviceMetricCategory value);

	/**
	 * Returns the value of the '<em><b>Measurement Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency at which the metric is taken or recorded. Devices measure metrics at a wide range of frequencies; for example, an ECG might sample measurements in the millisecond range, while an NIBP might trigger only once an hour. Less often, the measurementFrequency may be based on a unit other than time, such as distance (e.g. for a measuring wheel). The update period may be different than the measurement frequency, if the device does not update the published observed value with the same frequency as it was measured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Frequency</em>' containment reference.
	 * @see #setMeasurementFrequency(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric_MeasurementFrequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measurementFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMeasurementFrequency();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceMetric#getMeasurementFrequency <em>Measurement Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Frequency</em>' containment reference.
	 * @see #getMeasurementFrequency()
	 * @generated
	 */
	void setMeasurementFrequency(Quantity value);

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DeviceMetricCalibration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the calibrations that have been performed or that are required to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceMetric_Calibration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceMetricCalibration> getCalibration();

} // DeviceMetric
