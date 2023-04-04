/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Report Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EvidenceReport Resource is a specialized container for a collection of resources and codeable concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation resources and related concepts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getFocusReference <em>Focus Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getEntryClassifier <em>Entry Classifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getEntryReference <em>Entry Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getEntryQuantity <em>Entry Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getEmptyReason <em>Empty Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceReportSection#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection()
 * @model extendedMetaData="name='EvidenceReport.Section' kind='elementOnly'"
 * @generated
 */
public interface EvidenceReportSection extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceReportSection#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code identifying the kind of content contained within the section. This should be consistent with the section title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFocus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceReportSection#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Focus Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definitional Resource identifying the kind of content contained within the section. This should be consistent with the section title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus Reference</em>' containment reference.
	 * @see #setFocusReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_FocusReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focusReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFocusReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceReportSection#getFocusReference <em>Focus Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus Reference</em>' containment reference.
	 * @see #getFocusReference()
	 * @generated
	 */
	void setFocusReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies who is responsible for the information in this section, not necessarily who typed it in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthor();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is peferred to contain sufficient detail to make it acceptable for a human to just read the narrative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Narrative)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	Narrative getText();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceReportSection#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Narrative value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(ListMode)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_Mode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ListMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceReportSection#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ListMode value);

	/**
	 * Returns the value of the '<em><b>Ordered By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the order applied to the items in the section entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered By</em>' containment reference.
	 * @see #setOrderedBy(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_OrderedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOrderedBy();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceReportSection#getOrderedBy <em>Ordered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered By</em>' containment reference.
	 * @see #getOrderedBy()
	 * @generated
	 */
	void setOrderedBy(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Entry Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies any type of classification of the evidence report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Classifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_EntryClassifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entryClassifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getEntryClassifier();

	/**
	 * Returns the value of the '<em><b>Entry Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the actual resource from which the narrative in the section is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Reference</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_EntryReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entryReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEntryReference();

	/**
	 * Returns the value of the '<em><b>Entry Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity as content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Quantity</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_EntryQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entryQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getEntryQuantity();

	/**
	 * Returns the value of the '<em><b>Empty Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Empty Reason</em>' containment reference.
	 * @see #setEmptyReason(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_EmptyReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='emptyReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getEmptyReason();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceReportSection#getEmptyReason <em>Empty Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Reason</em>' containment reference.
	 * @see #getEmptyReason()
	 * @generated
	 */
	void setEmptyReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.EvidenceReportSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A nested sub-section within this section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceReportSection_Section()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceReportSection> getSection();

} // EvidenceReportSection
