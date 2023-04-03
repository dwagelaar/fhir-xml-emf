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
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterAdmission;
import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterReason;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.VirtualServiceDetail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getSubjectStatus <em>Subject Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getVirtualService <em>Virtual Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getActualPeriod <em>Actual Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getPlannedStartDate <em>Planned Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getPlannedEndDate <em>Planned End Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getDietPreference <em>Diet Preference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getSpecialArrangement <em>Special Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getSpecialCourtesy <em>Special Courtesy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getAdmission <em>Admission</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterImpl extends DomainResourceImpl implements Encounter {
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
	protected EncounterStatus status;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> class_;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

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
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> serviceType;

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
	 * The cached value of the '{@link #getSubjectStatus() <em>Subject Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subjectStatus;

	/**
	 * The cached value of the '{@link #getEpisodeOfCare() <em>Episode Of Care</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeOfCare()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> episodeOfCare;

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
	 * The cached value of the '{@link #getCareTeam() <em>Care Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> careTeam;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected Reference partOf;

	/**
	 * The cached value of the '{@link #getServiceProvider() <em>Service Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference serviceProvider;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterParticipant> participant;

	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> appointment;

	/**
	 * The cached value of the '{@link #getVirtualService() <em>Virtual Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualService()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualServiceDetail> virtualService;

	/**
	 * The cached value of the '{@link #getActualPeriod() <em>Actual Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period actualPeriod;

	/**
	 * The cached value of the '{@link #getPlannedStartDate() <em>Planned Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStartDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime plannedStartDate;

	/**
	 * The cached value of the '{@link #getPlannedEndDate() <em>Planned End Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedEndDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime plannedEndDate;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Duration length;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterReason> reason;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> account;

	/**
	 * The cached value of the '{@link #getDietPreference() <em>Diet Preference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDietPreference()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> dietPreference;

	/**
	 * The cached value of the '{@link #getSpecialArrangement() <em>Special Arrangement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialArrangement()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialArrangement;

	/**
	 * The cached value of the '{@link #getSpecialCourtesy() <em>Special Courtesy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialCourtesy()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialCourtesy;

	/**
	 * The cached value of the '{@link #getAdmission() <em>Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmission()
	 * @generated
	 * @ordered
	 */
	protected EncounterAdmission admission;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterLocation> location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEncounter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ENCOUNTER__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EncounterStatus newStatus, NotificationChain msgs) {
		EncounterStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EncounterStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getServiceType() {
		if (serviceType == null) {
			serviceType = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.ENCOUNTER__SERVICE_TYPE);
		}
		return serviceType;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubjectStatus() {
		return subjectStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectStatus(CodeableConcept newSubjectStatus, NotificationChain msgs) {
		CodeableConcept oldSubjectStatus = subjectStatus;
		subjectStatus = newSubjectStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SUBJECT_STATUS, oldSubjectStatus, newSubjectStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectStatus(CodeableConcept newSubjectStatus) {
		if (newSubjectStatus != subjectStatus) {
			NotificationChain msgs = null;
			if (subjectStatus != null)
				msgs = ((InternalEObject)subjectStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SUBJECT_STATUS, null, msgs);
			if (newSubjectStatus != null)
				msgs = ((InternalEObject)newSubjectStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SUBJECT_STATUS, null, msgs);
			msgs = basicSetSubjectStatus(newSubjectStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SUBJECT_STATUS, newSubjectStatus, newSubjectStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEpisodeOfCare() {
		if (episodeOfCare == null) {
			episodeOfCare = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__EPISODE_OF_CARE);
		}
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getCareTeam() {
		if (careTeam == null) {
			careTeam = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__CARE_TEAM);
		}
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Reference newPartOf, NotificationChain msgs) {
		Reference oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PART_OF, oldPartOf, newPartOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Reference newPartOf) {
		if (newPartOf != partOf) {
			NotificationChain msgs = null;
			if (partOf != null)
				msgs = ((InternalEObject)partOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PART_OF, null, msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PART_OF, null, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getServiceProvider() {
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceProvider(Reference newServiceProvider, NotificationChain msgs) {
		Reference oldServiceProvider = serviceProvider;
		serviceProvider = newServiceProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SERVICE_PROVIDER, oldServiceProvider, newServiceProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProvider(Reference newServiceProvider) {
		if (newServiceProvider != serviceProvider) {
			NotificationChain msgs = null;
			if (serviceProvider != null)
				msgs = ((InternalEObject)serviceProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SERVICE_PROVIDER, null, msgs);
			if (newServiceProvider != null)
				msgs = ((InternalEObject)newServiceProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SERVICE_PROVIDER, null, msgs);
			msgs = basicSetServiceProvider(newServiceProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SERVICE_PROVIDER, newServiceProvider, newServiceProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<EncounterParticipant>(EncounterParticipant.class, this, FhirPackage.ENCOUNTER__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAppointment() {
		if (appointment == null) {
			appointment = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__APPOINTMENT);
		}
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualServiceDetail> getVirtualService() {
		if (virtualService == null) {
			virtualService = new EObjectContainmentEList<VirtualServiceDetail>(VirtualServiceDetail.class, this, FhirPackage.ENCOUNTER__VIRTUAL_SERVICE);
		}
		return virtualService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getActualPeriod() {
		return actualPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualPeriod(Period newActualPeriod, NotificationChain msgs) {
		Period oldActualPeriod = actualPeriod;
		actualPeriod = newActualPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__ACTUAL_PERIOD, oldActualPeriod, newActualPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualPeriod(Period newActualPeriod) {
		if (newActualPeriod != actualPeriod) {
			NotificationChain msgs = null;
			if (actualPeriod != null)
				msgs = ((InternalEObject)actualPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__ACTUAL_PERIOD, null, msgs);
			if (newActualPeriod != null)
				msgs = ((InternalEObject)newActualPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__ACTUAL_PERIOD, null, msgs);
			msgs = basicSetActualPeriod(newActualPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__ACTUAL_PERIOD, newActualPeriod, newActualPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPlannedStartDate() {
		return plannedStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedStartDate(DateTime newPlannedStartDate, NotificationChain msgs) {
		DateTime oldPlannedStartDate = plannedStartDate;
		plannedStartDate = newPlannedStartDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PLANNED_START_DATE, oldPlannedStartDate, newPlannedStartDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedStartDate(DateTime newPlannedStartDate) {
		if (newPlannedStartDate != plannedStartDate) {
			NotificationChain msgs = null;
			if (plannedStartDate != null)
				msgs = ((InternalEObject)plannedStartDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PLANNED_START_DATE, null, msgs);
			if (newPlannedStartDate != null)
				msgs = ((InternalEObject)newPlannedStartDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PLANNED_START_DATE, null, msgs);
			msgs = basicSetPlannedStartDate(newPlannedStartDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PLANNED_START_DATE, newPlannedStartDate, newPlannedStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPlannedEndDate() {
		return plannedEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedEndDate(DateTime newPlannedEndDate, NotificationChain msgs) {
		DateTime oldPlannedEndDate = plannedEndDate;
		plannedEndDate = newPlannedEndDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PLANNED_END_DATE, oldPlannedEndDate, newPlannedEndDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedEndDate(DateTime newPlannedEndDate) {
		if (newPlannedEndDate != plannedEndDate) {
			NotificationChain msgs = null;
			if (plannedEndDate != null)
				msgs = ((InternalEObject)plannedEndDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PLANNED_END_DATE, null, msgs);
			if (newPlannedEndDate != null)
				msgs = ((InternalEObject)newPlannedEndDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PLANNED_END_DATE, null, msgs);
			msgs = basicSetPlannedEndDate(newPlannedEndDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PLANNED_END_DATE, newPlannedEndDate, newPlannedEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(Duration newLength, NotificationChain msgs) {
		Duration oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Duration newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterReason> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<EncounterReason>(EncounterReason.class, this, FhirPackage.ENCOUNTER__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<EncounterDiagnosis>(EncounterDiagnosis.class, this, FhirPackage.ENCOUNTER__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAccount() {
		if (account == null) {
			account = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__ACCOUNT);
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getDietPreference() {
		if (dietPreference == null) {
			dietPreference = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER__DIET_PREFERENCE);
		}
		return dietPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialArrangement() {
		if (specialArrangement == null) {
			specialArrangement = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER__SPECIAL_ARRANGEMENT);
		}
		return specialArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialCourtesy() {
		if (specialCourtesy == null) {
			specialCourtesy = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER__SPECIAL_COURTESY);
		}
		return specialCourtesy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterAdmission getAdmission() {
		return admission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmission(EncounterAdmission newAdmission, NotificationChain msgs) {
		EncounterAdmission oldAdmission = admission;
		admission = newAdmission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__ADMISSION, oldAdmission, newAdmission);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmission(EncounterAdmission newAdmission) {
		if (newAdmission != admission) {
			NotificationChain msgs = null;
			if (admission != null)
				msgs = ((InternalEObject)admission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__ADMISSION, null, msgs);
			if (newAdmission != null)
				msgs = ((InternalEObject)newAdmission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__ADMISSION, null, msgs);
			msgs = basicSetAdmission(newAdmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__ADMISSION, newAdmission, newAdmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterLocation> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<EncounterLocation>(EncounterLocation.class, this, FhirPackage.ENCOUNTER__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ENCOUNTER__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.ENCOUNTER__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.ENCOUNTER__SUBJECT_STATUS:
				return basicSetSubjectStatus(null, msgs);
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				return ((InternalEList<?>)getEpisodeOfCare()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__CARE_TEAM:
				return ((InternalEList<?>)getCareTeam()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__PART_OF:
				return basicSetPartOf(null, msgs);
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				return basicSetServiceProvider(null, msgs);
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				return ((InternalEList<?>)getAppointment()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__VIRTUAL_SERVICE:
				return ((InternalEList<?>)getVirtualService()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__ACTUAL_PERIOD:
				return basicSetActualPeriod(null, msgs);
			case FhirPackage.ENCOUNTER__PLANNED_START_DATE:
				return basicSetPlannedStartDate(null, msgs);
			case FhirPackage.ENCOUNTER__PLANNED_END_DATE:
				return basicSetPlannedEndDate(null, msgs);
			case FhirPackage.ENCOUNTER__LENGTH:
				return basicSetLength(null, msgs);
			case FhirPackage.ENCOUNTER__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__ACCOUNT:
				return ((InternalEList<?>)getAccount()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__DIET_PREFERENCE:
				return ((InternalEList<?>)getDietPreference()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__SPECIAL_ARRANGEMENT:
				return ((InternalEList<?>)getSpecialArrangement()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__SPECIAL_COURTESY:
				return ((InternalEList<?>)getSpecialCourtesy()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__ADMISSION:
				return basicSetAdmission(null, msgs);
			case FhirPackage.ENCOUNTER__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ENCOUNTER__STATUS:
				return getStatus();
			case FhirPackage.ENCOUNTER__CLASS:
				return getClass_();
			case FhirPackage.ENCOUNTER__PRIORITY:
				return getPriority();
			case FhirPackage.ENCOUNTER__TYPE:
				return getType();
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				return getServiceType();
			case FhirPackage.ENCOUNTER__SUBJECT:
				return getSubject();
			case FhirPackage.ENCOUNTER__SUBJECT_STATUS:
				return getSubjectStatus();
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				return getEpisodeOfCare();
			case FhirPackage.ENCOUNTER__BASED_ON:
				return getBasedOn();
			case FhirPackage.ENCOUNTER__CARE_TEAM:
				return getCareTeam();
			case FhirPackage.ENCOUNTER__PART_OF:
				return getPartOf();
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				return getServiceProvider();
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				return getParticipant();
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				return getAppointment();
			case FhirPackage.ENCOUNTER__VIRTUAL_SERVICE:
				return getVirtualService();
			case FhirPackage.ENCOUNTER__ACTUAL_PERIOD:
				return getActualPeriod();
			case FhirPackage.ENCOUNTER__PLANNED_START_DATE:
				return getPlannedStartDate();
			case FhirPackage.ENCOUNTER__PLANNED_END_DATE:
				return getPlannedEndDate();
			case FhirPackage.ENCOUNTER__LENGTH:
				return getLength();
			case FhirPackage.ENCOUNTER__REASON:
				return getReason();
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.ENCOUNTER__ACCOUNT:
				return getAccount();
			case FhirPackage.ENCOUNTER__DIET_PREFERENCE:
				return getDietPreference();
			case FhirPackage.ENCOUNTER__SPECIAL_ARRANGEMENT:
				return getSpecialArrangement();
			case FhirPackage.ENCOUNTER__SPECIAL_COURTESY:
				return getSpecialCourtesy();
			case FhirPackage.ENCOUNTER__ADMISSION:
				return getAdmission();
			case FhirPackage.ENCOUNTER__LOCATION:
				return getLocation();
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
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ENCOUNTER__STATUS:
				setStatus((EncounterStatus)newValue);
				return;
			case FhirPackage.ENCOUNTER__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				getServiceType().clear();
				getServiceType().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER__SUBJECT_STATUS:
				setSubjectStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				getEpisodeOfCare().clear();
				getEpisodeOfCare().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__CARE_TEAM:
				getCareTeam().clear();
				getCareTeam().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__PART_OF:
				setPartOf((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				setServiceProvider((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends EncounterParticipant>)newValue);
				return;
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				getAppointment().clear();
				getAppointment().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__VIRTUAL_SERVICE:
				getVirtualService().clear();
				getVirtualService().addAll((Collection<? extends VirtualServiceDetail>)newValue);
				return;
			case FhirPackage.ENCOUNTER__ACTUAL_PERIOD:
				setActualPeriod((Period)newValue);
				return;
			case FhirPackage.ENCOUNTER__PLANNED_START_DATE:
				setPlannedStartDate((DateTime)newValue);
				return;
			case FhirPackage.ENCOUNTER__PLANNED_END_DATE:
				setPlannedEndDate((DateTime)newValue);
				return;
			case FhirPackage.ENCOUNTER__LENGTH:
				setLength((Duration)newValue);
				return;
			case FhirPackage.ENCOUNTER__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends EncounterReason>)newValue);
				return;
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends EncounterDiagnosis>)newValue);
				return;
			case FhirPackage.ENCOUNTER__ACCOUNT:
				getAccount().clear();
				getAccount().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__DIET_PREFERENCE:
				getDietPreference().clear();
				getDietPreference().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER__SPECIAL_ARRANGEMENT:
				getSpecialArrangement().clear();
				getSpecialArrangement().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER__SPECIAL_COURTESY:
				getSpecialCourtesy().clear();
				getSpecialCourtesy().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER__ADMISSION:
				setAdmission((EncounterAdmission)newValue);
				return;
			case FhirPackage.ENCOUNTER__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends EncounterLocation>)newValue);
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
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ENCOUNTER__STATUS:
				setStatus((EncounterStatus)null);
				return;
			case FhirPackage.ENCOUNTER__CLASS:
				getClass_().clear();
				return;
			case FhirPackage.ENCOUNTER__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER__TYPE:
				getType().clear();
				return;
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				getServiceType().clear();
				return;
			case FhirPackage.ENCOUNTER__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.ENCOUNTER__SUBJECT_STATUS:
				setSubjectStatus((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				getEpisodeOfCare().clear();
				return;
			case FhirPackage.ENCOUNTER__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.ENCOUNTER__CARE_TEAM:
				getCareTeam().clear();
				return;
			case FhirPackage.ENCOUNTER__PART_OF:
				setPartOf((Reference)null);
				return;
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				setServiceProvider((Reference)null);
				return;
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				getAppointment().clear();
				return;
			case FhirPackage.ENCOUNTER__VIRTUAL_SERVICE:
				getVirtualService().clear();
				return;
			case FhirPackage.ENCOUNTER__ACTUAL_PERIOD:
				setActualPeriod((Period)null);
				return;
			case FhirPackage.ENCOUNTER__PLANNED_START_DATE:
				setPlannedStartDate((DateTime)null);
				return;
			case FhirPackage.ENCOUNTER__PLANNED_END_DATE:
				setPlannedEndDate((DateTime)null);
				return;
			case FhirPackage.ENCOUNTER__LENGTH:
				setLength((Duration)null);
				return;
			case FhirPackage.ENCOUNTER__REASON:
				getReason().clear();
				return;
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirPackage.ENCOUNTER__ACCOUNT:
				getAccount().clear();
				return;
			case FhirPackage.ENCOUNTER__DIET_PREFERENCE:
				getDietPreference().clear();
				return;
			case FhirPackage.ENCOUNTER__SPECIAL_ARRANGEMENT:
				getSpecialArrangement().clear();
				return;
			case FhirPackage.ENCOUNTER__SPECIAL_COURTESY:
				getSpecialCourtesy().clear();
				return;
			case FhirPackage.ENCOUNTER__ADMISSION:
				setAdmission((EncounterAdmission)null);
				return;
			case FhirPackage.ENCOUNTER__LOCATION:
				getLocation().clear();
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
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ENCOUNTER__STATUS:
				return status != null;
			case FhirPackage.ENCOUNTER__CLASS:
				return class_ != null && !class_.isEmpty();
			case FhirPackage.ENCOUNTER__PRIORITY:
				return priority != null;
			case FhirPackage.ENCOUNTER__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				return serviceType != null && !serviceType.isEmpty();
			case FhirPackage.ENCOUNTER__SUBJECT:
				return subject != null;
			case FhirPackage.ENCOUNTER__SUBJECT_STATUS:
				return subjectStatus != null;
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				return episodeOfCare != null && !episodeOfCare.isEmpty();
			case FhirPackage.ENCOUNTER__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.ENCOUNTER__CARE_TEAM:
				return careTeam != null && !careTeam.isEmpty();
			case FhirPackage.ENCOUNTER__PART_OF:
				return partOf != null;
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				return serviceProvider != null;
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				return appointment != null && !appointment.isEmpty();
			case FhirPackage.ENCOUNTER__VIRTUAL_SERVICE:
				return virtualService != null && !virtualService.isEmpty();
			case FhirPackage.ENCOUNTER__ACTUAL_PERIOD:
				return actualPeriod != null;
			case FhirPackage.ENCOUNTER__PLANNED_START_DATE:
				return plannedStartDate != null;
			case FhirPackage.ENCOUNTER__PLANNED_END_DATE:
				return plannedEndDate != null;
			case FhirPackage.ENCOUNTER__LENGTH:
				return length != null;
			case FhirPackage.ENCOUNTER__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirPackage.ENCOUNTER__ACCOUNT:
				return account != null && !account.isEmpty();
			case FhirPackage.ENCOUNTER__DIET_PREFERENCE:
				return dietPreference != null && !dietPreference.isEmpty();
			case FhirPackage.ENCOUNTER__SPECIAL_ARRANGEMENT:
				return specialArrangement != null && !specialArrangement.isEmpty();
			case FhirPackage.ENCOUNTER__SPECIAL_COURTESY:
				return specialCourtesy != null && !specialCourtesy.isEmpty();
			case FhirPackage.ENCOUNTER__ADMISSION:
				return admission != null;
			case FhirPackage.ENCOUNTER__LOCATION:
				return location != null && !location.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EncounterImpl
