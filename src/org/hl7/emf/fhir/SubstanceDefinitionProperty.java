/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueAttachment <em>Value Attachment</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionProperty()
 * @model extendedMetaData="name='SubstanceDefinition.Property' kind='elementOnly'"
 * @generated
 */
public interface SubstanceDefinitionProperty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code expressing the type of property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionProperty_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #setValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionProperty_ValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueCodeableConcept <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #getValueCodeableConcept()
	 * @generated
	 */
	void setValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionProperty_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date</em>' containment reference.
	 * @see #setValueDate(Date)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionProperty_ValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueDate <em>Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date</em>' containment reference.
	 * @see #getValueDate()
	 * @generated
	 */
	void setValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean</em>' containment reference.
	 * @see #setValueBoolean(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionProperty_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attachment</em>' containment reference.
	 * @see #setValueAttachment(Attachment)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionProperty_ValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionProperty#getValueAttachment <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attachment</em>' containment reference.
	 * @see #getValueAttachment()
	 * @generated
	 */
	void setValueAttachment(Attachment value);

} // SubstanceDefinitionProperty
