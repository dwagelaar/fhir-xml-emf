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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicinalProductDefinitionName;
import org.hl7.fhir.MedicinalProductDefinitionPart;
import org.hl7.fhir.MedicinalProductDefinitionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Definition Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionNameImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionNameImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionNameImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionNameImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductDefinitionNameImpl extends BackboneElementImpl implements MedicinalProductDefinitionName {
	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String productName;

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
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductDefinitionPart> part;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductDefinitionUsage> usage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductDefinitionNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductDefinitionName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductName(org.hl7.fhir.String newProductName, NotificationChain msgs) {
		org.hl7.fhir.String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PRODUCT_NAME, oldProductName, newProductName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(org.hl7.fhir.String newProductName) {
		if (newProductName != productName) {
			NotificationChain msgs = null;
			if (productName != null)
				msgs = ((InternalEObject)productName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PRODUCT_NAME, null, msgs);
			if (newProductName != null)
				msgs = ((InternalEObject)newProductName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PRODUCT_NAME, null, msgs);
			msgs = basicSetProductName(newProductName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PRODUCT_NAME, newProductName, newProductName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductDefinitionPart> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<MedicinalProductDefinitionPart>(MedicinalProductDefinitionPart.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductDefinitionUsage> getUsage() {
		if (usage == null) {
			usage = new EObjectContainmentEList<MedicinalProductDefinitionUsage>(MedicinalProductDefinitionUsage.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PRODUCT_NAME:
				return basicSetProductName(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__USAGE:
				return ((InternalEList<?>)getUsage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PRODUCT_NAME:
				return getProductName();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PART:
				return getPart();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__USAGE:
				return getUsage();
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PRODUCT_NAME:
				setProductName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends MedicinalProductDefinitionPart>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends MedicinalProductDefinitionUsage>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PRODUCT_NAME:
				setProductName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PART:
				getPart().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__USAGE:
				getUsage().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PRODUCT_NAME:
				return productName != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__PART:
				return part != null && !part.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME__USAGE:
				return usage != null && !usage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductDefinitionNameImpl
