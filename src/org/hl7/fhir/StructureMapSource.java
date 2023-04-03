/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Map of relationships between 2 structures that can be used to transform data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getCheck <em>Check</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getStructureMapSource()
 * @model extendedMetaData="name='StructureMap.Source' kind='elementOnly'"
 * @generated
 */
public interface StructureMapSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type or variable this rule applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Context()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Id value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified minimum cardinality for the element. This is optional; if present, it acts an implicit check on the input content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Min()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified maximum cardinality for the element - a number or a "*". This is optional; if present, it acts an implicit check on the input content (* just serves as documentation; it's the default value).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Max()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified type for the element. This works as a condition on the mapping - use for polymorphic elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional field for this source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getElement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>List Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How to handle the list mode for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Mode</em>' containment reference.
	 * @see #setListMode(StructureMapSourceListMode)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_ListMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listMode' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureMapSourceListMode getListMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getListMode <em>List Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Mode</em>' containment reference.
	 * @see #getListMode()
	 * @generated
	 */
	void setListMode(StructureMapSourceListMode value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Named context for field, if a field is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getVariable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Id value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath expression  - must be true or the rule does not apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check</em>' containment reference.
	 * @see #setCheck(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Check()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='check' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCheck();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getCheck <em>Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' containment reference.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Log Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A FHIRPath expression which specifies a message to put in the transform log when content matching the source rule is found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Message</em>' containment reference.
	 * @see #setLogMessage(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_LogMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='logMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLogMessage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getLogMessage <em>Log Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Message</em>' containment reference.
	 * @see #getLogMessage()
	 * @generated
	 */
	void setLogMessage(org.hl7.fhir.String value);

} // StructureMapSource
