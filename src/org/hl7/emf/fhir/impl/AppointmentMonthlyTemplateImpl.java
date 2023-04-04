/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.AppointmentMonthlyTemplate;
import org.hl7.emf.fhir.Coding;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment Monthly Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentMonthlyTemplateImpl#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentMonthlyTemplateImpl#getNthWeekOfMonth <em>Nth Week Of Month</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentMonthlyTemplateImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentMonthlyTemplateImpl#getMonthInterval <em>Month Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentMonthlyTemplateImpl extends BackboneElementImpl implements AppointmentMonthlyTemplate {
	/**
	 * The cached value of the '{@link #getDayOfMonth() <em>Day Of Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfMonth()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt dayOfMonth;

	/**
	 * The cached value of the '{@link #getNthWeekOfMonth() <em>Nth Week Of Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNthWeekOfMonth()
	 * @generated
	 * @ordered
	 */
	protected Coding nthWeekOfMonth;

	/**
	 * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected Coding dayOfWeek;

	/**
	 * The cached value of the '{@link #getMonthInterval() <em>Month Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthInterval()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt monthInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentMonthlyTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAppointmentMonthlyTemplate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getDayOfMonth() {
		return dayOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDayOfMonth(PositiveInt newDayOfMonth, NotificationChain msgs) {
		PositiveInt oldDayOfMonth = dayOfMonth;
		dayOfMonth = newDayOfMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_MONTH, oldDayOfMonth, newDayOfMonth);
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
	public void setDayOfMonth(PositiveInt newDayOfMonth) {
		if (newDayOfMonth != dayOfMonth) {
			NotificationChain msgs = null;
			if (dayOfMonth != null)
				msgs = ((InternalEObject)dayOfMonth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_MONTH, null, msgs);
			if (newDayOfMonth != null)
				msgs = ((InternalEObject)newDayOfMonth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_MONTH, null, msgs);
			msgs = basicSetDayOfMonth(newDayOfMonth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_MONTH, newDayOfMonth, newDayOfMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getNthWeekOfMonth() {
		return nthWeekOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNthWeekOfMonth(Coding newNthWeekOfMonth, NotificationChain msgs) {
		Coding oldNthWeekOfMonth = nthWeekOfMonth;
		nthWeekOfMonth = newNthWeekOfMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__NTH_WEEK_OF_MONTH, oldNthWeekOfMonth, newNthWeekOfMonth);
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
	public void setNthWeekOfMonth(Coding newNthWeekOfMonth) {
		if (newNthWeekOfMonth != nthWeekOfMonth) {
			NotificationChain msgs = null;
			if (nthWeekOfMonth != null)
				msgs = ((InternalEObject)nthWeekOfMonth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__NTH_WEEK_OF_MONTH, null, msgs);
			if (newNthWeekOfMonth != null)
				msgs = ((InternalEObject)newNthWeekOfMonth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__NTH_WEEK_OF_MONTH, null, msgs);
			msgs = basicSetNthWeekOfMonth(newNthWeekOfMonth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__NTH_WEEK_OF_MONTH, newNthWeekOfMonth, newNthWeekOfMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDayOfWeek(Coding newDayOfWeek, NotificationChain msgs) {
		Coding oldDayOfWeek = dayOfWeek;
		dayOfWeek = newDayOfWeek;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_WEEK, oldDayOfWeek, newDayOfWeek);
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
	public void setDayOfWeek(Coding newDayOfWeek) {
		if (newDayOfWeek != dayOfWeek) {
			NotificationChain msgs = null;
			if (dayOfWeek != null)
				msgs = ((InternalEObject)dayOfWeek).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_WEEK, null, msgs);
			if (newDayOfWeek != null)
				msgs = ((InternalEObject)newDayOfWeek).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_WEEK, null, msgs);
			msgs = basicSetDayOfWeek(newDayOfWeek, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_WEEK, newDayOfWeek, newDayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getMonthInterval() {
		return monthInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonthInterval(PositiveInt newMonthInterval, NotificationChain msgs) {
		PositiveInt oldMonthInterval = monthInterval;
		monthInterval = newMonthInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__MONTH_INTERVAL, oldMonthInterval, newMonthInterval);
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
	public void setMonthInterval(PositiveInt newMonthInterval) {
		if (newMonthInterval != monthInterval) {
			NotificationChain msgs = null;
			if (monthInterval != null)
				msgs = ((InternalEObject)monthInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__MONTH_INTERVAL, null, msgs);
			if (newMonthInterval != null)
				msgs = ((InternalEObject)newMonthInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__MONTH_INTERVAL, null, msgs);
			msgs = basicSetMonthInterval(newMonthInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__MONTH_INTERVAL, newMonthInterval, newMonthInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_MONTH:
				return basicSetDayOfMonth(null, msgs);
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__NTH_WEEK_OF_MONTH:
				return basicSetNthWeekOfMonth(null, msgs);
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_WEEK:
				return basicSetDayOfWeek(null, msgs);
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__MONTH_INTERVAL:
				return basicSetMonthInterval(null, msgs);
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
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_MONTH:
				return getDayOfMonth();
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__NTH_WEEK_OF_MONTH:
				return getNthWeekOfMonth();
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_WEEK:
				return getDayOfWeek();
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__MONTH_INTERVAL:
				return getMonthInterval();
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
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_MONTH:
				setDayOfMonth((PositiveInt)newValue);
				return;
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__NTH_WEEK_OF_MONTH:
				setNthWeekOfMonth((Coding)newValue);
				return;
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_WEEK:
				setDayOfWeek((Coding)newValue);
				return;
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__MONTH_INTERVAL:
				setMonthInterval((PositiveInt)newValue);
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
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_MONTH:
				setDayOfMonth((PositiveInt)null);
				return;
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__NTH_WEEK_OF_MONTH:
				setNthWeekOfMonth((Coding)null);
				return;
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_WEEK:
				setDayOfWeek((Coding)null);
				return;
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__MONTH_INTERVAL:
				setMonthInterval((PositiveInt)null);
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
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_MONTH:
				return dayOfMonth != null;
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__NTH_WEEK_OF_MONTH:
				return nthWeekOfMonth != null;
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__DAY_OF_WEEK:
				return dayOfWeek != null;
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE__MONTH_INTERVAL:
				return monthInterval != null;
		}
		return super.eIsSet(featureID);
	}

} //AppointmentMonthlyTemplateImpl
