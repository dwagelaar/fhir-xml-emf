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

import org.hl7.emf.fhir.BindingStrength;
import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.ElementDefinitionAdditional;
import org.hl7.emf.fhir.ElementDefinitionBinding;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionBindingImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionBindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionBindingImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionBindingImpl#getAdditional <em>Additional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionBindingImpl extends BackboneTypeImpl implements ElementDefinitionBinding {
	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected BindingStrength strength;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected Canonical valueSet;

	/**
	 * The cached value of the '{@link #getAdditional() <em>Additional</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditional()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionAdditional> additional;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElementDefinitionBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingStrength getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrength(BindingStrength newStrength, NotificationChain msgs) {
		BindingStrength oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, oldStrength, newStrength);
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
	public void setStrength(BindingStrength newStrength) {
		if (newStrength != strength) {
			NotificationChain msgs = null;
			if (strength != null)
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(Canonical newValueSet, NotificationChain msgs) {
		Canonical oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET, oldValueSet, newValueSet);
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
	public void setValueSet(Canonical newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementDefinitionAdditional> getAdditional() {
		if (additional == null) {
			additional = new EObjectContainmentEList<ElementDefinitionAdditional>(ElementDefinitionAdditional.class, this, FhirPackage.ELEMENT_DEFINITION_BINDING__ADDITIONAL);
		}
		return additional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				return basicSetStrength(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__ADDITIONAL:
				return ((InternalEList<?>)getAdditional()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				return getStrength();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				return getDescription();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET:
				return getValueSet();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__ADDITIONAL:
				return getAdditional();
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				setStrength((BindingStrength)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET:
				setValueSet((Canonical)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__ADDITIONAL:
				getAdditional().clear();
				getAdditional().addAll((Collection<? extends ElementDefinitionAdditional>)newValue);
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				setStrength((BindingStrength)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET:
				setValueSet((Canonical)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__ADDITIONAL:
				getAdditional().clear();
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				return strength != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				return description != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET:
				return valueSet != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__ADDITIONAL:
				return additional != null && !additional.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionBindingImpl
