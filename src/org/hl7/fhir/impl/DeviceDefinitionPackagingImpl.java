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
import org.hl7.fhir.DeviceDefinitionDistributor;
import org.hl7.fhir.DeviceDefinitionPackaging;
import org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Packaging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionPackagingImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionPackagingImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionPackagingImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionPackagingImpl#getDistributor <em>Distributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionPackagingImpl#getUdiDeviceIdentifier <em>Udi Device Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionPackagingImpl#getPackaging <em>Packaging</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionPackagingImpl extends BackboneElementImpl implements DeviceDefinitionPackaging {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer count;

	/**
	 * The cached value of the '{@link #getDistributor() <em>Distributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributor()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionDistributor> distributor;

	/**
	 * The cached value of the '{@link #getUdiDeviceIdentifier() <em>Udi Device Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiDeviceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionUdiDeviceIdentifier> udiDeviceIdentifier;

	/**
	 * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackaging()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionPackaging> packaging;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionPackagingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinitionPackaging();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_PACKAGING__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_PACKAGING__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_PACKAGING__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_PACKAGING__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_PACKAGING__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_PACKAGING__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_PACKAGING__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_PACKAGING__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(org.hl7.fhir.Integer newCount, NotificationChain msgs) {
		org.hl7.fhir.Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_PACKAGING__COUNT, oldCount, newCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(org.hl7.fhir.Integer newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_PACKAGING__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_PACKAGING__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_PACKAGING__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceDefinitionDistributor> getDistributor() {
		if (distributor == null) {
			distributor = new EObjectContainmentEList<DeviceDefinitionDistributor>(DeviceDefinitionDistributor.class, this, FhirPackage.DEVICE_DEFINITION_PACKAGING__DISTRIBUTOR);
		}
		return distributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceDefinitionUdiDeviceIdentifier> getUdiDeviceIdentifier() {
		if (udiDeviceIdentifier == null) {
			udiDeviceIdentifier = new EObjectContainmentEList<DeviceDefinitionUdiDeviceIdentifier>(DeviceDefinitionUdiDeviceIdentifier.class, this, FhirPackage.DEVICE_DEFINITION_PACKAGING__UDI_DEVICE_IDENTIFIER);
		}
		return udiDeviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceDefinitionPackaging> getPackaging() {
		if (packaging == null) {
			packaging = new EObjectContainmentEList<DeviceDefinitionPackaging>(DeviceDefinitionPackaging.class, this, FhirPackage.DEVICE_DEFINITION_PACKAGING__PACKAGING);
		}
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__COUNT:
				return basicSetCount(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__DISTRIBUTOR:
				return ((InternalEList<?>)getDistributor()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__UDI_DEVICE_IDENTIFIER:
				return ((InternalEList<?>)getUdiDeviceIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__PACKAGING:
				return ((InternalEList<?>)getPackaging()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__TYPE:
				return getType();
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__COUNT:
				return getCount();
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__DISTRIBUTOR:
				return getDistributor();
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__UDI_DEVICE_IDENTIFIER:
				return getUdiDeviceIdentifier();
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__PACKAGING:
				return getPackaging();
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
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__COUNT:
				setCount((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__DISTRIBUTOR:
				getDistributor().clear();
				getDistributor().addAll((Collection<? extends DeviceDefinitionDistributor>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__UDI_DEVICE_IDENTIFIER:
				getUdiDeviceIdentifier().clear();
				getUdiDeviceIdentifier().addAll((Collection<? extends DeviceDefinitionUdiDeviceIdentifier>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__PACKAGING:
				getPackaging().clear();
				getPackaging().addAll((Collection<? extends DeviceDefinitionPackaging>)newValue);
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
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__COUNT:
				setCount((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__DISTRIBUTOR:
				getDistributor().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__UDI_DEVICE_IDENTIFIER:
				getUdiDeviceIdentifier().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__PACKAGING:
				getPackaging().clear();
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
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__IDENTIFIER:
				return identifier != null;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__TYPE:
				return type != null;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__COUNT:
				return count != null;
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__DISTRIBUTOR:
				return distributor != null && !distributor.isEmpty();
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__UDI_DEVICE_IDENTIFIER:
				return udiDeviceIdentifier != null && !udiDeviceIdentifier.isEmpty();
			case FhirPackage.DEVICE_DEFINITION_PACKAGING__PACKAGING:
				return packaging != null && !packaging.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionPackagingImpl
