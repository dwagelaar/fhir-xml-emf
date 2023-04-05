/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Scope</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.TestScriptScope#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestScriptScope#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestScriptScope#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getTestScriptScope()
 * @model extendedMetaData="name='TestScript.Scope' kind='elementOnly'"
 * @generated
 */
public interface TestScriptScope extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific conformance artifact being tested. The canonical reference can be version-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference.
	 * @see #setArtifact(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestScriptScope_Artifact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getArtifact();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestScriptScope#getArtifact <em>Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' containment reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(Canonical value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expectation of whether the test must pass for the system to be considered conformant with the artifact: required - all tests are expected to pass, optional - all test are expected to pass but non-pass status may be allowed, strict - all tests are expected to pass and warnings are treated as a failure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference.
	 * @see #setConformance(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestScriptScope_Conformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conformance' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getConformance();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestScriptScope#getConformance <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' containment reference.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The phase of testing for this artifact: unit - development / implementation phase, integration - internal system to system phase, production - live system to system phase (Note, this may involve pii/phi data).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference.
	 * @see #setPhase(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestScriptScope_Phase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phase' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPhase();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestScriptScope#getPhase <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' containment reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(CodeableConcept value);

} // TestScriptScope
