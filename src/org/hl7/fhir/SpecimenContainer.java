/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sample to be used for analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenContainer#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenContainer#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenContainer#getSpecimenQuantity <em>Specimen Quantity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenContainer()
 * @model extendedMetaData="name='Specimen.Container' kind='elementOnly'"
 * @generated
 */
public interface SpecimenContainer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device resource for the the container holding the specimen. If the container is in a holder then the referenced device will point to a parent device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenContainer_Device()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenContainer#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location of the container holding the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenContainer_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenContainer#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Specimen Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen Quantity</em>' containment reference.
	 * @see #setSpecimenQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenContainer_SpecimenQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimenQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getSpecimenQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenContainer#getSpecimenQuantity <em>Specimen Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen Quantity</em>' containment reference.
	 * @see #getSpecimenQuantity()
	 * @generated
	 */
	void setSpecimenQuantity(Quantity value);

} // SpecimenContainer
