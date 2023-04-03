/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SubscriptionStatus resource describes the state of a Subscription during notifications.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubscriptionStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionStatus#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionStatus#getEventsSinceSubscriptionStart <em>Events Since Subscription Start</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionStatus#getNotificationEvent <em>Notification Event</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionStatus#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionStatus#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionStatus#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubscriptionStatus()
 * @model extendedMetaData="name='SubscriptionStatus' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionStatus extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the subscription, which marks the server state for managing the subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SubscriptionStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionStatus_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionStatus#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SubscriptionStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of event being conveyed with this notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SubscriptionNotificationType)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionStatus_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionNotificationType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionStatus#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SubscriptionNotificationType value);

	/**
	 * Returns the value of the '<em><b>Events Since Subscription Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of actual events which have been generated since the Subscription was created (inclusive of this notification) - regardless of how many have been successfully communicated.  This number is NOT incremented for handshake and heartbeat notifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Events Since Subscription Start</em>' containment reference.
	 * @see #setEventsSinceSubscriptionStart(Integer64)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionStatus_EventsSinceSubscriptionStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventsSinceSubscriptionStart' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer64 getEventsSinceSubscriptionStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionStatus#getEventsSinceSubscriptionStart <em>Events Since Subscription Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events Since Subscription Start</em>' containment reference.
	 * @see #getEventsSinceSubscriptionStart()
	 * @generated
	 */
	void setEventsSinceSubscriptionStart(Integer64 value);

	/**
	 * Returns the value of the '<em><b>Notification Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubscriptionStatusNotificationEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed information about events relevant to this subscription notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notification Event</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionStatus_NotificationEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notificationEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscriptionStatusNotificationEvent> getNotificationEvent();

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to the Subscription which generated this notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription</em>' containment reference.
	 * @see #setSubscription(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionStatus_Subscription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subscription' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubscription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionStatus#getSubscription <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' containment reference.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(Reference value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to the SubscriptionTopic for the Subscription which generated this notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference.
	 * @see #setTopic(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionStatus_Topic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getTopic();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionStatus#getTopic <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' containment reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Canonical value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of errors that occurred when the server processed a notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionStatus_Error()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getError();

} // SubscriptionStatus
