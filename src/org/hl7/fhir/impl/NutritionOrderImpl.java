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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RequestIntent;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.RequestStatus;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getFoodPreferenceModifier <em>Food Preference Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getExcludeFoodModifier <em>Exclude Food Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getOutsideFoodAllowed <em>Outside Food Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getOralDiet <em>Oral Diet</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getEnteralFormula <em>Enteral Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderImpl extends DomainResourceImpl implements NutritionOrder {
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
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesUri() <em>Instantiates Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUri()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiatesUri;

	/**
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiates;

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
	 * The cached value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier groupIdentifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RequestStatus status;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected RequestIntent intent;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected RequestPriority priority;

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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

	/**
	 * The cached value of the '{@link #getOrderer() <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderer()
	 * @generated
	 * @ordered
	 */
	protected Reference orderer;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> performer;

	/**
	 * The cached value of the '{@link #getAllergyIntolerance() <em>Allergy Intolerance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerance()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> allergyIntolerance;

	/**
	 * The cached value of the '{@link #getFoodPreferenceModifier() <em>Food Preference Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodPreferenceModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> foodPreferenceModifier;

	/**
	 * The cached value of the '{@link #getExcludeFoodModifier() <em>Exclude Food Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFoodModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> excludeFoodModifier;

	/**
	 * The cached value of the '{@link #getOutsideFoodAllowed() <em>Outside Food Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideFoodAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean outsideFoodAllowed;

	/**
	 * The cached value of the '{@link #getOralDiet() <em>Oral Diet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOralDiet()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderOralDiet oralDiet;

	/**
	 * The cached value of the '{@link #getSupplement() <em>Supplement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplement()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderSupplement> supplement;

	/**
	 * The cached value of the '{@link #getEnteralFormula() <em>Enteral Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteralFormula()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderEnteralFormula enteralFormula;

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
	protected NutritionOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionOrder();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.NUTRITION_ORDER__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Canonical> getInstantiatesCanonical() {
		if (instantiatesCanonical == null) {
			instantiatesCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getInstantiatesUri() {
		if (instantiatesUri == null) {
			instantiatesUri = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.NUTRITION_ORDER__INSTANTIATES_URI);
		}
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getInstantiates() {
		if (instantiates == null) {
			instantiates = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.NUTRITION_ORDER__INSTANTIATES);
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.NUTRITION_ORDER__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getGroupIdentifier() {
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupIdentifier(Identifier newGroupIdentifier, NotificationChain msgs) {
		Identifier oldGroupIdentifier = groupIdentifier;
		groupIdentifier = newGroupIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__GROUP_IDENTIFIER, oldGroupIdentifier, newGroupIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupIdentifier(Identifier newGroupIdentifier) {
		if (newGroupIdentifier != groupIdentifier) {
			NotificationChain msgs = null;
			if (groupIdentifier != null)
				msgs = ((InternalEObject)groupIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__GROUP_IDENTIFIER, null, msgs);
			if (newGroupIdentifier != null)
				msgs = ((InternalEObject)newGroupIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__GROUP_IDENTIFIER, null, msgs);
			msgs = basicSetGroupIdentifier(newGroupIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__GROUP_IDENTIFIER, newGroupIdentifier, newGroupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(RequestStatus newStatus, NotificationChain msgs) {
		RequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(RequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntent getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(RequestIntent newIntent, NotificationChain msgs) {
		RequestIntent oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(RequestIntent newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(RequestPriority newPriority, NotificationChain msgs) {
		RequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(RequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__PRIORITY, newPriority, newPriority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.NUTRITION_ORDER__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTime newDateTime, NotificationChain msgs) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTime newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrderer() {
		return orderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderer(Reference newOrderer, NotificationChain msgs) {
		Reference oldOrderer = orderer;
		orderer = newOrderer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ORDERER, oldOrderer, newOrderer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderer(Reference newOrderer) {
		if (newOrderer != orderer) {
			NotificationChain msgs = null;
			if (orderer != null)
				msgs = ((InternalEObject)orderer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ORDERER, null, msgs);
			if (newOrderer != null)
				msgs = ((InternalEObject)newOrderer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ORDERER, null, msgs);
			msgs = basicSetOrderer(newOrderer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ORDERER, newOrderer, newOrderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.NUTRITION_ORDER__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAllergyIntolerance() {
		if (allergyIntolerance == null) {
			allergyIntolerance = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE);
		}
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFoodPreferenceModifier() {
		if (foodPreferenceModifier == null) {
			foodPreferenceModifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER);
		}
		return foodPreferenceModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getExcludeFoodModifier() {
		if (excludeFoodModifier == null) {
			excludeFoodModifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER);
		}
		return excludeFoodModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getOutsideFoodAllowed() {
		return outsideFoodAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutsideFoodAllowed(org.hl7.fhir.Boolean newOutsideFoodAllowed, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldOutsideFoodAllowed = outsideFoodAllowed;
		outsideFoodAllowed = newOutsideFoodAllowed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__OUTSIDE_FOOD_ALLOWED, oldOutsideFoodAllowed, newOutsideFoodAllowed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutsideFoodAllowed(org.hl7.fhir.Boolean newOutsideFoodAllowed) {
		if (newOutsideFoodAllowed != outsideFoodAllowed) {
			NotificationChain msgs = null;
			if (outsideFoodAllowed != null)
				msgs = ((InternalEObject)outsideFoodAllowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__OUTSIDE_FOOD_ALLOWED, null, msgs);
			if (newOutsideFoodAllowed != null)
				msgs = ((InternalEObject)newOutsideFoodAllowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__OUTSIDE_FOOD_ALLOWED, null, msgs);
			msgs = basicSetOutsideFoodAllowed(newOutsideFoodAllowed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__OUTSIDE_FOOD_ALLOWED, newOutsideFoodAllowed, newOutsideFoodAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDiet getOralDiet() {
		return oralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOralDiet(NutritionOrderOralDiet newOralDiet, NotificationChain msgs) {
		NutritionOrderOralDiet oldOralDiet = oralDiet;
		oralDiet = newOralDiet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ORAL_DIET, oldOralDiet, newOralDiet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOralDiet(NutritionOrderOralDiet newOralDiet) {
		if (newOralDiet != oralDiet) {
			NotificationChain msgs = null;
			if (oralDiet != null)
				msgs = ((InternalEObject)oralDiet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ORAL_DIET, null, msgs);
			if (newOralDiet != null)
				msgs = ((InternalEObject)newOralDiet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ORAL_DIET, null, msgs);
			msgs = basicSetOralDiet(newOralDiet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ORAL_DIET, newOralDiet, newOralDiet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionOrderSupplement> getSupplement() {
		if (supplement == null) {
			supplement = new EObjectContainmentEList<NutritionOrderSupplement>(NutritionOrderSupplement.class, this, FhirPackage.NUTRITION_ORDER__SUPPLEMENT);
		}
		return supplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderEnteralFormula getEnteralFormula() {
		return enteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnteralFormula(NutritionOrderEnteralFormula newEnteralFormula, NotificationChain msgs) {
		NutritionOrderEnteralFormula oldEnteralFormula = enteralFormula;
		enteralFormula = newEnteralFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA, oldEnteralFormula, newEnteralFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnteralFormula(NutritionOrderEnteralFormula newEnteralFormula) {
		if (newEnteralFormula != enteralFormula) {
			NotificationChain msgs = null;
			if (enteralFormula != null)
				msgs = ((InternalEObject)enteralFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA, null, msgs);
			if (newEnteralFormula != null)
				msgs = ((InternalEObject)newEnteralFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA, null, msgs);
			msgs = basicSetEnteralFormula(newEnteralFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA, newEnteralFormula, newEnteralFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.NUTRITION_ORDER__NOTE);
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
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonical()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUri()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES:
				return ((InternalEList<?>)getInstantiates()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__GROUP_IDENTIFIER:
				return basicSetGroupIdentifier(null, msgs);
			case FhirPackage.NUTRITION_ORDER__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.NUTRITION_ORDER__INTENT:
				return basicSetIntent(null, msgs);
			case FhirPackage.NUTRITION_ORDER__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.NUTRITION_ORDER__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.NUTRITION_ORDER__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				return basicSetOrderer(null, msgs);
			case FhirPackage.NUTRITION_ORDER__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return ((InternalEList<?>)getAllergyIntolerance()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return ((InternalEList<?>)getFoodPreferenceModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return ((InternalEList<?>)getExcludeFoodModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__OUTSIDE_FOOD_ALLOWED:
				return basicSetOutsideFoodAllowed(null, msgs);
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				return basicSetOralDiet(null, msgs);
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				return ((InternalEList<?>)getSupplement()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return basicSetEnteralFormula(null, msgs);
			case FhirPackage.NUTRITION_ORDER__NOTE:
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
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES:
				return getInstantiates();
			case FhirPackage.NUTRITION_ORDER__BASED_ON:
				return getBasedOn();
			case FhirPackage.NUTRITION_ORDER__GROUP_IDENTIFIER:
				return getGroupIdentifier();
			case FhirPackage.NUTRITION_ORDER__STATUS:
				return getStatus();
			case FhirPackage.NUTRITION_ORDER__INTENT:
				return getIntent();
			case FhirPackage.NUTRITION_ORDER__PRIORITY:
				return getPriority();
			case FhirPackage.NUTRITION_ORDER__SUBJECT:
				return getSubject();
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				return getEncounter();
			case FhirPackage.NUTRITION_ORDER__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				return getDateTime();
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				return getOrderer();
			case FhirPackage.NUTRITION_ORDER__PERFORMER:
				return getPerformer();
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return getAllergyIntolerance();
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return getFoodPreferenceModifier();
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return getExcludeFoodModifier();
			case FhirPackage.NUTRITION_ORDER__OUTSIDE_FOOD_ALLOWED:
				return getOutsideFoodAllowed();
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				return getOralDiet();
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				return getSupplement();
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return getEnteralFormula();
			case FhirPackage.NUTRITION_ORDER__NOTE:
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
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				getInstantiatesCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				getInstantiatesUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES:
				getInstantiates().clear();
				getInstantiates().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__STATUS:
				setStatus((RequestStatus)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__INTENT:
				setIntent((RequestIntent)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__PRIORITY:
				setPriority((RequestPriority)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				setOrderer((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				getAllergyIntolerance().clear();
				getAllergyIntolerance().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifier().clear();
				getFoodPreferenceModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifier().clear();
				getExcludeFoodModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__OUTSIDE_FOOD_ALLOWED:
				setOutsideFoodAllowed((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				setOralDiet((NutritionOrderOralDiet)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				getSupplement().clear();
				getSupplement().addAll((Collection<? extends NutritionOrderSupplement>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				setEnteralFormula((NutritionOrderEnteralFormula)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__NOTE:
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
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES:
				getInstantiates().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case FhirPackage.NUTRITION_ORDER__STATUS:
				setStatus((RequestStatus)null);
				return;
			case FhirPackage.NUTRITION_ORDER__INTENT:
				setIntent((RequestIntent)null);
				return;
			case FhirPackage.NUTRITION_ORDER__PRIORITY:
				setPriority((RequestPriority)null);
				return;
			case FhirPackage.NUTRITION_ORDER__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.NUTRITION_ORDER__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				setOrderer((Reference)null);
				return;
			case FhirPackage.NUTRITION_ORDER__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				getAllergyIntolerance().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifier().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifier().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__OUTSIDE_FOOD_ALLOWED:
				setOutsideFoodAllowed((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				setOralDiet((NutritionOrderOralDiet)null);
				return;
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				getSupplement().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				setEnteralFormula((NutritionOrderEnteralFormula)null);
				return;
			case FhirPackage.NUTRITION_ORDER__NOTE:
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
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null && !instantiatesCanonical.isEmpty();
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				return instantiatesUri != null && !instantiatesUri.isEmpty();
			case FhirPackage.NUTRITION_ORDER__INSTANTIATES:
				return instantiates != null && !instantiates.isEmpty();
			case FhirPackage.NUTRITION_ORDER__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.NUTRITION_ORDER__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case FhirPackage.NUTRITION_ORDER__STATUS:
				return status != null;
			case FhirPackage.NUTRITION_ORDER__INTENT:
				return intent != null;
			case FhirPackage.NUTRITION_ORDER__PRIORITY:
				return priority != null;
			case FhirPackage.NUTRITION_ORDER__SUBJECT:
				return subject != null;
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				return encounter != null;
			case FhirPackage.NUTRITION_ORDER__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				return dateTime != null;
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				return orderer != null;
			case FhirPackage.NUTRITION_ORDER__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return allergyIntolerance != null && !allergyIntolerance.isEmpty();
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return foodPreferenceModifier != null && !foodPreferenceModifier.isEmpty();
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return excludeFoodModifier != null && !excludeFoodModifier.isEmpty();
			case FhirPackage.NUTRITION_ORDER__OUTSIDE_FOOD_ALLOWED:
				return outsideFoodAllowed != null;
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				return oralDiet != null;
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				return supplement != null && !supplement.isEmpty();
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return enteralFormula != null;
			case FhirPackage.NUTRITION_ORDER__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderImpl
