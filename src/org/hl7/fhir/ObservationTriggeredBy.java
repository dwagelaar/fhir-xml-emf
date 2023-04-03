/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Triggered By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measurements and simple assertions made about a patient, device or other subject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ObservationTriggeredBy#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationTriggeredBy#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationTriggeredBy#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getObservationTriggeredBy()
 * @model extendedMetaData="name='Observation.TriggeredBy' kind='elementOnly'"
 * @generated
 */
public interface ObservationTriggeredBy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the triggering observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getObservationTriggeredBy_Observation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='observation' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getObservation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationTriggeredBy#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of trigger.
	 * Reflex | Repeat | Re-run.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TriggeredBytype)
	 * @see org.hl7.fhir.FhirPackage#getObservationTriggeredBy_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggeredBytype getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationTriggeredBy#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TriggeredBytype value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the reason why this observation was performed as a result of the observation(s) referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getObservationTriggeredBy_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationTriggeredBy#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(org.hl7.fhir.String value);

} // ObservationTriggeredBy
