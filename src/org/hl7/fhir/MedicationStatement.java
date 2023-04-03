/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. 
 * 
 * The primary difference between a medicationstatement and a medicationadministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medicationstatement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the Medication Statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
 * 
 * The MedicationStatement resource was previously called MedicationStatement.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getEffectiveTiming <em>Effective Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getRelatedClinicalInformation <em>Related Clinical Information</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getRenderedDosageInstruction <em>Rendered Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getAdherence <em>Adherence</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationStatement()
 * @model extendedMetaData="name='MedicationStatement' kind='elementOnly'"
 * @generated
 */
public interface MedicationStatement extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers associated with this Medication Statement that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger event of which this particular MedicationStatement is a component or step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code representing the status of recording the medication statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationStatementStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatementStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationStatementStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of medication statement (for example, drug classification like ATC, where meds would be administered, legal category of the medication.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Medication()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='medication' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getMedication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getMedication <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' containment reference.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person, animal or group who is/was taking the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getSubject <em>Subject</em>}' containment reference.
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
	 * The encounter that establishes the context for this MedicationStatement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #setEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_EffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getEffectiveDateTime <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	void setEffectiveDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Effective Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Timing</em>' containment reference.
	 * @see #setEffectiveTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_EffectiveTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getEffectiveTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getEffectiveTiming <em>Effective Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Timing</em>' containment reference.
	 * @see #getEffectiveTiming()
	 * @generated
	 */
	void setEffectiveTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Date Asserted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the Medication Statement was asserted by the information source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Asserted</em>' containment reference.
	 * @see #setDateAsserted(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_DateAsserted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateAsserted' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateAsserted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getDateAsserted <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Asserted</em>' containment reference.
	 * @see #getDateAsserted()
	 * @generated
	 */
	void setDateAsserted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or organization that provided the information about the taking of this medication. Note: Use derivedFrom when a MedicationStatement is derived from other resources, e.g. Claim or MedicationRequest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_InformationSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationSource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getInformationSource();

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is used to derive the MedicationStatement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concept, Condition or observation that supports why the medication is being/was taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides extra information about the Medication Statement that is not conveyed by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Related Clinical Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to information that is relevant to a medication statement, for example, illicit drug use, gestational age, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Clinical Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_RelatedClinicalInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedClinicalInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRelatedClinicalInformation();

	/**
	 * Returns the value of the '<em><b>Rendered Dosage Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendered Dosage Instruction</em>' containment reference.
	 * @see #setRenderedDosageInstruction(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_RenderedDosageInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='renderedDosageInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getRenderedDosageInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getRenderedDosageInstruction <em>Rendered Dosage Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendered Dosage Instruction</em>' containment reference.
	 * @see #getRenderedDosageInstruction()
	 * @generated
	 */
	void setRenderedDosageInstruction(Markdown value);

	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Dosage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the medication is/was or should be taken by the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Dosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Dosage> getDosage();

	/**
	 * Returns the value of the '<em><b>Adherence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the medication is or is not being consumed or administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adherence</em>' containment reference.
	 * @see #setAdherence(MedicationStatementAdherence)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Adherence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adherence' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatementAdherence getAdherence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getAdherence <em>Adherence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adherence</em>' containment reference.
	 * @see #getAdherence()
	 * @generated
	 */
	void setAdherence(MedicationStatementAdherence value);

} // MedicationStatement
