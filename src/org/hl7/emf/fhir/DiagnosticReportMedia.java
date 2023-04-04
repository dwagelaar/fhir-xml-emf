/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Report Media</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.DiagnosticReportMedia#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DiagnosticReportMedia#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDiagnosticReportMedia()
 * @model extendedMetaData="name='DiagnosticReport.Media' kind='elementOnly'"
 * @generated
 */
public interface DiagnosticReportMedia extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment about the image or data. Typically, this is used to provide an explanation for why the image or data is included, or to draw the viewer's attention to important features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getDiagnosticReportMedia_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DiagnosticReportMedia#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the image or data source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDiagnosticReportMedia_Link()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLink();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DiagnosticReportMedia#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Reference value);

} // DiagnosticReportMedia
