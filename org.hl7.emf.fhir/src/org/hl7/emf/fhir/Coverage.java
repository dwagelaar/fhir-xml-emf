/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getPaymentBy <em>Payment By</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getPolicyHolder <em>Policy Holder</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getBeneficiary <em>Beneficiary</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getCostToBeneficiary <em>Cost To Beneficiary</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getSubrogation <em>Subrogation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Coverage#getInsurancePlan <em>Insurance Plan</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getCoverage()
 * @model extendedMetaData="name='Coverage' kind='elementOnly'"
 * @generated
 */
public interface Coverage extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the coverage as issued by the insurer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Identifier()
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
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(FinancialResourceStatusCodes)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	FinancialResourceStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FinancialResourceStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nature of the coverage be it insurance, or cash payment such as self-pay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(Kind)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Kind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

	/**
	 * Returns the value of the '<em><b>Payment By</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CoveragePaymentBy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to the paying party and optionally what specifically they will be responsible to pay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment By</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_PaymentBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentBy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoveragePaymentBy> getPaymentBy();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Policy Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who 'owns' the insurance policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Holder</em>' containment reference.
	 * @see #setPolicyHolder(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_PolicyHolder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policyHolder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPolicyHolder();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getPolicyHolder <em>Policy Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Holder</em>' containment reference.
	 * @see #getPolicyHolder()
	 * @generated
	 */
	void setPolicyHolder(Reference value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscriber</em>' containment reference.
	 * @see #setSubscriber(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Subscriber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscriber' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubscriber();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getSubscriber <em>Subscriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' containment reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(Reference value);

	/**
	 * Returns the value of the '<em><b>Subscriber Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The insurer assigned ID for the Subscriber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscriber Id</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_SubscriberId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscriberId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getSubscriberId();

	/**
	 * Returns the value of the '<em><b>Beneficiary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who benefits from the insurance coverage; the patient when products and/or services are provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beneficiary</em>' containment reference.
	 * @see #setBeneficiary(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Beneficiary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='beneficiary' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getBeneficiary();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getBeneficiary <em>Beneficiary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beneficiary</em>' containment reference.
	 * @see #getBeneficiary()
	 * @generated
	 */
	void setBeneficiary(Reference value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A designator for a dependent under the coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent</em>' containment reference.
	 * @see #setDependent(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Dependent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getDependent();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getDependent <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' containment reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of beneficiary (patient) to the subscriber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Insurer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The program or plan underwriter, payor, insurance company.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurer</em>' containment reference.
	 * @see #setInsurer(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Insurer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInsurer();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getInsurer <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer</em>' containment reference.
	 * @see #getInsurer()
	 * @generated
	 */
	void setInsurer(Reference value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CoverageClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A suite of underwriter specific classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoverageClass> getClass_();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The order of applicability of this coverage relative to other coverages which are currently in force. Note, there may be gaps in the numbering and this does not imply primary, secondary etc. as the specific positioning of coverages depends upon the episode of care. For example; a patient might have (0) auto insurance (1) their own health insurance and (2) spouse's health insurance. When claiming for treatments which were not the result of an auto accident then only coverages (1) and (2) above would be applicatble and would apply in the order specified in parenthesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Order()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getOrder();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getNetwork();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Cost To Beneficiary</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CoverageCostToBeneficiary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost To Beneficiary</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_CostToBeneficiary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='costToBeneficiary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoverageCostToBeneficiary> getCostToBeneficiary();

	/**
	 * Returns the value of the '<em><b>Subrogation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When 'subrogation=true' this insurance instance has been included not for adjudication but to provide insurers with the details to recover costs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subrogation</em>' containment reference.
	 * @see #setSubrogation(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Subrogation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subrogation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getSubrogation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getSubrogation <em>Subrogation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subrogation</em>' containment reference.
	 * @see #getSubrogation()
	 * @generated
	 */
	void setSubrogation(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The policy(s) which constitute this insurance coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_Contract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contract' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getContract();

	/**
	 * Returns the value of the '<em><b>Insurance Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The insurance plan details, benefits and costs, which constitute this insurance coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Plan</em>' containment reference.
	 * @see #setInsurancePlan(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getCoverage_InsurancePlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurancePlan' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInsurancePlan();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Coverage#getInsurancePlan <em>Insurance Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Plan</em>' containment reference.
	 * @see #getInsurancePlan()
	 * @generated
	 */
	void setInsurancePlan(Reference value);

} // Coverage
