/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A report of inventory or stock items.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getCountType <em>Count Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getOperationTypeReason <em>Operation Type Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getReportedDateTime <em>Reported Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getReportingPeriod <em>Reporting Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getInventoryListing <em>Inventory Listing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryReport#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport()
 * @model extendedMetaData="name='InventoryReport' kind='elementOnly'"
 * @generated
 */
public interface InventoryReport extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier for the InventoryReport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_Identifier()
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
	 * The status of the inventory check or notification - whether this is draft (e.g. the report is still pending some updates) or active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(InventoryReportStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	InventoryReportStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryReport#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(InventoryReportStatus value);

	/**
	 * Returns the value of the '<em><b>Count Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the report is about the current inventory count (snapshot) or a differential change in inventory (change).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count Type</em>' containment reference.
	 * @see #setCountType(InventoryCountType)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_CountType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='countType' namespace='##targetNamespace'"
	 * @generated
	 */
	InventoryCountType getCountType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryReport#getCountType <em>Count Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Type</em>' containment reference.
	 * @see #getCountType()
	 * @generated
	 */
	void setCountType(InventoryCountType value);

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What type of operation is being performed - addition or subtraction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Type</em>' containment reference.
	 * @see #setOperationType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_OperationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOperationType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryReport#getOperationType <em>Operation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' containment reference.
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Operation Type Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason for this count - regular count, ad-hoc count, new arrivals, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Type Reason</em>' containment reference.
	 * @see #setOperationTypeReason(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_OperationTypeReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationTypeReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOperationTypeReason();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryReport#getOperationTypeReason <em>Operation Type Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type Reason</em>' containment reference.
	 * @see #getOperationTypeReason()
	 * @generated
	 */
	void setOperationTypeReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reported Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the report has been submitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reported Date Time</em>' containment reference.
	 * @see #setReportedDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_ReportedDateTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reportedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getReportedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryReport#getReportedDateTime <em>Reported Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported Date Time</em>' containment reference.
	 * @see #getReportedDateTime()
	 * @generated
	 */
	void setReportedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who submits the report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporter</em>' containment reference.
	 * @see #setReporter(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_Reporter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reporter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReporter();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryReport#getReporter <em>Reporter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' containment reference.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(Reference value);

	/**
	 * Returns the value of the '<em><b>Reporting Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period the report refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporting Period</em>' containment reference.
	 * @see #setReportingPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_ReportingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getReportingPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryReport#getReportingPeriod <em>Reporting Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Period</em>' containment reference.
	 * @see #getReportingPeriod()
	 * @generated
	 */
	void setReportingPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Inventory Listing</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.InventoryReportInventoryListing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An inventory listing section (grouped by any of the attributes).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventory Listing</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_InventoryListing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inventoryListing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InventoryReportInventoryListing> getInventoryListing();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A note associated with the InventoryReport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryReport_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // InventoryReport
