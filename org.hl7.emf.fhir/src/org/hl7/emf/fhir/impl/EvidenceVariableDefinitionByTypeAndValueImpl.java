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
import org.hl7.emf.fhir.EvidenceVariableDefinitionByTypeAndValue;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Id;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.Range;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Variable Definition By Type And Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getValueId <em>Value Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableDefinitionByTypeAndValueImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableDefinitionByTypeAndValueImpl extends BackboneElementImpl implements EvidenceVariableDefinitionByTypeAndValue {
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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> method;

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
	 * The cached value of the '{@link #getValueCodeableConcept() <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept valueCodeableConcept;

	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean valueBoolean;

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
	 * The cached value of the '{@link #getValueReference() <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReference()
	 * @generated
	 * @ordered
	 */
	protected Reference valueReference;

	/**
	 * The cached value of the '{@link #getValueId() <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueId()
	 * @generated
	 * @ordered
	 */
	protected Id valueId;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableDefinitionByTypeAndValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceVariableDefinitionByTypeAndValue();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__METHOD);
		}
		return method;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__DEVICE, oldDevice, newDevice);
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
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_CODEABLE_CONCEPT, oldValueCodeableConcept, newValueCodeableConcept);
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
	public void setValueCodeableConcept(CodeableConcept newValueCodeableConcept) {
		if (newValueCodeableConcept != valueCodeableConcept) {
			NotificationChain msgs = null;
			if (valueCodeableConcept != null)
				msgs = ((InternalEObject)valueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newValueCodeableConcept != null)
				msgs = ((InternalEObject)newValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueCodeableConcept(newValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_CODEABLE_CONCEPT, newValueCodeableConcept, newValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBoolean(org.hl7.emf.fhir.Boolean newValueBoolean, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
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
	public void setValueBoolean(org.hl7.emf.fhir.Boolean newValueBoolean) {
		if (newValueBoolean != valueBoolean) {
			NotificationChain msgs = null;
			if (valueBoolean != null)
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
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
	public void setValueQuantity(Quantity newValueQuantity) {
		if (newValueQuantity != valueQuantity) {
			NotificationChain msgs = null;
			if (valueQuantity != null)
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_RANGE, oldValueRange, newValueRange);
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
	public void setValueRange(Range newValueRange) {
		if (newValueRange != valueRange) {
			NotificationChain msgs = null;
			if (valueRange != null)
				msgs = ((InternalEObject)valueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_RANGE, null, msgs);
			if (newValueRange != null)
				msgs = ((InternalEObject)newValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_RANGE, null, msgs);
			msgs = basicSetValueRange(newValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_RANGE, newValueRange, newValueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getValueReference() {
		return valueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueReference(Reference newValueReference, NotificationChain msgs) {
		Reference oldValueReference = valueReference;
		valueReference = newValueReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_REFERENCE, oldValueReference, newValueReference);
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
	public void setValueReference(Reference newValueReference) {
		if (newValueReference != valueReference) {
			NotificationChain msgs = null;
			if (valueReference != null)
				msgs = ((InternalEObject)valueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_REFERENCE, null, msgs);
			if (newValueReference != null)
				msgs = ((InternalEObject)newValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_REFERENCE, null, msgs);
			msgs = basicSetValueReference(newValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_REFERENCE, newValueReference, newValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getValueId() {
		return valueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueId(Id newValueId, NotificationChain msgs) {
		Id oldValueId = valueId;
		valueId = newValueId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_ID, oldValueId, newValueId);
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
	public void setValueId(Id newValueId) {
		if (newValueId != valueId) {
			NotificationChain msgs = null;
			if (valueId != null)
				msgs = ((InternalEObject)valueId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_ID, null, msgs);
			if (newValueId != null)
				msgs = ((InternalEObject)newValueId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_ID, null, msgs);
			msgs = basicSetValueId(newValueId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_ID, newValueId, newValueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(CodeableConcept newOffset, NotificationChain msgs) {
		CodeableConcept oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__OFFSET, oldOffset, newOffset);
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
	public void setOffset(CodeableConcept newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_CODEABLE_CONCEPT:
				return basicSetValueCodeableConcept(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_RANGE:
				return basicSetValueRange(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_REFERENCE:
				return basicSetValueReference(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_ID:
				return basicSetValueId(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__OFFSET:
				return basicSetOffset(null, msgs);
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
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__TYPE:
				return getType();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__METHOD:
				return getMethod();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__DEVICE:
				return getDevice();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_BOOLEAN:
				return getValueBoolean();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_RANGE:
				return getValueRange();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_REFERENCE:
				return getValueReference();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_ID:
				return getValueId();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__OFFSET:
				return getOffset();
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
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_RANGE:
				setValueRange((Range)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_REFERENCE:
				setValueReference((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_ID:
				setValueId((Id)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__OFFSET:
				setOffset((CodeableConcept)newValue);
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
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__METHOD:
				getMethod().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_RANGE:
				setValueRange((Range)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_REFERENCE:
				setValueReference((Reference)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_ID:
				setValueId((Id)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__OFFSET:
				setOffset((CodeableConcept)null);
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
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__TYPE:
				return type != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__METHOD:
				return method != null && !method.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__DEVICE:
				return device != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_QUANTITY:
				return valueQuantity != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_RANGE:
				return valueRange != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_REFERENCE:
				return valueReference != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__VALUE_ID:
				return valueId != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE__OFFSET:
				return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableDefinitionByTypeAndValueImpl
