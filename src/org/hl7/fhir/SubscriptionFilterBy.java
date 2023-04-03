/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Filter By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubscriptionFilterBy#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionFilterBy#getFilterParameter <em>Filter Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionFilterBy#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionFilterBy#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionFilterBy#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubscriptionFilterBy()
 * @model extendedMetaData="name='Subscription.FilterBy' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionFilterBy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource listed in the `SubscriptionTopic` this `Subscription` references (`SubscriptionTopic.canFilterBy.resource`). This element can be used to differentiate filters for topics that include more than one resource type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' containment reference.
	 * @see #setResourceType(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionFilterBy_ResourceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceType' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getResourceType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionFilterBy#getResourceType <em>Resource Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' containment reference.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(Uri value);

	/**
	 * Returns the value of the '<em><b>Filter Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The filter as defined in the `SubscriptionTopic.canFilterBy.filterParameter` element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Parameter</em>' containment reference.
	 * @see #setFilterParameter(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionFilterBy_FilterParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filterParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getFilterParameter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionFilterBy#getFilterParameter <em>Filter Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Parameter</em>' containment reference.
	 * @see #getFilterParameter()
	 * @generated
	 */
	void setFilterParameter(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comparator applied to this filter parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparator</em>' containment reference.
	 * @see #setComparator(SearchComparator)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionFilterBy_Comparator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comparator' namespace='##targetNamespace'"
	 * @generated
	 */
	SearchComparator getComparator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionFilterBy#getComparator <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' containment reference.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(SearchComparator value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modifier applied to this filter parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(SearchModifierCode)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionFilterBy_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	SearchModifierCode getModifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionFilterBy#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(SearchModifierCode value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The literal value or resource path as is legal in search - for example, `Patient/123` or `le1950`.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionFilterBy_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionFilterBy#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.hl7.fhir.String value);

} // SubscriptionFilterBy
