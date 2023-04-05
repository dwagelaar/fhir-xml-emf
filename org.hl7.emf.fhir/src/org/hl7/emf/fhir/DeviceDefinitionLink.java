/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionLink#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionLink#getRelatedDevice <em>Related Device</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionLink()
 * @model extendedMetaData="name='DeviceDefinition.Link' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinitionLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type indicates the relationship of the related device to the device instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(Coding)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionLink_Relation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRelation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionLink#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Coding value);

	/**
	 * Returns the value of the '<em><b>Related Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the linked device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Device</em>' containment reference.
	 * @see #setRelatedDevice(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionLink_RelatedDevice()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relatedDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getRelatedDevice();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionLink#getRelatedDevice <em>Related Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Device</em>' containment reference.
	 * @see #getRelatedDevice()
	 * @generated
	 */
	void setRelatedDevice(CodeableReference value);

} // DeviceDefinitionLink
