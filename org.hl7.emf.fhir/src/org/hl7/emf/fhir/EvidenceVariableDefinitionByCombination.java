/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Variable Definition By Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableDefinitionByCombination#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableDefinitionByCombination#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableDefinitionByCombination#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinitionByCombination()
 * @model extendedMetaData="name='EvidenceVariable.DefinitionByCombination' kind='elementOnly'"
 * @generated
 */
public interface EvidenceVariableDefinitionByCombination extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to specify if two or more characteristics are combined with OR or AND.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CharacteristicCombination)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinitionByCombination_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacteristicCombination getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableDefinitionByCombination#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CharacteristicCombination value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the value of "n" when "at-least" or "at-most" codes are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold</em>' containment reference.
	 * @see #setThreshold(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinitionByCombination_Threshold()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='threshold' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getThreshold();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableDefinitionByCombination#getThreshold <em>Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' containment reference.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.EvidenceVariableCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A defining factor of the characteristic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableDefinitionByCombination_Characteristic()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceVariableCharacteristic> getCharacteristic();

} // EvidenceVariableDefinitionByCombination
