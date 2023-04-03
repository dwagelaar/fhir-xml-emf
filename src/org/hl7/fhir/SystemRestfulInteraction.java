/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Restful Interaction</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SystemRestfulInteraction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSystemRestfulInteraction()
 * @model extendedMetaData="name='SystemRestfulInteraction' kind='elementOnly'"
 * @generated
 */
public interface SystemRestfulInteraction extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.SystemRestfulInteractionEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SystemRestfulInteractionEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(SystemRestfulInteractionEnum)
	 * @see org.hl7.fhir.FhirPackage#getSystemRestfulInteraction_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	SystemRestfulInteractionEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SystemRestfulInteraction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SystemRestfulInteractionEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SystemRestfulInteractionEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.SystemRestfulInteraction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(SystemRestfulInteractionEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.SystemRestfulInteraction#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(SystemRestfulInteractionEnum)
	 * @generated
	 */
	boolean isSetValue();

} // SystemRestfulInteraction
