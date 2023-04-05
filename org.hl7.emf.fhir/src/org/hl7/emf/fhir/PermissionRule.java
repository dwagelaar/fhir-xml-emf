/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permission resource holds access rules for a given data and context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.PermissionRule#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PermissionRule#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PermissionRule#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PermissionRule#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getPermissionRule()
 * @model extendedMetaData="name='Permission.Rule' kind='elementOnly'"
 * @generated
 */
public interface PermissionRule extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * deny | permit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ConsentProvisionType)
	 * @see org.hl7.emf.fhir.FhirPackage#getPermissionRule_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentProvisionType getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PermissionRule#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ConsentProvisionType value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PermissionData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description or definition of which activities are allowed to be done on the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPermissionRule_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PermissionData> getData();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PermissionActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description or definition of which activities are allowed to be done on the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPermissionRule_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PermissionActivity> getActivity();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What limits apply to the use of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPermissionRule_Limit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='limit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getLimit();

} // PermissionRule
