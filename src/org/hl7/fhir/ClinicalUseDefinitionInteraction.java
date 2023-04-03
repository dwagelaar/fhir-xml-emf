/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Use Definition Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionInteraction#getInteractant <em>Interactant</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionInteraction#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionInteraction#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionInteraction#getIncidence <em>Incidence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinitionInteraction#getManagement <em>Management</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionInteraction()
 * @model extendedMetaData="name='ClinicalUseDefinition.Interaction' kind='elementOnly'"
 * @generated
 */
public interface ClinicalUseDefinitionInteraction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Interactant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClinicalUseDefinitionInteractant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific medication, product, food, substance etc. or laboratory test that interacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interactant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionInteraction_Interactant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interactant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalUseDefinitionInteractant> getInteractant();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionInteraction_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinitionInteraction#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effect of the interaction, for example "reduced gastric absorption of primary medication".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionInteraction_Effect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effect' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinitionInteraction#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Incidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incidence of the interaction, e.g. theoretical, observed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incidence</em>' containment reference.
	 * @see #setIncidence(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionInteraction_Incidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incidence' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIncidence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinitionInteraction#getIncidence <em>Incidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence</em>' containment reference.
	 * @see #getIncidence()
	 * @generated
	 */
	void setIncidence(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Management</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions for managing the interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Management</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionInteraction_Management()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='management' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getManagement();

} // ClinicalUseDefinitionInteraction
