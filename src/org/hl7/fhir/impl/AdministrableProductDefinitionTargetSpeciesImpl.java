/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.AdministrableProductDefinitionTargetSpecies;
import org.hl7.fhir.AdministrableProductDefinitionWithdrawalPeriod;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrable Product Definition Target Species</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionTargetSpeciesImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionTargetSpeciesImpl#getWithdrawalPeriod <em>Withdrawal Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrableProductDefinitionTargetSpeciesImpl extends BackboneElementImpl implements AdministrableProductDefinitionTargetSpecies {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getWithdrawalPeriod() <em>Withdrawal Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithdrawalPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<AdministrableProductDefinitionWithdrawalPeriod> withdrawalPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrableProductDefinitionTargetSpeciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAdministrableProductDefinitionTargetSpecies();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdministrableProductDefinitionWithdrawalPeriod> getWithdrawalPeriod() {
		if (withdrawalPeriod == null) {
			withdrawalPeriod = new EObjectContainmentEList<AdministrableProductDefinitionWithdrawalPeriod>(AdministrableProductDefinitionWithdrawalPeriod.class, this, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__WITHDRAWAL_PERIOD);
		}
		return withdrawalPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				return ((InternalEList<?>)getWithdrawalPeriod()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__CODE:
				return getCode();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				return getWithdrawalPeriod();
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
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				getWithdrawalPeriod().clear();
				getWithdrawalPeriod().addAll((Collection<? extends AdministrableProductDefinitionWithdrawalPeriod>)newValue);
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
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				getWithdrawalPeriod().clear();
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
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__CODE:
				return code != null;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				return withdrawalPeriod != null && !withdrawalPeriod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdministrableProductDefinitionTargetSpeciesImpl
