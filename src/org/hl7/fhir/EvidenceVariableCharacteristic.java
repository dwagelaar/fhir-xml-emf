/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Variable Characteristic</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionExpression <em>Definition Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionId <em>Definition Id</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionByTypeAndValue <em>Definition By Type And Value</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionByCombination <em>Definition By Combination</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getInstancesQuantity <em>Instances Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getInstancesRange <em>Instances Range</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDurationQuantity <em>Duration Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDurationRange <em>Duration Range</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getTimeFromEvent <em>Time From Event</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic()
 * @model extendedMetaData="name='EvidenceVariable.Characteristic' kind='elementOnly'"
 * @generated
 */
public interface EvidenceVariableCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label used for when a characteristic refers to another characteristic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(Id)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(Id value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable string to clarify or explain concepts about the characteristic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true, this characteristic is an exclusion criterion. In other words, not matching this characteristic definition is equivalent to meeting this criterion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExclude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Definition Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the characteristic using a Reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Reference</em>' containment reference.
	 * @see #setDefinitionReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefinitionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionReference <em>Definition Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Reference</em>' containment reference.
	 * @see #getDefinitionReference()
	 * @generated
	 */
	void setDefinitionReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Definition Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the characteristic using Canonical.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #setDefinitionCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinitionCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCanonical <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #getDefinitionCanonical()
	 * @generated
	 */
	void setDefinitionCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Definition Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the characteristic using CodeableConcept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Codeable Concept</em>' containment reference.
	 * @see #setDefinitionCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDefinitionCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Codeable Concept</em>' containment reference.
	 * @see #getDefinitionCodeableConcept()
	 * @generated
	 */
	void setDefinitionCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Definition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the characteristic using Expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Expression</em>' containment reference.
	 * @see #setDefinitionExpression(Expression)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getDefinitionExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionExpression <em>Definition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Expression</em>' containment reference.
	 * @see #getDefinitionExpression()
	 * @generated
	 */
	void setDefinitionExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Definition Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the characteristic using id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Id</em>' containment reference.
	 * @see #setDefinitionId(Id)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getDefinitionId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionId <em>Definition Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Id</em>' containment reference.
	 * @see #getDefinitionId()
	 * @generated
	 */
	void setDefinitionId(Id value);

	/**
	 * Returns the value of the '<em><b>Definition By Type And Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the characteristic using both a type and value[x] elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition By Type And Value</em>' containment reference.
	 * @see #setDefinitionByTypeAndValue(EvidenceVariableDefinitionByTypeAndValue)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionByTypeAndValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionByTypeAndValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceVariableDefinitionByTypeAndValue getDefinitionByTypeAndValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionByTypeAndValue <em>Definition By Type And Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition By Type And Value</em>' containment reference.
	 * @see #getDefinitionByTypeAndValue()
	 * @generated
	 */
	void setDefinitionByTypeAndValue(EvidenceVariableDefinitionByTypeAndValue value);

	/**
	 * Returns the value of the '<em><b>Definition By Combination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the characteristic as a combination of two or more characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition By Combination</em>' containment reference.
	 * @see #setDefinitionByCombination(EvidenceVariableDefinitionByCombination)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionByCombination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionByCombination' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceVariableDefinitionByCombination getDefinitionByCombination();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionByCombination <em>Definition By Combination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition By Combination</em>' containment reference.
	 * @see #getDefinitionByCombination()
	 * @generated
	 */
	void setDefinitionByCombination(EvidenceVariableDefinitionByCombination value);

	/**
	 * Returns the value of the '<em><b>Instances Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances Quantity</em>' containment reference.
	 * @see #setInstancesQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_InstancesQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instancesQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getInstancesQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getInstancesQuantity <em>Instances Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances Quantity</em>' containment reference.
	 * @see #getInstancesQuantity()
	 * @generated
	 */
	void setInstancesQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Instances Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances Range</em>' containment reference.
	 * @see #setInstancesRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_InstancesRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instancesRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getInstancesRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getInstancesRange <em>Instances Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances Range</em>' containment reference.
	 * @see #getInstancesRange()
	 * @generated
	 */
	void setInstancesRange(Range value);

	/**
	 * Returns the value of the '<em><b>Duration Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Quantity</em>' containment reference.
	 * @see #setDurationQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DurationQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='durationQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDurationQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDurationQuantity <em>Duration Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Quantity</em>' containment reference.
	 * @see #getDurationQuantity()
	 * @generated
	 */
	void setDurationQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Duration Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Range</em>' containment reference.
	 * @see #setDurationRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DurationRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='durationRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDurationRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDurationRange <em>Duration Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Range</em>' containment reference.
	 * @see #getDurationRange()
	 * @generated
	 */
	void setDurationRange(Range value);

	/**
	 * Returns the value of the '<em><b>Time From Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceVariableTimeFromEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timing in which the characteristic is determined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time From Event</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_TimeFromEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeFromEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceVariableTimeFromEvent> getTimeFromEvent();

} // EvidenceVariableCharacteristic
