/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Variable1</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EvidenceVariable1#getVariableDefinition <em>Variable Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariable1#getHandling <em>Handling</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariable1#getValueCategory <em>Value Category</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariable1#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariable1#getValueRange <em>Value Range</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidenceVariable1()
 * @model extendedMetaData="name='Evidence.Variable' kind='elementOnly'"
 * @generated
 */
public interface EvidenceVariable1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Variable Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Definition</em>' containment reference.
	 * @see #setVariableDefinition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariable1_VariableDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variableDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getVariableDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariable1#getVariableDefinition <em>Variable Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Definition</em>' containment reference.
	 * @see #getVariableDefinition()
	 * @generated
	 */
	void setVariableDefinition(Reference value);

	/**
	 * Returns the value of the '<em><b>Handling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the variable is classified for use in adjusted analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handling</em>' containment reference.
	 * @see #setHandling(EvidenceVariableHandling)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariable1_Handling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handling' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceVariableHandling getHandling();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariable1#getHandling <em>Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling</em>' containment reference.
	 * @see #getHandling()
	 * @generated
	 */
	void setHandling(EvidenceVariableHandling value);

	/**
	 * Returns the value of the '<em><b>Value Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description for grouping of ordinal or polychotomous variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariable1_ValueCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getValueCategory();

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Discrete value for grouping of ordinal or polychotomous variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariable1_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getValueQuantity();

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Range}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Range of values for grouping of ordinal or polychotomous variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariable1_ValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Range> getValueRange();

} // EvidenceVariable1
