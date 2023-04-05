/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Procedure</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.AccountProcedure#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AccountProcedure#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AccountProcedure#getDateOfService <em>Date Of Service</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AccountProcedure#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AccountProcedure#getPackageCode <em>Package Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AccountProcedure#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAccountProcedure()
 * @model extendedMetaData="name='Account.Procedure' kind='elementOnly'"
 * @generated
 */
public interface AccountProcedure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ranking of the procedure (for each type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getAccountProcedure_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AccountProcedure#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The procedure relevant to the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAccountProcedure_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AccountProcedure#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Date Of Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of the procedure when using a coded procedure. If using a reference to a procedure, then the date on the procedure should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Of Service</em>' containment reference.
	 * @see #setDateOfService(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getAccountProcedure_DateOfService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateOfService' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateOfService();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AccountProcedure#getDateOfService <em>Date Of Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Service</em>' containment reference.
	 * @see #getDateOfService()
	 * @generated
	 */
	void setDateOfService(DateTime value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How this procedure value should be used in charging the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAccountProcedure_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Package Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package code can be used to group procedures that may be priced or delivered as a single product. Such as DRGs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Code</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAccountProcedure_PackageCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packageCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPackageCode();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any devices that were associated with the procedure relevant to the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAccountProcedure_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDevice();

} // AccountProcedure
