/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CriteriaNotExistsBehavior;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SubscriptionTopicQueryCriteria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Topic Query Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicQueryCriteriaImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicQueryCriteriaImpl#getResultForCreate <em>Result For Create</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicQueryCriteriaImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicQueryCriteriaImpl#getResultForDelete <em>Result For Delete</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicQueryCriteriaImpl#getRequireBoth <em>Require Both</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionTopicQueryCriteriaImpl extends BackboneElementImpl implements SubscriptionTopicQueryCriteria {
	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String previous;

	/**
	 * The cached value of the '{@link #getResultForCreate() <em>Result For Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultForCreate()
	 * @generated
	 * @ordered
	 */
	protected CriteriaNotExistsBehavior resultForCreate;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String current;

	/**
	 * The cached value of the '{@link #getResultForDelete() <em>Result For Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultForDelete()
	 * @generated
	 * @ordered
	 */
	protected CriteriaNotExistsBehavior resultForDelete;

	/**
	 * The cached value of the '{@link #getRequireBoth() <em>Require Both</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireBoth()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean requireBoth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionTopicQueryCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubscriptionTopicQueryCriteria();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(org.hl7.fhir.String newPrevious, NotificationChain msgs) {
		org.hl7.fhir.String oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(org.hl7.fhir.String newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__PREVIOUS, null, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__PREVIOUS, null, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaNotExistsBehavior getResultForCreate() {
		return resultForCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultForCreate(CriteriaNotExistsBehavior newResultForCreate, NotificationChain msgs) {
		CriteriaNotExistsBehavior oldResultForCreate = resultForCreate;
		resultForCreate = newResultForCreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_CREATE, oldResultForCreate, newResultForCreate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultForCreate(CriteriaNotExistsBehavior newResultForCreate) {
		if (newResultForCreate != resultForCreate) {
			NotificationChain msgs = null;
			if (resultForCreate != null)
				msgs = ((InternalEObject)resultForCreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_CREATE, null, msgs);
			if (newResultForCreate != null)
				msgs = ((InternalEObject)newResultForCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_CREATE, null, msgs);
			msgs = basicSetResultForCreate(newResultForCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_CREATE, newResultForCreate, newResultForCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrent(org.hl7.fhir.String newCurrent, NotificationChain msgs) {
		org.hl7.fhir.String oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__CURRENT, oldCurrent, newCurrent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(org.hl7.fhir.String newCurrent) {
		if (newCurrent != current) {
			NotificationChain msgs = null;
			if (current != null)
				msgs = ((InternalEObject)current).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__CURRENT, null, msgs);
			if (newCurrent != null)
				msgs = ((InternalEObject)newCurrent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__CURRENT, null, msgs);
			msgs = basicSetCurrent(newCurrent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__CURRENT, newCurrent, newCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaNotExistsBehavior getResultForDelete() {
		return resultForDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultForDelete(CriteriaNotExistsBehavior newResultForDelete, NotificationChain msgs) {
		CriteriaNotExistsBehavior oldResultForDelete = resultForDelete;
		resultForDelete = newResultForDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_DELETE, oldResultForDelete, newResultForDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultForDelete(CriteriaNotExistsBehavior newResultForDelete) {
		if (newResultForDelete != resultForDelete) {
			NotificationChain msgs = null;
			if (resultForDelete != null)
				msgs = ((InternalEObject)resultForDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_DELETE, null, msgs);
			if (newResultForDelete != null)
				msgs = ((InternalEObject)newResultForDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_DELETE, null, msgs);
			msgs = basicSetResultForDelete(newResultForDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_DELETE, newResultForDelete, newResultForDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRequireBoth() {
		return requireBoth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireBoth(org.hl7.fhir.Boolean newRequireBoth, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequireBoth = requireBoth;
		requireBoth = newRequireBoth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__REQUIRE_BOTH, oldRequireBoth, newRequireBoth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireBoth(org.hl7.fhir.Boolean newRequireBoth) {
		if (newRequireBoth != requireBoth) {
			NotificationChain msgs = null;
			if (requireBoth != null)
				msgs = ((InternalEObject)requireBoth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__REQUIRE_BOTH, null, msgs);
			if (newRequireBoth != null)
				msgs = ((InternalEObject)newRequireBoth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__REQUIRE_BOTH, null, msgs);
			msgs = basicSetRequireBoth(newRequireBoth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__REQUIRE_BOTH, newRequireBoth, newRequireBoth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_CREATE:
				return basicSetResultForCreate(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__CURRENT:
				return basicSetCurrent(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_DELETE:
				return basicSetResultForDelete(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__REQUIRE_BOTH:
				return basicSetRequireBoth(null, msgs);
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
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__PREVIOUS:
				return getPrevious();
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_CREATE:
				return getResultForCreate();
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__CURRENT:
				return getCurrent();
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_DELETE:
				return getResultForDelete();
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__REQUIRE_BOTH:
				return getRequireBoth();
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
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__PREVIOUS:
				setPrevious((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_CREATE:
				setResultForCreate((CriteriaNotExistsBehavior)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__CURRENT:
				setCurrent((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_DELETE:
				setResultForDelete((CriteriaNotExistsBehavior)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__REQUIRE_BOTH:
				setRequireBoth((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__PREVIOUS:
				setPrevious((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_CREATE:
				setResultForCreate((CriteriaNotExistsBehavior)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__CURRENT:
				setCurrent((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_DELETE:
				setResultForDelete((CriteriaNotExistsBehavior)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__REQUIRE_BOTH:
				setRequireBoth((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__PREVIOUS:
				return previous != null;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_CREATE:
				return resultForCreate != null;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__CURRENT:
				return current != null;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__RESULT_FOR_DELETE:
				return resultForDelete != null;
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA__REQUIRE_BOTH:
				return requireBoth != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionTopicQueryCriteriaImpl
