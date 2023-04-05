/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Attribute Estimate</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getLevel <em>Level</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getRange <em>Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getAttributeEstimate <em>Attribute Estimate</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceAttributeEstimate()
 * @model extendedMetaData="name='Evidence.AttributeEstimate' kind='elementOnly'"
 * @generated
 */
public interface EvidenceAttributeEstimate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable summary of the estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceAttributeEstimate_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Footnote or explanatory note about the estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceAttributeEstimate_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of attribute estimate, e.g., confidence interval or p value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceAttributeEstimate_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The singular quantity of the attribute estimate, for attribute estimates represented as single values; also used to report unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceAttributeEstimate_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use 95 for a 95% confidence interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' containment reference.
	 * @see #setLevel(Decimal)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceAttributeEstimate_Level()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='level' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getLevel();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getLevel <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' containment reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Decimal value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lower bound of confidence interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceAttributeEstimate_Range()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceAttributeEstimate#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Attribute Estimate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.EvidenceAttributeEstimate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A nested attribute estimate; which is the attribute estimate of an attribute estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Estimate</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceAttributeEstimate_AttributeEstimate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeEstimate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceAttributeEstimate> getAttributeEstimate();

} // EvidenceAttributeEstimate
