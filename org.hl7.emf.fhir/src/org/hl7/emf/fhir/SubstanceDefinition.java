/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getMoiety <em>Moiety</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getCharacterization <em>Characterization</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getReferenceInformation <em>Reference Information</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getNucleicAcid <em>Nucleic Acid</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getPolymer <em>Polymer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getProtein <em>Protein</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinition#getSourceMaterial <em>Source Material</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition()
 * @model extendedMetaData="name='SubstanceDefinition' kind='elementOnly'"
 * @generated
 */
public interface SubstanceDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier by which this substance is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A business level version identifier of the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of substance within the catalogue e.g. active, retired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A high level categorization, e.g. polymer or nucleic acid, or food, chemical, biological, or a lower level such as the general types of polymer (linear or branch chain) or type of impurity (process related or contaminant).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassification();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the substance applies to human or veterinary use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDomain();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quality standard, established benchmark, to which substance complies (e.g. USP/NF, Ph. Eur, JP, BP, Company Standard).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grade</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Grade()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grade' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getGrade();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description of the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting literature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Source</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_InformationSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationSource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getInformationSource();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual comment about the substance's catalogue or registry record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity that creates, makes, produces or fabricates the substance. This is a set of potential manufacturers but is not necessarily comprehensive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that is the source for the substance. It may be different from the manufacturer. Supplier is synonymous to a distributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Supplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupplier();

	/**
	 * Returns the value of the '<em><b>Moiety</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubstanceDefinitionMoiety}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moiety, for structural modifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moiety</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Moiety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moiety' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionMoiety> getMoiety();

	/**
	 * Returns the value of the '<em><b>Characterization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubstanceDefinitionCharacterization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General specifications for this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characterization</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Characterization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characterization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionCharacterization> getCharacterization();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubstanceDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General specifications for this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Reference Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General information detailing this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Information</em>' containment reference.
	 * @see #setReferenceInformation(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_ReferenceInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferenceInformation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getReferenceInformation <em>Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Information</em>' containment reference.
	 * @see #getReferenceInformation()
	 * @generated
	 */
	void setReferenceInformation(Reference value);

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubstanceDefinitionMolecularWeight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average mass of a molecule of a compound compared to 1/12 the mass of carbon 12 and calculated as the sum of the atomic weights of the constituent atoms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_MolecularWeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionMolecularWeight> getMolecularWeight();

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(SubstanceDefinitionStructure)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceDefinitionStructure getStructure();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(SubstanceDefinitionStructure value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubstanceDefinitionCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes associated with the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionCode> getCode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubstanceDefinitionName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names applicable to this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionName> getName();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubstanceDefinitionRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link between this substance and another, with details of the relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionRelationship> getRelationship();

	/**
	 * Returns the value of the '<em><b>Nucleic Acid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data items specific to nucleic acids.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nucleic Acid</em>' containment reference.
	 * @see #setNucleicAcid(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_NucleicAcid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nucleicAcid' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getNucleicAcid();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getNucleicAcid <em>Nucleic Acid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nucleic Acid</em>' containment reference.
	 * @see #getNucleicAcid()
	 * @generated
	 */
	void setNucleicAcid(Reference value);

	/**
	 * Returns the value of the '<em><b>Polymer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data items specific to polymers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polymer</em>' containment reference.
	 * @see #setPolymer(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Polymer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='polymer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPolymer();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getPolymer <em>Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polymer</em>' containment reference.
	 * @see #getPolymer()
	 * @generated
	 */
	void setPolymer(Reference value);

	/**
	 * Returns the value of the '<em><b>Protein</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data items specific to proteins.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protein</em>' containment reference.
	 * @see #setProtein(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_Protein()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protein' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProtein();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getProtein <em>Protein</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protein</em>' containment reference.
	 * @see #getProtein()
	 * @generated
	 */
	void setProtein(Reference value);

	/**
	 * Returns the value of the '<em><b>Source Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material or taxonomic/anatomical source for the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Material</em>' containment reference.
	 * @see #setSourceMaterial(SubstanceDefinitionSourceMaterial)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinition_SourceMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceDefinitionSourceMaterial getSourceMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinition#getSourceMaterial <em>Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material</em>' containment reference.
	 * @see #getSourceMaterial()
	 * @generated
	 */
	void setSourceMaterial(SubstanceDefinitionSourceMaterial value);

} // SubstanceDefinition
