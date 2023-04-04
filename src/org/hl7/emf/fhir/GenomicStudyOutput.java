/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genomic Study Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GenomicStudy is a set of analyses performed to analyze and generate genomic data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.GenomicStudyOutput#getFile <em>File</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GenomicStudyOutput#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getGenomicStudyOutput()
 * @model extendedMetaData="name='GenomicStudy.Output' kind='elementOnly'"
 * @generated
 */
public interface GenomicStudyOutput extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File containing output data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getGenomicStudyOutput_File()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='file' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFile();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GenomicStudyOutput#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of output data, e.g., VCF, MAF, or BAM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getGenomicStudyOutput_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GenomicStudyOutput#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

} // GenomicStudyOutput
