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

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.ExplanationOfBenefitReviewOutcome;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Review Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ExplanationOfBenefitReviewOutcomeImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ExplanationOfBenefitReviewOutcomeImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ExplanationOfBenefitReviewOutcomeImpl#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ExplanationOfBenefitReviewOutcomeImpl#getPreAuthPeriod <em>Pre Auth Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitReviewOutcomeImpl extends BackboneElementImpl implements ExplanationOfBenefitReviewOutcome {
	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept decision;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reason;

	/**
	 * The cached value of the '{@link #getPreAuthRef() <em>Pre Auth Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRef()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String preAuthRef;

	/**
	 * The cached value of the '{@link #getPreAuthPeriod() <em>Pre Auth Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period preAuthPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitReviewOutcomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitReviewOutcome();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDecision() {
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(CodeableConcept newDecision, NotificationChain msgs) {
		CodeableConcept oldDecision = decision;
		decision = newDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__DECISION, oldDecision, newDecision);
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
	public void setDecision(CodeableConcept newDecision) {
		if (newDecision != decision) {
			NotificationChain msgs = null;
			if (decision != null)
				msgs = ((InternalEObject)decision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__DECISION, null, msgs);
			if (newDecision != null)
				msgs = ((InternalEObject)newDecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__DECISION, null, msgs);
			msgs = basicSetDecision(newDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__DECISION, newDecision, newDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getPreAuthRef() {
		return preAuthRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAuthRef(org.hl7.emf.fhir.String newPreAuthRef, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldPreAuthRef = preAuthRef;
		preAuthRef = newPreAuthRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_REF, oldPreAuthRef, newPreAuthRef);
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
	public void setPreAuthRef(org.hl7.emf.fhir.String newPreAuthRef) {
		if (newPreAuthRef != preAuthRef) {
			NotificationChain msgs = null;
			if (preAuthRef != null)
				msgs = ((InternalEObject)preAuthRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_REF, null, msgs);
			if (newPreAuthRef != null)
				msgs = ((InternalEObject)newPreAuthRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_REF, null, msgs);
			msgs = basicSetPreAuthRef(newPreAuthRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_REF, newPreAuthRef, newPreAuthRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPreAuthPeriod() {
		return preAuthPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAuthPeriod(Period newPreAuthPeriod, NotificationChain msgs) {
		Period oldPreAuthPeriod = preAuthPeriod;
		preAuthPeriod = newPreAuthPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_PERIOD, oldPreAuthPeriod, newPreAuthPeriod);
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
	public void setPreAuthPeriod(Period newPreAuthPeriod) {
		if (newPreAuthPeriod != preAuthPeriod) {
			NotificationChain msgs = null;
			if (preAuthPeriod != null)
				msgs = ((InternalEObject)preAuthPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_PERIOD, null, msgs);
			if (newPreAuthPeriod != null)
				msgs = ((InternalEObject)newPreAuthPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_PERIOD, null, msgs);
			msgs = basicSetPreAuthPeriod(newPreAuthPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_PERIOD, newPreAuthPeriod, newPreAuthPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__DECISION:
				return basicSetDecision(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_REF:
				return basicSetPreAuthRef(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_PERIOD:
				return basicSetPreAuthPeriod(null, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__DECISION:
				return getDecision();
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__REASON:
				return getReason();
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_REF:
				return getPreAuthRef();
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_PERIOD:
				return getPreAuthPeriod();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__DECISION:
				setDecision((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_REF:
				setPreAuthRef((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_PERIOD:
				setPreAuthPeriod((Period)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__DECISION:
				setDecision((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__REASON:
				getReason().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_REF:
				setPreAuthRef((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_PERIOD:
				setPreAuthPeriod((Period)null);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__DECISION:
				return decision != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_REF:
				return preAuthRef != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME__PRE_AUTH_PERIOD:
				return preAuthPeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitReviewOutcomeImpl
