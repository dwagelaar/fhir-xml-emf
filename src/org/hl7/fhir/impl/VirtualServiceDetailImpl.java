/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ExtendedContactDetail;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Url;
import org.hl7.fhir.VirtualServiceDetail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Service Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.VirtualServiceDetailImpl#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VirtualServiceDetailImpl#getAddressUrl <em>Address Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VirtualServiceDetailImpl#getAddressString <em>Address String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VirtualServiceDetailImpl#getAddressContactPoint <em>Address Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VirtualServiceDetailImpl#getAddressExtendedContactDetail <em>Address Extended Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VirtualServiceDetailImpl#getAdditionalInfo <em>Additional Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VirtualServiceDetailImpl#getMaxParticipants <em>Max Participants</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VirtualServiceDetailImpl#getSessionKey <em>Session Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualServiceDetailImpl extends DataTypeImpl implements VirtualServiceDetail {
	/**
	 * The cached value of the '{@link #getChannelType() <em>Channel Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected Coding channelType;

	/**
	 * The cached value of the '{@link #getAddressUrl() <em>Address Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUrl()
	 * @generated
	 * @ordered
	 */
	protected Url addressUrl;

	/**
	 * The cached value of the '{@link #getAddressString() <em>Address String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String addressString;

	/**
	 * The cached value of the '{@link #getAddressContactPoint() <em>Address Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint addressContactPoint;

	/**
	 * The cached value of the '{@link #getAddressExtendedContactDetail() <em>Address Extended Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressExtendedContactDetail()
	 * @generated
	 * @ordered
	 */
	protected ExtendedContactDetail addressExtendedContactDetail;

	/**
	 * The cached value of the '{@link #getAdditionalInfo() <em>Additional Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<Url> additionalInfo;

	/**
	 * The cached value of the '{@link #getMaxParticipants() <em>Max Participants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxParticipants()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt maxParticipants;

	/**
	 * The cached value of the '{@link #getSessionKey() <em>Session Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionKey()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String sessionKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualServiceDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getVirtualServiceDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getChannelType() {
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelType(Coding newChannelType, NotificationChain msgs) {
		Coding oldChannelType = channelType;
		channelType = newChannelType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__CHANNEL_TYPE, oldChannelType, newChannelType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelType(Coding newChannelType) {
		if (newChannelType != channelType) {
			NotificationChain msgs = null;
			if (channelType != null)
				msgs = ((InternalEObject)channelType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__CHANNEL_TYPE, null, msgs);
			if (newChannelType != null)
				msgs = ((InternalEObject)newChannelType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__CHANNEL_TYPE, null, msgs);
			msgs = basicSetChannelType(newChannelType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__CHANNEL_TYPE, newChannelType, newChannelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getAddressUrl() {
		return addressUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressUrl(Url newAddressUrl, NotificationChain msgs) {
		Url oldAddressUrl = addressUrl;
		addressUrl = newAddressUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_URL, oldAddressUrl, newAddressUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressUrl(Url newAddressUrl) {
		if (newAddressUrl != addressUrl) {
			NotificationChain msgs = null;
			if (addressUrl != null)
				msgs = ((InternalEObject)addressUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_URL, null, msgs);
			if (newAddressUrl != null)
				msgs = ((InternalEObject)newAddressUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_URL, null, msgs);
			msgs = basicSetAddressUrl(newAddressUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_URL, newAddressUrl, newAddressUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAddressString() {
		return addressString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressString(org.hl7.fhir.String newAddressString, NotificationChain msgs) {
		org.hl7.fhir.String oldAddressString = addressString;
		addressString = newAddressString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_STRING, oldAddressString, newAddressString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressString(org.hl7.fhir.String newAddressString) {
		if (newAddressString != addressString) {
			NotificationChain msgs = null;
			if (addressString != null)
				msgs = ((InternalEObject)addressString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_STRING, null, msgs);
			if (newAddressString != null)
				msgs = ((InternalEObject)newAddressString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_STRING, null, msgs);
			msgs = basicSetAddressString(newAddressString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_STRING, newAddressString, newAddressString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getAddressContactPoint() {
		return addressContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressContactPoint(ContactPoint newAddressContactPoint, NotificationChain msgs) {
		ContactPoint oldAddressContactPoint = addressContactPoint;
		addressContactPoint = newAddressContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_CONTACT_POINT, oldAddressContactPoint, newAddressContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressContactPoint(ContactPoint newAddressContactPoint) {
		if (newAddressContactPoint != addressContactPoint) {
			NotificationChain msgs = null;
			if (addressContactPoint != null)
				msgs = ((InternalEObject)addressContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_CONTACT_POINT, null, msgs);
			if (newAddressContactPoint != null)
				msgs = ((InternalEObject)newAddressContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_CONTACT_POINT, null, msgs);
			msgs = basicSetAddressContactPoint(newAddressContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_CONTACT_POINT, newAddressContactPoint, newAddressContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedContactDetail getAddressExtendedContactDetail() {
		return addressExtendedContactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressExtendedContactDetail(ExtendedContactDetail newAddressExtendedContactDetail, NotificationChain msgs) {
		ExtendedContactDetail oldAddressExtendedContactDetail = addressExtendedContactDetail;
		addressExtendedContactDetail = newAddressExtendedContactDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_EXTENDED_CONTACT_DETAIL, oldAddressExtendedContactDetail, newAddressExtendedContactDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressExtendedContactDetail(ExtendedContactDetail newAddressExtendedContactDetail) {
		if (newAddressExtendedContactDetail != addressExtendedContactDetail) {
			NotificationChain msgs = null;
			if (addressExtendedContactDetail != null)
				msgs = ((InternalEObject)addressExtendedContactDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_EXTENDED_CONTACT_DETAIL, null, msgs);
			if (newAddressExtendedContactDetail != null)
				msgs = ((InternalEObject)newAddressExtendedContactDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_EXTENDED_CONTACT_DETAIL, null, msgs);
			msgs = basicSetAddressExtendedContactDetail(newAddressExtendedContactDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_EXTENDED_CONTACT_DETAIL, newAddressExtendedContactDetail, newAddressExtendedContactDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Url> getAdditionalInfo() {
		if (additionalInfo == null) {
			additionalInfo = new EObjectContainmentEList<Url>(Url.class, this, FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDITIONAL_INFO);
		}
		return additionalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getMaxParticipants() {
		return maxParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxParticipants(PositiveInt newMaxParticipants, NotificationChain msgs) {
		PositiveInt oldMaxParticipants = maxParticipants;
		maxParticipants = newMaxParticipants;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__MAX_PARTICIPANTS, oldMaxParticipants, newMaxParticipants);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxParticipants(PositiveInt newMaxParticipants) {
		if (newMaxParticipants != maxParticipants) {
			NotificationChain msgs = null;
			if (maxParticipants != null)
				msgs = ((InternalEObject)maxParticipants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__MAX_PARTICIPANTS, null, msgs);
			if (newMaxParticipants != null)
				msgs = ((InternalEObject)newMaxParticipants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__MAX_PARTICIPANTS, null, msgs);
			msgs = basicSetMaxParticipants(newMaxParticipants, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__MAX_PARTICIPANTS, newMaxParticipants, newMaxParticipants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSessionKey() {
		return sessionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionKey(org.hl7.fhir.String newSessionKey, NotificationChain msgs) {
		org.hl7.fhir.String oldSessionKey = sessionKey;
		sessionKey = newSessionKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__SESSION_KEY, oldSessionKey, newSessionKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionKey(org.hl7.fhir.String newSessionKey) {
		if (newSessionKey != sessionKey) {
			NotificationChain msgs = null;
			if (sessionKey != null)
				msgs = ((InternalEObject)sessionKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__SESSION_KEY, null, msgs);
			if (newSessionKey != null)
				msgs = ((InternalEObject)newSessionKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VIRTUAL_SERVICE_DETAIL__SESSION_KEY, null, msgs);
			msgs = basicSetSessionKey(newSessionKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VIRTUAL_SERVICE_DETAIL__SESSION_KEY, newSessionKey, newSessionKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__CHANNEL_TYPE:
				return basicSetChannelType(null, msgs);
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_URL:
				return basicSetAddressUrl(null, msgs);
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_STRING:
				return basicSetAddressString(null, msgs);
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_CONTACT_POINT:
				return basicSetAddressContactPoint(null, msgs);
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_EXTENDED_CONTACT_DETAIL:
				return basicSetAddressExtendedContactDetail(null, msgs);
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDITIONAL_INFO:
				return ((InternalEList<?>)getAdditionalInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__MAX_PARTICIPANTS:
				return basicSetMaxParticipants(null, msgs);
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__SESSION_KEY:
				return basicSetSessionKey(null, msgs);
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
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__CHANNEL_TYPE:
				return getChannelType();
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_URL:
				return getAddressUrl();
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_STRING:
				return getAddressString();
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_CONTACT_POINT:
				return getAddressContactPoint();
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_EXTENDED_CONTACT_DETAIL:
				return getAddressExtendedContactDetail();
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDITIONAL_INFO:
				return getAdditionalInfo();
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__MAX_PARTICIPANTS:
				return getMaxParticipants();
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__SESSION_KEY:
				return getSessionKey();
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
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__CHANNEL_TYPE:
				setChannelType((Coding)newValue);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_URL:
				setAddressUrl((Url)newValue);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_STRING:
				setAddressString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_CONTACT_POINT:
				setAddressContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_EXTENDED_CONTACT_DETAIL:
				setAddressExtendedContactDetail((ExtendedContactDetail)newValue);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDITIONAL_INFO:
				getAdditionalInfo().clear();
				getAdditionalInfo().addAll((Collection<? extends Url>)newValue);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__MAX_PARTICIPANTS:
				setMaxParticipants((PositiveInt)newValue);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__SESSION_KEY:
				setSessionKey((org.hl7.fhir.String)newValue);
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
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__CHANNEL_TYPE:
				setChannelType((Coding)null);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_URL:
				setAddressUrl((Url)null);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_STRING:
				setAddressString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_CONTACT_POINT:
				setAddressContactPoint((ContactPoint)null);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_EXTENDED_CONTACT_DETAIL:
				setAddressExtendedContactDetail((ExtendedContactDetail)null);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDITIONAL_INFO:
				getAdditionalInfo().clear();
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__MAX_PARTICIPANTS:
				setMaxParticipants((PositiveInt)null);
				return;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__SESSION_KEY:
				setSessionKey((org.hl7.fhir.String)null);
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
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__CHANNEL_TYPE:
				return channelType != null;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_URL:
				return addressUrl != null;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_STRING:
				return addressString != null;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_CONTACT_POINT:
				return addressContactPoint != null;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDRESS_EXTENDED_CONTACT_DETAIL:
				return addressExtendedContactDetail != null;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__ADDITIONAL_INFO:
				return additionalInfo != null && !additionalInfo.isEmpty();
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__MAX_PARTICIPANTS:
				return maxParticipants != null;
			case FhirPackage.VIRTUAL_SERVICE_DETAIL__SESSION_KEY:
				return sessionKey != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualServiceDetailImpl
