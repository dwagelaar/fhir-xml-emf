/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permission resource holds access rules for a given data and context.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Permission#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Permission#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Permission#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Permission#getValidity <em>Validity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Permission#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Permission#getCombining <em>Combining</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Permission#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getPermission()
 * @model extendedMetaData="name='Permission' kind='elementOnly'"
 * @generated
 */
public interface Permission extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PermissionStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getPermission_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PermissionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Permission#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PermissionStatus value);

	/**
	 * Returns the value of the '<em><b>Asserter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or entity that asserts the permission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asserter</em>' containment reference.
	 * @see #setAsserter(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getPermission_Asserter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asserter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAsserter();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Permission#getAsserter <em>Asserter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserter</em>' containment reference.
	 * @see #getAsserter()
	 * @generated
	 */
	void setAsserter(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DateTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that permission was asserted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPermission_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateTime> getDate();

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period in which the permission is active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity</em>' containment reference.
	 * @see #setValidity(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getPermission_Validity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validity' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValidity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Permission#getValidity <em>Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' containment reference.
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(Period value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The asserted justification for using the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Justification</em>' containment reference.
	 * @see #setJustification(PermissionJustification)
	 * @see org.hl7.emf.fhir.FhirPackage#getPermission_Justification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='justification' namespace='##targetNamespace'"
	 * @generated
	 */
	PermissionJustification getJustification();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Permission#getJustification <em>Justification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' containment reference.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(PermissionJustification value);

	/**
	 * Returns the value of the '<em><b>Combining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a procedure for arriving at an access decision given the set of rules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combining</em>' containment reference.
	 * @see #setCombining(PermissionRuleCombining)
	 * @see org.hl7.emf.fhir.FhirPackage#getPermission_Combining()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='combining' namespace='##targetNamespace'"
	 * @generated
	 */
	PermissionRuleCombining getCombining();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Permission#getCombining <em>Combining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combining</em>' containment reference.
	 * @see #getCombining()
	 * @generated
	 */
	void setCombining(PermissionRuleCombining value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PermissionRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of rules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPermission_Rule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PermissionRule> getRule();

} // Permission
