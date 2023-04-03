/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Source Material</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial#getGenus <em>Genus</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial#getCountryOfOrigin <em>Country Of Origin</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionSourceMaterial()
 * @model extendedMetaData="name='SubstanceDefinition.SourceMaterial' kind='elementOnly'"
 * @generated
 */
public interface SubstanceDefinitionSourceMaterial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification that provides the origin of the raw material. Example: cat hair would be an Animal source type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionSourceMaterial_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Genus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The genus of an organism, typically referring to the Latin epithet of the genus element of the plant/animal scientific name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genus</em>' containment reference.
	 * @see #setGenus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionSourceMaterial_Genus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGenus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial#getGenus <em>Genus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genus</em>' containment reference.
	 * @see #getGenus()
	 * @generated
	 */
	void setGenus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Species</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The species of an organism, typically referring to the Latin epithet of the species of the plant/animal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Species</em>' containment reference.
	 * @see #setSpecies(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionSourceMaterial_Species()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='species' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSpecies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial#getSpecies <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' containment reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An anatomical origin of the source material within an organism.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' containment reference.
	 * @see #setPart(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionSourceMaterial_Part()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial#getPart <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' containment reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Country Of Origin</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The country or countries where the material is harvested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Of Origin</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionSourceMaterial_CountryOfOrigin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='countryOfOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCountryOfOrigin();

} // SubstanceDefinitionSourceMaterial
