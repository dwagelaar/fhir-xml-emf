/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Operation</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioOperation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioOperation#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioOperation#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioOperation#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioOperation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioOperation#getInitiatorActive <em>Initiator Active</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioOperation#getReceiverActive <em>Receiver Active</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioOperation#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExampleScenarioOperation#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation()
 * @model extendedMetaData="name='ExampleScenario.Operation' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The standardized type of action (FHIR or otherwise).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioOperation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short descriptive label the step to be used in tables or diagrams.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioOperation#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system that invokes the action/transmits the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator</em>' containment reference.
	 * @see #setInitiator(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation_Initiator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initiator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getInitiator();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioOperation#getInitiator <em>Initiator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' containment reference.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system on which the action is invoked/receives the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation_Receiver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiver' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getReceiver();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioOperation#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation of what the operation represents and what it does.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioOperation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Initiator Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, the initiator is deactivated right after the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator Active</em>' containment reference.
	 * @see #setInitiatorActive(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation_InitiatorActive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initiatorActive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getInitiatorActive();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioOperation#getInitiatorActive <em>Initiator Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator Active</em>' containment reference.
	 * @see #getInitiatorActive()
	 * @generated
	 */
	void setInitiatorActive(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Receiver Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, the receiver is deactivated right after the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Active</em>' containment reference.
	 * @see #setReceiverActive(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation_ReceiverActive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiverActive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getReceiverActive();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioOperation#getReceiverActive <em>Receiver Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Active</em>' containment reference.
	 * @see #getReceiverActive()
	 * @generated
	 */
	void setReceiverActive(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the instance that is transmitted from requester to receiver as part of the invocation of the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(ExampleScenarioContainedInstance)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenarioContainedInstance getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioOperation#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(ExampleScenarioContainedInstance value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the instance that is transmitted from receiver to requester as part of the operation's synchronous response (if any).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(ExampleScenarioContainedInstance)
	 * @see org.hl7.emf.fhir.FhirPackage#getExampleScenarioOperation_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenarioContainedInstance getResponse();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExampleScenarioOperation#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(ExampleScenarioContainedInstance value);

} // ExampleScenarioOperation
