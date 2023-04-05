/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Guideline</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionGuideline#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionGuideline#getUsageInstruction <em>Usage Instruction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionGuideline#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionGuideline#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionGuideline#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionGuideline#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionGuideline#getIntendedUse <em>Intended Use</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionGuideline()
 * @model extendedMetaData="name='DeviceDefinition.Guideline' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinitionGuideline extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The circumstances that form the setting for using the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionGuideline_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getUseContext();

	/**
	 * Returns the value of the '<em><b>Usage Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed written and visual directions for the user on how to use the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Instruction</em>' containment reference.
	 * @see #setUsageInstruction(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionGuideline_UsageInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getUsageInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionGuideline#getUsageInstruction <em>Usage Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Instruction</em>' containment reference.
	 * @see #getUsageInstruction()
	 * @generated
	 */
	void setUsageInstruction(Markdown value);

	/**
	 * Returns the value of the '<em><b>Related Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A source of information or reference for this guideline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Artifact</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionGuideline_RelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifact();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A clinical condition for which the device was designed to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionGuideline_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIndication();

	/**
	 * Returns the value of the '<em><b>Contraindication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific situation when a device should not be used because it may cause harm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contraindication</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionGuideline_Contraindication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contraindication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getContraindication();

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific hazard alert information that a user needs to know before using the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warning</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionGuideline_Warning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='warning' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getWarning();

	/**
	 * Returns the value of the '<em><b>Intended Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the general purpose or medical use of the device or its function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Use</em>' containment reference.
	 * @see #setIntendedUse(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionGuideline_IntendedUse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedUse' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getIntendedUse();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionGuideline#getIntendedUse <em>Intended Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Use</em>' containment reference.
	 * @see #getIntendedUse()
	 * @generated
	 */
	void setIntendedUse(org.hl7.emf.fhir.String value);

} // DeviceDefinitionGuideline
