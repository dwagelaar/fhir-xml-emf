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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.ResearchSubjectProgress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getStudy <em>Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getAssignedComparisonGroup <em>Assigned Comparison Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getActualComparisonGroup <em>Actual Comparison Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getConsent <em>Consent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchSubjectImpl extends DomainResourceImpl implements ResearchSubject {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchSubjectProgress> progress;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getStudy() <em>Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudy()
	 * @generated
	 * @ordered
	 */
	protected Reference study;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getAssignedComparisonGroup() <em>Assigned Comparison Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedComparisonGroup()
	 * @generated
	 * @ordered
	 */
	protected Id assignedComparisonGroup;

	/**
	 * The cached value of the '{@link #getActualComparisonGroup() <em>Actual Comparison Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualComparisonGroup()
	 * @generated
	 * @ordered
	 */
	protected Id actualComparisonGroup;

	/**
	 * The cached value of the '{@link #getConsent() <em>Consent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsent()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> consent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResearchSubject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.RESEARCH_SUBJECT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResearchSubjectProgress> getProgress() {
		if (progress == null) {
			progress = new EObjectContainmentEList<ResearchSubjectProgress>(ResearchSubjectProgress.class, this, FhirPackage.RESEARCH_SUBJECT__PROGRESS);
		}
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getStudy() {
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudy(Reference newStudy, NotificationChain msgs) {
		Reference oldStudy = study;
		study = newStudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__STUDY, oldStudy, newStudy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudy(Reference newStudy) {
		if (newStudy != study) {
			NotificationChain msgs = null;
			if (study != null)
				msgs = ((InternalEObject)study).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__STUDY, null, msgs);
			if (newStudy != null)
				msgs = ((InternalEObject)newStudy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__STUDY, null, msgs);
			msgs = basicSetStudy(newStudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__STUDY, newStudy, newStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getAssignedComparisonGroup() {
		return assignedComparisonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedComparisonGroup(Id newAssignedComparisonGroup, NotificationChain msgs) {
		Id oldAssignedComparisonGroup = assignedComparisonGroup;
		assignedComparisonGroup = newAssignedComparisonGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__ASSIGNED_COMPARISON_GROUP, oldAssignedComparisonGroup, newAssignedComparisonGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedComparisonGroup(Id newAssignedComparisonGroup) {
		if (newAssignedComparisonGroup != assignedComparisonGroup) {
			NotificationChain msgs = null;
			if (assignedComparisonGroup != null)
				msgs = ((InternalEObject)assignedComparisonGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__ASSIGNED_COMPARISON_GROUP, null, msgs);
			if (newAssignedComparisonGroup != null)
				msgs = ((InternalEObject)newAssignedComparisonGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__ASSIGNED_COMPARISON_GROUP, null, msgs);
			msgs = basicSetAssignedComparisonGroup(newAssignedComparisonGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__ASSIGNED_COMPARISON_GROUP, newAssignedComparisonGroup, newAssignedComparisonGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getActualComparisonGroup() {
		return actualComparisonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualComparisonGroup(Id newActualComparisonGroup, NotificationChain msgs) {
		Id oldActualComparisonGroup = actualComparisonGroup;
		actualComparisonGroup = newActualComparisonGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__ACTUAL_COMPARISON_GROUP, oldActualComparisonGroup, newActualComparisonGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualComparisonGroup(Id newActualComparisonGroup) {
		if (newActualComparisonGroup != actualComparisonGroup) {
			NotificationChain msgs = null;
			if (actualComparisonGroup != null)
				msgs = ((InternalEObject)actualComparisonGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__ACTUAL_COMPARISON_GROUP, null, msgs);
			if (newActualComparisonGroup != null)
				msgs = ((InternalEObject)newActualComparisonGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__ACTUAL_COMPARISON_GROUP, null, msgs);
			msgs = basicSetActualComparisonGroup(newActualComparisonGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__ACTUAL_COMPARISON_GROUP, newActualComparisonGroup, newActualComparisonGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getConsent() {
		if (consent == null) {
			consent = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_SUBJECT__CONSENT);
		}
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__PROGRESS:
				return ((InternalEList<?>)getProgress()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				return basicSetStudy(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_COMPARISON_GROUP:
				return basicSetAssignedComparisonGroup(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_COMPARISON_GROUP:
				return basicSetActualComparisonGroup(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				return ((InternalEList<?>)getConsent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				return getStatus();
			case FhirPackage.RESEARCH_SUBJECT__PROGRESS:
				return getProgress();
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				return getPeriod();
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				return getStudy();
			case FhirPackage.RESEARCH_SUBJECT__SUBJECT:
				return getSubject();
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_COMPARISON_GROUP:
				return getAssignedComparisonGroup();
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_COMPARISON_GROUP:
				return getActualComparisonGroup();
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				return getConsent();
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
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__PROGRESS:
				getProgress().clear();
				getProgress().addAll((Collection<? extends ResearchSubjectProgress>)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				setStudy((Reference)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_COMPARISON_GROUP:
				setAssignedComparisonGroup((Id)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_COMPARISON_GROUP:
				setActualComparisonGroup((Id)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				getConsent().clear();
				getConsent().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__PROGRESS:
				getProgress().clear();
				return;
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				setStudy((Reference)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_COMPARISON_GROUP:
				setAssignedComparisonGroup((Id)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_COMPARISON_GROUP:
				setActualComparisonGroup((Id)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				getConsent().clear();
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
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				return status != null;
			case FhirPackage.RESEARCH_SUBJECT__PROGRESS:
				return progress != null && !progress.isEmpty();
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				return period != null;
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				return study != null;
			case FhirPackage.RESEARCH_SUBJECT__SUBJECT:
				return subject != null;
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_COMPARISON_GROUP:
				return assignedComparisonGroup != null;
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_COMPARISON_GROUP:
				return actualComparisonGroup != null;
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				return consent != null && !consent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResearchSubjectImpl
