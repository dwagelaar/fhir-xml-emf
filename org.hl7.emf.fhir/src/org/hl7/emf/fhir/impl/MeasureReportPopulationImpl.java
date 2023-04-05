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
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.MeasureReportPopulation;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportPopulationImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportPopulationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportPopulationImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportPopulationImpl#getSubjectResults <em>Subject Results</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportPopulationImpl#getSubjectReport <em>Subject Report</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MeasureReportPopulationImpl#getSubjects <em>Subjects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportPopulationImpl extends BackboneElementImpl implements MeasureReportPopulation {
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
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Integer count;

	/**
	 * The cached value of the '{@link #getSubjectResults() <em>Subject Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectResults()
	 * @generated
	 * @ordered
	 */
	protected Reference subjectResults;

	/**
	 * The cached value of the '{@link #getSubjectReport() <em>Subject Report</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectReport()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subjectReport;

	/**
	 * The cached value of the '{@link #getSubjects() <em>Subjects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected Reference subjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportPopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureReportPopulation();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__LINK_ID, oldLinkId, newLinkId);
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
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__LINK_ID, newLinkId, newLinkId));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Integer getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(org.hl7.emf.fhir.Integer newCount, NotificationChain msgs) {
		org.hl7.emf.fhir.Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__COUNT, oldCount, newCount);
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
	public void setCount(org.hl7.emf.fhir.Integer newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubjectResults() {
		return subjectResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectResults(Reference newSubjectResults, NotificationChain msgs) {
		Reference oldSubjectResults = subjectResults;
		subjectResults = newSubjectResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_RESULTS, oldSubjectResults, newSubjectResults);
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
	public void setSubjectResults(Reference newSubjectResults) {
		if (newSubjectResults != subjectResults) {
			NotificationChain msgs = null;
			if (subjectResults != null)
				msgs = ((InternalEObject)subjectResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_RESULTS, null, msgs);
			if (newSubjectResults != null)
				msgs = ((InternalEObject)newSubjectResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_RESULTS, null, msgs);
			msgs = basicSetSubjectResults(newSubjectResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_RESULTS, newSubjectResults, newSubjectResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubjectReport() {
		if (subjectReport == null) {
			subjectReport = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_REPORT);
		}
		return subjectReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubjects() {
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjects(Reference newSubjects, NotificationChain msgs) {
		Reference oldSubjects = subjects;
		subjects = newSubjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__SUBJECTS, oldSubjects, newSubjects);
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
	public void setSubjects(Reference newSubjects) {
		if (newSubjects != subjects) {
			NotificationChain msgs = null;
			if (subjects != null)
				msgs = ((InternalEObject)subjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__SUBJECTS, null, msgs);
			if (newSubjects != null)
				msgs = ((InternalEObject)newSubjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_POPULATION__SUBJECTS, null, msgs);
			msgs = basicSetSubjects(newSubjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_POPULATION__SUBJECTS, newSubjects, newSubjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_REPORT_POPULATION__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.MEASURE_REPORT_POPULATION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEASURE_REPORT_POPULATION__COUNT:
				return basicSetCount(null, msgs);
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_RESULTS:
				return basicSetSubjectResults(null, msgs);
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_REPORT:
				return ((InternalEList<?>)getSubjectReport()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECTS:
				return basicSetSubjects(null, msgs);
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
			case FhirPackage.MEASURE_REPORT_POPULATION__LINK_ID:
				return getLinkId();
			case FhirPackage.MEASURE_REPORT_POPULATION__CODE:
				return getCode();
			case FhirPackage.MEASURE_REPORT_POPULATION__COUNT:
				return getCount();
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_RESULTS:
				return getSubjectResults();
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_REPORT:
				return getSubjectReport();
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECTS:
				return getSubjects();
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
			case FhirPackage.MEASURE_REPORT_POPULATION__LINK_ID:
				setLinkId((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__COUNT:
				setCount((org.hl7.emf.fhir.Integer)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_RESULTS:
				setSubjectResults((Reference)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_REPORT:
				getSubjectReport().clear();
				getSubjectReport().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECTS:
				setSubjects((Reference)newValue);
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
			case FhirPackage.MEASURE_REPORT_POPULATION__LINK_ID:
				setLinkId((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__COUNT:
				setCount((org.hl7.emf.fhir.Integer)null);
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_RESULTS:
				setSubjectResults((Reference)null);
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_REPORT:
				getSubjectReport().clear();
				return;
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECTS:
				setSubjects((Reference)null);
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
			case FhirPackage.MEASURE_REPORT_POPULATION__LINK_ID:
				return linkId != null;
			case FhirPackage.MEASURE_REPORT_POPULATION__CODE:
				return code != null;
			case FhirPackage.MEASURE_REPORT_POPULATION__COUNT:
				return count != null;
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_RESULTS:
				return subjectResults != null;
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECT_REPORT:
				return subjectReport != null && !subjectReport.isEmpty();
			case FhirPackage.MEASURE_REPORT_POPULATION__SUBJECTS:
				return subjects != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportPopulationImpl
