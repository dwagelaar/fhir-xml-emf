/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getCareTeamSequence <em>Care Team Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getDiagnosisSequence <em>Diagnosis Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProcedureSequence <em>Procedure Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getInformationSequence <em>Information Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProductOrServiceEnd <em>Product Or Service End</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationCodeableConcept <em>Location Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationAddress <em>Location Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getPatientPaid <em>Patient Paid</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getTax <em>Tax</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getReviewOutcome <em>Review Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem()
 * @model extendedMetaData="name='ExplanationOfBenefit.Item' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely identify item entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Care Team Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Care team members related to this service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team Sequence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_CareTeamSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careTeamSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getCareTeamSequence();

	/**
	 * Returns the value of the '<em><b>Diagnosis Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnoses applicable for this service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis Sequence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_DiagnosisSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getDiagnosisSequence();

	/**
	 * Returns the value of the '<em><b>Procedure Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedures applicable for this service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Sequence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProcedureSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getProcedureSequence();

	/**
	 * Returns the value of the '<em><b>Information Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exceptions, special conditions and supporting information applicable for this service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Sequence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_InformationSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getInformationSequence();

	/**
	 * Returns the value of the '<em><b>Trace Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading partners.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_TraceNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='traceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getTraceNumber();

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of revenue or cost center providing the product and/or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revenue</em>' containment reference.
	 * @see #setRevenue(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Revenue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revenue' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRevenue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getRevenue <em>Revenue</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getCategory <em>Category</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProductOrService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productOrService' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductOrService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getProductOrService <em>Product Or Service</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProductOrServiceEnd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productOrServiceEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductOrServiceEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getProductOrServiceEnd <em>Product Or Service End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Or Service End</em>' containment reference.
	 * @see #getProductOrServiceEnd()
	 * @generated
	 */
	void setProductOrServiceEnd(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request or Referral for Goods or Service to be rendered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRequest();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item typification or modifiers codes to convey additional context for the product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getModifier();

	/**
	 * Returns the value of the '<em><b>Program Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the program under which this may be recovered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProgramCode()
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ServicedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getServicedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedDate <em>Serviced Date</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ServicedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getServicedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedPeriod <em>Serviced Period</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_LocationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLocationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationCodeableConcept <em>Location Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_LocationAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getLocationAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationAddress <em>Location Address</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_LocationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationReference <em>Location Reference</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_PatientPaid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientPaid' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPatientPaid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getPatientPaid <em>Patient Paid</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getQuantity <em>Quantity</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_UnitPrice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getUnitPrice <em>Unit Price</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Factor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getFactor <em>Factor</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Tax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tax' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getTax <em>Tax</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Net()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique Device Identifiers associated with this line item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Udi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udi' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUdi();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitBodySite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical location where the service is performed or applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitBodySite> getBodySite();

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Healthcare encounters related to this claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEncounter();

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The numbers associated with notes below which apply to the adjudication of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_NoteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumber();

	/**
	 * Returns the value of the '<em><b>Review Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The high-level results of the adjudication if adjudication has been performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Outcome</em>' containment reference.
	 * @see #setReviewOutcome(ExplanationOfBenefitReviewOutcome)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ReviewOutcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reviewOutcome' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitReviewOutcome getReviewOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getReviewOutcome <em>Review Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Outcome</em>' containment reference.
	 * @see #getReviewOutcome()
	 * @generated
	 */
	void setReviewOutcome(ExplanationOfBenefitReviewOutcome value);

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this item is a group then the values here are a summary of the adjudication of the detail items. If this item is a simple product or service then this is the result of the adjudication of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitAdjudication> getAdjudication();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Second-tier of goods and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitDetail> getDetail();

} // ExplanationOfBenefitItem
