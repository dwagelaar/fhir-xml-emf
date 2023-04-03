/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter History Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of significant events/milestones key data throughout the history of an Encounter, often tracked for specific purposes such as billing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EncounterHistoryLocation#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHistoryLocation#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEncounterHistoryLocation()
 * @model extendedMetaData="name='EncounterHistory.Location' kind='elementOnly'"
 * @generated
 */
public interface EncounterHistoryLocation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where the encounter takes place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistoryLocation_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistoryLocation#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This will be used to specify the required levels (bed/ward/room/etc.) desired to be recorded to simplify either messaging or query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHistoryLocation_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHistoryLocation#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(CodeableConcept value);

} // EncounterHistoryLocation
