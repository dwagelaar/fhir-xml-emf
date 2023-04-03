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
import org.hl7.fhir.InventoryReportInventoryListing;
import org.hl7.fhir.InventoryReportItem;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Report Inventory Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InventoryReportInventoryListingImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryReportInventoryListingImpl#getItemStatus <em>Item Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryReportInventoryListingImpl#getCountingDateTime <em>Counting Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryReportInventoryListingImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryReportInventoryListingImpl extends BackboneElementImpl implements InventoryReportInventoryListing {
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
	 * The cached value of the '{@link #getItemStatus() <em>Item Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept itemStatus;

	/**
	 * The cached value of the '{@link #getCountingDateTime() <em>Counting Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountingDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime countingDateTime;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryReportItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryReportInventoryListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInventoryReportInventoryListing();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getItemStatus() {
		return itemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemStatus(CodeableConcept newItemStatus, NotificationChain msgs) {
		CodeableConcept oldItemStatus = itemStatus;
		itemStatus = newItemStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM_STATUS, oldItemStatus, newItemStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemStatus(CodeableConcept newItemStatus) {
		if (newItemStatus != itemStatus) {
			NotificationChain msgs = null;
			if (itemStatus != null)
				msgs = ((InternalEObject)itemStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM_STATUS, null, msgs);
			if (newItemStatus != null)
				msgs = ((InternalEObject)newItemStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM_STATUS, null, msgs);
			msgs = basicSetItemStatus(newItemStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM_STATUS, newItemStatus, newItemStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCountingDateTime() {
		return countingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountingDateTime(DateTime newCountingDateTime, NotificationChain msgs) {
		DateTime oldCountingDateTime = countingDateTime;
		countingDateTime = newCountingDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__COUNTING_DATE_TIME, oldCountingDateTime, newCountingDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountingDateTime(DateTime newCountingDateTime) {
		if (newCountingDateTime != countingDateTime) {
			NotificationChain msgs = null;
			if (countingDateTime != null)
				msgs = ((InternalEObject)countingDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__COUNTING_DATE_TIME, null, msgs);
			if (newCountingDateTime != null)
				msgs = ((InternalEObject)newCountingDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__COUNTING_DATE_TIME, null, msgs);
			msgs = basicSetCountingDateTime(newCountingDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__COUNTING_DATE_TIME, newCountingDateTime, newCountingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InventoryReportItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<InventoryReportItem>(InventoryReportItem.class, this, FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM_STATUS:
				return basicSetItemStatus(null, msgs);
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__COUNTING_DATE_TIME:
				return basicSetCountingDateTime(null, msgs);
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__LOCATION:
				return getLocation();
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM_STATUS:
				return getItemStatus();
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__COUNTING_DATE_TIME:
				return getCountingDateTime();
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM:
				return getItem();
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
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM_STATUS:
				setItemStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__COUNTING_DATE_TIME:
				setCountingDateTime((DateTime)newValue);
				return;
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends InventoryReportItem>)newValue);
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
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM_STATUS:
				setItemStatus((CodeableConcept)null);
				return;
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__COUNTING_DATE_TIME:
				setCountingDateTime((DateTime)null);
				return;
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM:
				getItem().clear();
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
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__LOCATION:
				return location != null;
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM_STATUS:
				return itemStatus != null;
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__COUNTING_DATE_TIME:
				return countingDateTime != null;
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InventoryReportInventoryListingImpl
