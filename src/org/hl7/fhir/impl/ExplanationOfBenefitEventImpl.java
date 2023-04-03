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
import org.hl7.fhir.ExplanationOfBenefitEvent;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitEventImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitEventImpl#getWhenDateTime <em>When Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitEventImpl#getWhenPeriod <em>When Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitEventImpl extends BackboneElementImpl implements ExplanationOfBenefitEvent {
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
	 * The cached value of the '{@link #getWhenDateTime() <em>When Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenDateTime;

	/**
	 * The cached value of the '{@link #getWhenPeriod() <em>When Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period whenPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitEvent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenDateTime() {
		return whenDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenDateTime(DateTime newWhenDateTime, NotificationChain msgs) {
		DateTime oldWhenDateTime = whenDateTime;
		whenDateTime = newWhenDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_DATE_TIME, oldWhenDateTime, newWhenDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenDateTime(DateTime newWhenDateTime) {
		if (newWhenDateTime != whenDateTime) {
			NotificationChain msgs = null;
			if (whenDateTime != null)
				msgs = ((InternalEObject)whenDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_DATE_TIME, null, msgs);
			if (newWhenDateTime != null)
				msgs = ((InternalEObject)newWhenDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_DATE_TIME, null, msgs);
			msgs = basicSetWhenDateTime(newWhenDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_DATE_TIME, newWhenDateTime, newWhenDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getWhenPeriod() {
		return whenPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenPeriod(Period newWhenPeriod, NotificationChain msgs) {
		Period oldWhenPeriod = whenPeriod;
		whenPeriod = newWhenPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_PERIOD, oldWhenPeriod, newWhenPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenPeriod(Period newWhenPeriod) {
		if (newWhenPeriod != whenPeriod) {
			NotificationChain msgs = null;
			if (whenPeriod != null)
				msgs = ((InternalEObject)whenPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_PERIOD, null, msgs);
			if (newWhenPeriod != null)
				msgs = ((InternalEObject)newWhenPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_PERIOD, null, msgs);
			msgs = basicSetWhenPeriod(newWhenPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_PERIOD, newWhenPeriod, newWhenPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_DATE_TIME:
				return basicSetWhenDateTime(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_PERIOD:
				return basicSetWhenPeriod(null, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__TYPE:
				return getType();
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_DATE_TIME:
				return getWhenDateTime();
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_PERIOD:
				return getWhenPeriod();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_DATE_TIME:
				setWhenDateTime((DateTime)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_PERIOD:
				setWhenPeriod((Period)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_DATE_TIME:
				setWhenDateTime((DateTime)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_PERIOD:
				setWhenPeriod((Period)null);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__TYPE:
				return type != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_DATE_TIME:
				return whenDateTime != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT__WHEN_PERIOD:
				return whenPeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitEventImpl
