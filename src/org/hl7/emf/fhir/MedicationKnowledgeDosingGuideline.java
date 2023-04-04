/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Dosing Guideline</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledgeDosingGuideline#getTreatmentIntent <em>Treatment Intent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledgeDosingGuideline#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledgeDosingGuideline#getAdministrationTreatment <em>Administration Treatment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledgeDosingGuideline#getPatientCharacteristic <em>Patient Characteristic</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeDosingGuideline()
 * @model extendedMetaData="name='MedicationKnowledge.DosingGuideline' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeDosingGuideline extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Treatment Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overall intention of the treatment, for example, prophylactic, supporative, curative, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment Intent</em>' containment reference.
	 * @see #setTreatmentIntent(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeDosingGuideline_TreatmentIntent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='treatmentIntent' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTreatmentIntent();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledgeDosingGuideline#getTreatmentIntent <em>Treatment Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment Intent</em>' containment reference.
	 * @see #getTreatmentIntent()
	 * @generated
	 */
	void setTreatmentIntent(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgeDosage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dosage for the medication for the specific guidelines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeDosingGuideline_Dosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeDosage> getDosage();

	/**
	 * Returns the value of the '<em><b>Administration Treatment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the treatment that the guideline applies to, for example, long term therapy, first line treatment, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administration Treatment</em>' containment reference.
	 * @see #setAdministrationTreatment(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeDosingGuideline_AdministrationTreatment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='administrationTreatment' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdministrationTreatment();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledgeDosingGuideline#getAdministrationTreatment <em>Administration Treatment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administration Treatment</em>' containment reference.
	 * @see #getAdministrationTreatment()
	 * @generated
	 */
	void setAdministrationTreatment(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgePatientCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Characteristic</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeDosingGuideline_PatientCharacteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientCharacteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgePatientCharacteristic> getPatientCharacteristic();

} // MedicationKnowledgeDosingGuideline
