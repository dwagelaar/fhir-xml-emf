/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Subject Progress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ResearchSubject is a participant or object which is the recipient of investigative activities in a research study.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ResearchSubjectProgress#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubjectProgress#getSubjectState <em>Subject State</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubjectProgress#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubjectProgress#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubjectProgress#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubjectProgress#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getResearchSubjectProgress()
 * @model extendedMetaData="name='ResearchSubject.Progress' kind='elementOnly'"
 * @generated
 */
public interface ResearchSubjectProgress extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the aspect of the subject's journey that the state refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubjectProgress_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubjectProgress#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject State</em>' containment reference.
	 * @see #setSubjectState(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubjectProgress_SubjectState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectState' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubjectState();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubjectProgress#getSubjectState <em>Subject State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject State</em>' containment reference.
	 * @see #getSubjectState()
	 * @generated
	 */
	void setSubjectState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The milestones the subject has passed through.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Milestone</em>' containment reference.
	 * @see #setMilestone(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubjectProgress_Milestone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='milestone' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMilestone();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubjectProgress#getMilestone <em>Milestone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestone</em>' containment reference.
	 * @see #getMilestone()
	 * @generated
	 */
	void setMilestone(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason for the state change.  If coded it should follow the formal subject state model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubjectProgress_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubjectProgress#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the new status started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' containment reference.
	 * @see #setStartDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubjectProgress_StartDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStartDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubjectProgress#getStartDate <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' containment reference.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the state ended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' containment reference.
	 * @see #setEndDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubjectProgress_EndDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEndDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubjectProgress#getEndDate <em>End Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' containment reference.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(DateTime value);

} // ResearchSubjectProgress
