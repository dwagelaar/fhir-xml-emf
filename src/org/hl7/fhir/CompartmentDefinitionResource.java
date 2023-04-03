/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Definition Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A compartment definition that defines how resources are accessed on a server.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CompartmentDefinitionResource#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.CompartmentDefinitionResource#getParam <em>Param</em>}</li>
 *   <li>{@link org.hl7.fhir.CompartmentDefinitionResource#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.CompartmentDefinitionResource#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link org.hl7.fhir.CompartmentDefinitionResource#getEndParam <em>End Param</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCompartmentDefinitionResource()
 * @model extendedMetaData="name='CompartmentDefinition.Resource' kind='elementOnly'"
 * @generated
 */
public interface CompartmentDefinitionResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a resource supported by the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(ResourceType)
	 * @see org.hl7.fhir.FhirPackage#getCompartmentDefinitionResource_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceType getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompartmentDefinitionResource#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a search parameter that represents the link to the compartment. More than one may be listed because a resource may be linked to a compartment in more than one way,.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCompartmentDefinitionResource_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getParam();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional documentation about the resource and compartment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCompartmentDefinitionResource_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompartmentDefinitionResource#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Start Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search Parameter for mapping requests made with $everything.start (e.g. on [Patient.$everything](patient-operation-everything.html)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Param</em>' containment reference.
	 * @see #setStartParam(Uri)
	 * @see org.hl7.fhir.FhirPackage#getCompartmentDefinitionResource_StartParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startParam' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getStartParam();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompartmentDefinitionResource#getStartParam <em>Start Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Param</em>' containment reference.
	 * @see #getStartParam()
	 * @generated
	 */
	void setStartParam(Uri value);

	/**
	 * Returns the value of the '<em><b>End Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search Parameter for mapping requests made with $everything.end (e.g. on [Patient.$everything](patient-operation-everything.html)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Param</em>' containment reference.
	 * @see #setEndParam(Uri)
	 * @see org.hl7.fhir.FhirPackage#getCompartmentDefinitionResource_EndParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endParam' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getEndParam();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompartmentDefinitionResource#getEndParam <em>End Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Param</em>' containment reference.
	 * @see #getEndParam()
	 * @generated
	 */
	void setEndParam(Uri value);

} // CompartmentDefinitionResource
