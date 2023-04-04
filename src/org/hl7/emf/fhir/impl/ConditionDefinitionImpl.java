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

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.Coding;
import org.hl7.emf.fhir.ConditionDefinition;
import org.hl7.emf.fhir.ConditionDefinitionMedication;
import org.hl7.emf.fhir.ConditionDefinitionObservation;
import org.hl7.emf.fhir.ConditionDefinitionPlan;
import org.hl7.emf.fhir.ConditionDefinitionPrecondition;
import org.hl7.emf.fhir.ConditionDefinitionQuestionnaire;
import org.hl7.emf.fhir.ContactDetail;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.PublicationStatus;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.Uri;
import org.hl7.emf.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getHasSeverity <em>Has Severity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getHasBodySite <em>Has Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getHasStage <em>Has Stage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConditionDefinitionImpl#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionDefinitionImpl extends MetadataResourceImpl implements ConditionDefinition {
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
	 * The cached value of the '{@link #getVersionAlgorithmString() <em>Version Algorithm String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAlgorithmString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String versionAlgorithmString;

	/**
	 * The cached value of the '{@link #getVersionAlgorithmCoding() <em>Version Algorithm Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAlgorithmCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding versionAlgorithmCoding;

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
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String subtitle;

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
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean experimental;

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
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> contact;

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
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContext;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdiction;

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
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept severity;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept stage;

	/**
	 * The cached value of the '{@link #getHasSeverity() <em>Has Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSeverity()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean hasSeverity;

	/**
	 * The cached value of the '{@link #getHasBodySite() <em>Has Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBodySite()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean hasBodySite;

	/**
	 * The cached value of the '{@link #getHasStage() <em>Has Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean hasStage;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> definition;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionDefinitionObservation> observation;

	/**
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionDefinitionMedication> medication;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionDefinitionPrecondition> precondition;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> team;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionDefinitionQuestionnaire> questionnaire;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionDefinitionPlan> plan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConditionDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CONDITION_DEFINITION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getVersionAlgorithmString() {
		return versionAlgorithmString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionAlgorithmString(org.hl7.emf.fhir.String newVersionAlgorithmString, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldVersionAlgorithmString = versionAlgorithmString;
		versionAlgorithmString = newVersionAlgorithmString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_STRING, oldVersionAlgorithmString, newVersionAlgorithmString);
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
	public void setVersionAlgorithmString(org.hl7.emf.fhir.String newVersionAlgorithmString) {
		if (newVersionAlgorithmString != versionAlgorithmString) {
			NotificationChain msgs = null;
			if (versionAlgorithmString != null)
				msgs = ((InternalEObject)versionAlgorithmString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_STRING, null, msgs);
			if (newVersionAlgorithmString != null)
				msgs = ((InternalEObject)newVersionAlgorithmString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_STRING, null, msgs);
			msgs = basicSetVersionAlgorithmString(newVersionAlgorithmString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_STRING, newVersionAlgorithmString, newVersionAlgorithmString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getVersionAlgorithmCoding() {
		return versionAlgorithmCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionAlgorithmCoding(Coding newVersionAlgorithmCoding, NotificationChain msgs) {
		Coding oldVersionAlgorithmCoding = versionAlgorithmCoding;
		versionAlgorithmCoding = newVersionAlgorithmCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_CODING, oldVersionAlgorithmCoding, newVersionAlgorithmCoding);
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
	public void setVersionAlgorithmCoding(Coding newVersionAlgorithmCoding) {
		if (newVersionAlgorithmCoding != versionAlgorithmCoding) {
			NotificationChain msgs = null;
			if (versionAlgorithmCoding != null)
				msgs = ((InternalEObject)versionAlgorithmCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_CODING, null, msgs);
			if (newVersionAlgorithmCoding != null)
				msgs = ((InternalEObject)newVersionAlgorithmCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_CODING, null, msgs);
			msgs = basicSetVersionAlgorithmCoding(newVersionAlgorithmCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_CODING, newVersionAlgorithmCoding, newVersionAlgorithmCoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(org.hl7.emf.fhir.String newSubtitle, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__SUBTITLE, oldSubtitle, newSubtitle);
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
	public void setSubtitle(org.hl7.emf.fhir.String newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__SUBTITLE, newSubtitle, newSubtitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.emf.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
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
	public void setExperimental(org.hl7.emf.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.emf.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
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
	public void setPublisher(org.hl7.emf.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.CONDITION_DEFINITION__CONTACT);
		}
		return contact;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.CONDITION_DEFINITION__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getJurisdiction() {
		if (jurisdiction == null) {
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONDITION_DEFINITION__JURISDICTION);
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(CodeableConcept newSeverity, NotificationChain msgs) {
		CodeableConcept oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__SEVERITY, oldSeverity, newSeverity);
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
	public void setSeverity(CodeableConcept newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__BODY_SITE, oldBodySite, newBodySite);
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
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(CodeableConcept newStage, NotificationChain msgs) {
		CodeableConcept oldStage = stage;
		stage = newStage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__STAGE, oldStage, newStage);
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
	public void setStage(CodeableConcept newStage) {
		if (newStage != stage) {
			NotificationChain msgs = null;
			if (stage != null)
				msgs = ((InternalEObject)stage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__STAGE, null, msgs);
			if (newStage != null)
				msgs = ((InternalEObject)newStage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__STAGE, null, msgs);
			msgs = basicSetStage(newStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__STAGE, newStage, newStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getHasSeverity() {
		return hasSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSeverity(org.hl7.emf.fhir.Boolean newHasSeverity, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldHasSeverity = hasSeverity;
		hasSeverity = newHasSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__HAS_SEVERITY, oldHasSeverity, newHasSeverity);
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
	public void setHasSeverity(org.hl7.emf.fhir.Boolean newHasSeverity) {
		if (newHasSeverity != hasSeverity) {
			NotificationChain msgs = null;
			if (hasSeverity != null)
				msgs = ((InternalEObject)hasSeverity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__HAS_SEVERITY, null, msgs);
			if (newHasSeverity != null)
				msgs = ((InternalEObject)newHasSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__HAS_SEVERITY, null, msgs);
			msgs = basicSetHasSeverity(newHasSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__HAS_SEVERITY, newHasSeverity, newHasSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getHasBodySite() {
		return hasBodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasBodySite(org.hl7.emf.fhir.Boolean newHasBodySite, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldHasBodySite = hasBodySite;
		hasBodySite = newHasBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__HAS_BODY_SITE, oldHasBodySite, newHasBodySite);
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
	public void setHasBodySite(org.hl7.emf.fhir.Boolean newHasBodySite) {
		if (newHasBodySite != hasBodySite) {
			NotificationChain msgs = null;
			if (hasBodySite != null)
				msgs = ((InternalEObject)hasBodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__HAS_BODY_SITE, null, msgs);
			if (newHasBodySite != null)
				msgs = ((InternalEObject)newHasBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__HAS_BODY_SITE, null, msgs);
			msgs = basicSetHasBodySite(newHasBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__HAS_BODY_SITE, newHasBodySite, newHasBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getHasStage() {
		return hasStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasStage(org.hl7.emf.fhir.Boolean newHasStage, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldHasStage = hasStage;
		hasStage = newHasStage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__HAS_STAGE, oldHasStage, newHasStage);
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
	public void setHasStage(org.hl7.emf.fhir.Boolean newHasStage) {
		if (newHasStage != hasStage) {
			NotificationChain msgs = null;
			if (hasStage != null)
				msgs = ((InternalEObject)hasStage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__HAS_STAGE, null, msgs);
			if (newHasStage != null)
				msgs = ((InternalEObject)newHasStage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_DEFINITION__HAS_STAGE, null, msgs);
			msgs = basicSetHasStage(newHasStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_DEFINITION__HAS_STAGE, newHasStage, newHasStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.CONDITION_DEFINITION__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionDefinitionObservation> getObservation() {
		if (observation == null) {
			observation = new EObjectContainmentEList<ConditionDefinitionObservation>(ConditionDefinitionObservation.class, this, FhirPackage.CONDITION_DEFINITION__OBSERVATION);
		}
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionDefinitionMedication> getMedication() {
		if (medication == null) {
			medication = new EObjectContainmentEList<ConditionDefinitionMedication>(ConditionDefinitionMedication.class, this, FhirPackage.CONDITION_DEFINITION__MEDICATION);
		}
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionDefinitionPrecondition> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<ConditionDefinitionPrecondition>(ConditionDefinitionPrecondition.class, this, FhirPackage.CONDITION_DEFINITION__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getTeam() {
		if (team == null) {
			team = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONDITION_DEFINITION__TEAM);
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionDefinitionQuestionnaire> getQuestionnaire() {
		if (questionnaire == null) {
			questionnaire = new EObjectContainmentEList<ConditionDefinitionQuestionnaire>(ConditionDefinitionQuestionnaire.class, this, FhirPackage.CONDITION_DEFINITION__QUESTIONNAIRE);
		}
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionDefinitionPlan> getPlan() {
		if (plan == null) {
			plan = new EObjectContainmentEList<ConditionDefinitionPlan>(ConditionDefinitionPlan.class, this, FhirPackage.CONDITION_DEFINITION__PLAN);
		}
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONDITION_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_STRING:
				return basicSetVersionAlgorithmString(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_CODING:
				return basicSetVersionAlgorithmCoding(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__SEVERITY:
				return basicSetSeverity(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__STAGE:
				return basicSetStage(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__HAS_SEVERITY:
				return basicSetHasSeverity(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__HAS_BODY_SITE:
				return basicSetHasBodySite(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__HAS_STAGE:
				return basicSetHasStage(null, msgs);
			case FhirPackage.CONDITION_DEFINITION__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__OBSERVATION:
				return ((InternalEList<?>)getObservation()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__MEDICATION:
				return ((InternalEList<?>)getMedication()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__PRECONDITION:
				return ((InternalEList<?>)getPrecondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__TEAM:
				return ((InternalEList<?>)getTeam()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__QUESTIONNAIRE:
				return ((InternalEList<?>)getQuestionnaire()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION_DEFINITION__PLAN:
				return ((InternalEList<?>)getPlan()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONDITION_DEFINITION__URL:
				return getUrl();
			case FhirPackage.CONDITION_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONDITION_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_STRING:
				return getVersionAlgorithmString();
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_CODING:
				return getVersionAlgorithmCoding();
			case FhirPackage.CONDITION_DEFINITION__NAME:
				return getName();
			case FhirPackage.CONDITION_DEFINITION__TITLE:
				return getTitle();
			case FhirPackage.CONDITION_DEFINITION__SUBTITLE:
				return getSubtitle();
			case FhirPackage.CONDITION_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.CONDITION_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.CONDITION_DEFINITION__DATE:
				return getDate();
			case FhirPackage.CONDITION_DEFINITION__PUBLISHER:
				return getPublisher();
			case FhirPackage.CONDITION_DEFINITION__CONTACT:
				return getContact();
			case FhirPackage.CONDITION_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.CONDITION_DEFINITION__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.CONDITION_DEFINITION__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.CONDITION_DEFINITION__CODE:
				return getCode();
			case FhirPackage.CONDITION_DEFINITION__SEVERITY:
				return getSeverity();
			case FhirPackage.CONDITION_DEFINITION__BODY_SITE:
				return getBodySite();
			case FhirPackage.CONDITION_DEFINITION__STAGE:
				return getStage();
			case FhirPackage.CONDITION_DEFINITION__HAS_SEVERITY:
				return getHasSeverity();
			case FhirPackage.CONDITION_DEFINITION__HAS_BODY_SITE:
				return getHasBodySite();
			case FhirPackage.CONDITION_DEFINITION__HAS_STAGE:
				return getHasStage();
			case FhirPackage.CONDITION_DEFINITION__DEFINITION:
				return getDefinition();
			case FhirPackage.CONDITION_DEFINITION__OBSERVATION:
				return getObservation();
			case FhirPackage.CONDITION_DEFINITION__MEDICATION:
				return getMedication();
			case FhirPackage.CONDITION_DEFINITION__PRECONDITION:
				return getPrecondition();
			case FhirPackage.CONDITION_DEFINITION__TEAM:
				return getTeam();
			case FhirPackage.CONDITION_DEFINITION__QUESTIONNAIRE:
				return getQuestionnaire();
			case FhirPackage.CONDITION_DEFINITION__PLAN:
				return getPlan();
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
			case FhirPackage.CONDITION_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__VERSION:
				setVersion((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__NAME:
				setName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__TITLE:
				setTitle((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__SUBTITLE:
				setSubtitle((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__SEVERITY:
				setSeverity((CodeableConcept)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__STAGE:
				setStage((CodeableConcept)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__HAS_SEVERITY:
				setHasSeverity((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__HAS_BODY_SITE:
				setHasBodySite((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__HAS_STAGE:
				setHasStage((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__OBSERVATION:
				getObservation().clear();
				getObservation().addAll((Collection<? extends ConditionDefinitionObservation>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__MEDICATION:
				getMedication().clear();
				getMedication().addAll((Collection<? extends ConditionDefinitionMedication>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends ConditionDefinitionPrecondition>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__TEAM:
				getTeam().clear();
				getTeam().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__QUESTIONNAIRE:
				getQuestionnaire().clear();
				getQuestionnaire().addAll((Collection<? extends ConditionDefinitionQuestionnaire>)newValue);
				return;
			case FhirPackage.CONDITION_DEFINITION__PLAN:
				getPlan().clear();
				getPlan().addAll((Collection<? extends ConditionDefinitionPlan>)newValue);
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
			case FhirPackage.CONDITION_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__VERSION:
				setVersion((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__NAME:
				setName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__TITLE:
				setTitle((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__SUBTITLE:
				setSubtitle((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__SEVERITY:
				setSeverity((CodeableConcept)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__STAGE:
				setStage((CodeableConcept)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__HAS_SEVERITY:
				setHasSeverity((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__HAS_BODY_SITE:
				setHasBodySite((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__HAS_STAGE:
				setHasStage((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.CONDITION_DEFINITION__DEFINITION:
				getDefinition().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__OBSERVATION:
				getObservation().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__MEDICATION:
				getMedication().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__PRECONDITION:
				getPrecondition().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__TEAM:
				getTeam().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__QUESTIONNAIRE:
				getQuestionnaire().clear();
				return;
			case FhirPackage.CONDITION_DEFINITION__PLAN:
				getPlan().clear();
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
			case FhirPackage.CONDITION_DEFINITION__URL:
				return url != null;
			case FhirPackage.CONDITION_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__VERSION:
				return version != null;
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_STRING:
				return versionAlgorithmString != null;
			case FhirPackage.CONDITION_DEFINITION__VERSION_ALGORITHM_CODING:
				return versionAlgorithmCoding != null;
			case FhirPackage.CONDITION_DEFINITION__NAME:
				return name != null;
			case FhirPackage.CONDITION_DEFINITION__TITLE:
				return title != null;
			case FhirPackage.CONDITION_DEFINITION__SUBTITLE:
				return subtitle != null;
			case FhirPackage.CONDITION_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.CONDITION_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.CONDITION_DEFINITION__DATE:
				return date != null;
			case FhirPackage.CONDITION_DEFINITION__PUBLISHER:
				return publisher != null;
			case FhirPackage.CONDITION_DEFINITION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.CONDITION_DEFINITION__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__CODE:
				return code != null;
			case FhirPackage.CONDITION_DEFINITION__SEVERITY:
				return severity != null;
			case FhirPackage.CONDITION_DEFINITION__BODY_SITE:
				return bodySite != null;
			case FhirPackage.CONDITION_DEFINITION__STAGE:
				return stage != null;
			case FhirPackage.CONDITION_DEFINITION__HAS_SEVERITY:
				return hasSeverity != null;
			case FhirPackage.CONDITION_DEFINITION__HAS_BODY_SITE:
				return hasBodySite != null;
			case FhirPackage.CONDITION_DEFINITION__HAS_STAGE:
				return hasStage != null;
			case FhirPackage.CONDITION_DEFINITION__DEFINITION:
				return definition != null && !definition.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__OBSERVATION:
				return observation != null && !observation.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__MEDICATION:
				return medication != null && !medication.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__TEAM:
				return team != null && !team.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__QUESTIONNAIRE:
				return questionnaire != null && !questionnaire.isEmpty();
			case FhirPackage.CONDITION_DEFINITION__PLAN:
				return plan != null && !plan.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionDefinitionImpl
