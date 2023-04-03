/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Definition Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product, being a substance or combination of substances that is intended to treat, prevent or diagnose a disease, or to restore, correct or modify physiological functions by exerting a pharmacological, immunological or metabolic action. This resource is intended to define and detail such products and their properties, for uses other than direct patient care (e.g. regulatory use, or drug catalogs).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionUsage#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionUsage#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionUsage#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionUsage()
 * @model extendedMetaData="name='MedicinalProductDefinition.Usage' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductDefinitionUsage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Country code for where this name applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionUsage_Country()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCountry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionUsage#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jurisdiction code for where this name applies. A jurisdiction may be a sub- or supra-national entity (e.g. a state or a geographic region).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionUsage_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getJurisdiction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionUsage#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language code for this name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionUsage_Language()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionUsage#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(CodeableConcept value);

} // MedicinalProductDefinitionUsage
