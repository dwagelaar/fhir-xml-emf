/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Name</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getOfficial <em>Official</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionName#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName()
 * @model extendedMetaData="name='SubstanceDefinition.Name' kind='elementOnly'"
 * @generated
 */
public interface SubstanceDefinitionName extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionName#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name type, for example 'systematic',  'scientific, 'brand'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionName#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the name, for example 'current', 'proposed'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionName#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Preferred</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is the preferred name for this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred</em>' containment reference.
	 * @see #setPreferred(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Preferred()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preferred' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getPreferred();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionName#getPreferred <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred</em>' containment reference.
	 * @see #getPreferred()
	 * @generated
	 */
	void setPreferred(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human language that the name is written in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getLanguage();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use context of this name for example if there is a different name a drug active ingredient as opposed to a food colour additive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getDomain();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The jurisdiction where this name applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdiction();

	/**
	 * Returns the value of the '<em><b>Synonym</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A synonym of this particular name, by which the substance is also known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synonym</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Synonym()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synonym' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionName> getSynonym();

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A translation for this name into another human language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionName> getTranslation();

	/**
	 * Returns the value of the '<em><b>Official</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionOfficial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of the official nature of this name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Official</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Official()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='official' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionOfficial> getOfficial();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting literature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinitionName_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

} // SubstanceDefinitionName
