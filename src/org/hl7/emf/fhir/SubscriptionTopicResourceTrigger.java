/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Topic Resource Trigger</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger#getSupportedInteraction <em>Supported Interaction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger#getQueryCriteria <em>Query Criteria</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger#getFhirPathCriteria <em>Fhir Path Criteria</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopicResourceTrigger()
 * @model extendedMetaData="name='SubscriptionTopic.ResourceTrigger' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionTopicResourceTrigger extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The human readable description of this resource trigger for the SubscriptionTopic -  for example, "An Encounter enters the 'in-progress' state".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopicResourceTrigger_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger#getDescription <em>Description</em>}' containment reference.
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
	 * URL of the Resource that is the type used in this resource trigger.  Relative URLs are relative to the StructureDefinition root of the implemented FHIR version (e.g., http://hl7.org/fhir/StructureDefinition). For example, "Patient" maps to http://hl7.org/fhir/StructureDefinition/Patient.  For more information, see <a href="elementdefinition-definitions.html#ElementDefinition.type.code">ElementDefinition.type.code</a>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopicResourceTrigger_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getResource();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Uri value);

	/**
	 * Returns the value of the '<em><b>Supported Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.InteractionTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FHIR RESTful interaction which can be used to trigger a notification for the SubscriptionTopic. Multiple values are considered OR joined (e.g., CREATE or UPDATE). If not present, all supported interactions are assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Interaction</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopicResourceTrigger_SupportedInteraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedInteraction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InteractionTrigger> getSupportedInteraction();

	/**
	 * Returns the value of the '<em><b>Query Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FHIR query based rules that the server should use to determine when to trigger a notification for this subscription topic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Criteria</em>' containment reference.
	 * @see #setQueryCriteria(SubscriptionTopicQueryCriteria)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopicResourceTrigger_QueryCriteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionTopicQueryCriteria getQueryCriteria();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger#getQueryCriteria <em>Query Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Criteria</em>' containment reference.
	 * @see #getQueryCriteria()
	 * @generated
	 */
	void setQueryCriteria(SubscriptionTopicQueryCriteria value);

	/**
	 * Returns the value of the '<em><b>Fhir Path Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FHIRPath based rules that the server should use to determine when to trigger a notification for this topic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Path Criteria</em>' containment reference.
	 * @see #setFhirPathCriteria(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionTopicResourceTrigger_FhirPathCriteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fhirPathCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getFhirPathCriteria();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubscriptionTopicResourceTrigger#getFhirPathCriteria <em>Fhir Path Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Path Criteria</em>' containment reference.
	 * @see #getFhirPathCriteria()
	 * @generated
	 */
	void setFhirPathCriteria(org.hl7.emf.fhir.String value);

} // SubscriptionTopicResourceTrigger
