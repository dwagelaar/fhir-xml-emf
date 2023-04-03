/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Orchestration Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RequestOrchestrationCondition#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestrationCondition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationCondition()
 * @model extendedMetaData="name='RequestOrchestration.Condition' kind='elementOnly'"
 * @generated
 */
public interface RequestOrchestrationCondition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(ActionConditionKind)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationCondition_Kind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionConditionKind getKind();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationCondition#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ActionConditionKind value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression that returns true or false, indicating whether or not the condition is satisfied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationCondition_Expression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationCondition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // RequestOrchestrationCondition
