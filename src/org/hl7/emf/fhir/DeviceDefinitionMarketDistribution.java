/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Market Distribution</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionMarketDistribution#getMarketPeriod <em>Market Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionMarketDistribution#getSubJurisdiction <em>Sub Jurisdiction</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionMarketDistribution()
 * @model extendedMetaData="name='DeviceDefinition.MarketDistribution' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinitionMarketDistribution extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Market Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Begin and end dates for the commercial distribution of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Market Period</em>' containment reference.
	 * @see #setMarketPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionMarketDistribution_MarketPeriod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='marketPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getMarketPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionMarketDistribution#getMarketPeriod <em>Market Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Period</em>' containment reference.
	 * @see #getMarketPeriod()
	 * @generated
	 */
	void setMarketPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Sub Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * National state or territory to which the marketDistribution recers, typically where the device is commercialized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Jurisdiction</em>' containment reference.
	 * @see #setSubJurisdiction(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionMarketDistribution_SubJurisdiction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subJurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSubJurisdiction();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionMarketDistribution#getSubJurisdiction <em>Sub Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Jurisdiction</em>' containment reference.
	 * @see #getSubJurisdiction()
	 * @generated
	 */
	void setSubJurisdiction(Uri value);

} // DeviceDefinitionMarketDistribution
