/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer64</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A very large whole number
 * Typically this is used for record counters (e.g. database keys)
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Integer64#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getInteger64()
 * @model extendedMetaData="name='integer64' kind='elementOnly'"
 * @generated
 */
public interface Integer64 extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(long)
	 * @see org.hl7.emf.fhir.FhirPackage#getInteger64_Value()
	 * @model unsettable="true" dataType="org.hl7.emf.fhir.Integer64Primitive"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Integer64#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Unsets the value of the '{@link org.hl7.emf.fhir.Integer64#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(long)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.emf.fhir.Integer64#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(long)
	 * @generated
	 */
	boolean isSetValue();

} // Integer64
