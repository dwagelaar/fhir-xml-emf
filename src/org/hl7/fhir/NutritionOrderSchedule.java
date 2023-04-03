/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionOrderSchedule#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderSchedule#getAsNeeded <em>As Needed</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderSchedule#getAsNeededFor <em>As Needed For</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionOrderSchedule()
 * @model extendedMetaData="name='NutritionOrder.Schedule' kind='elementOnly'"
 * @generated
 */
public interface NutritionOrderSchedule extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Timing</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Timing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderSchedule_Timing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Timing> getTiming();

	/**
	 * Returns the value of the '<em><b>As Needed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the product is only taken when needed within a specific dosing schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Needed</em>' containment reference.
	 * @see #setAsNeeded(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderSchedule_AsNeeded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeeded' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAsNeeded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderSchedule#getAsNeeded <em>As Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed</em>' containment reference.
	 * @see #getAsNeeded()
	 * @generated
	 */
	void setAsNeeded(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>As Needed For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the product is only taken based on a precondition for taking the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Needed For</em>' containment reference.
	 * @see #setAsNeededFor(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderSchedule_AsNeededFor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededFor' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAsNeededFor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderSchedule#getAsNeededFor <em>As Needed For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed For</em>' containment reference.
	 * @see #getAsNeededFor()
	 * @generated
	 */
	void setAsNeededFor(CodeableConcept value);

} // NutritionOrderSchedule
