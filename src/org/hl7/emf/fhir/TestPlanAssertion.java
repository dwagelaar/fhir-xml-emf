/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Plan Assertion</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.TestPlanAssertion#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlanAssertion#getObject <em>Object</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TestPlanAssertion#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getTestPlanAssertion()
 * @model extendedMetaData="name='TestPlan.Assertion' kind='elementOnly'"
 * @generated
 */
public interface TestPlanAssertion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test assertion type - this can be used to group assertions as 'required' or 'optional', or can be used for other classification of the assertion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlanAssertion_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The focus or object of the assertion i.e. a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlanAssertion_Object()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getObject();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test assertion - the expected outcome from the test case execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTestPlanAssertion_Result()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getResult();

} // TestPlanAssertion
