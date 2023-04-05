/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Contributorship</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.CitationContributorship#getComplete <em>Complete</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CitationContributorship#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CitationContributorship#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getCitationContributorship()
 * @model extendedMetaData="name='Citation.Contributorship' kind='elementOnly'"
 * @generated
 */
public interface CitationContributorship extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the list includes all authors and/or contributors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complete</em>' containment reference.
	 * @see #setComplete(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationContributorship_Complete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complete' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getComplete();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CitationContributorship#getComplete <em>Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' containment reference.
	 * @see #getComplete()
	 * @generated
	 */
	void setComplete(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CitationEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual entity named as a contributor, for example in the author list or contributor list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationContributorship_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationEntry> getEntry();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CitationSummary1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to record a display of the author/contributor list without separate data element for each list member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationContributorship_Summary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='summary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationSummary1> getSummary();

} // CitationContributorship
