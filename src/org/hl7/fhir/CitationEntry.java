/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Entry</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CitationEntry#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getForenameInitials <em>Forename Initials</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getContributionType <em>Contribution Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getContributionInstance <em>Contribution Instance</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getCorrespondingContact <em>Corresponding Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getRankingOrder <em>Ranking Order</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationEntry()
 * @model extendedMetaData="name='Citation.Entry' kind='elementOnly'"
 * @generated
 */
public interface CitationEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identity of the individual contributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference.
	 * @see #setContributor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_Contributor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContributor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getContributor <em>Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor</em>' containment reference.
	 * @see #getContributor()
	 * @generated
	 */
	void setContributor(Reference value);

	/**
	 * Returns the value of the '<em><b>Forename Initials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For citation styles that use initials.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forename Initials</em>' containment reference.
	 * @see #setForenameInitials(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_ForenameInitials()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='forenameInitials' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getForenameInitials();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getForenameInitials <em>Forename Initials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forename Initials</em>' containment reference.
	 * @see #getForenameInitials()
	 * @generated
	 */
	void setForenameInitials(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization affiliated with the contributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affiliation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_Affiliation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='affiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAffiliation();

	/**
	 * Returns the value of the '<em><b>Contribution Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element identifies the specific nature of an individual’s contribution with respect to the cited work.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contribution Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_ContributionType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributionType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getContributionType();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of the contributor (e.g. author, editor, reviewer, funder).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Contribution Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationContributionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contributions with accounting for time or number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contribution Instance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_ContributionInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributionInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationContributionInstance> getContributionInstance();

	/**
	 * Returns the value of the '<em><b>Corresponding Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the contributor is the corresponding contributor for the role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corresponding Contact</em>' containment reference.
	 * @see #setCorrespondingContact(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_CorrespondingContact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correspondingContact' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getCorrespondingContact();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getCorrespondingContact <em>Corresponding Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Contact</em>' containment reference.
	 * @see #getCorrespondingContact()
	 * @generated
	 */
	void setCorrespondingContact(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Ranking Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a numerical ranking to represent the degree of contributorship relative to other contributors, such as 1 for first author and 2 for second author.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ranking Order</em>' containment reference.
	 * @see #setRankingOrder(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_RankingOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rankingOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getRankingOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getRankingOrder <em>Ranking Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranking Order</em>' containment reference.
	 * @see #getRankingOrder()
	 * @generated
	 */
	void setRankingOrder(PositiveInt value);

} // CitationEntry
