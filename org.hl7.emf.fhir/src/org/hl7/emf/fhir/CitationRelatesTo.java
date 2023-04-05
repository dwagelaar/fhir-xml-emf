/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Relates To</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.CitationRelatesTo#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CitationRelatesTo#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CitationRelatesTo#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CitationRelatesTo#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CitationRelatesTo#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CitationRelatesTo#getDocument <em>Document</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CitationRelatesTo#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.CitationRelatesTo#getResourceReference <em>Resource Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getCitationRelatesTo()
 * @model extendedMetaData="name='Citation.RelatesTo' kind='elementOnly'"
 * @generated
 */
public interface CitationRelatesTo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relationship to the related artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(RelatedArtifactTypeExpanded)
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationRelatesTo_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedArtifactTypeExpanded getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CitationRelatesTo#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RelatedArtifactTypeExpanded value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional classifiers of the related artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationRelatesTo_Classifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassifier();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short label that can be used to reference the related artifact from elsewhere in the containing artifact, such as a footnote index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationRelatesTo_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getLabel();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CitationRelatesTo#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationRelatesTo_Display()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CitationRelatesTo#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationRelatesTo_Citation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citation' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCitation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CitationRelatesTo#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document being referenced, represented as an attachment. Do not use this element if using the resource element to provide the canonical to the related artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(Attachment)
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationRelatesTo_Document()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='document' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getDocument();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CitationRelatesTo#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Attachment value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The related artifact, such as a library, value set, profile, or other knowledge resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationRelatesTo_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getResource();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CitationRelatesTo#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Canonical value);

	/**
	 * Returns the value of the '<em><b>Resource Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The related artifact, if the artifact is not a canonical resource, or a resource reference to a canonical resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Reference</em>' containment reference.
	 * @see #setResourceReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getCitationRelatesTo_ResourceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResourceReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.CitationRelatesTo#getResourceReference <em>Resource Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Reference</em>' containment reference.
	 * @see #getResourceReference()
	 * @generated
	 */
	void setResourceReference(Reference value);

} // CitationRelatesTo
