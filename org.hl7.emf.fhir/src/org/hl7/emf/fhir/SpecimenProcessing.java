/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Processing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sample to be used for analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.SpecimenProcessing#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SpecimenProcessing#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SpecimenProcessing#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SpecimenProcessing#getTimeDateTime <em>Time Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SpecimenProcessing#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSpecimenProcessing()
 * @model extendedMetaData="name='Specimen.Processing' kind='elementOnly'"
 * @generated
 */
public interface SpecimenProcessing extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description of procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimenProcessing_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SpecimenProcessing#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded value specifying the method used to process the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimenProcessing_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SpecimenProcessing#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material used in the processing step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimenProcessing_Additive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additive' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAdditive();

	/**
	 * Returns the value of the '<em><b>Time Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Date Time</em>' containment reference.
	 * @see #setTimeDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimenProcessing_TimeDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimeDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SpecimenProcessing#getTimeDateTime <em>Time Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Date Time</em>' containment reference.
	 * @see #getTimeDateTime()
	 * @generated
	 */
	void setTimeDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Period</em>' containment reference.
	 * @see #setTimePeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimenProcessing_TimePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SpecimenProcessing#getTimePeriod <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' containment reference.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(Period value);

} // SpecimenProcessing
