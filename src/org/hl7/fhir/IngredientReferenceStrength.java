/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient Reference Strength</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ingredient of a manufactured item or pharmaceutical product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.IngredientReferenceStrength#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientReferenceStrength#getStrengthRatio <em>Strength Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientReferenceStrength#getStrengthRatioRange <em>Strength Ratio Range</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientReferenceStrength#getStrengthQuantity <em>Strength Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientReferenceStrength#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientReferenceStrength#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getIngredientReferenceStrength()
 * @model extendedMetaData="name='Ingredient.ReferenceStrength' kind='elementOnly'"
 * @generated
 */
public interface IngredientReferenceStrength extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant reference substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getIngredientReferenceStrength_Substance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientReferenceStrength#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Strength Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength Ratio</em>' containment reference.
	 * @see #setStrengthRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getIngredientReferenceStrength_StrengthRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getStrengthRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientReferenceStrength#getStrengthRatio <em>Strength Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Ratio</em>' containment reference.
	 * @see #getStrengthRatio()
	 * @generated
	 */
	void setStrengthRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Strength Ratio Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength Ratio Range</em>' containment reference.
	 * @see #setStrengthRatioRange(RatioRange)
	 * @see org.hl7.fhir.FhirPackage#getIngredientReferenceStrength_StrengthRatioRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthRatioRange' namespace='##targetNamespace'"
	 * @generated
	 */
	RatioRange getStrengthRatioRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientReferenceStrength#getStrengthRatioRange <em>Strength Ratio Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Ratio Range</em>' containment reference.
	 * @see #getStrengthRatioRange()
	 * @generated
	 */
	void setStrengthRatioRange(RatioRange value);

	/**
	 * Returns the value of the '<em><b>Strength Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength Quantity</em>' containment reference.
	 * @see #setStrengthQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getIngredientReferenceStrength_StrengthQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getStrengthQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientReferenceStrength#getStrengthQuantity <em>Strength Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Quantity</em>' containment reference.
	 * @see #getStrengthQuantity()
	 * @generated
	 */
	void setStrengthQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Measurement Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For when strength is measured at a particular point or distance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Point</em>' containment reference.
	 * @see #setMeasurementPoint(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getIngredientReferenceStrength_MeasurementPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measurementPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMeasurementPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientReferenceStrength#getMeasurementPoint <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Point</em>' containment reference.
	 * @see #getMeasurementPoint()
	 * @generated
	 */
	void setMeasurementPoint(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The country or countries for which the strength range applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getIngredientReferenceStrength_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCountry();

} // IngredientReferenceStrength
