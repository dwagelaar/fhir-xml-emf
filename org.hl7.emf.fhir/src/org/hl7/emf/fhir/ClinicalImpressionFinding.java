/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Impression Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ClinicalImpressionFinding#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalImpressionFinding#getBasis <em>Basis</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getClinicalImpressionFinding()
 * @model extendedMetaData="name='ClinicalImpression.Finding' kind='elementOnly'"
 * @generated
 */
public interface ClinicalImpressionFinding extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalImpressionFinding_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getItem();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalImpressionFinding#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which investigations support finding or diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basis</em>' containment reference.
	 * @see #setBasis(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalImpressionFinding_Basis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basis' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getBasis();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalImpressionFinding#getBasis <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis</em>' containment reference.
	 * @see #getBasis()
	 * @generated
	 */
	void setBasis(org.hl7.emf.fhir.String value);

} // ClinicalImpressionFinding
