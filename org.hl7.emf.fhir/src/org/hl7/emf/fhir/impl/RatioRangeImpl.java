/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.RatioRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.RatioRangeImpl#getLowNumerator <em>Low Numerator</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RatioRangeImpl#getHighNumerator <em>High Numerator</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RatioRangeImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioRangeImpl extends DataTypeImpl implements RatioRange {
	/**
	 * The cached value of the '{@link #getLowNumerator() <em>Low Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowNumerator()
	 * @generated
	 * @ordered
	 */
	protected Quantity lowNumerator;

	/**
	 * The cached value of the '{@link #getHighNumerator() <em>High Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighNumerator()
	 * @generated
	 * @ordered
	 */
	protected Quantity highNumerator;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected Quantity denominator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRatioRange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getLowNumerator() {
		return lowNumerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowNumerator(Quantity newLowNumerator, NotificationChain msgs) {
		Quantity oldLowNumerator = lowNumerator;
		lowNumerator = newLowNumerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO_RANGE__LOW_NUMERATOR, oldLowNumerator, newLowNumerator);
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
	public void setLowNumerator(Quantity newLowNumerator) {
		if (newLowNumerator != lowNumerator) {
			NotificationChain msgs = null;
			if (lowNumerator != null)
				msgs = ((InternalEObject)lowNumerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO_RANGE__LOW_NUMERATOR, null, msgs);
			if (newLowNumerator != null)
				msgs = ((InternalEObject)newLowNumerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO_RANGE__LOW_NUMERATOR, null, msgs);
			msgs = basicSetLowNumerator(newLowNumerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO_RANGE__LOW_NUMERATOR, newLowNumerator, newLowNumerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getHighNumerator() {
		return highNumerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHighNumerator(Quantity newHighNumerator, NotificationChain msgs) {
		Quantity oldHighNumerator = highNumerator;
		highNumerator = newHighNumerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO_RANGE__HIGH_NUMERATOR, oldHighNumerator, newHighNumerator);
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
	public void setHighNumerator(Quantity newHighNumerator) {
		if (newHighNumerator != highNumerator) {
			NotificationChain msgs = null;
			if (highNumerator != null)
				msgs = ((InternalEObject)highNumerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO_RANGE__HIGH_NUMERATOR, null, msgs);
			if (newHighNumerator != null)
				msgs = ((InternalEObject)newHighNumerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO_RANGE__HIGH_NUMERATOR, null, msgs);
			msgs = basicSetHighNumerator(newHighNumerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO_RANGE__HIGH_NUMERATOR, newHighNumerator, newHighNumerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenominator(Quantity newDenominator, NotificationChain msgs) {
		Quantity oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO_RANGE__DENOMINATOR, oldDenominator, newDenominator);
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
	public void setDenominator(Quantity newDenominator) {
		if (newDenominator != denominator) {
			NotificationChain msgs = null;
			if (denominator != null)
				msgs = ((InternalEObject)denominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO_RANGE__DENOMINATOR, null, msgs);
			if (newDenominator != null)
				msgs = ((InternalEObject)newDenominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO_RANGE__DENOMINATOR, null, msgs);
			msgs = basicSetDenominator(newDenominator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO_RANGE__DENOMINATOR, newDenominator, newDenominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RATIO_RANGE__LOW_NUMERATOR:
				return basicSetLowNumerator(null, msgs);
			case FhirPackage.RATIO_RANGE__HIGH_NUMERATOR:
				return basicSetHighNumerator(null, msgs);
			case FhirPackage.RATIO_RANGE__DENOMINATOR:
				return basicSetDenominator(null, msgs);
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
			case FhirPackage.RATIO_RANGE__LOW_NUMERATOR:
				return getLowNumerator();
			case FhirPackage.RATIO_RANGE__HIGH_NUMERATOR:
				return getHighNumerator();
			case FhirPackage.RATIO_RANGE__DENOMINATOR:
				return getDenominator();
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
			case FhirPackage.RATIO_RANGE__LOW_NUMERATOR:
				setLowNumerator((Quantity)newValue);
				return;
			case FhirPackage.RATIO_RANGE__HIGH_NUMERATOR:
				setHighNumerator((Quantity)newValue);
				return;
			case FhirPackage.RATIO_RANGE__DENOMINATOR:
				setDenominator((Quantity)newValue);
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
			case FhirPackage.RATIO_RANGE__LOW_NUMERATOR:
				setLowNumerator((Quantity)null);
				return;
			case FhirPackage.RATIO_RANGE__HIGH_NUMERATOR:
				setHighNumerator((Quantity)null);
				return;
			case FhirPackage.RATIO_RANGE__DENOMINATOR:
				setDenominator((Quantity)null);
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
			case FhirPackage.RATIO_RANGE__LOW_NUMERATOR:
				return lowNumerator != null;
			case FhirPackage.RATIO_RANGE__HIGH_NUMERATOR:
				return highNumerator != null;
			case FhirPackage.RATIO_RANGE__DENOMINATOR:
				return denominator != null;
		}
		return super.eIsSet(featureID);
	}

} //RatioRangeImpl
