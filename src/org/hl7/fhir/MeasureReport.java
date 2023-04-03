/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MeasureReport#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getDataUpdateType <em>Data Update Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getReportingVendor <em>Reporting Vendor</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getScoring <em>Scoring</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getImprovementNotation <em>Improvement Notation</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getSupplementalData <em>Supplemental Data</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getEvaluatedResource <em>Evaluated Resource</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasureReport()
 * @model extendedMetaData="name='MeasureReport' kind='elementOnly'"
 * @generated
 */
public interface MeasureReport extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify this MeasureReport when it is represented in other formats or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Identifier()
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
	 * The MeasureReport status. No data will be available until the MeasureReport status is complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MeasureReportStatus)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureReportStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MeasureReportStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of measure report. This may be an individual report, which provides the score for the measure for an individual member of the population; a subject-listing, which returns the list of members that meet the various criteria in the measure; a summary report, which returns a population count for each of the criteria in the measure; or a data-collection, which enables the MeasureReport to be used to exchange the data-of-interest for a quality measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(MeasureReportType)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureReportType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MeasureReportType value);

	/**
	 * Returns the value of the '<em><b>Data Update Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the data submitted in a data-exchange report represents a snapshot or incremental update. A snapshot update replaces all previously submitted data for the receiver, whereas an incremental update represents only updated and/or changed data and should be applied as a differential update to the existing submitted data for the receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Update Type</em>' containment reference.
	 * @see #setDataUpdateType(SubmitDataUpdateType)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_DataUpdateType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataUpdateType' namespace='##targetNamespace'"
	 * @generated
	 */
	SubmitDataUpdateType getDataUpdateType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getDataUpdateType <em>Data Update Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Update Type</em>' containment reference.
	 * @see #getDataUpdateType()
	 * @generated
	 */
	void setDataUpdateType(SubmitDataUpdateType value);

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the Measure that was calculated to produce this report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Measure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(Canonical value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional subject identifying the individual or individuals the report is for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getSubject <em>Subject</em>}' containment reference.
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
	 * The date this measure was calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or organization that is reporting the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporter</em>' containment reference.
	 * @see #setReporter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Reporter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reporter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReporter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getReporter <em>Reporter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' containment reference.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(Reference value);

	/**
	 * Returns the value of the '<em><b>Reporting Vendor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the vendor who queried the data, calculated results and/or generated the report. The ‘reporting vendor’ is intended to represent the submitting entity when it is not the same as the reporting entity. This extension is used when the Receiver is interested in getting vendor information in the report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporting Vendor</em>' containment reference.
	 * @see #setReportingVendor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_ReportingVendor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportingVendor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReportingVendor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getReportingVendor <em>Reporting Vendor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Vendor</em>' containment reference.
	 * @see #getReportingVendor()
	 * @generated
	 */
	void setReportingVendor(Reference value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the location for which the data is being reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reporting period for which the report was calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Period()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Parameters resource (typically represented using a contained resource) that represents any input parameters that were provided to the operation that generated the report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference.
	 * @see #setInputParameters(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_InputParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInputParameters();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getInputParameters <em>Input Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Parameters</em>' containment reference.
	 * @see #getInputParameters()
	 * @generated
	 */
	void setInputParameters(Reference value);

	/**
	 * Returns the value of the '<em><b>Scoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the calculation is performed for the measure, including proportion, ratio, continuous-variable, and cohort. The value set is extensible, allowing additional measure scoring types to be represented. It is expected to be the same as the scoring element on the referenced Measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scoring</em>' containment reference.
	 * @see #setScoring(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Scoring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scoring' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getScoring();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getScoring <em>Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoring</em>' containment reference.
	 * @see #getScoring()
	 * @generated
	 */
	void setScoring(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Improvement Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether improvement in the measure is noted by an increase or decrease in the measure score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Improvement Notation</em>' containment reference.
	 * @see #setImprovementNotation(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_ImprovementNotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='improvementNotation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getImprovementNotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getImprovementNotation <em>Improvement Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Improvement Notation</em>' containment reference.
	 * @see #getImprovementNotation()
	 * @generated
	 */
	void setImprovementNotation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The results of the calculation, one for each population group in the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Supplemental Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Resource that represents additional information collected for the report. If the value of the supplemental data is not a Resource (i.e. evaluating the supplementalData expression for this case in the measure results in a value that is not a FHIR Resource), it is reported as a reference to a contained Observation resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Data</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_SupplementalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupplementalData();

	/**
	 * Returns the value of the '<em><b>Evaluated Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluated resources are used to capture what data was involved in the calculation of a measure. This usage is only allowed for individual reports to ensure that the size of the MeasureReport resource is bounded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evaluated Resource</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_EvaluatedResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evaluatedResource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEvaluatedResource();

} // MeasureReport
