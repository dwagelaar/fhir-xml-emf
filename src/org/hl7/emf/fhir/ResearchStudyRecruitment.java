/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Study Recruitment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A scientific study of nature that sometimes includes processes involved in health and disease. For example, clinical trials are research studies that involve people. These studies may be related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes and certain groups of people by looking at data collected in the past or future.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ResearchStudyRecruitment#getTargetNumber <em>Target Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchStudyRecruitment#getActualNumber <em>Actual Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchStudyRecruitment#getEligibility <em>Eligibility</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchStudyRecruitment#getActualGroup <em>Actual Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getResearchStudyRecruitment()
 * @model extendedMetaData="name='ResearchStudy.Recruitment' kind='elementOnly'"
 * @generated
 */
public interface ResearchStudyRecruitment extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Target Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated total number of participants to be enrolled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Number</em>' containment reference.
	 * @see #setTargetNumber(UnsignedInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchStudyRecruitment_TargetNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getTargetNumber();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchStudyRecruitment#getTargetNumber <em>Target Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Number</em>' containment reference.
	 * @see #getTargetNumber()
	 * @generated
	 */
	void setTargetNumber(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Actual Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual total number of participants enrolled in study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Number</em>' containment reference.
	 * @see #setActualNumber(UnsignedInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchStudyRecruitment_ActualNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actualNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getActualNumber();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchStudyRecruitment#getActualNumber <em>Actual Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Number</em>' containment reference.
	 * @see #getActualNumber()
	 * @generated
	 */
	void setActualNumber(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Eligibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inclusion and exclusion criteria.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eligibility</em>' containment reference.
	 * @see #setEligibility(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchStudyRecruitment_Eligibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eligibility' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEligibility();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchStudyRecruitment#getEligibility <em>Eligibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligibility</em>' containment reference.
	 * @see #getEligibility()
	 * @generated
	 */
	void setEligibility(Reference value);

	/**
	 * Returns the value of the '<em><b>Actual Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group of participants who were enrolled in study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Group</em>' containment reference.
	 * @see #setActualGroup(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchStudyRecruitment_ActualGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actualGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActualGroup();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchStudyRecruitment#getActualGroup <em>Actual Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Group</em>' containment reference.
	 * @see #getActualGroup()
	 * @generated
	 */
	void setActualGroup(Reference value);

} // ResearchStudyRecruitment
