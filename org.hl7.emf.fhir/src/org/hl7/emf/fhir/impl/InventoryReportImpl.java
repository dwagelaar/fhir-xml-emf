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
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.InventoryCountType;
import org.hl7.emf.fhir.InventoryReport;
import org.hl7.emf.fhir.InventoryReportInventoryListing;
import org.hl7.emf.fhir.InventoryReportStatus;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getCountType <em>Count Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getOperationTypeReason <em>Operation Type Reason</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getReportedDateTime <em>Reported Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getReportingPeriod <em>Reporting Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getInventoryListing <em>Inventory Listing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryReportImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryReportImpl extends DomainResourceImpl implements InventoryReport {
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
	protected InventoryReportStatus status;

	/**
	 * The cached value of the '{@link #getCountType() <em>Count Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountType()
	 * @generated
	 * @ordered
	 */
	protected InventoryCountType countType;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept operationType;

	/**
	 * The cached value of the '{@link #getOperationTypeReason() <em>Operation Type Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTypeReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept operationTypeReason;

	/**
	 * The cached value of the '{@link #getReportedDateTime() <em>Reported Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime reportedDateTime;

	/**
	 * The cached value of the '{@link #getReporter() <em>Reporter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporter()
	 * @generated
	 * @ordered
	 */
	protected Reference reporter;

	/**
	 * The cached value of the '{@link #getReportingPeriod() <em>Reporting Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period reportingPeriod;

	/**
	 * The cached value of the '{@link #getInventoryListing() <em>Inventory Listing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryListing()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryReportInventoryListing> inventoryListing;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInventoryReport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.INVENTORY_REPORT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryReportStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(InventoryReportStatus newStatus, NotificationChain msgs) {
		InventoryReportStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__STATUS, oldStatus, newStatus);
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
	public void setStatus(InventoryReportStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryCountType getCountType() {
		return countType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountType(InventoryCountType newCountType, NotificationChain msgs) {
		InventoryCountType oldCountType = countType;
		countType = newCountType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__COUNT_TYPE, oldCountType, newCountType);
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
	public void setCountType(InventoryCountType newCountType) {
		if (newCountType != countType) {
			NotificationChain msgs = null;
			if (countType != null)
				msgs = ((InternalEObject)countType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__COUNT_TYPE, null, msgs);
			if (newCountType != null)
				msgs = ((InternalEObject)newCountType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__COUNT_TYPE, null, msgs);
			msgs = basicSetCountType(newCountType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__COUNT_TYPE, newCountType, newCountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationType(CodeableConcept newOperationType, NotificationChain msgs) {
		CodeableConcept oldOperationType = operationType;
		operationType = newOperationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__OPERATION_TYPE, oldOperationType, newOperationType);
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
	public void setOperationType(CodeableConcept newOperationType) {
		if (newOperationType != operationType) {
			NotificationChain msgs = null;
			if (operationType != null)
				msgs = ((InternalEObject)operationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__OPERATION_TYPE, null, msgs);
			if (newOperationType != null)
				msgs = ((InternalEObject)newOperationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__OPERATION_TYPE, null, msgs);
			msgs = basicSetOperationType(newOperationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__OPERATION_TYPE, newOperationType, newOperationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOperationTypeReason() {
		return operationTypeReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationTypeReason(CodeableConcept newOperationTypeReason, NotificationChain msgs) {
		CodeableConcept oldOperationTypeReason = operationTypeReason;
		operationTypeReason = newOperationTypeReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__OPERATION_TYPE_REASON, oldOperationTypeReason, newOperationTypeReason);
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
	public void setOperationTypeReason(CodeableConcept newOperationTypeReason) {
		if (newOperationTypeReason != operationTypeReason) {
			NotificationChain msgs = null;
			if (operationTypeReason != null)
				msgs = ((InternalEObject)operationTypeReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__OPERATION_TYPE_REASON, null, msgs);
			if (newOperationTypeReason != null)
				msgs = ((InternalEObject)newOperationTypeReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__OPERATION_TYPE_REASON, null, msgs);
			msgs = basicSetOperationTypeReason(newOperationTypeReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__OPERATION_TYPE_REASON, newOperationTypeReason, newOperationTypeReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getReportedDateTime() {
		return reportedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportedDateTime(DateTime newReportedDateTime, NotificationChain msgs) {
		DateTime oldReportedDateTime = reportedDateTime;
		reportedDateTime = newReportedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__REPORTED_DATE_TIME, oldReportedDateTime, newReportedDateTime);
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
	public void setReportedDateTime(DateTime newReportedDateTime) {
		if (newReportedDateTime != reportedDateTime) {
			NotificationChain msgs = null;
			if (reportedDateTime != null)
				msgs = ((InternalEObject)reportedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__REPORTED_DATE_TIME, null, msgs);
			if (newReportedDateTime != null)
				msgs = ((InternalEObject)newReportedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__REPORTED_DATE_TIME, null, msgs);
			msgs = basicSetReportedDateTime(newReportedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__REPORTED_DATE_TIME, newReportedDateTime, newReportedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReporter() {
		return reporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReporter(Reference newReporter, NotificationChain msgs) {
		Reference oldReporter = reporter;
		reporter = newReporter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__REPORTER, oldReporter, newReporter);
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
	public void setReporter(Reference newReporter) {
		if (newReporter != reporter) {
			NotificationChain msgs = null;
			if (reporter != null)
				msgs = ((InternalEObject)reporter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__REPORTER, null, msgs);
			if (newReporter != null)
				msgs = ((InternalEObject)newReporter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__REPORTER, null, msgs);
			msgs = basicSetReporter(newReporter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__REPORTER, newReporter, newReporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getReportingPeriod() {
		return reportingPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportingPeriod(Period newReportingPeriod, NotificationChain msgs) {
		Period oldReportingPeriod = reportingPeriod;
		reportingPeriod = newReportingPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__REPORTING_PERIOD, oldReportingPeriod, newReportingPeriod);
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
	public void setReportingPeriod(Period newReportingPeriod) {
		if (newReportingPeriod != reportingPeriod) {
			NotificationChain msgs = null;
			if (reportingPeriod != null)
				msgs = ((InternalEObject)reportingPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__REPORTING_PERIOD, null, msgs);
			if (newReportingPeriod != null)
				msgs = ((InternalEObject)newReportingPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT__REPORTING_PERIOD, null, msgs);
			msgs = basicSetReportingPeriod(newReportingPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT__REPORTING_PERIOD, newReportingPeriod, newReportingPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InventoryReportInventoryListing> getInventoryListing() {
		if (inventoryListing == null) {
			inventoryListing = new EObjectContainmentEList<InventoryReportInventoryListing>(InventoryReportInventoryListing.class, this, FhirPackage.INVENTORY_REPORT__INVENTORY_LISTING);
		}
		return inventoryListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.INVENTORY_REPORT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INVENTORY_REPORT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.INVENTORY_REPORT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.INVENTORY_REPORT__COUNT_TYPE:
				return basicSetCountType(null, msgs);
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE:
				return basicSetOperationType(null, msgs);
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE_REASON:
				return basicSetOperationTypeReason(null, msgs);
			case FhirPackage.INVENTORY_REPORT__REPORTED_DATE_TIME:
				return basicSetReportedDateTime(null, msgs);
			case FhirPackage.INVENTORY_REPORT__REPORTER:
				return basicSetReporter(null, msgs);
			case FhirPackage.INVENTORY_REPORT__REPORTING_PERIOD:
				return basicSetReportingPeriod(null, msgs);
			case FhirPackage.INVENTORY_REPORT__INVENTORY_LISTING:
				return ((InternalEList<?>)getInventoryListing()).basicRemove(otherEnd, msgs);
			case FhirPackage.INVENTORY_REPORT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.INVENTORY_REPORT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.INVENTORY_REPORT__STATUS:
				return getStatus();
			case FhirPackage.INVENTORY_REPORT__COUNT_TYPE:
				return getCountType();
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE:
				return getOperationType();
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE_REASON:
				return getOperationTypeReason();
			case FhirPackage.INVENTORY_REPORT__REPORTED_DATE_TIME:
				return getReportedDateTime();
			case FhirPackage.INVENTORY_REPORT__REPORTER:
				return getReporter();
			case FhirPackage.INVENTORY_REPORT__REPORTING_PERIOD:
				return getReportingPeriod();
			case FhirPackage.INVENTORY_REPORT__INVENTORY_LISTING:
				return getInventoryListing();
			case FhirPackage.INVENTORY_REPORT__NOTE:
				return getNote();
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
			case FhirPackage.INVENTORY_REPORT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT__STATUS:
				setStatus((InventoryReportStatus)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT__COUNT_TYPE:
				setCountType((InventoryCountType)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE:
				setOperationType((CodeableConcept)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE_REASON:
				setOperationTypeReason((CodeableConcept)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT__REPORTED_DATE_TIME:
				setReportedDateTime((DateTime)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT__REPORTER:
				setReporter((Reference)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT__REPORTING_PERIOD:
				setReportingPeriod((Period)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT__INVENTORY_LISTING:
				getInventoryListing().clear();
				getInventoryListing().addAll((Collection<? extends InventoryReportInventoryListing>)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.INVENTORY_REPORT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.INVENTORY_REPORT__STATUS:
				setStatus((InventoryReportStatus)null);
				return;
			case FhirPackage.INVENTORY_REPORT__COUNT_TYPE:
				setCountType((InventoryCountType)null);
				return;
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE:
				setOperationType((CodeableConcept)null);
				return;
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE_REASON:
				setOperationTypeReason((CodeableConcept)null);
				return;
			case FhirPackage.INVENTORY_REPORT__REPORTED_DATE_TIME:
				setReportedDateTime((DateTime)null);
				return;
			case FhirPackage.INVENTORY_REPORT__REPORTER:
				setReporter((Reference)null);
				return;
			case FhirPackage.INVENTORY_REPORT__REPORTING_PERIOD:
				setReportingPeriod((Period)null);
				return;
			case FhirPackage.INVENTORY_REPORT__INVENTORY_LISTING:
				getInventoryListing().clear();
				return;
			case FhirPackage.INVENTORY_REPORT__NOTE:
				getNote().clear();
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
			case FhirPackage.INVENTORY_REPORT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.INVENTORY_REPORT__STATUS:
				return status != null;
			case FhirPackage.INVENTORY_REPORT__COUNT_TYPE:
				return countType != null;
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE:
				return operationType != null;
			case FhirPackage.INVENTORY_REPORT__OPERATION_TYPE_REASON:
				return operationTypeReason != null;
			case FhirPackage.INVENTORY_REPORT__REPORTED_DATE_TIME:
				return reportedDateTime != null;
			case FhirPackage.INVENTORY_REPORT__REPORTER:
				return reporter != null;
			case FhirPackage.INVENTORY_REPORT__REPORTING_PERIOD:
				return reportingPeriod != null;
			case FhirPackage.INVENTORY_REPORT__INVENTORY_LISTING:
				return inventoryListing != null && !inventoryListing.isEmpty();
			case FhirPackage.INVENTORY_REPORT__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InventoryReportImpl
