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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestParameter;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getDeliverFor <em>Deliver For</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getDeliverFrom <em>Deliver From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyRequestImpl#getDeliverTo <em>Deliver To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyRequestImpl extends DomainResourceImpl implements SupplyRequest {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SupplyRequestStatus status;

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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected RequestPriority priority;

	/**
	 * The cached value of the '{@link #getDeliverFor() <em>Deliver For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverFor()
	 * @generated
	 * @ordered
	 */
	protected Reference deliverFor;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference item;

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
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyRequestParameter> parameter;

	/**
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurrencePeriod() <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurrencePeriod;

	/**
	 * The cached value of the '{@link #getOccurrenceTiming() <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing occurrenceTiming;

	/**
	 * The cached value of the '{@link #getAuthoredOn() <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime authoredOn;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Reference requester;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supplier;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> reason;

	/**
	 * The cached value of the '{@link #getDeliverFrom() <em>Deliver From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverFrom()
	 * @generated
	 * @ordered
	 */
	protected Reference deliverFrom;

	/**
	 * The cached value of the '{@link #getDeliverTo() <em>Deliver To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverTo()
	 * @generated
	 * @ordered
	 */
	protected Reference deliverTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSupplyRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SUPPLY_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(SupplyRequestStatus newStatus, NotificationChain msgs) {
		SupplyRequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(SupplyRequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUPPLY_REQUEST__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(RequestPriority newPriority, NotificationChain msgs) {
		RequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(RequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDeliverFor() {
		return deliverFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliverFor(Reference newDeliverFor, NotificationChain msgs) {
		Reference oldDeliverFor = deliverFor;
		deliverFor = newDeliverFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__DELIVER_FOR, oldDeliverFor, newDeliverFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliverFor(Reference newDeliverFor) {
		if (newDeliverFor != deliverFor) {
			NotificationChain msgs = null;
			if (deliverFor != null)
				msgs = ((InternalEObject)deliverFor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__DELIVER_FOR, null, msgs);
			if (newDeliverFor != null)
				msgs = ((InternalEObject)newDeliverFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__DELIVER_FOR, null, msgs);
			msgs = basicSetDeliverFor(newDeliverFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__DELIVER_FOR, newDeliverFor, newDeliverFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(CodeableReference newItem, NotificationChain msgs) {
		CodeableReference oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__ITEM, oldItem, newItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(CodeableReference newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplyRequestParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<SupplyRequestParameter>(SupplyRequestParameter.class, this, FhirPackage.SUPPLY_REQUEST__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getOccurrencePeriod() {
		return occurrencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencePeriod(Period newOccurrencePeriod, NotificationChain msgs) {
		Period oldOccurrencePeriod = occurrencePeriod;
		occurrencePeriod = newOccurrencePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__OCCURRENCE_PERIOD, oldOccurrencePeriod, newOccurrencePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencePeriod(Period newOccurrencePeriod) {
		if (newOccurrencePeriod != occurrencePeriod) {
			NotificationChain msgs = null;
			if (occurrencePeriod != null)
				msgs = ((InternalEObject)occurrencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__OCCURRENCE_PERIOD, null, msgs);
			if (newOccurrencePeriod != null)
				msgs = ((InternalEObject)newOccurrencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__OCCURRENCE_PERIOD, null, msgs);
			msgs = basicSetOccurrencePeriod(newOccurrencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__OCCURRENCE_PERIOD, newOccurrencePeriod, newOccurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getOccurrenceTiming() {
		return occurrenceTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceTiming(Timing newOccurrenceTiming, NotificationChain msgs) {
		Timing oldOccurrenceTiming = occurrenceTiming;
		occurrenceTiming = newOccurrenceTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__OCCURRENCE_TIMING, oldOccurrenceTiming, newOccurrenceTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceTiming(Timing newOccurrenceTiming) {
		if (newOccurrenceTiming != occurrenceTiming) {
			NotificationChain msgs = null;
			if (occurrenceTiming != null)
				msgs = ((InternalEObject)occurrenceTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__OCCURRENCE_TIMING, null, msgs);
			if (newOccurrenceTiming != null)
				msgs = ((InternalEObject)newOccurrenceTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__OCCURRENCE_TIMING, null, msgs);
			msgs = basicSetOccurrenceTiming(newOccurrenceTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__OCCURRENCE_TIMING, newOccurrenceTiming, newOccurrenceTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthoredOn() {
		return authoredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoredOn(DateTime newAuthoredOn, NotificationChain msgs) {
		DateTime oldAuthoredOn = authoredOn;
		authoredOn = newAuthoredOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoredOn(DateTime newAuthoredOn) {
		if (newAuthoredOn != authoredOn) {
			NotificationChain msgs = null;
			if (authoredOn != null)
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(Reference newRequester, NotificationChain msgs) {
		Reference oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Reference newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupplier() {
		if (supplier == null) {
			supplier = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUPPLY_REQUEST__SUPPLIER);
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.SUPPLY_REQUEST__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDeliverFrom() {
		return deliverFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliverFrom(Reference newDeliverFrom, NotificationChain msgs) {
		Reference oldDeliverFrom = deliverFrom;
		deliverFrom = newDeliverFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__DELIVER_FROM, oldDeliverFrom, newDeliverFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliverFrom(Reference newDeliverFrom) {
		if (newDeliverFrom != deliverFrom) {
			NotificationChain msgs = null;
			if (deliverFrom != null)
				msgs = ((InternalEObject)deliverFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__DELIVER_FROM, null, msgs);
			if (newDeliverFrom != null)
				msgs = ((InternalEObject)newDeliverFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__DELIVER_FROM, null, msgs);
			msgs = basicSetDeliverFrom(newDeliverFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__DELIVER_FROM, newDeliverFrom, newDeliverFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDeliverTo() {
		return deliverTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliverTo(Reference newDeliverTo, NotificationChain msgs) {
		Reference oldDeliverTo = deliverTo;
		deliverTo = newDeliverTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__DELIVER_TO, oldDeliverTo, newDeliverTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliverTo(Reference newDeliverTo) {
		if (newDeliverTo != deliverTo) {
			NotificationChain msgs = null;
			if (deliverTo != null)
				msgs = ((InternalEObject)deliverTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__DELIVER_TO, null, msgs);
			if (newDeliverTo != null)
				msgs = ((InternalEObject)newDeliverTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_REQUEST__DELIVER_TO, null, msgs);
			msgs = basicSetDeliverTo(newDeliverTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_REQUEST__DELIVER_TO, newDeliverTo, newDeliverTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUPPLY_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUPPLY_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUPPLY_REQUEST__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FOR:
				return basicSetDeliverFor(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__ITEM:
				return basicSetItem(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_PERIOD:
				return basicSetOccurrencePeriod(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_TIMING:
				return basicSetOccurrenceTiming(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__SUPPLIER:
				return ((InternalEList<?>)getSupplier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUPPLY_REQUEST__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FROM:
				return basicSetDeliverFrom(null, msgs);
			case FhirPackage.SUPPLY_REQUEST__DELIVER_TO:
				return basicSetDeliverTo(null, msgs);
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
			case FhirPackage.SUPPLY_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUPPLY_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.SUPPLY_REQUEST__BASED_ON:
				return getBasedOn();
			case FhirPackage.SUPPLY_REQUEST__CATEGORY:
				return getCategory();
			case FhirPackage.SUPPLY_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FOR:
				return getDeliverFor();
			case FhirPackage.SUPPLY_REQUEST__ITEM:
				return getItem();
			case FhirPackage.SUPPLY_REQUEST__QUANTITY:
				return getQuantity();
			case FhirPackage.SUPPLY_REQUEST__PARAMETER:
				return getParameter();
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_PERIOD:
				return getOccurrencePeriod();
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_TIMING:
				return getOccurrenceTiming();
			case FhirPackage.SUPPLY_REQUEST__AUTHORED_ON:
				return getAuthoredOn();
			case FhirPackage.SUPPLY_REQUEST__REQUESTER:
				return getRequester();
			case FhirPackage.SUPPLY_REQUEST__SUPPLIER:
				return getSupplier();
			case FhirPackage.SUPPLY_REQUEST__REASON:
				return getReason();
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FROM:
				return getDeliverFrom();
			case FhirPackage.SUPPLY_REQUEST__DELIVER_TO:
				return getDeliverTo();
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
			case FhirPackage.SUPPLY_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__STATUS:
				setStatus((SupplyRequestStatus)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__PRIORITY:
				setPriority((RequestPriority)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FOR:
				setDeliverFor((Reference)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__ITEM:
				setItem((CodeableReference)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends SupplyRequestParameter>)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__SUPPLIER:
				getSupplier().clear();
				getSupplier().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FROM:
				setDeliverFrom((Reference)newValue);
				return;
			case FhirPackage.SUPPLY_REQUEST__DELIVER_TO:
				setDeliverTo((Reference)newValue);
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
			case FhirPackage.SUPPLY_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.SUPPLY_REQUEST__STATUS:
				setStatus((SupplyRequestStatus)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.SUPPLY_REQUEST__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__PRIORITY:
				setPriority((RequestPriority)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FOR:
				setDeliverFor((Reference)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__ITEM:
				setItem((CodeableReference)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__PARAMETER:
				getParameter().clear();
				return;
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__SUPPLIER:
				getSupplier().clear();
				return;
			case FhirPackage.SUPPLY_REQUEST__REASON:
				getReason().clear();
				return;
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FROM:
				setDeliverFrom((Reference)null);
				return;
			case FhirPackage.SUPPLY_REQUEST__DELIVER_TO:
				setDeliverTo((Reference)null);
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
			case FhirPackage.SUPPLY_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.SUPPLY_REQUEST__STATUS:
				return status != null;
			case FhirPackage.SUPPLY_REQUEST__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.SUPPLY_REQUEST__CATEGORY:
				return category != null;
			case FhirPackage.SUPPLY_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FOR:
				return deliverFor != null;
			case FhirPackage.SUPPLY_REQUEST__ITEM:
				return item != null;
			case FhirPackage.SUPPLY_REQUEST__QUANTITY:
				return quantity != null;
			case FhirPackage.SUPPLY_REQUEST__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_PERIOD:
				return occurrencePeriod != null;
			case FhirPackage.SUPPLY_REQUEST__OCCURRENCE_TIMING:
				return occurrenceTiming != null;
			case FhirPackage.SUPPLY_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case FhirPackage.SUPPLY_REQUEST__REQUESTER:
				return requester != null;
			case FhirPackage.SUPPLY_REQUEST__SUPPLIER:
				return supplier != null && !supplier.isEmpty();
			case FhirPackage.SUPPLY_REQUEST__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.SUPPLY_REQUEST__DELIVER_FROM:
				return deliverFrom != null;
			case FhirPackage.SUPPLY_REQUEST__DELIVER_TO:
				return deliverTo != null;
		}
		return super.eIsSet(featureID);
	}

} //SupplyRequestImpl
