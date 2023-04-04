/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Program Eligibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ImmunizationProgramEligibility#getProgram <em>Program</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImmunizationProgramEligibility#getProgramStatus <em>Program Status</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getImmunizationProgramEligibility()
 * @model extendedMetaData="name='Immunization.ProgramEligibility' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationProgramEligibility extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which program the patient had their eligility evaluated for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getImmunizationProgramEligibility_Program()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='program' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProgram();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImmunizationProgramEligibility#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Program Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the patient's eligility status for for a specific payment program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Status</em>' containment reference.
	 * @see #setProgramStatus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getImmunizationProgramEligibility_ProgramStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='programStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProgramStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImmunizationProgramEligibility#getProgramStatus <em>Program Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Status</em>' containment reference.
	 * @see #getProgramStatus()
	 * @generated
	 */
	void setProgramStatus(CodeableConcept value);

} // ImmunizationProgramEligibility
