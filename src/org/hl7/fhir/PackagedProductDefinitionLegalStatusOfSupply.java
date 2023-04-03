/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Product Definition Legal Status Of Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medically related item or items, in a container or package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply#getJurisdiction <em>Jurisdiction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionLegalStatusOfSupply()
 * @model extendedMetaData="name='PackagedProductDefinition.LegalStatusOfSupply' kind='elementOnly'"
 * @generated
 */
public interface PackagedProductDefinitionLegalStatusOfSupply extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual status of supply. Conveys in what situation this package type may be supplied for use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionLegalStatusOfSupply_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The place where the legal status of supply applies. When not specified, this indicates it is unknown in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionLegalStatusOfSupply_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getJurisdiction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(CodeableConcept value);

} // PackagedProductDefinitionLegalStatusOfSupply
