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

import org.hl7.emf.fhir.BiologicallyDerivedProduct;
import org.hl7.emf.fhir.BiologicallyDerivedProductCollection;
import org.hl7.emf.fhir.BiologicallyDerivedProductProperty;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.Coding;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Range;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getBiologicalSourceEvent <em>Biological Source Event</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getProcessingFacility <em>Processing Facility</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getDivision <em>Division</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getProductStatus <em>Product Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getStorageTempRequirements <em>Storage Temp Requirements</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductImpl extends DomainResourceImpl implements BiologicallyDerivedProduct {
	/**
	 * The cached value of the '{@link #getProductCategory() <em>Product Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategory()
	 * @generated
	 * @ordered
	 */
	protected Coding productCategory;

	/**
	 * The cached value of the '{@link #getProductCode() <em>Product Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productCode;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> parent;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> request;

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
	 * The cached value of the '{@link #getBiologicalSourceEvent() <em>Biological Source Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiologicalSourceEvent()
	 * @generated
	 * @ordered
	 */
	protected Identifier biologicalSourceEvent;

	/**
	 * The cached value of the '{@link #getProcessingFacility() <em>Processing Facility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> processingFacility;

	/**
	 * The cached value of the '{@link #getDivision() <em>Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivision()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String division;

	/**
	 * The cached value of the '{@link #getProductStatus() <em>Product Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStatus()
	 * @generated
	 * @ordered
	 */
	protected Coding productStatus;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime expirationDate;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductCollection collection;

	/**
	 * The cached value of the '{@link #getStorageTempRequirements() <em>Storage Temp Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageTempRequirements()
	 * @generated
	 * @ordered
	 */
	protected Range storageTempRequirements;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<BiologicallyDerivedProductProperty> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiologicallyDerivedProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBiologicallyDerivedProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getProductCategory() {
		return productCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCategory(Coding newProductCategory, NotificationChain msgs) {
		Coding oldProductCategory = productCategory;
		productCategory = newProductCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, oldProductCategory, newProductCategory);
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
	public void setProductCategory(Coding newProductCategory) {
		if (newProductCategory != productCategory) {
			NotificationChain msgs = null;
			if (productCategory != null)
				msgs = ((InternalEObject)productCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, null, msgs);
			if (newProductCategory != null)
				msgs = ((InternalEObject)newProductCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, null, msgs);
			msgs = basicSetProductCategory(newProductCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, newProductCategory, newProductCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductCode() {
		return productCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCode(CodeableConcept newProductCode, NotificationChain msgs) {
		CodeableConcept oldProductCode = productCode;
		productCode = newProductCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, oldProductCode, newProductCode);
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
	public void setProductCode(CodeableConcept newProductCode) {
		if (newProductCode != productCode) {
			NotificationChain msgs = null;
			if (productCode != null)
				msgs = ((InternalEObject)productCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, null, msgs);
			if (newProductCode != null)
				msgs = ((InternalEObject)newProductCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, null, msgs);
			msgs = basicSetProductCode(newProductCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, newProductCode, newProductCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getParent() {
		if (parent == null) {
			parent = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRequest() {
		if (request == null) {
			request = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST);
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getBiologicalSourceEvent() {
		return biologicalSourceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiologicalSourceEvent(Identifier newBiologicalSourceEvent, NotificationChain msgs) {
		Identifier oldBiologicalSourceEvent = biologicalSourceEvent;
		biologicalSourceEvent = newBiologicalSourceEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__BIOLOGICAL_SOURCE_EVENT, oldBiologicalSourceEvent, newBiologicalSourceEvent);
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
	public void setBiologicalSourceEvent(Identifier newBiologicalSourceEvent) {
		if (newBiologicalSourceEvent != biologicalSourceEvent) {
			NotificationChain msgs = null;
			if (biologicalSourceEvent != null)
				msgs = ((InternalEObject)biologicalSourceEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__BIOLOGICAL_SOURCE_EVENT, null, msgs);
			if (newBiologicalSourceEvent != null)
				msgs = ((InternalEObject)newBiologicalSourceEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__BIOLOGICAL_SOURCE_EVENT, null, msgs);
			msgs = basicSetBiologicalSourceEvent(newBiologicalSourceEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__BIOLOGICAL_SOURCE_EVENT, newBiologicalSourceEvent, newBiologicalSourceEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getProcessingFacility() {
		if (processingFacility == null) {
			processingFacility = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING_FACILITY);
		}
		return processingFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getDivision() {
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivision(org.hl7.emf.fhir.String newDivision, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldDivision = division;
		division = newDivision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__DIVISION, oldDivision, newDivision);
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
	public void setDivision(org.hl7.emf.fhir.String newDivision) {
		if (newDivision != division) {
			NotificationChain msgs = null;
			if (division != null)
				msgs = ((InternalEObject)division).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__DIVISION, null, msgs);
			if (newDivision != null)
				msgs = ((InternalEObject)newDivision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__DIVISION, null, msgs);
			msgs = basicSetDivision(newDivision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__DIVISION, newDivision, newDivision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getProductStatus() {
		return productStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductStatus(Coding newProductStatus, NotificationChain msgs) {
		Coding oldProductStatus = productStatus;
		productStatus = newProductStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_STATUS, oldProductStatus, newProductStatus);
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
	public void setProductStatus(Coding newProductStatus) {
		if (newProductStatus != productStatus) {
			NotificationChain msgs = null;
			if (productStatus != null)
				msgs = ((InternalEObject)productStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_STATUS, null, msgs);
			if (newProductStatus != null)
				msgs = ((InternalEObject)newProductStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_STATUS, null, msgs);
			msgs = basicSetProductStatus(newProductStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_STATUS, newProductStatus, newProductStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationDate(DateTime newExpirationDate, NotificationChain msgs) {
		DateTime oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__EXPIRATION_DATE, oldExpirationDate, newExpirationDate);
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
	public void setExpirationDate(DateTime newExpirationDate) {
		if (newExpirationDate != expirationDate) {
			NotificationChain msgs = null;
			if (expirationDate != null)
				msgs = ((InternalEObject)expirationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__EXPIRATION_DATE, null, msgs);
			if (newExpirationDate != null)
				msgs = ((InternalEObject)newExpirationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__EXPIRATION_DATE, null, msgs);
			msgs = basicSetExpirationDate(newExpirationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__EXPIRATION_DATE, newExpirationDate, newExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductCollection getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(BiologicallyDerivedProductCollection newCollection, NotificationChain msgs) {
		BiologicallyDerivedProductCollection oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, oldCollection, newCollection);
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
	public void setCollection(BiologicallyDerivedProductCollection newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getStorageTempRequirements() {
		return storageTempRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageTempRequirements(Range newStorageTempRequirements, NotificationChain msgs) {
		Range oldStorageTempRequirements = storageTempRequirements;
		storageTempRequirements = newStorageTempRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE_TEMP_REQUIREMENTS, oldStorageTempRequirements, newStorageTempRequirements);
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
	public void setStorageTempRequirements(Range newStorageTempRequirements) {
		if (newStorageTempRequirements != storageTempRequirements) {
			NotificationChain msgs = null;
			if (storageTempRequirements != null)
				msgs = ((InternalEObject)storageTempRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE_TEMP_REQUIREMENTS, null, msgs);
			if (newStorageTempRequirements != null)
				msgs = ((InternalEObject)newStorageTempRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE_TEMP_REQUIREMENTS, null, msgs);
			msgs = basicSetStorageTempRequirements(newStorageTempRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE_TEMP_REQUIREMENTS, newStorageTempRequirements, newStorageTempRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BiologicallyDerivedProductProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<BiologicallyDerivedProductProperty>(BiologicallyDerivedProductProperty.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				return basicSetProductCategory(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				return basicSetProductCode(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				return ((InternalEList<?>)getParent()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				return ((InternalEList<?>)getRequest()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__BIOLOGICAL_SOURCE_EVENT:
				return basicSetBiologicalSourceEvent(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING_FACILITY:
				return ((InternalEList<?>)getProcessingFacility()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__DIVISION:
				return basicSetDivision(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_STATUS:
				return basicSetProductStatus(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__EXPIRATION_DATE:
				return basicSetExpirationDate(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				return basicSetCollection(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE_TEMP_REQUIREMENTS:
				return basicSetStorageTempRequirements(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				return getProductCategory();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				return getProductCode();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				return getParent();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				return getRequest();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__BIOLOGICAL_SOURCE_EVENT:
				return getBiologicalSourceEvent();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING_FACILITY:
				return getProcessingFacility();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__DIVISION:
				return getDivision();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_STATUS:
				return getProductStatus();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__EXPIRATION_DATE:
				return getExpirationDate();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				return getCollection();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE_TEMP_REQUIREMENTS:
				return getStorageTempRequirements();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROPERTY:
				return getProperty();
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((Coding)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				setProductCode((CodeableConcept)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__BIOLOGICAL_SOURCE_EVENT:
				setBiologicalSourceEvent((Identifier)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING_FACILITY:
				getProcessingFacility().clear();
				getProcessingFacility().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__DIVISION:
				setDivision((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_STATUS:
				setProductStatus((Coding)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__EXPIRATION_DATE:
				setExpirationDate((DateTime)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				setCollection((BiologicallyDerivedProductCollection)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE_TEMP_REQUIREMENTS:
				setStorageTempRequirements((Range)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends BiologicallyDerivedProductProperty>)newValue);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((Coding)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				setProductCode((CodeableConcept)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				getParent().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				getRequest().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__BIOLOGICAL_SOURCE_EVENT:
				setBiologicalSourceEvent((Identifier)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING_FACILITY:
				getProcessingFacility().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__DIVISION:
				setDivision((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_STATUS:
				setProductStatus((Coding)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__EXPIRATION_DATE:
				setExpirationDate((DateTime)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				setCollection((BiologicallyDerivedProductCollection)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE_TEMP_REQUIREMENTS:
				setStorageTempRequirements((Range)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROPERTY:
				getProperty().clear();
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				return productCategory != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				return productCode != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				return parent != null && !parent.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				return request != null && !request.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__BIOLOGICAL_SOURCE_EVENT:
				return biologicalSourceEvent != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING_FACILITY:
				return processingFacility != null && !processingFacility.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__DIVISION:
				return division != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_STATUS:
				return productStatus != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__EXPIRATION_DATE:
				return expirationDate != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				return collection != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE_TEMP_REQUIREMENTS:
				return storageTempRequirements != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROPERTY:
				return property != null && !property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductImpl
