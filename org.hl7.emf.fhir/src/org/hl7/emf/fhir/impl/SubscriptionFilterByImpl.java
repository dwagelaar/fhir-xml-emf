/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.SearchComparator;
import org.hl7.emf.fhir.SearchModifierCode;
import org.hl7.emf.fhir.SubscriptionFilterBy;
import org.hl7.emf.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Filter By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionFilterByImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionFilterByImpl#getFilterParameter <em>Filter Parameter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionFilterByImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionFilterByImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubscriptionFilterByImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionFilterByImpl extends BackboneElementImpl implements SubscriptionFilterBy {
	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected Uri resourceType;

	/**
	 * The cached value of the '{@link #getFilterParameter() <em>Filter Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterParameter()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String filterParameter;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected SearchComparator comparator;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected SearchModifierCode modifier;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionFilterByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubscriptionFilterBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceType(Uri newResourceType, NotificationChain msgs) {
		Uri oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__RESOURCE_TYPE, oldResourceType, newResourceType);
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
	public void setResourceType(Uri newResourceType) {
		if (newResourceType != resourceType) {
			NotificationChain msgs = null;
			if (resourceType != null)
				msgs = ((InternalEObject)resourceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__RESOURCE_TYPE, null, msgs);
			if (newResourceType != null)
				msgs = ((InternalEObject)newResourceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__RESOURCE_TYPE, null, msgs);
			msgs = basicSetResourceType(newResourceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__RESOURCE_TYPE, newResourceType, newResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getFilterParameter() {
		return filterParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterParameter(org.hl7.emf.fhir.String newFilterParameter, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldFilterParameter = filterParameter;
		filterParameter = newFilterParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__FILTER_PARAMETER, oldFilterParameter, newFilterParameter);
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
	public void setFilterParameter(org.hl7.emf.fhir.String newFilterParameter) {
		if (newFilterParameter != filterParameter) {
			NotificationChain msgs = null;
			if (filterParameter != null)
				msgs = ((InternalEObject)filterParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__FILTER_PARAMETER, null, msgs);
			if (newFilterParameter != null)
				msgs = ((InternalEObject)newFilterParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__FILTER_PARAMETER, null, msgs);
			msgs = basicSetFilterParameter(newFilterParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__FILTER_PARAMETER, newFilterParameter, newFilterParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchComparator getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparator(SearchComparator newComparator, NotificationChain msgs) {
		SearchComparator oldComparator = comparator;
		comparator = newComparator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__COMPARATOR, oldComparator, newComparator);
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
	public void setComparator(SearchComparator newComparator) {
		if (newComparator != comparator) {
			NotificationChain msgs = null;
			if (comparator != null)
				msgs = ((InternalEObject)comparator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__COMPARATOR, null, msgs);
			if (newComparator != null)
				msgs = ((InternalEObject)newComparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__COMPARATOR, null, msgs);
			msgs = basicSetComparator(newComparator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__COMPARATOR, newComparator, newComparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchModifierCode getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifier(SearchModifierCode newModifier, NotificationChain msgs) {
		SearchModifierCode oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__MODIFIER, oldModifier, newModifier);
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
	public void setModifier(SearchModifierCode newModifier) {
		if (newModifier != modifier) {
			NotificationChain msgs = null;
			if (modifier != null)
				msgs = ((InternalEObject)modifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__MODIFIER, null, msgs);
			if (newModifier != null)
				msgs = ((InternalEObject)newModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__MODIFIER, null, msgs);
			msgs = basicSetModifier(newModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__MODIFIER, newModifier, newModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(org.hl7.emf.fhir.String newValue, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__VALUE, oldValue, newValue);
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
	public void setValue(org.hl7.emf.fhir.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_FILTER_BY__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_FILTER_BY__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_FILTER_BY__RESOURCE_TYPE:
				return basicSetResourceType(null, msgs);
			case FhirPackage.SUBSCRIPTION_FILTER_BY__FILTER_PARAMETER:
				return basicSetFilterParameter(null, msgs);
			case FhirPackage.SUBSCRIPTION_FILTER_BY__COMPARATOR:
				return basicSetComparator(null, msgs);
			case FhirPackage.SUBSCRIPTION_FILTER_BY__MODIFIER:
				return basicSetModifier(null, msgs);
			case FhirPackage.SUBSCRIPTION_FILTER_BY__VALUE:
				return basicSetValue(null, msgs);
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
			case FhirPackage.SUBSCRIPTION_FILTER_BY__RESOURCE_TYPE:
				return getResourceType();
			case FhirPackage.SUBSCRIPTION_FILTER_BY__FILTER_PARAMETER:
				return getFilterParameter();
			case FhirPackage.SUBSCRIPTION_FILTER_BY__COMPARATOR:
				return getComparator();
			case FhirPackage.SUBSCRIPTION_FILTER_BY__MODIFIER:
				return getModifier();
			case FhirPackage.SUBSCRIPTION_FILTER_BY__VALUE:
				return getValue();
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
			case FhirPackage.SUBSCRIPTION_FILTER_BY__RESOURCE_TYPE:
				setResourceType((Uri)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__FILTER_PARAMETER:
				setFilterParameter((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__COMPARATOR:
				setComparator((SearchComparator)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__MODIFIER:
				setModifier((SearchModifierCode)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__VALUE:
				setValue((org.hl7.emf.fhir.String)newValue);
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
			case FhirPackage.SUBSCRIPTION_FILTER_BY__RESOURCE_TYPE:
				setResourceType((Uri)null);
				return;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__FILTER_PARAMETER:
				setFilterParameter((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__COMPARATOR:
				setComparator((SearchComparator)null);
				return;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__MODIFIER:
				setModifier((SearchModifierCode)null);
				return;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__VALUE:
				setValue((org.hl7.emf.fhir.String)null);
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
			case FhirPackage.SUBSCRIPTION_FILTER_BY__RESOURCE_TYPE:
				return resourceType != null;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__FILTER_PARAMETER:
				return filterParameter != null;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__COMPARATOR:
				return comparator != null;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__MODIFIER:
				return modifier != null;
			case FhirPackage.SUBSCRIPTION_FILTER_BY__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionFilterByImpl
