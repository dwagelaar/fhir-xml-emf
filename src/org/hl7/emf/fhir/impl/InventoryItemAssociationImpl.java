/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.InventoryItemAssociation;
import org.hl7.emf.fhir.Ratio;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryItemAssociationImpl#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryItemAssociationImpl#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.InventoryItemAssociationImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemAssociationImpl extends BackboneElementImpl implements InventoryItemAssociation {
	/**
	 * The cached value of the '{@link #getAssociationType() <em>Association Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept associationType;

	/**
	 * The cached value of the '{@link #getRelatedItem() <em>Related Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedItem()
	 * @generated
	 * @ordered
	 */
	protected Reference relatedItem;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Ratio quantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInventoryItemAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAssociationType() {
		return associationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationType(CodeableConcept newAssociationType, NotificationChain msgs) {
		CodeableConcept oldAssociationType = associationType;
		associationType = newAssociationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_ASSOCIATION__ASSOCIATION_TYPE, oldAssociationType, newAssociationType);
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
	public void setAssociationType(CodeableConcept newAssociationType) {
		if (newAssociationType != associationType) {
			NotificationChain msgs = null;
			if (associationType != null)
				msgs = ((InternalEObject)associationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_ASSOCIATION__ASSOCIATION_TYPE, null, msgs);
			if (newAssociationType != null)
				msgs = ((InternalEObject)newAssociationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_ASSOCIATION__ASSOCIATION_TYPE, null, msgs);
			msgs = basicSetAssociationType(newAssociationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_ASSOCIATION__ASSOCIATION_TYPE, newAssociationType, newAssociationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRelatedItem() {
		return relatedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedItem(Reference newRelatedItem, NotificationChain msgs) {
		Reference oldRelatedItem = relatedItem;
		relatedItem = newRelatedItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_ASSOCIATION__RELATED_ITEM, oldRelatedItem, newRelatedItem);
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
	public void setRelatedItem(Reference newRelatedItem) {
		if (newRelatedItem != relatedItem) {
			NotificationChain msgs = null;
			if (relatedItem != null)
				msgs = ((InternalEObject)relatedItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_ASSOCIATION__RELATED_ITEM, null, msgs);
			if (newRelatedItem != null)
				msgs = ((InternalEObject)newRelatedItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_ASSOCIATION__RELATED_ITEM, null, msgs);
			msgs = basicSetRelatedItem(newRelatedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_ASSOCIATION__RELATED_ITEM, newRelatedItem, newRelatedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Ratio newQuantity, NotificationChain msgs) {
		Ratio oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_ASSOCIATION__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Ratio newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_ASSOCIATION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVENTORY_ITEM_ASSOCIATION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVENTORY_ITEM_ASSOCIATION__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__ASSOCIATION_TYPE:
				return basicSetAssociationType(null, msgs);
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__RELATED_ITEM:
				return basicSetRelatedItem(null, msgs);
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__QUANTITY:
				return basicSetQuantity(null, msgs);
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
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__ASSOCIATION_TYPE:
				return getAssociationType();
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__RELATED_ITEM:
				return getRelatedItem();
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__QUANTITY:
				return getQuantity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__ASSOCIATION_TYPE:
				setAssociationType((CodeableConcept)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__RELATED_ITEM:
				setRelatedItem((Reference)newValue);
				return;
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__QUANTITY:
				setQuantity((Ratio)newValue);
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
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__ASSOCIATION_TYPE:
				setAssociationType((CodeableConcept)null);
				return;
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__RELATED_ITEM:
				setRelatedItem((Reference)null);
				return;
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__QUANTITY:
				setQuantity((Ratio)null);
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
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__ASSOCIATION_TYPE:
				return associationType != null;
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__RELATED_ITEM:
				return relatedItem != null;
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION__QUANTITY:
				return quantity != null;
		}
		return super.eIsSet(featureID);
	}

} //InventoryItemAssociationImpl
