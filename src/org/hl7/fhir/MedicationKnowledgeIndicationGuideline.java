/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Indication Guideline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a medication that is used to support knowledge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIndicationGuideline#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIndicationGuideline#getDosingGuideline <em>Dosing Guideline</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIndicationGuideline()
 * @model extendedMetaData="name='MedicationKnowledge.IndicationGuideline' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeIndicationGuideline extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication or reason for use of the medication that applies to the specific administration guideline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIndicationGuideline_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getIndication();

	/**
	 * Returns the value of the '<em><b>Dosing Guideline</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeDosingGuideline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guidelines for the dosage of the medication for the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosing Guideline</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIndicationGuideline_DosingGuideline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosingGuideline' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeDosingGuideline> getDosingGuideline();

} // MedicationKnowledgeIndicationGuideline
