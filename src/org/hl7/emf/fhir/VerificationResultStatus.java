/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.VerificationResultStatus#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getVerificationResultStatus()
 * @model extendedMetaData="name='VerificationResultStatus' kind='elementOnly'"
 * @generated
 */
public interface VerificationResultStatus extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.emf.fhir.VerificationResultStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.VerificationResultStatusEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(VerificationResultStatusEnum)
	 * @see org.hl7.emf.fhir.FhirPackage#getVerificationResultStatus_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	VerificationResultStatusEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.VerificationResultStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.VerificationResultStatusEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(VerificationResultStatusEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.emf.fhir.VerificationResultStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(VerificationResultStatusEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.emf.fhir.VerificationResultStatus#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(VerificationResultStatusEnum)
	 * @generated
	 */
	boolean isSetValue();

} // VerificationResultStatus
