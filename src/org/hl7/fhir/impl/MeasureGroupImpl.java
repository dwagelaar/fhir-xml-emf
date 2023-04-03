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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRTypes;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getSubjectReference <em>Subject Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getScoring <em>Scoring</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getScoringUnit <em>Scoring Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getRateAggregation <em>Rate Aggregation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getImprovementNotation <em>Improvement Notation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureGroupImpl#getStratifier <em>Stratifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureGroupImpl extends BackboneElementImpl implements MeasureGroup {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String linkId;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getSubjectCodeableConcept() <em>Subject Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subjectCodeableConcept;

	/**
	 * The cached value of the '{@link #getSubjectReference() <em>Subject Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectReference()
	 * @generated
	 * @ordered
	 */
	protected Reference subjectReference;

	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected FHIRTypes basis;

	/**
	 * The cached value of the '{@link #getScoring() <em>Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoring()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept scoring;

	/**
	 * The cached value of the '{@link #getScoringUnit() <em>Scoring Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoringUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept scoringUnit;

	/**
	 * The cached value of the '{@link #getRateAggregation() <em>Rate Aggregation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateAggregation()
	 * @generated
	 * @ordered
	 */
	protected Markdown rateAggregation;

	/**
	 * The cached value of the '{@link #getImprovementNotation() <em>Improvement Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovementNotation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept improvementNotation;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> library;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurePopulation> population;

	/**
	 * The cached value of the '{@link #getStratifier() <em>Stratifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStratifier()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureStratifier> stratifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.hl7.fhir.String newLinkId, NotificationChain msgs) {
		org.hl7.fhir.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__LINK_ID, oldLinkId, newLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(org.hl7.fhir.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEASURE_GROUP__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubjectCodeableConcept() {
		return subjectCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSubjectCodeableConcept = subjectCodeableConcept;
		subjectCodeableConcept = newSubjectCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__SUBJECT_CODEABLE_CONCEPT, oldSubjectCodeableConcept, newSubjectCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept) {
		if (newSubjectCodeableConcept != subjectCodeableConcept) {
			NotificationChain msgs = null;
			if (subjectCodeableConcept != null)
				msgs = ((InternalEObject)subjectCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			if (newSubjectCodeableConcept != null)
				msgs = ((InternalEObject)newSubjectCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSubjectCodeableConcept(newSubjectCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__SUBJECT_CODEABLE_CONCEPT, newSubjectCodeableConcept, newSubjectCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubjectReference() {
		return subjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectReference(Reference newSubjectReference, NotificationChain msgs) {
		Reference oldSubjectReference = subjectReference;
		subjectReference = newSubjectReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__SUBJECT_REFERENCE, oldSubjectReference, newSubjectReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectReference(Reference newSubjectReference) {
		if (newSubjectReference != subjectReference) {
			NotificationChain msgs = null;
			if (subjectReference != null)
				msgs = ((InternalEObject)subjectReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__SUBJECT_REFERENCE, null, msgs);
			if (newSubjectReference != null)
				msgs = ((InternalEObject)newSubjectReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__SUBJECT_REFERENCE, null, msgs);
			msgs = basicSetSubjectReference(newSubjectReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__SUBJECT_REFERENCE, newSubjectReference, newSubjectReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRTypes getBasis() {
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasis(FHIRTypes newBasis, NotificationChain msgs) {
		FHIRTypes oldBasis = basis;
		basis = newBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__BASIS, oldBasis, newBasis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasis(FHIRTypes newBasis) {
		if (newBasis != basis) {
			NotificationChain msgs = null;
			if (basis != null)
				msgs = ((InternalEObject)basis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__BASIS, null, msgs);
			if (newBasis != null)
				msgs = ((InternalEObject)newBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__BASIS, null, msgs);
			msgs = basicSetBasis(newBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__BASIS, newBasis, newBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getScoring() {
		return scoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoring(CodeableConcept newScoring, NotificationChain msgs) {
		CodeableConcept oldScoring = scoring;
		scoring = newScoring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__SCORING, oldScoring, newScoring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoring(CodeableConcept newScoring) {
		if (newScoring != scoring) {
			NotificationChain msgs = null;
			if (scoring != null)
				msgs = ((InternalEObject)scoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__SCORING, null, msgs);
			if (newScoring != null)
				msgs = ((InternalEObject)newScoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__SCORING, null, msgs);
			msgs = basicSetScoring(newScoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__SCORING, newScoring, newScoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getScoringUnit() {
		return scoringUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoringUnit(CodeableConcept newScoringUnit, NotificationChain msgs) {
		CodeableConcept oldScoringUnit = scoringUnit;
		scoringUnit = newScoringUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__SCORING_UNIT, oldScoringUnit, newScoringUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoringUnit(CodeableConcept newScoringUnit) {
		if (newScoringUnit != scoringUnit) {
			NotificationChain msgs = null;
			if (scoringUnit != null)
				msgs = ((InternalEObject)scoringUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__SCORING_UNIT, null, msgs);
			if (newScoringUnit != null)
				msgs = ((InternalEObject)newScoringUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__SCORING_UNIT, null, msgs);
			msgs = basicSetScoringUnit(newScoringUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__SCORING_UNIT, newScoringUnit, newScoringUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getRateAggregation() {
		return rateAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateAggregation(Markdown newRateAggregation, NotificationChain msgs) {
		Markdown oldRateAggregation = rateAggregation;
		rateAggregation = newRateAggregation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__RATE_AGGREGATION, oldRateAggregation, newRateAggregation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateAggregation(Markdown newRateAggregation) {
		if (newRateAggregation != rateAggregation) {
			NotificationChain msgs = null;
			if (rateAggregation != null)
				msgs = ((InternalEObject)rateAggregation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__RATE_AGGREGATION, null, msgs);
			if (newRateAggregation != null)
				msgs = ((InternalEObject)newRateAggregation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__RATE_AGGREGATION, null, msgs);
			msgs = basicSetRateAggregation(newRateAggregation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__RATE_AGGREGATION, newRateAggregation, newRateAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getImprovementNotation() {
		return improvementNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImprovementNotation(CodeableConcept newImprovementNotation, NotificationChain msgs) {
		CodeableConcept oldImprovementNotation = improvementNotation;
		improvementNotation = newImprovementNotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__IMPROVEMENT_NOTATION, oldImprovementNotation, newImprovementNotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImprovementNotation(CodeableConcept newImprovementNotation) {
		if (newImprovementNotation != improvementNotation) {
			NotificationChain msgs = null;
			if (improvementNotation != null)
				msgs = ((InternalEObject)improvementNotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__IMPROVEMENT_NOTATION, null, msgs);
			if (newImprovementNotation != null)
				msgs = ((InternalEObject)newImprovementNotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_GROUP__IMPROVEMENT_NOTATION, null, msgs);
			msgs = basicSetImprovementNotation(newImprovementNotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_GROUP__IMPROVEMENT_NOTATION, newImprovementNotation, newImprovementNotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Canonical> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.MEASURE_GROUP__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurePopulation> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<MeasurePopulation>(MeasurePopulation.class, this, FhirPackage.MEASURE_GROUP__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureStratifier> getStratifier() {
		if (stratifier == null) {
			stratifier = new EObjectContainmentEList<MeasureStratifier>(MeasureStratifier.class, this, FhirPackage.MEASURE_GROUP__STRATIFIER);
		}
		return stratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_GROUP__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.MEASURE_GROUP__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEASURE_GROUP__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.MEASURE_GROUP__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_GROUP__SUBJECT_CODEABLE_CONCEPT:
				return basicSetSubjectCodeableConcept(null, msgs);
			case FhirPackage.MEASURE_GROUP__SUBJECT_REFERENCE:
				return basicSetSubjectReference(null, msgs);
			case FhirPackage.MEASURE_GROUP__BASIS:
				return basicSetBasis(null, msgs);
			case FhirPackage.MEASURE_GROUP__SCORING:
				return basicSetScoring(null, msgs);
			case FhirPackage.MEASURE_GROUP__SCORING_UNIT:
				return basicSetScoringUnit(null, msgs);
			case FhirPackage.MEASURE_GROUP__RATE_AGGREGATION:
				return basicSetRateAggregation(null, msgs);
			case FhirPackage.MEASURE_GROUP__IMPROVEMENT_NOTATION:
				return basicSetImprovementNotation(null, msgs);
			case FhirPackage.MEASURE_GROUP__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_GROUP__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_GROUP__STRATIFIER:
				return ((InternalEList<?>)getStratifier()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEASURE_GROUP__LINK_ID:
				return getLinkId();
			case FhirPackage.MEASURE_GROUP__CODE:
				return getCode();
			case FhirPackage.MEASURE_GROUP__DESCRIPTION:
				return getDescription();
			case FhirPackage.MEASURE_GROUP__TYPE:
				return getType();
			case FhirPackage.MEASURE_GROUP__SUBJECT_CODEABLE_CONCEPT:
				return getSubjectCodeableConcept();
			case FhirPackage.MEASURE_GROUP__SUBJECT_REFERENCE:
				return getSubjectReference();
			case FhirPackage.MEASURE_GROUP__BASIS:
				return getBasis();
			case FhirPackage.MEASURE_GROUP__SCORING:
				return getScoring();
			case FhirPackage.MEASURE_GROUP__SCORING_UNIT:
				return getScoringUnit();
			case FhirPackage.MEASURE_GROUP__RATE_AGGREGATION:
				return getRateAggregation();
			case FhirPackage.MEASURE_GROUP__IMPROVEMENT_NOTATION:
				return getImprovementNotation();
			case FhirPackage.MEASURE_GROUP__LIBRARY:
				return getLibrary();
			case FhirPackage.MEASURE_GROUP__POPULATION:
				return getPopulation();
			case FhirPackage.MEASURE_GROUP__STRATIFIER:
				return getStratifier();
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
			case FhirPackage.MEASURE_GROUP__LINK_ID:
				setLinkId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__SUBJECT_REFERENCE:
				setSubjectReference((Reference)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__BASIS:
				setBasis((FHIRTypes)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__SCORING:
				setScoring((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__SCORING_UNIT:
				setScoringUnit((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__RATE_AGGREGATION:
				setRateAggregation((Markdown)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__IMPROVEMENT_NOTATION:
				setImprovementNotation((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends MeasurePopulation>)newValue);
				return;
			case FhirPackage.MEASURE_GROUP__STRATIFIER:
				getStratifier().clear();
				getStratifier().addAll((Collection<? extends MeasureStratifier>)newValue);
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
			case FhirPackage.MEASURE_GROUP__LINK_ID:
				setLinkId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE_GROUP__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_GROUP__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.MEASURE_GROUP__TYPE:
				getType().clear();
				return;
			case FhirPackage.MEASURE_GROUP__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_GROUP__SUBJECT_REFERENCE:
				setSubjectReference((Reference)null);
				return;
			case FhirPackage.MEASURE_GROUP__BASIS:
				setBasis((FHIRTypes)null);
				return;
			case FhirPackage.MEASURE_GROUP__SCORING:
				setScoring((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_GROUP__SCORING_UNIT:
				setScoringUnit((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_GROUP__RATE_AGGREGATION:
				setRateAggregation((Markdown)null);
				return;
			case FhirPackage.MEASURE_GROUP__IMPROVEMENT_NOTATION:
				setImprovementNotation((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_GROUP__LIBRARY:
				getLibrary().clear();
				return;
			case FhirPackage.MEASURE_GROUP__POPULATION:
				getPopulation().clear();
				return;
			case FhirPackage.MEASURE_GROUP__STRATIFIER:
				getStratifier().clear();
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
			case FhirPackage.MEASURE_GROUP__LINK_ID:
				return linkId != null;
			case FhirPackage.MEASURE_GROUP__CODE:
				return code != null;
			case FhirPackage.MEASURE_GROUP__DESCRIPTION:
				return description != null;
			case FhirPackage.MEASURE_GROUP__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.MEASURE_GROUP__SUBJECT_CODEABLE_CONCEPT:
				return subjectCodeableConcept != null;
			case FhirPackage.MEASURE_GROUP__SUBJECT_REFERENCE:
				return subjectReference != null;
			case FhirPackage.MEASURE_GROUP__BASIS:
				return basis != null;
			case FhirPackage.MEASURE_GROUP__SCORING:
				return scoring != null;
			case FhirPackage.MEASURE_GROUP__SCORING_UNIT:
				return scoringUnit != null;
			case FhirPackage.MEASURE_GROUP__RATE_AGGREGATION:
				return rateAggregation != null;
			case FhirPackage.MEASURE_GROUP__IMPROVEMENT_NOTATION:
				return improvementNotation != null;
			case FhirPackage.MEASURE_GROUP__LIBRARY:
				return library != null && !library.isEmpty();
			case FhirPackage.MEASURE_GROUP__POPULATION:
				return population != null && !population.isEmpty();
			case FhirPackage.MEASURE_GROUP__STRATIFIER:
				return stratifier != null && !stratifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureGroupImpl
