/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ResearchSubject is a participant or object which is the recipient of investigative activities in a research study.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ResearchSubject#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchSubject#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchSubject#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchSubject#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchSubject#getStudy <em>Study</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchSubject#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchSubject#getAssignedComparisonGroup <em>Assigned Comparison Group</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchSubject#getActualComparisonGroup <em>Actual Comparison Group</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ResearchSubject#getConsent <em>Consent</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject()
 * @model extendedMetaData="name='ResearchSubject' kind='elementOnly'"
 * @generated
 */
public interface ResearchSubject extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this research subject for a study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The publication state of the resource (not of the subject).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchSubject#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ResearchSubjectProgress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state (status) of the subject and resons for status change where appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject_Progress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='progress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResearchSubjectProgress> getProgress();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dates the subject began and ended their participation in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchSubject#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the study the subject is participating in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study</em>' containment reference.
	 * @see #setStudy(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject_Study()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='study' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getStudy();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchSubject#getStudy <em>Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study</em>' containment reference.
	 * @see #getStudy()
	 * @generated
	 */
	void setStudy(Reference value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The record of the person, animal or other entity involved in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchSubject#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Assigned Comparison Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the arm in the study the subject is expected to follow as part of this study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned Comparison Group</em>' containment reference.
	 * @see #setAssignedComparisonGroup(Id)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject_AssignedComparisonGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assignedComparisonGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getAssignedComparisonGroup();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchSubject#getAssignedComparisonGroup <em>Assigned Comparison Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Comparison Group</em>' containment reference.
	 * @see #getAssignedComparisonGroup()
	 * @generated
	 */
	void setAssignedComparisonGroup(Id value);

	/**
	 * Returns the value of the '<em><b>Actual Comparison Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the arm in the study the subject actually followed as part of this study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Comparison Group</em>' containment reference.
	 * @see #setActualComparisonGroup(Id)
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject_ActualComparisonGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actualComparisonGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getActualComparisonGroup();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ResearchSubject#getActualComparisonGroup <em>Actual Comparison Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Comparison Group</em>' containment reference.
	 * @see #getActualComparisonGroup()
	 * @generated
	 */
	void setActualComparisonGroup(Id value);

	/**
	 * Returns the value of the '<em><b>Consent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of the patient's informed agreement to participate in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consent</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getResearchSubject_Consent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getConsent();

} // ResearchSubject
