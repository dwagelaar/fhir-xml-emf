/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Classification</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DeviceDefinitionClassification#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionClassification#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionClassification()
 * @model extendedMetaData="name='DeviceDefinition.Classification' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinitionClassification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification or risk class of the device model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionClassification_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionClassification#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further information qualifying this classification of the device model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Justification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionClassification_Justification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='justification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getJustification();

} // DeviceDefinitionClassification
