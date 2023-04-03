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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MarketingStatus;
import org.hl7.fhir.MedicinalProductDefinition;
import org.hl7.fhir.MedicinalProductDefinitionCharacteristic;
import org.hl7.fhir.MedicinalProductDefinitionContact;
import org.hl7.fhir.MedicinalProductDefinitionCrossReference;
import org.hl7.fhir.MedicinalProductDefinitionName;
import org.hl7.fhir.MedicinalProductDefinitionOperation;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getCombinedPharmaceuticalDoseForm <em>Combined Pharmaceutical Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getAdditionalMonitoringIndicator <em>Additional Monitoring Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getSpecialMeasures <em>Special Measures</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getPediatricUseIndicator <em>Pediatric Use Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getMarketingStatus <em>Marketing Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getPackagedMedicinalProduct <em>Packaged Medicinal Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getComprisedOf <em>Comprised Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getImpurity <em>Impurity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getAttachedDocument <em>Attached Document</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getMasterFile <em>Master File</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getClinicalTrial <em>Clinical Trial</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getCrossReference <em>Cross Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionImpl#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductDefinitionImpl extends DomainResourceImpl implements MedicinalProductDefinition {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept domain;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime statusDate;

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
	 * The cached value of the '{@link #getCombinedPharmaceuticalDoseForm() <em>Combined Pharmaceutical Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedPharmaceuticalDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept combinedPharmaceuticalDoseForm;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> route;

	/**
	 * The cached value of the '{@link #getIndication() <em>Indication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication()
	 * @generated
	 * @ordered
	 */
	protected Markdown indication;

	/**
	 * The cached value of the '{@link #getLegalStatusOfSupply() <em>Legal Status Of Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept legalStatusOfSupply;

	/**
	 * The cached value of the '{@link #getAdditionalMonitoringIndicator() <em>Additional Monitoring Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMonitoringIndicator()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept additionalMonitoringIndicator;

	/**
	 * The cached value of the '{@link #getSpecialMeasures() <em>Special Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialMeasures;

	/**
	 * The cached value of the '{@link #getPediatricUseIndicator() <em>Pediatric Use Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPediatricUseIndicator()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept pediatricUseIndicator;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classification;

	/**
	 * The cached value of the '{@link #getMarketingStatus() <em>Marketing Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketingStatus> marketingStatus;

	/**
	 * The cached value of the '{@link #getPackagedMedicinalProduct() <em>Packaged Medicinal Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedMedicinalProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> packagedMedicinalProduct;

	/**
	 * The cached value of the '{@link #getComprisedOf() <em>Comprised Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComprisedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> comprisedOf;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> ingredient;

	/**
	 * The cached value of the '{@link #getImpurity() <em>Impurity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpurity()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> impurity;

	/**
	 * The cached value of the '{@link #getAttachedDocument() <em>Attached Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> attachedDocument;

	/**
	 * The cached value of the '{@link #getMasterFile() <em>Master File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFile()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> masterFile;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductDefinitionContact> contact;

	/**
	 * The cached value of the '{@link #getClinicalTrial() <em>Clinical Trial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalTrial()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> clinicalTrial;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> code;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductDefinitionName> name;

	/**
	 * The cached value of the '{@link #getCrossReference() <em>Cross Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossReference()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductDefinitionCrossReference> crossReference;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductDefinitionOperation> operation;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductDefinitionCharacteristic> characteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(CodeableConcept newDomain, NotificationChain msgs) {
		CodeableConcept oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(CodeableConcept newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DOMAIN, newDomain, newDomain));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusDate(DateTime newStatusDate, NotificationChain msgs) {
		DateTime oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS_DATE, oldStatusDate, newStatusDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(DateTime newStatusDate) {
		if (newStatusDate != statusDate) {
			NotificationChain msgs = null;
			if (statusDate != null)
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS_DATE, newStatusDate, newStatusDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCombinedPharmaceuticalDoseForm() {
		return combinedPharmaceuticalDoseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedPharmaceuticalDoseForm(CodeableConcept newCombinedPharmaceuticalDoseForm, NotificationChain msgs) {
		CodeableConcept oldCombinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
		combinedPharmaceuticalDoseForm = newCombinedPharmaceuticalDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMBINED_PHARMACEUTICAL_DOSE_FORM, oldCombinedPharmaceuticalDoseForm, newCombinedPharmaceuticalDoseForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinedPharmaceuticalDoseForm(CodeableConcept newCombinedPharmaceuticalDoseForm) {
		if (newCombinedPharmaceuticalDoseForm != combinedPharmaceuticalDoseForm) {
			NotificationChain msgs = null;
			if (combinedPharmaceuticalDoseForm != null)
				msgs = ((InternalEObject)combinedPharmaceuticalDoseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMBINED_PHARMACEUTICAL_DOSE_FORM, null, msgs);
			if (newCombinedPharmaceuticalDoseForm != null)
				msgs = ((InternalEObject)newCombinedPharmaceuticalDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMBINED_PHARMACEUTICAL_DOSE_FORM, null, msgs);
			msgs = basicSetCombinedPharmaceuticalDoseForm(newCombinedPharmaceuticalDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMBINED_PHARMACEUTICAL_DOSE_FORM, newCombinedPharmaceuticalDoseForm, newCombinedPharmaceuticalDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRoute() {
		if (route == null) {
			route = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ROUTE);
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getIndication() {
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndication(Markdown newIndication, NotificationChain msgs) {
		Markdown oldIndication = indication;
		indication = newIndication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INDICATION, oldIndication, newIndication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndication(Markdown newIndication) {
		if (newIndication != indication) {
			NotificationChain msgs = null;
			if (indication != null)
				msgs = ((InternalEObject)indication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INDICATION, null, msgs);
			if (newIndication != null)
				msgs = ((InternalEObject)newIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INDICATION, null, msgs);
			msgs = basicSetIndication(newIndication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INDICATION, newIndication, newIndication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getLegalStatusOfSupply() {
		return legalStatusOfSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply, NotificationChain msgs) {
		CodeableConcept oldLegalStatusOfSupply = legalStatusOfSupply;
		legalStatusOfSupply = newLegalStatusOfSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY, oldLegalStatusOfSupply, newLegalStatusOfSupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply) {
		if (newLegalStatusOfSupply != legalStatusOfSupply) {
			NotificationChain msgs = null;
			if (legalStatusOfSupply != null)
				msgs = ((InternalEObject)legalStatusOfSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			if (newLegalStatusOfSupply != null)
				msgs = ((InternalEObject)newLegalStatusOfSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			msgs = basicSetLegalStatusOfSupply(newLegalStatusOfSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY, newLegalStatusOfSupply, newLegalStatusOfSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAdditionalMonitoringIndicator() {
		return additionalMonitoringIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalMonitoringIndicator(CodeableConcept newAdditionalMonitoringIndicator, NotificationChain msgs) {
		CodeableConcept oldAdditionalMonitoringIndicator = additionalMonitoringIndicator;
		additionalMonitoringIndicator = newAdditionalMonitoringIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ADDITIONAL_MONITORING_INDICATOR, oldAdditionalMonitoringIndicator, newAdditionalMonitoringIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalMonitoringIndicator(CodeableConcept newAdditionalMonitoringIndicator) {
		if (newAdditionalMonitoringIndicator != additionalMonitoringIndicator) {
			NotificationChain msgs = null;
			if (additionalMonitoringIndicator != null)
				msgs = ((InternalEObject)additionalMonitoringIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ADDITIONAL_MONITORING_INDICATOR, null, msgs);
			if (newAdditionalMonitoringIndicator != null)
				msgs = ((InternalEObject)newAdditionalMonitoringIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ADDITIONAL_MONITORING_INDICATOR, null, msgs);
			msgs = basicSetAdditionalMonitoringIndicator(newAdditionalMonitoringIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ADDITIONAL_MONITORING_INDICATOR, newAdditionalMonitoringIndicator, newAdditionalMonitoringIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialMeasures() {
		if (specialMeasures == null) {
			specialMeasures = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__SPECIAL_MEASURES);
		}
		return specialMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPediatricUseIndicator() {
		return pediatricUseIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPediatricUseIndicator(CodeableConcept newPediatricUseIndicator, NotificationChain msgs) {
		CodeableConcept oldPediatricUseIndicator = pediatricUseIndicator;
		pediatricUseIndicator = newPediatricUseIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PEDIATRIC_USE_INDICATOR, oldPediatricUseIndicator, newPediatricUseIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPediatricUseIndicator(CodeableConcept newPediatricUseIndicator) {
		if (newPediatricUseIndicator != pediatricUseIndicator) {
			NotificationChain msgs = null;
			if (pediatricUseIndicator != null)
				msgs = ((InternalEObject)pediatricUseIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PEDIATRIC_USE_INDICATOR, null, msgs);
			if (newPediatricUseIndicator != null)
				msgs = ((InternalEObject)newPediatricUseIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PEDIATRIC_USE_INDICATOR, null, msgs);
			msgs = basicSetPediatricUseIndicator(newPediatricUseIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PEDIATRIC_USE_INDICATOR, newPediatricUseIndicator, newPediatricUseIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketingStatus> getMarketingStatus() {
		if (marketingStatus == null) {
			marketingStatus = new EObjectContainmentEList<MarketingStatus>(MarketingStatus.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MARKETING_STATUS);
		}
		return marketingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPackagedMedicinalProduct() {
		if (packagedMedicinalProduct == null) {
			packagedMedicinalProduct = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PACKAGED_MEDICINAL_PRODUCT);
		}
		return packagedMedicinalProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getComprisedOf() {
		if (comprisedOf == null) {
			comprisedOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMPRISED_OF);
		}
		return comprisedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getImpurity() {
		if (impurity == null) {
			impurity = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IMPURITY);
		}
		return impurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAttachedDocument() {
		if (attachedDocument == null) {
			attachedDocument = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ATTACHED_DOCUMENT);
		}
		return attachedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getMasterFile() {
		if (masterFile == null) {
			masterFile = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MASTER_FILE);
		}
		return masterFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductDefinitionContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<MedicinalProductDefinitionContact>(MedicinalProductDefinitionContact.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getClinicalTrial() {
		if (clinicalTrial == null) {
			clinicalTrial = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLINICAL_TRIAL);
		}
		return clinicalTrial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductDefinitionName> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<MedicinalProductDefinitionName>(MedicinalProductDefinitionName.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductDefinitionCrossReference> getCrossReference() {
		if (crossReference == null) {
			crossReference = new EObjectContainmentEList<MedicinalProductDefinitionCrossReference>(MedicinalProductDefinitionCrossReference.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CROSS_REFERENCE);
		}
		return crossReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductDefinitionOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<MedicinalProductDefinitionOperation>(MedicinalProductDefinitionOperation.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductDefinitionCharacteristic> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<MedicinalProductDefinitionCharacteristic>(MedicinalProductDefinitionCharacteristic.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DOMAIN:
				return basicSetDomain(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				return basicSetCombinedPharmaceuticalDoseForm(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INDICATION:
				return basicSetIndication(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				return basicSetLegalStatusOfSupply(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ADDITIONAL_MONITORING_INDICATOR:
				return basicSetAdditionalMonitoringIndicator(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__SPECIAL_MEASURES:
				return ((InternalEList<?>)getSpecialMeasures()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PEDIATRIC_USE_INDICATOR:
				return basicSetPediatricUseIndicator(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MARKETING_STATUS:
				return ((InternalEList<?>)getMarketingStatus()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PACKAGED_MEDICINAL_PRODUCT:
				return ((InternalEList<?>)getPackagedMedicinalProduct()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMPRISED_OF:
				return ((InternalEList<?>)getComprisedOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IMPURITY:
				return ((InternalEList<?>)getImpurity()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				return ((InternalEList<?>)getAttachedDocument()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MASTER_FILE:
				return ((InternalEList<?>)getMasterFile()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLINICAL_TRIAL:
				return ((InternalEList<?>)getClinicalTrial()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CROSS_REFERENCE:
				return ((InternalEList<?>)getCrossReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DOMAIN:
				return getDomain();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS_DATE:
				return getStatusDate();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				return getCombinedPharmaceuticalDoseForm();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ROUTE:
				return getRoute();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INDICATION:
				return getIndication();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				return getLegalStatusOfSupply();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ADDITIONAL_MONITORING_INDICATOR:
				return getAdditionalMonitoringIndicator();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__SPECIAL_MEASURES:
				return getSpecialMeasures();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PEDIATRIC_USE_INDICATOR:
				return getPediatricUseIndicator();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLASSIFICATION:
				return getClassification();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MARKETING_STATUS:
				return getMarketingStatus();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PACKAGED_MEDICINAL_PRODUCT:
				return getPackagedMedicinalProduct();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMPRISED_OF:
				return getComprisedOf();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INGREDIENT:
				return getIngredient();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IMPURITY:
				return getImpurity();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				return getAttachedDocument();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MASTER_FILE:
				return getMasterFile();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CONTACT:
				return getContact();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLINICAL_TRIAL:
				return getClinicalTrial();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CODE:
				return getCode();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__NAME:
				return getName();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CROSS_REFERENCE:
				return getCrossReference();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__OPERATION:
				return getOperation();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CHARACTERISTIC:
				return getCharacteristic();
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DOMAIN:
				setDomain((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS_DATE:
				setStatusDate((DateTime)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				setCombinedPharmaceuticalDoseForm((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INDICATION:
				setIndication((Markdown)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ADDITIONAL_MONITORING_INDICATOR:
				setAdditionalMonitoringIndicator((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__SPECIAL_MEASURES:
				getSpecialMeasures().clear();
				getSpecialMeasures().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PEDIATRIC_USE_INDICATOR:
				setPediatricUseIndicator((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MARKETING_STATUS:
				getMarketingStatus().clear();
				getMarketingStatus().addAll((Collection<? extends MarketingStatus>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PACKAGED_MEDICINAL_PRODUCT:
				getPackagedMedicinalProduct().clear();
				getPackagedMedicinalProduct().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMPRISED_OF:
				getComprisedOf().clear();
				getComprisedOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IMPURITY:
				getImpurity().clear();
				getImpurity().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				getAttachedDocument().clear();
				getAttachedDocument().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MASTER_FILE:
				getMasterFile().clear();
				getMasterFile().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends MedicinalProductDefinitionContact>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLINICAL_TRIAL:
				getClinicalTrial().clear();
				getClinicalTrial().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__NAME:
				getName().clear();
				getName().addAll((Collection<? extends MedicinalProductDefinitionName>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CROSS_REFERENCE:
				getCrossReference().clear();
				getCrossReference().addAll((Collection<? extends MedicinalProductDefinitionCrossReference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends MedicinalProductDefinitionOperation>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends MedicinalProductDefinitionCharacteristic>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DOMAIN:
				setDomain((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS_DATE:
				setStatusDate((DateTime)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				setCombinedPharmaceuticalDoseForm((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INDICATION:
				setIndication((Markdown)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ADDITIONAL_MONITORING_INDICATOR:
				setAdditionalMonitoringIndicator((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__SPECIAL_MEASURES:
				getSpecialMeasures().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PEDIATRIC_USE_INDICATOR:
				setPediatricUseIndicator((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MARKETING_STATUS:
				getMarketingStatus().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PACKAGED_MEDICINAL_PRODUCT:
				getPackagedMedicinalProduct().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMPRISED_OF:
				getComprisedOf().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IMPURITY:
				getImpurity().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				getAttachedDocument().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MASTER_FILE:
				getMasterFile().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLINICAL_TRIAL:
				getClinicalTrial().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CODE:
				getCode().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__NAME:
				getName().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CROSS_REFERENCE:
				getCrossReference().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__OPERATION:
				getOperation().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CHARACTERISTIC:
				getCharacteristic().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DOMAIN:
				return domain != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__VERSION:
				return version != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__STATUS_DATE:
				return statusDate != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				return combinedPharmaceuticalDoseForm != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ROUTE:
				return route != null && !route.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INDICATION:
				return indication != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				return legalStatusOfSupply != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ADDITIONAL_MONITORING_INDICATOR:
				return additionalMonitoringIndicator != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__SPECIAL_MEASURES:
				return specialMeasures != null && !specialMeasures.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PEDIATRIC_USE_INDICATOR:
				return pediatricUseIndicator != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MARKETING_STATUS:
				return marketingStatus != null && !marketingStatus.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__PACKAGED_MEDICINAL_PRODUCT:
				return packagedMedicinalProduct != null && !packagedMedicinalProduct.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__COMPRISED_OF:
				return comprisedOf != null && !comprisedOf.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__IMPURITY:
				return impurity != null && !impurity.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				return attachedDocument != null && !attachedDocument.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__MASTER_FILE:
				return masterFile != null && !masterFile.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CLINICAL_TRIAL:
				return clinicalTrial != null && !clinicalTrial.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__NAME:
				return name != null && !name.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CROSS_REFERENCE:
				return crossReference != null && !crossReference.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__OPERATION:
				return operation != null && !operation.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductDefinitionImpl
