/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.MeasureReportComponent;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.Range;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportComponentImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportComponentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportComponentImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportComponentImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportComponentImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportComponentImpl#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportComponentImpl#getValueReference <em>Value Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportComponentImpl extends BackboneElementImpl implements MeasureReportComponent {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String linkId;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureReportComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.hl7.emf.fhir.String newLinkId, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__LINK_ID, oldLinkId, newLinkId);
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
	public void setLinkId(org.hl7.emf.fhir.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_CODEABLE_CONCEPT, oldValueCodeableConcept, newValueCodeableConcept);
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
				msgs = ((InternalEObject)valueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newValueCodeableConcept != null)
				msgs = ((InternalEObject)newValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueCodeableConcept(newValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_CODEABLE_CONCEPT, newValueCodeableConcept, newValueCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
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
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
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
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_RANGE, oldValueRange, newValueRange);
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
				msgs = ((InternalEObject)valueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_RANGE, null, msgs);
			if (newValueRange != null)
				msgs = ((InternalEObject)newValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_RANGE, null, msgs);
			msgs = basicSetValueRange(newValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_RANGE, newValueRange, newValueRange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_REFERENCE, oldValueReference, newValueReference);
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
				msgs = ((InternalEObject)valueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_REFERENCE, null, msgs);
			if (newValueReference != null)
				msgs = ((InternalEObject)newValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_REFERENCE, null, msgs);
			msgs = basicSetValueReference(newValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_REFERENCE, newValueReference, newValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_REPORT_COMPONENT__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.MEASURE_REPORT_COMPONENT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_CODEABLE_CONCEPT:
				return basicSetValueCodeableConcept(null, msgs);
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_RANGE:
				return basicSetValueRange(null, msgs);
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_REFERENCE:
				return basicSetValueReference(null, msgs);
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
			case FhirPackage.MEASURE_REPORT_COMPONENT__LINK_ID:
				return getLinkId();
			case FhirPackage.MEASURE_REPORT_COMPONENT__CODE:
				return getCode();
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_BOOLEAN:
				return getValueBoolean();
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_RANGE:
				return getValueRange();
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_REFERENCE:
				return getValueReference();
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
			case FhirPackage.MEASURE_REPORT_COMPONENT__LINK_ID:
				setLinkId((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_RANGE:
				setValueRange((Range)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_REFERENCE:
				setValueReference((Reference)newValue);
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
			case FhirPackage.MEASURE_REPORT_COMPONENT__LINK_ID:
				setLinkId((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_RANGE:
				setValueRange((Range)null);
				return;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_REFERENCE:
				setValueReference((Reference)null);
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
			case FhirPackage.MEASURE_REPORT_COMPONENT__LINK_ID:
				return linkId != null;
			case FhirPackage.MEASURE_REPORT_COMPONENT__CODE:
				return code != null;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_QUANTITY:
				return valueQuantity != null;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_RANGE:
				return valueRange != null;
			case FhirPackage.MEASURE_REPORT_COMPONENT__VALUE_REFERENCE:
				return valueReference != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportComponentImpl
