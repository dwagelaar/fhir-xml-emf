/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Definition Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GraphDefinitionNode#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.hl7.fhir.GraphDefinitionNode#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.GraphDefinitionNode#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.GraphDefinitionNode#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionNode()
 * @model extendedMetaData="name='GraphDefinition.Node' kind='elementOnly'"
 * @generated
 */
public interface GraphDefinitionNode extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal ID of node - target for link references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #setNodeId(Id)
	 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionNode_NodeId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getNodeId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GraphDefinitionNode#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' containment reference.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(Id value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about why this node is of interest in this graph definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionNode_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GraphDefinitionNode#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of resource this link refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(VersionIndependentResourceTypesAll)
	 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionNode_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionIndependentResourceTypesAll getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GraphDefinitionNode#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(VersionIndependentResourceTypesAll value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Profile for the target resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionNode_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GraphDefinitionNode#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Canonical value);

} // GraphDefinitionNode
