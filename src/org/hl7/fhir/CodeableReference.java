/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codeable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a resource (by instance), or instead, a reference to a concept defined in a terminology or ontology (by class).
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CodeableReference#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeableReference#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCodeableReference()
 * @model extendedMetaData="name='CodeableReference' kind='elementOnly'"
 * @generated
 */
public interface CodeableReference extends DataType {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a concept - e.g. the information is identified by its general class to the degree of precision found in the terminology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference.
	 * @see #setConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCodeableReference_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeableReference#getConcept <em>Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' containment reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a resource the provides exact details about the information being referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCodeableReference_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeableReference#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // CodeableReference
