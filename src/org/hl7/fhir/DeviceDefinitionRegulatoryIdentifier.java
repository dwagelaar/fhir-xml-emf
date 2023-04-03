/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Regulatory Identifier</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier#getJurisdiction <em>Jurisdiction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionRegulatoryIdentifier()
 * @model extendedMetaData="name='DeviceDefinition.RegulatoryIdentifier' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinitionRegulatoryIdentifier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of identifier itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DeviceDefinitionRegulatoryIdentifierType)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionRegulatoryIdentifier_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceDefinitionRegulatoryIdentifierType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DeviceDefinitionRegulatoryIdentifierType value);

	/**
	 * Returns the value of the '<em><b>Device Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Identifier</em>' containment reference.
	 * @see #setDeviceIdentifier(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionRegulatoryIdentifier_DeviceIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDeviceIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier#getDeviceIdentifier <em>Device Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Identifier</em>' containment reference.
	 * @see #getDeviceIdentifier()
	 * @generated
	 */
	void setDeviceIdentifier(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that issued this identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer</em>' containment reference.
	 * @see #setIssuer(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionRegulatoryIdentifier_Issuer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='issuer' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getIssuer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier#getIssuer <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' containment reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(Uri value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The jurisdiction to which the deviceIdentifier applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionRegulatoryIdentifier_Jurisdiction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getJurisdiction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(Uri value);

} // DeviceDefinitionRegulatoryIdentifier
