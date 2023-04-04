/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.ResearchStudyRecruitment;
import org.hl7.emf.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Study Recruitment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyRecruitmentImpl#getTargetNumber <em>Target Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyRecruitmentImpl#getActualNumber <em>Actual Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyRecruitmentImpl#getEligibility <em>Eligibility</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyRecruitmentImpl#getActualGroup <em>Actual Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchStudyRecruitmentImpl extends BackboneElementImpl implements ResearchStudyRecruitment {
	/**
	 * The cached value of the '{@link #getTargetNumber() <em>Target Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNumber()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt targetNumber;

	/**
	 * The cached value of the '{@link #getActualNumber() <em>Actual Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualNumber()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt actualNumber;

	/**
	 * The cached value of the '{@link #getEligibility() <em>Eligibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibility()
	 * @generated
	 * @ordered
	 */
	protected Reference eligibility;

	/**
	 * The cached value of the '{@link #getActualGroup() <em>Actual Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualGroup()
	 * @generated
	 * @ordered
	 */
	protected Reference actualGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchStudyRecruitmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResearchStudyRecruitment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getTargetNumber() {
		return targetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetNumber(UnsignedInt newTargetNumber, NotificationChain msgs) {
		UnsignedInt oldTargetNumber = targetNumber;
		targetNumber = newTargetNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_RECRUITMENT__TARGET_NUMBER, oldTargetNumber, newTargetNumber);
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
	public void setTargetNumber(UnsignedInt newTargetNumber) {
		if (newTargetNumber != targetNumber) {
			NotificationChain msgs = null;
			if (targetNumber != null)
				msgs = ((InternalEObject)targetNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_RECRUITMENT__TARGET_NUMBER, null, msgs);
			if (newTargetNumber != null)
				msgs = ((InternalEObject)newTargetNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_RECRUITMENT__TARGET_NUMBER, null, msgs);
			msgs = basicSetTargetNumber(newTargetNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_RECRUITMENT__TARGET_NUMBER, newTargetNumber, newTargetNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getActualNumber() {
		return actualNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualNumber(UnsignedInt newActualNumber, NotificationChain msgs) {
		UnsignedInt oldActualNumber = actualNumber;
		actualNumber = newActualNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_NUMBER, oldActualNumber, newActualNumber);
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
	public void setActualNumber(UnsignedInt newActualNumber) {
		if (newActualNumber != actualNumber) {
			NotificationChain msgs = null;
			if (actualNumber != null)
				msgs = ((InternalEObject)actualNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_NUMBER, null, msgs);
			if (newActualNumber != null)
				msgs = ((InternalEObject)newActualNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_NUMBER, null, msgs);
			msgs = basicSetActualNumber(newActualNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_NUMBER, newActualNumber, newActualNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEligibility() {
		return eligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEligibility(Reference newEligibility, NotificationChain msgs) {
		Reference oldEligibility = eligibility;
		eligibility = newEligibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_RECRUITMENT__ELIGIBILITY, oldEligibility, newEligibility);
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
	public void setEligibility(Reference newEligibility) {
		if (newEligibility != eligibility) {
			NotificationChain msgs = null;
			if (eligibility != null)
				msgs = ((InternalEObject)eligibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_RECRUITMENT__ELIGIBILITY, null, msgs);
			if (newEligibility != null)
				msgs = ((InternalEObject)newEligibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_RECRUITMENT__ELIGIBILITY, null, msgs);
			msgs = basicSetEligibility(newEligibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_RECRUITMENT__ELIGIBILITY, newEligibility, newEligibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getActualGroup() {
		return actualGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualGroup(Reference newActualGroup, NotificationChain msgs) {
		Reference oldActualGroup = actualGroup;
		actualGroup = newActualGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_GROUP, oldActualGroup, newActualGroup);
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
	public void setActualGroup(Reference newActualGroup) {
		if (newActualGroup != actualGroup) {
			NotificationChain msgs = null;
			if (actualGroup != null)
				msgs = ((InternalEObject)actualGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_GROUP, null, msgs);
			if (newActualGroup != null)
				msgs = ((InternalEObject)newActualGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_GROUP, null, msgs);
			msgs = basicSetActualGroup(newActualGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_GROUP, newActualGroup, newActualGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__TARGET_NUMBER:
				return basicSetTargetNumber(null, msgs);
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_NUMBER:
				return basicSetActualNumber(null, msgs);
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ELIGIBILITY:
				return basicSetEligibility(null, msgs);
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_GROUP:
				return basicSetActualGroup(null, msgs);
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
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__TARGET_NUMBER:
				return getTargetNumber();
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_NUMBER:
				return getActualNumber();
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ELIGIBILITY:
				return getEligibility();
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_GROUP:
				return getActualGroup();
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
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__TARGET_NUMBER:
				setTargetNumber((UnsignedInt)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_NUMBER:
				setActualNumber((UnsignedInt)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ELIGIBILITY:
				setEligibility((Reference)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_GROUP:
				setActualGroup((Reference)newValue);
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
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__TARGET_NUMBER:
				setTargetNumber((UnsignedInt)null);
				return;
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_NUMBER:
				setActualNumber((UnsignedInt)null);
				return;
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ELIGIBILITY:
				setEligibility((Reference)null);
				return;
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_GROUP:
				setActualGroup((Reference)null);
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
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__TARGET_NUMBER:
				return targetNumber != null;
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_NUMBER:
				return actualNumber != null;
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ELIGIBILITY:
				return eligibility != null;
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT__ACTUAL_GROUP:
				return actualGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ResearchStudyRecruitmentImpl
