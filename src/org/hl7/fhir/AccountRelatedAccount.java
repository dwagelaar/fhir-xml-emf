/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Related Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AccountRelatedAccount#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.AccountRelatedAccount#getAccount <em>Account</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAccountRelatedAccount()
 * @model extendedMetaData="name='Account.RelatedAccount' kind='elementOnly'"
 * @generated
 */
public interface AccountRelatedAccount extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationship of the associated Account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAccountRelatedAccount_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountRelatedAccount#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to an associated Account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account</em>' containment reference.
	 * @see #setAccount(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAccountRelatedAccount_Account()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='account' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAccount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountRelatedAccount#getAccount <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' containment reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Reference value);

} // AccountRelatedAccount
