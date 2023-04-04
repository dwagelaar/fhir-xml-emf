/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.  Encounter is primarily used to record information about the actual activities that occurred, where Appointment is used to record planned activities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.EncounterReason#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EncounterReason#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEncounterReason()
 * @model extendedMetaData="name='Encounter.Reason' kind='elementOnly'"
 * @generated
 */
public interface EncounterReason extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the reason value should be used as e.g. Chief Complaint, Health Concern, Health Maintenance (including screening).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEncounterReason_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getUse();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason the encounter takes place, expressed as a code or a reference to another resource. For admissions, this can be used for a coded admission diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEncounterReason_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getValue();

} // EncounterReason
