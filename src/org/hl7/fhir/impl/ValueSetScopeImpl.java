/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ValueSetScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetScopeImpl#getInclusionCriteria <em>Inclusion Criteria</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetScopeImpl#getExclusionCriteria <em>Exclusion Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetScopeImpl extends BackboneElementImpl implements ValueSetScope {
	/**
	 * The cached value of the '{@link #getInclusionCriteria() <em>Inclusion Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusionCriteria()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String inclusionCriteria;

	/**
	 * The cached value of the '{@link #getExclusionCriteria() <em>Exclusion Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionCriteria()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String exclusionCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getValueSetScope();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getInclusionCriteria() {
		return inclusionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclusionCriteria(org.hl7.fhir.String newInclusionCriteria, NotificationChain msgs) {
		org.hl7.fhir.String oldInclusionCriteria = inclusionCriteria;
		inclusionCriteria = newInclusionCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_SCOPE__INCLUSION_CRITERIA, oldInclusionCriteria, newInclusionCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclusionCriteria(org.hl7.fhir.String newInclusionCriteria) {
		if (newInclusionCriteria != inclusionCriteria) {
			NotificationChain msgs = null;
			if (inclusionCriteria != null)
				msgs = ((InternalEObject)inclusionCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_SCOPE__INCLUSION_CRITERIA, null, msgs);
			if (newInclusionCriteria != null)
				msgs = ((InternalEObject)newInclusionCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_SCOPE__INCLUSION_CRITERIA, null, msgs);
			msgs = basicSetInclusionCriteria(newInclusionCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_SCOPE__INCLUSION_CRITERIA, newInclusionCriteria, newInclusionCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getExclusionCriteria() {
		return exclusionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclusionCriteria(org.hl7.fhir.String newExclusionCriteria, NotificationChain msgs) {
		org.hl7.fhir.String oldExclusionCriteria = exclusionCriteria;
		exclusionCriteria = newExclusionCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_SCOPE__EXCLUSION_CRITERIA, oldExclusionCriteria, newExclusionCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusionCriteria(org.hl7.fhir.String newExclusionCriteria) {
		if (newExclusionCriteria != exclusionCriteria) {
			NotificationChain msgs = null;
			if (exclusionCriteria != null)
				msgs = ((InternalEObject)exclusionCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_SCOPE__EXCLUSION_CRITERIA, null, msgs);
			if (newExclusionCriteria != null)
				msgs = ((InternalEObject)newExclusionCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_SCOPE__EXCLUSION_CRITERIA, null, msgs);
			msgs = basicSetExclusionCriteria(newExclusionCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_SCOPE__EXCLUSION_CRITERIA, newExclusionCriteria, newExclusionCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VALUE_SET_SCOPE__INCLUSION_CRITERIA:
				return basicSetInclusionCriteria(null, msgs);
			case FhirPackage.VALUE_SET_SCOPE__EXCLUSION_CRITERIA:
				return basicSetExclusionCriteria(null, msgs);
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
			case FhirPackage.VALUE_SET_SCOPE__INCLUSION_CRITERIA:
				return getInclusionCriteria();
			case FhirPackage.VALUE_SET_SCOPE__EXCLUSION_CRITERIA:
				return getExclusionCriteria();
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
			case FhirPackage.VALUE_SET_SCOPE__INCLUSION_CRITERIA:
				setInclusionCriteria((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET_SCOPE__EXCLUSION_CRITERIA:
				setExclusionCriteria((org.hl7.fhir.String)newValue);
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
			case FhirPackage.VALUE_SET_SCOPE__INCLUSION_CRITERIA:
				setInclusionCriteria((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET_SCOPE__EXCLUSION_CRITERIA:
				setExclusionCriteria((org.hl7.fhir.String)null);
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
			case FhirPackage.VALUE_SET_SCOPE__INCLUSION_CRITERIA:
				return inclusionCriteria != null;
			case FhirPackage.VALUE_SET_SCOPE__EXCLUSION_CRITERIA:
				return exclusionCriteria != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSetScopeImpl
