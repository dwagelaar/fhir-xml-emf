/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Characterization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionCharacterization#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionCharacterization#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionCharacterization#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionCharacterization#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionCharacterization()
 * @model extendedMetaData="name='SubstanceDefinition.Characterization' kind='elementOnly'"
 * @generated
 */
public interface SubstanceDefinitionCharacterization extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Technique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method used to elucidate the characterization of the drug substance. Example: HPLC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technique</em>' containment reference.
	 * @see #setTechnique(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionCharacterization_Technique()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTechnique();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionCharacterization#getTechnique <em>Technique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technique</em>' containment reference.
	 * @see #getTechnique()
	 * @generated
	 */
	void setTechnique(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the nature of the chemical entity and explains, for instance, whether this is a base or a salt form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionCharacterization_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getForm();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionCharacterization#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description or justification in support of the interpretation of the data file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionCharacterization_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionCharacterization#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data produced by the analytical instrument or a pictorial representation of that data. Examples: a JCAMP, JDX, or ADX file, or a chromatogram or spectrum analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionCharacterization_File()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='file' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getFile();

} // SubstanceDefinitionCharacterization
