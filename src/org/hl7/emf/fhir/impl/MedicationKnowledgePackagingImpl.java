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

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.MedicationKnowledgeCost;
import org.hl7.emf.fhir.MedicationKnowledgePackaging;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Packaging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgePackagingImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgePackagingImpl#getPackagedProduct <em>Packaged Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgePackagingImpl extends BackboneElementImpl implements MedicationKnowledgePackaging {
	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeCost> cost;

	/**
	 * The cached value of the '{@link #getPackagedProduct() <em>Packaged Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedProduct()
	 * @generated
	 * @ordered
	 */
	protected Reference packagedProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgePackagingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledgePackaging();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeCost> getCost() {
		if (cost == null) {
			cost = new EObjectContainmentEList<MedicationKnowledgeCost>(MedicationKnowledgeCost.class, this, FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__COST);
		}
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPackagedProduct() {
		return packagedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackagedProduct(Reference newPackagedProduct, NotificationChain msgs) {
		Reference oldPackagedProduct = packagedProduct;
		packagedProduct = newPackagedProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__PACKAGED_PRODUCT, oldPackagedProduct, newPackagedProduct);
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
	public void setPackagedProduct(Reference newPackagedProduct) {
		if (newPackagedProduct != packagedProduct) {
			NotificationChain msgs = null;
			if (packagedProduct != null)
				msgs = ((InternalEObject)packagedProduct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__PACKAGED_PRODUCT, null, msgs);
			if (newPackagedProduct != null)
				msgs = ((InternalEObject)newPackagedProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__PACKAGED_PRODUCT, null, msgs);
			msgs = basicSetPackagedProduct(newPackagedProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__PACKAGED_PRODUCT, newPackagedProduct, newPackagedProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__COST:
				return ((InternalEList<?>)getCost()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__PACKAGED_PRODUCT:
				return basicSetPackagedProduct(null, msgs);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__COST:
				return getCost();
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__PACKAGED_PRODUCT:
				return getPackagedProduct();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__COST:
				getCost().clear();
				getCost().addAll((Collection<? extends MedicationKnowledgeCost>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__PACKAGED_PRODUCT:
				setPackagedProduct((Reference)newValue);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__COST:
				getCost().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__PACKAGED_PRODUCT:
				setPackagedProduct((Reference)null);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__COST:
				return cost != null && !cost.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING__PACKAGED_PRODUCT:
				return packagedProduct != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgePackagingImpl
