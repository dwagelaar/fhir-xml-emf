/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Storage Guideline</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeStorageGuideline#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeStorageGuideline#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeStorageGuideline#getStabilityDuration <em>Stability Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeStorageGuideline#getEnvironmentalSetting <em>Environmental Setting</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeStorageGuideline()
 * @model extendedMetaData="name='MedicationKnowledge.StorageGuideline' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeStorageGuideline extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to additional information about the storage guidelines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Uri)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeStorageGuideline_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeStorageGuideline#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Uri value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional notes about the storage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeStorageGuideline_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Stability Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration that the medication remains stable if the environmentalSetting is respected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stability Duration</em>' containment reference.
	 * @see #setStabilityDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeStorageGuideline_StabilityDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stabilityDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getStabilityDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeStorageGuideline#getStabilityDuration <em>Stability Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stability Duration</em>' containment reference.
	 * @see #getStabilityDuration()
	 * @generated
	 */
	void setStabilityDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Environmental Setting</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeEnvironmentalSetting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a setting/value on the environment for the adequate storage of the medication and other substances.  Environment settings may involve temperature, humidity, or exposure to light.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environmental Setting</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeStorageGuideline_EnvironmentalSetting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environmentalSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeEnvironmentalSetting> getEnvironmentalSetting();

} // MedicationKnowledgeStorageGuideline
