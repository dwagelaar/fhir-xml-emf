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

import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ObservationDefinitionQualifiedValue;
import org.hl7.fhir.ObservationRangeCategory;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Definition Qualified Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getGestationalAge <em>Gestational Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getRangeCategory <em>Range Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getValidCodedValueSet <em>Valid Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getNormalCodedValueSet <em>Normal Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getAbnormalCodedValueSet <em>Abnormal Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedValueImpl#getCriticalCodedValueSet <em>Critical Coded Value Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationDefinitionQualifiedValueImpl extends BackboneElementImpl implements ObservationDefinitionQualifiedValue {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept context;

	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> appliesTo;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected AdministrativeGender gender;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected Range age;

	/**
	 * The cached value of the '{@link #getGestationalAge() <em>Gestational Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGestationalAge()
	 * @generated
	 * @ordered
	 */
	protected Range gestationalAge;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String condition;

	/**
	 * The cached value of the '{@link #getRangeCategory() <em>Range Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeCategory()
	 * @generated
	 * @ordered
	 */
	protected ObservationRangeCategory rangeCategory;

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
	 * The cached value of the '{@link #getValidCodedValueSet() <em>Valid Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Canonical validCodedValueSet;

	/**
	 * The cached value of the '{@link #getNormalCodedValueSet() <em>Normal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Canonical normalCodedValueSet;

	/**
	 * The cached value of the '{@link #getAbnormalCodedValueSet() <em>Abnormal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbnormalCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Canonical abnormalCodedValueSet;

	/**
	 * The cached value of the '{@link #getCriticalCodedValueSet() <em>Critical Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Canonical criticalCodedValueSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationDefinitionQualifiedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getObservationDefinitionQualifiedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(CodeableConcept newContext, NotificationChain msgs) {
		CodeableConcept oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(CodeableConcept newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAppliesTo() {
		if (appliesTo == null) {
			appliesTo = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__APPLIES_TO);
		}
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGender(AdministrativeGender newGender, NotificationChain msgs) {
		AdministrativeGender oldGender = gender;
		gender = newGender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GENDER, oldGender, newGender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(AdministrativeGender newGender) {
		if (newGender != gender) {
			NotificationChain msgs = null;
			if (gender != null)
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GENDER, newGender, newGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAge(Range newAge, NotificationChain msgs) {
		Range oldAge = age;
		age = newAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__AGE, oldAge, newAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(Range newAge) {
		if (newAge != age) {
			NotificationChain msgs = null;
			if (age != null)
				msgs = ((InternalEObject)age).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__AGE, null, msgs);
			if (newAge != null)
				msgs = ((InternalEObject)newAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__AGE, null, msgs);
			msgs = basicSetAge(newAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__AGE, newAge, newAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getGestationalAge() {
		return gestationalAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGestationalAge(Range newGestationalAge, NotificationChain msgs) {
		Range oldGestationalAge = gestationalAge;
		gestationalAge = newGestationalAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GESTATIONAL_AGE, oldGestationalAge, newGestationalAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGestationalAge(Range newGestationalAge) {
		if (newGestationalAge != gestationalAge) {
			NotificationChain msgs = null;
			if (gestationalAge != null)
				msgs = ((InternalEObject)gestationalAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GESTATIONAL_AGE, null, msgs);
			if (newGestationalAge != null)
				msgs = ((InternalEObject)newGestationalAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GESTATIONAL_AGE, null, msgs);
			msgs = basicSetGestationalAge(newGestationalAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GESTATIONAL_AGE, newGestationalAge, newGestationalAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(org.hl7.fhir.String newCondition, NotificationChain msgs) {
		org.hl7.fhir.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(org.hl7.fhir.String newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRangeCategory getRangeCategory() {
		return rangeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeCategory(ObservationRangeCategory newRangeCategory, NotificationChain msgs) {
		ObservationRangeCategory oldRangeCategory = rangeCategory;
		rangeCategory = newRangeCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE_CATEGORY, oldRangeCategory, newRangeCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeCategory(ObservationRangeCategory newRangeCategory) {
		if (newRangeCategory != rangeCategory) {
			NotificationChain msgs = null;
			if (rangeCategory != null)
				msgs = ((InternalEObject)rangeCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE_CATEGORY, null, msgs);
			if (newRangeCategory != null)
				msgs = ((InternalEObject)newRangeCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE_CATEGORY, null, msgs);
			msgs = basicSetRangeCategory(newRangeCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE_CATEGORY, newRangeCategory, newRangeCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE, oldRange, newRange);
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
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getValidCodedValueSet() {
		return validCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidCodedValueSet(Canonical newValidCodedValueSet, NotificationChain msgs) {
		Canonical oldValidCodedValueSet = validCodedValueSet;
		validCodedValueSet = newValidCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__VALID_CODED_VALUE_SET, oldValidCodedValueSet, newValidCodedValueSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidCodedValueSet(Canonical newValidCodedValueSet) {
		if (newValidCodedValueSet != validCodedValueSet) {
			NotificationChain msgs = null;
			if (validCodedValueSet != null)
				msgs = ((InternalEObject)validCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__VALID_CODED_VALUE_SET, null, msgs);
			if (newValidCodedValueSet != null)
				msgs = ((InternalEObject)newValidCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__VALID_CODED_VALUE_SET, null, msgs);
			msgs = basicSetValidCodedValueSet(newValidCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__VALID_CODED_VALUE_SET, newValidCodedValueSet, newValidCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getNormalCodedValueSet() {
		return normalCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalCodedValueSet(Canonical newNormalCodedValueSet, NotificationChain msgs) {
		Canonical oldNormalCodedValueSet = normalCodedValueSet;
		normalCodedValueSet = newNormalCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__NORMAL_CODED_VALUE_SET, oldNormalCodedValueSet, newNormalCodedValueSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalCodedValueSet(Canonical newNormalCodedValueSet) {
		if (newNormalCodedValueSet != normalCodedValueSet) {
			NotificationChain msgs = null;
			if (normalCodedValueSet != null)
				msgs = ((InternalEObject)normalCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__NORMAL_CODED_VALUE_SET, null, msgs);
			if (newNormalCodedValueSet != null)
				msgs = ((InternalEObject)newNormalCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__NORMAL_CODED_VALUE_SET, null, msgs);
			msgs = basicSetNormalCodedValueSet(newNormalCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__NORMAL_CODED_VALUE_SET, newNormalCodedValueSet, newNormalCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getAbnormalCodedValueSet() {
		return abnormalCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbnormalCodedValueSet(Canonical newAbnormalCodedValueSet, NotificationChain msgs) {
		Canonical oldAbnormalCodedValueSet = abnormalCodedValueSet;
		abnormalCodedValueSet = newAbnormalCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__ABNORMAL_CODED_VALUE_SET, oldAbnormalCodedValueSet, newAbnormalCodedValueSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbnormalCodedValueSet(Canonical newAbnormalCodedValueSet) {
		if (newAbnormalCodedValueSet != abnormalCodedValueSet) {
			NotificationChain msgs = null;
			if (abnormalCodedValueSet != null)
				msgs = ((InternalEObject)abnormalCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__ABNORMAL_CODED_VALUE_SET, null, msgs);
			if (newAbnormalCodedValueSet != null)
				msgs = ((InternalEObject)newAbnormalCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__ABNORMAL_CODED_VALUE_SET, null, msgs);
			msgs = basicSetAbnormalCodedValueSet(newAbnormalCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__ABNORMAL_CODED_VALUE_SET, newAbnormalCodedValueSet, newAbnormalCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getCriticalCodedValueSet() {
		return criticalCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriticalCodedValueSet(Canonical newCriticalCodedValueSet, NotificationChain msgs) {
		Canonical oldCriticalCodedValueSet = criticalCodedValueSet;
		criticalCodedValueSet = newCriticalCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CRITICAL_CODED_VALUE_SET, oldCriticalCodedValueSet, newCriticalCodedValueSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalCodedValueSet(Canonical newCriticalCodedValueSet) {
		if (newCriticalCodedValueSet != criticalCodedValueSet) {
			NotificationChain msgs = null;
			if (criticalCodedValueSet != null)
				msgs = ((InternalEObject)criticalCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CRITICAL_CODED_VALUE_SET, null, msgs);
			if (newCriticalCodedValueSet != null)
				msgs = ((InternalEObject)newCriticalCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CRITICAL_CODED_VALUE_SET, null, msgs);
			msgs = basicSetCriticalCodedValueSet(newCriticalCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CRITICAL_CODED_VALUE_SET, newCriticalCodedValueSet, newCriticalCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__APPLIES_TO:
				return ((InternalEList<?>)getAppliesTo()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GENDER:
				return basicSetGender(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__AGE:
				return basicSetAge(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GESTATIONAL_AGE:
				return basicSetGestationalAge(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE_CATEGORY:
				return basicSetRangeCategory(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE:
				return basicSetRange(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__VALID_CODED_VALUE_SET:
				return basicSetValidCodedValueSet(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__NORMAL_CODED_VALUE_SET:
				return basicSetNormalCodedValueSet(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__ABNORMAL_CODED_VALUE_SET:
				return basicSetAbnormalCodedValueSet(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CRITICAL_CODED_VALUE_SET:
				return basicSetCriticalCodedValueSet(null, msgs);
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
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONTEXT:
				return getContext();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__APPLIES_TO:
				return getAppliesTo();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GENDER:
				return getGender();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__AGE:
				return getAge();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GESTATIONAL_AGE:
				return getGestationalAge();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONDITION:
				return getCondition();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE_CATEGORY:
				return getRangeCategory();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE:
				return getRange();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__VALID_CODED_VALUE_SET:
				return getValidCodedValueSet();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__NORMAL_CODED_VALUE_SET:
				return getNormalCodedValueSet();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__ABNORMAL_CODED_VALUE_SET:
				return getAbnormalCodedValueSet();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CRITICAL_CODED_VALUE_SET:
				return getCriticalCodedValueSet();
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
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONTEXT:
				setContext((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__APPLIES_TO:
				getAppliesTo().clear();
				getAppliesTo().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GENDER:
				setGender((AdministrativeGender)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__AGE:
				setAge((Range)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GESTATIONAL_AGE:
				setGestationalAge((Range)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONDITION:
				setCondition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE_CATEGORY:
				setRangeCategory((ObservationRangeCategory)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE:
				setRange((Range)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__VALID_CODED_VALUE_SET:
				setValidCodedValueSet((Canonical)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__NORMAL_CODED_VALUE_SET:
				setNormalCodedValueSet((Canonical)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__ABNORMAL_CODED_VALUE_SET:
				setAbnormalCodedValueSet((Canonical)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CRITICAL_CODED_VALUE_SET:
				setCriticalCodedValueSet((Canonical)newValue);
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
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONTEXT:
				setContext((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__APPLIES_TO:
				getAppliesTo().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GENDER:
				setGender((AdministrativeGender)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__AGE:
				setAge((Range)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GESTATIONAL_AGE:
				setGestationalAge((Range)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONDITION:
				setCondition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE_CATEGORY:
				setRangeCategory((ObservationRangeCategory)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE:
				setRange((Range)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__VALID_CODED_VALUE_SET:
				setValidCodedValueSet((Canonical)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__NORMAL_CODED_VALUE_SET:
				setNormalCodedValueSet((Canonical)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__ABNORMAL_CODED_VALUE_SET:
				setAbnormalCodedValueSet((Canonical)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CRITICAL_CODED_VALUE_SET:
				setCriticalCodedValueSet((Canonical)null);
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
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONTEXT:
				return context != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__APPLIES_TO:
				return appliesTo != null && !appliesTo.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GENDER:
				return gender != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__AGE:
				return age != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__GESTATIONAL_AGE:
				return gestationalAge != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CONDITION:
				return condition != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE_CATEGORY:
				return rangeCategory != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__RANGE:
				return range != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__VALID_CODED_VALUE_SET:
				return validCodedValueSet != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__NORMAL_CODED_VALUE_SET:
				return normalCodedValueSet != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__ABNORMAL_CODED_VALUE_SET:
				return abnormalCodedValueSet != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE__CRITICAL_CODED_VALUE_SET:
				return criticalCodedValueSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionQualifiedValueImpl
