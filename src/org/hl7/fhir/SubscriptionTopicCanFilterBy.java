/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Topic Can Filter By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a stream of resource state changes or events and annotated with labels useful to filter projections from this topic.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getFilterParameter <em>Filter Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getFilterDefinition <em>Filter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicCanFilterBy()
 * @model extendedMetaData="name='SubscriptionTopic.CanFilterBy' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionTopicCanFilterBy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of how this filtering parameter is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicCanFilterBy_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL of the Resource that is the type used in this filter. This is the "focus" of the topic (or one of them if there are more than one). It will be the same, a generality, or a specificity of SubscriptionTopic.resourceTrigger.resource or SubscriptionTopic.eventTrigger.resource when they are present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicCanFilterBy_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getResource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Uri value);

	/**
	 * Returns the value of the '<em><b>Filter Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either the canonical URL to a search parameter (like "http://hl7.org/fhir/SearchParameter/encounter-patient") or topic-defined parameter (like "hub.event") which is a label for the filter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Parameter</em>' containment reference.
	 * @see #setFilterParameter(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicCanFilterBy_FilterParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filterParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getFilterParameter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getFilterParameter <em>Filter Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Parameter</em>' containment reference.
	 * @see #getFilterParameter()
	 * @generated
	 */
	void setFilterParameter(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Filter Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either the canonical URL to a search parameter (like "http://hl7.org/fhir/SearchParameter/encounter-patient") or the officially-defined URI for a shared filter concept (like "http://example.org/concepts/shared-common-event").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Definition</em>' containment reference.
	 * @see #setFilterDefinition(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicCanFilterBy_FilterDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filterDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getFilterDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicCanFilterBy#getFilterDefinition <em>Filter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Definition</em>' containment reference.
	 * @see #getFilterDefinition()
	 * @generated
	 */
	void setFilterDefinition(Uri value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SearchComparator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comparators allowed for the filter parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparator</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicCanFilterBy_Comparator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comparator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SearchComparator> getComparator();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SearchModifierCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modifiers allowed for the filter parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicCanFilterBy_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SearchModifierCode> getModifier();

} // SubscriptionTopicCanFilterBy
