/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Intake Consumed Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getNutritionProduct <em>Nutrition Product</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getRate <em>Rate</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getNotConsumed <em>Not Consumed</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getNotConsumedReason <em>Not Consumed Reason</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getNutritionIntakeConsumedItem()
 * @model extendedMetaData="name='NutritionIntake.ConsumedItem' kind='elementOnly'"
 * @generated
 */
public interface NutritionIntakeConsumedItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what a category of item that was consumed: e.g., food, fluid, enteral, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionIntakeConsumedItem_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Nutrition Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the food or fluid product that was consumed. This is potentially a link to a resource representing the details of the food product (TBD) or a simple attribute carrying a code that identifies the food from a known list of foods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutrition Product</em>' containment reference.
	 * @see #setNutritionProduct(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionIntakeConsumedItem_NutritionProduct()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nutritionProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getNutritionProduct();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getNutritionProduct <em>Nutrition Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrition Product</em>' containment reference.
	 * @see #getNutritionProduct()
	 * @generated
	 */
	void setNutritionProduct(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scheduled frequency of consumption.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Timing)
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionIntakeConsumedItem_Schedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getSchedule();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Timing value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity of the specified food.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionIntakeConsumedItem_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Quantity value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rate at which enteral feeding was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate</em>' containment reference.
	 * @see #setRate(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionIntakeConsumedItem_Rate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rate' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getRate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getRate <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' containment reference.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(Quantity value);

	/**
	 * Returns the value of the '<em><b>Not Consumed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicator when a patient is in a setting where it is helpful to know if food was not consumed, such as it was refused, held (as in tube feedings), or otherwise not provided. If a consumption is being recorded from an app, such as MyFitnessPal, this indicator will likely not be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Consumed</em>' containment reference.
	 * @see #setNotConsumed(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionIntakeConsumedItem_NotConsumed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notConsumed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getNotConsumed();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getNotConsumed <em>Not Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Consumed</em>' containment reference.
	 * @see #getNotConsumed()
	 * @generated
	 */
	void setNotConsumed(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Not Consumed Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document the reason the food or fluid was not consumed, such as refused, held, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Consumed Reason</em>' containment reference.
	 * @see #setNotConsumedReason(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getNutritionIntakeConsumedItem_NotConsumedReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notConsumedReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getNotConsumedReason();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NutritionIntakeConsumedItem#getNotConsumedReason <em>Not Consumed Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Consumed Reason</em>' containment reference.
	 * @see #getNotConsumedReason()
	 * @generated
	 */
	void setNotConsumedReason(CodeableConcept value);

} // NutritionIntakeConsumedItem
