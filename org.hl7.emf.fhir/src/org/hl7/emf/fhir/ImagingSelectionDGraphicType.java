/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Selection DGraphic Type</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ImagingSelectionDGraphicType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionDGraphicType()
 * @model extendedMetaData="name='ImagingSelectionDGraphicType' kind='elementOnly'"
 * @generated
 */
public interface ImagingSelectionDGraphicType extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.emf.fhir.ImagingSelectionDGraphicTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.ImagingSelectionDGraphicTypeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ImagingSelectionDGraphicTypeEnum)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionDGraphicType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ImagingSelectionDGraphicTypeEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelectionDGraphicType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.ImagingSelectionDGraphicTypeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ImagingSelectionDGraphicTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.emf.fhir.ImagingSelectionDGraphicType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ImagingSelectionDGraphicTypeEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.emf.fhir.ImagingSelectionDGraphicType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ImagingSelectionDGraphicTypeEnum)
	 * @generated
	 */
	boolean isSetValue();

} // ImagingSelectionDGraphicType
