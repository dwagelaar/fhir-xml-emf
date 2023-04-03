/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Status Codes</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeStatusCodes#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeStatusCodes()
 * @model extendedMetaData="name='MedicationKnowledgeStatusCodes' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeStatusCodes extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.MedicationKnowledgeStatusCodesEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.MedicationKnowledgeStatusCodesEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(MedicationKnowledgeStatusCodesEnum)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeStatusCodes_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	MedicationKnowledgeStatusCodesEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeStatusCodes#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.MedicationKnowledgeStatusCodesEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MedicationKnowledgeStatusCodesEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.MedicationKnowledgeStatusCodes#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(MedicationKnowledgeStatusCodesEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.MedicationKnowledgeStatusCodes#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(MedicationKnowledgeStatusCodesEnum)
	 * @generated
	 */
	boolean isSetValue();

} // MedicationKnowledgeStatusCodes
