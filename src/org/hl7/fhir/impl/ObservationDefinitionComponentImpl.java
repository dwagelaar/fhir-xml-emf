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
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ObservationDataType;
import org.hl7.fhir.ObservationDefinitionComponent;
import org.hl7.fhir.ObservationDefinitionQualifiedValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Definition Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionComponentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionComponentImpl#getPermittedDataType <em>Permitted Data Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionComponentImpl#getPermittedUnit <em>Permitted Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionComponentImpl#getQualifiedValue <em>Qualified Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationDefinitionComponentImpl extends BackboneElementImpl implements ObservationDefinitionComponent {
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
	 * The cached value of the '{@link #getPermittedDataType() <em>Permitted Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDataType> permittedDataType;

	/**
	 * The cached value of the '{@link #getPermittedUnit() <em>Permitted Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> permittedUnit;

	/**
	 * The cached value of the '{@link #getQualifiedValue() <em>Qualified Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDefinitionQualifiedValue> qualifiedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationDefinitionComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getObservationDefinitionComponent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_COMPONENT__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_COMPONENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_COMPONENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_COMPONENT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationDataType> getPermittedDataType() {
		if (permittedDataType == null) {
			permittedDataType = new EObjectContainmentEList<ObservationDataType>(ObservationDataType.class, this, FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE);
		}
		return permittedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPermittedUnit() {
		if (permittedUnit == null) {
			permittedUnit = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT);
		}
		return permittedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationDefinitionQualifiedValue> getQualifiedValue() {
		if (qualifiedValue == null) {
			qualifiedValue = new EObjectContainmentEList<ObservationDefinitionQualifiedValue>(ObservationDefinitionQualifiedValue.class, this, FhirPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE);
		}
		return qualifiedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				return ((InternalEList<?>)getPermittedDataType()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				return ((InternalEList<?>)getPermittedUnit()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				return ((InternalEList<?>)getQualifiedValue()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				return getCode();
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				return getPermittedDataType();
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				return getPermittedUnit();
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				return getQualifiedValue();
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
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				getPermittedDataType().clear();
				getPermittedDataType().addAll((Collection<? extends ObservationDataType>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				getPermittedUnit().clear();
				getPermittedUnit().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				getQualifiedValue().clear();
				getQualifiedValue().addAll((Collection<? extends ObservationDefinitionQualifiedValue>)newValue);
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
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				getPermittedDataType().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				getPermittedUnit().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				getQualifiedValue().clear();
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
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				return code != null;
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				return permittedDataType != null && !permittedDataType.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				return permittedUnit != null && !permittedUnit.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				return qualifiedValue != null && !qualifiedValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionComponentImpl
