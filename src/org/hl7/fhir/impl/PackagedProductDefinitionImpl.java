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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MarketingStatus;
import org.hl7.fhir.PackagedProductDefinition;
import org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply;
import org.hl7.fhir.PackagedProductDefinitionPackaging;
import org.hl7.fhir.PackagedProductDefinitionProperty;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaged Product Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getPackageFor <em>Package For</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getContainedItemQuantity <em>Contained Item Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getMarketingStatus <em>Marketing Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getCopackagedIndicator <em>Copackaged Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getAttachedDocument <em>Attached Document</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionImpl#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackagedProductDefinitionImpl extends DomainResourceImpl implements PackagedProductDefinition {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

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
	 * The cached value of the '{@link #getPackageFor() <em>Package For</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> packageFor;

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
	 * The cached value of the '{@link #getContainedItemQuantity() <em>Contained Item Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedItemQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> containedItemQuantity;

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
	 * The cached value of the '{@link #getLegalStatusOfSupply() <em>Legal Status Of Supply</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 * @ordered
	 */
	protected EList<PackagedProductDefinitionLegalStatusOfSupply> legalStatusOfSupply;

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
	 * The cached value of the '{@link #getCopackagedIndicator() <em>Copackaged Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopackagedIndicator()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean copackagedIndicator;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturer;

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
	 * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackaging()
	 * @generated
	 * @ordered
	 */
	protected PackagedProductDefinitionPackaging packaging;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<PackagedProductDefinitionProperty> characteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagedProductDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPackagedProductDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPackageFor() {
		if (packageFor == null) {
			packageFor = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGE_FOR);
		}
		return packageFor;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS_DATE, oldStatusDate, newStatusDate);
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
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS_DATE, newStatusDate, newStatusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantity> getContainedItemQuantity() {
		if (containedItemQuantity == null) {
			containedItemQuantity = new EObjectContainmentEList<Quantity>(Quantity.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION__CONTAINED_ITEM_QUANTITY);
		}
		return containedItemQuantity;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackagedProductDefinitionLegalStatusOfSupply> getLegalStatusOfSupply() {
		if (legalStatusOfSupply == null) {
			legalStatusOfSupply = new EObjectContainmentEList<PackagedProductDefinitionLegalStatusOfSupply>(PackagedProductDefinitionLegalStatusOfSupply.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY);
		}
		return legalStatusOfSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketingStatus> getMarketingStatus() {
		if (marketingStatus == null) {
			marketingStatus = new EObjectContainmentEList<MarketingStatus>(MarketingStatus.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION__MARKETING_STATUS);
		}
		return marketingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getCopackagedIndicator() {
		return copackagedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopackagedIndicator(org.hl7.fhir.Boolean newCopackagedIndicator, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldCopackagedIndicator = copackagedIndicator;
		copackagedIndicator = newCopackagedIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__COPACKAGED_INDICATOR, oldCopackagedIndicator, newCopackagedIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopackagedIndicator(org.hl7.fhir.Boolean newCopackagedIndicator) {
		if (newCopackagedIndicator != copackagedIndicator) {
			NotificationChain msgs = null;
			if (copackagedIndicator != null)
				msgs = ((InternalEObject)copackagedIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__COPACKAGED_INDICATOR, null, msgs);
			if (newCopackagedIndicator != null)
				msgs = ((InternalEObject)newCopackagedIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__COPACKAGED_INDICATOR, null, msgs);
			msgs = basicSetCopackagedIndicator(newCopackagedIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__COPACKAGED_INDICATOR, newCopackagedIndicator, newCopackagedIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAttachedDocument() {
		if (attachedDocument == null) {
			attachedDocument = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION__ATTACHED_DOCUMENT);
		}
		return attachedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagedProductDefinitionPackaging getPackaging() {
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackaging(PackagedProductDefinitionPackaging newPackaging, NotificationChain msgs) {
		PackagedProductDefinitionPackaging oldPackaging = packaging;
		packaging = newPackaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGING, oldPackaging, newPackaging);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackaging(PackagedProductDefinitionPackaging newPackaging) {
		if (newPackaging != packaging) {
			NotificationChain msgs = null;
			if (packaging != null)
				msgs = ((InternalEObject)packaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGING, null, msgs);
			if (newPackaging != null)
				msgs = ((InternalEObject)newPackaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGING, null, msgs);
			msgs = basicSetPackaging(newPackaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGING, newPackaging, newPackaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackagedProductDefinitionProperty> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<PackagedProductDefinitionProperty>(PackagedProductDefinitionProperty.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION__CHARACTERISTIC);
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGE_FOR:
				return ((InternalEList<?>)getPackageFor()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CONTAINED_ITEM_QUANTITY:
				return ((InternalEList<?>)getContainedItemQuantity()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				return ((InternalEList<?>)getLegalStatusOfSupply()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MARKETING_STATUS:
				return ((InternalEList<?>)getMarketingStatus()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__COPACKAGED_INDICATOR:
				return basicSetCopackagedIndicator(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				return ((InternalEList<?>)getAttachedDocument()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGING:
				return basicSetPackaging(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CHARACTERISTIC:
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__NAME:
				return getName();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__TYPE:
				return getType();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGE_FOR:
				return getPackageFor();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS_DATE:
				return getStatusDate();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CONTAINED_ITEM_QUANTITY:
				return getContainedItemQuantity();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				return getLegalStatusOfSupply();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MARKETING_STATUS:
				return getMarketingStatus();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__COPACKAGED_INDICATOR:
				return getCopackagedIndicator();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				return getAttachedDocument();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGING:
				return getPackaging();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CHARACTERISTIC:
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGE_FOR:
				getPackageFor().clear();
				getPackageFor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS_DATE:
				setStatusDate((DateTime)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CONTAINED_ITEM_QUANTITY:
				getContainedItemQuantity().clear();
				getContainedItemQuantity().addAll((Collection<? extends Quantity>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				getLegalStatusOfSupply().clear();
				getLegalStatusOfSupply().addAll((Collection<? extends PackagedProductDefinitionLegalStatusOfSupply>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MARKETING_STATUS:
				getMarketingStatus().clear();
				getMarketingStatus().addAll((Collection<? extends MarketingStatus>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__COPACKAGED_INDICATOR:
				setCopackagedIndicator((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				getAttachedDocument().clear();
				getAttachedDocument().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGING:
				setPackaging((PackagedProductDefinitionPackaging)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends PackagedProductDefinitionProperty>)newValue);
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGE_FOR:
				getPackageFor().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS_DATE:
				setStatusDate((DateTime)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CONTAINED_ITEM_QUANTITY:
				getContainedItemQuantity().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				getLegalStatusOfSupply().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MARKETING_STATUS:
				getMarketingStatus().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__COPACKAGED_INDICATOR:
				setCopackagedIndicator((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				getAttachedDocument().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGING:
				setPackaging((PackagedProductDefinitionPackaging)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CHARACTERISTIC:
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__NAME:
				return name != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__TYPE:
				return type != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGE_FOR:
				return packageFor != null && !packageFor.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__STATUS_DATE:
				return statusDate != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CONTAINED_ITEM_QUANTITY:
				return containedItemQuantity != null && !containedItemQuantity.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__LEGAL_STATUS_OF_SUPPLY:
				return legalStatusOfSupply != null && !legalStatusOfSupply.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MARKETING_STATUS:
				return marketingStatus != null && !marketingStatus.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__COPACKAGED_INDICATOR:
				return copackagedIndicator != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__ATTACHED_DOCUMENT:
				return attachedDocument != null && !attachedDocument.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__PACKAGING:
				return packaging != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackagedProductDefinitionImpl
