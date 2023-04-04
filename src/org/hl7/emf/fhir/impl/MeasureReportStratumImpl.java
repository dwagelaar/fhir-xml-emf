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
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.Duration;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.MeasureReportComponent;
import org.hl7.emf.fhir.MeasureReportPopulation1;
import org.hl7.emf.fhir.MeasureReportStratum;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.Range;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Stratum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getMeasureScoreQuantity <em>Measure Score Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getMeasureScoreDateTime <em>Measure Score Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getMeasureScoreCodeableConcept <em>Measure Score Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getMeasureScorePeriod <em>Measure Score Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getMeasureScoreRange <em>Measure Score Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportStratumImpl#getMeasureScoreDuration <em>Measure Score Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportStratumImpl extends BackboneElementImpl implements MeasureReportStratum {
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
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportComponent> component;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportPopulation1> population;

	/**
	 * The cached value of the '{@link #getMeasureScoreQuantity() <em>Measure Score Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity measureScoreQuantity;

	/**
	 * The cached value of the '{@link #getMeasureScoreDateTime() <em>Measure Score Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime measureScoreDateTime;

	/**
	 * The cached value of the '{@link #getMeasureScoreCodeableConcept() <em>Measure Score Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept measureScoreCodeableConcept;

	/**
	 * The cached value of the '{@link #getMeasureScorePeriod() <em>Measure Score Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScorePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period measureScorePeriod;

	/**
	 * The cached value of the '{@link #getMeasureScoreRange() <em>Measure Score Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreRange()
	 * @generated
	 * @ordered
	 */
	protected Range measureScoreRange;

	/**
	 * The cached value of the '{@link #getMeasureScoreDuration() <em>Measure Score Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration measureScoreDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportStratumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureReportStratum();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_CODEABLE_CONCEPT, oldValueCodeableConcept, newValueCodeableConcept);
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
				msgs = ((InternalEObject)valueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newValueCodeableConcept != null)
				msgs = ((InternalEObject)newValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueCodeableConcept(newValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_CODEABLE_CONCEPT, newValueCodeableConcept, newValueCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
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
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
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
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_RANGE, oldValueRange, newValueRange);
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
				msgs = ((InternalEObject)valueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_RANGE, null, msgs);
			if (newValueRange != null)
				msgs = ((InternalEObject)newValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_RANGE, null, msgs);
			msgs = basicSetValueRange(newValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_RANGE, newValueRange, newValueRange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_REFERENCE, oldValueReference, newValueReference);
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
				msgs = ((InternalEObject)valueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_REFERENCE, null, msgs);
			if (newValueReference != null)
				msgs = ((InternalEObject)newValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE_REFERENCE, null, msgs);
			msgs = basicSetValueReference(newValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE_REFERENCE, newValueReference, newValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<MeasureReportComponent>(MeasureReportComponent.class, this, FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportPopulation1> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<MeasureReportPopulation1>(MeasureReportPopulation1.class, this, FhirPackage.MEASURE_REPORT_STRATUM__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMeasureScoreQuantity() {
		return measureScoreQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreQuantity(Quantity newMeasureScoreQuantity, NotificationChain msgs) {
		Quantity oldMeasureScoreQuantity = measureScoreQuantity;
		measureScoreQuantity = newMeasureScoreQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_QUANTITY, oldMeasureScoreQuantity, newMeasureScoreQuantity);
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
	public void setMeasureScoreQuantity(Quantity newMeasureScoreQuantity) {
		if (newMeasureScoreQuantity != measureScoreQuantity) {
			NotificationChain msgs = null;
			if (measureScoreQuantity != null)
				msgs = ((InternalEObject)measureScoreQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_QUANTITY, null, msgs);
			if (newMeasureScoreQuantity != null)
				msgs = ((InternalEObject)newMeasureScoreQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_QUANTITY, null, msgs);
			msgs = basicSetMeasureScoreQuantity(newMeasureScoreQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_QUANTITY, newMeasureScoreQuantity, newMeasureScoreQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getMeasureScoreDateTime() {
		return measureScoreDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreDateTime(DateTime newMeasureScoreDateTime, NotificationChain msgs) {
		DateTime oldMeasureScoreDateTime = measureScoreDateTime;
		measureScoreDateTime = newMeasureScoreDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DATE_TIME, oldMeasureScoreDateTime, newMeasureScoreDateTime);
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
	public void setMeasureScoreDateTime(DateTime newMeasureScoreDateTime) {
		if (newMeasureScoreDateTime != measureScoreDateTime) {
			NotificationChain msgs = null;
			if (measureScoreDateTime != null)
				msgs = ((InternalEObject)measureScoreDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DATE_TIME, null, msgs);
			if (newMeasureScoreDateTime != null)
				msgs = ((InternalEObject)newMeasureScoreDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DATE_TIME, null, msgs);
			msgs = basicSetMeasureScoreDateTime(newMeasureScoreDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DATE_TIME, newMeasureScoreDateTime, newMeasureScoreDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMeasureScoreCodeableConcept() {
		return measureScoreCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreCodeableConcept(CodeableConcept newMeasureScoreCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldMeasureScoreCodeableConcept = measureScoreCodeableConcept;
		measureScoreCodeableConcept = newMeasureScoreCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_CODEABLE_CONCEPT, oldMeasureScoreCodeableConcept, newMeasureScoreCodeableConcept);
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
	public void setMeasureScoreCodeableConcept(CodeableConcept newMeasureScoreCodeableConcept) {
		if (newMeasureScoreCodeableConcept != measureScoreCodeableConcept) {
			NotificationChain msgs = null;
			if (measureScoreCodeableConcept != null)
				msgs = ((InternalEObject)measureScoreCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_CODEABLE_CONCEPT, null, msgs);
			if (newMeasureScoreCodeableConcept != null)
				msgs = ((InternalEObject)newMeasureScoreCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMeasureScoreCodeableConcept(newMeasureScoreCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_CODEABLE_CONCEPT, newMeasureScoreCodeableConcept, newMeasureScoreCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getMeasureScorePeriod() {
		return measureScorePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScorePeriod(Period newMeasureScorePeriod, NotificationChain msgs) {
		Period oldMeasureScorePeriod = measureScorePeriod;
		measureScorePeriod = newMeasureScorePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_PERIOD, oldMeasureScorePeriod, newMeasureScorePeriod);
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
	public void setMeasureScorePeriod(Period newMeasureScorePeriod) {
		if (newMeasureScorePeriod != measureScorePeriod) {
			NotificationChain msgs = null;
			if (measureScorePeriod != null)
				msgs = ((InternalEObject)measureScorePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_PERIOD, null, msgs);
			if (newMeasureScorePeriod != null)
				msgs = ((InternalEObject)newMeasureScorePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_PERIOD, null, msgs);
			msgs = basicSetMeasureScorePeriod(newMeasureScorePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_PERIOD, newMeasureScorePeriod, newMeasureScorePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getMeasureScoreRange() {
		return measureScoreRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreRange(Range newMeasureScoreRange, NotificationChain msgs) {
		Range oldMeasureScoreRange = measureScoreRange;
		measureScoreRange = newMeasureScoreRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_RANGE, oldMeasureScoreRange, newMeasureScoreRange);
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
	public void setMeasureScoreRange(Range newMeasureScoreRange) {
		if (newMeasureScoreRange != measureScoreRange) {
			NotificationChain msgs = null;
			if (measureScoreRange != null)
				msgs = ((InternalEObject)measureScoreRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_RANGE, null, msgs);
			if (newMeasureScoreRange != null)
				msgs = ((InternalEObject)newMeasureScoreRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_RANGE, null, msgs);
			msgs = basicSetMeasureScoreRange(newMeasureScoreRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_RANGE, newMeasureScoreRange, newMeasureScoreRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getMeasureScoreDuration() {
		return measureScoreDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreDuration(Duration newMeasureScoreDuration, NotificationChain msgs) {
		Duration oldMeasureScoreDuration = measureScoreDuration;
		measureScoreDuration = newMeasureScoreDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DURATION, oldMeasureScoreDuration, newMeasureScoreDuration);
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
	public void setMeasureScoreDuration(Duration newMeasureScoreDuration) {
		if (newMeasureScoreDuration != measureScoreDuration) {
			NotificationChain msgs = null;
			if (measureScoreDuration != null)
				msgs = ((InternalEObject)measureScoreDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DURATION, null, msgs);
			if (newMeasureScoreDuration != null)
				msgs = ((InternalEObject)newMeasureScoreDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DURATION, null, msgs);
			msgs = basicSetMeasureScoreDuration(newMeasureScoreDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DURATION, newMeasureScoreDuration, newMeasureScoreDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_CODEABLE_CONCEPT:
				return basicSetValueCodeableConcept(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_RANGE:
				return basicSetValueRange(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_REFERENCE:
				return basicSetValueReference(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_QUANTITY:
				return basicSetMeasureScoreQuantity(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DATE_TIME:
				return basicSetMeasureScoreDateTime(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_CODEABLE_CONCEPT:
				return basicSetMeasureScoreCodeableConcept(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_PERIOD:
				return basicSetMeasureScorePeriod(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_RANGE:
				return basicSetMeasureScoreRange(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DURATION:
				return basicSetMeasureScoreDuration(null, msgs);
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_BOOLEAN:
				return getValueBoolean();
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_RANGE:
				return getValueRange();
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_REFERENCE:
				return getValueReference();
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				return getComponent();
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				return getPopulation();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_QUANTITY:
				return getMeasureScoreQuantity();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DATE_TIME:
				return getMeasureScoreDateTime();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_CODEABLE_CONCEPT:
				return getMeasureScoreCodeableConcept();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_PERIOD:
				return getMeasureScorePeriod();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_RANGE:
				return getMeasureScoreRange();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DURATION:
				return getMeasureScoreDuration();
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_RANGE:
				setValueRange((Range)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_REFERENCE:
				setValueReference((Reference)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends MeasureReportComponent>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends MeasureReportPopulation1>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_QUANTITY:
				setMeasureScoreQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DATE_TIME:
				setMeasureScoreDateTime((DateTime)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_CODEABLE_CONCEPT:
				setMeasureScoreCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_PERIOD:
				setMeasureScorePeriod((Period)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_RANGE:
				setMeasureScoreRange((Range)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DURATION:
				setMeasureScoreDuration((Duration)newValue);
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_RANGE:
				setValueRange((Range)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_REFERENCE:
				setValueReference((Reference)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				getComponent().clear();
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				getPopulation().clear();
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_QUANTITY:
				setMeasureScoreQuantity((Quantity)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DATE_TIME:
				setMeasureScoreDateTime((DateTime)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_CODEABLE_CONCEPT:
				setMeasureScoreCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_PERIOD:
				setMeasureScorePeriod((Period)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_RANGE:
				setMeasureScoreRange((Range)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DURATION:
				setMeasureScoreDuration((Duration)null);
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_QUANTITY:
				return valueQuantity != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_RANGE:
				return valueRange != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE_REFERENCE:
				return valueReference != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				return component != null && !component.isEmpty();
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				return population != null && !population.isEmpty();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_QUANTITY:
				return measureScoreQuantity != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DATE_TIME:
				return measureScoreDateTime != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_CODEABLE_CONCEPT:
				return measureScoreCodeableConcept != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_PERIOD:
				return measureScorePeriod != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_RANGE:
				return measureScoreRange != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE_DURATION:
				return measureScoreDuration != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportStratumImpl
