/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Variable Definition</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getVariableRole <em>Variable Role</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getObserved <em>Observed</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getIntended <em>Intended</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getDirectnessMatch <em>Directness Match</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinition()
 * @model extendedMetaData="name='Evidence.VariableDefinition' kind='elementOnly'"
 * @generated
 */
public interface EvidenceVariableDefinition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text description or summary of the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getDescription <em>Description</em>}' containment reference.
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
	 * Footnotes and/or explanatory notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinition_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Variable Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * population | subpopulation | exposure | referenceExposure | measuredVariable | confounder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Role</em>' containment reference.
	 * @see #setVariableRole(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinition_VariableRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variableRole' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVariableRole();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getVariableRole <em>Variable Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Role</em>' containment reference.
	 * @see #getVariableRole()
	 * @generated
	 */
	void setVariableRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Observed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the actual variable related to the statistic(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observed</em>' containment reference.
	 * @see #setObserved(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinition_Observed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observed' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getObserved();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getObserved <em>Observed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed</em>' containment reference.
	 * @see #getObserved()
	 * @generated
	 */
	void setObserved(Reference value);

	/**
	 * Returns the value of the '<em><b>Intended</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the intended variable related to the Evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended</em>' containment reference.
	 * @see #setIntended(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinition_Intended()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intended' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getIntended();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getIntended <em>Intended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended</em>' containment reference.
	 * @see #getIntended()
	 * @generated
	 */
	void setIntended(Reference value);

	/**
	 * Returns the value of the '<em><b>Directness Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of quality of match between intended variable to actual variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directness Match</em>' containment reference.
	 * @see #setDirectnessMatch(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinition_DirectnessMatch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='directnessMatch' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDirectnessMatch();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableDefinition#getDirectnessMatch <em>Directness Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directness Match</em>' containment reference.
	 * @see #getDirectnessMatch()
	 * @generated
	 */
	void setDirectnessMatch(CodeableConcept value);

} // EvidenceVariableDefinition
