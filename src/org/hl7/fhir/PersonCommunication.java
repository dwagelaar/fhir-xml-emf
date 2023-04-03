/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Demographics and administrative information about a person independent of a specific health-related context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PersonCommunication#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.PersonCommunication#getPreferred <em>Preferred</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPersonCommunication()
 * @model extendedMetaData="name='Person.Communication' kind='elementOnly'"
 * @generated
 */
public interface PersonCommunication extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-AU" for Australian English.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPersonCommunication_Language()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PersonCommunication#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Preferred</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the person prefers this language (over other languages he masters up a certain level).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred</em>' containment reference.
	 * @see #setPreferred(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getPersonCommunication_Preferred()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preferred' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getPreferred();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PersonCommunication#getPreferred <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred</em>' containment reference.
	 * @see #getPreferred()
	 * @generated
	 */
	void setPreferred(org.hl7.fhir.Boolean value);

} // PersonCommunication
