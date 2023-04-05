/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getDetailQuantity <em>Detail Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getDetailRange <em>Detail Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getDetailCodeableConcept <em>Detail Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getDetailString <em>Detail String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getDetailBoolean <em>Detail Boolean</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getDetailInteger <em>Detail Integer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getDetailRatio <em>Detail Ratio</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.GoalTarget#getDueDuration <em>Due Duration</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget()
 * @model extendedMetaData="name='Goal.Target' kind='elementOnly'"
 * @generated
 */
public interface GoalTarget extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_Measure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Detail Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Quantity</em>' containment reference.
	 * @see #setDetailQuantity(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_DetailQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDetailQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getDetailQuantity <em>Detail Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Quantity</em>' containment reference.
	 * @see #getDetailQuantity()
	 * @generated
	 */
	void setDetailQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Detail Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Range</em>' containment reference.
	 * @see #setDetailRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_DetailRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDetailRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getDetailRange <em>Detail Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Range</em>' containment reference.
	 * @see #getDetailRange()
	 * @generated
	 */
	void setDetailRange(Range value);

	/**
	 * Returns the value of the '<em><b>Detail Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Codeable Concept</em>' containment reference.
	 * @see #setDetailCodeableConcept(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_DetailCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDetailCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getDetailCodeableConcept <em>Detail Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Codeable Concept</em>' containment reference.
	 * @see #getDetailCodeableConcept()
	 * @generated
	 */
	void setDetailCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Detail String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail String</em>' containment reference.
	 * @see #setDetailString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_DetailString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getDetailString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getDetailString <em>Detail String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail String</em>' containment reference.
	 * @see #getDetailString()
	 * @generated
	 */
	void setDetailString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Detail Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Boolean</em>' containment reference.
	 * @see #setDetailBoolean(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_DetailBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getDetailBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getDetailBoolean <em>Detail Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Boolean</em>' containment reference.
	 * @see #getDetailBoolean()
	 * @generated
	 */
	void setDetailBoolean(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Detail Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Integer</em>' containment reference.
	 * @see #setDetailInteger(org.hl7.emf.fhir.Integer)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_DetailInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Integer getDetailInteger();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getDetailInteger <em>Detail Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Integer</em>' containment reference.
	 * @see #getDetailInteger()
	 * @generated
	 */
	void setDetailInteger(org.hl7.emf.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Detail Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Ratio</em>' containment reference.
	 * @see #setDetailRatio(Ratio)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_DetailRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getDetailRatio();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getDetailRatio <em>Detail Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Ratio</em>' containment reference.
	 * @see #getDetailRatio()
	 * @generated
	 */
	void setDetailRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' containment reference.
	 * @see #setDueDate(Date)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_DueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getDueDate <em>Due Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' containment reference.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Due Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Duration</em>' containment reference.
	 * @see #setDueDuration(Duration)
	 * @see org.hl7.emf.fhir.FhirPackage#getGoalTarget_DueDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dueDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDueDuration();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.GoalTarget#getDueDuration <em>Due Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Duration</em>' containment reference.
	 * @see #getDueDuration()
	 * @generated
	 */
	void setDueDuration(Duration value);

} // GoalTarget
