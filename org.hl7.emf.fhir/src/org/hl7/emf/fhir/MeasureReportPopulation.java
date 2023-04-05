/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Population</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.MeasureReportPopulation#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportPopulation#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportPopulation#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportPopulation#getSubjectResults <em>Subject Results</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportPopulation#getSubjectReport <em>Subject Report</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MeasureReportPopulation#getSubjects <em>Subjects</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportPopulation()
 * @model extendedMetaData="name='MeasureReport.Population' kind='elementOnly'"
 * @generated
 */
public interface MeasureReportPopulation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The population from the Measure that corresponds to this population in the MeasureReport resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportPopulation_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportPopulation#getLinkId <em>Link Id</em>}' containment reference.
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
	 * The type of the population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportPopulation_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportPopulation#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of members of the population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(org.hl7.emf.fhir.Integer)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportPopulation_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Integer getCount();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportPopulation#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(org.hl7.emf.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Subject Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element refers to a List of individual level MeasureReport resources, one for each subject in this population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Results</em>' containment reference.
	 * @see #setSubjectResults(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportPopulation_SubjectResults()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectResults' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubjectResults();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportPopulation#getSubjectResults <em>Subject Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Results</em>' containment reference.
	 * @see #getSubjectResults()
	 * @generated
	 */
	void setSubjectResults(Reference value);

	/**
	 * Returns the value of the '<em><b>Subject Report</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an individual level MeasureReport resource for a member of the population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Report</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportPopulation_SubjectReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectReport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubjectReport();

	/**
	 * Returns the value of the '<em><b>Subjects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional Group identifying the individuals that make up the population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subjects</em>' containment reference.
	 * @see #setSubjects(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getMeasureReportPopulation_Subjects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjects' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubjects();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MeasureReportPopulation#getSubjects <em>Subjects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjects</em>' containment reference.
	 * @see #getSubjects()
	 * @generated
	 */
	void setSubjects(Reference value);

} // MeasureReportPopulation
