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

import org.hl7.emf.fhir.Age;
import org.hl7.emf.fhir.Annotation;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FamilyMemberHistoryProcedure;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Member History Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.FamilyMemberHistoryProcedureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.FamilyMemberHistoryProcedureImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.FamilyMemberHistoryProcedureImpl#getContributedToDeath <em>Contributed To Death</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.FamilyMemberHistoryProcedureImpl#getPerformedAge <em>Performed Age</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.FamilyMemberHistoryProcedureImpl#getPerformedRange <em>Performed Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.FamilyMemberHistoryProcedureImpl#getPerformedPeriod <em>Performed Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.FamilyMemberHistoryProcedureImpl#getPerformedString <em>Performed String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.FamilyMemberHistoryProcedureImpl#getPerformedDateTime <em>Performed Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.FamilyMemberHistoryProcedureImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyMemberHistoryProcedureImpl extends BackboneElementImpl implements FamilyMemberHistoryProcedure {
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
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getContributedToDeath() <em>Contributed To Death</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributedToDeath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean contributedToDeath;

	/**
	 * The cached value of the '{@link #getPerformedAge() <em>Performed Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedAge()
	 * @generated
	 * @ordered
	 */
	protected Age performedAge;

	/**
	 * The cached value of the '{@link #getPerformedRange() <em>Performed Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedRange()
	 * @generated
	 * @ordered
	 */
	protected Range performedRange;

	/**
	 * The cached value of the '{@link #getPerformedPeriod() <em>Performed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period performedPeriod;

	/**
	 * The cached value of the '{@link #getPerformedString() <em>Performed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String performedString;

	/**
	 * The cached value of the '{@link #getPerformedDateTime() <em>Performed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime performedDateTime;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyMemberHistoryProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getFamilyMemberHistoryProcedure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(CodeableConcept newOutcome, NotificationChain msgs) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__OUTCOME, oldOutcome, newOutcome);
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
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getContributedToDeath() {
		return contributedToDeath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributedToDeath(org.hl7.emf.fhir.Boolean newContributedToDeath, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldContributedToDeath = contributedToDeath;
		contributedToDeath = newContributedToDeath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CONTRIBUTED_TO_DEATH, oldContributedToDeath, newContributedToDeath);
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
	public void setContributedToDeath(org.hl7.emf.fhir.Boolean newContributedToDeath) {
		if (newContributedToDeath != contributedToDeath) {
			NotificationChain msgs = null;
			if (contributedToDeath != null)
				msgs = ((InternalEObject)contributedToDeath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CONTRIBUTED_TO_DEATH, null, msgs);
			if (newContributedToDeath != null)
				msgs = ((InternalEObject)newContributedToDeath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CONTRIBUTED_TO_DEATH, null, msgs);
			msgs = basicSetContributedToDeath(newContributedToDeath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CONTRIBUTED_TO_DEATH, newContributedToDeath, newContributedToDeath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getPerformedAge() {
		return performedAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedAge(Age newPerformedAge, NotificationChain msgs) {
		Age oldPerformedAge = performedAge;
		performedAge = newPerformedAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_AGE, oldPerformedAge, newPerformedAge);
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
	public void setPerformedAge(Age newPerformedAge) {
		if (newPerformedAge != performedAge) {
			NotificationChain msgs = null;
			if (performedAge != null)
				msgs = ((InternalEObject)performedAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_AGE, null, msgs);
			if (newPerformedAge != null)
				msgs = ((InternalEObject)newPerformedAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_AGE, null, msgs);
			msgs = basicSetPerformedAge(newPerformedAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_AGE, newPerformedAge, newPerformedAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getPerformedRange() {
		return performedRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedRange(Range newPerformedRange, NotificationChain msgs) {
		Range oldPerformedRange = performedRange;
		performedRange = newPerformedRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_RANGE, oldPerformedRange, newPerformedRange);
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
	public void setPerformedRange(Range newPerformedRange) {
		if (newPerformedRange != performedRange) {
			NotificationChain msgs = null;
			if (performedRange != null)
				msgs = ((InternalEObject)performedRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_RANGE, null, msgs);
			if (newPerformedRange != null)
				msgs = ((InternalEObject)newPerformedRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_RANGE, null, msgs);
			msgs = basicSetPerformedRange(newPerformedRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_RANGE, newPerformedRange, newPerformedRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPerformedPeriod() {
		return performedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedPeriod(Period newPerformedPeriod, NotificationChain msgs) {
		Period oldPerformedPeriod = performedPeriod;
		performedPeriod = newPerformedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_PERIOD, oldPerformedPeriod, newPerformedPeriod);
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
	public void setPerformedPeriod(Period newPerformedPeriod) {
		if (newPerformedPeriod != performedPeriod) {
			NotificationChain msgs = null;
			if (performedPeriod != null)
				msgs = ((InternalEObject)performedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_PERIOD, null, msgs);
			if (newPerformedPeriod != null)
				msgs = ((InternalEObject)newPerformedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_PERIOD, null, msgs);
			msgs = basicSetPerformedPeriod(newPerformedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_PERIOD, newPerformedPeriod, newPerformedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getPerformedString() {
		return performedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedString(org.hl7.emf.fhir.String newPerformedString, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldPerformedString = performedString;
		performedString = newPerformedString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_STRING, oldPerformedString, newPerformedString);
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
	public void setPerformedString(org.hl7.emf.fhir.String newPerformedString) {
		if (newPerformedString != performedString) {
			NotificationChain msgs = null;
			if (performedString != null)
				msgs = ((InternalEObject)performedString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_STRING, null, msgs);
			if (newPerformedString != null)
				msgs = ((InternalEObject)newPerformedString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_STRING, null, msgs);
			msgs = basicSetPerformedString(newPerformedString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_STRING, newPerformedString, newPerformedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getPerformedDateTime() {
		return performedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedDateTime(DateTime newPerformedDateTime, NotificationChain msgs) {
		DateTime oldPerformedDateTime = performedDateTime;
		performedDateTime = newPerformedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_DATE_TIME, oldPerformedDateTime, newPerformedDateTime);
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
	public void setPerformedDateTime(DateTime newPerformedDateTime) {
		if (newPerformedDateTime != performedDateTime) {
			NotificationChain msgs = null;
			if (performedDateTime != null)
				msgs = ((InternalEObject)performedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_DATE_TIME, null, msgs);
			if (newPerformedDateTime != null)
				msgs = ((InternalEObject)newPerformedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_DATE_TIME, null, msgs);
			msgs = basicSetPerformedDateTime(newPerformedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_DATE_TIME, newPerformedDateTime, newPerformedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CONTRIBUTED_TO_DEATH:
				return basicSetContributedToDeath(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_AGE:
				return basicSetPerformedAge(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_RANGE:
				return basicSetPerformedRange(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_PERIOD:
				return basicSetPerformedPeriod(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_STRING:
				return basicSetPerformedString(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_DATE_TIME:
				return basicSetPerformedDateTime(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CODE:
				return getCode();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__OUTCOME:
				return getOutcome();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CONTRIBUTED_TO_DEATH:
				return getContributedToDeath();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_AGE:
				return getPerformedAge();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_RANGE:
				return getPerformedRange();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_PERIOD:
				return getPerformedPeriod();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_STRING:
				return getPerformedString();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_DATE_TIME:
				return getPerformedDateTime();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__NOTE:
				return getNote();
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
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CONTRIBUTED_TO_DEATH:
				setContributedToDeath((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_AGE:
				setPerformedAge((Age)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_RANGE:
				setPerformedRange((Range)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_PERIOD:
				setPerformedPeriod((Period)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_STRING:
				setPerformedString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_DATE_TIME:
				setPerformedDateTime((DateTime)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CONTRIBUTED_TO_DEATH:
				setContributedToDeath((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_AGE:
				setPerformedAge((Age)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_RANGE:
				setPerformedRange((Range)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_PERIOD:
				setPerformedPeriod((Period)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_STRING:
				setPerformedString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_DATE_TIME:
				setPerformedDateTime((DateTime)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__NOTE:
				getNote().clear();
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
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CODE:
				return code != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__OUTCOME:
				return outcome != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__CONTRIBUTED_TO_DEATH:
				return contributedToDeath != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_AGE:
				return performedAge != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_RANGE:
				return performedRange != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_PERIOD:
				return performedPeriod != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_STRING:
				return performedString != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__PERFORMED_DATE_TIME:
				return performedDateTime != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyMemberHistoryProcedureImpl
