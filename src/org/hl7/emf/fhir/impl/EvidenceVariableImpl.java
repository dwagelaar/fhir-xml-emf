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
import org.hl7.emf.fhir.Coding;
import org.hl7.emf.fhir.ContactDetail;
import org.hl7.emf.fhir.Date;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.EvidenceVariable;
import org.hl7.emf.fhir.EvidenceVariableCategory;
import org.hl7.emf.fhir.EvidenceVariableCharacteristic;
import org.hl7.emf.fhir.EvidenceVariableHandling;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.PublicationStatus;
import org.hl7.emf.fhir.RelatedArtifact;
import org.hl7.emf.fhir.Uri;
import org.hl7.emf.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getShortTitle <em>Short Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getHandling <em>Handling</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableImpl extends MetadataResourceImpl implements EvidenceVariable {
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
	 * The cached value of the '{@link #getShortTitle() <em>Short Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String shortTitle;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

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
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Markdown purpose;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * The cached value of the '{@link #getCopyrightLabel() <em>Copyright Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String copyrightLabel;

	/**
	 * The cached value of the '{@link #getApprovalDate() <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected Date approvalDate;

	/**
	 * The cached value of the '{@link #getLastReviewDate() <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastReviewDate;

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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> author;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> editor;

	/**
	 * The cached value of the '{@link #getReviewer() <em>Reviewer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewer()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> reviewer;

	/**
	 * The cached value of the '{@link #getEndorser() <em>Endorser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorser()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> endorser;

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
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean actual;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceVariableCharacteristic> characteristic;

	/**
	 * The cached value of the '{@link #getHandling() <em>Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandling()
	 * @generated
	 * @ordered
	 */
	protected EvidenceVariableHandling handling;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceVariableCategory> category;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceVariable();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.EVIDENCE_VARIABLE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_STRING, oldVersionAlgorithmString, newVersionAlgorithmString);
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
				msgs = ((InternalEObject)versionAlgorithmString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_STRING, null, msgs);
			if (newVersionAlgorithmString != null)
				msgs = ((InternalEObject)newVersionAlgorithmString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_STRING, null, msgs);
			msgs = basicSetVersionAlgorithmString(newVersionAlgorithmString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_STRING, newVersionAlgorithmString, newVersionAlgorithmString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_CODING, oldVersionAlgorithmCoding, newVersionAlgorithmCoding);
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
				msgs = ((InternalEObject)versionAlgorithmCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_CODING, null, msgs);
			if (newVersionAlgorithmCoding != null)
				msgs = ((InternalEObject)newVersionAlgorithmCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_CODING, null, msgs);
			msgs = basicSetVersionAlgorithmCoding(newVersionAlgorithmCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_CODING, newVersionAlgorithmCoding, newVersionAlgorithmCoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getShortTitle() {
		return shortTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortTitle(org.hl7.emf.fhir.String newShortTitle, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldShortTitle = shortTitle;
		shortTitle = newShortTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__SHORT_TITLE, oldShortTitle, newShortTitle);
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
	public void setShortTitle(org.hl7.emf.fhir.String newShortTitle) {
		if (newShortTitle != shortTitle) {
			NotificationChain msgs = null;
			if (shortTitle != null)
				msgs = ((InternalEObject)shortTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__SHORT_TITLE, null, msgs);
			if (newShortTitle != null)
				msgs = ((InternalEObject)newShortTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__SHORT_TITLE, null, msgs);
			msgs = basicSetShortTitle(newShortTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__SHORT_TITLE, newShortTitle, newShortTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE_VARIABLE__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.EVIDENCE_VARIABLE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.EVIDENCE_VARIABLE__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(Markdown newPurpose, NotificationChain msgs) {
		Markdown oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__PURPOSE, oldPurpose, newPurpose);
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
	public void setPurpose(Markdown newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(Markdown newCopyright, NotificationChain msgs) {
		Markdown oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT, oldCopyright, newCopyright);
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
	public void setCopyright(Markdown newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getCopyrightLabel() {
		return copyrightLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyrightLabel(org.hl7.emf.fhir.String newCopyrightLabel, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldCopyrightLabel = copyrightLabel;
		copyrightLabel = newCopyrightLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT_LABEL, oldCopyrightLabel, newCopyrightLabel);
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
	public void setCopyrightLabel(org.hl7.emf.fhir.String newCopyrightLabel) {
		if (newCopyrightLabel != copyrightLabel) {
			NotificationChain msgs = null;
			if (copyrightLabel != null)
				msgs = ((InternalEObject)copyrightLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT_LABEL, null, msgs);
			if (newCopyrightLabel != null)
				msgs = ((InternalEObject)newCopyrightLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT_LABEL, null, msgs);
			msgs = basicSetCopyrightLabel(newCopyrightLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT_LABEL, newCopyrightLabel, newCopyrightLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getApprovalDate() {
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalDate(Date newApprovalDate, NotificationChain msgs) {
		Date oldApprovalDate = approvalDate;
		approvalDate = newApprovalDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
	public void setApprovalDate(Date newApprovalDate) {
		if (newApprovalDate != approvalDate) {
			NotificationChain msgs = null;
			if (approvalDate != null)
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__APPROVAL_DATE, newApprovalDate, newApprovalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastReviewDate() {
		return lastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastReviewDate(Date newLastReviewDate, NotificationChain msgs) {
		Date oldLastReviewDate = lastReviewDate;
		lastReviewDate = newLastReviewDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
	public void setLastReviewDate(Date newLastReviewDate) {
		if (newLastReviewDate != lastReviewDate) {
			NotificationChain msgs = null;
			if (lastReviewDate != null)
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE_VARIABLE__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEditor() {
		if (editor == null) {
			editor = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE_VARIABLE__EDITOR);
		}
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getReviewer() {
		if (reviewer == null) {
			reviewer = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE_VARIABLE__REVIEWER);
		}
		return reviewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEndorser() {
		if (endorser == null) {
			endorser = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE_VARIABLE__ENDORSER);
		}
		return endorser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getRelatedArtifact() {
		if (relatedArtifact == null) {
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActual(org.hl7.emf.fhir.Boolean newActual, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldActual = actual;
		actual = newActual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__ACTUAL, oldActual, newActual);
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
	public void setActual(org.hl7.emf.fhir.Boolean newActual) {
		if (newActual != actual) {
			NotificationChain msgs = null;
			if (actual != null)
				msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__ACTUAL, null, msgs);
			if (newActual != null)
				msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__ACTUAL, null, msgs);
			msgs = basicSetActual(newActual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__ACTUAL, newActual, newActual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvidenceVariableCharacteristic> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<EvidenceVariableCharacteristic>(EvidenceVariableCharacteristic.class, this, FhirPackage.EVIDENCE_VARIABLE__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceVariableHandling getHandling() {
		return handling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandling(EvidenceVariableHandling newHandling, NotificationChain msgs) {
		EvidenceVariableHandling oldHandling = handling;
		handling = newHandling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__HANDLING, oldHandling, newHandling);
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
	public void setHandling(EvidenceVariableHandling newHandling) {
		if (newHandling != handling) {
			NotificationChain msgs = null;
			if (handling != null)
				msgs = ((InternalEObject)handling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__HANDLING, null, msgs);
			if (newHandling != null)
				msgs = ((InternalEObject)newHandling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE__HANDLING, null, msgs);
			msgs = basicSetHandling(newHandling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE__HANDLING, newHandling, newHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvidenceVariableCategory> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<EvidenceVariableCategory>(EvidenceVariableCategory.class, this, FhirPackage.EVIDENCE_VARIABLE__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_VARIABLE__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_STRING:
				return basicSetVersionAlgorithmString(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_CODING:
				return basicSetVersionAlgorithmCoding(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				return basicSetShortTitle(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT_LABEL:
				return basicSetCopyrightLabel(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__REVIEWER:
				return ((InternalEList<?>)getReviewer()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__ENDORSER:
				return ((InternalEList<?>)getEndorser()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__ACTUAL:
				return basicSetActual(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__HANDLING:
				return basicSetHandling(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EVIDENCE_VARIABLE__URL:
				return getUrl();
			case FhirPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.EVIDENCE_VARIABLE__VERSION:
				return getVersion();
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_STRING:
				return getVersionAlgorithmString();
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_CODING:
				return getVersionAlgorithmCoding();
			case FhirPackage.EVIDENCE_VARIABLE__NAME:
				return getName();
			case FhirPackage.EVIDENCE_VARIABLE__TITLE:
				return getTitle();
			case FhirPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				return getShortTitle();
			case FhirPackage.EVIDENCE_VARIABLE__STATUS:
				return getStatus();
			case FhirPackage.EVIDENCE_VARIABLE__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.EVIDENCE_VARIABLE__DATE:
				return getDate();
			case FhirPackage.EVIDENCE_VARIABLE__PUBLISHER:
				return getPublisher();
			case FhirPackage.EVIDENCE_VARIABLE__CONTACT:
				return getContact();
			case FhirPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE_VARIABLE__NOTE:
				return getNote();
			case FhirPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.EVIDENCE_VARIABLE__PURPOSE:
				return getPurpose();
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				return getCopyright();
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT_LABEL:
				return getCopyrightLabel();
			case FhirPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				return getApprovalDate();
			case FhirPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.EVIDENCE_VARIABLE__AUTHOR:
				return getAuthor();
			case FhirPackage.EVIDENCE_VARIABLE__EDITOR:
				return getEditor();
			case FhirPackage.EVIDENCE_VARIABLE__REVIEWER:
				return getReviewer();
			case FhirPackage.EVIDENCE_VARIABLE__ENDORSER:
				return getEndorser();
			case FhirPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FhirPackage.EVIDENCE_VARIABLE__ACTUAL:
				return getActual();
			case FhirPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				return getCharacteristic();
			case FhirPackage.EVIDENCE_VARIABLE__HANDLING:
				return getHandling();
			case FhirPackage.EVIDENCE_VARIABLE__CATEGORY:
				return getCategory();
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
			case FhirPackage.EVIDENCE_VARIABLE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__VERSION:
				setVersion((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__NAME:
				setName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__TITLE:
				setTitle((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				setShortTitle((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__EXPERIMENTAL:
				setExperimental((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__PUBLISHER:
				setPublisher((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__REVIEWER:
				getReviewer().clear();
				getReviewer().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__ENDORSER:
				getEndorser().clear();
				getEndorser().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__ACTUAL:
				setActual((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends EvidenceVariableCharacteristic>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__HANDLING:
				setHandling((EvidenceVariableHandling)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends EvidenceVariableCategory>)newValue);
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
			case FhirPackage.EVIDENCE_VARIABLE__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__VERSION:
				setVersion((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__NAME:
				setName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__TITLE:
				setTitle((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				setShortTitle((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__EXPERIMENTAL:
				setExperimental((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__PUBLISHER:
				setPublisher((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__EDITOR:
				getEditor().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__REVIEWER:
				getReviewer().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__ENDORSER:
				getEndorser().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__ACTUAL:
				setActual((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				getCharacteristic().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE__HANDLING:
				setHandling((EvidenceVariableHandling)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE__CATEGORY:
				getCategory().clear();
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
			case FhirPackage.EVIDENCE_VARIABLE__URL:
				return url != null;
			case FhirPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__VERSION:
				return version != null;
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_STRING:
				return versionAlgorithmString != null;
			case FhirPackage.EVIDENCE_VARIABLE__VERSION_ALGORITHM_CODING:
				return versionAlgorithmCoding != null;
			case FhirPackage.EVIDENCE_VARIABLE__NAME:
				return name != null;
			case FhirPackage.EVIDENCE_VARIABLE__TITLE:
				return title != null;
			case FhirPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				return shortTitle != null;
			case FhirPackage.EVIDENCE_VARIABLE__STATUS:
				return status != null;
			case FhirPackage.EVIDENCE_VARIABLE__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.EVIDENCE_VARIABLE__DATE:
				return date != null;
			case FhirPackage.EVIDENCE_VARIABLE__PUBLISHER:
				return publisher != null;
			case FhirPackage.EVIDENCE_VARIABLE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE_VARIABLE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__PURPOSE:
				return purpose != null;
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				return copyright != null;
			case FhirPackage.EVIDENCE_VARIABLE__COPYRIGHT_LABEL:
				return copyrightLabel != null;
			case FhirPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				return approvalDate != null;
			case FhirPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.EVIDENCE_VARIABLE__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__EDITOR:
				return editor != null && !editor.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__REVIEWER:
				return reviewer != null && !reviewer.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__ENDORSER:
				return endorser != null && !endorser.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__ACTUAL:
				return actual != null;
			case FhirPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE__HANDLING:
				return handling != null;
			case FhirPackage.EVIDENCE_VARIABLE__CATEGORY:
				return category != null && !category.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableImpl
