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

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Instant;
import org.hl7.emf.fhir.Integer64;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.SubscriptionStatusNotificationEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Status Notification Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusNotificationEventImpl#getEventNumber <em>Event Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusNotificationEventImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusNotificationEventImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionStatusNotificationEventImpl#getAdditionalContext <em>Additional Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionStatusNotificationEventImpl extends BackboneElementImpl implements SubscriptionStatusNotificationEvent {
	/**
	 * The cached value of the '{@link #getEventNumber() <em>Event Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer64 eventNumber;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Instant timestamp;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Reference focus;

	/**
	 * The cached value of the '{@link #getAdditionalContext() <em>Additional Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> additionalContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionStatusNotificationEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubscriptionStatusNotificationEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer64 getEventNumber() {
		return eventNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventNumber(Integer64 newEventNumber, NotificationChain msgs) {
		Integer64 oldEventNumber = eventNumber;
		eventNumber = newEventNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__EVENT_NUMBER, oldEventNumber, newEventNumber);
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
	public void setEventNumber(Integer64 newEventNumber) {
		if (newEventNumber != eventNumber) {
			NotificationChain msgs = null;
			if (eventNumber != null)
				msgs = ((InternalEObject)eventNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__EVENT_NUMBER, null, msgs);
			if (newEventNumber != null)
				msgs = ((InternalEObject)newEventNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__EVENT_NUMBER, null, msgs);
			msgs = basicSetEventNumber(newEventNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__EVENT_NUMBER, newEventNumber, newEventNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestamp(Instant newTimestamp, NotificationChain msgs) {
		Instant oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__TIMESTAMP, oldTimestamp, newTimestamp);
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
	public void setTimestamp(Instant newTimestamp) {
		if (newTimestamp != timestamp) {
			NotificationChain msgs = null;
			if (timestamp != null)
				msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__TIMESTAMP, newTimestamp, newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(Reference newFocus, NotificationChain msgs) {
		Reference oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__FOCUS, oldFocus, newFocus);
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
	public void setFocus(Reference newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAdditionalContext() {
		if (additionalContext == null) {
			additionalContext = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__ADDITIONAL_CONTEXT);
		}
		return additionalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__EVENT_NUMBER:
				return basicSetEventNumber(null, msgs);
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__TIMESTAMP:
				return basicSetTimestamp(null, msgs);
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__FOCUS:
				return basicSetFocus(null, msgs);
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__ADDITIONAL_CONTEXT:
				return ((InternalEList<?>)getAdditionalContext()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__EVENT_NUMBER:
				return getEventNumber();
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__TIMESTAMP:
				return getTimestamp();
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__FOCUS:
				return getFocus();
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__ADDITIONAL_CONTEXT:
				return getAdditionalContext();
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
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__EVENT_NUMBER:
				setEventNumber((Integer64)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__FOCUS:
				setFocus((Reference)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__ADDITIONAL_CONTEXT:
				getAdditionalContext().clear();
				getAdditionalContext().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__EVENT_NUMBER:
				setEventNumber((Integer64)null);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__TIMESTAMP:
				setTimestamp((Instant)null);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__FOCUS:
				setFocus((Reference)null);
				return;
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__ADDITIONAL_CONTEXT:
				getAdditionalContext().clear();
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
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__EVENT_NUMBER:
				return eventNumber != null;
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__TIMESTAMP:
				return timestamp != null;
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__FOCUS:
				return focus != null;
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT__ADDITIONAL_CONTEXT:
				return additionalContext != null && !additionalContext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionStatusNotificationEventImpl
