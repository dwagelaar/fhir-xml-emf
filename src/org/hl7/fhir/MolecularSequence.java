/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of a molecular sequence.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getFormatted <em>Formatted</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequence#getRelative <em>Relative</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMolecularSequence()
 * @model extendedMetaData="name='MolecularSequence' kind='elementOnly'"
 * @generated
 */
public interface MolecularSequence extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this particular sequence instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SequenceType)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequence#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SequenceType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the subject this sequence is associated too.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequence#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual focus of a molecular sequence when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, child, or sibling. For example, in trio testing, the subject would be the child (proband) and the focus would be the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getFocus();

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen used for sequencing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSpecimen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequence#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Reference value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method for sequencing, for example, chip information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequence#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization or lab that should be responsible for this result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequence#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence that was observed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Literal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='literal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLiteral();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequence#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Formatted</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence that was observed as file content. Can be an actual file contents, or referenced by a URL to an external system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formatted</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Formatted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formatted' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getFormatted();

	/**
	 * Returns the value of the '<em><b>Relative</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MolecularSequenceRelative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sequence defined relative to another sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequence_Relative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relative' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MolecularSequenceRelative> getRelative();

} // MolecularSequence
