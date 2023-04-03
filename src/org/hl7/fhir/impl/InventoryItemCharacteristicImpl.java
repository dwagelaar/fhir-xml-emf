/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Address;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.InventoryItemCharacteristic;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getCharacteristicType <em>Characteristic Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueDecimal <em>Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueUrl <em>Value Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueRatio <em>Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueAnnotation <em>Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueAddress <em>Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueDuration <em>Value Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemCharacteristicImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemCharacteristicImpl extends BackboneElementImpl implements InventoryItemCharacteristic {
	/**
	 * The cached value of the '{@link #getCharacteristicType() <em>Characteristic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept characteristicType;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String valueString;

	/**
	 * The cached value of the '{@link #getValueInteger() <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer valueInteger;

	/**
	 * The cached value of the '{@link #getValueDecimal() <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal valueDecimal;

	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean valueBoolean;

	/**
	 * The cached value of the '{@link #getValueUrl() <em>Value Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUrl()
	 * @generated
	 * @ordered
	 */
	protected Url valueUrl;

	/**
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime valueDateTime;

	/**
	 * The cached value of the '{@link #getValueQuantity() <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity valueQuantity;

	/**
	 * The cached value of the '{@link #getValueRange() <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRange()
	 * @generated
	 * @ordered
	 */
	protected Range valueRange;

	/**
	 * The cached value of the '{@link #getValueRatio() <em>Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio valueRatio;

	/**
	 * The cached value of the '{@link #getValueAnnotation() <em>Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation valueAnnotation;

	/**
	 * The cached value of the '{@link #getValueAddress() <em>Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAddress()
	 * @generated
	 * @ordered
	 */
	protected Address valueAddress;

	/**
	 * The cached value of the '{@link #getValueDuration() <em>Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration valueDuration;

	/**
	 * The cached value of the '{@link #getValueCodeableConcept() <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept valueCodeableConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInventoryItemCharacteristic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCharacteristicType() {
		return characteristicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacteristicType(CodeableConcept newCharacteristicType, NotificationChain msgs) {
		CodeableConcept oldCharacteristicType = characteristicType;
		characteristicType = newCharacteristicType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__CHARACTERISTIC_TYPE, oldCharacteristicType, newCharacteristicType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristicType(CodeableConcept newCharacteristicType) {
		if (newCharacteristicType != characteristicType) {
			NotificationChain msgs = null;
			if (characteristicType != null)
				msgs = ((InternalEObject)characteristicType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__CHARACTERISTIC_TYPE, null, msgs);
			if (newCharacteristicType != null)
				msgs = ((InternalEObject)newCharacteristicType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__CHARACTERISTIC_TYPE, null, msgs);
			msgs = basicSetCharacteristicType(newCharacteristicType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__CHARACTERISTIC_TYPE, newCharacteristicType, newCharacteristicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueString(org.hl7.fhir.String newValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_STRING, oldValueString, newValueString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueString(org.hl7.fhir.String newValueString) {
		if (newValueString != valueString) {
			NotificationChain msgs = null;
			if (valueString != null)
				msgs = ((InternalEObject)valueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_STRING, null, msgs);
			if (newValueString != null)
				msgs = ((InternalEObject)newValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_STRING, null, msgs);
			msgs = basicSetValueString(newValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_STRING, newValueString, newValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getValueInteger() {
		return valueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueInteger(org.hl7.fhir.Integer newValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldValueInteger = valueInteger;
		valueInteger = newValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_INTEGER, oldValueInteger, newValueInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueInteger(org.hl7.fhir.Integer newValueInteger) {
		if (newValueInteger != valueInteger) {
			NotificationChain msgs = null;
			if (valueInteger != null)
				msgs = ((InternalEObject)valueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_INTEGER, null, msgs);
			if (newValueInteger != null)
				msgs = ((InternalEObject)newValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_INTEGER, null, msgs);
			msgs = basicSetValueInteger(newValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_INTEGER, newValueInteger, newValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getValueDecimal() {
		return valueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDecimal(Decimal newValueDecimal, NotificationChain msgs) {
		Decimal oldValueDecimal = valueDecimal;
		valueDecimal = newValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DECIMAL, oldValueDecimal, newValueDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDecimal(Decimal newValueDecimal) {
		if (newValueDecimal != valueDecimal) {
			NotificationChain msgs = null;
			if (valueDecimal != null)
				msgs = ((InternalEObject)valueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DECIMAL, null, msgs);
			if (newValueDecimal != null)
				msgs = ((InternalEObject)newValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DECIMAL, null, msgs);
			msgs = basicSetValueDecimal(newValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DECIMAL, newValueDecimal, newValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBoolean(org.hl7.fhir.Boolean newValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBoolean(org.hl7.fhir.Boolean newValueBoolean) {
		if (newValueBoolean != valueBoolean) {
			NotificationChain msgs = null;
			if (valueBoolean != null)
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getValueUrl() {
		return valueUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueUrl(Url newValueUrl, NotificationChain msgs) {
		Url oldValueUrl = valueUrl;
		valueUrl = newValueUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_URL, oldValueUrl, newValueUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueUrl(Url newValueUrl) {
		if (newValueUrl != valueUrl) {
			NotificationChain msgs = null;
			if (valueUrl != null)
				msgs = ((InternalEObject)valueUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_URL, null, msgs);
			if (newValueUrl != null)
				msgs = ((InternalEObject)newValueUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_URL, null, msgs);
			msgs = basicSetValueUrl(newValueUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_URL, newValueUrl, newValueUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDateTime(DateTime newValueDateTime, NotificationChain msgs) {
		DateTime oldValueDateTime = valueDateTime;
		valueDateTime = newValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DATE_TIME, oldValueDateTime, newValueDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDateTime(DateTime newValueDateTime) {
		if (newValueDateTime != valueDateTime) {
			NotificationChain msgs = null;
			if (valueDateTime != null)
				msgs = ((InternalEObject)valueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DATE_TIME, null, msgs);
			if (newValueDateTime != null)
				msgs = ((InternalEObject)newValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DATE_TIME, null, msgs);
			msgs = basicSetValueDateTime(newValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DATE_TIME, newValueDateTime, newValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getValueQuantity() {
		return valueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueQuantity(Quantity newValueQuantity, NotificationChain msgs) {
		Quantity oldValueQuantity = valueQuantity;
		valueQuantity = newValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueQuantity(Quantity newValueQuantity) {
		if (newValueQuantity != valueQuantity) {
			NotificationChain msgs = null;
			if (valueQuantity != null)
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getValueRange() {
		return valueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRange(Range newValueRange, NotificationChain msgs) {
		Range oldValueRange = valueRange;
		valueRange = newValueRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RANGE, oldValueRange, newValueRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRange(Range newValueRange) {
		if (newValueRange != valueRange) {
			NotificationChain msgs = null;
			if (valueRange != null)
				msgs = ((InternalEObject)valueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RANGE, null, msgs);
			if (newValueRange != null)
				msgs = ((InternalEObject)newValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RANGE, null, msgs);
			msgs = basicSetValueRange(newValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RANGE, newValueRange, newValueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getValueRatio() {
		return valueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRatio(Ratio newValueRatio, NotificationChain msgs) {
		Ratio oldValueRatio = valueRatio;
		valueRatio = newValueRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RATIO, oldValueRatio, newValueRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRatio(Ratio newValueRatio) {
		if (newValueRatio != valueRatio) {
			NotificationChain msgs = null;
			if (valueRatio != null)
				msgs = ((InternalEObject)valueRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RATIO, null, msgs);
			if (newValueRatio != null)
				msgs = ((InternalEObject)newValueRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RATIO, null, msgs);
			msgs = basicSetValueRatio(newValueRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RATIO, newValueRatio, newValueRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getValueAnnotation() {
		return valueAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAnnotation(Annotation newValueAnnotation, NotificationChain msgs) {
		Annotation oldValueAnnotation = valueAnnotation;
		valueAnnotation = newValueAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ANNOTATION, oldValueAnnotation, newValueAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAnnotation(Annotation newValueAnnotation) {
		if (newValueAnnotation != valueAnnotation) {
			NotificationChain msgs = null;
			if (valueAnnotation != null)
				msgs = ((InternalEObject)valueAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ANNOTATION, null, msgs);
			if (newValueAnnotation != null)
				msgs = ((InternalEObject)newValueAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ANNOTATION, null, msgs);
			msgs = basicSetValueAnnotation(newValueAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ANNOTATION, newValueAnnotation, newValueAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getValueAddress() {
		return valueAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAddress(Address newValueAddress, NotificationChain msgs) {
		Address oldValueAddress = valueAddress;
		valueAddress = newValueAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ADDRESS, oldValueAddress, newValueAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAddress(Address newValueAddress) {
		if (newValueAddress != valueAddress) {
			NotificationChain msgs = null;
			if (valueAddress != null)
				msgs = ((InternalEObject)valueAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ADDRESS, null, msgs);
			if (newValueAddress != null)
				msgs = ((InternalEObject)newValueAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ADDRESS, null, msgs);
			msgs = basicSetValueAddress(newValueAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ADDRESS, newValueAddress, newValueAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getValueDuration() {
		return valueDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDuration(Duration newValueDuration, NotificationChain msgs) {
		Duration oldValueDuration = valueDuration;
		valueDuration = newValueDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DURATION, oldValueDuration, newValueDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDuration(Duration newValueDuration) {
		if (newValueDuration != valueDuration) {
			NotificationChain msgs = null;
			if (valueDuration != null)
				msgs = ((InternalEObject)valueDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DURATION, null, msgs);
			if (newValueDuration != null)
				msgs = ((InternalEObject)newValueDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DURATION, null, msgs);
			msgs = basicSetValueDuration(newValueDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DURATION, newValueDuration, newValueDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getValueCodeableConcept() {
		return valueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCodeableConcept(CodeableConcept newValueCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldValueCodeableConcept = valueCodeableConcept;
		valueCodeableConcept = newValueCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT, oldValueCodeableConcept, newValueCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueCodeableConcept(CodeableConcept newValueCodeableConcept) {
		if (newValueCodeableConcept != valueCodeableConcept) {
			NotificationChain msgs = null;
			if (valueCodeableConcept != null)
				msgs = ((InternalEObject)valueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newValueCodeableConcept != null)
				msgs = ((InternalEObject)newValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueCodeableConcept(newValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT, newValueCodeableConcept, newValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__CHARACTERISTIC_TYPE:
				return basicSetCharacteristicType(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_STRING:
				return basicSetValueString(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_INTEGER:
				return basicSetValueInteger(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DECIMAL:
				return basicSetValueDecimal(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_URL:
				return basicSetValueUrl(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DATE_TIME:
				return basicSetValueDateTime(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RANGE:
				return basicSetValueRange(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RATIO:
				return basicSetValueRatio(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ANNOTATION:
				return basicSetValueAnnotation(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ADDRESS:
				return basicSetValueAddress(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DURATION:
				return basicSetValueDuration(null, msgs);
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				return basicSetValueCodeableConcept(null, msgs);
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
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__CHARACTERISTIC_TYPE:
				return getCharacteristicType();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_STRING:
				return getValueString();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_INTEGER:
				return getValueInteger();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DECIMAL:
				return getValueDecimal();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_BOOLEAN:
				return getValueBoolean();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_URL:
				return getValueUrl();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DATE_TIME:
				return getValueDateTime();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RANGE:
				return getValueRange();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RATIO:
				return getValueRatio();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ANNOTATION:
				return getValueAnnotation();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ADDRESS:
				return getValueAddress();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DURATION:
				return getValueDuration();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
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
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__CHARACTERISTIC_TYPE:
				setCharacteristicType((CodeableConcept)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_STRING:
				setValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DECIMAL:
				setValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_URL:
				setValueUrl((Url)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DATE_TIME:
				setValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RANGE:
				setValueRange((Range)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RATIO:
				setValueRatio((Ratio)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ANNOTATION:
				setValueAnnotation((Annotation)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ADDRESS:
				setValueAddress((Address)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DURATION:
				setValueDuration((Duration)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)newValue);
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
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__CHARACTERISTIC_TYPE:
				setCharacteristicType((CodeableConcept)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_STRING:
				setValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DECIMAL:
				setValueDecimal((Decimal)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_URL:
				setValueUrl((Url)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DATE_TIME:
				setValueDateTime((DateTime)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RANGE:
				setValueRange((Range)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RATIO:
				setValueRatio((Ratio)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ANNOTATION:
				setValueAnnotation((Annotation)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ADDRESS:
				setValueAddress((Address)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DURATION:
				setValueDuration((Duration)null);
				return;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)null);
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
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__CHARACTERISTIC_TYPE:
				return characteristicType != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_STRING:
				return valueString != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_INTEGER:
				return valueInteger != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DECIMAL:
				return valueDecimal != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_URL:
				return valueUrl != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DATE_TIME:
				return valueDateTime != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_QUANTITY:
				return valueQuantity != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RANGE:
				return valueRange != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_RATIO:
				return valueRatio != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ANNOTATION:
				return valueAnnotation != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_ADDRESS:
				return valueAddress != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_DURATION:
				return valueDuration != null;
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //InventoryItemCharacteristicImpl
