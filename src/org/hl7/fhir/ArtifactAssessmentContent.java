/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Assessment Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This Resource provides one or more comments, classifiers or ratings about a Resource and supports attribution and rights management metadata for the added content.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getInformationType <em>Information Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getFreeToShare <em>Free To Share</em>}</li>
 *   <li>{@link org.hl7.fhir.ArtifactAssessmentContent#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent()
 * @model extendedMetaData="name='ArtifactAssessment.Content' kind='elementOnly'"
 * @generated
 */
public interface ArtifactAssessmentContent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Information Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of information this component of the content represents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Type</em>' containment reference.
	 * @see #setInformationType(ArtifactAssessmentInformationType)
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_InformationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationType' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactAssessmentInformationType getInformationType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ArtifactAssessmentContent#getInformationType <em>Information Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Type</em>' containment reference.
	 * @see #getInformationType()
	 * @generated
	 */
	void setInformationType(ArtifactAssessmentInformationType value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief summary of the content of this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference.
	 * @see #setSummary(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_Summary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='summary' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getSummary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ArtifactAssessmentContent#getSummary <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' containment reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(Markdown value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what type of content this component represents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ArtifactAssessmentContent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a rating, classifier, or assessment of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_Classifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassifier();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A quantitative rating of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ArtifactAssessmentContent#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what authored the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ArtifactAssessmentContent#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URI that points to what the comment is about, such as a line of text in the CQL, or a specific element in a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_Path()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getPath();

	/**
	 * Returns the value of the '<em><b>Related Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional related artifacts that provide supporting documentation, additional evidence, or further information related to the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Artifact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_RelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifact();

	/**
	 * Returns the value of the '<em><b>Free To Share</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acceptable to publicly share the comment, classifier or rating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free To Share</em>' containment reference.
	 * @see #setFreeToShare(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_FreeToShare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='freeToShare' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getFreeToShare();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ArtifactAssessmentContent#getFreeToShare <em>Free To Share</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free To Share</em>' containment reference.
	 * @see #getFreeToShare()
	 * @generated
	 */
	void setFreeToShare(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ArtifactAssessmentContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the informationType is container, the components of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentContent_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArtifactAssessmentContent> getComponent();

} // ArtifactAssessmentContent
