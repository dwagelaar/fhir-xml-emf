/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueRatio <em>Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventDetail#getValueBase64Binary <em>Value Base64 Binary</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail()
 * @model extendedMetaData="name='AuditEvent.Detail' kind='elementOnly'"
 * @generated
 */
public interface AuditEventDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of extra detail provided in the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #setValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueCodeableConcept <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #getValueCodeableConcept()
	 * @generated
	 */
	void setValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' containment reference.
	 * @see #setValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueString <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' containment reference.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean</em>' containment reference.
	 * @see #setValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Integer</em>' containment reference.
	 * @see #setValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueInteger <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Integer</em>' containment reference.
	 * @see #getValueInteger()
	 * @generated
	 */
	void setValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference.
	 * @see #setValueRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueRange <em>Value Range</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueRatio <em>Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ratio</em>' containment reference.
	 * @see #getValueRatio()
	 * @generated
	 */
	void setValueRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Time</em>' containment reference.
	 * @see #setValueTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueTime <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Time</em>' containment reference.
	 * @see #getValueTime()
	 * @generated
	 */
	void setValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date Time</em>' containment reference.
	 * @see #setValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueDateTime <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' containment reference.
	 * @see #getValueDateTime()
	 * @generated
	 */
	void setValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Period</em>' containment reference.
	 * @see #setValuePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValuePeriod <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Period</em>' containment reference.
	 * @see #getValuePeriod()
	 * @generated
	 */
	void setValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Value Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Base64 Binary</em>' containment reference.
	 * @see #setValueBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventDetail_ValueBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getValueBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventDetail#getValueBase64Binary <em>Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Base64 Binary</em>' containment reference.
	 * @see #getValueBase64Binary()
	 * @generated
	 */
	void setValueBase64Binary(Base64Binary value);

} // AuditEventDetail
