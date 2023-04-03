/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode Of Care Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EpisodeOfCareReason#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCareReason#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareReason()
 * @model extendedMetaData="name='EpisodeOfCare.Reason' kind='elementOnly'"
 * @generated
 */
public interface EpisodeOfCareReason extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the reason value should be used as e.g. Chief Complaint, Health Concern, Health Maintenance (including screening).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareReason_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCareReason#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The medical reason that is expected to be addressed during the episode of care, expressed as a text, code or a reference to another resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareReason_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getValue();

} // EpisodeOfCareReason
