/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Stratum</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getComponent <em>Component</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreQuantity <em>Measure Score Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreDateTime <em>Measure Score Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreCodeableConcept <em>Measure Score Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getMeasureScorePeriod <em>Measure Score Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreRange <em>Measure Score Range</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreDuration <em>Measure Score Duration</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum()
 * @model extendedMetaData="name='MeasureReport.Stratum' kind='elementOnly'"
 * @generated
 */
public interface MeasureReportStratum extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #setValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_ValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getValueCodeableConcept <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #getValueCodeableConcept()
	 * @generated
	 */
	void setValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean</em>' containment reference.
	 * @see #setValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference.
	 * @see #setValueRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_ValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getValueRange <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' containment reference.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(Range value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Reference</em>' containment reference.
	 * @see #setValueReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_ValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getValueReference <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' containment reference.
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stratifier component value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportPopulation1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The populations that make up the stratum, one for each type of population appropriate to the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportPopulation1> getPopulation();

	/**
	 * Returns the value of the '<em><b>Measure Score Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Score Quantity</em>' containment reference.
	 * @see #setMeasureScoreQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_MeasureScoreQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMeasureScoreQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreQuantity <em>Measure Score Quantity</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_MeasureScoreDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getMeasureScoreDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreDateTime <em>Measure Score Date Time</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_MeasureScoreCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMeasureScoreCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreCodeableConcept <em>Measure Score Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_MeasureScorePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScorePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getMeasureScorePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getMeasureScorePeriod <em>Measure Score Period</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_MeasureScoreRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getMeasureScoreRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreRange <em>Measure Score Range</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_MeasureScoreDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScoreDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getMeasureScoreDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getMeasureScoreDuration <em>Measure Score Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score Duration</em>' containment reference.
	 * @see #getMeasureScoreDuration()
	 * @generated
	 */
	void setMeasureScoreDuration(Duration value);

} // MeasureReportStratum
