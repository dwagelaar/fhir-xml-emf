/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Member History Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getContributedToDeath <em>Contributed To Death</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedAge <em>Performed Age</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedRange <em>Performed Range</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedPeriod <em>Performed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedString <em>Performed String</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedDateTime <em>Performed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure()
 * @model extendedMetaData="name='FamilyMemberHistory.Procedure' kind='elementOnly'"
 * @generated
 */
public interface FamilyMemberHistoryProcedure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual procedure specified. Could be a coded procedure or a less specific string depending on how much is known about the procedure and the capabilities of the creating system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what happened following the procedure. If the procedure resulted in death, deceased date is captured on the relation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Contributed To Death</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This procedure contributed to the cause of death of the related person. If contributedToDeath is not populated, then it is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributed To Death</em>' containment reference.
	 * @see #setContributedToDeath(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure_ContributedToDeath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributedToDeath' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getContributedToDeath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getContributedToDeath <em>Contributed To Death</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributed To Death</em>' containment reference.
	 * @see #getContributedToDeath()
	 * @generated
	 */
	void setContributedToDeath(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Performed Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Age</em>' containment reference.
	 * @see #setPerformedAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure_PerformedAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getPerformedAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedAge <em>Performed Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Age</em>' containment reference.
	 * @see #getPerformedAge()
	 * @generated
	 */
	void setPerformedAge(Age value);

	/**
	 * Returns the value of the '<em><b>Performed Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Range</em>' containment reference.
	 * @see #setPerformedRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure_PerformedRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getPerformedRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedRange <em>Performed Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Range</em>' containment reference.
	 * @see #getPerformedRange()
	 * @generated
	 */
	void setPerformedRange(Range value);

	/**
	 * Returns the value of the '<em><b>Performed Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Period</em>' containment reference.
	 * @see #setPerformedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure_PerformedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPerformedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedPeriod <em>Performed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Period</em>' containment reference.
	 * @see #getPerformedPeriod()
	 * @generated
	 */
	void setPerformedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Performed String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed String</em>' containment reference.
	 * @see #setPerformedString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure_PerformedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPerformedString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedString <em>Performed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed String</em>' containment reference.
	 * @see #getPerformedString()
	 * @generated
	 */
	void setPerformedString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Performed Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Date Time</em>' containment reference.
	 * @see #setPerformedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure_PerformedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPerformedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryProcedure#getPerformedDateTime <em>Performed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Date Time</em>' containment reference.
	 * @see #getPerformedDateTime()
	 * @generated
	 */
	void setPerformedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An area where general notes can be placed about this specific procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryProcedure_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // FamilyMemberHistoryProcedure
