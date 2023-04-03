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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Period;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.SubscriptionTopic;
import org.hl7.fhir.SubscriptionTopicCanFilterBy;
import org.hl7.fhir.SubscriptionTopicEventTrigger;
import org.hl7.fhir.SubscriptionTopicNotificationShape;
import org.hl7.fhir.SubscriptionTopicResourceTrigger;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getResourceTrigger <em>Resource Trigger</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getEventTrigger <em>Event Trigger</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getCanFilterBy <em>Can Filter By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicImpl#getNotificationShape <em>Notification Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionTopicImpl extends CanonicalResourceImpl implements SubscriptionTopic {
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
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getVersionAlgorithmString() <em>Version Algorithm String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAlgorithmString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String versionAlgorithmString;

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
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> derivedFrom;

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
	protected org.hl7.fhir.Boolean experimental;

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
	protected org.hl7.fhir.String publisher;

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
	protected org.hl7.fhir.String copyrightLabel;

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
	 * The cached value of the '{@link #getResourceTrigger() <em>Resource Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscriptionTopicResourceTrigger> resourceTrigger;

	/**
	 * The cached value of the '{@link #getEventTrigger() <em>Event Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscriptionTopicEventTrigger> eventTrigger;

	/**
	 * The cached value of the '{@link #getCanFilterBy() <em>Can Filter By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanFilterBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscriptionTopicCanFilterBy> canFilterBy;

	/**
	 * The cached value of the '{@link #getNotificationShape() <em>Notification Shape</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationShape()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscriptionTopicNotificationShape> notificationShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionTopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubscriptionTopic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SUBSCRIPTION_TOPIC__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersionAlgorithmString() {
		return versionAlgorithmString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionAlgorithmString(org.hl7.fhir.String newVersionAlgorithmString, NotificationChain msgs) {
		org.hl7.fhir.String oldVersionAlgorithmString = versionAlgorithmString;
		versionAlgorithmString = newVersionAlgorithmString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_STRING, oldVersionAlgorithmString, newVersionAlgorithmString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionAlgorithmString(org.hl7.fhir.String newVersionAlgorithmString) {
		if (newVersionAlgorithmString != versionAlgorithmString) {
			NotificationChain msgs = null;
			if (versionAlgorithmString != null)
				msgs = ((InternalEObject)versionAlgorithmString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_STRING, null, msgs);
			if (newVersionAlgorithmString != null)
				msgs = ((InternalEObject)newVersionAlgorithmString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_STRING, null, msgs);
			msgs = basicSetVersionAlgorithmString(newVersionAlgorithmString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_STRING, newVersionAlgorithmString, newVersionAlgorithmString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_CODING, oldVersionAlgorithmCoding, newVersionAlgorithmCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionAlgorithmCoding(Coding newVersionAlgorithmCoding) {
		if (newVersionAlgorithmCoding != versionAlgorithmCoding) {
			NotificationChain msgs = null;
			if (versionAlgorithmCoding != null)
				msgs = ((InternalEObject)versionAlgorithmCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_CODING, null, msgs);
			if (newVersionAlgorithmCoding != null)
				msgs = ((InternalEObject)newVersionAlgorithmCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_CODING, null, msgs);
			msgs = basicSetVersionAlgorithmCoding(newVersionAlgorithmCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_CODING, newVersionAlgorithmCoding, newVersionAlgorithmCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Canonical> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.SUBSCRIPTION_TOPIC__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__EXPERIMENTAL, oldExperimental, newExperimental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(org.hl7.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.SUBSCRIPTION_TOPIC__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.SUBSCRIPTION_TOPIC__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdiction() {
		if (jurisdiction == null) {
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSCRIPTION_TOPIC__JURISDICTION);
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(Markdown newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(Markdown newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCopyrightLabel() {
		return copyrightLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyrightLabel(org.hl7.fhir.String newCopyrightLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldCopyrightLabel = copyrightLabel;
		copyrightLabel = newCopyrightLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT_LABEL, oldCopyrightLabel, newCopyrightLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyrightLabel(org.hl7.fhir.String newCopyrightLabel) {
		if (newCopyrightLabel != copyrightLabel) {
			NotificationChain msgs = null;
			if (copyrightLabel != null)
				msgs = ((InternalEObject)copyrightLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT_LABEL, null, msgs);
			if (newCopyrightLabel != null)
				msgs = ((InternalEObject)newCopyrightLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT_LABEL, null, msgs);
			msgs = basicSetCopyrightLabel(newCopyrightLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT_LABEL, newCopyrightLabel, newCopyrightLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalDate(Date newApprovalDate) {
		if (newApprovalDate != approvalDate) {
			NotificationChain msgs = null;
			if (approvalDate != null)
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__APPROVAL_DATE, newApprovalDate, newApprovalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastReviewDate(Date newLastReviewDate) {
		if (newLastReviewDate != lastReviewDate) {
			NotificationChain msgs = null;
			if (lastReviewDate != null)
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_TOPIC__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_TOPIC__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubscriptionTopicResourceTrigger> getResourceTrigger() {
		if (resourceTrigger == null) {
			resourceTrigger = new EObjectContainmentEList<SubscriptionTopicResourceTrigger>(SubscriptionTopicResourceTrigger.class, this, FhirPackage.SUBSCRIPTION_TOPIC__RESOURCE_TRIGGER);
		}
		return resourceTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubscriptionTopicEventTrigger> getEventTrigger() {
		if (eventTrigger == null) {
			eventTrigger = new EObjectContainmentEList<SubscriptionTopicEventTrigger>(SubscriptionTopicEventTrigger.class, this, FhirPackage.SUBSCRIPTION_TOPIC__EVENT_TRIGGER);
		}
		return eventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubscriptionTopicCanFilterBy> getCanFilterBy() {
		if (canFilterBy == null) {
			canFilterBy = new EObjectContainmentEList<SubscriptionTopicCanFilterBy>(SubscriptionTopicCanFilterBy.class, this, FhirPackage.SUBSCRIPTION_TOPIC__CAN_FILTER_BY);
		}
		return canFilterBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubscriptionTopicNotificationShape> getNotificationShape() {
		if (notificationShape == null) {
			notificationShape = new EObjectContainmentEList<SubscriptionTopicNotificationShape>(SubscriptionTopicNotificationShape.class, this, FhirPackage.SUBSCRIPTION_TOPIC__NOTIFICATION_SHAPE);
		}
		return notificationShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_TOPIC__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_STRING:
				return basicSetVersionAlgorithmString(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_CODING:
				return basicSetVersionAlgorithmCoding(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT_LABEL:
				return basicSetCopyrightLabel(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__RESOURCE_TRIGGER:
				return ((InternalEList<?>)getResourceTrigger()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__EVENT_TRIGGER:
				return ((InternalEList<?>)getEventTrigger()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__CAN_FILTER_BY:
				return ((InternalEList<?>)getCanFilterBy()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION_TOPIC__NOTIFICATION_SHAPE:
				return ((InternalEList<?>)getNotificationShape()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSCRIPTION_TOPIC__URL:
				return getUrl();
			case FhirPackage.SUBSCRIPTION_TOPIC__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION:
				return getVersion();
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_STRING:
				return getVersionAlgorithmString();
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_CODING:
				return getVersionAlgorithmCoding();
			case FhirPackage.SUBSCRIPTION_TOPIC__NAME:
				return getName();
			case FhirPackage.SUBSCRIPTION_TOPIC__TITLE:
				return getTitle();
			case FhirPackage.SUBSCRIPTION_TOPIC__DERIVED_FROM:
				return getDerivedFrom();
			case FhirPackage.SUBSCRIPTION_TOPIC__STATUS:
				return getStatus();
			case FhirPackage.SUBSCRIPTION_TOPIC__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.SUBSCRIPTION_TOPIC__DATE:
				return getDate();
			case FhirPackage.SUBSCRIPTION_TOPIC__PUBLISHER:
				return getPublisher();
			case FhirPackage.SUBSCRIPTION_TOPIC__CONTACT:
				return getContact();
			case FhirPackage.SUBSCRIPTION_TOPIC__DESCRIPTION:
				return getDescription();
			case FhirPackage.SUBSCRIPTION_TOPIC__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.SUBSCRIPTION_TOPIC__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.SUBSCRIPTION_TOPIC__PURPOSE:
				return getPurpose();
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT:
				return getCopyright();
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT_LABEL:
				return getCopyrightLabel();
			case FhirPackage.SUBSCRIPTION_TOPIC__APPROVAL_DATE:
				return getApprovalDate();
			case FhirPackage.SUBSCRIPTION_TOPIC__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.SUBSCRIPTION_TOPIC__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.SUBSCRIPTION_TOPIC__RESOURCE_TRIGGER:
				return getResourceTrigger();
			case FhirPackage.SUBSCRIPTION_TOPIC__EVENT_TRIGGER:
				return getEventTrigger();
			case FhirPackage.SUBSCRIPTION_TOPIC__CAN_FILTER_BY:
				return getCanFilterBy();
			case FhirPackage.SUBSCRIPTION_TOPIC__NOTIFICATION_SHAPE:
				return getNotificationShape();
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
			case FhirPackage.SUBSCRIPTION_TOPIC__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__RESOURCE_TRIGGER:
				getResourceTrigger().clear();
				getResourceTrigger().addAll((Collection<? extends SubscriptionTopicResourceTrigger>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__EVENT_TRIGGER:
				getEventTrigger().clear();
				getEventTrigger().addAll((Collection<? extends SubscriptionTopicEventTrigger>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__CAN_FILTER_BY:
				getCanFilterBy().clear();
				getCanFilterBy().addAll((Collection<? extends SubscriptionTopicCanFilterBy>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__NOTIFICATION_SHAPE:
				getNotificationShape().clear();
				getNotificationShape().addAll((Collection<? extends SubscriptionTopicNotificationShape>)newValue);
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
			case FhirPackage.SUBSCRIPTION_TOPIC__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__RESOURCE_TRIGGER:
				getResourceTrigger().clear();
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__EVENT_TRIGGER:
				getEventTrigger().clear();
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__CAN_FILTER_BY:
				getCanFilterBy().clear();
				return;
			case FhirPackage.SUBSCRIPTION_TOPIC__NOTIFICATION_SHAPE:
				getNotificationShape().clear();
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
			case FhirPackage.SUBSCRIPTION_TOPIC__URL:
				return url != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION:
				return version != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_STRING:
				return versionAlgorithmString != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__VERSION_ALGORITHM_CODING:
				return versionAlgorithmCoding != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__NAME:
				return name != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__TITLE:
				return title != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case FhirPackage.SUBSCRIPTION_TOPIC__STATUS:
				return status != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__DATE:
				return date != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__PUBLISHER:
				return publisher != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.SUBSCRIPTION_TOPIC__DESCRIPTION:
				return description != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.SUBSCRIPTION_TOPIC__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.SUBSCRIPTION_TOPIC__PURPOSE:
				return purpose != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT:
				return copyright != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__COPYRIGHT_LABEL:
				return copyrightLabel != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__APPROVAL_DATE:
				return approvalDate != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.SUBSCRIPTION_TOPIC__RESOURCE_TRIGGER:
				return resourceTrigger != null && !resourceTrigger.isEmpty();
			case FhirPackage.SUBSCRIPTION_TOPIC__EVENT_TRIGGER:
				return eventTrigger != null && !eventTrigger.isEmpty();
			case FhirPackage.SUBSCRIPTION_TOPIC__CAN_FILTER_BY:
				return canFilterBy != null && !canFilterBy.isEmpty();
			case FhirPackage.SUBSCRIPTION_TOPIC__NOTIFICATION_SHAPE:
				return notificationShape != null && !notificationShape.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionTopicImpl
