/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.ClinicalUseDefinitionOtherTherapy;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Use Definition Other Therapy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionOtherTherapyImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionOtherTherapyImpl#getTreatment <em>Treatment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalUseDefinitionOtherTherapyImpl extends BackboneElementImpl implements ClinicalUseDefinitionOtherTherapy {
	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationshipType;

	/**
	 * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference treatment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalUseDefinitionOtherTherapyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClinicalUseDefinitionOtherTherapy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationshipType(CodeableConcept newRelationshipType, NotificationChain msgs) {
		CodeableConcept oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__RELATIONSHIP_TYPE, oldRelationshipType, newRelationshipType);
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
	public void setRelationshipType(CodeableConcept newRelationshipType) {
		if (newRelationshipType != relationshipType) {
			NotificationChain msgs = null;
			if (relationshipType != null)
				msgs = ((InternalEObject)relationshipType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__RELATIONSHIP_TYPE, null, msgs);
			if (newRelationshipType != null)
				msgs = ((InternalEObject)newRelationshipType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__RELATIONSHIP_TYPE, null, msgs);
			msgs = basicSetRelationshipType(newRelationshipType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__RELATIONSHIP_TYPE, newRelationshipType, newRelationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getTreatment() {
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreatment(CodeableReference newTreatment, NotificationChain msgs) {
		CodeableReference oldTreatment = treatment;
		treatment = newTreatment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__TREATMENT, oldTreatment, newTreatment);
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
	public void setTreatment(CodeableReference newTreatment) {
		if (newTreatment != treatment) {
			NotificationChain msgs = null;
			if (treatment != null)
				msgs = ((InternalEObject)treatment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__TREATMENT, null, msgs);
			if (newTreatment != null)
				msgs = ((InternalEObject)newTreatment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__TREATMENT, null, msgs);
			msgs = basicSetTreatment(newTreatment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__TREATMENT, newTreatment, newTreatment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__RELATIONSHIP_TYPE:
				return basicSetRelationshipType(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__TREATMENT:
				return basicSetTreatment(null, msgs);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__RELATIONSHIP_TYPE:
				return getRelationshipType();
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__TREATMENT:
				return getTreatment();
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
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__RELATIONSHIP_TYPE:
				setRelationshipType((CodeableConcept)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__TREATMENT:
				setTreatment((CodeableReference)newValue);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__RELATIONSHIP_TYPE:
				setRelationshipType((CodeableConcept)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__TREATMENT:
				setTreatment((CodeableReference)null);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__RELATIONSHIP_TYPE:
				return relationshipType != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY__TREATMENT:
				return treatment != null;
		}
		return super.eIsSet(featureID);
	}

} //ClinicalUseDefinitionOtherTherapyImpl
