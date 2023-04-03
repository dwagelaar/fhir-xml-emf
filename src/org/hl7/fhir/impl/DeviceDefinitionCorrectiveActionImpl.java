/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.DeviceCorrectiveActionScope;
import org.hl7.fhir.DeviceDefinitionCorrectiveAction;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Corrective Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionCorrectiveActionImpl#getRecall <em>Recall</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionCorrectiveActionImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionCorrectiveActionImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionCorrectiveActionImpl extends BackboneElementImpl implements DeviceDefinitionCorrectiveAction {
	/**
	 * The cached value of the '{@link #getRecall() <em>Recall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecall()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean recall;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected DeviceCorrectiveActionScope scope;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionCorrectiveActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinitionCorrectiveAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRecall() {
		return recall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecall(org.hl7.fhir.Boolean newRecall, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRecall = recall;
		recall = newRecall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__RECALL, oldRecall, newRecall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecall(org.hl7.fhir.Boolean newRecall) {
		if (newRecall != recall) {
			NotificationChain msgs = null;
			if (recall != null)
				msgs = ((InternalEObject)recall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__RECALL, null, msgs);
			if (newRecall != null)
				msgs = ((InternalEObject)newRecall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__RECALL, null, msgs);
			msgs = basicSetRecall(newRecall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__RECALL, newRecall, newRecall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceCorrectiveActionScope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(DeviceCorrectiveActionScope newScope, NotificationChain msgs) {
		DeviceCorrectiveActionScope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(DeviceCorrectiveActionScope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__RECALL:
				return basicSetRecall(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__SCOPE:
				return basicSetScope(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__RECALL:
				return getRecall();
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__SCOPE:
				return getScope();
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__PERIOD:
				return getPeriod();
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
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__RECALL:
				setRecall((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__SCOPE:
				setScope((DeviceCorrectiveActionScope)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__PERIOD:
				setPeriod((Period)newValue);
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
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__RECALL:
				setRecall((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__SCOPE:
				setScope((DeviceCorrectiveActionScope)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__PERIOD:
				setPeriod((Period)null);
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
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__RECALL:
				return recall != null;
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__SCOPE:
				return scope != null;
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionCorrectiveActionImpl
