/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Care Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ClaimCareTeam#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimCareTeam#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimCareTeam#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimCareTeam#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimCareTeam#getSpecialty <em>Specialty</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getClaimCareTeam()
 * @model extendedMetaData="name='Claim.CareTeam' kind='elementOnly'"
 * @generated
 */
public interface ClaimCareTeam extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely identify care team entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimCareTeam_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimCareTeam#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Member of the team who provided the product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimCareTeam_Provider()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimCareTeam#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who is billing and/or responsible for the claimed products or services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimCareTeam_Responsible()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getResponsible();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimCareTeam#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lead, assisting or supervising practitioner and their discipline if a multidisciplinary team.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimCareTeam_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimCareTeam#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specialization of the practitioner or provider which is applicable for this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference.
	 * @see #setSpecialty(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimCareTeam_Specialty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialty' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSpecialty();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimCareTeam#getSpecialty <em>Specialty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialty</em>' containment reference.
	 * @see #getSpecialty()
	 * @generated
	 */
	void setSpecialty(CodeableConcept value);

} // ClaimCareTeam
