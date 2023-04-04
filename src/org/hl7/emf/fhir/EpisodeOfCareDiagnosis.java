/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode Of Care Diagnosis</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.EpisodeOfCareDiagnosis#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EpisodeOfCareDiagnosis#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEpisodeOfCareDiagnosis()
 * @model extendedMetaData="name='EpisodeOfCare.Diagnosis' kind='elementOnly'"
 * @generated
 */
public interface EpisodeOfCareDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The medical condition that was addressed during the episode of care, expressed as a text, code or a reference to another resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEpisodeOfCareDiagnosis_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getCondition();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEpisodeOfCareDiagnosis_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUse();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EpisodeOfCareDiagnosis#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(CodeableConcept value);

} // EpisodeOfCareDiagnosis
