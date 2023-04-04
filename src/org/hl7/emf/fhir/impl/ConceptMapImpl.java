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

import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.Coding;
import org.hl7.emf.fhir.ConceptMap;
import org.hl7.emf.fhir.ConceptMapAdditionalAttribute;
import org.hl7.emf.fhir.ConceptMapGroup;
import org.hl7.emf.fhir.ConceptMapProperty;
import org.hl7.emf.fhir.ContactDetail;
import org.hl7.emf.fhir.Date;
import org.hl7.emf.fhir.DateTime;
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
 * An implementation of the model object '<em><b>Concept Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getAdditionalAttribute <em>Additional Attribute</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getSourceScopeUri <em>Source Scope Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getSourceScopeCanonical <em>Source Scope Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getTargetScopeUri <em>Target Scope Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getTargetScopeCanonical <em>Target Scope Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapImpl extends MetadataResourceImpl implements ConceptMap {
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
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> topic;

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
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapProperty> property;

	/**
	 * The cached value of the '{@link #getAdditionalAttribute() <em>Additional Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapAdditionalAttribute> additionalAttribute;

	/**
	 * The cached value of the '{@link #getSourceScopeUri() <em>Source Scope Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceScopeUri()
	 * @generated
	 * @ordered
	 */
	protected Uri sourceScopeUri;

	/**
	 * The cached value of the '{@link #getSourceScopeCanonical() <em>Source Scope Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceScopeCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical sourceScopeCanonical;

	/**
	 * The cached value of the '{@link #getTargetScopeUri() <em>Target Scope Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScopeUri()
	 * @generated
	 * @ordered
	 */
	protected Uri targetScopeUri;

	/**
	 * The cached value of the '{@link #getTargetScopeCanonical() <em>Target Scope Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScopeCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical targetScopeCanonical;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapGroup> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConceptMap();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CONCEPT_MAP__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_STRING, oldVersionAlgorithmString, newVersionAlgorithmString);
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
				msgs = ((InternalEObject)versionAlgorithmString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_STRING, null, msgs);
			if (newVersionAlgorithmString != null)
				msgs = ((InternalEObject)newVersionAlgorithmString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_STRING, null, msgs);
			msgs = basicSetVersionAlgorithmString(newVersionAlgorithmString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_STRING, newVersionAlgorithmString, newVersionAlgorithmString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_CODING, oldVersionAlgorithmCoding, newVersionAlgorithmCoding);
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
				msgs = ((InternalEObject)versionAlgorithmCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_CODING, null, msgs);
			if (newVersionAlgorithmCoding != null)
				msgs = ((InternalEObject)newVersionAlgorithmCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_CODING, null, msgs);
			msgs = basicSetVersionAlgorithmCoding(newVersionAlgorithmCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_CODING, newVersionAlgorithmCoding, newVersionAlgorithmCoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.CONCEPT_MAP__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.CONCEPT_MAP__USE_CONTEXT);
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
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONCEPT_MAP__JURISDICTION);
		}
		return jurisdiction;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__COPYRIGHT_LABEL, oldCopyrightLabel, newCopyrightLabel);
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
				msgs = ((InternalEObject)copyrightLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__COPYRIGHT_LABEL, null, msgs);
			if (newCopyrightLabel != null)
				msgs = ((InternalEObject)newCopyrightLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__COPYRIGHT_LABEL, null, msgs);
			msgs = basicSetCopyrightLabel(newCopyrightLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__COPYRIGHT_LABEL, newCopyrightLabel, newCopyrightLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__APPROVAL_DATE, newApprovalDate, newApprovalDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONCEPT_MAP__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.CONCEPT_MAP__AUTHOR);
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
			editor = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.CONCEPT_MAP__EDITOR);
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
			reviewer = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.CONCEPT_MAP__REVIEWER);
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
			endorser = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.CONCEPT_MAP__ENDORSER);
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
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.CONCEPT_MAP__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptMapProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ConceptMapProperty>(ConceptMapProperty.class, this, FhirPackage.CONCEPT_MAP__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptMapAdditionalAttribute> getAdditionalAttribute() {
		if (additionalAttribute == null) {
			additionalAttribute = new EObjectContainmentEList<ConceptMapAdditionalAttribute>(ConceptMapAdditionalAttribute.class, this, FhirPackage.CONCEPT_MAP__ADDITIONAL_ATTRIBUTE);
		}
		return additionalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getSourceScopeUri() {
		return sourceScopeUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceScopeUri(Uri newSourceScopeUri, NotificationChain msgs) {
		Uri oldSourceScopeUri = sourceScopeUri;
		sourceScopeUri = newSourceScopeUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_URI, oldSourceScopeUri, newSourceScopeUri);
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
	public void setSourceScopeUri(Uri newSourceScopeUri) {
		if (newSourceScopeUri != sourceScopeUri) {
			NotificationChain msgs = null;
			if (sourceScopeUri != null)
				msgs = ((InternalEObject)sourceScopeUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_URI, null, msgs);
			if (newSourceScopeUri != null)
				msgs = ((InternalEObject)newSourceScopeUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_URI, null, msgs);
			msgs = basicSetSourceScopeUri(newSourceScopeUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_URI, newSourceScopeUri, newSourceScopeUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getSourceScopeCanonical() {
		return sourceScopeCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceScopeCanonical(Canonical newSourceScopeCanonical, NotificationChain msgs) {
		Canonical oldSourceScopeCanonical = sourceScopeCanonical;
		sourceScopeCanonical = newSourceScopeCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_CANONICAL, oldSourceScopeCanonical, newSourceScopeCanonical);
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
	public void setSourceScopeCanonical(Canonical newSourceScopeCanonical) {
		if (newSourceScopeCanonical != sourceScopeCanonical) {
			NotificationChain msgs = null;
			if (sourceScopeCanonical != null)
				msgs = ((InternalEObject)sourceScopeCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_CANONICAL, null, msgs);
			if (newSourceScopeCanonical != null)
				msgs = ((InternalEObject)newSourceScopeCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_CANONICAL, null, msgs);
			msgs = basicSetSourceScopeCanonical(newSourceScopeCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_CANONICAL, newSourceScopeCanonical, newSourceScopeCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getTargetScopeUri() {
		return targetScopeUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetScopeUri(Uri newTargetScopeUri, NotificationChain msgs) {
		Uri oldTargetScopeUri = targetScopeUri;
		targetScopeUri = newTargetScopeUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__TARGET_SCOPE_URI, oldTargetScopeUri, newTargetScopeUri);
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
	public void setTargetScopeUri(Uri newTargetScopeUri) {
		if (newTargetScopeUri != targetScopeUri) {
			NotificationChain msgs = null;
			if (targetScopeUri != null)
				msgs = ((InternalEObject)targetScopeUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__TARGET_SCOPE_URI, null, msgs);
			if (newTargetScopeUri != null)
				msgs = ((InternalEObject)newTargetScopeUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__TARGET_SCOPE_URI, null, msgs);
			msgs = basicSetTargetScopeUri(newTargetScopeUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__TARGET_SCOPE_URI, newTargetScopeUri, newTargetScopeUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getTargetScopeCanonical() {
		return targetScopeCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetScopeCanonical(Canonical newTargetScopeCanonical, NotificationChain msgs) {
		Canonical oldTargetScopeCanonical = targetScopeCanonical;
		targetScopeCanonical = newTargetScopeCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__TARGET_SCOPE_CANONICAL, oldTargetScopeCanonical, newTargetScopeCanonical);
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
	public void setTargetScopeCanonical(Canonical newTargetScopeCanonical) {
		if (newTargetScopeCanonical != targetScopeCanonical) {
			NotificationChain msgs = null;
			if (targetScopeCanonical != null)
				msgs = ((InternalEObject)targetScopeCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__TARGET_SCOPE_CANONICAL, null, msgs);
			if (newTargetScopeCanonical != null)
				msgs = ((InternalEObject)newTargetScopeCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP__TARGET_SCOPE_CANONICAL, null, msgs);
			msgs = basicSetTargetScopeCanonical(newTargetScopeCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP__TARGET_SCOPE_CANONICAL, newTargetScopeCanonical, newTargetScopeCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptMapGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<ConceptMapGroup>(ConceptMapGroup.class, this, FhirPackage.CONCEPT_MAP__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONCEPT_MAP__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.CONCEPT_MAP__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_STRING:
				return basicSetVersionAlgorithmString(null, msgs);
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_CODING:
				return basicSetVersionAlgorithmCoding(null, msgs);
			case FhirPackage.CONCEPT_MAP__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CONCEPT_MAP__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.CONCEPT_MAP__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONCEPT_MAP__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.CONCEPT_MAP__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CONCEPT_MAP__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.CONCEPT_MAP__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CONCEPT_MAP__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.CONCEPT_MAP__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.CONCEPT_MAP__COPYRIGHT_LABEL:
				return basicSetCopyrightLabel(null, msgs);
			case FhirPackage.CONCEPT_MAP__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FhirPackage.CONCEPT_MAP__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.CONCEPT_MAP__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.CONCEPT_MAP__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__REVIEWER:
				return ((InternalEList<?>)getReviewer()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__ENDORSER:
				return ((InternalEList<?>)getEndorser()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__ADDITIONAL_ATTRIBUTE:
				return ((InternalEList<?>)getAdditionalAttribute()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_URI:
				return basicSetSourceScopeUri(null, msgs);
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_CANONICAL:
				return basicSetSourceScopeCanonical(null, msgs);
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_URI:
				return basicSetTargetScopeUri(null, msgs);
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_CANONICAL:
				return basicSetTargetScopeCanonical(null, msgs);
			case FhirPackage.CONCEPT_MAP__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONCEPT_MAP__URL:
				return getUrl();
			case FhirPackage.CONCEPT_MAP__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONCEPT_MAP__VERSION:
				return getVersion();
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_STRING:
				return getVersionAlgorithmString();
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_CODING:
				return getVersionAlgorithmCoding();
			case FhirPackage.CONCEPT_MAP__NAME:
				return getName();
			case FhirPackage.CONCEPT_MAP__TITLE:
				return getTitle();
			case FhirPackage.CONCEPT_MAP__STATUS:
				return getStatus();
			case FhirPackage.CONCEPT_MAP__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.CONCEPT_MAP__DATE:
				return getDate();
			case FhirPackage.CONCEPT_MAP__PUBLISHER:
				return getPublisher();
			case FhirPackage.CONCEPT_MAP__CONTACT:
				return getContact();
			case FhirPackage.CONCEPT_MAP__DESCRIPTION:
				return getDescription();
			case FhirPackage.CONCEPT_MAP__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.CONCEPT_MAP__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.CONCEPT_MAP__PURPOSE:
				return getPurpose();
			case FhirPackage.CONCEPT_MAP__COPYRIGHT:
				return getCopyright();
			case FhirPackage.CONCEPT_MAP__COPYRIGHT_LABEL:
				return getCopyrightLabel();
			case FhirPackage.CONCEPT_MAP__APPROVAL_DATE:
				return getApprovalDate();
			case FhirPackage.CONCEPT_MAP__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.CONCEPT_MAP__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.CONCEPT_MAP__TOPIC:
				return getTopic();
			case FhirPackage.CONCEPT_MAP__AUTHOR:
				return getAuthor();
			case FhirPackage.CONCEPT_MAP__EDITOR:
				return getEditor();
			case FhirPackage.CONCEPT_MAP__REVIEWER:
				return getReviewer();
			case FhirPackage.CONCEPT_MAP__ENDORSER:
				return getEndorser();
			case FhirPackage.CONCEPT_MAP__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FhirPackage.CONCEPT_MAP__PROPERTY:
				return getProperty();
			case FhirPackage.CONCEPT_MAP__ADDITIONAL_ATTRIBUTE:
				return getAdditionalAttribute();
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_URI:
				return getSourceScopeUri();
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_CANONICAL:
				return getSourceScopeCanonical();
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_URI:
				return getTargetScopeUri();
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_CANONICAL:
				return getTargetScopeCanonical();
			case FhirPackage.CONCEPT_MAP__GROUP:
				return getGroup();
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
			case FhirPackage.CONCEPT_MAP__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__VERSION:
				setVersion((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__NAME:
				setName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__TITLE:
				setTitle((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__EXPERIMENTAL:
				setExperimental((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__PUBLISHER:
				setPublisher((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__REVIEWER:
				getReviewer().clear();
				getReviewer().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__ENDORSER:
				getEndorser().clear();
				getEndorser().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ConceptMapProperty>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__ADDITIONAL_ATTRIBUTE:
				getAdditionalAttribute().clear();
				getAdditionalAttribute().addAll((Collection<? extends ConceptMapAdditionalAttribute>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_URI:
				setSourceScopeUri((Uri)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_CANONICAL:
				setSourceScopeCanonical((Canonical)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_URI:
				setTargetScopeUri((Uri)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_CANONICAL:
				setTargetScopeCanonical((Canonical)newValue);
				return;
			case FhirPackage.CONCEPT_MAP__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends ConceptMapGroup>)newValue);
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
			case FhirPackage.CONCEPT_MAP__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.CONCEPT_MAP__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CONCEPT_MAP__VERSION:
				setVersion((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)null);
				return;
			case FhirPackage.CONCEPT_MAP__NAME:
				setName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP__TITLE:
				setTitle((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.CONCEPT_MAP__EXPERIMENTAL:
				setExperimental((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.CONCEPT_MAP__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.CONCEPT_MAP__PUBLISHER:
				setPublisher((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.CONCEPT_MAP__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.CONCEPT_MAP__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.CONCEPT_MAP__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.CONCEPT_MAP__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FhirPackage.CONCEPT_MAP__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.CONCEPT_MAP__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FhirPackage.CONCEPT_MAP__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.CONCEPT_MAP__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.CONCEPT_MAP__TOPIC:
				getTopic().clear();
				return;
			case FhirPackage.CONCEPT_MAP__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.CONCEPT_MAP__EDITOR:
				getEditor().clear();
				return;
			case FhirPackage.CONCEPT_MAP__REVIEWER:
				getReviewer().clear();
				return;
			case FhirPackage.CONCEPT_MAP__ENDORSER:
				getEndorser().clear();
				return;
			case FhirPackage.CONCEPT_MAP__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FhirPackage.CONCEPT_MAP__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.CONCEPT_MAP__ADDITIONAL_ATTRIBUTE:
				getAdditionalAttribute().clear();
				return;
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_URI:
				setSourceScopeUri((Uri)null);
				return;
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_CANONICAL:
				setSourceScopeCanonical((Canonical)null);
				return;
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_URI:
				setTargetScopeUri((Uri)null);
				return;
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_CANONICAL:
				setTargetScopeCanonical((Canonical)null);
				return;
			case FhirPackage.CONCEPT_MAP__GROUP:
				getGroup().clear();
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
			case FhirPackage.CONCEPT_MAP__URL:
				return url != null;
			case FhirPackage.CONCEPT_MAP__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CONCEPT_MAP__VERSION:
				return version != null;
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_STRING:
				return versionAlgorithmString != null;
			case FhirPackage.CONCEPT_MAP__VERSION_ALGORITHM_CODING:
				return versionAlgorithmCoding != null;
			case FhirPackage.CONCEPT_MAP__NAME:
				return name != null;
			case FhirPackage.CONCEPT_MAP__TITLE:
				return title != null;
			case FhirPackage.CONCEPT_MAP__STATUS:
				return status != null;
			case FhirPackage.CONCEPT_MAP__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.CONCEPT_MAP__DATE:
				return date != null;
			case FhirPackage.CONCEPT_MAP__PUBLISHER:
				return publisher != null;
			case FhirPackage.CONCEPT_MAP__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.CONCEPT_MAP__DESCRIPTION:
				return description != null;
			case FhirPackage.CONCEPT_MAP__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.CONCEPT_MAP__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.CONCEPT_MAP__PURPOSE:
				return purpose != null;
			case FhirPackage.CONCEPT_MAP__COPYRIGHT:
				return copyright != null;
			case FhirPackage.CONCEPT_MAP__COPYRIGHT_LABEL:
				return copyrightLabel != null;
			case FhirPackage.CONCEPT_MAP__APPROVAL_DATE:
				return approvalDate != null;
			case FhirPackage.CONCEPT_MAP__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.CONCEPT_MAP__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.CONCEPT_MAP__TOPIC:
				return topic != null && !topic.isEmpty();
			case FhirPackage.CONCEPT_MAP__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.CONCEPT_MAP__EDITOR:
				return editor != null && !editor.isEmpty();
			case FhirPackage.CONCEPT_MAP__REVIEWER:
				return reviewer != null && !reviewer.isEmpty();
			case FhirPackage.CONCEPT_MAP__ENDORSER:
				return endorser != null && !endorser.isEmpty();
			case FhirPackage.CONCEPT_MAP__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FhirPackage.CONCEPT_MAP__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.CONCEPT_MAP__ADDITIONAL_ATTRIBUTE:
				return additionalAttribute != null && !additionalAttribute.isEmpty();
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_URI:
				return sourceScopeUri != null;
			case FhirPackage.CONCEPT_MAP__SOURCE_SCOPE_CANONICAL:
				return sourceScopeCanonical != null;
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_URI:
				return targetScopeUri != null;
			case FhirPackage.CONCEPT_MAP__TARGET_SCOPE_CANONICAL:
				return targetScopeCanonical != null;
			case FhirPackage.CONCEPT_MAP__GROUP:
				return group != null && !group.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapImpl
