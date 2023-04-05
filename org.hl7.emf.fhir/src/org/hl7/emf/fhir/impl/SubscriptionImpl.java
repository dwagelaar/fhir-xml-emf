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
import org.hl7.emf.fhir.Code;
import org.hl7.emf.fhir.Coding;
import org.hl7.emf.fhir.ContactPoint;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Instant;
import org.hl7.emf.fhir.PositiveInt;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.Subscription;
import org.hl7.emf.fhir.SubscriptionFilterBy;
import org.hl7.emf.fhir.SubscriptionParameter;
import org.hl7.emf.fhir.SubscriptionPayloadContent;
import org.hl7.emf.fhir.SubscriptionStatusCodes;
import org.hl7.emf.fhir.UnsignedInt;
import org.hl7.emf.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getManagingEntity <em>Managing Entity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getFilterBy <em>Filter By</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getHeartbeatPeriod <em>Heartbeat Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionImpl#getMaxCount <em>Max Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends DomainResourceImpl implements Subscription {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionStatusCodes status;

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
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contact;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getManagingEntity() <em>Managing Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingEntity()
	 * @generated
	 * @ordered
	 */
	protected Reference managingEntity;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String reason;

	/**
	 * The cached value of the '{@link #getFilterBy() <em>Filter By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscriptionFilterBy> filterBy;

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
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Url endpoint;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscriptionParameter> parameter;

	/**
	 * The cached value of the '{@link #getHeartbeatPeriod() <em>Heartbeat Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeatPeriod()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt heartbeatPeriod;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt timeout;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionPayloadContent content;

	/**
	 * The cached value of the '{@link #getMaxCount() <em>Max Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCount()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt maxCount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubscription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SUBSCRIPTION__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__TOPIC, oldTopic, newTopic);
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
				msgs = ((InternalEObject)topic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__TOPIC, null, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject)newTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__TOPIC, null, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__TOPIC, newTopic, newTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.SUBSCRIPTION__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Instant newEnd, NotificationChain msgs) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__END, oldEnd, newEnd);
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
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManagingEntity() {
		return managingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagingEntity(Reference newManagingEntity, NotificationChain msgs) {
		Reference oldManagingEntity = managingEntity;
		managingEntity = newManagingEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__MANAGING_ENTITY, oldManagingEntity, newManagingEntity);
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
	public void setManagingEntity(Reference newManagingEntity) {
		if (newManagingEntity != managingEntity) {
			NotificationChain msgs = null;
			if (managingEntity != null)
				msgs = ((InternalEObject)managingEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__MANAGING_ENTITY, null, msgs);
			if (newManagingEntity != null)
				msgs = ((InternalEObject)newManagingEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__MANAGING_ENTITY, null, msgs);
			msgs = basicSetManagingEntity(newManagingEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__MANAGING_ENTITY, newManagingEntity, newManagingEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(org.hl7.emf.fhir.String newReason, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__REASON, oldReason, newReason);
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
	public void setReason(org.hl7.emf.fhir.String newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubscriptionFilterBy> getFilterBy() {
		if (filterBy == null) {
			filterBy = new EObjectContainmentEList<SubscriptionFilterBy>(SubscriptionFilterBy.class, this, FhirPackage.SUBSCRIPTION__FILTER_BY);
		}
		return filterBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CHANNEL_TYPE, oldChannelType, newChannelType);
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
	public void setChannelType(Coding newChannelType) {
		if (newChannelType != channelType) {
			NotificationChain msgs = null;
			if (channelType != null)
				msgs = ((InternalEObject)channelType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CHANNEL_TYPE, null, msgs);
			if (newChannelType != null)
				msgs = ((InternalEObject)newChannelType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CHANNEL_TYPE, null, msgs);
			msgs = basicSetChannelType(newChannelType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CHANNEL_TYPE, newChannelType, newChannelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(Url newEndpoint, NotificationChain msgs) {
		Url oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__ENDPOINT, oldEndpoint, newEndpoint);
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
	public void setEndpoint(Url newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject)endpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__ENDPOINT, null, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__ENDPOINT, null, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__ENDPOINT, newEndpoint, newEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubscriptionParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<SubscriptionParameter>(SubscriptionParameter.class, this, FhirPackage.SUBSCRIPTION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getHeartbeatPeriod() {
		return heartbeatPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeartbeatPeriod(UnsignedInt newHeartbeatPeriod, NotificationChain msgs) {
		UnsignedInt oldHeartbeatPeriod = heartbeatPeriod;
		heartbeatPeriod = newHeartbeatPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__HEARTBEAT_PERIOD, oldHeartbeatPeriod, newHeartbeatPeriod);
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
	public void setHeartbeatPeriod(UnsignedInt newHeartbeatPeriod) {
		if (newHeartbeatPeriod != heartbeatPeriod) {
			NotificationChain msgs = null;
			if (heartbeatPeriod != null)
				msgs = ((InternalEObject)heartbeatPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__HEARTBEAT_PERIOD, null, msgs);
			if (newHeartbeatPeriod != null)
				msgs = ((InternalEObject)newHeartbeatPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__HEARTBEAT_PERIOD, null, msgs);
			msgs = basicSetHeartbeatPeriod(newHeartbeatPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__HEARTBEAT_PERIOD, newHeartbeatPeriod, newHeartbeatPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeout(UnsignedInt newTimeout, NotificationChain msgs) {
		UnsignedInt oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__TIMEOUT, oldTimeout, newTimeout);
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
	public void setTimeout(UnsignedInt newTimeout) {
		if (newTimeout != timeout) {
			NotificationChain msgs = null;
			if (timeout != null)
				msgs = ((InternalEObject)timeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__TIMEOUT, null, msgs);
			if (newTimeout != null)
				msgs = ((InternalEObject)newTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__TIMEOUT, null, msgs);
			msgs = basicSetTimeout(newTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__TIMEOUT, newTimeout, newTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentType(Code newContentType, NotificationChain msgs) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CONTENT_TYPE, oldContentType, newContentType);
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
	public void setContentType(Code newContentType) {
		if (newContentType != contentType) {
			NotificationChain msgs = null;
			if (contentType != null)
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionPayloadContent getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(SubscriptionPayloadContent newContent, NotificationChain msgs) {
		SubscriptionPayloadContent oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CONTENT, oldContent, newContent);
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
	public void setContent(SubscriptionPayloadContent newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getMaxCount() {
		return maxCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxCount(PositiveInt newMaxCount, NotificationChain msgs) {
		PositiveInt oldMaxCount = maxCount;
		maxCount = newMaxCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__MAX_COUNT, oldMaxCount, newMaxCount);
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
	public void setMaxCount(PositiveInt newMaxCount) {
		if (newMaxCount != maxCount) {
			NotificationChain msgs = null;
			if (maxCount != null)
				msgs = ((InternalEObject)maxCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__MAX_COUNT, null, msgs);
			if (newMaxCount != null)
				msgs = ((InternalEObject)newMaxCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__MAX_COUNT, null, msgs);
			msgs = basicSetMaxCount(newMaxCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__MAX_COUNT, newMaxCount, newMaxCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SUBSCRIPTION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUBSCRIPTION__TOPIC:
				return basicSetTopic(null, msgs);
			case FhirPackage.SUBSCRIPTION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.SUBSCRIPTION__MANAGING_ENTITY:
				return basicSetManagingEntity(null, msgs);
			case FhirPackage.SUBSCRIPTION__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.SUBSCRIPTION__FILTER_BY:
				return ((InternalEList<?>)getFilterBy()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION__CHANNEL_TYPE:
				return basicSetChannelType(null, msgs);
			case FhirPackage.SUBSCRIPTION__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case FhirPackage.SUBSCRIPTION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION__HEARTBEAT_PERIOD:
				return basicSetHeartbeatPeriod(null, msgs);
			case FhirPackage.SUBSCRIPTION__TIMEOUT:
				return basicSetTimeout(null, msgs);
			case FhirPackage.SUBSCRIPTION__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case FhirPackage.SUBSCRIPTION__CONTENT:
				return basicSetContent(null, msgs);
			case FhirPackage.SUBSCRIPTION__MAX_COUNT:
				return basicSetMaxCount(null, msgs);
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
			case FhirPackage.SUBSCRIPTION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUBSCRIPTION__NAME:
				return getName();
			case FhirPackage.SUBSCRIPTION__STATUS:
				return getStatus();
			case FhirPackage.SUBSCRIPTION__TOPIC:
				return getTopic();
			case FhirPackage.SUBSCRIPTION__CONTACT:
				return getContact();
			case FhirPackage.SUBSCRIPTION__END:
				return getEnd();
			case FhirPackage.SUBSCRIPTION__MANAGING_ENTITY:
				return getManagingEntity();
			case FhirPackage.SUBSCRIPTION__REASON:
				return getReason();
			case FhirPackage.SUBSCRIPTION__FILTER_BY:
				return getFilterBy();
			case FhirPackage.SUBSCRIPTION__CHANNEL_TYPE:
				return getChannelType();
			case FhirPackage.SUBSCRIPTION__ENDPOINT:
				return getEndpoint();
			case FhirPackage.SUBSCRIPTION__PARAMETER:
				return getParameter();
			case FhirPackage.SUBSCRIPTION__HEARTBEAT_PERIOD:
				return getHeartbeatPeriod();
			case FhirPackage.SUBSCRIPTION__TIMEOUT:
				return getTimeout();
			case FhirPackage.SUBSCRIPTION__CONTENT_TYPE:
				return getContentType();
			case FhirPackage.SUBSCRIPTION__CONTENT:
				return getContent();
			case FhirPackage.SUBSCRIPTION__MAX_COUNT:
				return getMaxCount();
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
			case FhirPackage.SUBSCRIPTION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__NAME:
				setName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__STATUS:
				setStatus((SubscriptionStatusCodes)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__TOPIC:
				setTopic((Canonical)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__END:
				setEnd((Instant)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__MANAGING_ENTITY:
				setManagingEntity((Reference)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__REASON:
				setReason((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__FILTER_BY:
				getFilterBy().clear();
				getFilterBy().addAll((Collection<? extends SubscriptionFilterBy>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__CHANNEL_TYPE:
				setChannelType((Coding)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__ENDPOINT:
				setEndpoint((Url)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends SubscriptionParameter>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__HEARTBEAT_PERIOD:
				setHeartbeatPeriod((UnsignedInt)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__TIMEOUT:
				setTimeout((UnsignedInt)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__CONTENT:
				setContent((SubscriptionPayloadContent)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__MAX_COUNT:
				setMaxCount((PositiveInt)newValue);
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
			case FhirPackage.SUBSCRIPTION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.SUBSCRIPTION__NAME:
				setName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION__STATUS:
				setStatus((SubscriptionStatusCodes)null);
				return;
			case FhirPackage.SUBSCRIPTION__TOPIC:
				setTopic((Canonical)null);
				return;
			case FhirPackage.SUBSCRIPTION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.SUBSCRIPTION__END:
				setEnd((Instant)null);
				return;
			case FhirPackage.SUBSCRIPTION__MANAGING_ENTITY:
				setManagingEntity((Reference)null);
				return;
			case FhirPackage.SUBSCRIPTION__REASON:
				setReason((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION__FILTER_BY:
				getFilterBy().clear();
				return;
			case FhirPackage.SUBSCRIPTION__CHANNEL_TYPE:
				setChannelType((Coding)null);
				return;
			case FhirPackage.SUBSCRIPTION__ENDPOINT:
				setEndpoint((Url)null);
				return;
			case FhirPackage.SUBSCRIPTION__PARAMETER:
				getParameter().clear();
				return;
			case FhirPackage.SUBSCRIPTION__HEARTBEAT_PERIOD:
				setHeartbeatPeriod((UnsignedInt)null);
				return;
			case FhirPackage.SUBSCRIPTION__TIMEOUT:
				setTimeout((UnsignedInt)null);
				return;
			case FhirPackage.SUBSCRIPTION__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case FhirPackage.SUBSCRIPTION__CONTENT:
				setContent((SubscriptionPayloadContent)null);
				return;
			case FhirPackage.SUBSCRIPTION__MAX_COUNT:
				setMaxCount((PositiveInt)null);
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
			case FhirPackage.SUBSCRIPTION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.SUBSCRIPTION__NAME:
				return name != null;
			case FhirPackage.SUBSCRIPTION__STATUS:
				return status != null;
			case FhirPackage.SUBSCRIPTION__TOPIC:
				return topic != null;
			case FhirPackage.SUBSCRIPTION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.SUBSCRIPTION__END:
				return end != null;
			case FhirPackage.SUBSCRIPTION__MANAGING_ENTITY:
				return managingEntity != null;
			case FhirPackage.SUBSCRIPTION__REASON:
				return reason != null;
			case FhirPackage.SUBSCRIPTION__FILTER_BY:
				return filterBy != null && !filterBy.isEmpty();
			case FhirPackage.SUBSCRIPTION__CHANNEL_TYPE:
				return channelType != null;
			case FhirPackage.SUBSCRIPTION__ENDPOINT:
				return endpoint != null;
			case FhirPackage.SUBSCRIPTION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case FhirPackage.SUBSCRIPTION__HEARTBEAT_PERIOD:
				return heartbeatPeriod != null;
			case FhirPackage.SUBSCRIPTION__TIMEOUT:
				return timeout != null;
			case FhirPackage.SUBSCRIPTION__CONTENT_TYPE:
				return contentType != null;
			case FhirPackage.SUBSCRIPTION__CONTENT:
				return content != null;
			case FhirPackage.SUBSCRIPTION__MAX_COUNT:
				return maxCount != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionImpl
