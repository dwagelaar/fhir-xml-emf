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
import org.hl7.emf.fhir.BiologicallyDerivedProductDispense;
import org.hl7.emf.fhir.BiologicallyDerivedProductDispenseCodes;
import org.hl7.emf.fhir.BiologicallyDerivedProductDispensePerformer;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getOriginRelationshipType <em>Origin Relationship Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getMatchStatus <em>Match Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getPreparedDate <em>Prepared Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BiologicallyDerivedProductDispenseImpl#getUsageInstruction <em>Usage Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductDispenseImpl extends DomainResourceImpl implements BiologicallyDerivedProductDispense {
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
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOf;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductDispenseCodes status;

	/**
	 * The cached value of the '{@link #getOriginRelationshipType() <em>Origin Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept originRelationshipType;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Reference product;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getMatchStatus() <em>Match Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept matchStatus;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<BiologicallyDerivedProductDispensePerformer> performer;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getPreparedDate() <em>Prepared Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparedDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime preparedDate;

	/**
	 * The cached value of the '{@link #getWhenHandedOver() <em>When Handed Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenHandedOver()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenHandedOver;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Reference destination;

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
	 * The cached value of the '{@link #getUsageInstruction() <em>Usage Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String usageInstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiologicallyDerivedProductDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBiologicallyDerivedProductDispense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductDispenseCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(BiologicallyDerivedProductDispenseCodes newStatus, NotificationChain msgs) {
		BiologicallyDerivedProductDispenseCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__STATUS, oldStatus, newStatus);
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
	public void setStatus(BiologicallyDerivedProductDispenseCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOriginRelationshipType() {
		return originRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginRelationshipType(CodeableConcept newOriginRelationshipType, NotificationChain msgs) {
		CodeableConcept oldOriginRelationshipType = originRelationshipType;
		originRelationshipType = newOriginRelationshipType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__ORIGIN_RELATIONSHIP_TYPE, oldOriginRelationshipType, newOriginRelationshipType);
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
	public void setOriginRelationshipType(CodeableConcept newOriginRelationshipType) {
		if (newOriginRelationshipType != originRelationshipType) {
			NotificationChain msgs = null;
			if (originRelationshipType != null)
				msgs = ((InternalEObject)originRelationshipType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__ORIGIN_RELATIONSHIP_TYPE, null, msgs);
			if (newOriginRelationshipType != null)
				msgs = ((InternalEObject)newOriginRelationshipType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__ORIGIN_RELATIONSHIP_TYPE, null, msgs);
			msgs = basicSetOriginRelationshipType(newOriginRelationshipType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__ORIGIN_RELATIONSHIP_TYPE, newOriginRelationshipType, newOriginRelationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Reference newProduct, NotificationChain msgs) {
		Reference oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PRODUCT, oldProduct, newProduct);
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
	public void setProduct(Reference newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PRODUCT, null, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PRODUCT, null, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMatchStatus() {
		return matchStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchStatus(CodeableConcept newMatchStatus, NotificationChain msgs) {
		CodeableConcept oldMatchStatus = matchStatus;
		matchStatus = newMatchStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__MATCH_STATUS, oldMatchStatus, newMatchStatus);
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
	public void setMatchStatus(CodeableConcept newMatchStatus) {
		if (newMatchStatus != matchStatus) {
			NotificationChain msgs = null;
			if (matchStatus != null)
				msgs = ((InternalEObject)matchStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__MATCH_STATUS, null, msgs);
			if (newMatchStatus != null)
				msgs = ((InternalEObject)newMatchStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__MATCH_STATUS, null, msgs);
			msgs = basicSetMatchStatus(newMatchStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__MATCH_STATUS, newMatchStatus, newMatchStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BiologicallyDerivedProductDispensePerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<BiologicallyDerivedProductDispensePerformer>(BiologicallyDerivedProductDispensePerformer.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getPreparedDate() {
		return preparedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreparedDate(DateTime newPreparedDate, NotificationChain msgs) {
		DateTime oldPreparedDate = preparedDate;
		preparedDate = newPreparedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PREPARED_DATE, oldPreparedDate, newPreparedDate);
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
	public void setPreparedDate(DateTime newPreparedDate) {
		if (newPreparedDate != preparedDate) {
			NotificationChain msgs = null;
			if (preparedDate != null)
				msgs = ((InternalEObject)preparedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PREPARED_DATE, null, msgs);
			if (newPreparedDate != null)
				msgs = ((InternalEObject)newPreparedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PREPARED_DATE, null, msgs);
			msgs = basicSetPreparedDate(newPreparedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PREPARED_DATE, newPreparedDate, newPreparedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getWhenHandedOver() {
		return whenHandedOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenHandedOver(DateTime newWhenHandedOver, NotificationChain msgs) {
		DateTime oldWhenHandedOver = whenHandedOver;
		whenHandedOver = newWhenHandedOver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__WHEN_HANDED_OVER, oldWhenHandedOver, newWhenHandedOver);
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
	public void setWhenHandedOver(DateTime newWhenHandedOver) {
		if (newWhenHandedOver != whenHandedOver) {
			NotificationChain msgs = null;
			if (whenHandedOver != null)
				msgs = ((InternalEObject)whenHandedOver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			if (newWhenHandedOver != null)
				msgs = ((InternalEObject)newWhenHandedOver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			msgs = basicSetWhenHandedOver(newWhenHandedOver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__WHEN_HANDED_OVER, newWhenHandedOver, newWhenHandedOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Reference newDestination, NotificationChain msgs) {
		Reference oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(Reference newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getUsageInstruction() {
		return usageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageInstruction(org.hl7.emf.fhir.String newUsageInstruction, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldUsageInstruction = usageInstruction;
		usageInstruction = newUsageInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__USAGE_INSTRUCTION, oldUsageInstruction, newUsageInstruction);
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
	public void setUsageInstruction(org.hl7.emf.fhir.String newUsageInstruction) {
		if (newUsageInstruction != usageInstruction) {
			NotificationChain msgs = null;
			if (usageInstruction != null)
				msgs = ((InternalEObject)usageInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__USAGE_INSTRUCTION, null, msgs);
			if (newUsageInstruction != null)
				msgs = ((InternalEObject)newUsageInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__USAGE_INSTRUCTION, null, msgs);
			msgs = basicSetUsageInstruction(newUsageInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__USAGE_INSTRUCTION, newUsageInstruction, newUsageInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__ORIGIN_RELATIONSHIP_TYPE:
				return basicSetOriginRelationshipType(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PRODUCT:
				return basicSetProduct(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__MATCH_STATUS:
				return basicSetMatchStatus(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PREPARED_DATE:
				return basicSetPreparedDate(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__WHEN_HANDED_OVER:
				return basicSetWhenHandedOver(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__DESTINATION:
				return basicSetDestination(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__USAGE_INSTRUCTION:
				return basicSetUsageInstruction(null, msgs);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__BASED_ON:
				return getBasedOn();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PART_OF:
				return getPartOf();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__STATUS:
				return getStatus();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__ORIGIN_RELATIONSHIP_TYPE:
				return getOriginRelationshipType();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PRODUCT:
				return getProduct();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PATIENT:
				return getPatient();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__MATCH_STATUS:
				return getMatchStatus();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PERFORMER:
				return getPerformer();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__LOCATION:
				return getLocation();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__QUANTITY:
				return getQuantity();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PREPARED_DATE:
				return getPreparedDate();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__WHEN_HANDED_OVER:
				return getWhenHandedOver();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__DESTINATION:
				return getDestination();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__NOTE:
				return getNote();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__USAGE_INSTRUCTION:
				return getUsageInstruction();
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__STATUS:
				setStatus((BiologicallyDerivedProductDispenseCodes)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__ORIGIN_RELATIONSHIP_TYPE:
				setOriginRelationshipType((CodeableConcept)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PRODUCT:
				setProduct((Reference)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__MATCH_STATUS:
				setMatchStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends BiologicallyDerivedProductDispensePerformer>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PREPARED_DATE:
				setPreparedDate((DateTime)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__DESTINATION:
				setDestination((Reference)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__USAGE_INSTRUCTION:
				setUsageInstruction((org.hl7.emf.fhir.String)newValue);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__STATUS:
				setStatus((BiologicallyDerivedProductDispenseCodes)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__ORIGIN_RELATIONSHIP_TYPE:
				setOriginRelationshipType((CodeableConcept)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PRODUCT:
				setProduct((Reference)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__MATCH_STATUS:
				setMatchStatus((CodeableConcept)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PREPARED_DATE:
				setPreparedDate((DateTime)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__DESTINATION:
				setDestination((Reference)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__USAGE_INSTRUCTION:
				setUsageInstruction((org.hl7.emf.fhir.String)null);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__STATUS:
				return status != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__ORIGIN_RELATIONSHIP_TYPE:
				return originRelationshipType != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PRODUCT:
				return product != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PATIENT:
				return patient != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__MATCH_STATUS:
				return matchStatus != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__LOCATION:
				return location != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__QUANTITY:
				return quantity != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__PREPARED_DATE:
				return preparedDate != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__WHEN_HANDED_OVER:
				return whenHandedOver != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__DESTINATION:
				return destination != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE__USAGE_INSTRUCTION:
				return usageInstruction != null;
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductDispenseImpl
