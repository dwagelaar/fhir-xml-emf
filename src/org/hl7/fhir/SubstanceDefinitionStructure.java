/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Structure</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionStructure#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionStructure#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionStructure#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionStructure#getMolecularFormulaByMoiety <em>Molecular Formula By Moiety</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionStructure#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionStructure#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionStructure#getSourceDocument <em>Source Document</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionStructure#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionStructure()
 * @model extendedMetaData="name='SubstanceDefinition.Structure' kind='elementOnly'"
 * @generated
 */
public interface SubstanceDefinitionStructure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Stereochemistry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereochemistry type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stereochemistry</em>' containment reference.
	 * @see #setStereochemistry(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionStructure_Stereochemistry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stereochemistry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStereochemistry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionStructure#getStereochemistry <em>Stereochemistry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereochemistry</em>' containment reference.
	 * @see #getStereochemistry()
	 * @generated
	 */
	void setStereochemistry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Optical Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optical activity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optical Activity</em>' containment reference.
	 * @see #setOpticalActivity(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionStructure_OpticalActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='opticalActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOpticalActivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionStructure#getOpticalActivity <em>Optical Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optical Activity</em>' containment reference.
	 * @see #getOpticalActivity()
	 * @generated
	 */
	void setOpticalActivity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Molecular Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression which states the number and type of atoms present in a molecule of a substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #setMolecularFormula(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionStructure_MolecularFormula()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularFormula' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMolecularFormula();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionStructure#getMolecularFormula <em>Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #getMolecularFormula()
	 * @generated
	 */
	void setMolecularFormula(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Molecular Formula By Moiety</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical, each moiety separated by a dot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Formula By Moiety</em>' containment reference.
	 * @see #setMolecularFormulaByMoiety(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionStructure_MolecularFormulaByMoiety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularFormulaByMoiety' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMolecularFormulaByMoiety();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionStructure#getMolecularFormulaByMoiety <em>Molecular Formula By Moiety</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Formula By Moiety</em>' containment reference.
	 * @see #getMolecularFormulaByMoiety()
	 * @generated
	 */
	void setMolecularFormulaByMoiety(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #setMolecularWeight(SubstanceDefinitionMolecularWeight)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionStructure_MolecularWeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceDefinitionMolecularWeight getMolecularWeight();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionStructure#getMolecularWeight <em>Molecular Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(SubstanceDefinitionMolecularWeight value);

	/**
	 * Returns the value of the '<em><b>Technique</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method used to elucidate the structure of the drug substance. Examples: X-ray, NMR, Peptide mapping, Ligand binding assay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technique</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionStructure_Technique()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getTechnique();

	/**
	 * Returns the value of the '<em><b>Source Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source of information about the structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Document</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionStructure_SourceDocument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSourceDocument();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A depiction of the structure of the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionStructure_Representation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='representation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionRepresentation> getRepresentation();

} // SubstanceDefinitionStructure
