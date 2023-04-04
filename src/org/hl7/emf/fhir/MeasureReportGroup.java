/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreQuantity <em>Measure Score Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreDateTime <em>Measure Score Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreCodeableConcept <em>Measure Score Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScorePeriod <em>Measure Score Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreRange <em>Measure Score Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreDuration <em>Measure Score Duration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportGroup#getStratifier <em>Stratifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup()
 * @model extendedMetaData="name='MeasureReport.Group' kind='elementOnly'"
 * @generated
 */
public interface MeasureReportGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The group from the Measure that corresponds to this group in the MeasureReport resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportGroup#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The meaning of the population group as defined in the measure definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportGroup#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional subject identifying the individual or individuals the report is for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportGroup#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MeasureReportPopulation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The populations that make up the population group, one for each type of population appropriate for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportPopulation> getPopulation();

	/**
	 * Returns the value of the '<em><b>Measure Score Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Score Quantity</em>' containment reference.
	 * @see #setMeasureScoreQuantity(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_MeasureScoreQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMeasureScoreQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreQuantity <em>Measure Score Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score Quantity</em>' containment reference.
	 * @see #getMeasureScoreQuantity()
	 * @generated
	 */
	void setMeasureScoreQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Measure Score Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Score Date Time</em>' containment reference.
	 * @see #setMeasureScoreDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_MeasureScoreDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getMeasureScoreDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreDateTime <em>Measure Score Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score Date Time</em>' containment reference.
	 * @see #getMeasureScoreDateTime()
	 * @generated
	 */
	void setMeasureScoreDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Measure Score Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Score Codeable Concept</em>' containment reference.
	 * @see #setMeasureScoreCodeableConcept(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_MeasureScoreCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMeasureScoreCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreCodeableConcept <em>Measure Score Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score Codeable Concept</em>' containment reference.
	 * @see #getMeasureScoreCodeableConcept()
	 * @generated
	 */
	void setMeasureScoreCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Measure Score Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Score Period</em>' containment reference.
	 * @see #setMeasureScorePeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_MeasureScorePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScorePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getMeasureScorePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScorePeriod <em>Measure Score Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score Period</em>' containment reference.
	 * @see #getMeasureScorePeriod()
	 * @generated
	 */
	void setMeasureScorePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Measure Score Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Score Range</em>' containment reference.
	 * @see #setMeasureScoreRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_MeasureScoreRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getMeasureScoreRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreRange <em>Measure Score Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score Range</em>' containment reference.
	 * @see #getMeasureScoreRange()
	 * @generated
	 */
	void setMeasureScoreRange(Range value);

	/**
	 * Returns the value of the '<em><b>Measure Score Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Score Duration</em>' containment reference.
	 * @see #setMeasureScoreDuration(Duration)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_MeasureScoreDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getMeasureScoreDuration();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportGroup#getMeasureScoreDuration <em>Measure Score Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score Duration</em>' containment reference.
	 * @see #getMeasureScoreDuration()
	 * @generated
	 */
	void setMeasureScoreDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Stratifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MeasureReportStratifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stratifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportGroup_Stratifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stratifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportStratifier> getStratifier();

} // MeasureReportGroup
