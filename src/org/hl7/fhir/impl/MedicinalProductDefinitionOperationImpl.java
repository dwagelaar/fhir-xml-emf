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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicinalProductDefinitionOperation;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Definition Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionOperationImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionOperationImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionOperationImpl#getConfidentialityIndicator <em>Confidentiality Indicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductDefinitionOperationImpl extends BackboneElementImpl implements MedicinalProductDefinitionOperation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference type;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected Period effectiveDate;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> organization;

	/**
	 * The cached value of the '{@link #getConfidentialityIndicator() <em>Confidentiality Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityIndicator()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept confidentialityIndicator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductDefinitionOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductDefinitionOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableReference newType, NotificationChain msgs) {
		CodeableReference oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableReference newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDate(Period newEffectiveDate, NotificationChain msgs) {
		Period oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__EFFECTIVE_DATE, oldEffectiveDate, newEffectiveDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDate(Period newEffectiveDate) {
		if (newEffectiveDate != effectiveDate) {
			NotificationChain msgs = null;
			if (effectiveDate != null)
				msgs = ((InternalEObject)effectiveDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__EFFECTIVE_DATE, null, msgs);
			if (newEffectiveDate != null)
				msgs = ((InternalEObject)newEffectiveDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__EFFECTIVE_DATE, null, msgs);
			msgs = basicSetEffectiveDate(newEffectiveDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__EFFECTIVE_DATE, newEffectiveDate, newEffectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getConfidentialityIndicator() {
		return confidentialityIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentialityIndicator(CodeableConcept newConfidentialityIndicator, NotificationChain msgs) {
		CodeableConcept oldConfidentialityIndicator = confidentialityIndicator;
		confidentialityIndicator = newConfidentialityIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__CONFIDENTIALITY_INDICATOR, oldConfidentialityIndicator, newConfidentialityIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentialityIndicator(CodeableConcept newConfidentialityIndicator) {
		if (newConfidentialityIndicator != confidentialityIndicator) {
			NotificationChain msgs = null;
			if (confidentialityIndicator != null)
				msgs = ((InternalEObject)confidentialityIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__CONFIDENTIALITY_INDICATOR, null, msgs);
			if (newConfidentialityIndicator != null)
				msgs = ((InternalEObject)newConfidentialityIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__CONFIDENTIALITY_INDICATOR, null, msgs);
			msgs = basicSetConfidentialityIndicator(newConfidentialityIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__CONFIDENTIALITY_INDICATOR, newConfidentialityIndicator, newConfidentialityIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__EFFECTIVE_DATE:
				return basicSetEffectiveDate(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__CONFIDENTIALITY_INDICATOR:
				return basicSetConfidentialityIndicator(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__EFFECTIVE_DATE:
				return getEffectiveDate();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__ORGANIZATION:
				return getOrganization();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__CONFIDENTIALITY_INDICATOR:
				return getConfidentialityIndicator();
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__TYPE:
				setType((CodeableReference)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__EFFECTIVE_DATE:
				setEffectiveDate((Period)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__CONFIDENTIALITY_INDICATOR:
				setConfidentialityIndicator((CodeableConcept)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__TYPE:
				setType((CodeableReference)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__EFFECTIVE_DATE:
				setEffectiveDate((Period)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__ORGANIZATION:
				getOrganization().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__CONFIDENTIALITY_INDICATOR:
				setConfidentialityIndicator((CodeableConcept)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__EFFECTIVE_DATE:
				return effectiveDate != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION__CONFIDENTIALITY_INDICATOR:
				return confidentialityIndicator != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductDefinitionOperationImpl
