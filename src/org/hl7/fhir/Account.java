/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Account#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getBillingStatus <em>Billing Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getServicePeriod <em>Service Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getGuarantor <em>Guarantor</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getRelatedAccount <em>Related Account</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getCalculatedAt <em>Calculated At</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAccount()
 * @model extendedMetaData="name='Account' kind='elementOnly'"
 * @generated
 */
public interface Account extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier used to reference the account.  Might or might not be intended for human use (e.g. credit card number).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccount_Identifier()
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
	 * Indicates whether the account is presently used/usable or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(AccountStatus)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	AccountStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AccountStatus value);

	/**
	 * Returns the value of the '<em><b>Billing Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BillingStatus tracks the lifecycle of the account through the billing process. It indicates how transactions are treated when they are allocated to the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Billing Status</em>' containment reference.
	 * @see #setBillingStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAccount_BillingStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='billingStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBillingStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getBillingStatus <em>Billing Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Status</em>' containment reference.
	 * @see #getBillingStatus()
	 * @generated
	 */
	void setBillingStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorizes the account for reporting and searching purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name used for the account when displaying it to humans in reports, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the entity which incurs the expenses. While the immediate recipients of services or goods might be entities related to the subject, the expenses were ultimately incurred by the subject of the Account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccount_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Service Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date range of services associated with this account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Period</em>' containment reference.
	 * @see #setServicePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getAccount_ServicePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getServicePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getServicePeriod <em>Service Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Period</em>' containment reference.
	 * @see #getServicePeriod()
	 * @generated
	 */
	void setServicePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AccountCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccount_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccountCoverage> getCoverage();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the service area, hospital, department, etc. with responsibility for managing the Account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information about what the account tracks and how it is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Guarantor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AccountGuarantor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parties responsible for balancing the account if other payment options fall short.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guarantor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccount_Guarantor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guarantor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccountGuarantor> getGuarantor();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AccountDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When using an account for billing a specific Encounter the set of diagnoses that are relevant for billing are stored here on the account where they are able to be sequenced appropriately prior to processing to produce claim(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccount_Diagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccountDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AccountProcedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When using an account for billing a specific Encounter the set of procedures that are relevant for billing are stored here on the account where they are able to be sequenced appropriately prior to processing to produce claim(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccount_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccountProcedure> getProcedure();

	/**
	 * Returns the value of the '<em><b>Related Account</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AccountRelatedAccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other associated accounts related to this account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Account</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccount_RelatedAccount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedAccount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccountRelatedAccount> getRelatedAccount();

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default currency for the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference.
	 * @see #setCurrency(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Currency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currency' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCurrency();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' containment reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AccountBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The calculated account balances - these are calculated and processed by the finance system.
	 * 
	 * The balances with a `term` that is not current are usually generated/updated by an invoicing or similar process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Balance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccount_Balance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='balance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccountBalance> getBalance();

	/**
	 * Returns the value of the '<em><b>Calculated At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time the balance amount was calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculated At</em>' containment reference.
	 * @see #setCalculatedAt(Instant)
	 * @see org.hl7.fhir.FhirPackage#getAccount_CalculatedAt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calculatedAt' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getCalculatedAt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getCalculatedAt <em>Calculated At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated At</em>' containment reference.
	 * @see #getCalculatedAt()
	 * @generated
	 */
	void setCalculatedAt(Instant value);

} // Account
