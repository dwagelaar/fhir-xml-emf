/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Definition Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product, being a substance or combination of substances that is intended to treat, prevent or diagnose a disease, or to restore, correct or modify physiological functions by exerting a pharmacological, immunological or metabolic action. This resource is intended to define and detail such products and their properties, for uses other than direct patient care (e.g. regulatory use, or drug catalogs).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionName#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionName#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionName#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionName#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName()
 * @model extendedMetaData="name='MedicinalProductDefinition.Name' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductDefinitionName extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full product name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Name</em>' containment reference.
	 * @see #setProductName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName_ProductName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='productName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProductName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionName#getProductName <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' containment reference.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of product name, such as rINN, BAN, Proprietary, Non-Proprietary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionName#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductDefinitionPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coding words or phrases of the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName_Part()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDefinitionPart> getPart();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductDefinitionUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Country and jurisdiction where the name applies, and associated language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName_Usage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDefinitionUsage> getUsage();

} // MedicinalProductDefinitionName
