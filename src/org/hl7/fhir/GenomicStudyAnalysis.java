/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genomic Study Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GenomicStudy is a set of analyses performed to analyze and generate genomic data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getGenomeBuild <em>Genome Build</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getProtocolPerformed <em>Protocol Performed</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getRegionsStudied <em>Regions Studied</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getRegionsCalled <em>Regions Called</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getOutput <em>Output</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudyAnalysis#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis()
 * @model extendedMetaData="name='GenomicStudy.Analysis' kind='elementOnly'"
 * @generated
 */
public interface GenomicStudyAnalysis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers for the analysis event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of the methods used in the analysis, e.g., Fluorescence in situ hybridization (FISH), Karyotyping, or Microsatellite instability testing (MSI).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_MethodType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='methodType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getMethodType();

	/**
	 * Returns the value of the '<em><b>Change Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of the genomic changes studied in the analysis, e.g., DNA, RNA, or amino acid change.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_ChangeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getChangeType();

	/**
	 * Returns the value of the '<em><b>Genome Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference genome build that is used in this analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genome Build</em>' containment reference.
	 * @see #setGenomeBuild(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_GenomeBuild()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genomeBuild' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGenomeBuild();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudyAnalysis#getGenomeBuild <em>Genome Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genome Build</em>' containment reference.
	 * @see #getGenomeBuild()
	 * @generated
	 */
	void setGenomeBuild(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defined protocol that describes the analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #setInstantiatesCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_InstantiatesCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getInstantiatesCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudyAnalysis#getInstantiatesCanonical <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #getInstantiatesCanonical()
	 * @generated
	 */
	void setInstantiatesCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to an externally maintained protocol that describes the analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #setInstantiatesUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_InstantiatesUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getInstantiatesUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudyAnalysis#getInstantiatesUri <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #getInstantiatesUri()
	 * @generated
	 */
	void setInstantiatesUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the analysis event (human friendly).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudyAnalysis#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The focus of a genomic analysis when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, child, or sibling. For example, in trio testing, the GenomicStudy.subject would be the child (proband) and the GenomicStudy.analysis.focus of a specific analysis would be the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getFocus();

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specimen used in the analysis event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSpecimen();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of the analysis event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudyAnalysis#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any notes capture with the analysis event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Protocol Performed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol that was performed for the analysis event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Performed</em>' containment reference.
	 * @see #setProtocolPerformed(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_ProtocolPerformed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocolPerformed' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProtocolPerformed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudyAnalysis#getProtocolPerformed <em>Protocol Performed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Performed</em>' containment reference.
	 * @see #getProtocolPerformed()
	 * @generated
	 */
	void setProtocolPerformed(Reference value);

	/**
	 * Returns the value of the '<em><b>Regions Studied</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The genomic regions to be studied in the analysis (BED file).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regions Studied</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_RegionsStudied()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regionsStudied' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRegionsStudied();

	/**
	 * Returns the value of the '<em><b>Regions Called</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Genomic regions actually called in the analysis event (BED file).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regions Called</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_RegionsCalled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regionsCalled' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRegionsCalled();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GenomicStudyInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inputs for the analysis event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenomicStudyInput> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GenomicStudyOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outputs for the analysis event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenomicStudyOutput> getOutput();

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GenomicStudyPerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Performer for the analysis event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenomicStudyPerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GenomicStudyDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Devices used for the analysis (e.g., instruments, software), with settings and parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudyAnalysis_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenomicStudyDevice> getDevice();

} // GenomicStudyAnalysis
