/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Payment By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CoveragePaymentBy#getParty <em>Party</em>}</li>
 *   <li>{@link org.hl7.fhir.CoveragePaymentBy#getResponsibility <em>Responsibility</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoveragePaymentBy()
 * @model extendedMetaData="name='Coverage.PaymentBy' kind='elementOnly'"
 * @generated
 */
public interface CoveragePaymentBy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of parties providing non-insurance payment for the treatment costs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoveragePaymentBy_Party()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='party' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParty();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoveragePaymentBy#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Reference value);

	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Description of the financial responsibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsibility</em>' containment reference.
	 * @see #setResponsibility(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoveragePaymentBy_Responsibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsibility' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getResponsibility();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoveragePaymentBy#getResponsibility <em>Responsibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility</em>' containment reference.
	 * @see #getResponsibility()
	 * @generated
	 */
	void setResponsibility(org.hl7.fhir.String value);

} // CoveragePaymentBy
