/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Medicine Classification</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledgeMedicineClassification#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledgeMedicineClassification#getSourceString <em>Source String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledgeMedicineClassification#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledgeMedicineClassification#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeMedicineClassification()
 * @model extendedMetaData="name='MedicationKnowledge.MedicineClassification' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeMedicineClassification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of category for the medication (for example, therapeutic classification, therapeutic sub-classification).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeMedicineClassification_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledgeMedicineClassification#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source String</em>' containment reference.
	 * @see #setSourceString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeMedicineClassification_SourceString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getSourceString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledgeMedicineClassification#getSourceString <em>Source String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source String</em>' containment reference.
	 * @see #getSourceString()
	 * @generated
	 */
	void setSourceString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Uri</em>' containment reference.
	 * @see #setSourceUri(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeMedicineClassification_SourceUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSourceUri();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledgeMedicineClassification#getSourceUri <em>Source Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Uri</em>' containment reference.
	 * @see #getSourceUri()
	 * @generated
	 */
	void setSourceUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific category assigned to the medication (e.g. anti-infective, anti-hypertensive, antibiotic, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledgeMedicineClassification_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassification();

} // MedicationKnowledgeMedicineClassification
