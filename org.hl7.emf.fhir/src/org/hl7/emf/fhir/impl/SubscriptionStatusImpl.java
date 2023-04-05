/**
 */
package org.hl7.emf.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Integer64;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.SubscriptionNotificationType;
import org.hl7.emf.fhir.SubscriptionStatus;
import org.hl7.emf.fhir.SubscriptionStatusCodes;
import org.hl7.emf.fhir.SubscriptionStatusNotificationEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusImpl#getEventsSinceSubscriptionStart <em>Events Since Subscription Start</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusImpl#getNotificationEvent <em>Notification Event</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusImpl#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionStatusImpl extends DomainResourceImpl implements SubscriptionStatus {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionStatusCodes status;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionNotificationType type;

	/**
	 * The cached value of the '{@link #getEventsSinceSubscriptionStart() <em>Events Since Subscription Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventsSinceSubscriptionStart()
	 * @generated
	 * @ordered
	 */
	protected Integer64 eventsSinceSubscriptionStart;

	/**
	 * The cached value of the '{@link #getNotificationEvent() <em>Notification Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscriptionStatusNotificationEvent> notificationEvent;

	/**
	 * The cached value of the '{@link #getSubscription() <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription()
	 * @generated
	 * @ordered
	 */
	protected Reference subscription;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Canonical topic;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubscriptionStatus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(SubscriptionStatusCodes newStatus, NotificationChain msgs) {
		SubscriptionStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(SubscriptionStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionNotificationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SubscriptionNotificationType newType, NotificationChain msgs) {
		SubscriptionNotificationType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(SubscriptionNotificationType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer64 getEventsSinceSubscriptionStart() {
		return eventsSinceSubscriptionStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventsSinceSubscriptionStart(Integer64 newEventsSinceSubscriptionStart, NotificationChain msgs) {
		Integer64 oldEventsSinceSubscriptionStart = eventsSinceSubscriptionStart;
		eventsSinceSubscriptionStart = newEventsSinceSubscriptionStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__EVENTS_SINCE_SUBSCRIPTION_START, oldEventsSinceSubscriptionStart, newEventsSinceSubscriptionStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventsSinceSubscriptionStart(Integer64 newEventsSinceSubscriptionStart) {
		if (newEventsSinceSubscriptionStart != eventsSinceSubscriptionStart) {
			NotificationChain msgs = null;
			if (eventsSinceSubscriptionStart != null)
				msgs = ((InternalEObject)eventsSinceSubscriptionStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__EVENTS_SINCE_SUBSCRIPTION_START, null, msgs);
			if (newEventsSinceSubscriptionStart != null)
				msgs = ((InternalEObject)newEventsSinceSubscriptionStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__EVENTS_SINCE_SUBSCRIPTION_START, null, msgs);
			msgs = basicSetEventsSinceSubscriptionStart(newEventsSinceSubscriptionStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__EVENTS_SINCE_SUBSCRIPTION_START, newEventsSinceSubscriptionStart, newEventsSinceSubscriptionStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubscriptionStatusNotificationEvent> getNotificationEvent() {
		if (notificationEvent == null) {
			notificationEvent = new EObjectContainmentEList<SubscriptionStatusNotificationEvent>(SubscriptionStatusNotificationEvent.class, this, FhirPackage.SUBSCRIPTION_STATUS__NOTIFICATION_EVENT);
		}
		return notificationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubscription() {
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscription(Reference newSubscription, NotificationChain msgs) {
		Reference oldSubscription = subscription;
		subscription = newSubscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__SUBSCRIPTION, oldSubscription, newSubscription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscription(Reference newSubscription) {
		if (newSubscription != subscription) {
			NotificationChain msgs = null;
			if (subscription != null)
				msgs = ((InternalEObject)subscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__SUBSCRIPTION, null, msgs);
			if (newSubscription != null)
				msgs = ((InternalEObject)newSubscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__SUBSCRIPTION, null, msgs);
			msgs = basicSetSubscription(newSubscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__SUBSCRIPTION, newSubscription, newSubscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(Canonical newTopic, NotificationChain msgs) {
		Canonical oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__TOPIC, oldTopic, newTopic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopic(Canonical newTopic) {
		if (newTopic != topic) {
			NotificationChain msgs = null;
			if (topic != null)
				msgs = ((InternalEObject)topic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__TOPIC, null, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject)newTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS__TOPIC, null, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS__TOPIC, newTopic, newTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getError() {
		if (error == null) {
			error = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSCRIPTION_STATUS__ERROR);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_STATUS__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUBSCRIPTION_STATUS__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSCRIPTION_STATUS__EVENTS_SINCE_SUBSCRIPTION_START:
				return basicSetEventsSinceSubscriptionStart(null, msgs);
			case FhirPackage.SUBSCRIPTION_STATUS__NOTIFICATION_EVENT:
				return ((InternalEList<?>)getNotificationEvent()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_STATUS__SUBSCRIPTION:
				return basicSetSubscription(null, msgs);
			case FhirPackage.SUBSCRIPTION_STATUS__TOPIC:
				return basicSetTopic(null, msgs);
			case FhirPackage.SUBSCRIPTION_STATUS__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_STATUS__STATUS:
				return getStatus();
			case FhirPackage.SUBSCRIPTION_STATUS__TYPE:
				return getType();
			case FhirPackage.SUBSCRIPTION_STATUS__EVENTS_SINCE_SUBSCRIPTION_START:
				return getEventsSinceSubscriptionStart();
			case FhirPackage.SUBSCRIPTION_STATUS__NOTIFICATION_EVENT:
				return getNotificationEvent();
			case FhirPackage.SUBSCRIPTION_STATUS__SUBSCRIPTION:
				return getSubscription();
			case FhirPackage.SUBSCRIPTION_STATUS__TOPIC:
				return getTopic();
			case FhirPackage.SUBSCRIPTION_STATUS__ERROR:
				return getError();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_STATUS__STATUS:
				setStatus((SubscriptionStatusCodes)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__TYPE:
				setType((SubscriptionNotificationType)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__EVENTS_SINCE_SUBSCRIPTION_START:
				setEventsSinceSubscriptionStart((Integer64)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__NOTIFICATION_EVENT:
				getNotificationEvent().clear();
				getNotificationEvent().addAll((Collection<? extends SubscriptionStatusNotificationEvent>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__SUBSCRIPTION:
				setSubscription((Reference)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__TOPIC:
				setTopic((Canonical)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_STATUS__STATUS:
				setStatus((SubscriptionStatusCodes)null);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__TYPE:
				setType((SubscriptionNotificationType)null);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__EVENTS_SINCE_SUBSCRIPTION_START:
				setEventsSinceSubscriptionStart((Integer64)null);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__NOTIFICATION_EVENT:
				getNotificationEvent().clear();
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__SUBSCRIPTION:
				setSubscription((Reference)null);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__TOPIC:
				setTopic((Canonical)null);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS__ERROR:
				getError().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_STATUS__STATUS:
				return status != null;
			case FhirPackage.SUBSCRIPTION_STATUS__TYPE:
				return type != null;
			case FhirPackage.SUBSCRIPTION_STATUS__EVENTS_SINCE_SUBSCRIPTION_START:
				return eventsSinceSubscriptionStart != null;
			case FhirPackage.SUBSCRIPTION_STATUS__NOTIFICATION_EVENT:
				return notificationEvent != null && !notificationEvent.isEmpty();
			case FhirPackage.SUBSCRIPTION_STATUS__SUBSCRIPTION:
				return subscription != null;
			case FhirPackage.SUBSCRIPTION_STATUS__TOPIC:
				return topic != null;
			case FhirPackage.SUBSCRIPTION_STATUS__ERROR:
				return error != null && !error.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionStatusImpl
