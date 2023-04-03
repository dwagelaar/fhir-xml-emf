/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Example of workflow instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getKey <em>Key</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getStructureVersion <em>Structure Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getStructureProfileCanonical <em>Structure Profile Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getStructureProfileUri <em>Structure Profile Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getContainedInstance <em>Contained Instance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance()
 * @model extendedMetaData="name='ExampleScenario.Instance' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique string within the scenario that is used to reference the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_Key()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getKey();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Structure Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code indicating the kind of data structure (FHIR resource or some other standard) this is an instance of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure Type</em>' containment reference.
	 * @see #setStructureType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_StructureType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structureType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getStructureType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getStructureType <em>Structure Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Type</em>' containment reference.
	 * @see #getStructureType()
	 * @generated
	 */
	void setStructureType(Coding value);

	/**
	 * Returns the value of the '<em><b>Structure Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conveys the version of the data structure instantiated.  I.e. what release of FHIR, X12, OpenEHR, etc. is instance compliant with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure Version</em>' containment reference.
	 * @see #setStructureVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_StructureVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structureVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getStructureVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getStructureVersion <em>Structure Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Version</em>' containment reference.
	 * @see #getStructureVersion()
	 * @generated
	 */
	void setStructureVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Structure Profile Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Profile Canonical</em>' containment reference.
	 * @see #setStructureProfileCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_StructureProfileCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structureProfileCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getStructureProfileCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getStructureProfileCanonical <em>Structure Profile Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Profile Canonical</em>' containment reference.
	 * @see #getStructureProfileCanonical()
	 * @generated
	 */
	void setStructureProfileCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Structure Profile Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Profile Uri</em>' containment reference.
	 * @see #setStructureProfileUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_StructureProfileUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structureProfileUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getStructureProfileUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getStructureProfileUri <em>Structure Profile Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Profile Uri</em>' containment reference.
	 * @see #getStructureProfileUri()
	 * @generated
	 */
	void setStructureProfileUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short descriptive label the instance to be used in tables or diagrams.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation of what the instance contains and what it's for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to an instance (typically an example) that shows the data that would corespond to this instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Reference value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExampleScenarioVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the instance as it was at a specific time-point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleScenarioVersion> getVersion();

	/**
	 * Returns the value of the '<em><b>Contained Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExampleScenarioContainedInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References to other instances that can be found within this instance (e.g. the observations contained in a bundle).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Instance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_ContainedInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containedInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleScenarioContainedInstance> getContainedInstance();

} // ExampleScenarioInstance
