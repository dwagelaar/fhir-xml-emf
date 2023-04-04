/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Plan Test Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A plan for executing testing on an artifact or specifications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.TestPlanTestRun#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlanTestRun#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getTestPlanTestRun()
 * @model extendedMetaData="name='TestPlan.TestRun' kind='elementOnly'"
 * @generated
 */
public interface TestPlanTestRun extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Narrative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The narrative description of the tests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Narrative</em>' containment reference.
	 * @see #setNarrative(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlanTestRun_Narrative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='narrative' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getNarrative();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlanTestRun#getNarrative <em>Narrative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Narrative</em>' containment reference.
	 * @see #getNarrative()
	 * @generated
	 */
	void setNarrative(Markdown value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test cases in a structured language e.g. gherkin, Postman, or FHIR TestScript.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(TestPlanScript)
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlanTestRun_Script()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace'"
	 * @generated
	 */
	TestPlanScript getScript();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TestPlanTestRun#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(TestPlanScript value);

} // TestPlanTestRun
