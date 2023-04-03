/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Topic Notification Shape</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubscriptionTopicNotificationShape#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicNotificationShape#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicNotificationShape#getRevInclude <em>Rev Include</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicNotificationShape()
 * @model extendedMetaData="name='SubscriptionTopic.NotificationShape' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionTopicNotificationShape extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL of the Resource that is the type used in this shape. This is the 'focus' resource of the topic (or one of them if there are more than one) and the root resource for this shape definition. It will be the same, a generality, or a specificity of SubscriptionTopic.resourceTrigger.resource or SubscriptionTopic.eventTrigger.resource when they are present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicNotificationShape_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getResource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicNotificationShape#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Uri value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search-style _include directives, rooted in the resource for this shape. Servers SHOULD include resources listed here, if they exist and the user is authorized to receive them.  Clients SHOULD be prepared to receive these additional resources, but SHALL function properly without them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicNotificationShape_Include()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getInclude();

	/**
	 * Returns the value of the '<em><b>Rev Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search-style _revinclude directives, rooted in the resource for this shape. Servers SHOULD include resources listed here, if they exist and the user is authorized to receive them.  Clients SHOULD be prepared to receive these additional resources, but SHALL function properly without them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rev Include</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionTopicNotificationShape_RevInclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getRevInclude();

} // SubscriptionTopicNotificationShape
