/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ChargeItemDefinitionApplicability;
import org.hl7.fhir.Expression;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.RelatedArtifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge Item Definition Applicability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemDefinitionApplicabilityImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemDefinitionApplicabilityImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemDefinitionApplicabilityImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeItemDefinitionApplicabilityImpl extends BackboneElementImpl implements ChargeItemDefinitionApplicability {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getRelatedArtifact() <em>Related Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected RelatedArtifact relatedArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeItemDefinitionApplicabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getChargeItemDefinitionApplicability();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifact getRelatedArtifact() {
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedArtifact(RelatedArtifact newRelatedArtifact, NotificationChain msgs) {
		RelatedArtifact oldRelatedArtifact = relatedArtifact;
		relatedArtifact = newRelatedArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__RELATED_ARTIFACT, oldRelatedArtifact, newRelatedArtifact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedArtifact(RelatedArtifact newRelatedArtifact) {
		if (newRelatedArtifact != relatedArtifact) {
			NotificationChain msgs = null;
			if (relatedArtifact != null)
				msgs = ((InternalEObject)relatedArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__RELATED_ARTIFACT, null, msgs);
			if (newRelatedArtifact != null)
				msgs = ((InternalEObject)newRelatedArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__RELATED_ARTIFACT, null, msgs);
			msgs = basicSetRelatedArtifact(newRelatedArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__RELATED_ARTIFACT, newRelatedArtifact, newRelatedArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__RELATED_ARTIFACT:
				return basicSetRelatedArtifact(null, msgs);
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
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__CONDITION:
				return getCondition();
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__RELATED_ARTIFACT:
				return getRelatedArtifact();
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
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__CONDITION:
				setCondition((Expression)newValue);
				return;
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__RELATED_ARTIFACT:
				setRelatedArtifact((RelatedArtifact)newValue);
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
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__CONDITION:
				setCondition((Expression)null);
				return;
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__RELATED_ARTIFACT:
				setRelatedArtifact((RelatedArtifact)null);
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
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__CONDITION:
				return condition != null;
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY__RELATED_ARTIFACT:
				return relatedArtifact != null;
		}
		return super.eIsSet(featureID);
	}

} //ChargeItemDefinitionApplicabilityImpl
