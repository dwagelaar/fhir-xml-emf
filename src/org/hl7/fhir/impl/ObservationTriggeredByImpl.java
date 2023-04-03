/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ObservationTriggeredBy;
import org.hl7.fhir.Reference;
import org.hl7.fhir.TriggeredBytype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Triggered By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationTriggeredByImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationTriggeredByImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationTriggeredByImpl#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationTriggeredByImpl extends BackboneElementImpl implements ObservationTriggeredBy {
	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected Reference observation;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TriggeredBytype type;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String reason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationTriggeredByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getObservationTriggeredBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(Reference newObservation, NotificationChain msgs) {
		Reference oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_TRIGGERED_BY__OBSERVATION, oldObservation, newObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(Reference newObservation) {
		if (newObservation != observation) {
			NotificationChain msgs = null;
			if (observation != null)
				msgs = ((InternalEObject)observation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_TRIGGERED_BY__OBSERVATION, null, msgs);
			if (newObservation != null)
				msgs = ((InternalEObject)newObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_TRIGGERED_BY__OBSERVATION, null, msgs);
			msgs = basicSetObservation(newObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_TRIGGERED_BY__OBSERVATION, newObservation, newObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggeredBytype getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TriggeredBytype newType, NotificationChain msgs) {
		TriggeredBytype oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_TRIGGERED_BY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TriggeredBytype newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_TRIGGERED_BY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_TRIGGERED_BY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_TRIGGERED_BY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(org.hl7.fhir.String newReason, NotificationChain msgs) {
		org.hl7.fhir.String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_TRIGGERED_BY__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(org.hl7.fhir.String newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_TRIGGERED_BY__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_TRIGGERED_BY__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_TRIGGERED_BY__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OBSERVATION_TRIGGERED_BY__OBSERVATION:
				return basicSetObservation(null, msgs);
			case FhirPackage.OBSERVATION_TRIGGERED_BY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.OBSERVATION_TRIGGERED_BY__REASON:
				return basicSetReason(null, msgs);
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
			case FhirPackage.OBSERVATION_TRIGGERED_BY__OBSERVATION:
				return getObservation();
			case FhirPackage.OBSERVATION_TRIGGERED_BY__TYPE:
				return getType();
			case FhirPackage.OBSERVATION_TRIGGERED_BY__REASON:
				return getReason();
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
			case FhirPackage.OBSERVATION_TRIGGERED_BY__OBSERVATION:
				setObservation((Reference)newValue);
				return;
			case FhirPackage.OBSERVATION_TRIGGERED_BY__TYPE:
				setType((TriggeredBytype)newValue);
				return;
			case FhirPackage.OBSERVATION_TRIGGERED_BY__REASON:
				setReason((org.hl7.fhir.String)newValue);
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
			case FhirPackage.OBSERVATION_TRIGGERED_BY__OBSERVATION:
				setObservation((Reference)null);
				return;
			case FhirPackage.OBSERVATION_TRIGGERED_BY__TYPE:
				setType((TriggeredBytype)null);
				return;
			case FhirPackage.OBSERVATION_TRIGGERED_BY__REASON:
				setReason((org.hl7.fhir.String)null);
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
			case FhirPackage.OBSERVATION_TRIGGERED_BY__OBSERVATION:
				return observation != null;
			case FhirPackage.OBSERVATION_TRIGGERED_BY__TYPE:
				return type != null;
			case FhirPackage.OBSERVATION_TRIGGERED_BY__REASON:
				return reason != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationTriggeredByImpl
