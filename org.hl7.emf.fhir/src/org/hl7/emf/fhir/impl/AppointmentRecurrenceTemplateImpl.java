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

import org.hl7.emf.fhir.AppointmentMonthlyTemplate;
import org.hl7.emf.fhir.AppointmentRecurrenceTemplate;
import org.hl7.emf.fhir.AppointmentWeeklyTemplate;
import org.hl7.emf.fhir.AppointmentYearlyTemplate;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.Date;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment Recurrence Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getRecurrenceType <em>Recurrence Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getLastOccurrenceDate <em>Last Occurrence Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getOccurrenceCount <em>Occurrence Count</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getOccurrenceDate <em>Occurrence Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getWeeklyTemplate <em>Weekly Template</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getMonthlyTemplate <em>Monthly Template</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getYearlyTemplate <em>Yearly Template</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getExcludingDate <em>Excluding Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentRecurrenceTemplateImpl#getExcludingRecurrenceId <em>Excluding Recurrence Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentRecurrenceTemplateImpl extends BackboneElementImpl implements AppointmentRecurrenceTemplate {
	/**
	 * The cached value of the '{@link #getTimezone() <em>Timezone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept timezone;

	/**
	 * The cached value of the '{@link #getRecurrenceType() <em>Recurrence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept recurrenceType;

	/**
	 * The cached value of the '{@link #getLastOccurrenceDate() <em>Last Occurrence Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOccurrenceDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastOccurrenceDate;

	/**
	 * The cached value of the '{@link #getOccurrenceCount() <em>Occurrence Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceCount()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt occurrenceCount;

	/**
	 * The cached value of the '{@link #getOccurrenceDate() <em>Occurrence Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> occurrenceDate;

	/**
	 * The cached value of the '{@link #getWeeklyTemplate() <em>Weekly Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeklyTemplate()
	 * @generated
	 * @ordered
	 */
	protected AppointmentWeeklyTemplate weeklyTemplate;

	/**
	 * The cached value of the '{@link #getMonthlyTemplate() <em>Monthly Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthlyTemplate()
	 * @generated
	 * @ordered
	 */
	protected AppointmentMonthlyTemplate monthlyTemplate;

	/**
	 * The cached value of the '{@link #getYearlyTemplate() <em>Yearly Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearlyTemplate()
	 * @generated
	 * @ordered
	 */
	protected AppointmentYearlyTemplate yearlyTemplate;

	/**
	 * The cached value of the '{@link #getExcludingDate() <em>Excluding Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludingDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> excludingDate;

	/**
	 * The cached value of the '{@link #getExcludingRecurrenceId() <em>Excluding Recurrence Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludingRecurrenceId()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> excludingRecurrenceId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentRecurrenceTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAppointmentRecurrenceTemplate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTimezone() {
		return timezone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimezone(CodeableConcept newTimezone, NotificationChain msgs) {
		CodeableConcept oldTimezone = timezone;
		timezone = newTimezone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__TIMEZONE, oldTimezone, newTimezone);
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
	public void setTimezone(CodeableConcept newTimezone) {
		if (newTimezone != timezone) {
			NotificationChain msgs = null;
			if (timezone != null)
				msgs = ((InternalEObject)timezone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__TIMEZONE, null, msgs);
			if (newTimezone != null)
				msgs = ((InternalEObject)newTimezone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__TIMEZONE, null, msgs);
			msgs = basicSetTimezone(newTimezone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__TIMEZONE, newTimezone, newTimezone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRecurrenceType() {
		return recurrenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecurrenceType(CodeableConcept newRecurrenceType, NotificationChain msgs) {
		CodeableConcept oldRecurrenceType = recurrenceType;
		recurrenceType = newRecurrenceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__RECURRENCE_TYPE, oldRecurrenceType, newRecurrenceType);
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
	public void setRecurrenceType(CodeableConcept newRecurrenceType) {
		if (newRecurrenceType != recurrenceType) {
			NotificationChain msgs = null;
			if (recurrenceType != null)
				msgs = ((InternalEObject)recurrenceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__RECURRENCE_TYPE, null, msgs);
			if (newRecurrenceType != null)
				msgs = ((InternalEObject)newRecurrenceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__RECURRENCE_TYPE, null, msgs);
			msgs = basicSetRecurrenceType(newRecurrenceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__RECURRENCE_TYPE, newRecurrenceType, newRecurrenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastOccurrenceDate() {
		return lastOccurrenceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastOccurrenceDate(Date newLastOccurrenceDate, NotificationChain msgs) {
		Date oldLastOccurrenceDate = lastOccurrenceDate;
		lastOccurrenceDate = newLastOccurrenceDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__LAST_OCCURRENCE_DATE, oldLastOccurrenceDate, newLastOccurrenceDate);
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
	public void setLastOccurrenceDate(Date newLastOccurrenceDate) {
		if (newLastOccurrenceDate != lastOccurrenceDate) {
			NotificationChain msgs = null;
			if (lastOccurrenceDate != null)
				msgs = ((InternalEObject)lastOccurrenceDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__LAST_OCCURRENCE_DATE, null, msgs);
			if (newLastOccurrenceDate != null)
				msgs = ((InternalEObject)newLastOccurrenceDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__LAST_OCCURRENCE_DATE, null, msgs);
			msgs = basicSetLastOccurrenceDate(newLastOccurrenceDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__LAST_OCCURRENCE_DATE, newLastOccurrenceDate, newLastOccurrenceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getOccurrenceCount() {
		return occurrenceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceCount(PositiveInt newOccurrenceCount, NotificationChain msgs) {
		PositiveInt oldOccurrenceCount = occurrenceCount;
		occurrenceCount = newOccurrenceCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_COUNT, oldOccurrenceCount, newOccurrenceCount);
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
	public void setOccurrenceCount(PositiveInt newOccurrenceCount) {
		if (newOccurrenceCount != occurrenceCount) {
			NotificationChain msgs = null;
			if (occurrenceCount != null)
				msgs = ((InternalEObject)occurrenceCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_COUNT, null, msgs);
			if (newOccurrenceCount != null)
				msgs = ((InternalEObject)newOccurrenceCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_COUNT, null, msgs);
			msgs = basicSetOccurrenceCount(newOccurrenceCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_COUNT, newOccurrenceCount, newOccurrenceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Date> getOccurrenceDate() {
		if (occurrenceDate == null) {
			occurrenceDate = new EObjectContainmentEList<Date>(Date.class, this, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_DATE);
		}
		return occurrenceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentWeeklyTemplate getWeeklyTemplate() {
		return weeklyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeeklyTemplate(AppointmentWeeklyTemplate newWeeklyTemplate, NotificationChain msgs) {
		AppointmentWeeklyTemplate oldWeeklyTemplate = weeklyTemplate;
		weeklyTemplate = newWeeklyTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__WEEKLY_TEMPLATE, oldWeeklyTemplate, newWeeklyTemplate);
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
	public void setWeeklyTemplate(AppointmentWeeklyTemplate newWeeklyTemplate) {
		if (newWeeklyTemplate != weeklyTemplate) {
			NotificationChain msgs = null;
			if (weeklyTemplate != null)
				msgs = ((InternalEObject)weeklyTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__WEEKLY_TEMPLATE, null, msgs);
			if (newWeeklyTemplate != null)
				msgs = ((InternalEObject)newWeeklyTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__WEEKLY_TEMPLATE, null, msgs);
			msgs = basicSetWeeklyTemplate(newWeeklyTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__WEEKLY_TEMPLATE, newWeeklyTemplate, newWeeklyTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentMonthlyTemplate getMonthlyTemplate() {
		return monthlyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonthlyTemplate(AppointmentMonthlyTemplate newMonthlyTemplate, NotificationChain msgs) {
		AppointmentMonthlyTemplate oldMonthlyTemplate = monthlyTemplate;
		monthlyTemplate = newMonthlyTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__MONTHLY_TEMPLATE, oldMonthlyTemplate, newMonthlyTemplate);
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
	public void setMonthlyTemplate(AppointmentMonthlyTemplate newMonthlyTemplate) {
		if (newMonthlyTemplate != monthlyTemplate) {
			NotificationChain msgs = null;
			if (monthlyTemplate != null)
				msgs = ((InternalEObject)monthlyTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__MONTHLY_TEMPLATE, null, msgs);
			if (newMonthlyTemplate != null)
				msgs = ((InternalEObject)newMonthlyTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__MONTHLY_TEMPLATE, null, msgs);
			msgs = basicSetMonthlyTemplate(newMonthlyTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__MONTHLY_TEMPLATE, newMonthlyTemplate, newMonthlyTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentYearlyTemplate getYearlyTemplate() {
		return yearlyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearlyTemplate(AppointmentYearlyTemplate newYearlyTemplate, NotificationChain msgs) {
		AppointmentYearlyTemplate oldYearlyTemplate = yearlyTemplate;
		yearlyTemplate = newYearlyTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__YEARLY_TEMPLATE, oldYearlyTemplate, newYearlyTemplate);
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
	public void setYearlyTemplate(AppointmentYearlyTemplate newYearlyTemplate) {
		if (newYearlyTemplate != yearlyTemplate) {
			NotificationChain msgs = null;
			if (yearlyTemplate != null)
				msgs = ((InternalEObject)yearlyTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__YEARLY_TEMPLATE, null, msgs);
			if (newYearlyTemplate != null)
				msgs = ((InternalEObject)newYearlyTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__YEARLY_TEMPLATE, null, msgs);
			msgs = basicSetYearlyTemplate(newYearlyTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__YEARLY_TEMPLATE, newYearlyTemplate, newYearlyTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Date> getExcludingDate() {
		if (excludingDate == null) {
			excludingDate = new EObjectContainmentEList<Date>(Date.class, this, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_DATE);
		}
		return excludingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getExcludingRecurrenceId() {
		if (excludingRecurrenceId == null) {
			excludingRecurrenceId = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_RECURRENCE_ID);
		}
		return excludingRecurrenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__TIMEZONE:
				return basicSetTimezone(null, msgs);
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__RECURRENCE_TYPE:
				return basicSetRecurrenceType(null, msgs);
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__LAST_OCCURRENCE_DATE:
				return basicSetLastOccurrenceDate(null, msgs);
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_COUNT:
				return basicSetOccurrenceCount(null, msgs);
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_DATE:
				return ((InternalEList<?>)getOccurrenceDate()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__WEEKLY_TEMPLATE:
				return basicSetWeeklyTemplate(null, msgs);
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__MONTHLY_TEMPLATE:
				return basicSetMonthlyTemplate(null, msgs);
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__YEARLY_TEMPLATE:
				return basicSetYearlyTemplate(null, msgs);
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_DATE:
				return ((InternalEList<?>)getExcludingDate()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_RECURRENCE_ID:
				return ((InternalEList<?>)getExcludingRecurrenceId()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__TIMEZONE:
				return getTimezone();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__RECURRENCE_TYPE:
				return getRecurrenceType();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__LAST_OCCURRENCE_DATE:
				return getLastOccurrenceDate();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_COUNT:
				return getOccurrenceCount();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_DATE:
				return getOccurrenceDate();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__WEEKLY_TEMPLATE:
				return getWeeklyTemplate();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__MONTHLY_TEMPLATE:
				return getMonthlyTemplate();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__YEARLY_TEMPLATE:
				return getYearlyTemplate();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_DATE:
				return getExcludingDate();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_RECURRENCE_ID:
				return getExcludingRecurrenceId();
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
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__TIMEZONE:
				setTimezone((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__RECURRENCE_TYPE:
				setRecurrenceType((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__LAST_OCCURRENCE_DATE:
				setLastOccurrenceDate((Date)newValue);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_COUNT:
				setOccurrenceCount((PositiveInt)newValue);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_DATE:
				getOccurrenceDate().clear();
				getOccurrenceDate().addAll((Collection<? extends Date>)newValue);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__WEEKLY_TEMPLATE:
				setWeeklyTemplate((AppointmentWeeklyTemplate)newValue);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__MONTHLY_TEMPLATE:
				setMonthlyTemplate((AppointmentMonthlyTemplate)newValue);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__YEARLY_TEMPLATE:
				setYearlyTemplate((AppointmentYearlyTemplate)newValue);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_DATE:
				getExcludingDate().clear();
				getExcludingDate().addAll((Collection<? extends Date>)newValue);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_RECURRENCE_ID:
				getExcludingRecurrenceId().clear();
				getExcludingRecurrenceId().addAll((Collection<? extends PositiveInt>)newValue);
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
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__TIMEZONE:
				setTimezone((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__RECURRENCE_TYPE:
				setRecurrenceType((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__LAST_OCCURRENCE_DATE:
				setLastOccurrenceDate((Date)null);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_COUNT:
				setOccurrenceCount((PositiveInt)null);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_DATE:
				getOccurrenceDate().clear();
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__WEEKLY_TEMPLATE:
				setWeeklyTemplate((AppointmentWeeklyTemplate)null);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__MONTHLY_TEMPLATE:
				setMonthlyTemplate((AppointmentMonthlyTemplate)null);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__YEARLY_TEMPLATE:
				setYearlyTemplate((AppointmentYearlyTemplate)null);
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_DATE:
				getExcludingDate().clear();
				return;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_RECURRENCE_ID:
				getExcludingRecurrenceId().clear();
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
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__TIMEZONE:
				return timezone != null;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__RECURRENCE_TYPE:
				return recurrenceType != null;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__LAST_OCCURRENCE_DATE:
				return lastOccurrenceDate != null;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_COUNT:
				return occurrenceCount != null;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__OCCURRENCE_DATE:
				return occurrenceDate != null && !occurrenceDate.isEmpty();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__WEEKLY_TEMPLATE:
				return weeklyTemplate != null;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__MONTHLY_TEMPLATE:
				return monthlyTemplate != null;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__YEARLY_TEMPLATE:
				return yearlyTemplate != null;
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_DATE:
				return excludingDate != null && !excludingDate.isEmpty();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE__EXCLUDING_RECURRENCE_ID:
				return excludingRecurrenceId != null && !excludingRecurrenceId.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppointmentRecurrenceTemplateImpl
