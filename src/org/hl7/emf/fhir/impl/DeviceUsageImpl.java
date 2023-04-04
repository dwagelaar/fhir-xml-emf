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

import org.hl7.emf.fhir.Annotation;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.DeviceUsage;
import org.hl7.emf.fhir.DeviceUsageAdherence;
import org.hl7.emf.fhir.DeviceUsageStatus;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getUsageStatus <em>Usage Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getUsageReason <em>Usage Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getAdherence <em>Adherence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceUsageImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceUsageImpl extends DomainResourceImpl implements DeviceUsage {
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
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DeviceUsageStatus status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> derivedFrom;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getTimingTiming() <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timingTiming;

	/**
	 * The cached value of the '{@link #getTimingPeriod() <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period timingPeriod;

	/**
	 * The cached value of the '{@link #getTimingDateTime() <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime timingDateTime;

	/**
	 * The cached value of the '{@link #getDateAsserted() <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAsserted()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateAsserted;

	/**
	 * The cached value of the '{@link #getUsageStatus() <em>Usage Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept usageStatus;

	/**
	 * The cached value of the '{@link #getUsageReason() <em>Usage Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> usageReason;

	/**
	 * The cached value of the '{@link #getAdherence() <em>Adherence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdherence()
	 * @generated
	 * @ordered
	 */
	protected DeviceUsageAdherence adherence;

	/**
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected Reference informationSource;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference device;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> reason;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference bodySite;

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
	protected DeviceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DEVICE_USAGE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DEVICE_USAGE__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceUsageStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DeviceUsageStatus newStatus, NotificationChain msgs) {
		DeviceUsageStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__STATUS, oldStatus, newStatus);
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
	public void setStatus(DeviceUsageStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_USAGE__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DEVICE_USAGE__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__CONTEXT, oldContext, newContext);
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
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getTimingTiming() {
		return timingTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingTiming(Timing newTimingTiming, NotificationChain msgs) {
		Timing oldTimingTiming = timingTiming;
		timingTiming = newTimingTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__TIMING_TIMING, oldTimingTiming, newTimingTiming);
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
	public void setTimingTiming(Timing newTimingTiming) {
		if (newTimingTiming != timingTiming) {
			NotificationChain msgs = null;
			if (timingTiming != null)
				msgs = ((InternalEObject)timingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__TIMING_TIMING, null, msgs);
			if (newTimingTiming != null)
				msgs = ((InternalEObject)newTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__TIMING_TIMING, null, msgs);
			msgs = basicSetTimingTiming(newTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__TIMING_TIMING, newTimingTiming, newTimingTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getTimingPeriod() {
		return timingPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingPeriod(Period newTimingPeriod, NotificationChain msgs) {
		Period oldTimingPeriod = timingPeriod;
		timingPeriod = newTimingPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__TIMING_PERIOD, oldTimingPeriod, newTimingPeriod);
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
	public void setTimingPeriod(Period newTimingPeriod) {
		if (newTimingPeriod != timingPeriod) {
			NotificationChain msgs = null;
			if (timingPeriod != null)
				msgs = ((InternalEObject)timingPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__TIMING_PERIOD, null, msgs);
			if (newTimingPeriod != null)
				msgs = ((InternalEObject)newTimingPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__TIMING_PERIOD, null, msgs);
			msgs = basicSetTimingPeriod(newTimingPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__TIMING_PERIOD, newTimingPeriod, newTimingPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getTimingDateTime() {
		return timingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingDateTime(DateTime newTimingDateTime, NotificationChain msgs) {
		DateTime oldTimingDateTime = timingDateTime;
		timingDateTime = newTimingDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__TIMING_DATE_TIME, oldTimingDateTime, newTimingDateTime);
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
	public void setTimingDateTime(DateTime newTimingDateTime) {
		if (newTimingDateTime != timingDateTime) {
			NotificationChain msgs = null;
			if (timingDateTime != null)
				msgs = ((InternalEObject)timingDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__TIMING_DATE_TIME, null, msgs);
			if (newTimingDateTime != null)
				msgs = ((InternalEObject)newTimingDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__TIMING_DATE_TIME, null, msgs);
			msgs = basicSetTimingDateTime(newTimingDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__TIMING_DATE_TIME, newTimingDateTime, newTimingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDateAsserted() {
		return dateAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateAsserted(DateTime newDateAsserted, NotificationChain msgs) {
		DateTime oldDateAsserted = dateAsserted;
		dateAsserted = newDateAsserted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__DATE_ASSERTED, oldDateAsserted, newDateAsserted);
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
	public void setDateAsserted(DateTime newDateAsserted) {
		if (newDateAsserted != dateAsserted) {
			NotificationChain msgs = null;
			if (dateAsserted != null)
				msgs = ((InternalEObject)dateAsserted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__DATE_ASSERTED, null, msgs);
			if (newDateAsserted != null)
				msgs = ((InternalEObject)newDateAsserted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__DATE_ASSERTED, null, msgs);
			msgs = basicSetDateAsserted(newDateAsserted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__DATE_ASSERTED, newDateAsserted, newDateAsserted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUsageStatus() {
		return usageStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageStatus(CodeableConcept newUsageStatus, NotificationChain msgs) {
		CodeableConcept oldUsageStatus = usageStatus;
		usageStatus = newUsageStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__USAGE_STATUS, oldUsageStatus, newUsageStatus);
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
	public void setUsageStatus(CodeableConcept newUsageStatus) {
		if (newUsageStatus != usageStatus) {
			NotificationChain msgs = null;
			if (usageStatus != null)
				msgs = ((InternalEObject)usageStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__USAGE_STATUS, null, msgs);
			if (newUsageStatus != null)
				msgs = ((InternalEObject)newUsageStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__USAGE_STATUS, null, msgs);
			msgs = basicSetUsageStatus(newUsageStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__USAGE_STATUS, newUsageStatus, newUsageStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getUsageReason() {
		if (usageReason == null) {
			usageReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_USAGE__USAGE_REASON);
		}
		return usageReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceUsageAdherence getAdherence() {
		return adherence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdherence(DeviceUsageAdherence newAdherence, NotificationChain msgs) {
		DeviceUsageAdherence oldAdherence = adherence;
		adherence = newAdherence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__ADHERENCE, oldAdherence, newAdherence);
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
	public void setAdherence(DeviceUsageAdherence newAdherence) {
		if (newAdherence != adherence) {
			NotificationChain msgs = null;
			if (adherence != null)
				msgs = ((InternalEObject)adherence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__ADHERENCE, null, msgs);
			if (newAdherence != null)
				msgs = ((InternalEObject)newAdherence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__ADHERENCE, null, msgs);
			msgs = basicSetAdherence(newAdherence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__ADHERENCE, newAdherence, newAdherence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInformationSource() {
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationSource(Reference newInformationSource, NotificationChain msgs) {
		Reference oldInformationSource = informationSource;
		informationSource = newInformationSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__INFORMATION_SOURCE, oldInformationSource, newInformationSource);
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
	public void setInformationSource(Reference newInformationSource) {
		if (newInformationSource != informationSource) {
			NotificationChain msgs = null;
			if (informationSource != null)
				msgs = ((InternalEObject)informationSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__INFORMATION_SOURCE, null, msgs);
			if (newInformationSource != null)
				msgs = ((InternalEObject)newInformationSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__INFORMATION_SOURCE, null, msgs);
			msgs = basicSetInformationSource(newInformationSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__INFORMATION_SOURCE, newInformationSource, newInformationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(CodeableReference newDevice, NotificationChain msgs) {
		CodeableReference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__DEVICE, oldDevice, newDevice);
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
	public void setDevice(CodeableReference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.DEVICE_USAGE__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableReference newBodySite, NotificationChain msgs) {
		CodeableReference oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__BODY_SITE, oldBodySite, newBodySite);
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
	public void setBodySite(CodeableReference newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USAGE__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USAGE__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.DEVICE_USAGE__NOTE);
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
			case FhirPackage.DEVICE_USAGE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USAGE__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USAGE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DEVICE_USAGE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USAGE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.DEVICE_USAGE__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USAGE__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.DEVICE_USAGE__TIMING_TIMING:
				return basicSetTimingTiming(null, msgs);
			case FhirPackage.DEVICE_USAGE__TIMING_PERIOD:
				return basicSetTimingPeriod(null, msgs);
			case FhirPackage.DEVICE_USAGE__TIMING_DATE_TIME:
				return basicSetTimingDateTime(null, msgs);
			case FhirPackage.DEVICE_USAGE__DATE_ASSERTED:
				return basicSetDateAsserted(null, msgs);
			case FhirPackage.DEVICE_USAGE__USAGE_STATUS:
				return basicSetUsageStatus(null, msgs);
			case FhirPackage.DEVICE_USAGE__USAGE_REASON:
				return ((InternalEList<?>)getUsageReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USAGE__ADHERENCE:
				return basicSetAdherence(null, msgs);
			case FhirPackage.DEVICE_USAGE__INFORMATION_SOURCE:
				return basicSetInformationSource(null, msgs);
			case FhirPackage.DEVICE_USAGE__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.DEVICE_USAGE__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USAGE__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.DEVICE_USAGE__NOTE:
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
			case FhirPackage.DEVICE_USAGE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_USAGE__BASED_ON:
				return getBasedOn();
			case FhirPackage.DEVICE_USAGE__STATUS:
				return getStatus();
			case FhirPackage.DEVICE_USAGE__CATEGORY:
				return getCategory();
			case FhirPackage.DEVICE_USAGE__PATIENT:
				return getPatient();
			case FhirPackage.DEVICE_USAGE__DERIVED_FROM:
				return getDerivedFrom();
			case FhirPackage.DEVICE_USAGE__CONTEXT:
				return getContext();
			case FhirPackage.DEVICE_USAGE__TIMING_TIMING:
				return getTimingTiming();
			case FhirPackage.DEVICE_USAGE__TIMING_PERIOD:
				return getTimingPeriod();
			case FhirPackage.DEVICE_USAGE__TIMING_DATE_TIME:
				return getTimingDateTime();
			case FhirPackage.DEVICE_USAGE__DATE_ASSERTED:
				return getDateAsserted();
			case FhirPackage.DEVICE_USAGE__USAGE_STATUS:
				return getUsageStatus();
			case FhirPackage.DEVICE_USAGE__USAGE_REASON:
				return getUsageReason();
			case FhirPackage.DEVICE_USAGE__ADHERENCE:
				return getAdherence();
			case FhirPackage.DEVICE_USAGE__INFORMATION_SOURCE:
				return getInformationSource();
			case FhirPackage.DEVICE_USAGE__DEVICE:
				return getDevice();
			case FhirPackage.DEVICE_USAGE__REASON:
				return getReason();
			case FhirPackage.DEVICE_USAGE__BODY_SITE:
				return getBodySite();
			case FhirPackage.DEVICE_USAGE__NOTE:
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
			case FhirPackage.DEVICE_USAGE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__STATUS:
				setStatus((DeviceUsageStatus)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__TIMING_TIMING:
				setTimingTiming((Timing)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__TIMING_PERIOD:
				setTimingPeriod((Period)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__DATE_ASSERTED:
				setDateAsserted((DateTime)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__USAGE_STATUS:
				setUsageStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__USAGE_REASON:
				getUsageReason().clear();
				getUsageReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__ADHERENCE:
				setAdherence((DeviceUsageAdherence)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__INFORMATION_SOURCE:
				setInformationSource((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__DEVICE:
				setDevice((CodeableReference)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__BODY_SITE:
				setBodySite((CodeableReference)newValue);
				return;
			case FhirPackage.DEVICE_USAGE__NOTE:
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
			case FhirPackage.DEVICE_USAGE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DEVICE_USAGE__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.DEVICE_USAGE__STATUS:
				setStatus((DeviceUsageStatus)null);
				return;
			case FhirPackage.DEVICE_USAGE__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.DEVICE_USAGE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.DEVICE_USAGE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case FhirPackage.DEVICE_USAGE__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.DEVICE_USAGE__TIMING_TIMING:
				setTimingTiming((Timing)null);
				return;
			case FhirPackage.DEVICE_USAGE__TIMING_PERIOD:
				setTimingPeriod((Period)null);
				return;
			case FhirPackage.DEVICE_USAGE__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)null);
				return;
			case FhirPackage.DEVICE_USAGE__DATE_ASSERTED:
				setDateAsserted((DateTime)null);
				return;
			case FhirPackage.DEVICE_USAGE__USAGE_STATUS:
				setUsageStatus((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_USAGE__USAGE_REASON:
				getUsageReason().clear();
				return;
			case FhirPackage.DEVICE_USAGE__ADHERENCE:
				setAdherence((DeviceUsageAdherence)null);
				return;
			case FhirPackage.DEVICE_USAGE__INFORMATION_SOURCE:
				setInformationSource((Reference)null);
				return;
			case FhirPackage.DEVICE_USAGE__DEVICE:
				setDevice((CodeableReference)null);
				return;
			case FhirPackage.DEVICE_USAGE__REASON:
				getReason().clear();
				return;
			case FhirPackage.DEVICE_USAGE__BODY_SITE:
				setBodySite((CodeableReference)null);
				return;
			case FhirPackage.DEVICE_USAGE__NOTE:
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
			case FhirPackage.DEVICE_USAGE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DEVICE_USAGE__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.DEVICE_USAGE__STATUS:
				return status != null;
			case FhirPackage.DEVICE_USAGE__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.DEVICE_USAGE__PATIENT:
				return patient != null;
			case FhirPackage.DEVICE_USAGE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case FhirPackage.DEVICE_USAGE__CONTEXT:
				return context != null;
			case FhirPackage.DEVICE_USAGE__TIMING_TIMING:
				return timingTiming != null;
			case FhirPackage.DEVICE_USAGE__TIMING_PERIOD:
				return timingPeriod != null;
			case FhirPackage.DEVICE_USAGE__TIMING_DATE_TIME:
				return timingDateTime != null;
			case FhirPackage.DEVICE_USAGE__DATE_ASSERTED:
				return dateAsserted != null;
			case FhirPackage.DEVICE_USAGE__USAGE_STATUS:
				return usageStatus != null;
			case FhirPackage.DEVICE_USAGE__USAGE_REASON:
				return usageReason != null && !usageReason.isEmpty();
			case FhirPackage.DEVICE_USAGE__ADHERENCE:
				return adherence != null;
			case FhirPackage.DEVICE_USAGE__INFORMATION_SOURCE:
				return informationSource != null;
			case FhirPackage.DEVICE_USAGE__DEVICE:
				return device != null;
			case FhirPackage.DEVICE_USAGE__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.DEVICE_USAGE__BODY_SITE:
				return bodySite != null;
			case FhirPackage.DEVICE_USAGE__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceUsageImpl
