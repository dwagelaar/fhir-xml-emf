/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Measure resource provides the definition of a quality measure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MeasurePopulation#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasurePopulation#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasurePopulation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasurePopulation#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasurePopulation#getGroupDefinition <em>Group Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasurePopulation#getInputPopulationId <em>Input Population Id</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasurePopulation#getAggregateMethod <em>Aggregate Method</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasurePopulation()
 * @model extendedMetaData="name='Measure.Population' kind='elementOnly'"
 * @generated
 */
public interface MeasurePopulation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that is unique within the Measure allowing linkage to the equivalent population in a MeasureReport resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasurePopulation_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasurePopulation#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of population criteria.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMeasurePopulation_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasurePopulation#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The human readable description of this population criteria.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasurePopulation_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasurePopulation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression that specifies the criteria for the population, typically the name of an expression in a library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference.
	 * @see #setCriteria(Expression)
	 * @see org.hl7.fhir.FhirPackage#getMeasurePopulation_Criteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='criteria' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getCriteria();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasurePopulation#getCriteria <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' containment reference.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(Expression value);

	/**
	 * Returns the value of the '<em><b>Group Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Group resource that defines this population as a set of characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Definition</em>' containment reference.
	 * @see #setGroupDefinition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasurePopulation_GroupDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getGroupDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasurePopulation#getGroupDefinition <em>Group Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Definition</em>' containment reference.
	 * @see #getGroupDefinition()
	 * @generated
	 */
	void setGroupDefinition(Reference value);

	/**
	 * Returns the value of the '<em><b>Input Population Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of a population element in this measure that provides the input for this population criteria. In most cases, the scoring structure of the measure implies specific relationships (e.g. the Numerator uses the Denominator as the source in a proportion scoring). In some cases, however, multiple possible choices exist and must be resolved explicitly. For example in a ratio measure with multiple initial populations, the denominator must specify which population should be used as the starting point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Population Id</em>' containment reference.
	 * @see #setInputPopulationId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasurePopulation_InputPopulationId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputPopulationId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInputPopulationId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasurePopulation#getInputPopulationId <em>Input Population Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Population Id</em>' containment reference.
	 * @see #getInputPopulationId()
	 * @generated
	 */
	void setInputPopulationId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Aggregate Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies which method should be used to aggregate measure observation values. For most scoring types, this is implied by scoring (e.g. a proportion measure counts members of the populations). For continuous variables, however, this information must be specified to ensure correct calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregate Method</em>' containment reference.
	 * @see #setAggregateMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMeasurePopulation_AggregateMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aggregateMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAggregateMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasurePopulation#getAggregateMethod <em>Aggregate Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Method</em>' containment reference.
	 * @see #getAggregateMethod()
	 * @generated
	 */
	void setAggregateMethod(CodeableConcept value);

} // MeasurePopulation
