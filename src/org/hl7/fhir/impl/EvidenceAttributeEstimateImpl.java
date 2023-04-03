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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.EvidenceAttributeEstimate;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Attribute Estimate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceAttributeEstimateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceAttributeEstimateImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceAttributeEstimateImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceAttributeEstimateImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceAttributeEstimateImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceAttributeEstimateImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceAttributeEstimateImpl#getAttributeEstimate <em>Attribute Estimate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceAttributeEstimateImpl extends BackboneElementImpl implements EvidenceAttributeEstimate {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Decimal level;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

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
	protected EvidenceAttributeEstimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceAttributeEstimate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__NOTE);
		}
		return note;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel(Decimal newLevel, NotificationChain msgs) {
		Decimal oldLevel = level;
		level = newLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__LEVEL, oldLevel, newLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Decimal newLevel) {
		if (newLevel != level) {
			NotificationChain msgs = null;
			if (level != null)
				msgs = ((InternalEObject)level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__LEVEL, null, msgs);
			if (newLevel != null)
				msgs = ((InternalEObject)newLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__LEVEL, null, msgs);
			msgs = basicSetLevel(newLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__LEVEL, newLevel, newLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceAttributeEstimate> getAttributeEstimate() {
		if (attributeEstimate == null) {
			attributeEstimate = new EObjectContainmentEList<EvidenceAttributeEstimate>(EvidenceAttributeEstimate.class, this, FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__ATTRIBUTE_ESTIMATE);
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
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__LEVEL:
				return basicSetLevel(null, msgs);
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__RANGE:
				return basicSetRange(null, msgs);
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__ATTRIBUTE_ESTIMATE:
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
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__NOTE:
				return getNote();
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__TYPE:
				return getType();
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__QUANTITY:
				return getQuantity();
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__LEVEL:
				return getLevel();
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__RANGE:
				return getRange();
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__ATTRIBUTE_ESTIMATE:
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
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__LEVEL:
				setLevel((Decimal)newValue);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__RANGE:
				setRange((Range)newValue);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__ATTRIBUTE_ESTIMATE:
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
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__LEVEL:
				setLevel((Decimal)null);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__RANGE:
				setRange((Range)null);
				return;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__ATTRIBUTE_ESTIMATE:
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
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__TYPE:
				return type != null;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__QUANTITY:
				return quantity != null;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__LEVEL:
				return level != null;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__RANGE:
				return range != null;
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE__ATTRIBUTE_ESTIMATE:
				return attributeEstimate != null && !attributeEstimate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceAttributeEstimateImpl
