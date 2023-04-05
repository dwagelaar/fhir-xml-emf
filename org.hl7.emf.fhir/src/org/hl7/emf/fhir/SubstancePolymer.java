/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Properties of a substance specific to it being a polymer.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymer#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymer#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymer#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymer#getCopolymerConnectivity <em>Copolymer Connectivity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymer#getModification <em>Modification</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymer#getMonomerSet <em>Monomer Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymer#getRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymer()
 * @model extendedMetaData="name='SubstancePolymer' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymer extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A business idenfier for this polymer, but typically this is handled by a SubstanceDefinition identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymer_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstancePolymer#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Overall type of the polymer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymer_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClass_();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstancePolymer#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Polymer geometry, e.g. linear, branched, cross-linked, network or dendritic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymer_Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGeometry();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstancePolymer#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Copolymer Connectivity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descrtibes the copolymer sequence type (polymer connectivity).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copolymer Connectivity</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymer_CopolymerConnectivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copolymerConnectivity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCopolymerConnectivity();

	/**
	 * Returns the value of the '<em><b>Modification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo - this is intended to connect to a repeating full modification structure, also used by Protein and Nucleic Acid . String is just a placeholder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modification</em>' containment reference.
	 * @see #setModification(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymer_Modification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modification' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getModification();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstancePolymer#getModification <em>Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification</em>' containment reference.
	 * @see #getModification()
	 * @generated
	 */
	void setModification(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Monomer Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubstancePolymerMonomerSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monomer Set</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymer_MonomerSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monomerSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerMonomerSet> getMonomerSet();

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubstancePolymerRepeat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies and quantifies the repeated units and their configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymer_Repeat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerRepeat> getRepeat();

} // SubstancePolymer
