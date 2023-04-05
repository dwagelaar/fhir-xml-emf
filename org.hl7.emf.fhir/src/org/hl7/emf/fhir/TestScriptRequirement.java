/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.TestScriptRequirement#getLinkUri <em>Link Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestScriptRequirement#getLinkCanonical <em>Link Canonical</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getTestScriptRequirement()
 * @model extendedMetaData="name='TestScript.Requirement' kind='elementOnly'"
 * @generated
 */
public interface TestScriptRequirement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Uri</em>' containment reference.
	 * @see #setLinkUri(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestScriptRequirement_LinkUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getLinkUri();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestScriptRequirement#getLinkUri <em>Link Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Uri</em>' containment reference.
	 * @see #getLinkUri()
	 * @generated
	 */
	void setLinkUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Link Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Canonical</em>' containment reference.
	 * @see #setLinkCanonical(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestScriptRequirement_LinkCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getLinkCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestScriptRequirement#getLinkCanonical <em>Link Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Canonical</em>' containment reference.
	 * @see #getLinkCanonical()
	 * @generated
	 */
	void setLinkCanonical(Canonical value);

} // TestScriptRequirement
