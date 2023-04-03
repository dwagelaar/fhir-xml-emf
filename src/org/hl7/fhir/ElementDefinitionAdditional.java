/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Additional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinitionAdditional#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionAdditional#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionAdditional#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionAdditional#getShortDoco <em>Short Doco</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionAdditional#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionAdditional#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinitionAdditional()
 * @model extendedMetaData="name='ElementDefinition.Additional' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinitionAdditional extends BackboneType {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of this additional binding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionAdditional_Purpose()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionAdditional#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(Code value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The valueSet that is being bound for the purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionAdditional_ValueSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionAdditional#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(Canonical value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation of the purpose of use of the bindingproviding additional information about how it is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionAdditional_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionAdditional#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Short Doco</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concise documentation - for summary tables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Doco</em>' containment reference.
	 * @see #setShortDoco(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionAdditional_ShortDoco()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shortDoco' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getShortDoco();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionAdditional#getShortDoco <em>Short Doco</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Doco</em>' containment reference.
	 * @see #getShortDoco()
	 * @generated
	 */
	void setShortDoco(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qualifies the usage of the binding. Typically bindings are qualified by jurisdiction, but they may also be qualified by gender, workflow status, clinical domain etc. The information to decide whether a usege context applies is usually outside the resource, determined by context, and this might present challenges for validation tooling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionAdditional_Usage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getUsage();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the binding applies to all repeats, or just to any one of them. This is only relevant for elements that can repeat.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' containment reference.
	 * @see #setAny(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionAdditional_Any()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='any' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAny();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionAdditional#getAny <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any</em>' containment reference.
	 * @see #getAny()
	 * @generated
	 */
	void setAny(org.hl7.fhir.Boolean value);

} // ElementDefinitionAdditional
