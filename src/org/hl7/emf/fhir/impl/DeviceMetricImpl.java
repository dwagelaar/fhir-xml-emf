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
import org.hl7.emf.fhir.ColorCodesOrRGB;
import org.hl7.emf.fhir.DeviceMetric;
import org.hl7.emf.fhir.DeviceMetricCalibration;
import org.hl7.emf.fhir.DeviceMetricCategory;
import org.hl7.emf.fhir.DeviceMetricOperationalStatus;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceMetricImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceMetricImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceMetricImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceMetricImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceMetricImpl#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceMetricImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceMetricImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceMetricImpl#getMeasurementFrequency <em>Measurement Frequency</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceMetricImpl#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceMetricImpl extends DomainResourceImpl implements DeviceMetric {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

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
	 * The cached value of the '{@link #getOperationalStatus() <em>Operational Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected DeviceMetricOperationalStatus operationalStatus;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected ColorCodesOrRGB color;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected DeviceMetricCategory category;

	/**
	 * The cached value of the '{@link #getMeasurementFrequency() <em>Measurement Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementFrequency()
	 * @generated
	 * @ordered
	 */
	protected Quantity measurementFrequency;

	/**
	 * The cached value of the '{@link #getCalibration() <em>Calibration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibration()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceMetricCalibration> calibration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceMetric();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DEVICE_METRIC__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(CodeableConcept newUnit, NotificationChain msgs) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__UNIT, oldUnit, newUnit);
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
	public void setUnit(CodeableConcept newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__DEVICE, oldDevice, newDevice);
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
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetricOperationalStatus getOperationalStatus() {
		return operationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalStatus(DeviceMetricOperationalStatus newOperationalStatus, NotificationChain msgs) {
		DeviceMetricOperationalStatus oldOperationalStatus = operationalStatus;
		operationalStatus = newOperationalStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS, oldOperationalStatus, newOperationalStatus);
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
	public void setOperationalStatus(DeviceMetricOperationalStatus newOperationalStatus) {
		if (newOperationalStatus != operationalStatus) {
			NotificationChain msgs = null;
			if (operationalStatus != null)
				msgs = ((InternalEObject)operationalStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS, null, msgs);
			if (newOperationalStatus != null)
				msgs = ((InternalEObject)newOperationalStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS, null, msgs);
			msgs = basicSetOperationalStatus(newOperationalStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS, newOperationalStatus, newOperationalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorCodesOrRGB getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(ColorCodesOrRGB newColor, NotificationChain msgs) {
		ColorCodesOrRGB oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__COLOR, oldColor, newColor);
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
	public void setColor(ColorCodesOrRGB newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetricCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(DeviceMetricCategory newCategory, NotificationChain msgs) {
		DeviceMetricCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(DeviceMetricCategory newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMeasurementFrequency() {
		return measurementFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementFrequency(Quantity newMeasurementFrequency, NotificationChain msgs) {
		Quantity oldMeasurementFrequency = measurementFrequency;
		measurementFrequency = newMeasurementFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__MEASUREMENT_FREQUENCY, oldMeasurementFrequency, newMeasurementFrequency);
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
	public void setMeasurementFrequency(Quantity newMeasurementFrequency) {
		if (newMeasurementFrequency != measurementFrequency) {
			NotificationChain msgs = null;
			if (measurementFrequency != null)
				msgs = ((InternalEObject)measurementFrequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__MEASUREMENT_FREQUENCY, null, msgs);
			if (newMeasurementFrequency != null)
				msgs = ((InternalEObject)newMeasurementFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__MEASUREMENT_FREQUENCY, null, msgs);
			msgs = basicSetMeasurementFrequency(newMeasurementFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__MEASUREMENT_FREQUENCY, newMeasurementFrequency, newMeasurementFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceMetricCalibration> getCalibration() {
		if (calibration == null) {
			calibration = new EObjectContainmentEList<DeviceMetricCalibration>(DeviceMetricCalibration.class, this, FhirPackage.DEVICE_METRIC__CALIBRATION);
		}
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_METRIC__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DEVICE_METRIC__UNIT:
				return basicSetUnit(null, msgs);
			case FhirPackage.DEVICE_METRIC__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				return basicSetOperationalStatus(null, msgs);
			case FhirPackage.DEVICE_METRIC__COLOR:
				return basicSetColor(null, msgs);
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_FREQUENCY:
				return basicSetMeasurementFrequency(null, msgs);
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				return ((InternalEList<?>)getCalibration()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_METRIC__TYPE:
				return getType();
			case FhirPackage.DEVICE_METRIC__UNIT:
				return getUnit();
			case FhirPackage.DEVICE_METRIC__DEVICE:
				return getDevice();
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				return getOperationalStatus();
			case FhirPackage.DEVICE_METRIC__COLOR:
				return getColor();
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				return getCategory();
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_FREQUENCY:
				return getMeasurementFrequency();
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				return getCalibration();
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
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				setOperationalStatus((DeviceMetricOperationalStatus)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__COLOR:
				setColor((ColorCodesOrRGB)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				setCategory((DeviceMetricCategory)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_FREQUENCY:
				setMeasurementFrequency((Quantity)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				getCalibration().clear();
				getCalibration().addAll((Collection<? extends DeviceMetricCalibration>)newValue);
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
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DEVICE_METRIC__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_METRIC__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_METRIC__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				setOperationalStatus((DeviceMetricOperationalStatus)null);
				return;
			case FhirPackage.DEVICE_METRIC__COLOR:
				setColor((ColorCodesOrRGB)null);
				return;
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				setCategory((DeviceMetricCategory)null);
				return;
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_FREQUENCY:
				setMeasurementFrequency((Quantity)null);
				return;
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				getCalibration().clear();
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
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DEVICE_METRIC__TYPE:
				return type != null;
			case FhirPackage.DEVICE_METRIC__UNIT:
				return unit != null;
			case FhirPackage.DEVICE_METRIC__DEVICE:
				return device != null;
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				return operationalStatus != null;
			case FhirPackage.DEVICE_METRIC__COLOR:
				return color != null;
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				return category != null;
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_FREQUENCY:
				return measurementFrequency != null;
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				return calibration != null && !calibration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceMetricImpl
