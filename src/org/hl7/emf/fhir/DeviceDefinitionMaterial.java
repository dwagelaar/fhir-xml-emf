/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Material</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionMaterial#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionMaterial#getAlternate <em>Alternate</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionMaterial#getAllergenicIndicator <em>Allergenic Indicator</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionMaterial()
 * @model extendedMetaData="name='DeviceDefinition.Material' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinitionMaterial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A substance that the device contains, may contain, or is made of - for example latex - to be used to determine patient compatibility. This is not intended to represent the composition of the device, only the clinically relevant materials.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionMaterial_Substance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionMaterial#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Alternate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an alternative material of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate</em>' containment reference.
	 * @see #setAlternate(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionMaterial_Alternate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getAlternate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionMaterial#getAlternate <em>Alternate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate</em>' containment reference.
	 * @see #getAlternate()
	 * @generated
	 */
	void setAlternate(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Allergenic Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the substance is a known or suspected allergen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #setAllergenicIndicator(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionMaterial_AllergenicIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allergenicIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getAllergenicIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionMaterial#getAllergenicIndicator <em>Allergenic Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #getAllergenicIndicator()
	 * @generated
	 */
	void setAllergenicIndicator(org.hl7.emf.fhir.Boolean value);

} // DeviceDefinitionMaterial
