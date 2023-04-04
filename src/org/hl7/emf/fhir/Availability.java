/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Availability data for an {item}.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Availability#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Availability#getNotAvailableTime <em>Not Available Time</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAvailability()
 * @model extendedMetaData="name='Availability' kind='elementOnly'"
 * @generated
 */
public interface Availability extends DataType {
	/**
	 * Returns the value of the '<em><b>Available Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AvailabilityAvailableTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Times the {item} is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Time</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAvailability_AvailableTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availableTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AvailabilityAvailableTime> getAvailableTime();

	/**
	 * Returns the value of the '<em><b>Not Available Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AvailabilityNotAvailableTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not available during this time due to provided reason.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Available Time</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAvailability_NotAvailableTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notAvailableTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AvailabilityNotAvailableTime> getNotAvailableTime();

} // Availability
