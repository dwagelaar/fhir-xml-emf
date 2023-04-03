/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.DeviceDefinitionMarketDistribution;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Market Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionMarketDistributionImpl#getMarketPeriod <em>Market Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionMarketDistributionImpl#getSubJurisdiction <em>Sub Jurisdiction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionMarketDistributionImpl extends BackboneElementImpl implements DeviceDefinitionMarketDistribution {
	/**
	 * The cached value of the '{@link #getMarketPeriod() <em>Market Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period marketPeriod;

	/**
	 * The cached value of the '{@link #getSubJurisdiction() <em>Sub Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected Uri subJurisdiction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionMarketDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinitionMarketDistribution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getMarketPeriod() {
		return marketPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketPeriod(Period newMarketPeriod, NotificationChain msgs) {
		Period oldMarketPeriod = marketPeriod;
		marketPeriod = newMarketPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__MARKET_PERIOD, oldMarketPeriod, newMarketPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketPeriod(Period newMarketPeriod) {
		if (newMarketPeriod != marketPeriod) {
			NotificationChain msgs = null;
			if (marketPeriod != null)
				msgs = ((InternalEObject)marketPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__MARKET_PERIOD, null, msgs);
			if (newMarketPeriod != null)
				msgs = ((InternalEObject)newMarketPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__MARKET_PERIOD, null, msgs);
			msgs = basicSetMarketPeriod(newMarketPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__MARKET_PERIOD, newMarketPeriod, newMarketPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSubJurisdiction() {
		return subJurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubJurisdiction(Uri newSubJurisdiction, NotificationChain msgs) {
		Uri oldSubJurisdiction = subJurisdiction;
		subJurisdiction = newSubJurisdiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__SUB_JURISDICTION, oldSubJurisdiction, newSubJurisdiction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubJurisdiction(Uri newSubJurisdiction) {
		if (newSubJurisdiction != subJurisdiction) {
			NotificationChain msgs = null;
			if (subJurisdiction != null)
				msgs = ((InternalEObject)subJurisdiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__SUB_JURISDICTION, null, msgs);
			if (newSubJurisdiction != null)
				msgs = ((InternalEObject)newSubJurisdiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__SUB_JURISDICTION, null, msgs);
			msgs = basicSetSubJurisdiction(newSubJurisdiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__SUB_JURISDICTION, newSubJurisdiction, newSubJurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__MARKET_PERIOD:
				return basicSetMarketPeriod(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__SUB_JURISDICTION:
				return basicSetSubJurisdiction(null, msgs);
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
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__MARKET_PERIOD:
				return getMarketPeriod();
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__SUB_JURISDICTION:
				return getSubJurisdiction();
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
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__MARKET_PERIOD:
				setMarketPeriod((Period)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__SUB_JURISDICTION:
				setSubJurisdiction((Uri)newValue);
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
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__MARKET_PERIOD:
				setMarketPeriod((Period)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__SUB_JURISDICTION:
				setSubJurisdiction((Uri)null);
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
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__MARKET_PERIOD:
				return marketPeriod != null;
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION__SUB_JURISDICTION:
				return subJurisdiction != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionMarketDistributionImpl
