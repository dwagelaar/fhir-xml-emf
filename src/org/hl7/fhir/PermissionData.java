/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission Data</b></em>'.
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
 *   <li>{@link org.hl7.fhir.PermissionData#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.PermissionData#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.hl7.fhir.PermissionData#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.PermissionData#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPermissionData()
 * @model extendedMetaData="name='Permission.Data' kind='elementOnly'"
 * @generated
 */
public interface PermissionData extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PermissionResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explicit FHIR Resource references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPermissionData_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PermissionResource> getResource();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data in scope are those with the given codes present in that data .meta.security element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPermissionData_Security()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSecurity();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Period}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical or Operational Relevant period of time that bounds the data controlled by this rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPermissionData_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Period> getPeriod();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used when other data selection elements are insufficient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.hl7.fhir.FhirPackage#getPermissionData_Expression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PermissionData#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // PermissionData
