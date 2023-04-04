/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This Resource provides one or more comments, classifiers or ratings about a Resource and supports attribution and rights management metadata for the added content.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getCiteAsReference <em>Cite As Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getCiteAsMarkdown <em>Cite As Markdown</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getArtifactReference <em>Artifact Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getArtifactCanonical <em>Artifact Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getArtifactUri <em>Artifact Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getWorkflowStatus <em>Workflow Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ArtifactAssessment#getDisposition <em>Disposition</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment()
 * @model extendedMetaData="name='ArtifactAssessment' kind='elementOnly'"
 * @generated
 */
public interface ArtifactAssessment extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify this artifact assessment when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short title for the assessment for use in displaying and selecting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Cite As Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite As Reference</em>' containment reference.
	 * @see #setCiteAsReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_CiteAsReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citeAsReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCiteAsReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getCiteAsReference <em>Cite As Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite As Reference</em>' containment reference.
	 * @see #getCiteAsReference()
	 * @generated
	 */
	void setCiteAsReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Cite As Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite As Markdown</em>' containment reference.
	 * @see #setCiteAsMarkdown(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_CiteAsMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citeAsMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCiteAsMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getCiteAsMarkdown <em>Cite As Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite As Markdown</em>' containment reference.
	 * @see #getCiteAsMarkdown()
	 * @generated
	 */
	void setCiteAsMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date  (and optionally time) when the artifact assessment was published. The date must change when the disposition changes and it must change if the workflow status code changes. In addition, it should change when the substantive content of the artifact assessment changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright statement relating to the artifact assessment and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the artifact assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

	/**
	 * Returns the value of the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Date</em>' containment reference.
	 * @see #setApprovalDate(Date)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_ApprovalDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approvalDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getApprovalDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getApprovalDate <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Date</em>' containment reference.
	 * @see #getApprovalDate()
	 * @generated
	 */
	void setApprovalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Review Date</em>' containment reference.
	 * @see #setLastReviewDate(Date)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_LastReviewDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastReviewDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastReviewDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getLastReviewDate <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Review Date</em>' containment reference.
	 * @see #getLastReviewDate()
	 * @generated
	 */
	void setLastReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Artifact Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Reference</em>' containment reference.
	 * @see #setArtifactReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_ArtifactReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='artifactReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getArtifactReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getArtifactReference <em>Artifact Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Reference</em>' containment reference.
	 * @see #getArtifactReference()
	 * @generated
	 */
	void setArtifactReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Artifact Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Canonical</em>' containment reference.
	 * @see #setArtifactCanonical(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_ArtifactCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='artifactCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getArtifactCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getArtifactCanonical <em>Artifact Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Canonical</em>' containment reference.
	 * @see #getArtifactCanonical()
	 * @generated
	 */
	void setArtifactCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Artifact Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Uri</em>' containment reference.
	 * @see #setArtifactUri(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_ArtifactUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='artifactUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getArtifactUri();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getArtifactUri <em>Artifact Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Uri</em>' containment reference.
	 * @see #getArtifactUri()
	 * @generated
	 */
	void setArtifactUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ArtifactAssessmentContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component comment, classifier, or rating of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArtifactAssessmentContent> getContent();

	/**
	 * Returns the value of the '<em><b>Workflow Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the workflow status of the comment or change request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workflow Status</em>' containment reference.
	 * @see #setWorkflowStatus(ArtifactAssessmentWorkflowStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_WorkflowStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='workflowStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactAssessmentWorkflowStatus getWorkflowStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getWorkflowStatus <em>Workflow Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Status</em>' containment reference.
	 * @see #getWorkflowStatus()
	 * @generated
	 */
	void setWorkflowStatus(ArtifactAssessmentWorkflowStatus value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the disposition of the responsible party to the comment or change request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(ArtifactAssessmentDisposition)
	 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessment_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactAssessmentDisposition getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ArtifactAssessment#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(ArtifactAssessmentDisposition value);

} // ArtifactAssessment
