/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Status Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Citation Resource enables reference to any knowledge artifact for purposes of identification and attribution. The Citation Resource supports existing reference structures and developing publication practices such as versioning, expressing complex contributorship roles, and referencing computable resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CitationStatusDate#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationStatusDate#getActual <em>Actual</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationStatusDate#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationStatusDate()
 * @model extendedMetaData="name='Citation.StatusDate' kind='elementOnly'"
 * @generated
 */
public interface CitationStatusDate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state or status of the citation record (that will be paired with the period).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCitationStatusDate_Activity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getActivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationStatusDate#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the status date is actual (has occurred) or expected (estimated or anticipated).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference.
	 * @see #setActual(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCitationStatusDate_Actual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actual' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getActual();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationStatusDate#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the status started and/or ended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getCitationStatusDate_Period()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationStatusDate#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // CitationStatusDate
