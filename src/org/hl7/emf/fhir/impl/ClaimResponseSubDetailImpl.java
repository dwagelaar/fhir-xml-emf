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

import org.hl7.emf.fhir.ClaimResponseAdjudication;
import org.hl7.emf.fhir.ClaimResponseReviewOutcome;
import org.hl7.emf.fhir.ClaimResponseSubDetail;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Sub Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ClaimResponseSubDetailImpl#getSubDetailSequence <em>Sub Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClaimResponseSubDetailImpl#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClaimResponseSubDetailImpl#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClaimResponseSubDetailImpl#getReviewOutcome <em>Review Outcome</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClaimResponseSubDetailImpl#getAdjudication <em>Adjudication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseSubDetailImpl extends BackboneElementImpl implements ClaimResponseSubDetail {
	/**
	 * The cached value of the '{@link #getSubDetailSequence() <em>Sub Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetailSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt subDetailSequence;

	/**
	 * The cached value of the '{@link #getTraceNumber() <em>Trace Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> traceNumber;

	/**
	 * The cached value of the '{@link #getNoteNumber() <em>Note Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumber;

	/**
	 * The cached value of the '{@link #getReviewOutcome() <em>Review Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOutcome()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponseReviewOutcome reviewOutcome;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAdjudication> adjudication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseSubDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponseSubDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSubDetailSequence() {
		return subDetailSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubDetailSequence(PositiveInt newSubDetailSequence, NotificationChain msgs) {
		PositiveInt oldSubDetailSequence = subDetailSequence;
		subDetailSequence = newSubDetailSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__SUB_DETAIL_SEQUENCE, oldSubDetailSequence, newSubDetailSequence);
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
	public void setSubDetailSequence(PositiveInt newSubDetailSequence) {
		if (newSubDetailSequence != subDetailSequence) {
			NotificationChain msgs = null;
			if (subDetailSequence != null)
				msgs = ((InternalEObject)subDetailSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__SUB_DETAIL_SEQUENCE, null, msgs);
			if (newSubDetailSequence != null)
				msgs = ((InternalEObject)newSubDetailSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__SUB_DETAIL_SEQUENCE, null, msgs);
			msgs = basicSetSubDetailSequence(newSubDetailSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__SUB_DETAIL_SEQUENCE, newSubDetailSequence, newSubDetailSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getTraceNumber() {
		if (traceNumber == null) {
			traceNumber = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__TRACE_NUMBER);
		}
		return traceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getNoteNumber() {
		if (noteNumber == null) {
			noteNumber = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__NOTE_NUMBER);
		}
		return noteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseReviewOutcome getReviewOutcome() {
		return reviewOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewOutcome(ClaimResponseReviewOutcome newReviewOutcome, NotificationChain msgs) {
		ClaimResponseReviewOutcome oldReviewOutcome = reviewOutcome;
		reviewOutcome = newReviewOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__REVIEW_OUTCOME, oldReviewOutcome, newReviewOutcome);
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
	public void setReviewOutcome(ClaimResponseReviewOutcome newReviewOutcome) {
		if (newReviewOutcome != reviewOutcome) {
			NotificationChain msgs = null;
			if (reviewOutcome != null)
				msgs = ((InternalEObject)reviewOutcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__REVIEW_OUTCOME, null, msgs);
			if (newReviewOutcome != null)
				msgs = ((InternalEObject)newReviewOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__REVIEW_OUTCOME, null, msgs);
			msgs = basicSetReviewOutcome(newReviewOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__REVIEW_OUTCOME, newReviewOutcome, newReviewOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseAdjudication> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ClaimResponseAdjudication>(ClaimResponseAdjudication.class, this, FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__SUB_DETAIL_SEQUENCE:
				return basicSetSubDetailSequence(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__TRACE_NUMBER:
				return ((InternalEList<?>)getTraceNumber()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumber()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__REVIEW_OUTCOME:
				return basicSetReviewOutcome(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__SUB_DETAIL_SEQUENCE:
				return getSubDetailSequence();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__TRACE_NUMBER:
				return getTraceNumber();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__NOTE_NUMBER:
				return getNoteNumber();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__REVIEW_OUTCOME:
				return getReviewOutcome();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__ADJUDICATION:
				return getAdjudication();
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
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__SUB_DETAIL_SEQUENCE:
				setSubDetailSequence((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__TRACE_NUMBER:
				getTraceNumber().clear();
				getTraceNumber().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__NOTE_NUMBER:
				getNoteNumber().clear();
				getNoteNumber().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__REVIEW_OUTCOME:
				setReviewOutcome((ClaimResponseReviewOutcome)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ClaimResponseAdjudication>)newValue);
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
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__SUB_DETAIL_SEQUENCE:
				setSubDetailSequence((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__TRACE_NUMBER:
				getTraceNumber().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__NOTE_NUMBER:
				getNoteNumber().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__REVIEW_OUTCOME:
				setReviewOutcome((ClaimResponseReviewOutcome)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__ADJUDICATION:
				getAdjudication().clear();
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
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__SUB_DETAIL_SEQUENCE:
				return subDetailSequence != null;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__TRACE_NUMBER:
				return traceNumber != null && !traceNumber.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__NOTE_NUMBER:
				return noteNumber != null && !noteNumber.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__REVIEW_OUTCOME:
				return reviewOutcome != null;
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseSubDetailImpl
