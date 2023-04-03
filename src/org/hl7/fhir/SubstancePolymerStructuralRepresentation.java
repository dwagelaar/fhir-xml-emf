/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Structural Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Properties of a substance specific to it being a polymer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstancePolymerStructuralRepresentation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerStructuralRepresentation#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerStructuralRepresentation#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerStructuralRepresentation#getAttachment <em>Attachment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStructuralRepresentation()
 * @model extendedMetaData="name='SubstancePolymer.StructuralRepresentation' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymerStructuralRepresentation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of structure (e.g. Full, Partial, Representative).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStructuralRepresentation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerStructuralRepresentation#getType <em>Type</em>}' containment reference.
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
	 * The structural representation as text string in a standard format e.g. InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStructuralRepresentation_Representation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='representation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRepresentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerStructuralRepresentation#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the representation e.g. InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStructuralRepresentation_Format()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFormat();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerStructuralRepresentation#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An attached file with the structural representation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStructuralRepresentation_Attachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerStructuralRepresentation#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(Attachment value);

} // SubstancePolymerStructuralRepresentation
