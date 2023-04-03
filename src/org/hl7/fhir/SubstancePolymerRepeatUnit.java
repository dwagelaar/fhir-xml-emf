/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Repeat Unit</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getDegreeOfPolymerisation <em>Degree Of Polymerisation</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getStructuralRepresentation <em>Structural Representation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit()
 * @model extendedMetaData="name='SubstancePolymer.RepeatUnit' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymerRepeatUnit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural repeat units are essential elements for defining polymers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The orientation of the polymerisation, e.g. head-tail, head-head, random.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOrientation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of repeats of this unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Degree Of Polymerisation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies to homopolymer and block co-polymers where the degree of polymerisation within a block can be described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Degree Of Polymerisation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_DegreeOfPolymerisation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='degreeOfPolymerisation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerDegreeOfPolymerisation> getDegreeOfPolymerisation();

	/**
	 * Returns the value of the '<em><b>Structural Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerStructuralRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A graphical structure for this SRU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Representation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_StructuralRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerStructuralRepresentation> getStructuralRepresentation();

} // SubstancePolymerRepeatUnit
