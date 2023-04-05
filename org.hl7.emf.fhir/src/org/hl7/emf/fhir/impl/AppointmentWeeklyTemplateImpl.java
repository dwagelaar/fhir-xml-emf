/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.AppointmentWeeklyTemplate;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment Weekly Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentWeeklyTemplateImpl#getMonday <em>Monday</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentWeeklyTemplateImpl#getTuesday <em>Tuesday</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentWeeklyTemplateImpl#getWednesday <em>Wednesday</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentWeeklyTemplateImpl#getThursday <em>Thursday</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentWeeklyTemplateImpl#getFriday <em>Friday</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentWeeklyTemplateImpl#getSaturday <em>Saturday</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentWeeklyTemplateImpl#getSunday <em>Sunday</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AppointmentWeeklyTemplateImpl#getWeekInterval <em>Week Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentWeeklyTemplateImpl extends BackboneElementImpl implements AppointmentWeeklyTemplate {
	/**
	 * The cached value of the '{@link #getMonday() <em>Monday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonday()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean monday;

	/**
	 * The cached value of the '{@link #getTuesday() <em>Tuesday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuesday()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean tuesday;

	/**
	 * The cached value of the '{@link #getWednesday() <em>Wednesday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWednesday()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean wednesday;

	/**
	 * The cached value of the '{@link #getThursday() <em>Thursday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThursday()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean thursday;

	/**
	 * The cached value of the '{@link #getFriday() <em>Friday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriday()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean friday;

	/**
	 * The cached value of the '{@link #getSaturday() <em>Saturday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturday()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean saturday;

	/**
	 * The cached value of the '{@link #getSunday() <em>Sunday</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunday()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean sunday;

	/**
	 * The cached value of the '{@link #getWeekInterval() <em>Week Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekInterval()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt weekInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentWeeklyTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAppointmentWeeklyTemplate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getMonday() {
		return monday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonday(org.hl7.emf.fhir.Boolean newMonday, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldMonday = monday;
		monday = newMonday;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__MONDAY, oldMonday, newMonday);
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
	public void setMonday(org.hl7.emf.fhir.Boolean newMonday) {
		if (newMonday != monday) {
			NotificationChain msgs = null;
			if (monday != null)
				msgs = ((InternalEObject)monday).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__MONDAY, null, msgs);
			if (newMonday != null)
				msgs = ((InternalEObject)newMonday).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__MONDAY, null, msgs);
			msgs = basicSetMonday(newMonday, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__MONDAY, newMonday, newMonday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getTuesday() {
		return tuesday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTuesday(org.hl7.emf.fhir.Boolean newTuesday, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldTuesday = tuesday;
		tuesday = newTuesday;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__TUESDAY, oldTuesday, newTuesday);
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
	public void setTuesday(org.hl7.emf.fhir.Boolean newTuesday) {
		if (newTuesday != tuesday) {
			NotificationChain msgs = null;
			if (tuesday != null)
				msgs = ((InternalEObject)tuesday).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__TUESDAY, null, msgs);
			if (newTuesday != null)
				msgs = ((InternalEObject)newTuesday).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__TUESDAY, null, msgs);
			msgs = basicSetTuesday(newTuesday, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__TUESDAY, newTuesday, newTuesday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getWednesday() {
		return wednesday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWednesday(org.hl7.emf.fhir.Boolean newWednesday, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldWednesday = wednesday;
		wednesday = newWednesday;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEDNESDAY, oldWednesday, newWednesday);
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
	public void setWednesday(org.hl7.emf.fhir.Boolean newWednesday) {
		if (newWednesday != wednesday) {
			NotificationChain msgs = null;
			if (wednesday != null)
				msgs = ((InternalEObject)wednesday).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEDNESDAY, null, msgs);
			if (newWednesday != null)
				msgs = ((InternalEObject)newWednesday).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEDNESDAY, null, msgs);
			msgs = basicSetWednesday(newWednesday, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEDNESDAY, newWednesday, newWednesday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getThursday() {
		return thursday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThursday(org.hl7.emf.fhir.Boolean newThursday, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldThursday = thursday;
		thursday = newThursday;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__THURSDAY, oldThursday, newThursday);
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
	public void setThursday(org.hl7.emf.fhir.Boolean newThursday) {
		if (newThursday != thursday) {
			NotificationChain msgs = null;
			if (thursday != null)
				msgs = ((InternalEObject)thursday).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__THURSDAY, null, msgs);
			if (newThursday != null)
				msgs = ((InternalEObject)newThursday).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__THURSDAY, null, msgs);
			msgs = basicSetThursday(newThursday, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__THURSDAY, newThursday, newThursday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getFriday() {
		return friday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFriday(org.hl7.emf.fhir.Boolean newFriday, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldFriday = friday;
		friday = newFriday;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__FRIDAY, oldFriday, newFriday);
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
	public void setFriday(org.hl7.emf.fhir.Boolean newFriday) {
		if (newFriday != friday) {
			NotificationChain msgs = null;
			if (friday != null)
				msgs = ((InternalEObject)friday).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__FRIDAY, null, msgs);
			if (newFriday != null)
				msgs = ((InternalEObject)newFriday).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__FRIDAY, null, msgs);
			msgs = basicSetFriday(newFriday, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__FRIDAY, newFriday, newFriday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getSaturday() {
		return saturday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSaturday(org.hl7.emf.fhir.Boolean newSaturday, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldSaturday = saturday;
		saturday = newSaturday;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SATURDAY, oldSaturday, newSaturday);
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
	public void setSaturday(org.hl7.emf.fhir.Boolean newSaturday) {
		if (newSaturday != saturday) {
			NotificationChain msgs = null;
			if (saturday != null)
				msgs = ((InternalEObject)saturday).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SATURDAY, null, msgs);
			if (newSaturday != null)
				msgs = ((InternalEObject)newSaturday).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SATURDAY, null, msgs);
			msgs = basicSetSaturday(newSaturday, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SATURDAY, newSaturday, newSaturday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getSunday() {
		return sunday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSunday(org.hl7.emf.fhir.Boolean newSunday, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldSunday = sunday;
		sunday = newSunday;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SUNDAY, oldSunday, newSunday);
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
	public void setSunday(org.hl7.emf.fhir.Boolean newSunday) {
		if (newSunday != sunday) {
			NotificationChain msgs = null;
			if (sunday != null)
				msgs = ((InternalEObject)sunday).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SUNDAY, null, msgs);
			if (newSunday != null)
				msgs = ((InternalEObject)newSunday).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SUNDAY, null, msgs);
			msgs = basicSetSunday(newSunday, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SUNDAY, newSunday, newSunday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getWeekInterval() {
		return weekInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeekInterval(PositiveInt newWeekInterval, NotificationChain msgs) {
		PositiveInt oldWeekInterval = weekInterval;
		weekInterval = newWeekInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEEK_INTERVAL, oldWeekInterval, newWeekInterval);
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
	public void setWeekInterval(PositiveInt newWeekInterval) {
		if (newWeekInterval != weekInterval) {
			NotificationChain msgs = null;
			if (weekInterval != null)
				msgs = ((InternalEObject)weekInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEEK_INTERVAL, null, msgs);
			if (newWeekInterval != null)
				msgs = ((InternalEObject)newWeekInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEEK_INTERVAL, null, msgs);
			msgs = basicSetWeekInterval(newWeekInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEEK_INTERVAL, newWeekInterval, newWeekInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__MONDAY:
				return basicSetMonday(null, msgs);
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__TUESDAY:
				return basicSetTuesday(null, msgs);
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEDNESDAY:
				return basicSetWednesday(null, msgs);
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__THURSDAY:
				return basicSetThursday(null, msgs);
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__FRIDAY:
				return basicSetFriday(null, msgs);
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SATURDAY:
				return basicSetSaturday(null, msgs);
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SUNDAY:
				return basicSetSunday(null, msgs);
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEEK_INTERVAL:
				return basicSetWeekInterval(null, msgs);
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
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__MONDAY:
				return getMonday();
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__TUESDAY:
				return getTuesday();
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEDNESDAY:
				return getWednesday();
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__THURSDAY:
				return getThursday();
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__FRIDAY:
				return getFriday();
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SATURDAY:
				return getSaturday();
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SUNDAY:
				return getSunday();
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEEK_INTERVAL:
				return getWeekInterval();
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
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__MONDAY:
				setMonday((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__TUESDAY:
				setTuesday((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEDNESDAY:
				setWednesday((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__THURSDAY:
				setThursday((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__FRIDAY:
				setFriday((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SATURDAY:
				setSaturday((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SUNDAY:
				setSunday((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEEK_INTERVAL:
				setWeekInterval((PositiveInt)newValue);
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
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__MONDAY:
				setMonday((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__TUESDAY:
				setTuesday((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEDNESDAY:
				setWednesday((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__THURSDAY:
				setThursday((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__FRIDAY:
				setFriday((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SATURDAY:
				setSaturday((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SUNDAY:
				setSunday((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEEK_INTERVAL:
				setWeekInterval((PositiveInt)null);
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
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__MONDAY:
				return monday != null;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__TUESDAY:
				return tuesday != null;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEDNESDAY:
				return wednesday != null;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__THURSDAY:
				return thursday != null;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__FRIDAY:
				return friday != null;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SATURDAY:
				return saturday != null;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__SUNDAY:
				return sunday != null;
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE__WEEK_INTERVAL:
				return weekInterval != null;
		}
		return super.eIsSet(featureID);
	}

} //AppointmentWeeklyTemplateImpl
