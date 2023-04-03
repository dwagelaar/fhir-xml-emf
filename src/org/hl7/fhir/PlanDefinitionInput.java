/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Input</b></em>'.
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
 *   <li>{@link org.hl7.fhir.PlanDefinitionInput#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionInput#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionInput#getRelatedData <em>Related Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionInput()
 * @model extendedMetaData="name='PlanDefinition.Input' kind='elementOnly'"
 * @generated
 */
public interface PlanDefinitionInput extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable label for the data requirement used to label data flows in BPMN or similar diagrams. Also provides a human readable label when rendering the data requirement that conveys its purpose to human readers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionInput_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionInput#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the data that is to be provided as input to the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(DataRequirement)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionInput_Requirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRequirement getRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionInput#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(DataRequirement value);

	/**
	 * Returns the value of the '<em><b>Related Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to an existing input or output element that provides data to this input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Data</em>' containment reference.
	 * @see #setRelatedData(Id)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionInput_RelatedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedData' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getRelatedData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionInput#getRelatedData <em>Related Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Data</em>' containment reference.
	 * @see #getRelatedData()
	 * @generated
	 */
	void setRelatedData(Id value);

} // PlanDefinitionInput
