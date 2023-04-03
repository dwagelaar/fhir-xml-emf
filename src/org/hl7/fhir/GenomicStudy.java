/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genomic Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GenomicStudy is a set of analyses performed to analyze and generate genomic data.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.GenomicStudy#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGenomicStudy()
 * @model extendedMetaData="name='GenomicStudy' kind='elementOnly'"
 * @generated
 */
public interface GenomicStudy extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers for this genomic study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the genomic study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(GenomicStudyStatus)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	GenomicStudyStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudy#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GenomicStudyStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the study, e.g., Familial variant segregation, Functional variation detection, or Gene expression profiling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primary subject of the genomic study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudy#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare event with which this genomics study is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudy#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the genomic study was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' containment reference.
	 * @see #setStartDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_StartDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStartDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudy#getStartDate <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' containment reference.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Event resources that the genomic study is based on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Referrer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Healthcare professional who requested or referred the genomic study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referrer</em>' containment reference.
	 * @see #setReferrer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Referrer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referrer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferrer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudy#getReferrer <em>Referrer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referrer</em>' containment reference.
	 * @see #getReferrer()
	 * @generated
	 */
	void setReferrer(Reference value);

	/**
	 * Returns the value of the '<em><b>Interpreter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Healthcare professionals who interpreted the genomic study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpreter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Interpreter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interpreter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getInterpreter();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why the genomic study was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defined protocol that describes the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #setInstantiatesCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_InstantiatesCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getInstantiatesCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudy#getInstantiatesCanonical <em>Instantiates Canonical</em>}' containment reference.
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
	 * The URL pointing to an externally maintained protocol that describes the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #setInstantiatesUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_InstantiatesUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getInstantiatesUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudy#getInstantiatesUri <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #getInstantiatesUri()
	 * @generated
	 */
	void setInstantiatesUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments related to the genomic study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the genomic study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GenomicStudy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GenomicStudyAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details about a specific analysis that was performed in this GenomicStudy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGenomicStudy_Analysis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='analysis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenomicStudyAnalysis> getAnalysis();

} // GenomicStudy
