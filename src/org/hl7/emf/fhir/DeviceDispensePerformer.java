/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Dispense Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of dispensation of a device - i.e., assigning a device to a patient, or to a professional for their use.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DeviceDispensePerformer#getFunction <em>Function</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDispensePerformer#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDispensePerformer()
 * @model extendedMetaData="name='DeviceDispense.Performer' kind='elementOnly'"
 * @generated
 */
public interface DeviceDispensePerformer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distinguishes the type of performer in the dispense.  For example, date enterer, packager, final checker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDispensePerformer_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFunction();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDispensePerformer#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device, practitioner, etc. who performed the action.  It should be assumed that the actor is the dispenser of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDispensePerformer_Actor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDispensePerformer#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

} // DeviceDispensePerformer
