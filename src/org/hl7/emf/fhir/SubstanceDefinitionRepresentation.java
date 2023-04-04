/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Representation</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRepresentation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRepresentation#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRepresentation#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstanceDefinitionRepresentation#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRepresentation()
 * @model extendedMetaData="name='SubstanceDefinition.Representation' kind='elementOnly'"
 * @generated
 */
public interface SubstanceDefinitionRepresentation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of structural representation (e.g. full, partial).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRepresentation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRepresentation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structural representation as a text string in a standard format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRepresentation_Representation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='representation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getRepresentation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRepresentation#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the representation e.g. InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF. The logical content type rather than the physical file format of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRepresentation_Format()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFormat();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRepresentation#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An attached file with the structural representation e.g. a molecular structure graphic of the substance, a JCAMP or AnIML file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstanceDefinitionRepresentation_Document()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='document' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDocument();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstanceDefinitionRepresentation#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Reference value);

} // SubstanceDefinitionRepresentation
