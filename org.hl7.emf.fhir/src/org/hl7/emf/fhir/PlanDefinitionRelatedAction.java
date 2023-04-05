/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Related Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, and drug quality specifications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getEndRelationship <em>End Relationship</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getOffsetDuration <em>Offset Duration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getOffsetRange <em>Offset Range</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionRelatedAction()
 * @model extendedMetaData="name='PlanDefinition.RelatedAction' kind='elementOnly'"
 * @generated
 */
public interface PlanDefinitionRelatedAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element id of the target related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Id</em>' containment reference.
	 * @see #setTargetId(Id)
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionRelatedAction_TargetId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getTargetId();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getTargetId <em>Target Id</em>}' containment reference.
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
	 * The relationship of the start of this action to the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(ActionRelationshipType)
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionRelatedAction_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionRelationshipType getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getRelationship <em>Relationship</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionRelatedAction_EndRelationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endRelationship' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionRelationshipType getEndRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getEndRelationship <em>End Relationship</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionRelatedAction_OffsetDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getOffsetDuration();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getOffsetDuration <em>Offset Duration</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionRelatedAction_OffsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOffsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionRelatedAction#getOffsetRange <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Range</em>' containment reference.
	 * @see #getOffsetRange()
	 * @generated
	 */
	void setOffsetRange(Range value);

} // PlanDefinitionRelatedAction
