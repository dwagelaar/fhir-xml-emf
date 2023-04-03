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
import org.hl7.fhir.DeviceAssociation;
import org.hl7.fhir.DeviceAssociationOperation;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceAssociationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceAssociationImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceAssociationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceAssociationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceAssociationImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceAssociationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceAssociationImpl#getBodyStructure <em>Body Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceAssociationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceAssociationImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceAssociationImpl extends DomainResourceImpl implements DeviceAssociation {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference device;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> statusReason;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getBodyStructure() <em>Body Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyStructure()
	 * @generated
	 * @ordered
	 */
	protected Reference bodyStructure;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceAssociationOperation> operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DEVICE_ASSOCIATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Reference newDevice, NotificationChain msgs) {
		Reference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__DEVICE, oldDevice, newDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_ASSOCIATION__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getStatusReason() {
		if (statusReason == null) {
			statusReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_ASSOCIATION__STATUS_REASON);
		}
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getBodyStructure() {
		return bodyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyStructure(Reference newBodyStructure, NotificationChain msgs) {
		Reference oldBodyStructure = bodyStructure;
		bodyStructure = newBodyStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__BODY_STRUCTURE, oldBodyStructure, newBodyStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyStructure(Reference newBodyStructure) {
		if (newBodyStructure != bodyStructure) {
			NotificationChain msgs = null;
			if (bodyStructure != null)
				msgs = ((InternalEObject)bodyStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__BODY_STRUCTURE, null, msgs);
			if (newBodyStructure != null)
				msgs = ((InternalEObject)newBodyStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__BODY_STRUCTURE, null, msgs);
			msgs = basicSetBodyStructure(newBodyStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__BODY_STRUCTURE, newBodyStructure, newBodyStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_ASSOCIATION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_ASSOCIATION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceAssociationOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<DeviceAssociationOperation>(DeviceAssociationOperation.class, this, FhirPackage.DEVICE_ASSOCIATION__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_ASSOCIATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_ASSOCIATION__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.DEVICE_ASSOCIATION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_ASSOCIATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DEVICE_ASSOCIATION__STATUS_REASON:
				return ((InternalEList<?>)getStatusReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_ASSOCIATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DEVICE_ASSOCIATION__BODY_STRUCTURE:
				return basicSetBodyStructure(null, msgs);
			case FhirPackage.DEVICE_ASSOCIATION__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.DEVICE_ASSOCIATION__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DEVICE_ASSOCIATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_ASSOCIATION__DEVICE:
				return getDevice();
			case FhirPackage.DEVICE_ASSOCIATION__CATEGORY:
				return getCategory();
			case FhirPackage.DEVICE_ASSOCIATION__STATUS:
				return getStatus();
			case FhirPackage.DEVICE_ASSOCIATION__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.DEVICE_ASSOCIATION__SUBJECT:
				return getSubject();
			case FhirPackage.DEVICE_ASSOCIATION__BODY_STRUCTURE:
				return getBodyStructure();
			case FhirPackage.DEVICE_ASSOCIATION__PERIOD:
				return getPeriod();
			case FhirPackage.DEVICE_ASSOCIATION__OPERATION:
				return getOperation();
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
			case FhirPackage.DEVICE_ASSOCIATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__STATUS_REASON:
				getStatusReason().clear();
				getStatusReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__BODY_STRUCTURE:
				setBodyStructure((Reference)newValue);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends DeviceAssociationOperation>)newValue);
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
			case FhirPackage.DEVICE_ASSOCIATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DEVICE_ASSOCIATION__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.DEVICE_ASSOCIATION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__STATUS_REASON:
				getStatusReason().clear();
				return;
			case FhirPackage.DEVICE_ASSOCIATION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__BODY_STRUCTURE:
				setBodyStructure((Reference)null);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.DEVICE_ASSOCIATION__OPERATION:
				getOperation().clear();
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
			case FhirPackage.DEVICE_ASSOCIATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DEVICE_ASSOCIATION__DEVICE:
				return device != null;
			case FhirPackage.DEVICE_ASSOCIATION__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.DEVICE_ASSOCIATION__STATUS:
				return status != null;
			case FhirPackage.DEVICE_ASSOCIATION__STATUS_REASON:
				return statusReason != null && !statusReason.isEmpty();
			case FhirPackage.DEVICE_ASSOCIATION__SUBJECT:
				return subject != null;
			case FhirPackage.DEVICE_ASSOCIATION__BODY_STRUCTURE:
				return bodyStructure != null;
			case FhirPackage.DEVICE_ASSOCIATION__PERIOD:
				return period != null;
			case FhirPackage.DEVICE_ASSOCIATION__OPERATION:
				return operation != null && !operation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceAssociationImpl
