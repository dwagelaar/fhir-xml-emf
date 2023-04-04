/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrable Product Definition Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueMarkdown <em>Value Markdown</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty()
 * @model extendedMetaData="name='AdministrableProductDefinition.Property' kind='elementOnly'"
 * @generated
 */
public interface AdministrableProductDefinitionProperty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code expressing the type of characteristic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getType <em>Type</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty_ValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueCodeableConcept <em>Value Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueQuantity <em>Value Quantity</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty_ValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueDate <em>Value Date</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Markdown</em>' containment reference.
	 * @see #setValueMarkdown(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty_ValueMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getValueMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueMarkdown <em>Value Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Markdown</em>' containment reference.
	 * @see #getValueMarkdown()
	 * @generated
	 */
	void setValueMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attachment</em>' containment reference.
	 * @see #setValueAttachment(Attachment)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty_ValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueAttachment <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attachment</em>' containment reference.
	 * @see #getValueAttachment()
	 * @generated
	 */
	void setValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Reference</em>' containment reference.
	 * @see #setValueReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty_ValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getValueReference <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' containment reference.
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of characteristic e.g. assigned or pending.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinitionProperty_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

} // AdministrableProductDefinitionProperty
