/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Manual Completion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The type of operator to use for assertion.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.AssertionManualCompletionType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAssertionManualCompletionType()
 * @model extendedMetaData="name='AssertionManualCompletionType' kind='elementOnly'"
 * @generated
 */
public interface AssertionManualCompletionType extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.emf.fhir.AssertionManualCompletionTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.AssertionManualCompletionTypeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(AssertionManualCompletionTypeEnum)
	 * @see org.hl7.emf.fhir.FhirPackage#getAssertionManualCompletionType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	AssertionManualCompletionTypeEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AssertionManualCompletionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.AssertionManualCompletionTypeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AssertionManualCompletionTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.emf.fhir.AssertionManualCompletionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(AssertionManualCompletionTypeEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.emf.fhir.AssertionManualCompletionType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(AssertionManualCompletionTypeEnum)
	 * @generated
	 */
	boolean isSetValue();

} // AssertionManualCompletionType
