/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getSubstanceDefinitionReference <em>Substance Definition Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getSubstanceDefinitionCodeableConcept <em>Substance Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getAmountRatio <em>Amount Ratio</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getRatioHighLimitAmount <em>Ratio High Limit Amount</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship()
 * @model extendedMetaData="name='SubstanceDefinition.Relationship' kind='elementOnly'"
 * @generated
 */
public interface SubstanceDefinitionRelationship extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance Definition Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance Definition Reference</em>' containment reference.
	 * @see #setSubstanceDefinitionReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_SubstanceDefinitionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceDefinitionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubstanceDefinitionReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getSubstanceDefinitionReference <em>Substance Definition Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Definition Reference</em>' containment reference.
	 * @see #getSubstanceDefinitionReference()
	 * @generated
	 */
	void setSubstanceDefinitionReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Substance Definition Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance Definition Codeable Concept</em>' containment reference.
	 * @see #setSubstanceDefinitionCodeableConcept(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_SubstanceDefinitionCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceDefinitionCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstanceDefinitionCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getSubstanceDefinitionCodeableConcept <em>Substance Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Definition Codeable Concept</em>' containment reference.
	 * @see #getSubstanceDefinitionCodeableConcept()
	 * @generated
	 */
	void setSubstanceDefinitionCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For example "salt to parent", "active moiety", "starting material", "polymorph", "impurity of".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Is Defining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For example where an enzyme strongly bonds with a particular substance, this is a defining relationship for that enzyme, out of several possible substance relationships.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Defining</em>' containment reference.
	 * @see #setIsDefining(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_IsDefining()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isDefining' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getIsDefining();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getIsDefining <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Defining</em>' containment reference.
	 * @see #getIsDefining()
	 * @generated
	 */
	void setIsDefining(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Amount Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #setAmountQuantity(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_AmountQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmountQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getAmountQuantity <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #getAmountQuantity()
	 * @generated
	 */
	void setAmountQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Amount Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Ratio</em>' containment reference.
	 * @see #setAmountRatio(Ratio)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_AmountRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getAmountRatio();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getAmountRatio <em>Amount Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Ratio</em>' containment reference.
	 * @see #getAmountRatio()
	 * @generated
	 */
	void setAmountRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Amount String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount String</em>' containment reference.
	 * @see #setAmountString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_AmountString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getAmountString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getAmountString <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount String</em>' containment reference.
	 * @see #getAmountString()
	 * @generated
	 */
	void setAmountString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Ratio High Limit Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For use when the numeric has an uncertain range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ratio High Limit Amount</em>' containment reference.
	 * @see #setRatioHighLimitAmount(Ratio)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_RatioHighLimitAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ratioHighLimitAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getRatioHighLimitAmount();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getRatioHighLimitAmount <em>Ratio High Limit Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio High Limit Amount</em>' containment reference.
	 * @see #getRatioHighLimitAmount()
	 * @generated
	 */
	void setRatioHighLimitAmount(Ratio value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An operator for the amount, for example "average", "approximately", "less than".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparator</em>' containment reference.
	 * @see #setComparator(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_Comparator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comparator' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getComparator();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRelationship#getComparator <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' containment reference.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting literature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRelationship_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

} // SubstanceDefinitionRelationship
