/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.ActionRelationshipType;
import org.hl7.emf.fhir.Duration;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Id;
import org.hl7.emf.fhir.Range;
import org.hl7.emf.fhir.RequestOrchestrationRelatedAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Orchestration Related Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.RequestOrchestrationRelatedActionImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RequestOrchestrationRelatedActionImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RequestOrchestrationRelatedActionImpl#getEndRelationship <em>End Relationship</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RequestOrchestrationRelatedActionImpl#getOffsetDuration <em>Offset Duration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RequestOrchestrationRelatedActionImpl#getOffsetRange <em>Offset Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestOrchestrationRelatedActionImpl extends BackboneElementImpl implements RequestOrchestrationRelatedAction {
	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected Id targetId;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected ActionRelationshipType relationship;

	/**
	 * The cached value of the '{@link #getEndRelationship() <em>End Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRelationship()
	 * @generated
	 * @ordered
	 */
	protected ActionRelationshipType endRelationship;

	/**
	 * The cached value of the '{@link #getOffsetDuration() <em>Offset Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration offsetDuration;

	/**
	 * The cached value of the '{@link #getOffsetRange() <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetRange()
	 * @generated
	 * @ordered
	 */
	protected Range offsetRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestOrchestrationRelatedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRequestOrchestrationRelatedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetId(Id newTargetId, NotificationChain msgs) {
		Id oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__TARGET_ID, oldTargetId, newTargetId);
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
	public void setTargetId(Id newTargetId) {
		if (newTargetId != targetId) {
			NotificationChain msgs = null;
			if (targetId != null)
				msgs = ((InternalEObject)targetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__TARGET_ID, null, msgs);
			if (newTargetId != null)
				msgs = ((InternalEObject)newTargetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__TARGET_ID, null, msgs);
			msgs = basicSetTargetId(newTargetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__TARGET_ID, newTargetId, newTargetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionRelationshipType getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(ActionRelationshipType newRelationship, NotificationChain msgs) {
		ActionRelationshipType oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(ActionRelationshipType newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionRelationshipType getEndRelationship() {
		return endRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndRelationship(ActionRelationshipType newEndRelationship, NotificationChain msgs) {
		ActionRelationshipType oldEndRelationship = endRelationship;
		endRelationship = newEndRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__END_RELATIONSHIP, oldEndRelationship, newEndRelationship);
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
	public void setEndRelationship(ActionRelationshipType newEndRelationship) {
		if (newEndRelationship != endRelationship) {
			NotificationChain msgs = null;
			if (endRelationship != null)
				msgs = ((InternalEObject)endRelationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__END_RELATIONSHIP, null, msgs);
			if (newEndRelationship != null)
				msgs = ((InternalEObject)newEndRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__END_RELATIONSHIP, null, msgs);
			msgs = basicSetEndRelationship(newEndRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__END_RELATIONSHIP, newEndRelationship, newEndRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getOffsetDuration() {
		return offsetDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetDuration(Duration newOffsetDuration, NotificationChain msgs) {
		Duration oldOffsetDuration = offsetDuration;
		offsetDuration = newOffsetDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_DURATION, oldOffsetDuration, newOffsetDuration);
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
	public void setOffsetDuration(Duration newOffsetDuration) {
		if (newOffsetDuration != offsetDuration) {
			NotificationChain msgs = null;
			if (offsetDuration != null)
				msgs = ((InternalEObject)offsetDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_DURATION, null, msgs);
			if (newOffsetDuration != null)
				msgs = ((InternalEObject)newOffsetDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_DURATION, null, msgs);
			msgs = basicSetOffsetDuration(newOffsetDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_DURATION, newOffsetDuration, newOffsetDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getOffsetRange() {
		return offsetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetRange(Range newOffsetRange, NotificationChain msgs) {
		Range oldOffsetRange = offsetRange;
		offsetRange = newOffsetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_RANGE, oldOffsetRange, newOffsetRange);
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
	public void setOffsetRange(Range newOffsetRange) {
		if (newOffsetRange != offsetRange) {
			NotificationChain msgs = null;
			if (offsetRange != null)
				msgs = ((InternalEObject)offsetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_RANGE, null, msgs);
			if (newOffsetRange != null)
				msgs = ((InternalEObject)newOffsetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_RANGE, null, msgs);
			msgs = basicSetOffsetRange(newOffsetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_RANGE, newOffsetRange, newOffsetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__TARGET_ID:
				return basicSetTargetId(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__END_RELATIONSHIP:
				return basicSetEndRelationship(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_DURATION:
				return basicSetOffsetDuration(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_RANGE:
				return basicSetOffsetRange(null, msgs);
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
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__TARGET_ID:
				return getTargetId();
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__END_RELATIONSHIP:
				return getEndRelationship();
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_DURATION:
				return getOffsetDuration();
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_RANGE:
				return getOffsetRange();
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
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__TARGET_ID:
				setTargetId((Id)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((ActionRelationshipType)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__END_RELATIONSHIP:
				setEndRelationship((ActionRelationshipType)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_DURATION:
				setOffsetDuration((Duration)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_RANGE:
				setOffsetRange((Range)newValue);
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
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__TARGET_ID:
				setTargetId((Id)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((ActionRelationshipType)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__END_RELATIONSHIP:
				setEndRelationship((ActionRelationshipType)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_DURATION:
				setOffsetDuration((Duration)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_RANGE:
				setOffsetRange((Range)null);
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
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__TARGET_ID:
				return targetId != null;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__END_RELATIONSHIP:
				return endRelationship != null;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_DURATION:
				return offsetDuration != null;
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION__OFFSET_RANGE:
				return offsetRange != null;
		}
		return super.eIsSet(featureID);
	}

} //RequestOrchestrationRelatedActionImpl
