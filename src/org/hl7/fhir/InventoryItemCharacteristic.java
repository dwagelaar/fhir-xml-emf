/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A functional description of an inventory item used in inventory and supply-related workflows.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getCharacteristicType <em>Characteristic Type</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueDecimal <em>Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueUrl <em>Value Url</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueRatio <em>Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueAnnotation <em>Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueAddress <em>Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueDuration <em>Value Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemCharacteristic#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic()
 * @model extendedMetaData="name='InventoryItem.Characteristic' kind='elementOnly'"
 * @generated
 */
public interface InventoryItemCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Characteristic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of characteristic that is being defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic Type</em>' containment reference.
	 * @see #setCharacteristicType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_CharacteristicType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='characteristicType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCharacteristicType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getCharacteristicType <em>Characteristic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic Type</em>' containment reference.
	 * @see #getCharacteristicType()
	 * @generated
	 */
	void setCharacteristicType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' containment reference.
	 * @see #setValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueString <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' containment reference.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Integer</em>' containment reference.
	 * @see #setValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueInteger <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Integer</em>' containment reference.
	 * @see #getValueInteger()
	 * @generated
	 */
	void setValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Decimal</em>' containment reference.
	 * @see #setValueDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueDecimal <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Decimal</em>' containment reference.
	 * @see #getValueDecimal()
	 * @generated
	 */
	void setValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean</em>' containment reference.
	 * @see #setValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Url</em>' containment reference.
	 * @see #setValueUrl(Url)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getValueUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueUrl <em>Value Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Url</em>' containment reference.
	 * @see #getValueUrl()
	 * @generated
	 */
	void setValueUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date Time</em>' containment reference.
	 * @see #setValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueDateTime <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' containment reference.
	 * @see #getValueDateTime()
	 * @generated
	 */
	void setValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference.
	 * @see #setValueRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueRange <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' containment reference.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(Range value);

	/**
	 * Returns the value of the '<em><b>Value Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ratio</em>' containment reference.
	 * @see #setValueRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueRatio <em>Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ratio</em>' containment reference.
	 * @see #getValueRatio()
	 * @generated
	 */
	void setValueRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Value Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Annotation</em>' containment reference.
	 * @see #setValueAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getValueAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueAnnotation <em>Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Annotation</em>' containment reference.
	 * @see #getValueAnnotation()
	 * @generated
	 */
	void setValueAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Value Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Address</em>' containment reference.
	 * @see #setValueAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getValueAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueAddress <em>Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Address</em>' containment reference.
	 * @see #getValueAddress()
	 * @generated
	 */
	void setValueAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Value Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Duration</em>' containment reference.
	 * @see #setValueDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getValueDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueDuration <em>Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Duration</em>' containment reference.
	 * @see #getValueDuration()
	 * @generated
	 */
	void setValueDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #setValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInventoryItemCharacteristic_ValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemCharacteristic#getValueCodeableConcept <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #getValueCodeableConcept()
	 * @generated
	 */
	void setValueCodeableConcept(CodeableConcept value);

} // InventoryItemCharacteristic
