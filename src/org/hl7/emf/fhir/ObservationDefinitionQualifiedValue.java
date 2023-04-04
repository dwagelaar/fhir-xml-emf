/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Definition Qualified Value</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getAge <em>Age</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getGestationalAge <em>Gestational Age</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getRangeCategory <em>Range Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getRange <em>Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getValidCodedValueSet <em>Valid Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getNormalCodedValueSet <em>Normal Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getAbnormalCodedValueSet <em>Abnormal Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getCriticalCodedValueSet <em>Critical Coded Value Set</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue()
 * @model extendedMetaData="name='ObservationDefinition.QualifiedValue' kind='elementOnly'"
 * @generated
 */
public interface ObservationDefinitionQualifiedValue extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concept defining the context for this set of qualified values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContext();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target population this  set of qualified values applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_AppliesTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appliesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAppliesTo();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gender this  set of qualified values applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(AdministrativeGender)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_Gender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gender' namespace='##targetNamespace'"
	 * @generated
	 */
	AdministrativeGender getGender();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(AdministrativeGender value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The age range this  set of qualified values applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age</em>' containment reference.
	 * @see #setAge(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_Age()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='age' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAge();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getAge <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' containment reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Range value);

	/**
	 * Returns the value of the '<em><b>Gestational Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gestational age this  set of qualified values applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gestational Age</em>' containment reference.
	 * @see #setGestationalAge(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_GestationalAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gestationalAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getGestationalAge();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getGestationalAge <em>Gestational Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gestational Age</em>' containment reference.
	 * @see #getGestationalAge()
	 * @generated
	 */
	void setGestationalAge(Range value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text based condition for which the the set of qualified values is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Range Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category of range of values for continuous or ordinal observations that match the criteria of this set of qualified values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Category</em>' containment reference.
	 * @see #setRangeCategory(ObservationRangeCategory)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_RangeCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rangeCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationRangeCategory getRangeCategory();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getRangeCategory <em>Range Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Category</em>' containment reference.
	 * @see #getRangeCategory()
	 * @generated
	 */
	void setRangeCategory(ObservationRangeCategory value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The range of values defined for continuous or ordinal observations that match the criteria of this set of qualified values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_Range()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Valid Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of valid coded results for qualitative observations  that match the criteria of this set of qualified values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Coded Value Set</em>' containment reference.
	 * @see #setValidCodedValueSet(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_ValidCodedValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validCodedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getValidCodedValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getValidCodedValueSet <em>Valid Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Coded Value Set</em>' containment reference.
	 * @see #getValidCodedValueSet()
	 * @generated
	 */
	void setValidCodedValueSet(Canonical value);

	/**
	 * Returns the value of the '<em><b>Normal Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of normal coded results for qualitative observations  that match the criteria of this set of qualified values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal Coded Value Set</em>' containment reference.
	 * @see #setNormalCodedValueSet(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_NormalCodedValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='normalCodedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getNormalCodedValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getNormalCodedValueSet <em>Normal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Coded Value Set</em>' containment reference.
	 * @see #getNormalCodedValueSet()
	 * @generated
	 */
	void setNormalCodedValueSet(Canonical value);

	/**
	 * Returns the value of the '<em><b>Abnormal Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of abnormal coded results for qualitative observations  that match the criteria of this set of qualified values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abnormal Coded Value Set</em>' containment reference.
	 * @see #setAbnormalCodedValueSet(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_AbnormalCodedValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abnormalCodedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getAbnormalCodedValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getAbnormalCodedValueSet <em>Abnormal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abnormal Coded Value Set</em>' containment reference.
	 * @see #getAbnormalCodedValueSet()
	 * @generated
	 */
	void setAbnormalCodedValueSet(Canonical value);

	/**
	 * Returns the value of the '<em><b>Critical Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of critical coded results for qualitative observations  that match the criteria of this set of qualified values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Critical Coded Value Set</em>' containment reference.
	 * @see #setCriticalCodedValueSet(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getObservationDefinitionQualifiedValue_CriticalCodedValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='criticalCodedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getCriticalCodedValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ObservationDefinitionQualifiedValue#getCriticalCodedValueSet <em>Critical Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Coded Value Set</em>' containment reference.
	 * @see #getCriticalCodedValueSet()
	 * @generated
	 */
	void setCriticalCodedValueSet(Canonical value);

} // ObservationDefinitionQualifiedValue
