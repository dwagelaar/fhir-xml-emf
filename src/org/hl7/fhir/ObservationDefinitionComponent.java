/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Definition Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionComponent#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionComponent#getPermittedDataType <em>Permitted Data Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionComponent#getPermittedUnit <em>Permitted Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionComponent#getQualifiedValue <em>Qualified Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionComponent()
 * @model extendedMetaData="name='ObservationDefinition.Component' kind='elementOnly'"
 * @generated
 */
public interface ObservationDefinitionComponent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes what will be observed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionComponent_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionComponent#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Permitted Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ObservationDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data types allowed for the value element of the instance of this component observations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permitted Data Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionComponent_PermittedDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='permittedDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObservationDataType> getPermittedDataType();

	/**
	 * Returns the value of the '<em><b>Permitted Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Units allowed for the valueQuantity element in the instance observations conforming to this ObservationDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permitted Unit</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionComponent_PermittedUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='permittedUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getPermittedUnit();

	/**
	 * Returns the value of the '<em><b>Qualified Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ObservationDefinitionQualifiedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of qualified values associated with a context and a set of conditions -  provides a range for quantitative and ordinal observations and a collection of value sets for qualitative observations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Value</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionComponent_QualifiedValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifiedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObservationDefinitionQualifiedValue> getQualifiedValue();

} // ObservationDefinitionComponent
