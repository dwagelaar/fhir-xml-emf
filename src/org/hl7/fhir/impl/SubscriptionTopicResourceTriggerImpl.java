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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.InteractionTrigger;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.SubscriptionTopicQueryCriteria;
import org.hl7.fhir.SubscriptionTopicResourceTrigger;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Topic Resource Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicResourceTriggerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicResourceTriggerImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicResourceTriggerImpl#getSupportedInteraction <em>Supported Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicResourceTriggerImpl#getQueryCriteria <em>Query Criteria</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicResourceTriggerImpl#getFhirPathCriteria <em>Fhir Path Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionTopicResourceTriggerImpl extends BackboneElementImpl implements SubscriptionTopicResourceTrigger {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Uri resource;

	/**
	 * The cached value of the '{@link #getSupportedInteraction() <em>Supported Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionTrigger> supportedInteraction;

	/**
	 * The cached value of the '{@link #getQueryCriteria() <em>Query Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryCriteria()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionTopicQueryCriteria queryCriteria;

	/**
	 * The cached value of the '{@link #getFhirPathCriteria() <em>Fhir Path Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirPathCriteria()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String fhirPathCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionTopicResourceTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubscriptionTopicResourceTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Uri newResource, NotificationChain msgs) {
		Uri oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Uri newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionTrigger> getSupportedInteraction() {
		if (supportedInteraction == null) {
			supportedInteraction = new EObjectContainmentEList<InteractionTrigger>(InteractionTrigger.class, this, FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__SUPPORTED_INTERACTION);
		}
		return supportedInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTopicQueryCriteria getQueryCriteria() {
		return queryCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryCriteria(SubscriptionTopicQueryCriteria newQueryCriteria, NotificationChain msgs) {
		SubscriptionTopicQueryCriteria oldQueryCriteria = queryCriteria;
		queryCriteria = newQueryCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__QUERY_CRITERIA, oldQueryCriteria, newQueryCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryCriteria(SubscriptionTopicQueryCriteria newQueryCriteria) {
		if (newQueryCriteria != queryCriteria) {
			NotificationChain msgs = null;
			if (queryCriteria != null)
				msgs = ((InternalEObject)queryCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__QUERY_CRITERIA, null, msgs);
			if (newQueryCriteria != null)
				msgs = ((InternalEObject)newQueryCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__QUERY_CRITERIA, null, msgs);
			msgs = basicSetQueryCriteria(newQueryCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__QUERY_CRITERIA, newQueryCriteria, newQueryCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getFhirPathCriteria() {
		return fhirPathCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirPathCriteria(org.hl7.fhir.String newFhirPathCriteria, NotificationChain msgs) {
		org.hl7.fhir.String oldFhirPathCriteria = fhirPathCriteria;
		fhirPathCriteria = newFhirPathCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__FHIR_PATH_CRITERIA, oldFhirPathCriteria, newFhirPathCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFhirPathCriteria(org.hl7.fhir.String newFhirPathCriteria) {
		if (newFhirPathCriteria != fhirPathCriteria) {
			NotificationChain msgs = null;
			if (fhirPathCriteria != null)
				msgs = ((InternalEObject)fhirPathCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__FHIR_PATH_CRITERIA, null, msgs);
			if (newFhirPathCriteria != null)
				msgs = ((InternalEObject)newFhirPathCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__FHIR_PATH_CRITERIA, null, msgs);
			msgs = basicSetFhirPathCriteria(newFhirPathCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__FHIR_PATH_CRITERIA, newFhirPathCriteria, newFhirPathCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__SUPPORTED_INTERACTION:
				return ((InternalEList<?>)getSupportedInteraction()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__QUERY_CRITERIA:
				return basicSetQueryCriteria(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__FHIR_PATH_CRITERIA:
				return basicSetFhirPathCriteria(null, msgs);
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
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__DESCRIPTION:
				return getDescription();
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__RESOURCE:
				return getResource();
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__SUPPORTED_INTERACTION:
				return getSupportedInteraction();
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__QUERY_CRITERIA:
				return getQueryCriteria();
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__FHIR_PATH_CRITERIA:
				return getFhirPathCriteria();
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
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__RESOURCE:
				setResource((Uri)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__SUPPORTED_INTERACTION:
				getSupportedInteraction().clear();
				getSupportedInteraction().addAll((Collection<? extends InteractionTrigger>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__QUERY_CRITERIA:
				setQueryCriteria((SubscriptionTopicQueryCriteria)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__FHIR_PATH_CRITERIA:
				setFhirPathCriteria((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__RESOURCE:
				setResource((Uri)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__SUPPORTED_INTERACTION:
				getSupportedInteraction().clear();
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__QUERY_CRITERIA:
				setQueryCriteria((SubscriptionTopicQueryCriteria)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__FHIR_PATH_CRITERIA:
				setFhirPathCriteria((org.hl7.fhir.String)null);
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
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__DESCRIPTION:
				return description != null;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__RESOURCE:
				return resource != null;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__SUPPORTED_INTERACTION:
				return supportedInteraction != null && !supportedInteraction.isEmpty();
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__QUERY_CRITERIA:
				return queryCriteria != null;
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER__FHIR_PATH_CRITERIA:
				return fhirPathCriteria != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionTopicResourceTriggerImpl
