/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Diagnosis</b></em>'.
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
 *   <li>{@link org.hl7.fhir.AccountDiagnosis#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.AccountDiagnosis#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.AccountDiagnosis#getDateOfDiagnosis <em>Date Of Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.AccountDiagnosis#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AccountDiagnosis#getOnAdmission <em>On Admission</em>}</li>
 *   <li>{@link org.hl7.fhir.AccountDiagnosis#getPackageCode <em>Package Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAccountDiagnosis()
 * @model extendedMetaData="name='Account.Diagnosis' kind='elementOnly'"
 * @generated
 */
public interface AccountDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ranking of the diagnosis (for each type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getAccountDiagnosis_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountDiagnosis#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The diagnosis relevant to the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getAccountDiagnosis_Condition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountDiagnosis#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Date Of Diagnosis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ranking of the diagnosis (for each type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Of Diagnosis</em>' containment reference.
	 * @see #setDateOfDiagnosis(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAccountDiagnosis_DateOfDiagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateOfDiagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateOfDiagnosis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountDiagnosis#getDateOfDiagnosis <em>Date Of Diagnosis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Diagnosis</em>' containment reference.
	 * @see #getDateOfDiagnosis()
	 * @generated
	 */
	void setDateOfDiagnosis(DateTime value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type that this diagnosis has relevant to the account (e.g. admission, billing, discharge …).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccountDiagnosis_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>On Admission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Was the Diagnosis present on Admission in the related Encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Admission</em>' containment reference.
	 * @see #setOnAdmission(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAccountDiagnosis_OnAdmission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onAdmission' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getOnAdmission();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountDiagnosis#getOnAdmission <em>On Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Admission</em>' containment reference.
	 * @see #getOnAdmission()
	 * @generated
	 */
	void setOnAdmission(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Package Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package code can be used to group diagnoses that may be priced or delivered as a single product. Such as DRGs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccountDiagnosis_PackageCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packageCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPackageCode();

} // AccountDiagnosis
