/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MedicinalProductDefinitionCharacteristic;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Definition Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionCharacteristicImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionCharacteristicImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionCharacteristicImpl#getValueMarkdown <em>Value Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionCharacteristicImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionCharacteristicImpl#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionCharacteristicImpl#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionCharacteristicImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionCharacteristicImpl#getValueAttachment <em>Value Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductDefinitionCharacteristicImpl extends BackboneElementImpl implements MedicinalProductDefinitionCharacteristic {
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
	 * The cached value of the '{@link #getValueCodeableConcept() <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept valueCodeableConcept;

	/**
	 * The cached value of the '{@link #getValueMarkdown() <em>Value Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown valueMarkdown;

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
	 * The cached value of the '{@link #getValueInteger() <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer valueInteger;

	/**
	 * The cached value of the '{@link #getValueDate() <em>Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date valueDate;

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
	 * The cached value of the '{@link #getValueAttachment() <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment valueAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductDefinitionCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductDefinitionCharacteristic();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT, oldValueCodeableConcept, newValueCodeableConcept);
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
				msgs = ((InternalEObject)valueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newValueCodeableConcept != null)
				msgs = ((InternalEObject)newValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueCodeableConcept(newValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT, newValueCodeableConcept, newValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getValueMarkdown() {
		return valueMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMarkdown(Markdown newValueMarkdown, NotificationChain msgs) {
		Markdown oldValueMarkdown = valueMarkdown;
		valueMarkdown = newValueMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_MARKDOWN, oldValueMarkdown, newValueMarkdown);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMarkdown(Markdown newValueMarkdown) {
		if (newValueMarkdown != valueMarkdown) {
			NotificationChain msgs = null;
			if (valueMarkdown != null)
				msgs = ((InternalEObject)valueMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_MARKDOWN, null, msgs);
			if (newValueMarkdown != null)
				msgs = ((InternalEObject)newValueMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_MARKDOWN, null, msgs);
			msgs = basicSetValueMarkdown(newValueMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_MARKDOWN, newValueMarkdown, newValueMarkdown));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
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
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_INTEGER, oldValueInteger, newValueInteger);
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
				msgs = ((InternalEObject)valueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_INTEGER, null, msgs);
			if (newValueInteger != null)
				msgs = ((InternalEObject)newValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_INTEGER, null, msgs);
			msgs = basicSetValueInteger(newValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_INTEGER, newValueInteger, newValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValueDate() {
		return valueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDate(Date newValueDate, NotificationChain msgs) {
		Date oldValueDate = valueDate;
		valueDate = newValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_DATE, oldValueDate, newValueDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDate(Date newValueDate) {
		if (newValueDate != valueDate) {
			NotificationChain msgs = null;
			if (valueDate != null)
				msgs = ((InternalEObject)valueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_DATE, null, msgs);
			if (newValueDate != null)
				msgs = ((InternalEObject)newValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_DATE, null, msgs);
			msgs = basicSetValueDate(newValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_DATE, newValueDate, newValueDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
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
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getValueAttachment() {
		return valueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAttachment(Attachment newValueAttachment, NotificationChain msgs) {
		Attachment oldValueAttachment = valueAttachment;
		valueAttachment = newValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_ATTACHMENT, oldValueAttachment, newValueAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAttachment(Attachment newValueAttachment) {
		if (newValueAttachment != valueAttachment) {
			NotificationChain msgs = null;
			if (valueAttachment != null)
				msgs = ((InternalEObject)valueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_ATTACHMENT, null, msgs);
			if (newValueAttachment != null)
				msgs = ((InternalEObject)newValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetValueAttachment(newValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_ATTACHMENT, newValueAttachment, newValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				return basicSetValueCodeableConcept(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_MARKDOWN:
				return basicSetValueMarkdown(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_INTEGER:
				return basicSetValueInteger(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_DATE:
				return basicSetValueDate(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_ATTACHMENT:
				return basicSetValueAttachment(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_MARKDOWN:
				return getValueMarkdown();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_INTEGER:
				return getValueInteger();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_DATE:
				return getValueDate();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_BOOLEAN:
				return getValueBoolean();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_ATTACHMENT:
				return getValueAttachment();
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_MARKDOWN:
				setValueMarkdown((Markdown)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_DATE:
				setValueDate((Date)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_MARKDOWN:
				setValueMarkdown((Markdown)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_DATE:
				setValueDate((Date)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_MARKDOWN:
				return valueMarkdown != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_QUANTITY:
				return valueQuantity != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_INTEGER:
				return valueInteger != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_DATE:
				return valueDate != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC__VALUE_ATTACHMENT:
				return valueAttachment != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductDefinitionCharacteristicImpl
