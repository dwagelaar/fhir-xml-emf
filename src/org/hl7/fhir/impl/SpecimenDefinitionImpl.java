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
import org.hl7.fhir.Reference;
import org.hl7.fhir.SpecimenDefinition;
import org.hl7.fhir.SpecimenDefinitionTypeTested;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getDerivedFromCanonical <em>Derived From Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getDerivedFromUri <em>Derived From Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getSubjectReference <em>Subject Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getTypeCollected <em>Type Collected</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getPatientPreparation <em>Patient Preparation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getTimeAspect <em>Time Aspect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getTypeTested <em>Type Tested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionImpl extends MetadataResourceImpl implements SpecimenDefinition {
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
	 * The cached value of the '{@link #getSubjectCodeableConcept() <em>Subject Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subjectCodeableConcept;

	/**
	 * The cached value of the '{@link #getSubjectReference() <em>Subject Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectReference()
	 * @generated
	 * @ordered
	 */
	protected Reference subjectReference;

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
	 * The cached value of the '{@link #getTypeCollected() <em>Type Collected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCollected()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept typeCollected;

	/**
	 * The cached value of the '{@link #getPatientPreparation() <em>Patient Preparation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPreparation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> patientPreparation;

	/**
	 * The cached value of the '{@link #getTimeAspect() <em>Time Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAspect()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String timeAspect;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> collection;

	/**
	 * The cached value of the '{@link #getTypeTested() <em>Type Tested</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTested()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenDefinitionTypeTested> typeTested;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimenDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_STRING, oldVersionAlgorithmString, newVersionAlgorithmString);
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
				msgs = ((InternalEObject)versionAlgorithmString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_STRING, null, msgs);
			if (newVersionAlgorithmString != null)
				msgs = ((InternalEObject)newVersionAlgorithmString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_STRING, null, msgs);
			msgs = basicSetVersionAlgorithmString(newVersionAlgorithmString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_STRING, newVersionAlgorithmString, newVersionAlgorithmString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_CODING, oldVersionAlgorithmCoding, newVersionAlgorithmCoding);
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
				msgs = ((InternalEObject)versionAlgorithmCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_CODING, null, msgs);
			if (newVersionAlgorithmCoding != null)
				msgs = ((InternalEObject)newVersionAlgorithmCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_CODING, null, msgs);
			msgs = basicSetVersionAlgorithmCoding(newVersionAlgorithmCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_CODING, newVersionAlgorithmCoding, newVersionAlgorithmCoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Canonical> getDerivedFromCanonical() {
		if (derivedFromCanonical == null) {
			derivedFromCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_CANONICAL);
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
			derivedFromUri = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_URI);
		}
		return derivedFromUri;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubjectCodeableConcept() {
		return subjectCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSubjectCodeableConcept = subjectCodeableConcept;
		subjectCodeableConcept = newSubjectCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__SUBJECT_CODEABLE_CONCEPT, oldSubjectCodeableConcept, newSubjectCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept) {
		if (newSubjectCodeableConcept != subjectCodeableConcept) {
			NotificationChain msgs = null;
			if (subjectCodeableConcept != null)
				msgs = ((InternalEObject)subjectCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			if (newSubjectCodeableConcept != null)
				msgs = ((InternalEObject)newSubjectCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSubjectCodeableConcept(newSubjectCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__SUBJECT_CODEABLE_CONCEPT, newSubjectCodeableConcept, newSubjectCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubjectReference() {
		return subjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectReference(Reference newSubjectReference, NotificationChain msgs) {
		Reference oldSubjectReference = subjectReference;
		subjectReference = newSubjectReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__SUBJECT_REFERENCE, oldSubjectReference, newSubjectReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectReference(Reference newSubjectReference) {
		if (newSubjectReference != subjectReference) {
			NotificationChain msgs = null;
			if (subjectReference != null)
				msgs = ((InternalEObject)subjectReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__SUBJECT_REFERENCE, null, msgs);
			if (newSubjectReference != null)
				msgs = ((InternalEObject)newSubjectReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__SUBJECT_REFERENCE, null, msgs);
			msgs = basicSetSubjectReference(newSubjectReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__SUBJECT_REFERENCE, newSubjectReference, newSubjectReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.SPECIMEN_DEFINITION__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.SPECIMEN_DEFINITION__USE_CONTEXT);
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
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SPECIMEN_DEFINITION__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT_LABEL, oldCopyrightLabel, newCopyrightLabel);
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
				msgs = ((InternalEObject)copyrightLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT_LABEL, null, msgs);
			if (newCopyrightLabel != null)
				msgs = ((InternalEObject)newCopyrightLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT_LABEL, null, msgs);
			msgs = basicSetCopyrightLabel(newCopyrightLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT_LABEL, newCopyrightLabel, newCopyrightLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__APPROVAL_DATE, newApprovalDate, newApprovalDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTypeCollected() {
		return typeCollected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeCollected(CodeableConcept newTypeCollected, NotificationChain msgs) {
		CodeableConcept oldTypeCollected = typeCollected;
		typeCollected = newTypeCollected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, oldTypeCollected, newTypeCollected);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCollected(CodeableConcept newTypeCollected) {
		if (newTypeCollected != typeCollected) {
			NotificationChain msgs = null;
			if (typeCollected != null)
				msgs = ((InternalEObject)typeCollected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, null, msgs);
			if (newTypeCollected != null)
				msgs = ((InternalEObject)newTypeCollected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, null, msgs);
			msgs = basicSetTypeCollected(newTypeCollected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, newTypeCollected, newTypeCollected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPatientPreparation() {
		if (patientPreparation == null) {
			patientPreparation = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION);
		}
		return patientPreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTimeAspect() {
		return timeAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeAspect(org.hl7.fhir.String newTimeAspect, NotificationChain msgs) {
		org.hl7.fhir.String oldTimeAspect = timeAspect;
		timeAspect = newTimeAspect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT, oldTimeAspect, newTimeAspect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAspect(org.hl7.fhir.String newTimeAspect) {
		if (newTimeAspect != timeAspect) {
			NotificationChain msgs = null;
			if (timeAspect != null)
				msgs = ((InternalEObject)timeAspect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT, null, msgs);
			if (newTimeAspect != null)
				msgs = ((InternalEObject)newTimeAspect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT, null, msgs);
			msgs = basicSetTimeAspect(newTimeAspect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT, newTimeAspect, newTimeAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCollection() {
		if (collection == null) {
			collection = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SPECIMEN_DEFINITION__COLLECTION);
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecimenDefinitionTypeTested> getTypeTested() {
		if (typeTested == null) {
			typeTested = new EObjectContainmentEList<SpecimenDefinitionTypeTested>(SpecimenDefinitionTypeTested.class, this, FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED);
		}
		return typeTested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_STRING:
				return basicSetVersionAlgorithmString(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_CODING:
				return basicSetVersionAlgorithmCoding(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_CANONICAL:
				return ((InternalEList<?>)getDerivedFromCanonical()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_URI:
				return ((InternalEList<?>)getDerivedFromUri()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				return basicSetSubjectCodeableConcept(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_REFERENCE:
				return basicSetSubjectReference(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT_LABEL:
				return basicSetCopyrightLabel(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				return basicSetTypeCollected(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				return ((InternalEList<?>)getPatientPreparation()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				return basicSetTimeAspect(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				return ((InternalEList<?>)getCollection()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				return ((InternalEList<?>)getTypeTested()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SPECIMEN_DEFINITION__URL:
				return getUrl();
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SPECIMEN_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_STRING:
				return getVersionAlgorithmString();
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_CODING:
				return getVersionAlgorithmCoding();
			case FhirPackage.SPECIMEN_DEFINITION__NAME:
				return getName();
			case FhirPackage.SPECIMEN_DEFINITION__TITLE:
				return getTitle();
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_CANONICAL:
				return getDerivedFromCanonical();
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_URI:
				return getDerivedFromUri();
			case FhirPackage.SPECIMEN_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.SPECIMEN_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				return getSubjectCodeableConcept();
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_REFERENCE:
				return getSubjectReference();
			case FhirPackage.SPECIMEN_DEFINITION__DATE:
				return getDate();
			case FhirPackage.SPECIMEN_DEFINITION__PUBLISHER:
				return getPublisher();
			case FhirPackage.SPECIMEN_DEFINITION__CONTACT:
				return getContact();
			case FhirPackage.SPECIMEN_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.SPECIMEN_DEFINITION__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.SPECIMEN_DEFINITION__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.SPECIMEN_DEFINITION__PURPOSE:
				return getPurpose();
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT:
				return getCopyright();
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT_LABEL:
				return getCopyrightLabel();
			case FhirPackage.SPECIMEN_DEFINITION__APPROVAL_DATE:
				return getApprovalDate();
			case FhirPackage.SPECIMEN_DEFINITION__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.SPECIMEN_DEFINITION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				return getTypeCollected();
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				return getPatientPreparation();
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				return getTimeAspect();
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				return getCollection();
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				return getTypeTested();
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
			case FhirPackage.SPECIMEN_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_CANONICAL:
				getDerivedFromCanonical().clear();
				getDerivedFromCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_URI:
				getDerivedFromUri().clear();
				getDerivedFromUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_REFERENCE:
				setSubjectReference((Reference)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				setTypeCollected((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				getPatientPreparation().clear();
				getPatientPreparation().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				setTimeAspect((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				getCollection().clear();
				getCollection().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				getTypeTested().clear();
				getTypeTested().addAll((Collection<? extends SpecimenDefinitionTypeTested>)newValue);
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
			case FhirPackage.SPECIMEN_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_CANONICAL:
				getDerivedFromCanonical().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_URI:
				getDerivedFromUri().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_REFERENCE:
				setSubjectReference((Reference)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				setTypeCollected((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				getPatientPreparation().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				setTimeAspect((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				getCollection().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				getTypeTested().clear();
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
			case FhirPackage.SPECIMEN_DEFINITION__URL:
				return url != null;
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.SPECIMEN_DEFINITION__VERSION:
				return version != null;
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_STRING:
				return versionAlgorithmString != null;
			case FhirPackage.SPECIMEN_DEFINITION__VERSION_ALGORITHM_CODING:
				return versionAlgorithmCoding != null;
			case FhirPackage.SPECIMEN_DEFINITION__NAME:
				return name != null;
			case FhirPackage.SPECIMEN_DEFINITION__TITLE:
				return title != null;
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_CANONICAL:
				return derivedFromCanonical != null && !derivedFromCanonical.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION__DERIVED_FROM_URI:
				return derivedFromUri != null && !derivedFromUri.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.SPECIMEN_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				return subjectCodeableConcept != null;
			case FhirPackage.SPECIMEN_DEFINITION__SUBJECT_REFERENCE:
				return subjectReference != null;
			case FhirPackage.SPECIMEN_DEFINITION__DATE:
				return date != null;
			case FhirPackage.SPECIMEN_DEFINITION__PUBLISHER:
				return publisher != null;
			case FhirPackage.SPECIMEN_DEFINITION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.SPECIMEN_DEFINITION__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION__PURPOSE:
				return purpose != null;
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT:
				return copyright != null;
			case FhirPackage.SPECIMEN_DEFINITION__COPYRIGHT_LABEL:
				return copyrightLabel != null;
			case FhirPackage.SPECIMEN_DEFINITION__APPROVAL_DATE:
				return approvalDate != null;
			case FhirPackage.SPECIMEN_DEFINITION__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.SPECIMEN_DEFINITION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				return typeCollected != null;
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				return patientPreparation != null && !patientPreparation.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				return timeAspect != null;
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				return collection != null && !collection.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				return typeTested != null && !typeTested.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionImpl
