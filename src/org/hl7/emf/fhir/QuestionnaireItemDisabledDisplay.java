/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Item Disabled Display</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.QuestionnaireItemDisabledDisplay#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getQuestionnaireItemDisabledDisplay()
 * @model extendedMetaData="name='QuestionnaireItemDisabledDisplay' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireItemDisabledDisplay extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.emf.fhir.QuestionnaireItemDisabledDisplayEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.QuestionnaireItemDisabledDisplayEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(QuestionnaireItemDisabledDisplayEnum)
	 * @see org.hl7.emf.fhir.FhirPackage#getQuestionnaireItemDisabledDisplay_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	QuestionnaireItemDisabledDisplayEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.QuestionnaireItemDisabledDisplay#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.emf.fhir.QuestionnaireItemDisabledDisplayEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(QuestionnaireItemDisabledDisplayEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.emf.fhir.QuestionnaireItemDisabledDisplay#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(QuestionnaireItemDisabledDisplayEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.emf.fhir.QuestionnaireItemDisabledDisplay#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(QuestionnaireItemDisabledDisplayEnum)
	 * @generated
	 */
	boolean isSetValue();

} // QuestionnaireItemDisabledDisplay
