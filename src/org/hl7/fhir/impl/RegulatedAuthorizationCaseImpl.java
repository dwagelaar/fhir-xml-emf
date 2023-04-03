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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.RegulatedAuthorizationCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulated Authorization Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationCaseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationCaseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationCaseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationCaseImpl#getDatePeriod <em>Date Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationCaseImpl#getDateDateTime <em>Date Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RegulatedAuthorizationCaseImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatedAuthorizationCaseImpl extends BackboneElementImpl implements RegulatedAuthorizationCase {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getDatePeriod() <em>Date Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period datePeriod;

	/**
	 * The cached value of the '{@link #getDateDateTime() <em>Date Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateDateTime;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatedAuthorizationCase> application;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatedAuthorizationCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRegulatedAuthorizationCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getDatePeriod() {
		return datePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatePeriod(Period newDatePeriod, NotificationChain msgs) {
		Period oldDatePeriod = datePeriod;
		datePeriod = newDatePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_PERIOD, oldDatePeriod, newDatePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePeriod(Period newDatePeriod) {
		if (newDatePeriod != datePeriod) {
			NotificationChain msgs = null;
			if (datePeriod != null)
				msgs = ((InternalEObject)datePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_PERIOD, null, msgs);
			if (newDatePeriod != null)
				msgs = ((InternalEObject)newDatePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_PERIOD, null, msgs);
			msgs = basicSetDatePeriod(newDatePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_PERIOD, newDatePeriod, newDatePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateDateTime() {
		return dateDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDateTime(DateTime newDateDateTime, NotificationChain msgs) {
		DateTime oldDateDateTime = dateDateTime;
		dateDateTime = newDateDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_DATE_TIME, oldDateDateTime, newDateDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDateTime(DateTime newDateDateTime) {
		if (newDateDateTime != dateDateTime) {
			NotificationChain msgs = null;
			if (dateDateTime != null)
				msgs = ((InternalEObject)dateDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_DATE_TIME, null, msgs);
			if (newDateDateTime != null)
				msgs = ((InternalEObject)newDateDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_DATE_TIME, null, msgs);
			msgs = basicSetDateDateTime(newDateDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_DATE_TIME, newDateDateTime, newDateDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegulatedAuthorizationCase> getApplication() {
		if (application == null) {
			application = new EObjectContainmentEList<RegulatedAuthorizationCase>(RegulatedAuthorizationCase.class, this, FhirPackage.REGULATED_AUTHORIZATION_CASE__APPLICATION);
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_PERIOD:
				return basicSetDatePeriod(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_DATE_TIME:
				return basicSetDateDateTime(null, msgs);
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__APPLICATION:
				return ((InternalEList<?>)getApplication()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__TYPE:
				return getType();
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__STATUS:
				return getStatus();
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_PERIOD:
				return getDatePeriod();
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_DATE_TIME:
				return getDateDateTime();
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__APPLICATION:
				return getApplication();
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
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_PERIOD:
				setDatePeriod((Period)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_DATE_TIME:
				setDateDateTime((DateTime)newValue);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__APPLICATION:
				getApplication().clear();
				getApplication().addAll((Collection<? extends RegulatedAuthorizationCase>)newValue);
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
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_PERIOD:
				setDatePeriod((Period)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_DATE_TIME:
				setDateDateTime((DateTime)null);
				return;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__APPLICATION:
				getApplication().clear();
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
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__TYPE:
				return type != null;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__STATUS:
				return status != null;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_PERIOD:
				return datePeriod != null;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__DATE_DATE_TIME:
				return dateDateTime != null;
			case FhirPackage.REGULATED_AUTHORIZATION_CASE__APPLICATION:
				return application != null && !application.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegulatedAuthorizationCaseImpl
