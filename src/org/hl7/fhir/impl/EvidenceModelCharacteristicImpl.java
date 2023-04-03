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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.EvidenceAttributeEstimate;
import org.hl7.fhir.EvidenceModelCharacteristic;
import org.hl7.fhir.EvidenceVariable1;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Model Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceModelCharacteristicImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceModelCharacteristicImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceModelCharacteristicImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceModelCharacteristicImpl#getAttributeEstimate <em>Attribute Estimate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceModelCharacteristicImpl extends BackboneElementImpl implements EvidenceModelCharacteristic {
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Quantity value;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceVariable1> variable;

	/**
	 * The cached value of the '{@link #getAttributeEstimate() <em>Attribute Estimate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeEstimate()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceAttributeEstimate> attributeEstimate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceModelCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceModelCharacteristic();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Quantity newValue, NotificationChain msgs) {
		Quantity oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Quantity newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceVariable1> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<EvidenceVariable1>(EvidenceVariable1.class, this, FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceAttributeEstimate> getAttributeEstimate() {
		if (attributeEstimate == null) {
			attributeEstimate = new EObjectContainmentEList<EvidenceAttributeEstimate>(EvidenceAttributeEstimate.class, this, FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__ATTRIBUTE_ESTIMATE);
		}
		return attributeEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VALUE:
				return basicSetValue(null, msgs);
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__ATTRIBUTE_ESTIMATE:
				return ((InternalEList<?>)getAttributeEstimate()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__CODE:
				return getCode();
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VALUE:
				return getValue();
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VARIABLE:
				return getVariable();
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__ATTRIBUTE_ESTIMATE:
				return getAttributeEstimate();
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
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VALUE:
				setValue((Quantity)newValue);
				return;
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends EvidenceVariable1>)newValue);
				return;
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__ATTRIBUTE_ESTIMATE:
				getAttributeEstimate().clear();
				getAttributeEstimate().addAll((Collection<? extends EvidenceAttributeEstimate>)newValue);
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
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VALUE:
				setValue((Quantity)null);
				return;
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VARIABLE:
				getVariable().clear();
				return;
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__ATTRIBUTE_ESTIMATE:
				getAttributeEstimate().clear();
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
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__CODE:
				return code != null;
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VALUE:
				return value != null;
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__VARIABLE:
				return variable != null && !variable.isEmpty();
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC__ATTRIBUTE_ESTIMATE:
				return attributeEstimate != null && !attributeEstimate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceModelCharacteristicImpl
