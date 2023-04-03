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

import org.hl7.fhir.Availability;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ExtendedContactDetail;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRoleImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerRoleImpl extends DomainResourceImpl implements PractitionerRole {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean active;

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
	 * The cached value of the '{@link #getPractitioner() <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitioner()
	 * @generated
	 * @ordered
	 */
	protected Reference practitioner;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> code;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialty;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> location;

	/**
	 * The cached value of the '{@link #getHealthcareService() <em>Healthcare Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcareService()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> healthcareService;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedContactDetail> contact;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> characteristic;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> communication;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected EList<Availability> availability;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPractitionerRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PRACTITIONER_ROLE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.hl7.fhir.Boolean newActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(org.hl7.fhir.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE__ACTIVE, newActive, newActive));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPractitioner() {
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPractitioner(Reference newPractitioner, NotificationChain msgs) {
		Reference oldPractitioner = practitioner;
		practitioner = newPractitioner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE__PRACTITIONER, oldPractitioner, newPractitioner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPractitioner(Reference newPractitioner) {
		if (newPractitioner != practitioner) {
			NotificationChain msgs = null;
			if (practitioner != null)
				msgs = ((InternalEObject)practitioner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE__PRACTITIONER, null, msgs);
			if (newPractitioner != null)
				msgs = ((InternalEObject)newPractitioner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE__PRACTITIONER, null, msgs);
			msgs = basicSetPractitioner(newPractitioner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE__PRACTITIONER, newPractitioner, newPractitioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Reference newOrganization, NotificationChain msgs) {
		Reference oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PRACTITIONER_ROLE__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PRACTITIONER_ROLE__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PRACTITIONER_ROLE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getHealthcareService() {
		if (healthcareService == null) {
			healthcareService = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE);
		}
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ExtendedContactDetail>(ExtendedContactDetail.class, this, FhirPackage.PRACTITIONER_ROLE__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PRACTITIONER_ROLE__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCommunication() {
		if (communication == null) {
			communication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PRACTITIONER_ROLE__COMMUNICATION);
		}
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Availability> getAvailability() {
		if (availability == null) {
			availability = new EObjectContainmentEList<Availability>(Availability.class, this, FhirPackage.PRACTITIONER_ROLE__AVAILABILITY);
		}
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PRACTITIONER_ROLE__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PRACTITIONER_ROLE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE__ACTIVE:
				return basicSetActive(null, msgs);
			case FhirPackage.PRACTITIONER_ROLE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.PRACTITIONER_ROLE__PRACTITIONER:
				return basicSetPractitioner(null, msgs);
			case FhirPackage.PRACTITIONER_ROLE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.PRACTITIONER_ROLE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return ((InternalEList<?>)getHealthcareService()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE__COMMUNICATION:
				return ((InternalEList<?>)getCommunication()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE__AVAILABILITY:
				return ((InternalEList<?>)getAvailability()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PRACTITIONER_ROLE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PRACTITIONER_ROLE__ACTIVE:
				return getActive();
			case FhirPackage.PRACTITIONER_ROLE__PERIOD:
				return getPeriod();
			case FhirPackage.PRACTITIONER_ROLE__PRACTITIONER:
				return getPractitioner();
			case FhirPackage.PRACTITIONER_ROLE__ORGANIZATION:
				return getOrganization();
			case FhirPackage.PRACTITIONER_ROLE__CODE:
				return getCode();
			case FhirPackage.PRACTITIONER_ROLE__SPECIALTY:
				return getSpecialty();
			case FhirPackage.PRACTITIONER_ROLE__LOCATION:
				return getLocation();
			case FhirPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return getHealthcareService();
			case FhirPackage.PRACTITIONER_ROLE__CONTACT:
				return getContact();
			case FhirPackage.PRACTITIONER_ROLE__CHARACTERISTIC:
				return getCharacteristic();
			case FhirPackage.PRACTITIONER_ROLE__COMMUNICATION:
				return getCommunication();
			case FhirPackage.PRACTITIONER_ROLE__AVAILABILITY:
				return getAvailability();
			case FhirPackage.PRACTITIONER_ROLE__ENDPOINT:
				return getEndpoint();
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
			case FhirPackage.PRACTITIONER_ROLE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__PRACTITIONER:
				setPractitioner((Reference)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareService().clear();
				getHealthcareService().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ExtendedContactDetail>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__COMMUNICATION:
				getCommunication().clear();
				getCommunication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__AVAILABILITY:
				getAvailability().clear();
				getAvailability().addAll((Collection<? extends Availability>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.PRACTITIONER_ROLE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.PRACTITIONER_ROLE__PRACTITIONER:
				setPractitioner((Reference)null);
				return;
			case FhirPackage.PRACTITIONER_ROLE__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.PRACTITIONER_ROLE__CODE:
				getCode().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE__SPECIALTY:
				getSpecialty().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE__LOCATION:
				getLocation().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareService().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE__CHARACTERISTIC:
				getCharacteristic().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE__COMMUNICATION:
				getCommunication().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE__AVAILABILITY:
				getAvailability().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE__ENDPOINT:
				getEndpoint().clear();
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
			case FhirPackage.PRACTITIONER_ROLE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE__ACTIVE:
				return active != null;
			case FhirPackage.PRACTITIONER_ROLE__PERIOD:
				return period != null;
			case FhirPackage.PRACTITIONER_ROLE__PRACTITIONER:
				return practitioner != null;
			case FhirPackage.PRACTITIONER_ROLE__ORGANIZATION:
				return organization != null;
			case FhirPackage.PRACTITIONER_ROLE__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE__LOCATION:
				return location != null && !location.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return healthcareService != null && !healthcareService.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE__COMMUNICATION:
				return communication != null && !communication.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE__AVAILABILITY:
				return availability != null && !availability.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerRoleImpl
