/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ResearchSubjectProgress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Subject Progress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectProgressImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectProgressImpl#getSubjectState <em>Subject State</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectProgressImpl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectProgressImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectProgressImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectProgressImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchSubjectProgressImpl extends BackboneElementImpl implements ResearchSubjectProgress {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSubjectState() <em>Subject State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectState()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subjectState;

	/**
	 * The cached value of the '{@link #getMilestone() <em>Milestone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestone()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept milestone;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime startDate;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime endDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchSubjectProgressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResearchSubjectProgress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubjectState() {
		return subjectState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectState(CodeableConcept newSubjectState, NotificationChain msgs) {
		CodeableConcept oldSubjectState = subjectState;
		subjectState = newSubjectState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__SUBJECT_STATE, oldSubjectState, newSubjectState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectState(CodeableConcept newSubjectState) {
		if (newSubjectState != subjectState) {
			NotificationChain msgs = null;
			if (subjectState != null)
				msgs = ((InternalEObject)subjectState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__SUBJECT_STATE, null, msgs);
			if (newSubjectState != null)
				msgs = ((InternalEObject)newSubjectState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__SUBJECT_STATE, null, msgs);
			msgs = basicSetSubjectState(newSubjectState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__SUBJECT_STATE, newSubjectState, newSubjectState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMilestone() {
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMilestone(CodeableConcept newMilestone, NotificationChain msgs) {
		CodeableConcept oldMilestone = milestone;
		milestone = newMilestone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__MILESTONE, oldMilestone, newMilestone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMilestone(CodeableConcept newMilestone) {
		if (newMilestone != milestone) {
			NotificationChain msgs = null;
			if (milestone != null)
				msgs = ((InternalEObject)milestone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__MILESTONE, null, msgs);
			if (newMilestone != null)
				msgs = ((InternalEObject)newMilestone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__MILESTONE, null, msgs);
			msgs = basicSetMilestone(newMilestone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__MILESTONE, newMilestone, newMilestone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableConcept newReason, NotificationChain msgs) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartDate(DateTime newStartDate, NotificationChain msgs) {
		DateTime oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__START_DATE, oldStartDate, newStartDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(DateTime newStartDate) {
		if (newStartDate != startDate) {
			NotificationChain msgs = null;
			if (startDate != null)
				msgs = ((InternalEObject)startDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__START_DATE, null, msgs);
			if (newStartDate != null)
				msgs = ((InternalEObject)newStartDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__START_DATE, null, msgs);
			msgs = basicSetStartDate(newStartDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__START_DATE, newStartDate, newStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDate(DateTime newEndDate, NotificationChain msgs) {
		DateTime oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__END_DATE, oldEndDate, newEndDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(DateTime newEndDate) {
		if (newEndDate != endDate) {
			NotificationChain msgs = null;
			if (endDate != null)
				msgs = ((InternalEObject)endDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__END_DATE, null, msgs);
			if (newEndDate != null)
				msgs = ((InternalEObject)newEndDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT_PROGRESS__END_DATE, null, msgs);
			msgs = basicSetEndDate(newEndDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT_PROGRESS__END_DATE, newEndDate, newEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__SUBJECT_STATE:
				return basicSetSubjectState(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__MILESTONE:
				return basicSetMilestone(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__START_DATE:
				return basicSetStartDate(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__END_DATE:
				return basicSetEndDate(null, msgs);
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
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__TYPE:
				return getType();
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__SUBJECT_STATE:
				return getSubjectState();
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__MILESTONE:
				return getMilestone();
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__REASON:
				return getReason();
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__START_DATE:
				return getStartDate();
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__END_DATE:
				return getEndDate();
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
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__SUBJECT_STATE:
				setSubjectState((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__MILESTONE:
				setMilestone((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__START_DATE:
				setStartDate((DateTime)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__END_DATE:
				setEndDate((DateTime)newValue);
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
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__SUBJECT_STATE:
				setSubjectState((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__MILESTONE:
				setMilestone((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__REASON:
				setReason((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__START_DATE:
				setStartDate((DateTime)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__END_DATE:
				setEndDate((DateTime)null);
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
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__TYPE:
				return type != null;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__SUBJECT_STATE:
				return subjectState != null;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__MILESTONE:
				return milestone != null;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__REASON:
				return reason != null;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__START_DATE:
				return startDate != null;
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS__END_DATE:
				return endDate != null;
		}
		return super.eIsSet(featureID);
	}

} //ResearchSubjectProgressImpl
