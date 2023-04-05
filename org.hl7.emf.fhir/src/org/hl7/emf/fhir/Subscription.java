/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getManagingEntity <em>Managing Entity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getFilterBy <em>Filter By</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getHeartbeatPeriod <em>Heartbeat Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Subscription#getMaxCount <em>Max Count</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubscription()
 * @model extendedMetaData="name='Subscription' kind='elementOnly'"
 * @generated
 */
public interface Subscription extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A natural language name identifying the subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the subscription, which marks the server state for managing the subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SubscriptionStatusCodes)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SubscriptionStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to the subscription topic to be notified about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference.
	 * @see #setTopic(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Topic()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getTopic();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getTopic <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' containment reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Canonical value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getContact();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time for the server to turn the subscription off.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Managing Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entity with authorization to make subsequent revisions to the Subscription and also determines what data the subscription is authorized to disclose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Entity</em>' containment reference.
	 * @see #setManagingEntity(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_ManagingEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managingEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManagingEntity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getManagingEntity <em>Managing Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Entity</em>' containment reference.
	 * @see #getManagingEntity()
	 * @generated
	 */
	void setManagingEntity(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of why this subscription is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getReason();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Filter By</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubscriptionFilterBy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The filter properties to be applied to narrow the subscription topic stream.  When multiple filters are applied, evaluates to true if all the conditions applicable to that resource are met; otherwise it returns false (i.e., logical AND).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter By</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_FilterBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filterBy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscriptionFilterBy> getFilterBy();

	/**
	 * Returns the value of the '<em><b>Channel Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of channel to send notifications on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Type</em>' containment reference.
	 * @see #setChannelType(Coding)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_ChannelType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='channelType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getChannelType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getChannelType <em>Channel Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Type</em>' containment reference.
	 * @see #getChannelType()
	 * @generated
	 */
	void setChannelType(Coding value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The url that describes the actual end-point to send notifications to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(Url)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getEndpoint();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Url value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SubscriptionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Channel-dependent information to send as part of the notification (e.g., HTTP Headers).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscriptionParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Heartbeat Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, a 'heartbeat' notification (keep-alive) is sent via this channel with an interval period equal to this elements integer value in seconds.  If not present, a heartbeat notification is not sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heartbeat Period</em>' containment reference.
	 * @see #setHeartbeatPeriod(UnsignedInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_HeartbeatPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='heartbeatPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getHeartbeatPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getHeartbeatPeriod <em>Heartbeat Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heartbeat Period</em>' containment reference.
	 * @see #getHeartbeatPeriod()
	 * @generated
	 */
	void setHeartbeatPeriod(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, the maximum amount of time a server will allow before failing a notification attempt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' containment reference.
	 * @see #setTimeout(UnsignedInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Timeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeout' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getTimeout();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getTimeout <em>Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' containment reference.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MIME type to send the payload in - e.g., `application/fhir+xml` or `application/fhir+json`. Note that:
	 * 
	 * * clients may request notifications in a specific FHIR version by using the [FHIR Version Parameter](http.html#version-parameter) - e.g., `application/fhir+json; fhirVersion=4.0`.
	 * 
	 * * additional MIME types can be allowed by channels - e.g., `text/plain` and `text/html` are defined by the Email channel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_ContentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How much of the resource content to deliver in the notification payload. The choices are an empty payload, only the resource id, or the full resource content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(SubscriptionPayloadContent)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionPayloadContent getContent();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(SubscriptionPayloadContent value);

	/**
	 * Returns the value of the '<em><b>Max Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, the maximum number of events that will be included in a notification bundle. Note that this is not a strict limit on the number of entries in a bundle, as dependent resources can be included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Count</em>' containment reference.
	 * @see #setMaxCount(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubscription_MaxCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxCount' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getMaxCount();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Subscription#getMaxCount <em>Max Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Count</em>' containment reference.
	 * @see #getMaxCount()
	 * @generated
	 */
	void setMaxCount(PositiveInt value);

} // Subscription
