/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Consent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getGrantor <em>Grantor</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getGrantee <em>Grantee</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getManager <em>Manager</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getController <em>Controller</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceAttachment <em>Source Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getRegulatoryBasis <em>Regulatory Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPolicyBasis <em>Policy Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPolicyText <em>Policy Text</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getVerification <em>Verification</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getProvision <em>Provision</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsent()
 * @model extendedMetaData="name='Consent' kind='elementOnly'"
 * @generated
 */
public interface Consent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this copy of the Consent Statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current state of this Consent resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ConsentState)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentState getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConsentState value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient/healthcare practitioner or group of persons to whom this consent applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date the consent instance was agreed to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Effective period for this Consent Resource and all provisions unless specified in that provision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Grantor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity responsible for granting the rights listed in a Consent Directive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grantor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Grantor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grantor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getGrantor();

	/**
	 * Returns the value of the '<em><b>Grantee</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grantee</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Grantee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grantee' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getGrantee();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actor that manages the consent through its lifecycle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manager</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Manager()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manager' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManager();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actor that controls/enforces the access according to the consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Controller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controller' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getController();

	/**
	 * Returns the value of the '<em><b>Source Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source on which this consent statement is based. The source might be a scanned original paper form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Attachment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getSourceAttachment();

	/**
	 * Returns the value of the '<em><b>Source Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSourceReference();

	/**
	 * Returns the value of the '<em><b>Regulatory Basis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of codes that indicate the regulatory basis (if any) that this consent supports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulatory Basis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_RegulatoryBasis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regulatoryBasis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRegulatoryBasis();

	/**
	 * Returns the value of the '<em><b>Policy Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Reference or URL used to uniquely identify the policy the organization will enforce for this Consent. This Reference or URL should be specific to the version of the policy and should be dereferencable to a computable policy of some form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Basis</em>' containment reference.
	 * @see #setPolicyBasis(ConsentPolicyBasis)
	 * @see org.hl7.fhir.FhirPackage#getConsent_PolicyBasis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policyBasis' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentPolicyBasis getPolicyBasis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPolicyBasis <em>Policy Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Basis</em>' containment reference.
	 * @see #getPolicyBasis()
	 * @generated
	 */
	void setPolicyBasis(ConsentPolicyBasis value);

	/**
	 * Returns the value of the '<em><b>Policy Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Reference to the human readable policy explaining the basis for the Consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Text</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_PolicyText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policyText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPolicyText();

	/**
	 * Returns the value of the '<em><b>Verification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentVerification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether a treatment instruction (e.g. artificial respiration: yes or no) was verified with the patient, his/her family or another authorized person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Verification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentVerification> getVerification();

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take - permit or deny - as default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference.
	 * @see #setDecision(ConsentProvisionType)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Decision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decision' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentProvisionType getDecision();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getDecision <em>Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' containment reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(ConsentProvisionType value);

	/**
	 * Returns the value of the '<em><b>Provision</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentProvision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provision</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Provision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentProvision> getProvision();

} // Consent
