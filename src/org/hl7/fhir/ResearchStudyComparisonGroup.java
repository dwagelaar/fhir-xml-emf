/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Study Comparison Group</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ResearchStudyComparisonGroup#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudyComparisonGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudyComparisonGroup#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudyComparisonGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudyComparisonGroup#getIntendedExposure <em>Intended Exposure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudyComparisonGroup#getObservedGroup <em>Observed Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getResearchStudyComparisonGroup()
 * @model extendedMetaData="name='ResearchStudy.ComparisonGroup' kind='elementOnly'"
 * @generated
 */
public interface ResearchStudyComparisonGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the comparisonGroup for the study and the comparisonGroup for the subject to be linked easily.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(Id)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyComparisonGroup_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudyComparisonGroup#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(Id value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique, human-readable label for this comparisonGroup of the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyComparisonGroup_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudyComparisonGroup#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorization of study comparisonGroup, e.g. experimental, active comparator, placebo comparater.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyComparisonGroup_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudyComparisonGroup#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A succinct description of the path through the study that would be followed by a subject adhering to this comparisonGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyComparisonGroup_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudyComparisonGroup#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Intended Exposure</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interventions or exposures in this comparisonGroup or cohort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Exposure</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyComparisonGroup_IntendedExposure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedExposure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getIntendedExposure();

	/**
	 * Returns the value of the '<em><b>Observed Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group of participants who were enrolled in study comparisonGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observed Group</em>' containment reference.
	 * @see #setObservedGroup(Reference)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyComparisonGroup_ObservedGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observedGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getObservedGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudyComparisonGroup#getObservedGroup <em>Observed Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Group</em>' containment reference.
	 * @see #getObservedGroup()
	 * @generated
	 */
	void setObservedGroup(Reference value);

} // ResearchStudyComparisonGroup
