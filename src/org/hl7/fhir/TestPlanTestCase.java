/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Plan Test Case</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TestPlanTestCase#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanTestCase#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanTestCase#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanTestCase#getTestRun <em>Test Run</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanTestCase#getTestData <em>Test Data</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanTestCase#getAssertion <em>Assertion</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestPlanTestCase()
 * @model extendedMetaData="name='TestPlan.TestCase' kind='elementOnly'"
 * @generated
 */
public interface TestPlanTestCase extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence of test case - an ordinal number that indicates the order for the present test case in the test plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getTestPlanTestCase_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestPlanTestCase#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scope or artifact covered by the case, when the individual test case is associated with a testable artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestPlanTestCase_Scope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getScope();

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestPlanDependency1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required criteria to execute the test case - e.g. preconditions, previous tests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestPlanTestCase_Dependency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestPlanDependency1> getDependency();

	/**
	 * Returns the value of the '<em><b>Test Run</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestPlanTestRun}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual test to be executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Run</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestPlanTestCase_TestRun()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testRun' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestPlanTestRun> getTestRun();

	/**
	 * Returns the value of the '<em><b>Test Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestPlanTestData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test data used in the test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Data</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestPlanTestCase_TestData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestPlanTestData> getTestData();

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestPlanAssertion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test assertions - the expectations of test results from the execution of the test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestPlanTestCase_Assertion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assertion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestPlanAssertion> getAssertion();

} // TestPlanTestCase
