/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Orchestration Related Action</b></em>'.
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
 *   <li>{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getEndRelationship <em>End Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getOffsetDuration <em>Offset Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getOffsetRange <em>Offset Range</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationRelatedAction()
 * @model extendedMetaData="name='RequestOrchestration.RelatedAction' kind='elementOnly'"
 * @generated
 */
public interface RequestOrchestrationRelatedAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element id of the target related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Id</em>' containment reference.
	 * @see #setTargetId(Id)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationRelatedAction_TargetId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getTargetId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getTargetId <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' containment reference.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(Id value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of this action to the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(ActionRelationshipType)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationRelatedAction_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionRelationshipType getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(ActionRelationshipType value);

	/**
	 * Returns the value of the '<em><b>End Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of the end of this action to the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Relationship</em>' containment reference.
	 * @see #setEndRelationship(ActionRelationshipType)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationRelatedAction_EndRelationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endRelationship' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionRelationshipType getEndRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getEndRelationship <em>End Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Relationship</em>' containment reference.
	 * @see #getEndRelationship()
	 * @generated
	 */
	void setEndRelationship(ActionRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Offset Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Duration</em>' containment reference.
	 * @see #setOffsetDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationRelatedAction_OffsetDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getOffsetDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getOffsetDuration <em>Offset Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Duration</em>' containment reference.
	 * @see #getOffsetDuration()
	 * @generated
	 */
	void setOffsetDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Offset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Range</em>' containment reference.
	 * @see #setOffsetRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationRelatedAction_OffsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOffsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationRelatedAction#getOffsetRange <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Range</em>' containment reference.
	 * @see #getOffsetRange()
	 * @generated
	 */
	void setOffsetRange(Range value);

} // RequestOrchestrationRelatedAction
