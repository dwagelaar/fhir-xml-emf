/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.MessageHeaderDestination;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Header Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.MessageHeaderDestinationImpl#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MessageHeaderDestinationImpl#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MessageHeaderDestinationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MessageHeaderDestinationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MessageHeaderDestinationImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageHeaderDestinationImpl extends BackboneElementImpl implements MessageHeaderDestination {
	/**
	 * The cached value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected Url endpointUrl;

	/**
	 * The cached value of the '{@link #getEndpointReference() <em>Endpoint Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointReference()
	 * @generated
	 * @ordered
	 */
	protected Reference endpointReference;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String name;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Reference target;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Reference receiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageHeaderDestinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMessageHeaderDestination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getEndpointUrl() {
		return endpointUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointUrl(Url newEndpointUrl, NotificationChain msgs) {
		Url oldEndpointUrl = endpointUrl;
		endpointUrl = newEndpointUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_URL, oldEndpointUrl, newEndpointUrl);
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
	public void setEndpointUrl(Url newEndpointUrl) {
		if (newEndpointUrl != endpointUrl) {
			NotificationChain msgs = null;
			if (endpointUrl != null)
				msgs = ((InternalEObject)endpointUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_URL, null, msgs);
			if (newEndpointUrl != null)
				msgs = ((InternalEObject)newEndpointUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_URL, null, msgs);
			msgs = basicSetEndpointUrl(newEndpointUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_URL, newEndpointUrl, newEndpointUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEndpointReference() {
		return endpointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointReference(Reference newEndpointReference, NotificationChain msgs) {
		Reference oldEndpointReference = endpointReference;
		endpointReference = newEndpointReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_REFERENCE, oldEndpointReference, newEndpointReference);
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
	public void setEndpointReference(Reference newEndpointReference) {
		if (newEndpointReference != endpointReference) {
			NotificationChain msgs = null;
			if (endpointReference != null)
				msgs = ((InternalEObject)endpointReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_REFERENCE, null, msgs);
			if (newEndpointReference != null)
				msgs = ((InternalEObject)newEndpointReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_REFERENCE, null, msgs);
			msgs = basicSetEndpointReference(newEndpointReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_REFERENCE, newEndpointReference, newEndpointReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.emf.fhir.String newName, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__NAME, oldName, newName);
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
	public void setName(org.hl7.emf.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Reference newTarget, NotificationChain msgs) {
		Reference oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET, oldTarget, newTarget);
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
	public void setTarget(Reference newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(Reference newReceiver, NotificationChain msgs) {
		Reference oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__RECEIVER, oldReceiver, newReceiver);
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
	public void setReceiver(Reference newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject)receiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__RECEIVER, null, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject)newReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__RECEIVER, null, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__RECEIVER, newReceiver, newReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_URL:
				return basicSetEndpointUrl(null, msgs);
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_REFERENCE:
				return basicSetEndpointReference(null, msgs);
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.MESSAGE_HEADER_DESTINATION__RECEIVER:
				return basicSetReceiver(null, msgs);
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
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_URL:
				return getEndpointUrl();
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_REFERENCE:
				return getEndpointReference();
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				return getName();
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				return getTarget();
			case FhirPackage.MESSAGE_HEADER_DESTINATION__RECEIVER:
				return getReceiver();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_URL:
				setEndpointUrl((Url)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_REFERENCE:
				setEndpointReference((Reference)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				setName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				setTarget((Reference)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__RECEIVER:
				setReceiver((Reference)newValue);
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
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_URL:
				setEndpointUrl((Url)null);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_REFERENCE:
				setEndpointReference((Reference)null);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				setName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				setTarget((Reference)null);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__RECEIVER:
				setReceiver((Reference)null);
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
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_URL:
				return endpointUrl != null;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT_REFERENCE:
				return endpointReference != null;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				return name != null;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				return target != null;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__RECEIVER:
				return receiver != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageHeaderDestinationImpl
