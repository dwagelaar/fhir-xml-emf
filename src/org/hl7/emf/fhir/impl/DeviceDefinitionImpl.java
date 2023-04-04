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
import org.hl7.emf.fhir.ContactPoint;
import org.hl7.emf.fhir.DeviceDefinition;
import org.hl7.emf.fhir.DeviceDefinitionChargeItem;
import org.hl7.emf.fhir.DeviceDefinitionClassification;
import org.hl7.emf.fhir.DeviceDefinitionConformsTo;
import org.hl7.emf.fhir.DeviceDefinitionCorrectiveAction;
import org.hl7.emf.fhir.DeviceDefinitionDeviceName;
import org.hl7.emf.fhir.DeviceDefinitionGuideline;
import org.hl7.emf.fhir.DeviceDefinitionHasPart;
import org.hl7.emf.fhir.DeviceDefinitionLink;
import org.hl7.emf.fhir.DeviceDefinitionMaterial;
import org.hl7.emf.fhir.DeviceDefinitionPackaging;
import org.hl7.emf.fhir.DeviceDefinitionProperty;
import org.hl7.emf.fhir.DeviceDefinitionRegulatoryIdentifier;
import org.hl7.emf.fhir.DeviceDefinitionUdiDeviceIdentifier;
import org.hl7.emf.fhir.DeviceDefinitionVersion;
import org.hl7.emf.fhir.DeviceProductionIdentifierInUDI;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.ProductShelfLife;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getUdiDeviceIdentifier <em>Udi Device Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getRegulatoryIdentifier <em>Regulatory Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getSafety <em>Safety</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getShelfLifeStorage <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getProductionIdentifierInUDI <em>Production Identifier In UDI</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getCorrectiveAction <em>Corrective Action</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DeviceDefinitionImpl#getChargeItem <em>Charge Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionImpl extends DomainResourceImpl implements DeviceDefinition {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getUdiDeviceIdentifier() <em>Udi Device Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiDeviceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionUdiDeviceIdentifier> udiDeviceIdentifier;

	/**
	 * The cached value of the '{@link #getRegulatoryIdentifier() <em>Regulatory Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionRegulatoryIdentifier> regulatoryIdentifier;

	/**
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String partNumber;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Reference manufacturer;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionDeviceName> deviceName;

	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String modelNumber;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionClassification> classification;

	/**
	 * The cached value of the '{@link #getConformsTo() <em>Conforms To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionConformsTo> conformsTo;

	/**
	 * The cached value of the '{@link #getHasPart() <em>Has Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPart()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionHasPart> hasPart;

	/**
	 * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackaging()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionPackaging> packaging;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionVersion> version;

	/**
	 * The cached value of the '{@link #getSafety() <em>Safety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> safety;

	/**
	 * The cached value of the '{@link #getShelfLifeStorage() <em>Shelf Life Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShelfLifeStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductShelfLife> shelfLifeStorage;

	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> languageCode;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionProperty> property;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Reference owner;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contact;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionLink> link;

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
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionMaterial> material;

	/**
	 * The cached value of the '{@link #getProductionIdentifierInUDI() <em>Production Identifier In UDI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionIdentifierInUDI()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceProductionIdentifierInUDI> productionIdentifierInUDI;

	/**
	 * The cached value of the '{@link #getGuideline() <em>Guideline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideline()
	 * @generated
	 * @ordered
	 */
	protected DeviceDefinitionGuideline guideline;

	/**
	 * The cached value of the '{@link #getCorrectiveAction() <em>Corrective Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectiveAction()
	 * @generated
	 * @ordered
	 */
	protected DeviceDefinitionCorrectiveAction correctiveAction;

	/**
	 * The cached value of the '{@link #getChargeItem() <em>Charge Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeItem()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionChargeItem> chargeItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DEVICE_DEFINITION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionUdiDeviceIdentifier> getUdiDeviceIdentifier() {
		if (udiDeviceIdentifier == null) {
			udiDeviceIdentifier = new EObjectContainmentEList<DeviceDefinitionUdiDeviceIdentifier>(DeviceDefinitionUdiDeviceIdentifier.class, this, FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER);
		}
		return udiDeviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionRegulatoryIdentifier> getRegulatoryIdentifier() {
		if (regulatoryIdentifier == null) {
			regulatoryIdentifier = new EObjectContainmentEList<DeviceDefinitionRegulatoryIdentifier>(DeviceDefinitionRegulatoryIdentifier.class, this, FhirPackage.DEVICE_DEFINITION__REGULATORY_IDENTIFIER);
		}
		return regulatoryIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartNumber(org.hl7.emf.fhir.String newPartNumber, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__PART_NUMBER, oldPartNumber, newPartNumber);
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
	public void setPartNumber(org.hl7.emf.fhir.String newPartNumber) {
		if (newPartNumber != partNumber) {
			NotificationChain msgs = null;
			if (partNumber != null)
				msgs = ((InternalEObject)partNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__PART_NUMBER, null, msgs);
			if (newPartNumber != null)
				msgs = ((InternalEObject)newPartNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__PART_NUMBER, null, msgs);
			msgs = basicSetPartNumber(newPartNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__PART_NUMBER, newPartNumber, newPartNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(Reference newManufacturer, NotificationChain msgs) {
		Reference oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MANUFACTURER, oldManufacturer, newManufacturer);
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
	public void setManufacturer(Reference newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionDeviceName> getDeviceName() {
		if (deviceName == null) {
			deviceName = new EObjectContainmentEList<DeviceDefinitionDeviceName>(DeviceDefinitionDeviceName.class, this, FhirPackage.DEVICE_DEFINITION__DEVICE_NAME);
		}
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getModelNumber() {
		return modelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelNumber(org.hl7.emf.fhir.String newModelNumber, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldModelNumber = modelNumber;
		modelNumber = newModelNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER, oldModelNumber, newModelNumber);
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
	public void setModelNumber(org.hl7.emf.fhir.String newModelNumber) {
		if (newModelNumber != modelNumber) {
			NotificationChain msgs = null;
			if (modelNumber != null)
				msgs = ((InternalEObject)modelNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER, null, msgs);
			if (newModelNumber != null)
				msgs = ((InternalEObject)newModelNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER, null, msgs);
			msgs = basicSetModelNumber(newModelNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER, newModelNumber, newModelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionClassification> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<DeviceDefinitionClassification>(DeviceDefinitionClassification.class, this, FhirPackage.DEVICE_DEFINITION__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionConformsTo> getConformsTo() {
		if (conformsTo == null) {
			conformsTo = new EObjectContainmentEList<DeviceDefinitionConformsTo>(DeviceDefinitionConformsTo.class, this, FhirPackage.DEVICE_DEFINITION__CONFORMS_TO);
		}
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionHasPart> getHasPart() {
		if (hasPart == null) {
			hasPart = new EObjectContainmentEList<DeviceDefinitionHasPart>(DeviceDefinitionHasPart.class, this, FhirPackage.DEVICE_DEFINITION__HAS_PART);
		}
		return hasPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionPackaging> getPackaging() {
		if (packaging == null) {
			packaging = new EObjectContainmentEList<DeviceDefinitionPackaging>(DeviceDefinitionPackaging.class, this, FhirPackage.DEVICE_DEFINITION__PACKAGING);
		}
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionVersion> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<DeviceDefinitionVersion>(DeviceDefinitionVersion.class, this, FhirPackage.DEVICE_DEFINITION__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSafety() {
		if (safety == null) {
			safety = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_DEFINITION__SAFETY);
		}
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductShelfLife> getShelfLifeStorage() {
		if (shelfLifeStorage == null) {
			shelfLifeStorage = new EObjectContainmentEList<ProductShelfLife>(ProductShelfLife.class, this, FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE);
		}
		return shelfLifeStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLanguageCode() {
		if (languageCode == null) {
			languageCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE);
		}
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<DeviceDefinitionProperty>(DeviceDefinitionProperty.class, this, FhirPackage.DEVICE_DEFINITION__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Reference newOwner, NotificationChain msgs) {
		Reference oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__OWNER, oldOwner, newOwner);
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
	public void setOwner(Reference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.DEVICE_DEFINITION__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<DeviceDefinitionLink>(DeviceDefinitionLink.class, this, FhirPackage.DEVICE_DEFINITION__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.DEVICE_DEFINITION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionMaterial> getMaterial() {
		if (material == null) {
			material = new EObjectContainmentEList<DeviceDefinitionMaterial>(DeviceDefinitionMaterial.class, this, FhirPackage.DEVICE_DEFINITION__MATERIAL);
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceProductionIdentifierInUDI> getProductionIdentifierInUDI() {
		if (productionIdentifierInUDI == null) {
			productionIdentifierInUDI = new EObjectContainmentEList<DeviceProductionIdentifierInUDI>(DeviceProductionIdentifierInUDI.class, this, FhirPackage.DEVICE_DEFINITION__PRODUCTION_IDENTIFIER_IN_UDI);
		}
		return productionIdentifierInUDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionGuideline getGuideline() {
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuideline(DeviceDefinitionGuideline newGuideline, NotificationChain msgs) {
		DeviceDefinitionGuideline oldGuideline = guideline;
		guideline = newGuideline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__GUIDELINE, oldGuideline, newGuideline);
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
	public void setGuideline(DeviceDefinitionGuideline newGuideline) {
		if (newGuideline != guideline) {
			NotificationChain msgs = null;
			if (guideline != null)
				msgs = ((InternalEObject)guideline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__GUIDELINE, null, msgs);
			if (newGuideline != null)
				msgs = ((InternalEObject)newGuideline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__GUIDELINE, null, msgs);
			msgs = basicSetGuideline(newGuideline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__GUIDELINE, newGuideline, newGuideline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionCorrectiveAction getCorrectiveAction() {
		return correctiveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrectiveAction(DeviceDefinitionCorrectiveAction newCorrectiveAction, NotificationChain msgs) {
		DeviceDefinitionCorrectiveAction oldCorrectiveAction = correctiveAction;
		correctiveAction = newCorrectiveAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__CORRECTIVE_ACTION, oldCorrectiveAction, newCorrectiveAction);
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
	public void setCorrectiveAction(DeviceDefinitionCorrectiveAction newCorrectiveAction) {
		if (newCorrectiveAction != correctiveAction) {
			NotificationChain msgs = null;
			if (correctiveAction != null)
				msgs = ((InternalEObject)correctiveAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__CORRECTIVE_ACTION, null, msgs);
			if (newCorrectiveAction != null)
				msgs = ((InternalEObject)newCorrectiveAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__CORRECTIVE_ACTION, null, msgs);
			msgs = basicSetCorrectiveAction(newCorrectiveAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__CORRECTIVE_ACTION, newCorrectiveAction, newCorrectiveAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionChargeItem> getChargeItem() {
		if (chargeItem == null) {
			chargeItem = new EObjectContainmentEList<DeviceDefinitionChargeItem>(DeviceDefinitionChargeItem.class, this, FhirPackage.DEVICE_DEFINITION__CHARGE_ITEM);
		}
		return chargeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				return ((InternalEList<?>)getUdiDeviceIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__REGULATORY_IDENTIFIER:
				return ((InternalEList<?>)getRegulatoryIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__PART_NUMBER:
				return basicSetPartNumber(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				return ((InternalEList<?>)getDeviceName()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				return basicSetModelNumber(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__CONFORMS_TO:
				return ((InternalEList<?>)getConformsTo()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__HAS_PART:
				return ((InternalEList<?>)getHasPart()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__PACKAGING:
				return ((InternalEList<?>)getPackaging()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				return ((InternalEList<?>)getSafety()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				return ((InternalEList<?>)getShelfLifeStorage()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				return ((InternalEList<?>)getLanguageCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				return basicSetOwner(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				return ((InternalEList<?>)getMaterial()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__PRODUCTION_IDENTIFIER_IN_UDI:
				return ((InternalEList<?>)getProductionIdentifierInUDI()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__GUIDELINE:
				return basicSetGuideline(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__CORRECTIVE_ACTION:
				return basicSetCorrectiveAction(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__CHARGE_ITEM:
				return ((InternalEList<?>)getChargeItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DEVICE_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				return getUdiDeviceIdentifier();
			case FhirPackage.DEVICE_DEFINITION__REGULATORY_IDENTIFIER:
				return getRegulatoryIdentifier();
			case FhirPackage.DEVICE_DEFINITION__PART_NUMBER:
				return getPartNumber();
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				return getDeviceName();
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				return getModelNumber();
			case FhirPackage.DEVICE_DEFINITION__CLASSIFICATION:
				return getClassification();
			case FhirPackage.DEVICE_DEFINITION__CONFORMS_TO:
				return getConformsTo();
			case FhirPackage.DEVICE_DEFINITION__HAS_PART:
				return getHasPart();
			case FhirPackage.DEVICE_DEFINITION__PACKAGING:
				return getPackaging();
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				return getSafety();
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				return getShelfLifeStorage();
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				return getLanguageCode();
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				return getProperty();
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				return getOwner();
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				return getContact();
			case FhirPackage.DEVICE_DEFINITION__LINK:
				return getLink();
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				return getNote();
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				return getMaterial();
			case FhirPackage.DEVICE_DEFINITION__PRODUCTION_IDENTIFIER_IN_UDI:
				return getProductionIdentifierInUDI();
			case FhirPackage.DEVICE_DEFINITION__GUIDELINE:
				return getGuideline();
			case FhirPackage.DEVICE_DEFINITION__CORRECTIVE_ACTION:
				return getCorrectiveAction();
			case FhirPackage.DEVICE_DEFINITION__CHARGE_ITEM:
				return getChargeItem();
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
			case FhirPackage.DEVICE_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				getUdiDeviceIdentifier().clear();
				getUdiDeviceIdentifier().addAll((Collection<? extends DeviceDefinitionUdiDeviceIdentifier>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__REGULATORY_IDENTIFIER:
				getRegulatoryIdentifier().clear();
				getRegulatoryIdentifier().addAll((Collection<? extends DeviceDefinitionRegulatoryIdentifier>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__PART_NUMBER:
				setPartNumber((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER:
				setManufacturer((Reference)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				getDeviceName().clear();
				getDeviceName().addAll((Collection<? extends DeviceDefinitionDeviceName>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				setModelNumber((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends DeviceDefinitionClassification>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__CONFORMS_TO:
				getConformsTo().clear();
				getConformsTo().addAll((Collection<? extends DeviceDefinitionConformsTo>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__HAS_PART:
				getHasPart().clear();
				getHasPart().addAll((Collection<? extends DeviceDefinitionHasPart>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__PACKAGING:
				getPackaging().clear();
				getPackaging().addAll((Collection<? extends DeviceDefinitionPackaging>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends DeviceDefinitionVersion>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				getSafety().clear();
				getSafety().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				getShelfLifeStorage().clear();
				getShelfLifeStorage().addAll((Collection<? extends ProductShelfLife>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				getLanguageCode().clear();
				getLanguageCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends DeviceDefinitionProperty>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				setOwner((Reference)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends DeviceDefinitionLink>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				getMaterial().clear();
				getMaterial().addAll((Collection<? extends DeviceDefinitionMaterial>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__PRODUCTION_IDENTIFIER_IN_UDI:
				getProductionIdentifierInUDI().clear();
				getProductionIdentifierInUDI().addAll((Collection<? extends DeviceProductionIdentifierInUDI>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__GUIDELINE:
				setGuideline((DeviceDefinitionGuideline)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__CORRECTIVE_ACTION:
				setCorrectiveAction((DeviceDefinitionCorrectiveAction)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__CHARGE_ITEM:
				getChargeItem().clear();
				getChargeItem().addAll((Collection<? extends DeviceDefinitionChargeItem>)newValue);
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
			case FhirPackage.DEVICE_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				getUdiDeviceIdentifier().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__REGULATORY_IDENTIFIER:
				getRegulatoryIdentifier().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__PART_NUMBER:
				setPartNumber((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER:
				setManufacturer((Reference)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				getDeviceName().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				setModelNumber((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__CONFORMS_TO:
				getConformsTo().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__HAS_PART:
				getHasPart().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__PACKAGING:
				getPackaging().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				getVersion().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				getSafety().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				getShelfLifeStorage().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				getLanguageCode().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				setOwner((Reference)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__LINK:
				getLink().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				getNote().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				getMaterial().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__PRODUCTION_IDENTIFIER_IN_UDI:
				getProductionIdentifierInUDI().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__GUIDELINE:
				setGuideline((DeviceDefinitionGuideline)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__CORRECTIVE_ACTION:
				setCorrectiveAction((DeviceDefinitionCorrectiveAction)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__CHARGE_ITEM:
				getChargeItem().clear();
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
			case FhirPackage.DEVICE_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				return udiDeviceIdentifier != null && !udiDeviceIdentifier.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__REGULATORY_IDENTIFIER:
				return regulatoryIdentifier != null && !regulatoryIdentifier.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__PART_NUMBER:
				return partNumber != null;
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER:
				return manufacturer != null;
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				return deviceName != null && !deviceName.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				return modelNumber != null;
			case FhirPackage.DEVICE_DEFINITION__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__CONFORMS_TO:
				return conformsTo != null && !conformsTo.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__HAS_PART:
				return hasPart != null && !hasPart.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__PACKAGING:
				return packaging != null && !packaging.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				return version != null && !version.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				return safety != null && !safety.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				return shelfLifeStorage != null && !shelfLifeStorage.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				return languageCode != null && !languageCode.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				return owner != null;
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__LINK:
				return link != null && !link.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				return material != null && !material.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__PRODUCTION_IDENTIFIER_IN_UDI:
				return productionIdentifierInUDI != null && !productionIdentifierInUDI.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__GUIDELINE:
				return guideline != null;
			case FhirPackage.DEVICE_DEFINITION__CORRECTIVE_ACTION:
				return correctiveAction != null;
			case FhirPackage.DEVICE_DEFINITION__CHARGE_ITEM:
				return chargeItem != null && !chargeItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionImpl
