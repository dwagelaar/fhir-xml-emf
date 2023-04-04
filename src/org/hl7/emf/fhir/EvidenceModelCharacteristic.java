/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Model Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.EvidenceModelCharacteristic#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceModelCharacteristic#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceModelCharacteristic#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceModelCharacteristic#getAttributeEstimate <em>Attribute Estimate</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceModelCharacteristic()
 * @model extendedMetaData="name='Evidence.ModelCharacteristic' kind='elementOnly'"
 * @generated
 */
public interface EvidenceModelCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of a component of the method to generate the statistic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceModelCharacteristic_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceModelCharacteristic#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further specification of the quantified value of the component of the method to generate the statistic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceModelCharacteristic_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceModelCharacteristic#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Quantity value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.EvidenceVariable1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A variable adjusted for in the adjusted analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceModelCharacteristic_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceVariable1> getVariable();

	/**
	 * Returns the value of the '<em><b>Attribute Estimate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.EvidenceAttributeEstimate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An attribute of the statistic used as a model characteristic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Estimate</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceModelCharacteristic_AttributeEstimate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeEstimate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceAttributeEstimate> getAttributeEstimate();

} // EvidenceModelCharacteristic
