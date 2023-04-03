/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Starting Sequence</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MolecularSequenceStartingSequence#getGenomeAssembly <em>Genome Assembly</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStartingSequence#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStartingSequence#getSequenceCodeableConcept <em>Sequence Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStartingSequence#getSequenceString <em>Sequence String</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStartingSequence#getSequenceReference <em>Sequence Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStartingSequence#getWindowStart <em>Window Start</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStartingSequence#getWindowEnd <em>Window End</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStartingSequence#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStartingSequence#getStrand <em>Strand</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence()
 * @model extendedMetaData="name='MolecularSequence.StartingSequence' kind='elementOnly'"
 * @generated
 */
public interface MolecularSequenceStartingSequence extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Genome Assembly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The genome assembly used for starting sequence, e.g. GRCh38.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genome Assembly</em>' containment reference.
	 * @see #setGenomeAssembly(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence_GenomeAssembly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genomeAssembly' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGenomeAssembly();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStartingSequence#getGenomeAssembly <em>Genome Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genome Assembly</em>' containment reference.
	 * @see #getGenomeAssembly()
	 * @generated
	 */
	void setGenomeAssembly(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Chromosome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chromosome</em>' containment reference.
	 * @see #setChromosome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence_Chromosome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chromosome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getChromosome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStartingSequence#getChromosome <em>Chromosome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chromosome</em>' containment reference.
	 * @see #getChromosome()
	 * @generated
	 */
	void setChromosome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sequence Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Codeable Concept</em>' containment reference.
	 * @see #setSequenceCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence_SequenceCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSequenceCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStartingSequence#getSequenceCodeableConcept <em>Sequence Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Codeable Concept</em>' containment reference.
	 * @see #getSequenceCodeableConcept()
	 * @generated
	 */
	void setSequenceCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sequence String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence String</em>' containment reference.
	 * @see #setSequenceString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence_SequenceString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSequenceString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStartingSequence#getSequenceString <em>Sequence String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence String</em>' containment reference.
	 * @see #getSequenceString()
	 * @generated
	 */
	void setSequenceString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sequence Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Reference</em>' containment reference.
	 * @see #setSequenceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence_SequenceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSequenceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStartingSequence#getSequenceReference <em>Sequence Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Reference</em>' containment reference.
	 * @see #getSequenceReference()
	 * @generated
	 */
	void setSequenceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Window Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start position of the window on the starting sequence. This value should honor the rules of the coordinateSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Window Start</em>' containment reference.
	 * @see #setWindowStart(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence_WindowStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='windowStart' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getWindowStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStartingSequence#getWindowStart <em>Window Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Start</em>' containment reference.
	 * @see #getWindowStart()
	 * @generated
	 */
	void setWindowStart(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Window End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End position of the window on the starting sequence. This value should honor the rules of the  coordinateSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Window End</em>' containment reference.
	 * @see #setWindowEnd(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence_WindowEnd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='windowEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getWindowEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStartingSequence#getWindowEnd <em>Window End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window End</em>' containment reference.
	 * @see #getWindowEnd()
	 * @generated
	 */
	void setWindowEnd(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the "sense" strand, and the opposite complementary strand is the "antisense" strand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStartingSequence#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Returns the value of the '<em><b>Strand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strand</em>' containment reference.
	 * @see #setStrand(StrandType)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStartingSequence_Strand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strand' namespace='##targetNamespace'"
	 * @generated
	 */
	StrandType getStrand();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStartingSequence#getStrand <em>Strand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strand</em>' containment reference.
	 * @see #getStrand()
	 * @generated
	 */
	void setStrand(StrandType value);

} // MolecularSequenceStartingSequence
