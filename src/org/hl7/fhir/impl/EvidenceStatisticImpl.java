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
import org.hl7.fhir.EvidenceAttributeEstimate;
import org.hl7.fhir.EvidenceModelCharacteristic;
import org.hl7.fhir.EvidenceSampleSize;
import org.hl7.fhir.EvidenceStatistic;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Statistic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getStatisticType <em>Statistic Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getNumberOfEvents <em>Number Of Events</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getNumberAffected <em>Number Affected</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getSampleSize <em>Sample Size</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getAttributeEstimate <em>Attribute Estimate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceStatisticImpl#getModelCharacteristic <em>Model Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceStatisticImpl extends BackboneElementImpl implements EvidenceStatistic {
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
	 * The cached value of the '{@link #getStatisticType() <em>Statistic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statisticType;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getNumberOfEvents() <em>Number Of Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEvents()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfEvents;

	/**
	 * The cached value of the '{@link #getNumberAffected() <em>Number Affected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberAffected()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberAffected;

	/**
	 * The cached value of the '{@link #getSampleSize() <em>Sample Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleSize()
	 * @generated
	 * @ordered
	 */
	protected EvidenceSampleSize sampleSize;

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
	 * The cached value of the '{@link #getModelCharacteristic() <em>Model Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceModelCharacteristic> modelCharacteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceStatisticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceStatistic();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.EVIDENCE_STATISTIC__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatisticType() {
		return statisticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatisticType(CodeableConcept newStatisticType, NotificationChain msgs) {
		CodeableConcept oldStatisticType = statisticType;
		statisticType = newStatisticType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__STATISTIC_TYPE, oldStatisticType, newStatisticType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticType(CodeableConcept newStatisticType) {
		if (newStatisticType != statisticType) {
			NotificationChain msgs = null;
			if (statisticType != null)
				msgs = ((InternalEObject)statisticType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__STATISTIC_TYPE, null, msgs);
			if (newStatisticType != null)
				msgs = ((InternalEObject)newStatisticType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__STATISTIC_TYPE, null, msgs);
			msgs = basicSetStatisticType(newStatisticType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__STATISTIC_TYPE, newStatisticType, newStatisticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfEvents() {
		return numberOfEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfEvents(UnsignedInt newNumberOfEvents, NotificationChain msgs) {
		UnsignedInt oldNumberOfEvents = numberOfEvents;
		numberOfEvents = newNumberOfEvents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__NUMBER_OF_EVENTS, oldNumberOfEvents, newNumberOfEvents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfEvents(UnsignedInt newNumberOfEvents) {
		if (newNumberOfEvents != numberOfEvents) {
			NotificationChain msgs = null;
			if (numberOfEvents != null)
				msgs = ((InternalEObject)numberOfEvents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__NUMBER_OF_EVENTS, null, msgs);
			if (newNumberOfEvents != null)
				msgs = ((InternalEObject)newNumberOfEvents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__NUMBER_OF_EVENTS, null, msgs);
			msgs = basicSetNumberOfEvents(newNumberOfEvents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__NUMBER_OF_EVENTS, newNumberOfEvents, newNumberOfEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberAffected() {
		return numberAffected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberAffected(UnsignedInt newNumberAffected, NotificationChain msgs) {
		UnsignedInt oldNumberAffected = numberAffected;
		numberAffected = newNumberAffected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__NUMBER_AFFECTED, oldNumberAffected, newNumberAffected);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberAffected(UnsignedInt newNumberAffected) {
		if (newNumberAffected != numberAffected) {
			NotificationChain msgs = null;
			if (numberAffected != null)
				msgs = ((InternalEObject)numberAffected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__NUMBER_AFFECTED, null, msgs);
			if (newNumberAffected != null)
				msgs = ((InternalEObject)newNumberAffected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__NUMBER_AFFECTED, null, msgs);
			msgs = basicSetNumberAffected(newNumberAffected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__NUMBER_AFFECTED, newNumberAffected, newNumberAffected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceSampleSize getSampleSize() {
		return sampleSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSampleSize(EvidenceSampleSize newSampleSize, NotificationChain msgs) {
		EvidenceSampleSize oldSampleSize = sampleSize;
		sampleSize = newSampleSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__SAMPLE_SIZE, oldSampleSize, newSampleSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleSize(EvidenceSampleSize newSampleSize) {
		if (newSampleSize != sampleSize) {
			NotificationChain msgs = null;
			if (sampleSize != null)
				msgs = ((InternalEObject)sampleSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__SAMPLE_SIZE, null, msgs);
			if (newSampleSize != null)
				msgs = ((InternalEObject)newSampleSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_STATISTIC__SAMPLE_SIZE, null, msgs);
			msgs = basicSetSampleSize(newSampleSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_STATISTIC__SAMPLE_SIZE, newSampleSize, newSampleSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceAttributeEstimate> getAttributeEstimate() {
		if (attributeEstimate == null) {
			attributeEstimate = new EObjectContainmentEList<EvidenceAttributeEstimate>(EvidenceAttributeEstimate.class, this, FhirPackage.EVIDENCE_STATISTIC__ATTRIBUTE_ESTIMATE);
		}
		return attributeEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceModelCharacteristic> getModelCharacteristic() {
		if (modelCharacteristic == null) {
			modelCharacteristic = new EObjectContainmentEList<EvidenceModelCharacteristic>(EvidenceModelCharacteristic.class, this, FhirPackage.EVIDENCE_STATISTIC__MODEL_CHARACTERISTIC);
		}
		return modelCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_STATISTIC__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE_STATISTIC__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_STATISTIC__STATISTIC_TYPE:
				return basicSetStatisticType(null, msgs);
			case FhirPackage.EVIDENCE_STATISTIC__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.EVIDENCE_STATISTIC__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_OF_EVENTS:
				return basicSetNumberOfEvents(null, msgs);
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_AFFECTED:
				return basicSetNumberAffected(null, msgs);
			case FhirPackage.EVIDENCE_STATISTIC__SAMPLE_SIZE:
				return basicSetSampleSize(null, msgs);
			case FhirPackage.EVIDENCE_STATISTIC__ATTRIBUTE_ESTIMATE:
				return ((InternalEList<?>)getAttributeEstimate()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_STATISTIC__MODEL_CHARACTERISTIC:
				return ((InternalEList<?>)getModelCharacteristic()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EVIDENCE_STATISTIC__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE_STATISTIC__NOTE:
				return getNote();
			case FhirPackage.EVIDENCE_STATISTIC__STATISTIC_TYPE:
				return getStatisticType();
			case FhirPackage.EVIDENCE_STATISTIC__CATEGORY:
				return getCategory();
			case FhirPackage.EVIDENCE_STATISTIC__QUANTITY:
				return getQuantity();
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_OF_EVENTS:
				return getNumberOfEvents();
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_AFFECTED:
				return getNumberAffected();
			case FhirPackage.EVIDENCE_STATISTIC__SAMPLE_SIZE:
				return getSampleSize();
			case FhirPackage.EVIDENCE_STATISTIC__ATTRIBUTE_ESTIMATE:
				return getAttributeEstimate();
			case FhirPackage.EVIDENCE_STATISTIC__MODEL_CHARACTERISTIC:
				return getModelCharacteristic();
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
			case FhirPackage.EVIDENCE_STATISTIC__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__STATISTIC_TYPE:
				setStatisticType((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_OF_EVENTS:
				setNumberOfEvents((UnsignedInt)newValue);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_AFFECTED:
				setNumberAffected((UnsignedInt)newValue);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__SAMPLE_SIZE:
				setSampleSize((EvidenceSampleSize)newValue);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__ATTRIBUTE_ESTIMATE:
				getAttributeEstimate().clear();
				getAttributeEstimate().addAll((Collection<? extends EvidenceAttributeEstimate>)newValue);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__MODEL_CHARACTERISTIC:
				getModelCharacteristic().clear();
				getModelCharacteristic().addAll((Collection<? extends EvidenceModelCharacteristic>)newValue);
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
			case FhirPackage.EVIDENCE_STATISTIC__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EVIDENCE_STATISTIC__STATISTIC_TYPE:
				setStatisticType((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_OF_EVENTS:
				setNumberOfEvents((UnsignedInt)null);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_AFFECTED:
				setNumberAffected((UnsignedInt)null);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__SAMPLE_SIZE:
				setSampleSize((EvidenceSampleSize)null);
				return;
			case FhirPackage.EVIDENCE_STATISTIC__ATTRIBUTE_ESTIMATE:
				getAttributeEstimate().clear();
				return;
			case FhirPackage.EVIDENCE_STATISTIC__MODEL_CHARACTERISTIC:
				getModelCharacteristic().clear();
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
			case FhirPackage.EVIDENCE_STATISTIC__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE_STATISTIC__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EVIDENCE_STATISTIC__STATISTIC_TYPE:
				return statisticType != null;
			case FhirPackage.EVIDENCE_STATISTIC__CATEGORY:
				return category != null;
			case FhirPackage.EVIDENCE_STATISTIC__QUANTITY:
				return quantity != null;
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_OF_EVENTS:
				return numberOfEvents != null;
			case FhirPackage.EVIDENCE_STATISTIC__NUMBER_AFFECTED:
				return numberAffected != null;
			case FhirPackage.EVIDENCE_STATISTIC__SAMPLE_SIZE:
				return sampleSize != null;
			case FhirPackage.EVIDENCE_STATISTIC__ATTRIBUTE_ESTIMATE:
				return attributeEstimate != null && !attributeEstimate.isEmpty();
			case FhirPackage.EVIDENCE_STATISTIC__MODEL_CHARACTERISTIC:
				return modelCharacteristic != null && !modelCharacteristic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceStatisticImpl
