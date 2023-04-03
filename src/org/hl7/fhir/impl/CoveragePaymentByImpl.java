/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CoveragePaymentBy;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Payment By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoveragePaymentByImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoveragePaymentByImpl#getResponsibility <em>Responsibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoveragePaymentByImpl extends BackboneElementImpl implements CoveragePaymentBy {
	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected Reference party;

	/**
	 * The cached value of the '{@link #getResponsibility() <em>Responsibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String responsibility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoveragePaymentByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoveragePaymentBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getParty() {
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParty(Reference newParty, NotificationChain msgs) {
		Reference oldParty = party;
		party = newParty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_PAYMENT_BY__PARTY, oldParty, newParty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParty(Reference newParty) {
		if (newParty != party) {
			NotificationChain msgs = null;
			if (party != null)
				msgs = ((InternalEObject)party).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_PAYMENT_BY__PARTY, null, msgs);
			if (newParty != null)
				msgs = ((InternalEObject)newParty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_PAYMENT_BY__PARTY, null, msgs);
			msgs = basicSetParty(newParty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_PAYMENT_BY__PARTY, newParty, newParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getResponsibility() {
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibility(org.hl7.fhir.String newResponsibility, NotificationChain msgs) {
		org.hl7.fhir.String oldResponsibility = responsibility;
		responsibility = newResponsibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_PAYMENT_BY__RESPONSIBILITY, oldResponsibility, newResponsibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibility(org.hl7.fhir.String newResponsibility) {
		if (newResponsibility != responsibility) {
			NotificationChain msgs = null;
			if (responsibility != null)
				msgs = ((InternalEObject)responsibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_PAYMENT_BY__RESPONSIBILITY, null, msgs);
			if (newResponsibility != null)
				msgs = ((InternalEObject)newResponsibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_PAYMENT_BY__RESPONSIBILITY, null, msgs);
			msgs = basicSetResponsibility(newResponsibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_PAYMENT_BY__RESPONSIBILITY, newResponsibility, newResponsibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE_PAYMENT_BY__PARTY:
				return basicSetParty(null, msgs);
			case FhirPackage.COVERAGE_PAYMENT_BY__RESPONSIBILITY:
				return basicSetResponsibility(null, msgs);
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
			case FhirPackage.COVERAGE_PAYMENT_BY__PARTY:
				return getParty();
			case FhirPackage.COVERAGE_PAYMENT_BY__RESPONSIBILITY:
				return getResponsibility();
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
			case FhirPackage.COVERAGE_PAYMENT_BY__PARTY:
				setParty((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_PAYMENT_BY__RESPONSIBILITY:
				setResponsibility((org.hl7.fhir.String)newValue);
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
			case FhirPackage.COVERAGE_PAYMENT_BY__PARTY:
				setParty((Reference)null);
				return;
			case FhirPackage.COVERAGE_PAYMENT_BY__RESPONSIBILITY:
				setResponsibility((org.hl7.fhir.String)null);
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
			case FhirPackage.COVERAGE_PAYMENT_BY__PARTY:
				return party != null;
			case FhirPackage.COVERAGE_PAYMENT_BY__RESPONSIBILITY:
				return responsibility != null;
		}
		return super.eIsSet(featureID);
	}

} //CoveragePaymentByImpl
