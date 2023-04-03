/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Certainty</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EvidenceCertainty#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceCertainty#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceCertainty#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceCertainty#getRating <em>Rating</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceCertainty#getRater <em>Rater</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceCertainty#getSubcomponent <em>Subcomponent</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidenceCertainty()
 * @model extendedMetaData="name='Evidence.Certainty' kind='elementOnly'"
 * @generated
 */
public interface EvidenceCertainty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description of certainty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceCertainty_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceCertainty#getDescription <em>Description</em>}' containment reference.
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
	 * Footnotes and/or explanatory notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceCertainty_Note()
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
	 * Aspect of certainty being rated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceCertainty_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceCertainty#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment or judgement of the aspect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rating</em>' containment reference.
	 * @see #setRating(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceCertainty_Rating()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rating' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRating();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceCertainty#getRating <em>Rating</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' containment reference.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Rater</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual or group who did the rating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rater</em>' containment reference.
	 * @see #setRater(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceCertainty_Rater()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rater' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRater();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceCertainty#getRater <em>Rater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rater</em>' containment reference.
	 * @see #getRater()
	 * @generated
	 */
	void setRater(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceCertainty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A domain or subdomain of certainty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subcomponent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceCertainty_Subcomponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subcomponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceCertainty> getSubcomponent();

} // EvidenceCertainty
