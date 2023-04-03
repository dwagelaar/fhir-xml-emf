/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulated Authorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Regulatory approval, clearance or licencing related to a regulated product, treatment, facility or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market Authorization relating to a Medicinal Product.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getRegion <em>Region</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getRegulator <em>Regulator</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getAttachedDocument <em>Attached Document</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorization#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization()
 * @model extendedMetaData="name='RegulatedAuthorization' kind='elementOnly'"
 * @generated
 */
public interface RegulatedAuthorization extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier for the authorization, typically assigned by the authorizing body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product type, treatment, facility or activity that is being authorized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Overall type of this authorization, for example drug marketing approval, orphan drug designation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorization#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General textual supporting information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorization#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The territory (e.g., country, jurisdiction etc.) in which the authorization has been granted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Region()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='region' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRegion();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status that is authorised e.g. approved. Intermediate states and actions can be tracked with cases and applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorization#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date at which the current status was assigned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStatusDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorization#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period in which the regulatory approval, clearance or licencing is in effect. As an example, a Marketing Authorization includes the date of authorization and/or an expiration date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_ValidityPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validityPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorization#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition for which the use of the regulated product applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getIndication();

	/**
	 * Returns the value of the '<em><b>Intended Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended use of the product, e.g. prevention, treatment, diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Use</em>' containment reference.
	 * @see #setIntendedUse(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_IntendedUse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedUse' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIntendedUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorization#getIntendedUse <em>Intended Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Use</em>' containment reference.
	 * @see #getIntendedUse()
	 * @generated
	 */
	void setIntendedUse(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Basis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The legal or regulatory framework against which this authorization is granted, or other reasons for it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Basis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getBasis();

	/**
	 * Returns the value of the '<em><b>Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that has been granted this authorization, by some authoritative body (the 'regulator').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Holder</em>' containment reference.
	 * @see #setHolder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Holder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='holder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getHolder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorization#getHolder <em>Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' containment reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(Reference value);

	/**
	 * Returns the value of the '<em><b>Regulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regulatory authority or authorizing body granting the authorization. For example, European Medicines Agency (EMA), Food and Drug Administration (FDA), Health Canada (HC), etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulator</em>' containment reference.
	 * @see #setRegulator(Reference)
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Regulator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regulator' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRegulator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorization#getRegulator <em>Regulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulator</em>' containment reference.
	 * @see #getRegulator()
	 * @generated
	 */
	void setRegulator(Reference value);

	/**
	 * Returns the value of the '<em><b>Attached Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information or supporting documentation about the authorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attached Document</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_AttachedDocument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attachedDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAttachedDocument();

	/**
	 * Returns the value of the '<em><b>Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The case or regulatory procedure for granting or amending a regulated authorization. An authorization is granted in response to submissions/applications by those seeking authorization. A case is the administrative process that deals with the application(s) that relate to this and assesses them. Note: This area is subject to ongoing review and the workgroup is seeking implementer feedback on its use (see link at bottom of page).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case</em>' containment reference.
	 * @see #setCase(RegulatedAuthorizationCase)
	 * @see org.hl7.fhir.FhirPackage#getRegulatedAuthorization_Case()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='case' namespace='##targetNamespace'"
	 * @generated
	 */
	RegulatedAuthorizationCase getCase();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorization#getCase <em>Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' containment reference.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(RegulatedAuthorizationCase value);

} // RegulatedAuthorization
