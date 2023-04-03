/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the details including amount of a payment and allocates the payment items being paid.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getIssuerType <em>Issuer Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getPaymentIssuer <em>Payment Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getCardBrand <em>Card Brand</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getTenderedAmount <em>Tendered Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getReturnedAmount <em>Returned Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getPaymentIdentifier <em>Payment Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getProcessNote <em>Process Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation()
 * @model extendedMetaData="name='PaymentReconciliation' kind='elementOnly'"
 * @generated
 */
public interface PaymentReconciliation extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to this payment reconciliation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code to indicate the nature of the payment such as payment, adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(FinancialResourceStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	FinancialResourceStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getStatus <em>Status</em>}' containment reference.
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
	 * The workflow or activity which gave rise to or during which the payment ocurred such as a kiosk, deposit on account, periodic payment etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Kind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getKind();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period of time for which payments have been gathered into this bulk payment for settlement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Created()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment enterer if not the actual payment issuer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterer</em>' containment reference.
	 * @see #setEnterer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Enterer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enterer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEnterer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getEnterer <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer</em>' containment reference.
	 * @see #getEnterer()
	 * @generated
	 */
	void setEnterer(Reference value);

	/**
	 * Returns the value of the '<em><b>Issuer Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the source such as patient or insurance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Type</em>' containment reference.
	 * @see #setIssuerType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_IssuerType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issuerType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIssuerType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getIssuerType <em>Issuer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Type</em>' containment reference.
	 * @see #getIssuerType()
	 * @generated
	 */
	void setIssuerType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Payment Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who generated the payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Issuer</em>' containment reference.
	 * @see #setPaymentIssuer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_PaymentIssuer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentIssuer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPaymentIssuer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getPaymentIssuer <em>Payment Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Issuer</em>' containment reference.
	 * @see #getPaymentIssuer()
	 * @generated
	 */
	void setPaymentIssuer(Reference value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original request resource reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Requestor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requestor</em>' containment reference.
	 * @see #setRequestor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Requestor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getRequestor <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestor</em>' containment reference.
	 * @see #getRequestor()
	 * @generated
	 */
	void setRequestor(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outcome of a request for a reconciliation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(PaymentOutcome)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentOutcome getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(PaymentOutcome value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable description of the status of the request for the reconciliation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of payment as indicated on the financial instrument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location of the site or device for electronic transfers or physical location for cash payments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The means of payment such as check, card cash, or electronic funds transfer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Card Brand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The card brand such as debit, Visa, Amex etc. used if a card is the method of payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Brand</em>' containment reference.
	 * @see #setCardBrand(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_CardBrand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cardBrand' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCardBrand();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getCardBrand <em>Card Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Brand</em>' containment reference.
	 * @see #getCardBrand()
	 * @generated
	 */
	void setCardBrand(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Account Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A portion of the account number, often the last 4 digits, used for verification not charging purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account Number</em>' containment reference.
	 * @see #setAccountNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_AccountNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accountNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAccountNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getAccountNumber <em>Account Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' containment reference.
	 * @see #getAccountNumber()
	 * @generated
	 */
	void setAccountNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The year and month (YYYY-MM) when the instrument, typically card, expires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_ExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the card processor, etf processor, bank for checks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference.
	 * @see #setProcessor(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Processor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processor' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProcessor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getProcessor <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' containment reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The check number, eft reference, car processor reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Number</em>' containment reference.
	 * @see #setReferenceNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_ReferenceNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReferenceNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getReferenceNumber <em>Reference Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' containment reference.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An alphanumeric issued by the processor to confirm the successful issuance of payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization</em>' containment reference.
	 * @see #setAuthorization(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Authorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorization' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAuthorization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getAuthorization <em>Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' containment reference.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Tendered Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount offered by the issuer, typically applies to cash when the issuer provides an amount in bank note denominations equal to or excess of the amount actually being paid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tendered Amount</em>' containment reference.
	 * @see #setTenderedAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_TenderedAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tenderedAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTenderedAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getTenderedAmount <em>Tendered Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tendered Amount</em>' containment reference.
	 * @see #getTenderedAmount()
	 * @generated
	 */
	void setTenderedAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Returned Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount returned by the receiver which is excess to the amount payable, often referred to as 'change'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Returned Amount</em>' containment reference.
	 * @see #setReturnedAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_ReturnedAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='returnedAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getReturnedAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getReturnedAmount <em>Returned Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned Amount</em>' containment reference.
	 * @see #getReturnedAmount()
	 * @generated
	 */
	void setReturnedAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total payment amount as indicated on the financial instrument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Amount()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issuer's unique identifier for the payment instrument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Identifier</em>' containment reference.
	 * @see #setPaymentIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_PaymentIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPaymentIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getPaymentIdentifier <em>Payment Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Identifier</em>' containment reference.
	 * @see #getPaymentIdentifier()
	 * @generated
	 */
	void setPaymentIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PaymentReconciliationAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distribution of the payment amount for a previously acknowledged payable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Allocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PaymentReconciliationAllocation> getAllocation();

	/**
	 * Returns the value of the '<em><b>Form Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code for the form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Code</em>' containment reference.
	 * @see #setFormCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_FormCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFormCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getFormCode <em>Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Code</em>' containment reference.
	 * @see #getFormCode()
	 * @generated
	 */
	void setFormCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Process Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PaymentReconciliationProcessNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A note that describes or explains the processing in a human readable form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_ProcessNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processNote' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PaymentReconciliationProcessNote> getProcessNote();

} // PaymentReconciliation
