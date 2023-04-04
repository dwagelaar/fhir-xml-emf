/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Association Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of association or dissociation of a device with a patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DeviceAssociationOperation#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceAssociationOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceAssociationOperation#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceAssociationOperation()
 * @model extendedMetaData="name='DeviceAssociation.Operation' kind='elementOnly'"
 * @generated
 */
public interface DeviceAssociationOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device operational condition corresponding to the association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceAssociationOperation_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceAssociationOperation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual performing the action enabled by the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceAssociationOperation_Operator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getOperator();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Begin and end dates and times for the device's operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceAssociationOperation_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceAssociationOperation#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // DeviceAssociationOperation
