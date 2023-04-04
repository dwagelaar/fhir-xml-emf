/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A task to be performed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.TaskRestriction#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TaskRestriction#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.TaskRestriction#getRecipient <em>Recipient</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getTaskRestriction()
 * @model extendedMetaData="name='Task.Restriction' kind='elementOnly'"
 * @generated
 */
public interface TaskRestriction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the number of times the requested action should occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repetitions</em>' containment reference.
	 * @see #setRepetitions(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getTaskRestriction_Repetitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repetitions' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getRepetitions();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TaskRestriction#getRepetitions <em>Repetitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetitions</em>' containment reference.
	 * @see #getRepetitions()
	 * @generated
	 */
	void setRepetitions(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time-period for which fulfillment is sought. This must fall within the overall time period authorized in the referenced request.  E.g. ServiceRequest.occurance[x].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getTaskRestriction_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.TaskRestriction#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For requests that are targeted to more than one potential recipient/target, to identify who is fulfillment is sought for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getTaskRestriction_Recipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRecipient();

} // TaskRestriction
