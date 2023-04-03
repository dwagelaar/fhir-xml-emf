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

import org.hl7.fhir.Address;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseBodySite;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseReviewOutcome;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Add Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getSubdetailSequence <em>Subdetail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getProductOrServiceEnd <em>Product Or Service End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getLocationCodeableConcept <em>Location Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getLocationAddress <em>Location Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getTax <em>Tax</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getReviewOutcome <em>Review Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseAddItemImpl extends BackboneElementImpl implements ClaimResponseAddItem {
	/**
	 * The cached value of the '{@link #getItemSequence() <em>Item Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> itemSequence;

	/**
	 * The cached value of the '{@link #getDetailSequence() <em>Detail Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> detailSequence;

	/**
	 * The cached value of the '{@link #getSubdetailSequence() <em>Subdetail Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdetailSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> subdetailSequence;

	/**
	 * The cached value of the '{@link #getTraceNumber() <em>Trace Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> traceNumber;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> provider;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept revenue;

	/**
	 * The cached value of the '{@link #getProductOrService() <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrService()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productOrService;

	/**
	 * The cached value of the '{@link #getProductOrServiceEnd() <em>Product Or Service End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrServiceEnd()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productOrServiceEnd;

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
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modifier;

	/**
	 * The cached value of the '{@link #getProgramCode() <em>Program Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> programCode;

	/**
	 * The cached value of the '{@link #getServicedDate() <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedDate()
	 * @generated
	 * @ordered
	 */
	protected Date servicedDate;

	/**
	 * The cached value of the '{@link #getServicedPeriod() <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period servicedPeriod;

	/**
	 * The cached value of the '{@link #getLocationCodeableConcept() <em>Location Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept locationCodeableConcept;

	/**
	 * The cached value of the '{@link #getLocationAddress() <em>Location Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationAddress()
	 * @generated
	 * @ordered
	 */
	protected Address locationAddress;

	/**
	 * The cached value of the '{@link #getLocationReference() <em>Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference locationReference;

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
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getTax() <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax()
	 * @generated
	 * @ordered
	 */
	protected Money tax;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseBodySite> bodySite;

	/**
	 * The cached value of the '{@link #getNoteNumber() <em>Note Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumber;

	/**
	 * The cached value of the '{@link #getReviewOutcome() <em>Review Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOutcome()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponseReviewOutcome reviewOutcome;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAdjudication> adjudication;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseDetail1> detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseAddItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponseAddItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getItemSequence() {
		if (itemSequence == null) {
			itemSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE);
		}
		return itemSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getDetailSequence() {
		if (detailSequence == null) {
			detailSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE);
		}
		return detailSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getSubdetailSequence() {
		if (subdetailSequence == null) {
			subdetailSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE);
		}
		return subdetailSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getTraceNumber() {
		if (traceNumber == null) {
			traceNumber = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TRACE_NUMBER);
		}
		return traceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getProvider() {
		if (provider == null) {
			provider = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROVIDER);
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevenue(CodeableConcept newRevenue, NotificationChain msgs) {
		CodeableConcept oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVENUE, oldRevenue, newRevenue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevenue(CodeableConcept newRevenue) {
		if (newRevenue != revenue) {
			NotificationChain msgs = null;
			if (revenue != null)
				msgs = ((InternalEObject)revenue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVENUE, null, msgs);
			if (newRevenue != null)
				msgs = ((InternalEObject)newRevenue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVENUE, null, msgs);
			msgs = basicSetRevenue(newRevenue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVENUE, newRevenue, newRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getProductOrService() {
		return productOrService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOrService(CodeableConcept newProductOrService, NotificationChain msgs) {
		CodeableConcept oldProductOrService = productOrService;
		productOrService = newProductOrService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductOrService(CodeableConcept newProductOrService) {
		if (newProductOrService != productOrService) {
			NotificationChain msgs = null;
			if (productOrService != null)
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getProductOrServiceEnd() {
		return productOrServiceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOrServiceEnd(CodeableConcept newProductOrServiceEnd, NotificationChain msgs) {
		CodeableConcept oldProductOrServiceEnd = productOrServiceEnd;
		productOrServiceEnd = newProductOrServiceEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE_END, oldProductOrServiceEnd, newProductOrServiceEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductOrServiceEnd(CodeableConcept newProductOrServiceEnd) {
		if (newProductOrServiceEnd != productOrServiceEnd) {
			NotificationChain msgs = null;
			if (productOrServiceEnd != null)
				msgs = ((InternalEObject)productOrServiceEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE_END, null, msgs);
			if (newProductOrServiceEnd != null)
				msgs = ((InternalEObject)newProductOrServiceEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE_END, null, msgs);
			msgs = basicSetProductOrServiceEnd(newProductOrServiceEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE_END, newProductOrServiceEnd, newProductOrServiceEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRequest() {
		if (request == null) {
			request = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REQUEST);
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getProgramCode() {
		if (programCode == null) {
			programCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROGRAM_CODE);
		}
		return programCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getServicedDate() {
		return servicedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedDate(Date newServicedDate, NotificationChain msgs) {
		Date oldServicedDate = servicedDate;
		servicedDate = newServicedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_DATE, oldServicedDate, newServicedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedDate(Date newServicedDate) {
		if (newServicedDate != servicedDate) {
			NotificationChain msgs = null;
			if (servicedDate != null)
				msgs = ((InternalEObject)servicedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_DATE, null, msgs);
			if (newServicedDate != null)
				msgs = ((InternalEObject)newServicedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_DATE, null, msgs);
			msgs = basicSetServicedDate(newServicedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_DATE, newServicedDate, newServicedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getServicedPeriod() {
		return servicedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedPeriod(Period newServicedPeriod, NotificationChain msgs) {
		Period oldServicedPeriod = servicedPeriod;
		servicedPeriod = newServicedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_PERIOD, oldServicedPeriod, newServicedPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedPeriod(Period newServicedPeriod) {
		if (newServicedPeriod != servicedPeriod) {
			NotificationChain msgs = null;
			if (servicedPeriod != null)
				msgs = ((InternalEObject)servicedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_PERIOD, null, msgs);
			if (newServicedPeriod != null)
				msgs = ((InternalEObject)newServicedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_PERIOD, null, msgs);
			msgs = basicSetServicedPeriod(newServicedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_PERIOD, newServicedPeriod, newServicedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getLocationCodeableConcept() {
		return locationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationCodeableConcept(CodeableConcept newLocationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldLocationCodeableConcept = locationCodeableConcept;
		locationCodeableConcept = newLocationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_CODEABLE_CONCEPT, oldLocationCodeableConcept, newLocationCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationCodeableConcept(CodeableConcept newLocationCodeableConcept) {
		if (newLocationCodeableConcept != locationCodeableConcept) {
			NotificationChain msgs = null;
			if (locationCodeableConcept != null)
				msgs = ((InternalEObject)locationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_CODEABLE_CONCEPT, null, msgs);
			if (newLocationCodeableConcept != null)
				msgs = ((InternalEObject)newLocationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetLocationCodeableConcept(newLocationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_CODEABLE_CONCEPT, newLocationCodeableConcept, newLocationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getLocationAddress() {
		return locationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationAddress(Address newLocationAddress, NotificationChain msgs) {
		Address oldLocationAddress = locationAddress;
		locationAddress = newLocationAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_ADDRESS, oldLocationAddress, newLocationAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationAddress(Address newLocationAddress) {
		if (newLocationAddress != locationAddress) {
			NotificationChain msgs = null;
			if (locationAddress != null)
				msgs = ((InternalEObject)locationAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_ADDRESS, null, msgs);
			if (newLocationAddress != null)
				msgs = ((InternalEObject)newLocationAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_ADDRESS, null, msgs);
			msgs = basicSetLocationAddress(newLocationAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_ADDRESS, newLocationAddress, newLocationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocationReference() {
		return locationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationReference(Reference newLocationReference, NotificationChain msgs) {
		Reference oldLocationReference = locationReference;
		locationReference = newLocationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_REFERENCE, oldLocationReference, newLocationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationReference(Reference newLocationReference) {
		if (newLocationReference != locationReference) {
			NotificationChain msgs = null;
			if (locationReference != null)
				msgs = ((InternalEObject)locationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_REFERENCE, null, msgs);
			if (newLocationReference != null)
				msgs = ((InternalEObject)newLocationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_REFERENCE, null, msgs);
			msgs = basicSetLocationReference(newLocationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_REFERENCE, newLocationReference, newLocationReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__UNIT_PRICE, oldUnitPrice, newUnitPrice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FACTOR, oldFactor, newFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTax() {
		return tax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTax(Money newTax, NotificationChain msgs) {
		Money oldTax = tax;
		tax = newTax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TAX, oldTax, newTax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTax(Money newTax) {
		if (newTax != tax) {
			NotificationChain msgs = null;
			if (tax != null)
				msgs = ((InternalEObject)tax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TAX, null, msgs);
			if (newTax != null)
				msgs = ((InternalEObject)newTax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TAX, null, msgs);
			msgs = basicSetTax(newTax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TAX, newTax, newTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Money newNet, NotificationChain msgs) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NET, oldNet, newNet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseBodySite> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<ClaimResponseBodySite>(ClaimResponseBodySite.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__BODY_SITE);
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumber() {
		if (noteNumber == null) {
			noteNumber = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER);
		}
		return noteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseReviewOutcome getReviewOutcome() {
		return reviewOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewOutcome(ClaimResponseReviewOutcome newReviewOutcome, NotificationChain msgs) {
		ClaimResponseReviewOutcome oldReviewOutcome = reviewOutcome;
		reviewOutcome = newReviewOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVIEW_OUTCOME, oldReviewOutcome, newReviewOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReviewOutcome(ClaimResponseReviewOutcome newReviewOutcome) {
		if (newReviewOutcome != reviewOutcome) {
			NotificationChain msgs = null;
			if (reviewOutcome != null)
				msgs = ((InternalEObject)reviewOutcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVIEW_OUTCOME, null, msgs);
			if (newReviewOutcome != null)
				msgs = ((InternalEObject)newReviewOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVIEW_OUTCOME, null, msgs);
			msgs = basicSetReviewOutcome(newReviewOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVIEW_OUTCOME, newReviewOutcome, newReviewOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAdjudication> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ClaimResponseAdjudication>(ClaimResponseAdjudication.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseDetail1> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<ClaimResponseDetail1>(ClaimResponseDetail1.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				return ((InternalEList<?>)getItemSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				return ((InternalEList<?>)getDetailSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				return ((InternalEList<?>)getSubdetailSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TRACE_NUMBER:
				return ((InternalEList<?>)getTraceNumber()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROVIDER:
				return ((InternalEList<?>)getProvider()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVENUE:
				return basicSetRevenue(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE_END:
				return basicSetProductOrServiceEnd(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REQUEST:
				return ((InternalEList<?>)getRequest()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROGRAM_CODE:
				return ((InternalEList<?>)getProgramCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_DATE:
				return basicSetServicedDate(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_PERIOD:
				return basicSetServicedPeriod(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_CODEABLE_CONCEPT:
				return basicSetLocationCodeableConcept(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_ADDRESS:
				return basicSetLocationAddress(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_REFERENCE:
				return basicSetLocationReference(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FACTOR:
				return basicSetFactor(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TAX:
				return basicSetTax(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NET:
				return basicSetNet(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumber()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVIEW_OUTCOME:
				return basicSetReviewOutcome(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				return getItemSequence();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				return getDetailSequence();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				return getSubdetailSequence();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TRACE_NUMBER:
				return getTraceNumber();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROVIDER:
				return getProvider();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVENUE:
				return getRevenue();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE_END:
				return getProductOrServiceEnd();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REQUEST:
				return getRequest();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				return getModifier();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROGRAM_CODE:
				return getProgramCode();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_DATE:
				return getServicedDate();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_PERIOD:
				return getServicedPeriod();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_CODEABLE_CONCEPT:
				return getLocationCodeableConcept();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_ADDRESS:
				return getLocationAddress();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_REFERENCE:
				return getLocationReference();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__QUANTITY:
				return getQuantity();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__UNIT_PRICE:
				return getUnitPrice();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FACTOR:
				return getFactor();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TAX:
				return getTax();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NET:
				return getNet();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__BODY_SITE:
				return getBodySite();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				return getNoteNumber();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVIEW_OUTCOME:
				return getReviewOutcome();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				return getAdjudication();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				return getDetail();
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				getItemSequence().clear();
				getItemSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				getDetailSequence().clear();
				getDetailSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				getSubdetailSequence().clear();
				getSubdetailSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TRACE_NUMBER:
				getTraceNumber().clear();
				getTraceNumber().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROVIDER:
				getProvider().clear();
				getProvider().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVENUE:
				setRevenue((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE_END:
				setProductOrServiceEnd((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROGRAM_CODE:
				getProgramCode().clear();
				getProgramCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_DATE:
				setServicedDate((Date)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_PERIOD:
				setServicedPeriod((Period)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_CODEABLE_CONCEPT:
				setLocationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_ADDRESS:
				setLocationAddress((Address)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_REFERENCE:
				setLocationReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TAX:
				setTax((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NET:
				setNet((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends ClaimResponseBodySite>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				getNoteNumber().clear();
				getNoteNumber().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVIEW_OUTCOME:
				setReviewOutcome((ClaimResponseReviewOutcome)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ClaimResponseAdjudication>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends ClaimResponseDetail1>)newValue);
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				getItemSequence().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				getDetailSequence().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				getSubdetailSequence().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TRACE_NUMBER:
				getTraceNumber().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROVIDER:
				getProvider().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVENUE:
				setRevenue((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE_END:
				setProductOrServiceEnd((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REQUEST:
				getRequest().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				getModifier().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROGRAM_CODE:
				getProgramCode().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_DATE:
				setServicedDate((Date)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_PERIOD:
				setServicedPeriod((Period)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_CODEABLE_CONCEPT:
				setLocationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_ADDRESS:
				setLocationAddress((Address)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_REFERENCE:
				setLocationReference((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TAX:
				setTax((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NET:
				setNet((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__BODY_SITE:
				getBodySite().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				getNoteNumber().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVIEW_OUTCOME:
				setReviewOutcome((ClaimResponseReviewOutcome)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				getAdjudication().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				getDetail().clear();
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				return itemSequence != null && !itemSequence.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				return detailSequence != null && !detailSequence.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				return subdetailSequence != null && !subdetailSequence.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TRACE_NUMBER:
				return traceNumber != null && !traceNumber.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROVIDER:
				return provider != null && !provider.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVENUE:
				return revenue != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PRODUCT_OR_SERVICE_END:
				return productOrServiceEnd != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REQUEST:
				return request != null && !request.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__PROGRAM_CODE:
				return programCode != null && !programCode.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_DATE:
				return servicedDate != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICED_PERIOD:
				return servicedPeriod != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_CODEABLE_CONCEPT:
				return locationCodeableConcept != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_ADDRESS:
				return locationAddress != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__LOCATION_REFERENCE:
				return locationReference != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__QUANTITY:
				return quantity != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__UNIT_PRICE:
				return unitPrice != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FACTOR:
				return factor != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__TAX:
				return tax != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NET:
				return net != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				return noteNumber != null && !noteNumber.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__REVIEW_OUTCOME:
				return reviewOutcome != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				return detail != null && !detail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseAddItemImpl
