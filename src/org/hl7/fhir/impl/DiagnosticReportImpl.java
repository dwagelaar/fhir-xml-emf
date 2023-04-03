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
import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportMedia;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiagnosticReportSupportingInfo;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getResultsInterpreter <em>Results Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getStudy <em>Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getConclusionCode <em>Conclusion Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getPresentedForm <em>Presented Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticReportImpl extends DomainResourceImpl implements DiagnosticReport {
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
	protected DiagnosticReportStatus status;

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
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveDateTime;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Instant issued;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performer;

	/**
	 * The cached value of the '{@link #getResultsInterpreter() <em>Results Interpreter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsInterpreter()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> resultsInterpreter;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimen;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> result;

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
	 * The cached value of the '{@link #getStudy() <em>Study</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudy()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> study;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticReportSupportingInfo> supportingInfo;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticReportMedia> media;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected Reference composition;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected Markdown conclusion;

	/**
	 * The cached value of the '{@link #getConclusionCode() <em>Conclusion Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusionCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> conclusionCode;

	/**
	 * The cached value of the '{@link #getPresentedForm() <em>Presented Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentedForm()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> presentedForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDiagnosticReport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DiagnosticReportStatus newStatus, NotificationChain msgs) {
		DiagnosticReportStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(DiagnosticReportStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DIAGNOSTIC_REPORT__CATEGORY);
		}
		return category;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDateTime(DateTime newEffectiveDateTime, NotificationChain msgs) {
		DateTime oldEffectiveDateTime = effectiveDateTime;
		effectiveDateTime = newEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDateTime(DateTime newEffectiveDateTime) {
		if (newEffectiveDateTime != effectiveDateTime) {
			NotificationChain msgs = null;
			if (effectiveDateTime != null)
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(Instant newIssued, NotificationChain msgs) {
		Instant oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__ISSUED, oldIssued, newIssued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(Instant newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getResultsInterpreter() {
		if (resultsInterpreter == null) {
			resultsInterpreter = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER);
		}
		return resultsInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.DIAGNOSTIC_REPORT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getStudy() {
		if (study == null) {
			study = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__STUDY);
		}
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticReportSupportingInfo> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<DiagnosticReportSupportingInfo>(DiagnosticReportSupportingInfo.class, this, FhirPackage.DIAGNOSTIC_REPORT__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticReportMedia> getMedia() {
		if (media == null) {
			media = new EObjectContainmentEList<DiagnosticReportMedia>(DiagnosticReportMedia.class, this, FhirPackage.DIAGNOSTIC_REPORT__MEDIA);
		}
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposition(Reference newComposition, NotificationChain msgs) {
		Reference oldComposition = composition;
		composition = newComposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__COMPOSITION, oldComposition, newComposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(Reference newComposition) {
		if (newComposition != composition) {
			NotificationChain msgs = null;
			if (composition != null)
				msgs = ((InternalEObject)composition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__COMPOSITION, null, msgs);
			if (newComposition != null)
				msgs = ((InternalEObject)newComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__COMPOSITION, null, msgs);
			msgs = basicSetComposition(newComposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__COMPOSITION, newComposition, newComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConclusion(Markdown newConclusion, NotificationChain msgs) {
		Markdown oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION, oldConclusion, newConclusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusion(Markdown newConclusion) {
		if (newConclusion != conclusion) {
			NotificationChain msgs = null;
			if (conclusion != null)
				msgs = ((InternalEObject)conclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION, null, msgs);
			if (newConclusion != null)
				msgs = ((InternalEObject)newConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION, null, msgs);
			msgs = basicSetConclusion(newConclusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION, newConclusion, newConclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getConclusionCode() {
		if (conclusionCode == null) {
			conclusionCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE);
		}
		return conclusionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPresentedForm() {
		if (presentedForm == null) {
			presentedForm = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM);
		}
		return presentedForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				return ((InternalEList<?>)getResultsInterpreter()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__STUDY:
				return ((InternalEList<?>)getStudy()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__COMPOSITION:
				return basicSetComposition(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return basicSetConclusion(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				return ((InternalEList<?>)getConclusionCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return ((InternalEList<?>)getPresentedForm()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DIAGNOSTIC_REPORT__BASED_ON:
				return getBasedOn();
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				return getStatus();
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return getCategory();
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				return getCode();
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return getSubject();
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return getEncounter();
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				return getIssued();
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return getPerformer();
			case FhirPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				return getResultsInterpreter();
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return getSpecimen();
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				return getResult();
			case FhirPackage.DIAGNOSTIC_REPORT__NOTE:
				return getNote();
			case FhirPackage.DIAGNOSTIC_REPORT__STUDY:
				return getStudy();
			case FhirPackage.DIAGNOSTIC_REPORT__SUPPORTING_INFO:
				return getSupportingInfo();
			case FhirPackage.DIAGNOSTIC_REPORT__MEDIA:
				return getMedia();
			case FhirPackage.DIAGNOSTIC_REPORT__COMPOSITION:
				return getComposition();
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return getConclusion();
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				return getConclusionCode();
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return getPresentedForm();
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
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((DiagnosticReportStatus)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				getResultsInterpreter().clear();
				getResultsInterpreter().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__STUDY:
				getStudy().clear();
				getStudy().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends DiagnosticReportSupportingInfo>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends DiagnosticReportMedia>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__COMPOSITION:
				setComposition((Reference)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((Markdown)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				getConclusionCode().clear();
				getConclusionCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForm().clear();
				getPresentedForm().addAll((Collection<? extends Attachment>)newValue);
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
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((DiagnosticReportStatus)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				getResultsInterpreter().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimen().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				getResult().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__NOTE:
				getNote().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__STUDY:
				getStudy().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__MEDIA:
				getMedia().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__COMPOSITION:
				setComposition((Reference)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((Markdown)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				getConclusionCode().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForm().clear();
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
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				return status != null;
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				return code != null;
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return subject != null;
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return encounter != null;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				return issued != null;
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				return resultsInterpreter != null && !resultsInterpreter.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				return result != null && !result.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__STUDY:
				return study != null && !study.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__MEDIA:
				return media != null && !media.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__COMPOSITION:
				return composition != null;
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return conclusion != null;
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				return conclusionCode != null && !conclusionCode.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return presentedForm != null && !presentedForm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticReportImpl
