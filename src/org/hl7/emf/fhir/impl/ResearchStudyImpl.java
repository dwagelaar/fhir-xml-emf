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
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.PublicationStatus;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.RelatedArtifact;
import org.hl7.emf.fhir.ResearchStudy;
import org.hl7.emf.fhir.ResearchStudyAssociatedParty;
import org.hl7.emf.fhir.ResearchStudyComparisonGroup;
import org.hl7.emf.fhir.ResearchStudyLabel;
import org.hl7.emf.fhir.ResearchStudyObjective;
import org.hl7.emf.fhir.ResearchStudyOutcomeMeasure;
import org.hl7.emf.fhir.ResearchStudyProgressStatus;
import org.hl7.emf.fhir.ResearchStudyRecruitment;
import org.hl7.emf.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getPrimaryPurposeType <em>Primary Purpose Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getStudyDesign <em>Study Design</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getDescriptionSummary <em>Description Summary</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getAssociatedParty <em>Associated Party</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getProgressStatus <em>Progress Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getWhyStopped <em>Why Stopped</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getRecruitment <em>Recruitment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getComparisonGroup <em>Comparison Group</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getOutcomeMeasure <em>Outcome Measure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResearchStudyImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchStudyImpl extends DomainResourceImpl implements ResearchStudy {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String name;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String title;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyLabel> label;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> protocol;

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
	 * The cached value of the '{@link #getRelatedArtifact() <em>Related Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifact;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

	/**
	 * The cached value of the '{@link #getPrimaryPurposeType() <em>Primary Purpose Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryPurposeType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept primaryPurposeType;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept phase;

	/**
	 * The cached value of the '{@link #getStudyDesign() <em>Study Design</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDesign()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> studyDesign;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> focus;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> condition;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> keyword;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> region;

	/**
	 * The cached value of the '{@link #getDescriptionSummary() <em>Description Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionSummary()
	 * @generated
	 * @ordered
	 */
	protected Markdown descriptionSummary;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

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
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> site;

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
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classifier;

	/**
	 * The cached value of the '{@link #getAssociatedParty() <em>Associated Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedParty()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyAssociatedParty> associatedParty;

	/**
	 * The cached value of the '{@link #getProgressStatus() <em>Progress Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyProgressStatus> progressStatus;

	/**
	 * The cached value of the '{@link #getWhyStopped() <em>Why Stopped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhyStopped()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept whyStopped;

	/**
	 * The cached value of the '{@link #getRecruitment() <em>Recruitment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecruitment()
	 * @generated
	 * @ordered
	 */
	protected ResearchStudyRecruitment recruitment;

	/**
	 * The cached value of the '{@link #getComparisonGroup() <em>Comparison Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyComparisonGroup> comparisonGroup;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyObjective> objective;

	/**
	 * The cached value of the '{@link #getOutcomeMeasure() <em>Outcome Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyOutcomeMeasure> outcomeMeasure;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResearchStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__URL, oldUrl, newUrl);
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
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.RESEARCH_STUDY__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.emf.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__VERSION, oldVersion, newVersion);
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
	public void setVersion(org.hl7.emf.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.emf.fhir.String newName, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__NAME, oldName, newName);
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
	public void setName(org.hl7.emf.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.emf.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.hl7.emf.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResearchStudyLabel> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<ResearchStudyLabel>(ResearchStudyLabel.class, this, FhirPackage.RESEARCH_STUDY__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_STUDY__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_STUDY__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getRelatedArtifact() {
		if (relatedArtifact == null) {
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__STATUS, oldStatus, newStatus);
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
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPrimaryPurposeType() {
		return primaryPurposeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryPurposeType(CodeableConcept newPrimaryPurposeType, NotificationChain msgs) {
		CodeableConcept oldPrimaryPurposeType = primaryPurposeType;
		primaryPurposeType = newPrimaryPurposeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, oldPrimaryPurposeType, newPrimaryPurposeType);
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
	public void setPrimaryPurposeType(CodeableConcept newPrimaryPurposeType) {
		if (newPrimaryPurposeType != primaryPurposeType) {
			NotificationChain msgs = null;
			if (primaryPurposeType != null)
				msgs = ((InternalEObject)primaryPurposeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, null, msgs);
			if (newPrimaryPurposeType != null)
				msgs = ((InternalEObject)newPrimaryPurposeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, null, msgs);
			msgs = basicSetPrimaryPurposeType(newPrimaryPurposeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, newPrimaryPurposeType, newPrimaryPurposeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(CodeableConcept newPhase, NotificationChain msgs) {
		CodeableConcept oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PHASE, oldPhase, newPhase);
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
	public void setPhase(CodeableConcept newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null)
				msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PHASE, null, msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PHASE, null, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PHASE, newPhase, newPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getStudyDesign() {
		if (studyDesign == null) {
			studyDesign = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__STUDY_DESIGN);
		}
		return studyDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getFocus() {
		if (focus == null) {
			focus = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.RESEARCH_STUDY__FOCUS);
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getKeyword() {
		if (keyword == null) {
			keyword = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getRegion() {
		if (region == null) {
			region = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__REGION);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescriptionSummary() {
		return descriptionSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionSummary(Markdown newDescriptionSummary, NotificationChain msgs) {
		Markdown oldDescriptionSummary = descriptionSummary;
		descriptionSummary = newDescriptionSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__DESCRIPTION_SUMMARY, oldDescriptionSummary, newDescriptionSummary);
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
	public void setDescriptionSummary(Markdown newDescriptionSummary) {
		if (newDescriptionSummary != descriptionSummary) {
			NotificationChain msgs = null;
			if (descriptionSummary != null)
				msgs = ((InternalEObject)descriptionSummary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__DESCRIPTION_SUMMARY, null, msgs);
			if (newDescriptionSummary != null)
				msgs = ((InternalEObject)newDescriptionSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__DESCRIPTION_SUMMARY, null, msgs);
			msgs = basicSetDescriptionSummary(newDescriptionSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__DESCRIPTION_SUMMARY, newDescriptionSummary, newDescriptionSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSite() {
		if (site == null) {
			site = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_STUDY__SITE);
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.RESEARCH_STUDY__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__CLASSIFIER);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResearchStudyAssociatedParty> getAssociatedParty() {
		if (associatedParty == null) {
			associatedParty = new EObjectContainmentEList<ResearchStudyAssociatedParty>(ResearchStudyAssociatedParty.class, this, FhirPackage.RESEARCH_STUDY__ASSOCIATED_PARTY);
		}
		return associatedParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResearchStudyProgressStatus> getProgressStatus() {
		if (progressStatus == null) {
			progressStatus = new EObjectContainmentEList<ResearchStudyProgressStatus>(ResearchStudyProgressStatus.class, this, FhirPackage.RESEARCH_STUDY__PROGRESS_STATUS);
		}
		return progressStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getWhyStopped() {
		return whyStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhyStopped(CodeableConcept newWhyStopped, NotificationChain msgs) {
		CodeableConcept oldWhyStopped = whyStopped;
		whyStopped = newWhyStopped;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__WHY_STOPPED, oldWhyStopped, newWhyStopped);
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
	public void setWhyStopped(CodeableConcept newWhyStopped) {
		if (newWhyStopped != whyStopped) {
			NotificationChain msgs = null;
			if (whyStopped != null)
				msgs = ((InternalEObject)whyStopped).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__WHY_STOPPED, null, msgs);
			if (newWhyStopped != null)
				msgs = ((InternalEObject)newWhyStopped).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__WHY_STOPPED, null, msgs);
			msgs = basicSetWhyStopped(newWhyStopped, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__WHY_STOPPED, newWhyStopped, newWhyStopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudyRecruitment getRecruitment() {
		return recruitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecruitment(ResearchStudyRecruitment newRecruitment, NotificationChain msgs) {
		ResearchStudyRecruitment oldRecruitment = recruitment;
		recruitment = newRecruitment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__RECRUITMENT, oldRecruitment, newRecruitment);
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
	public void setRecruitment(ResearchStudyRecruitment newRecruitment) {
		if (newRecruitment != recruitment) {
			NotificationChain msgs = null;
			if (recruitment != null)
				msgs = ((InternalEObject)recruitment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__RECRUITMENT, null, msgs);
			if (newRecruitment != null)
				msgs = ((InternalEObject)newRecruitment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__RECRUITMENT, null, msgs);
			msgs = basicSetRecruitment(newRecruitment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__RECRUITMENT, newRecruitment, newRecruitment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResearchStudyComparisonGroup> getComparisonGroup() {
		if (comparisonGroup == null) {
			comparisonGroup = new EObjectContainmentEList<ResearchStudyComparisonGroup>(ResearchStudyComparisonGroup.class, this, FhirPackage.RESEARCH_STUDY__COMPARISON_GROUP);
		}
		return comparisonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResearchStudyObjective> getObjective() {
		if (objective == null) {
			objective = new EObjectContainmentEList<ResearchStudyObjective>(ResearchStudyObjective.class, this, FhirPackage.RESEARCH_STUDY__OBJECTIVE);
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResearchStudyOutcomeMeasure> getOutcomeMeasure() {
		if (outcomeMeasure == null) {
			outcomeMeasure = new EObjectContainmentEList<ResearchStudyOutcomeMeasure>(ResearchStudyOutcomeMeasure.class, this, FhirPackage.RESEARCH_STUDY__OUTCOME_MEASURE);
		}
		return outcomeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_STUDY__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESEARCH_STUDY__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.RESEARCH_STUDY__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.RESEARCH_STUDY__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.RESEARCH_STUDY__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.RESEARCH_STUDY__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				return basicSetPrimaryPurposeType(null, msgs);
			case FhirPackage.RESEARCH_STUDY__PHASE:
				return basicSetPhase(null, msgs);
			case FhirPackage.RESEARCH_STUDY__STUDY_DESIGN:
				return ((InternalEList<?>)getStudyDesign()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				return ((InternalEList<?>)getFocus()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				return ((InternalEList<?>)getKeyword()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION_SUMMARY:
				return basicSetDescriptionSummary(null, msgs);
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.RESEARCH_STUDY__SITE:
				return ((InternalEList<?>)getSite()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__ASSOCIATED_PARTY:
				return ((InternalEList<?>)getAssociatedParty()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__PROGRESS_STATUS:
				return ((InternalEList<?>)getProgressStatus()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__WHY_STOPPED:
				return basicSetWhyStopped(null, msgs);
			case FhirPackage.RESEARCH_STUDY__RECRUITMENT:
				return basicSetRecruitment(null, msgs);
			case FhirPackage.RESEARCH_STUDY__COMPARISON_GROUP:
				return ((InternalEList<?>)getComparisonGroup()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				return ((InternalEList<?>)getObjective()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__OUTCOME_MEASURE:
				return ((InternalEList<?>)getOutcomeMeasure()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.RESEARCH_STUDY__URL:
				return getUrl();
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.RESEARCH_STUDY__VERSION:
				return getVersion();
			case FhirPackage.RESEARCH_STUDY__NAME:
				return getName();
			case FhirPackage.RESEARCH_STUDY__TITLE:
				return getTitle();
			case FhirPackage.RESEARCH_STUDY__LABEL:
				return getLabel();
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				return getProtocol();
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				return getPartOf();
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FhirPackage.RESEARCH_STUDY__DATE:
				return getDate();
			case FhirPackage.RESEARCH_STUDY__STATUS:
				return getStatus();
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				return getPrimaryPurposeType();
			case FhirPackage.RESEARCH_STUDY__PHASE:
				return getPhase();
			case FhirPackage.RESEARCH_STUDY__STUDY_DESIGN:
				return getStudyDesign();
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				return getFocus();
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				return getCondition();
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				return getKeyword();
			case FhirPackage.RESEARCH_STUDY__REGION:
				return getRegion();
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION_SUMMARY:
				return getDescriptionSummary();
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				return getDescription();
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				return getPeriod();
			case FhirPackage.RESEARCH_STUDY__SITE:
				return getSite();
			case FhirPackage.RESEARCH_STUDY__NOTE:
				return getNote();
			case FhirPackage.RESEARCH_STUDY__CLASSIFIER:
				return getClassifier();
			case FhirPackage.RESEARCH_STUDY__ASSOCIATED_PARTY:
				return getAssociatedParty();
			case FhirPackage.RESEARCH_STUDY__PROGRESS_STATUS:
				return getProgressStatus();
			case FhirPackage.RESEARCH_STUDY__WHY_STOPPED:
				return getWhyStopped();
			case FhirPackage.RESEARCH_STUDY__RECRUITMENT:
				return getRecruitment();
			case FhirPackage.RESEARCH_STUDY__COMPARISON_GROUP:
				return getComparisonGroup();
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				return getObjective();
			case FhirPackage.RESEARCH_STUDY__OUTCOME_MEASURE:
				return getOutcomeMeasure();
			case FhirPackage.RESEARCH_STUDY__RESULT:
				return getResult();
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
			case FhirPackage.RESEARCH_STUDY__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__VERSION:
				setVersion((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__NAME:
				setName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__TITLE:
				setTitle((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends ResearchStudyLabel>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				setPrimaryPurposeType((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PHASE:
				setPhase((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__STUDY_DESIGN:
				getStudyDesign().clear();
				getStudyDesign().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				getFocus().clear();
				getFocus().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION_SUMMARY:
				setDescriptionSummary((Markdown)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__SITE:
				getSite().clear();
				getSite().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__ASSOCIATED_PARTY:
				getAssociatedParty().clear();
				getAssociatedParty().addAll((Collection<? extends ResearchStudyAssociatedParty>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PROGRESS_STATUS:
				getProgressStatus().clear();
				getProgressStatus().addAll((Collection<? extends ResearchStudyProgressStatus>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__WHY_STOPPED:
				setWhyStopped((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__RECRUITMENT:
				setRecruitment((ResearchStudyRecruitment)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__COMPARISON_GROUP:
				getComparisonGroup().clear();
				getComparisonGroup().addAll((Collection<? extends ResearchStudyComparisonGroup>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				getObjective().clear();
				getObjective().addAll((Collection<? extends ResearchStudyObjective>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__OUTCOME_MEASURE:
				getOutcomeMeasure().clear();
				getOutcomeMeasure().addAll((Collection<? extends ResearchStudyOutcomeMeasure>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.RESEARCH_STUDY__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__VERSION:
				setVersion((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.RESEARCH_STUDY__NAME:
				setName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.RESEARCH_STUDY__TITLE:
				setTitle((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.RESEARCH_STUDY__LABEL:
				getLabel().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				getProtocol().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.RESEARCH_STUDY__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				setPrimaryPurposeType((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_STUDY__PHASE:
				setPhase((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_STUDY__STUDY_DESIGN:
				getStudyDesign().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				getFocus().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				getCondition().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				getKeyword().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__REGION:
				getRegion().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION_SUMMARY:
				setDescriptionSummary((Markdown)null);
				return;
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.RESEARCH_STUDY__SITE:
				getSite().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__NOTE:
				getNote().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__CLASSIFIER:
				getClassifier().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__ASSOCIATED_PARTY:
				getAssociatedParty().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__PROGRESS_STATUS:
				getProgressStatus().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__WHY_STOPPED:
				setWhyStopped((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_STUDY__RECRUITMENT:
				setRecruitment((ResearchStudyRecruitment)null);
				return;
			case FhirPackage.RESEARCH_STUDY__COMPARISON_GROUP:
				getComparisonGroup().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				getObjective().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__OUTCOME_MEASURE:
				getOutcomeMeasure().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__RESULT:
				getResult().clear();
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
			case FhirPackage.RESEARCH_STUDY__URL:
				return url != null;
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.RESEARCH_STUDY__VERSION:
				return version != null;
			case FhirPackage.RESEARCH_STUDY__NAME:
				return name != null;
			case FhirPackage.RESEARCH_STUDY__TITLE:
				return title != null;
			case FhirPackage.RESEARCH_STUDY__LABEL:
				return label != null && !label.isEmpty();
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				return protocol != null && !protocol.isEmpty();
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FhirPackage.RESEARCH_STUDY__DATE:
				return date != null;
			case FhirPackage.RESEARCH_STUDY__STATUS:
				return status != null;
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				return primaryPurposeType != null;
			case FhirPackage.RESEARCH_STUDY__PHASE:
				return phase != null;
			case FhirPackage.RESEARCH_STUDY__STUDY_DESIGN:
				return studyDesign != null && !studyDesign.isEmpty();
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				return focus != null && !focus.isEmpty();
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				return condition != null && !condition.isEmpty();
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case FhirPackage.RESEARCH_STUDY__REGION:
				return region != null && !region.isEmpty();
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION_SUMMARY:
				return descriptionSummary != null;
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				return description != null;
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				return period != null;
			case FhirPackage.RESEARCH_STUDY__SITE:
				return site != null && !site.isEmpty();
			case FhirPackage.RESEARCH_STUDY__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.RESEARCH_STUDY__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
			case FhirPackage.RESEARCH_STUDY__ASSOCIATED_PARTY:
				return associatedParty != null && !associatedParty.isEmpty();
			case FhirPackage.RESEARCH_STUDY__PROGRESS_STATUS:
				return progressStatus != null && !progressStatus.isEmpty();
			case FhirPackage.RESEARCH_STUDY__WHY_STOPPED:
				return whyStopped != null;
			case FhirPackage.RESEARCH_STUDY__RECRUITMENT:
				return recruitment != null;
			case FhirPackage.RESEARCH_STUDY__COMPARISON_GROUP:
				return comparisonGroup != null && !comparisonGroup.isEmpty();
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				return objective != null && !objective.isEmpty();
			case FhirPackage.RESEARCH_STUDY__OUTCOME_MEASURE:
				return outcomeMeasure != null && !outcomeMeasure.isEmpty();
			case FhirPackage.RESEARCH_STUDY__RESULT:
				return result != null && !result.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResearchStudyImpl
