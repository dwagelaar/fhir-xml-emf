/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaged Product Definition Legal Status Of Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionLegalStatusOfSupplyImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionLegalStatusOfSupplyImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackagedProductDefinitionLegalStatusOfSupplyImpl extends BackboneElementImpl implements PackagedProductDefinitionLegalStatusOfSupply {
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
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept jurisdiction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagedProductDefinitionLegalStatusOfSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPackagedProductDefinitionLegalStatusOfSupply();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getJurisdiction() {
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJurisdiction(CodeableConcept newJurisdiction, NotificationChain msgs) {
		CodeableConcept oldJurisdiction = jurisdiction;
		jurisdiction = newJurisdiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__JURISDICTION, oldJurisdiction, newJurisdiction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJurisdiction(CodeableConcept newJurisdiction) {
		if (newJurisdiction != jurisdiction) {
			NotificationChain msgs = null;
			if (jurisdiction != null)
				msgs = ((InternalEObject)jurisdiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__JURISDICTION, null, msgs);
			if (newJurisdiction != null)
				msgs = ((InternalEObject)newJurisdiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__JURISDICTION, null, msgs);
			msgs = basicSetJurisdiction(newJurisdiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__JURISDICTION, newJurisdiction, newJurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__JURISDICTION:
				return basicSetJurisdiction(null, msgs);
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__CODE:
				return getCode();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__JURISDICTION:
				return getJurisdiction();
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__JURISDICTION:
				setJurisdiction((CodeableConcept)newValue);
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__JURISDICTION:
				setJurisdiction((CodeableConcept)null);
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__CODE:
				return code != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY__JURISDICTION:
				return jurisdiction != null;
		}
		return super.eIsSet(featureID);
	}

} //PackagedProductDefinitionLegalStatusOfSupplyImpl
