/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the details including amount of a payment and allocates the payment items being paid.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getTargetItemString <em>Target Item String</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getTargetItemIdentifier <em>Target Item Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getTargetItemPositiveInt <em>Target Item Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationAllocation#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation()
 * @model extendedMetaData="name='PaymentReconciliation.Allocation' kind='elementOnly'"
 * @generated
 */
public interface PaymentReconciliationAllocation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for the current payment item for the referenced payable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for the prior payment item for the referenced payable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessor</em>' containment reference.
	 * @see #setPredecessor(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Predecessor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='predecessor' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPredecessor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getPredecessor <em>Predecessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' containment reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Identifier value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific resource to which the payment/adjustment/advance applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

	/**
	 * Returns the value of the '<em><b>Target Item String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Item String</em>' containment reference.
	 * @see #setTargetItemString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_TargetItemString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetItemString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTargetItemString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getTargetItemString <em>Target Item String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Item String</em>' containment reference.
	 * @see #getTargetItemString()
	 * @generated
	 */
	void setTargetItemString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Target Item Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Item Identifier</em>' containment reference.
	 * @see #setTargetItemIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_TargetItemIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetItemIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getTargetItemIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getTargetItemIdentifier <em>Target Item Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Item Identifier</em>' containment reference.
	 * @see #getTargetItemIdentifier()
	 * @generated
	 */
	void setTargetItemIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Target Item Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Item Positive Int</em>' containment reference.
	 * @see #setTargetItemPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_TargetItemPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetItemPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getTargetItemPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getTargetItemPositiveInt <em>Target Item Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Item Positive Int</em>' containment reference.
	 * @see #getTargetItemPositiveInt()
	 * @generated
	 */
	void setTargetItemPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter to which this payment applies, may be completed by the receiver, used for search.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Account to which this payment applies, may be completed by the receiver, used for search.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account</em>' containment reference.
	 * @see #setAccount(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Account()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='account' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAccount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getAccount <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' containment reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code to indicate the nature of the payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Submitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party which submitted the claim or financial transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submitter</em>' containment reference.
	 * @see #setSubmitter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Submitter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submitter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubmitter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getSubmitter <em>Submitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter</em>' containment reference.
	 * @see #getSubmitter()
	 * @generated
	 */
	void setSubmitter(Reference value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource, such as a ClaimResponse, which contains a commitment to payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date from the response resource containing a commitment to pay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the individual who is responsible for inquiries regarding the response and its payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Responsible()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponsible();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Reference value);

	/**
	 * Returns the value of the '<em><b>Payee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party which is receiving the payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee</em>' containment reference.
	 * @see #setPayee(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Payee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payee' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPayee();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(Reference value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The monetary amount allocated from the total payment to the payable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationAllocation_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationAllocation#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

} // PaymentReconciliationAllocation
