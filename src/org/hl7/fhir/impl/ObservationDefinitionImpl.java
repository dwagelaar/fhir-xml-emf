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
import org.hl7.fhir.ObservationDataType;
import org.hl7.fhir.ObservationDefinition;
import org.hl7.fhir.ObservationDefinitionComponent;
import org.hl7.fhir.ObservationDefinitionQualifiedValue;
import org.hl7.fhir.Period;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getDerivedFromCanonical <em>Derived From Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getDerivedFromUri <em>Derived From Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getPermittedDataType <em>Permitted Data Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getMultipleResultsAllowed <em>Multiple Results Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getPreferredReportName <em>Preferred Report Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getPermittedUnit <em>Permitted Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getQualifiedValue <em>Qualified Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getHasMember <em>Has Member</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationDefinitionImpl extends MetadataResourceImpl implements ObservationDefinition {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getDerivedFromCanonical() <em>Derived From Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFromCanonical()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> derivedFromCanonical;

	/**
	 * The cached value of the '{@link #getDerivedFromUri() <em>Derived From Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFromUri()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> derivedFromUri;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subject;

	/**
	 * The cached value of the '{@link #getPerformerType() <em>Performer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept performerType;

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
	 * The cached value of the '{@link #getPermittedDataType() <em>Permitted Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDataType> permittedDataType;

	/**
	 * The cached value of the '{@link #getMultipleResultsAllowed() <em>Multiple Results Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleResultsAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean multipleResultsAllowed;

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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

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
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> device;

	/**
	 * The cached value of the '{@link #getPreferredReportName() <em>Preferred Report Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredReportName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String preferredReportName;

	/**
	 * The cached value of the '{@link #getPermittedUnit() <em>Permitted Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> permittedUnit;

	/**
	 * The cached value of the '{@link #getQualifiedValue() <em>Qualified Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDefinitionQualifiedValue> qualifiedValue;

	/**
	 * The cached value of the '{@link #getHasMember() <em>Has Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> hasMember;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDefinitionComponent> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getObservationDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_STRING, oldVersionAlgorithmString, newVersionAlgorithmString);
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
				msgs = ((InternalEObject)versionAlgorithmString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_STRING, null, msgs);
			if (newVersionAlgorithmString != null)
				msgs = ((InternalEObject)newVersionAlgorithmString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_STRING, null, msgs);
			msgs = basicSetVersionAlgorithmString(newVersionAlgorithmString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_STRING, newVersionAlgorithmString, newVersionAlgorithmString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_CODING, oldVersionAlgorithmCoding, newVersionAlgorithmCoding);
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
				msgs = ((InternalEObject)versionAlgorithmCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_CODING, null, msgs);
			if (newVersionAlgorithmCoding != null)
				msgs = ((InternalEObject)newVersionAlgorithmCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_CODING, null, msgs);
			msgs = basicSetVersionAlgorithmCoding(newVersionAlgorithmCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_CODING, newVersionAlgorithmCoding, newVersionAlgorithmCoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.OBSERVATION_DEFINITION__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.OBSERVATION_DEFINITION__USE_CONTEXT);
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
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.OBSERVATION_DEFINITION__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT_LABEL, oldCopyrightLabel, newCopyrightLabel);
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
				msgs = ((InternalEObject)copyrightLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT_LABEL, null, msgs);
			if (newCopyrightLabel != null)
				msgs = ((InternalEObject)newCopyrightLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT_LABEL, null, msgs);
			msgs = basicSetCopyrightLabel(newCopyrightLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT_LABEL, newCopyrightLabel, newCopyrightLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__APPROVAL_DATE, newApprovalDate, newApprovalDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Canonical> getDerivedFromCanonical() {
		if (derivedFromCanonical == null) {
			derivedFromCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_CANONICAL);
		}
		return derivedFromCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getDerivedFromUri() {
		if (derivedFromUri == null) {
			derivedFromUri = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_URI);
		}
		return derivedFromUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.OBSERVATION_DEFINITION__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPerformerType() {
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformerType(CodeableConcept newPerformerType, NotificationChain msgs) {
		CodeableConcept oldPerformerType = performerType;
		performerType = newPerformerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PERFORMER_TYPE, oldPerformerType, newPerformerType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformerType(CodeableConcept newPerformerType) {
		if (newPerformerType != performerType) {
			NotificationChain msgs = null;
			if (performerType != null)
				msgs = ((InternalEObject)performerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PERFORMER_TYPE, null, msgs);
			if (newPerformerType != null)
				msgs = ((InternalEObject)newPerformerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PERFORMER_TYPE, null, msgs);
			msgs = basicSetPerformerType(newPerformerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PERFORMER_TYPE, newPerformerType, newPerformerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.OBSERVATION_DEFINITION__CATEGORY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationDataType> getPermittedDataType() {
		if (permittedDataType == null) {
			permittedDataType = new EObjectContainmentEList<ObservationDataType>(ObservationDataType.class, this, FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE);
		}
		return permittedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getMultipleResultsAllowed() {
		return multipleResultsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleResultsAllowed(org.hl7.fhir.Boolean newMultipleResultsAllowed, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMultipleResultsAllowed = multipleResultsAllowed;
		multipleResultsAllowed = newMultipleResultsAllowed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, oldMultipleResultsAllowed, newMultipleResultsAllowed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleResultsAllowed(org.hl7.fhir.Boolean newMultipleResultsAllowed) {
		if (newMultipleResultsAllowed != multipleResultsAllowed) {
			NotificationChain msgs = null;
			if (multipleResultsAllowed != null)
				msgs = ((InternalEObject)multipleResultsAllowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, null, msgs);
			if (newMultipleResultsAllowed != null)
				msgs = ((InternalEObject)newMultipleResultsAllowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, null, msgs);
			msgs = basicSetMultipleResultsAllowed(newMultipleResultsAllowed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, newMultipleResultsAllowed, newMultipleResultsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.OBSERVATION_DEFINITION__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.OBSERVATION_DEFINITION__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPreferredReportName() {
		return preferredReportName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredReportName(org.hl7.fhir.String newPreferredReportName, NotificationChain msgs) {
		org.hl7.fhir.String oldPreferredReportName = preferredReportName;
		preferredReportName = newPreferredReportName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, oldPreferredReportName, newPreferredReportName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredReportName(org.hl7.fhir.String newPreferredReportName) {
		if (newPreferredReportName != preferredReportName) {
			NotificationChain msgs = null;
			if (preferredReportName != null)
				msgs = ((InternalEObject)preferredReportName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, null, msgs);
			if (newPreferredReportName != null)
				msgs = ((InternalEObject)newPreferredReportName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, null, msgs);
			msgs = basicSetPreferredReportName(newPreferredReportName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, newPreferredReportName, newPreferredReportName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPermittedUnit() {
		if (permittedUnit == null) {
			permittedUnit = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.OBSERVATION_DEFINITION__PERMITTED_UNIT);
		}
		return permittedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationDefinitionQualifiedValue> getQualifiedValue() {
		if (qualifiedValue == null) {
			qualifiedValue = new EObjectContainmentEList<ObservationDefinitionQualifiedValue>(ObservationDefinitionQualifiedValue.class, this, FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_VALUE);
		}
		return qualifiedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getHasMember() {
		if (hasMember == null) {
			hasMember = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.OBSERVATION_DEFINITION__HAS_MEMBER);
		}
		return hasMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationDefinitionComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ObservationDefinitionComponent>(ObservationDefinitionComponent.class, this, FhirPackage.OBSERVATION_DEFINITION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OBSERVATION_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_STRING:
				return basicSetVersionAlgorithmString(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_CODING:
				return basicSetVersionAlgorithmCoding(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT_LABEL:
				return basicSetCopyrightLabel(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_CANONICAL:
				return ((InternalEList<?>)getDerivedFromCanonical()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_URI:
				return ((InternalEList<?>)getDerivedFromUri()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__PERFORMER_TYPE:
				return basicSetPerformerType(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				return ((InternalEList<?>)getPermittedDataType()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				return basicSetMultipleResultsAllowed(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				return basicSetPreferredReportName(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_UNIT:
				return ((InternalEList<?>)getPermittedUnit()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_VALUE:
				return ((InternalEList<?>)getQualifiedValue()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__HAS_MEMBER:
				return ((InternalEList<?>)getHasMember()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.OBSERVATION_DEFINITION__URL:
				return getUrl();
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.OBSERVATION_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_STRING:
				return getVersionAlgorithmString();
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_CODING:
				return getVersionAlgorithmCoding();
			case FhirPackage.OBSERVATION_DEFINITION__NAME:
				return getName();
			case FhirPackage.OBSERVATION_DEFINITION__TITLE:
				return getTitle();
			case FhirPackage.OBSERVATION_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.OBSERVATION_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.OBSERVATION_DEFINITION__DATE:
				return getDate();
			case FhirPackage.OBSERVATION_DEFINITION__PUBLISHER:
				return getPublisher();
			case FhirPackage.OBSERVATION_DEFINITION__CONTACT:
				return getContact();
			case FhirPackage.OBSERVATION_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.OBSERVATION_DEFINITION__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.OBSERVATION_DEFINITION__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.OBSERVATION_DEFINITION__PURPOSE:
				return getPurpose();
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT:
				return getCopyright();
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT_LABEL:
				return getCopyrightLabel();
			case FhirPackage.OBSERVATION_DEFINITION__APPROVAL_DATE:
				return getApprovalDate();
			case FhirPackage.OBSERVATION_DEFINITION__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.OBSERVATION_DEFINITION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_CANONICAL:
				return getDerivedFromCanonical();
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_URI:
				return getDerivedFromUri();
			case FhirPackage.OBSERVATION_DEFINITION__SUBJECT:
				return getSubject();
			case FhirPackage.OBSERVATION_DEFINITION__PERFORMER_TYPE:
				return getPerformerType();
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				return getCategory();
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				return getCode();
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				return getPermittedDataType();
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				return getMultipleResultsAllowed();
			case FhirPackage.OBSERVATION_DEFINITION__BODY_SITE:
				return getBodySite();
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				return getMethod();
			case FhirPackage.OBSERVATION_DEFINITION__SPECIMEN:
				return getSpecimen();
			case FhirPackage.OBSERVATION_DEFINITION__DEVICE:
				return getDevice();
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				return getPreferredReportName();
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_UNIT:
				return getPermittedUnit();
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_VALUE:
				return getQualifiedValue();
			case FhirPackage.OBSERVATION_DEFINITION__HAS_MEMBER:
				return getHasMember();
			case FhirPackage.OBSERVATION_DEFINITION__COMPONENT:
				return getComponent();
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
			case FhirPackage.OBSERVATION_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_CANONICAL:
				getDerivedFromCanonical().clear();
				getDerivedFromCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_URI:
				getDerivedFromUri().clear();
				getDerivedFromUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				getPermittedDataType().clear();
				getPermittedDataType().addAll((Collection<? extends ObservationDataType>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				setMultipleResultsAllowed((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				setPreferredReportName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_UNIT:
				getPermittedUnit().clear();
				getPermittedUnit().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_VALUE:
				getQualifiedValue().clear();
				getQualifiedValue().addAll((Collection<? extends ObservationDefinitionQualifiedValue>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__HAS_MEMBER:
				getHasMember().clear();
				getHasMember().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ObservationDefinitionComponent>)newValue);
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
			case FhirPackage.OBSERVATION_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_CANONICAL:
				getDerivedFromCanonical().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_URI:
				getDerivedFromUri().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				getPermittedDataType().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				setMultipleResultsAllowed((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__SPECIMEN:
				getSpecimen().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__DEVICE:
				getDevice().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				setPreferredReportName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_UNIT:
				getPermittedUnit().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_VALUE:
				getQualifiedValue().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__HAS_MEMBER:
				getHasMember().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__COMPONENT:
				getComponent().clear();
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
			case FhirPackage.OBSERVATION_DEFINITION__URL:
				return url != null;
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.OBSERVATION_DEFINITION__VERSION:
				return version != null;
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_STRING:
				return versionAlgorithmString != null;
			case FhirPackage.OBSERVATION_DEFINITION__VERSION_ALGORITHM_CODING:
				return versionAlgorithmCoding != null;
			case FhirPackage.OBSERVATION_DEFINITION__NAME:
				return name != null;
			case FhirPackage.OBSERVATION_DEFINITION__TITLE:
				return title != null;
			case FhirPackage.OBSERVATION_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.OBSERVATION_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.OBSERVATION_DEFINITION__DATE:
				return date != null;
			case FhirPackage.OBSERVATION_DEFINITION__PUBLISHER:
				return publisher != null;
			case FhirPackage.OBSERVATION_DEFINITION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.OBSERVATION_DEFINITION__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__PURPOSE:
				return purpose != null;
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT:
				return copyright != null;
			case FhirPackage.OBSERVATION_DEFINITION__COPYRIGHT_LABEL:
				return copyrightLabel != null;
			case FhirPackage.OBSERVATION_DEFINITION__APPROVAL_DATE:
				return approvalDate != null;
			case FhirPackage.OBSERVATION_DEFINITION__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.OBSERVATION_DEFINITION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_CANONICAL:
				return derivedFromCanonical != null && !derivedFromCanonical.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__DERIVED_FROM_URI:
				return derivedFromUri != null && !derivedFromUri.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__PERFORMER_TYPE:
				return performerType != null;
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				return code != null;
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				return permittedDataType != null && !permittedDataType.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				return multipleResultsAllowed != null;
			case FhirPackage.OBSERVATION_DEFINITION__BODY_SITE:
				return bodySite != null;
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				return method != null;
			case FhirPackage.OBSERVATION_DEFINITION__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__DEVICE:
				return device != null && !device.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				return preferredReportName != null;
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_UNIT:
				return permittedUnit != null && !permittedUnit.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_VALUE:
				return qualifiedValue != null && !qualifiedValue.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__HAS_MEMBER:
				return hasMember != null && !hasMember.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionImpl
