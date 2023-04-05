/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Example of workflow instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioStep#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioStep#getProcess <em>Process</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioStep#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioStep#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioStep#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioStep#getPause <em>Pause</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioStep()
 * @model extendedMetaData="name='ExampleScenario.Step' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioStep extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequential number of the step, e.g. 1.2.5.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioStep_Number()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getNumber();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioStep#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the step is a complex sub-process with its own steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(ExampleScenarioProcess)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioStep_Process()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenarioProcess getProcess();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioStep#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(ExampleScenarioProcess value);

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the step is defined by a seaparate scenario instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workflow</em>' containment reference.
	 * @see #setWorkflow(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioStep_Workflow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='workflow' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getWorkflow();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioStep#getWorkflow <em>Workflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' containment reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Canonical value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The step represents a single operation invoked on receiver by sender.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(ExampleScenarioOperation)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioStep_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenarioOperation getOperation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioStep#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ExampleScenarioOperation value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ExampleScenarioAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an alternative step that can be taken instead of the sub-process, scenario or operation.  E.g. to represent non-happy-path/exceptional/atypical circumstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioStep_Alternative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternative' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleScenarioAlternative> getAlternative();

	/**
	 * Returns the value of the '<em><b>Pause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that, following this step, there is a pause in the flow and the subsequent step will occur at some later time (triggered by some event).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pause</em>' containment reference.
	 * @see #setPause(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioStep_Pause()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pause' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getPause();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioStep#getPause <em>Pause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pause</em>' containment reference.
	 * @see #getPause()
	 * @generated
	 */
	void setPause(org.hl7.emf.fhir.Boolean value);

} // ExampleScenarioStep
