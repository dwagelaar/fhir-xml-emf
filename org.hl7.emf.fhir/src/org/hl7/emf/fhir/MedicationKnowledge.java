/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a medication that is used to support knowledge.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getIntendedJurisdiction <em>Intended Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getRelatedMedicationKnowledge <em>Related Medication Knowledge</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getAssociatedMedication <em>Associated Medication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getProductType <em>Product Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getMonograph <em>Monograph</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getPreparationInstruction <em>Preparation Instruction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getCost <em>Cost</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getMonitoringProgram <em>Monitoring Program</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getIndicationGuideline <em>Indication Guideline</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getMedicineClassification <em>Medicine Classification</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getClinicalUseIssue <em>Clinical Use Issue</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getStorageGuideline <em>Storage Guideline</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getRegulatory <em>Regulatory</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicationKnowledge#getDefinitional <em>Definitional</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge()
 * @model extendedMetaData="name='MedicationKnowledge' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledge extends MetadataResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier for this medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that specifies this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledge#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code to indicate if the medication referred to by this MedicationKnowledge is in active use within the drug database or inventory system. The status refers to the validity about the information of the medication and not to its medicinal properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationKnowledgeStatusCodes)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationKnowledgeStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledge#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationKnowledgeStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The creator or owner of the knowledge or information about the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledge#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Intended Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists the jurisdictions that this medication knowledge was written for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Jurisdiction</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_IntendedJurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedJurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIntendedJurisdiction();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of the names for a medication, for example, the name(s) given to a medication in different countries.  For example, acetaminophen and paracetamol or salbutamol and albuterol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.emf.fhir.String> getName();

	/**
	 * Returns the value of the '<em><b>Related Medication Knowledge</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgeRelatedMedicationKnowledge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associated or related medications. For example, if the medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Medication Knowledge</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_RelatedMedicationKnowledge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedMedicationKnowledge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeRelatedMedicationKnowledge> getRelatedMedicationKnowledge();

	/**
	 * Returns the value of the '<em><b>Associated Medication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to associated medications that could be prescribed, dispensed or administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Medication</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_AssociatedMedication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associatedMedication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAssociatedMedication();

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Type</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_ProductType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getProductType();

	/**
	 * Returns the value of the '<em><b>Monograph</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgeMonograph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associated documentation about the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monograph</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Monograph()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monograph' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeMonograph> getMonograph();

	/**
	 * Returns the value of the '<em><b>Preparation Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instructions for preparing the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preparation Instruction</em>' containment reference.
	 * @see #setPreparationInstruction(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_PreparationInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preparationInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPreparationInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledge#getPreparationInstruction <em>Preparation Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparation Instruction</em>' containment reference.
	 * @see #getPreparationInstruction()
	 * @generated
	 */
	void setPreparationInstruction(Markdown value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgeCost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The price of the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Cost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cost' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeCost> getCost();

	/**
	 * Returns the value of the '<em><b>Monitoring Program</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgeMonitoringProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The program under which the medication is reviewed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitoring Program</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_MonitoringProgram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monitoringProgram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeMonitoringProgram> getMonitoringProgram();

	/**
	 * Returns the value of the '<em><b>Indication Guideline</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgeIndicationGuideline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Guidelines or protocols that are applicable for the administration of the medication based on indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication Guideline</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_IndicationGuideline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indicationGuideline' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeIndicationGuideline> getIndicationGuideline();

	/**
	 * Returns the value of the '<em><b>Medicine Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgeMedicineClassification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorization of the medication within a formulary or classification system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicine Classification</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_MedicineClassification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicineClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeMedicineClassification> getMedicineClassification();

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgePackaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information that only applies to packages (not products).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Packaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgePackaging> getPackaging();

	/**
	 * Returns the value of the '<em><b>Clinical Use Issue</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Use Issue</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_ClinicalUseIssue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinicalUseIssue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getClinicalUseIssue();

	/**
	 * Returns the value of the '<em><b>Storage Guideline</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgeStorageGuideline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on how the medication should be stored, for example, refrigeration temperatures and length of stability at a given temperature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Guideline</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_StorageGuideline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='storageGuideline' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeStorageGuideline> getStorageGuideline();

	/**
	 * Returns the value of the '<em><b>Regulatory</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicationKnowledgeRegulatory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulatory information about a medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulatory</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Regulatory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regulatory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeRegulatory> getRegulatory();

	/**
	 * Returns the value of the '<em><b>Definitional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Along with the link to a Medicinal Product Definition resource, this information provides common definitional elements that are needed to understand the specific medication that is being described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definitional</em>' containment reference.
	 * @see #setDefinitional(MedicationKnowledgeDefinitional)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicationKnowledge_Definitional()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitional' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationKnowledgeDefinitional getDefinitional();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicationKnowledge#getDefinitional <em>Definitional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitional</em>' containment reference.
	 * @see #getDefinitional()
	 * @generated
	 */
	void setDefinitional(MedicationKnowledgeDefinitional value);

} // MedicationKnowledge
