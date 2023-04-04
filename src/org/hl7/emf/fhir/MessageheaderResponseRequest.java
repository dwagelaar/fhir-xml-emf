/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Messageheader Response Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HL7-defined table of codes which identify conditions under which acknowledgments are required to be returned in response to a message.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.MessageheaderResponseRequest#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getMessageheaderResponseRequest()
 * @model extendedMetaData="name='MessageheaderResponseRequest' kind='elementOnly'"
 * @generated
 */
public interface MessageheaderResponseRequest extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.emf.fhir.MessageheaderResponseRequestEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.MessageheaderResponseRequestEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(MessageheaderResponseRequestEnum)
	 * @see org.hl7.emf.fhir.FhirPackage#getMessageheaderResponseRequest_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	MessageheaderResponseRequestEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MessageheaderResponseRequest#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.MessageheaderResponseRequestEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MessageheaderResponseRequestEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.emf.fhir.MessageheaderResponseRequest#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(MessageheaderResponseRequestEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.emf.fhir.MessageheaderResponseRequest#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(MessageheaderResponseRequestEnum)
	 * @generated
	 */
	boolean isSetValue();

} // MessageheaderResponseRequest
