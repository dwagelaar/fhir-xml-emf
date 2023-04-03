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
import org.hl7.fhir.EventStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.NutritionIntake;
import org.hl7.fhir.NutritionIntakeConsumedItem;
import org.hl7.fhir.NutritionIntakeIngredientLabel;
import org.hl7.fhir.NutritionIntakePerformer;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Intake</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getReportedBoolean <em>Reported Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getReportedReference <em>Reported Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getConsumedItem <em>Consumed Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getIngredientLabel <em>Ingredient Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionIntakeImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionIntakeImpl extends DomainResourceImpl implements NutritionIntake {
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
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOf;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EventStatus status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> statusReason;

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
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurrencePeriod() <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurrencePeriod;

	/**
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected DateTime recorded;

	/**
	 * The cached value of the '{@link #getReportedBoolean() <em>Reported Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean reportedBoolean;

	/**
	 * The cached value of the '{@link #getReportedReference() <em>Reported Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reportedReference;

	/**
	 * The cached value of the '{@link #getConsumedItem() <em>Consumed Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionIntakeConsumedItem> consumedItem;

	/**
	 * The cached value of the '{@link #getIngredientLabel() <em>Ingredient Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredientLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionIntakeIngredientLabel> ingredientLabel;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionIntakePerformer> performer;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

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
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> reason;

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
	protected NutritionIntakeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionIntake();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.NUTRITION_INTAKE__IDENTIFIER);
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
			instantiatesCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.NUTRITION_INTAKE__INSTANTIATES_CANONICAL);
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
			instantiatesUri = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.NUTRITION_INTAKE__INSTANTIATES_URI);
		}
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.NUTRITION_INTAKE__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.NUTRITION_INTAKE__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EventStatus newStatus, NotificationChain msgs) {
		EventStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EventStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getStatusReason() {
		if (statusReason == null) {
			statusReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.NUTRITION_INTAKE__STATUS_REASON);
		}
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getOccurrencePeriod() {
		return occurrencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencePeriod(Period newOccurrencePeriod, NotificationChain msgs) {
		Period oldOccurrencePeriod = occurrencePeriod;
		occurrencePeriod = newOccurrencePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__OCCURRENCE_PERIOD, oldOccurrencePeriod, newOccurrencePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencePeriod(Period newOccurrencePeriod) {
		if (newOccurrencePeriod != occurrencePeriod) {
			NotificationChain msgs = null;
			if (occurrencePeriod != null)
				msgs = ((InternalEObject)occurrencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__OCCURRENCE_PERIOD, null, msgs);
			if (newOccurrencePeriod != null)
				msgs = ((InternalEObject)newOccurrencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__OCCURRENCE_PERIOD, null, msgs);
			msgs = basicSetOccurrencePeriod(newOccurrencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__OCCURRENCE_PERIOD, newOccurrencePeriod, newOccurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRecorded() {
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorded(DateTime newRecorded, NotificationChain msgs) {
		DateTime oldRecorded = recorded;
		recorded = newRecorded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__RECORDED, oldRecorded, newRecorded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorded(DateTime newRecorded) {
		if (newRecorded != recorded) {
			NotificationChain msgs = null;
			if (recorded != null)
				msgs = ((InternalEObject)recorded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__RECORDED, null, msgs);
			if (newRecorded != null)
				msgs = ((InternalEObject)newRecorded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__RECORDED, null, msgs);
			msgs = basicSetRecorded(newRecorded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__RECORDED, newRecorded, newRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getReportedBoolean() {
		return reportedBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportedBoolean(org.hl7.fhir.Boolean newReportedBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldReportedBoolean = reportedBoolean;
		reportedBoolean = newReportedBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__REPORTED_BOOLEAN, oldReportedBoolean, newReportedBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportedBoolean(org.hl7.fhir.Boolean newReportedBoolean) {
		if (newReportedBoolean != reportedBoolean) {
			NotificationChain msgs = null;
			if (reportedBoolean != null)
				msgs = ((InternalEObject)reportedBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__REPORTED_BOOLEAN, null, msgs);
			if (newReportedBoolean != null)
				msgs = ((InternalEObject)newReportedBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__REPORTED_BOOLEAN, null, msgs);
			msgs = basicSetReportedBoolean(newReportedBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__REPORTED_BOOLEAN, newReportedBoolean, newReportedBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReportedReference() {
		return reportedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportedReference(Reference newReportedReference, NotificationChain msgs) {
		Reference oldReportedReference = reportedReference;
		reportedReference = newReportedReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__REPORTED_REFERENCE, oldReportedReference, newReportedReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportedReference(Reference newReportedReference) {
		if (newReportedReference != reportedReference) {
			NotificationChain msgs = null;
			if (reportedReference != null)
				msgs = ((InternalEObject)reportedReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__REPORTED_REFERENCE, null, msgs);
			if (newReportedReference != null)
				msgs = ((InternalEObject)newReportedReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__REPORTED_REFERENCE, null, msgs);
			msgs = basicSetReportedReference(newReportedReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__REPORTED_REFERENCE, newReportedReference, newReportedReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionIntakeConsumedItem> getConsumedItem() {
		if (consumedItem == null) {
			consumedItem = new EObjectContainmentEList<NutritionIntakeConsumedItem>(NutritionIntakeConsumedItem.class, this, FhirPackage.NUTRITION_INTAKE__CONSUMED_ITEM);
		}
		return consumedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionIntakeIngredientLabel> getIngredientLabel() {
		if (ingredientLabel == null) {
			ingredientLabel = new EObjectContainmentEList<NutritionIntakeIngredientLabel>(NutritionIntakeIngredientLabel.class, this, FhirPackage.NUTRITION_INTAKE__INGREDIENT_LABEL);
		}
		return ingredientLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionIntakePerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<NutritionIntakePerformer>(NutritionIntakePerformer.class, this, FhirPackage.NUTRITION_INTAKE__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_INTAKE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_INTAKE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.NUTRITION_INTAKE__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.NUTRITION_INTAKE__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.NUTRITION_INTAKE__NOTE);
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
			case FhirPackage.NUTRITION_INTAKE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonical()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUri()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__STATUS_REASON:
				return ((InternalEList<?>)getStatusReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_PERIOD:
				return basicSetOccurrencePeriod(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__RECORDED:
				return basicSetRecorded(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__REPORTED_BOOLEAN:
				return basicSetReportedBoolean(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__REPORTED_REFERENCE:
				return basicSetReportedReference(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__CONSUMED_ITEM:
				return ((InternalEList<?>)getConsumedItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__INGREDIENT_LABEL:
				return ((InternalEList<?>)getIngredientLabel()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.NUTRITION_INTAKE__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_INTAKE__NOTE:
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
			case FhirPackage.NUTRITION_INTAKE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FhirPackage.NUTRITION_INTAKE__BASED_ON:
				return getBasedOn();
			case FhirPackage.NUTRITION_INTAKE__PART_OF:
				return getPartOf();
			case FhirPackage.NUTRITION_INTAKE__STATUS:
				return getStatus();
			case FhirPackage.NUTRITION_INTAKE__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.NUTRITION_INTAKE__CODE:
				return getCode();
			case FhirPackage.NUTRITION_INTAKE__SUBJECT:
				return getSubject();
			case FhirPackage.NUTRITION_INTAKE__ENCOUNTER:
				return getEncounter();
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_PERIOD:
				return getOccurrencePeriod();
			case FhirPackage.NUTRITION_INTAKE__RECORDED:
				return getRecorded();
			case FhirPackage.NUTRITION_INTAKE__REPORTED_BOOLEAN:
				return getReportedBoolean();
			case FhirPackage.NUTRITION_INTAKE__REPORTED_REFERENCE:
				return getReportedReference();
			case FhirPackage.NUTRITION_INTAKE__CONSUMED_ITEM:
				return getConsumedItem();
			case FhirPackage.NUTRITION_INTAKE__INGREDIENT_LABEL:
				return getIngredientLabel();
			case FhirPackage.NUTRITION_INTAKE__PERFORMER:
				return getPerformer();
			case FhirPackage.NUTRITION_INTAKE__LOCATION:
				return getLocation();
			case FhirPackage.NUTRITION_INTAKE__DERIVED_FROM:
				return getDerivedFrom();
			case FhirPackage.NUTRITION_INTAKE__REASON:
				return getReason();
			case FhirPackage.NUTRITION_INTAKE__NOTE:
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
			case FhirPackage.NUTRITION_INTAKE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				getInstantiatesCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				getInstantiatesUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__STATUS:
				setStatus((EventStatus)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__STATUS_REASON:
				getStatusReason().clear();
				getStatusReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__RECORDED:
				setRecorded((DateTime)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__REPORTED_BOOLEAN:
				setReportedBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__REPORTED_REFERENCE:
				setReportedReference((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__CONSUMED_ITEM:
				getConsumedItem().clear();
				getConsumedItem().addAll((Collection<? extends NutritionIntakeConsumedItem>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__INGREDIENT_LABEL:
				getIngredientLabel().clear();
				getIngredientLabel().addAll((Collection<? extends NutritionIntakeIngredientLabel>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends NutritionIntakePerformer>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.NUTRITION_INTAKE__NOTE:
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
			case FhirPackage.NUTRITION_INTAKE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__STATUS:
				setStatus((EventStatus)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__STATUS_REASON:
				getStatusReason().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__RECORDED:
				setRecorded((DateTime)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__REPORTED_BOOLEAN:
				setReportedBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__REPORTED_REFERENCE:
				setReportedReference((Reference)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__CONSUMED_ITEM:
				getConsumedItem().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__INGREDIENT_LABEL:
				getIngredientLabel().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.NUTRITION_INTAKE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__REASON:
				getReason().clear();
				return;
			case FhirPackage.NUTRITION_INTAKE__NOTE:
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
			case FhirPackage.NUTRITION_INTAKE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null && !instantiatesCanonical.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__INSTANTIATES_URI:
				return instantiatesUri != null && !instantiatesUri.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__STATUS:
				return status != null;
			case FhirPackage.NUTRITION_INTAKE__STATUS_REASON:
				return statusReason != null && !statusReason.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__CODE:
				return code != null;
			case FhirPackage.NUTRITION_INTAKE__SUBJECT:
				return subject != null;
			case FhirPackage.NUTRITION_INTAKE__ENCOUNTER:
				return encounter != null;
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.NUTRITION_INTAKE__OCCURRENCE_PERIOD:
				return occurrencePeriod != null;
			case FhirPackage.NUTRITION_INTAKE__RECORDED:
				return recorded != null;
			case FhirPackage.NUTRITION_INTAKE__REPORTED_BOOLEAN:
				return reportedBoolean != null;
			case FhirPackage.NUTRITION_INTAKE__REPORTED_REFERENCE:
				return reportedReference != null;
			case FhirPackage.NUTRITION_INTAKE__CONSUMED_ITEM:
				return consumedItem != null && !consumedItem.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__INGREDIENT_LABEL:
				return ingredientLabel != null && !ingredientLabel.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__LOCATION:
				return location != null;
			case FhirPackage.NUTRITION_INTAKE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.NUTRITION_INTAKE__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NutritionIntakeImpl
