/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Conforms To</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionConformsTo#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionConformsTo#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionConformsTo#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionConformsTo#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionConformsTo()
 * @model extendedMetaData="name='DeviceDefinition.ConformsTo' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinitionConformsTo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the type of the standard, specification, or formal guidance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionConformsTo_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionConformsTo#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code that identifies the specific standard, specification, protocol, formal guidance, regulation, legislation, or certification scheme to which the device adheres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionConformsTo_Specification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specification' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSpecification();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionConformsTo#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the specific form or variant of the standard, specification, or formal guidance. This may be a 'version number', release, document edition, publication year, or other label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionConformsTo_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.emf.fhir.String> getVersion();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard, regulation, certification, or guidance website, document, or other publication, or similar, supporting the conformance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionConformsTo_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getSource();

} // DeviceDefinitionConformsTo
