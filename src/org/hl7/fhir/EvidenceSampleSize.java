/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Sample Size</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EvidenceSampleSize#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceSampleSize#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceSampleSize#getNumberOfStudies <em>Number Of Studies</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceSampleSize#getNumberOfParticipants <em>Number Of Participants</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceSampleSize#getKnownDataCount <em>Known Data Count</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidenceSampleSize()
 * @model extendedMetaData="name='Evidence.SampleSize' kind='elementOnly'"
 * @generated
 */
public interface EvidenceSampleSize extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable summary of population sample size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceSampleSize_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceSampleSize#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Footnote or explanatory note about the sample size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceSampleSize_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Number Of Studies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of participants in the population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Studies</em>' containment reference.
	 * @see #setNumberOfStudies(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceSampleSize_NumberOfStudies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfStudies' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfStudies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceSampleSize#getNumberOfStudies <em>Number Of Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Studies</em>' containment reference.
	 * @see #getNumberOfStudies()
	 * @generated
	 */
	void setNumberOfStudies(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Number Of Participants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable string to clarify or explain concepts about the sample size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Participants</em>' containment reference.
	 * @see #setNumberOfParticipants(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceSampleSize_NumberOfParticipants()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfParticipants' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfParticipants();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceSampleSize#getNumberOfParticipants <em>Number Of Participants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Participants</em>' containment reference.
	 * @see #getNumberOfParticipants()
	 * @generated
	 */
	void setNumberOfParticipants(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Known Data Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of participants with known results for measured variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Known Data Count</em>' containment reference.
	 * @see #setKnownDataCount(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceSampleSize_KnownDataCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='knownDataCount' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getKnownDataCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceSampleSize#getKnownDataCount <em>Known Data Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Known Data Count</em>' containment reference.
	 * @see #getKnownDataCount()
	 * @generated
	 */
	void setKnownDataCount(UnsignedInt value);

} // EvidenceSampleSize
