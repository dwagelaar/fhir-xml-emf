/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detected Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, gaps in care, etc.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getIdentifiedDateTime <em>Identified Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getIdentifiedPeriod <em>Identified Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getImplicated <em>Implicated</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.DetectedIssue#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDetectedIssue()
 * @model extendedMetaData="name='DetectedIssue' kind='elementOnly'"
 * @generated
 */
public interface DetectedIssue extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier associated with the detected issue record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Identifier()
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
	 * Indicates the status of the detected issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DetectedIssueStatus)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DetectedIssueStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DetectedIssueStatus value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that classifies the general type of detected issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the specific type of issue identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(DetectedIssueSeverity)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	DetectedIssueSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(DetectedIssueSeverity value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the subject whose record the detected issue is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getSubject <em>Subject</em>}' containment reference.
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
	 * The encounter during which this issue was detected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Identified Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identified Date Time</em>' containment reference.
	 * @see #setIdentifiedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_IdentifiedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifiedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getIdentifiedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getIdentifiedDateTime <em>Identified Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identified Date Time</em>' containment reference.
	 * @see #getIdentifiedDateTime()
	 * @generated
	 */
	void setIdentifiedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Identified Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identified Period</em>' containment reference.
	 * @see #setIdentifiedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_IdentifiedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifiedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getIdentifiedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getIdentifiedPeriod <em>Identified Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identified Period</em>' containment reference.
	 * @see #getIdentifiedPeriod()
	 * @generated
	 */
	void setIdentifiedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Implicated</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the resource representing the current activity or proposed activity that is potentially problematic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implicated</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Implicated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implicated' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getImplicated();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DetectedIssueEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a GuidanceResponse or MeasureReport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Evidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DetectedIssueEvidence> getEvidence();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual explanation of the detected issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(Markdown value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssue#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Uri value);

	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DetectedIssueMitigation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssue_Mitigation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mitigation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DetectedIssueMitigation> getMitigation();

} // DetectedIssue
