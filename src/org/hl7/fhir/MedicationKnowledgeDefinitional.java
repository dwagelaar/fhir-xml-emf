/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Definitional</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeDefinitional#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeDefinitional#getDoseForm <em>Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeDefinitional#getIntendedRoute <em>Intended Route</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeDefinitional#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeDefinitional#getDrugCharacteristic <em>Drug Characteristic</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeDefinitional()
 * @model extendedMetaData="name='MedicationKnowledge.Definitional' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeDefinitional extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associated definitions for this medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeDefinitional_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDefinition();

	/**
	 * Returns the value of the '<em><b>Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the form of the item.  Powder; tablets; capsule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Form</em>' containment reference.
	 * @see #setDoseForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeDefinitional_DoseForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeDefinitional#getDoseForm <em>Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Form</em>' containment reference.
	 * @see #getDoseForm()
	 * @generated
	 */
	void setDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intended Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended or approved route of administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Route</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeDefinitional_IntendedRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedRoute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIntendedRoute();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeIngredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a particular constituent of interest in the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeDefinitional_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeIngredient> getIngredient();

	/**
	 * Returns the value of the '<em><b>Drug Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeDrugCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drug Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeDefinitional_DrugCharacteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='drugCharacteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeDrugCharacteristic> getDrugCharacteristic();

} // MedicationKnowledgeDefinitional
