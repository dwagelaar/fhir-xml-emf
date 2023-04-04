/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, and drug quality specifications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionTarget#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailQuantity <em>Detail Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailRange <em>Detail Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailCodeableConcept <em>Detail Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailString <em>Detail String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailBoolean <em>Detail Boolean</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailInteger <em>Detail Integer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailRatio <em>Detail Ratio</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDue <em>Due</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget()
 * @model extendedMetaData="name='PlanDefinition.Target' kind='elementOnly'"
 * @generated
 */
public interface PlanDefinitionTarget extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter whose value is to be tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget_Measure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionTarget#getMeasure <em>Measure</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget_DetailQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDetailQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailQuantity <em>Detail Quantity</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget_DetailRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDetailRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailRange <em>Detail Range</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget_DetailCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDetailCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailCodeableConcept <em>Detail Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget_DetailString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getDetailString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailString <em>Detail String</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget_DetailBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getDetailBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailBoolean <em>Detail Boolean</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget_DetailInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Integer getDetailInteger();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailInteger <em>Detail Integer</em>}' containment reference.
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
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget_DetailRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getDetailRatio();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDetailRatio <em>Detail Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Ratio</em>' containment reference.
	 * @see #getDetailRatio()
	 * @generated
	 */
	void setDetailRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Due</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the timeframe after the start of the goal in which the goal should be met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due</em>' containment reference.
	 * @see #setDue(Duration)
	 * @see org.hl7.emf.fhir.FhirPackage#getPlanDefinitionTarget_Due()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='due' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.PlanDefinitionTarget#getDue <em>Due</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due</em>' containment reference.
	 * @see #getDue()
	 * @generated
	 */
	void setDue(Duration value);

} // PlanDefinitionTarget
