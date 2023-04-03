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

import org.hl7.fhir.ClinicalUseDefinitionInteractant;
import org.hl7.fhir.ClinicalUseDefinitionInteraction;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Use Definition Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionInteractionImpl#getInteractant <em>Interactant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionInteractionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionInteractionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionInteractionImpl#getIncidence <em>Incidence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionInteractionImpl#getManagement <em>Management</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalUseDefinitionInteractionImpl extends BackboneElementImpl implements ClinicalUseDefinitionInteraction {
	/**
	 * The cached value of the '{@link #getInteractant() <em>Interactant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractant()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalUseDefinitionInteractant> interactant;

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
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference effect;

	/**
	 * The cached value of the '{@link #getIncidence() <em>Incidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept incidence;

	/**
	 * The cached value of the '{@link #getManagement() <em>Management</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagement()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> management;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalUseDefinitionInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClinicalUseDefinitionInteraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalUseDefinitionInteractant> getInteractant() {
		if (interactant == null) {
			interactant = new EObjectContainmentEList<ClinicalUseDefinitionInteractant>(ClinicalUseDefinitionInteractant.class, this, FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INTERACTANT);
		}
		return interactant;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(CodeableReference newEffect, NotificationChain msgs) {
		CodeableReference oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__EFFECT, oldEffect, newEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(CodeableReference newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getIncidence() {
		return incidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncidence(CodeableConcept newIncidence, NotificationChain msgs) {
		CodeableConcept oldIncidence = incidence;
		incidence = newIncidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INCIDENCE, oldIncidence, newIncidence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence(CodeableConcept newIncidence) {
		if (newIncidence != incidence) {
			NotificationChain msgs = null;
			if (incidence != null)
				msgs = ((InternalEObject)incidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INCIDENCE, null, msgs);
			if (newIncidence != null)
				msgs = ((InternalEObject)newIncidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INCIDENCE, null, msgs);
			msgs = basicSetIncidence(newIncidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INCIDENCE, newIncidence, newIncidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getManagement() {
		if (management == null) {
			management = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__MANAGEMENT);
		}
		return management;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INTERACTANT:
				return ((InternalEList<?>)getInteractant()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__EFFECT:
				return basicSetEffect(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INCIDENCE:
				return basicSetIncidence(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__MANAGEMENT:
				return ((InternalEList<?>)getManagement()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INTERACTANT:
				return getInteractant();
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__TYPE:
				return getType();
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__EFFECT:
				return getEffect();
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INCIDENCE:
				return getIncidence();
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__MANAGEMENT:
				return getManagement();
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
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INTERACTANT:
				getInteractant().clear();
				getInteractant().addAll((Collection<? extends ClinicalUseDefinitionInteractant>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__EFFECT:
				setEffect((CodeableReference)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INCIDENCE:
				setIncidence((CodeableConcept)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__MANAGEMENT:
				getManagement().clear();
				getManagement().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INTERACTANT:
				getInteractant().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__EFFECT:
				setEffect((CodeableReference)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INCIDENCE:
				setIncidence((CodeableConcept)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__MANAGEMENT:
				getManagement().clear();
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
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INTERACTANT:
				return interactant != null && !interactant.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__TYPE:
				return type != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__EFFECT:
				return effect != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__INCIDENCE:
				return incidence != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION__MANAGEMENT:
				return management != null && !management.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClinicalUseDefinitionInteractionImpl
