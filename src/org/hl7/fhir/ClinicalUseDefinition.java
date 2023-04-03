/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Use Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getUndesirableEffect <em>Undesirable Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalUseDefinition#getWarning <em>Warning</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition()
 * @model extendedMetaData="name='ClinicalUseDefinition' kind='elementOnly'"
 * @generated
 */
public interface ClinicalUseDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier for this issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * indication | contraindication | interaction | undesirable-effect | warning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ClinicalUseDefinitionType)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalUseDefinitionType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClinicalUseDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A categorisation of the issue, primarily for dividing warnings into subject heading areas such as "Pregnancy and Lactation", "Overdose", "Effects on Ability to Drive and Use Machines".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The medication, product, substance, device, procedure etc. for which this is an indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this is a current issue or one that has been retired etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Contraindication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifics for when this is a contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contraindication</em>' containment reference.
	 * @see #setContraindication(ClinicalUseDefinitionContraindication)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Contraindication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contraindication' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalUseDefinitionContraindication getContraindication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinition#getContraindication <em>Contraindication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contraindication</em>' containment reference.
	 * @see #getContraindication()
	 * @generated
	 */
	void setContraindication(ClinicalUseDefinitionContraindication value);

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifics for when this is an indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference.
	 * @see #setIndication(ClinicalUseDefinitionIndication)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalUseDefinitionIndication getIndication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinition#getIndication <em>Indication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indication</em>' containment reference.
	 * @see #getIndication()
	 * @generated
	 */
	void setIndication(ClinicalUseDefinitionIndication value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifics for when this is an interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference.
	 * @see #setInteraction(ClinicalUseDefinitionInteraction)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Interaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalUseDefinitionInteraction getInteraction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinition#getInteraction <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' containment reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(ClinicalUseDefinitionInteraction value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The population group to which this applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPopulation();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logic used by the clinical use definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Library()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getLibrary();

	/**
	 * Returns the value of the '<em><b>Undesirable Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describe the possible undesirable effects (negative outcomes) from the use of the medicinal product as treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undesirable Effect</em>' containment reference.
	 * @see #setUndesirableEffect(ClinicalUseDefinitionUndesirableEffect)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_UndesirableEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='undesirableEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalUseDefinitionUndesirableEffect getUndesirableEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinition#getUndesirableEffect <em>Undesirable Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undesirable Effect</em>' containment reference.
	 * @see #getUndesirableEffect()
	 * @generated
	 */
	void setUndesirableEffect(ClinicalUseDefinitionUndesirableEffect value);

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A critical piece of information about environmental, health or physical risks or hazards that serve as caution to the user. For example 'Do not operate heavy machinery', 'May cause drowsiness', or 'Get medical advice/attention if you feel unwell'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warning</em>' containment reference.
	 * @see #setWarning(ClinicalUseDefinitionWarning)
	 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinition_Warning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='warning' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalUseDefinitionWarning getWarning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalUseDefinition#getWarning <em>Warning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning</em>' containment reference.
	 * @see #getWarning()
	 * @generated
	 */
	void setWarning(ClinicalUseDefinitionWarning value);

} // ClinicalUseDefinition
