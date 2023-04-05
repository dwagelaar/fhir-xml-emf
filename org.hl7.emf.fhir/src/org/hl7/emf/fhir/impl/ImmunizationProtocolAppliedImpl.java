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
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.ImmunizationProtocolApplied;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Protocol Applied</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationProtocolAppliedImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationProtocolAppliedImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationProtocolAppliedImpl#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationProtocolAppliedImpl#getDoseNumber <em>Dose Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationProtocolAppliedImpl#getSeriesDoses <em>Series Doses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationProtocolAppliedImpl extends BackboneElementImpl implements ImmunizationProtocolApplied {
	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String series;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected Reference authority;

	/**
	 * The cached value of the '{@link #getTargetDisease() <em>Target Disease</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisease()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> targetDisease;

	/**
	 * The cached value of the '{@link #getDoseNumber() <em>Dose Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String doseNumber;

	/**
	 * The cached value of the '{@link #getSeriesDoses() <em>Series Doses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDoses()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String seriesDoses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationProtocolAppliedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationProtocolApplied();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(org.hl7.emf.fhir.String newSeries, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, oldSeries, newSeries);
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
	public void setSeries(org.hl7.emf.fhir.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthority(Reference newAuthority, NotificationChain msgs) {
		Reference oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, oldAuthority, newAuthority);
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
	public void setAuthority(Reference newAuthority) {
		if (newAuthority != authority) {
			NotificationChain msgs = null;
			if (authority != null)
				msgs = ((InternalEObject)authority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, null, msgs);
			if (newAuthority != null)
				msgs = ((InternalEObject)newAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, null, msgs);
			msgs = basicSetAuthority(newAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, newAuthority, newAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getTargetDisease() {
		if (targetDisease == null) {
			targetDisease = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE);
		}
		return targetDisease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getDoseNumber() {
		return doseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumber(org.hl7.emf.fhir.String newDoseNumber, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldDoseNumber = doseNumber;
		doseNumber = newDoseNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER, oldDoseNumber, newDoseNumber);
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
	public void setDoseNumber(org.hl7.emf.fhir.String newDoseNumber) {
		if (newDoseNumber != doseNumber) {
			NotificationChain msgs = null;
			if (doseNumber != null)
				msgs = ((InternalEObject)doseNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER, null, msgs);
			if (newDoseNumber != null)
				msgs = ((InternalEObject)newDoseNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER, null, msgs);
			msgs = basicSetDoseNumber(newDoseNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER, newDoseNumber, newDoseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getSeriesDoses() {
		return seriesDoses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDoses(org.hl7.emf.fhir.String newSeriesDoses, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldSeriesDoses = seriesDoses;
		seriesDoses = newSeriesDoses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES, oldSeriesDoses, newSeriesDoses);
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
	public void setSeriesDoses(org.hl7.emf.fhir.String newSeriesDoses) {
		if (newSeriesDoses != seriesDoses) {
			NotificationChain msgs = null;
			if (seriesDoses != null)
				msgs = ((InternalEObject)seriesDoses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES, null, msgs);
			if (newSeriesDoses != null)
				msgs = ((InternalEObject)newSeriesDoses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES, null, msgs);
			msgs = basicSetSeriesDoses(newSeriesDoses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES, newSeriesDoses, newSeriesDoses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				return basicSetSeries(null, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				return basicSetAuthority(null, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				return ((InternalEList<?>)getTargetDisease()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER:
				return basicSetDoseNumber(null, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES:
				return basicSetSeriesDoses(null, msgs);
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
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				return getSeries();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				return getAuthority();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				return getTargetDisease();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER:
				return getDoseNumber();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES:
				return getSeriesDoses();
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
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				setSeries((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				setAuthority((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				getTargetDisease().clear();
				getTargetDisease().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER:
				setDoseNumber((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES:
				setSeriesDoses((org.hl7.emf.fhir.String)newValue);
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
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				setSeries((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				setAuthority((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				getTargetDisease().clear();
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER:
				setDoseNumber((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES:
				setSeriesDoses((org.hl7.emf.fhir.String)null);
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
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				return series != null;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				return authority != null;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				return targetDisease != null && !targetDisease.isEmpty();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER:
				return doseNumber != null;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES:
				return seriesDoses != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationProtocolAppliedImpl
