/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Report Supporting Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The findings and interpretation of diagnostic tests performed on patients, groups of patients, products, substances, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports. The report also includes non-clinical context such as batch analysis and stability reporting of products and substances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DiagnosticReportSupportingInfo#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DiagnosticReportSupportingInfo#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDiagnosticReportSupportingInfo()
 * @model extendedMetaData="name='DiagnosticReport.SupportingInfo' kind='elementOnly'"
 * @generated
 */
public interface DiagnosticReportSupportingInfo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code value for the role of the supporting information in the diagnostic report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDiagnosticReportSupportingInfo_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DiagnosticReportSupportingInfo#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference for the supporting information in the diagnostic report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDiagnosticReportSupportingInfo_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DiagnosticReportSupportingInfo#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // DiagnosticReportSupportingInfo
