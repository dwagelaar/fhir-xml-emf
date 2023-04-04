/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability Not Available Time</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.AvailabilityNotAvailableTime#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AvailabilityNotAvailableTime#getDuring <em>During</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAvailabilityNotAvailableTime()
 * @model extendedMetaData="name='Availability.NotAvailableTime' kind='elementOnly'"
 * @generated
 */
public interface AvailabilityNotAvailableTime extends DataType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason presented to the user explaining why time not available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getAvailabilityNotAvailableTime_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AvailabilityNotAvailableTime#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>During</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service not available during this period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>During</em>' containment reference.
	 * @see #setDuring(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getAvailabilityNotAvailableTime_During()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='during' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDuring();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AvailabilityNotAvailableTime#getDuring <em>During</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>During</em>' containment reference.
	 * @see #getDuring()
	 * @generated
	 */
	void setDuring(Period value);

} // AvailabilityNotAvailableTime
