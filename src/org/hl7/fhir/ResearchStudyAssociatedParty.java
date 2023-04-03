/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Study Associated Party</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ResearchStudyAssociatedParty#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudyAssociatedParty#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudyAssociatedParty#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudyAssociatedParty#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudyAssociatedParty#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getResearchStudyAssociatedParty()
 * @model extendedMetaData="name='ResearchStudy.AssociatedParty' kind='elementOnly'"
 * @generated
 */
public interface ResearchStudyAssociatedParty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of associated party.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyAssociatedParty_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudyAssociatedParty#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyAssociatedParty_Role()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudyAssociatedParty#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Period}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the start date and the end date of the associated party in the role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyAssociatedParty_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Period> getPeriod();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A categorization other than role for the associated party.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyAssociatedParty_Classifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassifier();

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual or organization associated with study (use practitionerRole to specify their organisation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(Reference)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudyAssociatedParty_Party()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='party' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParty();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudyAssociatedParty#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Reference value);

} // ResearchStudyAssociatedParty
