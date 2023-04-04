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

import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.InventoryItemInstance;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryItemInstanceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryItemInstanceImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryItemInstanceImpl#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryItemInstanceImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryItemInstanceImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemInstanceImpl extends BackboneElementImpl implements InventoryItemInstance {
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
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String lotNumber;

	/**
	 * The cached value of the '{@link #getExpiry() <em>Expiry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiry()
	 * @generated
	 * @ordered
	 */
	protected DateTime expiry;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInventoryItemInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.INVENTORY_ITEM_INSTANCE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumber(org.hl7.emf.fhir.String newLotNumber, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_INSTANCE__LOT_NUMBER, oldLotNumber, newLotNumber);
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
	public void setLotNumber(org.hl7.emf.fhir.String newLotNumber) {
		if (newLotNumber != lotNumber) {
			NotificationChain msgs = null;
			if (lotNumber != null)
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_INSTANCE__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_INSTANCE__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_INSTANCE__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getExpiry() {
		return expiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpiry(DateTime newExpiry, NotificationChain msgs) {
		DateTime oldExpiry = expiry;
		expiry = newExpiry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_INSTANCE__EXPIRY, oldExpiry, newExpiry);
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
	public void setExpiry(DateTime newExpiry) {
		if (newExpiry != expiry) {
			NotificationChain msgs = null;
			if (expiry != null)
				msgs = ((InternalEObject)expiry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_INSTANCE__EXPIRY, null, msgs);
			if (newExpiry != null)
				msgs = ((InternalEObject)newExpiry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_INSTANCE__EXPIRY, null, msgs);
			msgs = basicSetExpiry(newExpiry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_INSTANCE__EXPIRY, newExpiry, newExpiry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_INSTANCE__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_INSTANCE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_INSTANCE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_INSTANCE__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_INSTANCE__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_INSTANCE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_INSTANCE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_INSTANCE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INVENTORY_ITEM_INSTANCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case FhirPackage.INVENTORY_ITEM_INSTANCE__EXPIRY:
				return basicSetExpiry(null, msgs);
			case FhirPackage.INVENTORY_ITEM_INSTANCE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOCATION:
				return basicSetLocation(null, msgs);
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
			case FhirPackage.INVENTORY_ITEM_INSTANCE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOT_NUMBER:
				return getLotNumber();
			case FhirPackage.INVENTORY_ITEM_INSTANCE__EXPIRY:
				return getExpiry();
			case FhirPackage.INVENTORY_ITEM_INSTANCE__SUBJECT:
				return getSubject();
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOCATION:
				return getLocation();
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
			case FhirPackage.INVENTORY_ITEM_INSTANCE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOT_NUMBER:
				setLotNumber((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__EXPIRY:
				setExpiry((DateTime)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOCATION:
				setLocation((Reference)newValue);
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
			case FhirPackage.INVENTORY_ITEM_INSTANCE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOT_NUMBER:
				setLotNumber((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__EXPIRY:
				setExpiry((DateTime)null);
				return;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOCATION:
				setLocation((Reference)null);
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
			case FhirPackage.INVENTORY_ITEM_INSTANCE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOT_NUMBER:
				return lotNumber != null;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__EXPIRY:
				return expiry != null;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__SUBJECT:
				return subject != null;
			case FhirPackage.INVENTORY_ITEM_INSTANCE__LOCATION:
				return location != null;
		}
		return super.eIsSet(featureID);
	}

} //InventoryItemInstanceImpl
