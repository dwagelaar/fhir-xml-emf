/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Cited Artifact</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getRelatedIdentifier <em>Related Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getDateAccessed <em>Date Accessed</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getPublicationForm <em>Publication Form</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getWebLocation <em>Web Location</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getContributorship <em>Contributorship</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationCitedArtifact#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact()
 * @model extendedMetaData="name='Citation.CitedArtifact' kind='elementOnly'"
 * @generated
 */
public interface CitationCitedArtifact extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify the cited artifact when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Related Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify things closely related to the cited artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_RelatedIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getRelatedIdentifier();

	/**
	 * Returns the value of the '<em><b>Date Accessed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the cited artifact was accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Accessed</em>' containment reference.
	 * @see #setDateAccessed(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_DateAccessed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateAccessed' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateAccessed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationCitedArtifact#getDateAccessed <em>Date Accessed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Accessed</em>' containment reference.
	 * @see #getDateAccessed()
	 * @generated
	 */
	void setDateAccessed(DateTime value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defined version of the cited artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(CitationVersion)
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationVersion getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationCitedArtifact#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(CitationVersion value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the cited artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current State</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_CurrentState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currentState' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCurrentState();

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationStatusDate1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An effective date or period, historical or future, actual or expected, for a status of the cited artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationStatusDate1> getStatusDate();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationTitle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title details of the article or artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationTitle> getTitle();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The abstract may be used to convey article-contained abstracts, externally-created abstracts, or other descriptive summaries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationAbstract> getAbstract();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component of the article or artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' containment reference.
	 * @see #setPart(CitationPart)
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_Part()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationPart getPart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationCitedArtifact#getPart <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' containment reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(CitationPart value);

	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationRelatesTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The artifact related to the cited artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relates To</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_RelatesTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationRelatesTo> getRelatesTo();

	/**
	 * Returns the value of the '<em><b>Publication Form</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationPublicationForm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If multiple, used to represent alternative forms of the article that are not separate citations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Form</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_PublicationForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publicationForm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationPublicationForm> getPublicationForm();

	/**
	 * Returns the value of the '<em><b>Web Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationWebLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for any URL for the article or artifact cited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Web Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_WebLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='webLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationWebLocation> getWebLocation();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationClassification1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assignment to an organizing scheme.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationClassification1> getClassification();

	/**
	 * Returns the value of the '<em><b>Contributorship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is used to list authors and other contributors, their contact information, specific contributions, and summary statements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributorship</em>' containment reference.
	 * @see #setContributorship(CitationContributorship)
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_Contributorship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributorship' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationContributorship getContributorship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationCitedArtifact#getContributorship <em>Contributorship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributorship</em>' containment reference.
	 * @see #getContributorship()
	 * @generated
	 */
	void setContributorship(CitationContributorship value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any additional information or content for the article or artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationCitedArtifact_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // CitationCitedArtifact
