/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of a molecular sequence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MolecularSequenceEdit#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceEdit#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceEdit#getReplacementSequence <em>Replacement Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceEdit#getReplacedSequence <em>Replaced Sequence</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceEdit()
 * @model extendedMetaData="name='MolecularSequence.Edit' kind='elementOnly'"
 * @generated
 */
public interface MolecularSequenceEdit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start position of the edit on the starting sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceEdit_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceEdit#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End position of the edit on the starting sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceEdit_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceEdit#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Replacement Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed sequence. When the sequence type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacement Sequence</em>' containment reference.
	 * @see #setReplacementSequence(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceEdit_ReplacementSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replacementSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReplacementSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceEdit#getReplacementSequence <em>Replacement Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Sequence</em>' containment reference.
	 * @see #getReplacementSequence()
	 * @generated
	 */
	void setReplacementSequence(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Replaced Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allele in the starting sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the starting sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaced Sequence</em>' containment reference.
	 * @see #setReplacedSequence(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceEdit_ReplacedSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replacedSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReplacedSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceEdit#getReplacedSequence <em>Replaced Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced Sequence</em>' containment reference.
	 * @see #getReplacedSequence()
	 * @generated
	 */
	void setReplacedSequence(org.hl7.fhir.String value);

} // MolecularSequenceEdit
