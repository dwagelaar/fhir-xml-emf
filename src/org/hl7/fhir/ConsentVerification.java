/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConsentVerification#getVerified <em>Verified</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentVerification#getVerificationType <em>Verification Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentVerification#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentVerification#getVerifiedWith <em>Verified With</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentVerification#getVerificationDate <em>Verification Date</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsentVerification()
 * @model extendedMetaData="name='Consent.Verification' kind='elementOnly'"
 * @generated
 */
public interface ConsentVerification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Verified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Has the instruction been verified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified</em>' containment reference.
	 * @see #setVerified(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConsentVerification_Verified()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='verified' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getVerified();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentVerification#getVerified <em>Verified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified</em>' containment reference.
	 * @see #getVerified()
	 * @generated
	 */
	void setVerified(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Verification Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extensible list of verification type starting with verification and re-validation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Type</em>' containment reference.
	 * @see #setVerificationType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConsentVerification_VerificationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verificationType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVerificationType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentVerification#getVerificationType <em>Verification Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Type</em>' containment reference.
	 * @see #getVerificationType()
	 * @generated
	 */
	void setVerificationType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Verified By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who conducted the verification/validation of the Grantor decision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified By</em>' containment reference.
	 * @see #setVerifiedBy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsentVerification_VerifiedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verifiedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getVerifiedBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentVerification#getVerifiedBy <em>Verified By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified By</em>' containment reference.
	 * @see #getVerifiedBy()
	 * @generated
	 */
	void setVerifiedBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Verified With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who verified the instruction (Patient, Relative or other Authorized Person).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified With</em>' containment reference.
	 * @see #setVerifiedWith(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsentVerification_VerifiedWith()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verifiedWith' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getVerifiedWith();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentVerification#getVerifiedWith <em>Verified With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified With</em>' containment reference.
	 * @see #getVerifiedWith()
	 * @generated
	 */
	void setVerifiedWith(Reference value);

	/**
	 * Returns the value of the '<em><b>Verification Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DateTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date(s) verification was collected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Date</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentVerification_VerificationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verificationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateTime> getVerificationDate();

} // ConsentVerification
