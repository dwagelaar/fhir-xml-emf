/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Relative</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MolecularSequenceRelative#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRelative#getOrdinalPosition <em>Ordinal Position</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRelative#getSequenceRange <em>Sequence Range</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRelative#getStartingSequence <em>Starting Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRelative#getEdit <em>Edit</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRelative()
 * @model extendedMetaData="name='MolecularSequence.Relative' kind='elementOnly'"
 * @generated
 */
public interface MolecularSequenceRelative extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are different ways of identifying nucleotides or amino acids within a sequence. Different databases and file types may use different systems. For detail definitions, see https://loinc.org/92822-6/ for more detail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate System</em>' containment reference.
	 * @see #setCoordinateSystem(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRelative_CoordinateSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coordinateSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCoordinateSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRelative#getCoordinateSystem <em>Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' containment reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	void setCoordinateSystem(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Ordinal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the order in which the sequence should be considered when putting multiple 'relative' elements together.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordinal Position</em>' containment reference.
	 * @see #setOrdinalPosition(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRelative_OrdinalPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ordinalPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getOrdinalPosition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRelative#getOrdinalPosition <em>Ordinal Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal Position</em>' containment reference.
	 * @see #getOrdinalPosition()
	 * @generated
	 */
	void setOrdinalPosition(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Sequence Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the nucleotide range in the composed sequence when multiple 'relative' elements are used together.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Range</em>' containment reference.
	 * @see #setSequenceRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRelative_SequenceRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getSequenceRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRelative#getSequenceRange <em>Sequence Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Range</em>' containment reference.
	 * @see #getSequenceRange()
	 * @generated
	 */
	void setSequenceRange(Range value);

	/**
	 * Returns the value of the '<em><b>Starting Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sequence that is used as a starting sequence to describe variants that are present in a sequence analyzed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Sequence</em>' containment reference.
	 * @see #setStartingSequence(MolecularSequenceStartingSequence)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRelative_StartingSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startingSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	MolecularSequenceStartingSequence getStartingSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRelative#getStartingSequence <em>Starting Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Sequence</em>' containment reference.
	 * @see #getStartingSequence()
	 * @generated
	 */
	void setStartingSequence(MolecularSequenceStartingSequence value);

	/**
	 * Returns the value of the '<em><b>Edit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MolecularSequenceEdit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Changes in sequence from the starting sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRelative_Edit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='edit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MolecularSequenceEdit> getEdit();

} // MolecularSequenceRelative
