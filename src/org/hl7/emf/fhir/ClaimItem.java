/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Item</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getCareTeamSequence <em>Care Team Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getDiagnosisSequence <em>Diagnosis Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getProcedureSequence <em>Procedure Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getInformationSequence <em>Information Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getProductOrServiceEnd <em>Product Or Service End</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getLocationCodeableConcept <em>Location Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getLocationAddress <em>Location Address</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getPatientPaid <em>Patient Paid</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getTax <em>Tax</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimItem#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem()
 * @model extendedMetaData="name='Claim.Item' kind='elementOnly'"
 * @generated
 */
public interface ClaimItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely identify item entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Trace Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading partners.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Number</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_TraceNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='traceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getTraceNumber();

	/**
	 * Returns the value of the '<em><b>Care Team Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CareTeam members related to this service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team Sequence</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_CareTeamSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careTeamSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getCareTeamSequence();

	/**
	 * Returns the value of the '<em><b>Diagnosis Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnosis applicable for this service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis Sequence</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_DiagnosisSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getDiagnosisSequence();

	/**
	 * Returns the value of the '<em><b>Procedure Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedures applicable for this service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Sequence</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_ProcedureSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getProcedureSequence();

	/**
	 * Returns the value of the '<em><b>Information Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exceptions, special conditions and supporting information applicable for this service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Sequence</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_InformationSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getInformationSequence();

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of revenue or cost center providing the product and/or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revenue</em>' containment reference.
	 * @see #setRevenue(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Revenue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revenue' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRevenue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getRevenue <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' containment reference.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code to identify the general type of benefits under which products and services are provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Or Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the value is a group code then this item collects a set of related item details, otherwise this contains the product, service, drug or other billing code for the item. This element may be the start of a range of .productOrService codes used in conjunction with .productOrServiceEnd or it may be a solo element where .productOrServiceEnd is not used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Or Service</em>' containment reference.
	 * @see #setProductOrService(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_ProductOrService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productOrService' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductOrService();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getProductOrService <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Or Service</em>' containment reference.
	 * @see #getProductOrService()
	 * @generated
	 */
	void setProductOrService(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Or Service End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This contains the end of a range of product, service, drug or other billing codes for the item. This element is not used when the .productOrService is a group code. This value may only be present when a .productOfService code has been provided to convey the start of the range. Typically this value may be used only with preauthorizations and not with claims.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Or Service End</em>' containment reference.
	 * @see #setProductOrServiceEnd(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_ProductOrServiceEnd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productOrServiceEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductOrServiceEnd();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getProductOrServiceEnd <em>Product Or Service End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Or Service End</em>' containment reference.
	 * @see #getProductOrServiceEnd()
	 * @generated
	 */
	void setProductOrServiceEnd(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request or Referral for Goods or Service to be rendered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRequest();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item typification or modifiers codes to convey additional context for the product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getModifier();

	/**
	 * Returns the value of the '<em><b>Program Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the program under which this may be recovered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Code</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_ProgramCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='programCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getProgramCode();

	/**
	 * Returns the value of the '<em><b>Serviced Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviced Date</em>' containment reference.
	 * @see #setServicedDate(Date)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_ServicedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getServicedDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getServicedDate <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Date</em>' containment reference.
	 * @see #getServicedDate()
	 * @generated
	 */
	void setServicedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Serviced Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviced Period</em>' containment reference.
	 * @see #setServicedPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_ServicedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getServicedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getServicedPeriod <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Period</em>' containment reference.
	 * @see #getServicedPeriod()
	 * @generated
	 */
	void setServicedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Location Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Codeable Concept</em>' containment reference.
	 * @see #setLocationCodeableConcept(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_LocationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLocationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getLocationCodeableConcept <em>Location Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Codeable Concept</em>' containment reference.
	 * @see #getLocationCodeableConcept()
	 * @generated
	 */
	void setLocationCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Address</em>' containment reference.
	 * @see #setLocationAddress(Address)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_LocationAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getLocationAddress();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getLocationAddress <em>Location Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Address</em>' containment reference.
	 * @see #getLocationAddress()
	 * @generated
	 */
	void setLocationAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Location Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Reference</em>' containment reference.
	 * @see #setLocationReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_LocationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocationReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getLocationReference <em>Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Reference</em>' containment reference.
	 * @see #getLocationReference()
	 * @generated
	 */
	void setLocationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Patient Paid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount paid by the patient, in total at the claim claim level or specifically for the item and detail level, to the provider for goods and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Paid</em>' containment reference.
	 * @see #setPatientPaid(Money)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_PatientPaid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientPaid' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPatientPaid();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getPatientPaid <em>Patient Paid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Paid</em>' containment reference.
	 * @see #getPatientPaid()
	 * @generated
	 */
	void setPatientPaid(Money value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of repetitions of a service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the item is not a group then this is the fee for the product or service, otherwise this is the total of the fees for the details of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Money)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_UnitPrice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getUnitPrice <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' containment reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Money value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Factor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total of taxes applicable for this product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax</em>' containment reference.
	 * @see #setTax(Money)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Tax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tax' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTax();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getTax <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax</em>' containment reference.
	 * @see #getTax()
	 * @generated
	 */
	void setTax(Money value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount claimed for the group (if a grouper) or the line item. Net = unit price * quantity * factor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Money)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Net()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimItem#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique Device Identifiers associated with this line item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Udi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udi' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUdi();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ClaimBodySite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical location where the service is performed or applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimBodySite> getBodySite();

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Healthcare encounters related to this claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEncounter();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ClaimDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which are simple items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimItem_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimDetail> getDetail();

} // ClaimItem
