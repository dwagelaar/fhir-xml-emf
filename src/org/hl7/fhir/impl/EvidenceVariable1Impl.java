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
import org.hl7.fhir.EvidenceVariable1;
import org.hl7.fhir.EvidenceVariableHandling;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Variable1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariable1Impl#getVariableDefinition <em>Variable Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariable1Impl#getHandling <em>Handling</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariable1Impl#getValueCategory <em>Value Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariable1Impl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariable1Impl#getValueRange <em>Value Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariable1Impl extends BackboneElementImpl implements EvidenceVariable1 {
	/**
	 * The cached value of the '{@link #getVariableDefinition() <em>Variable Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDefinition()
	 * @generated
	 * @ordered
	 */
	protected Reference variableDefinition;

	/**
	 * The cached value of the '{@link #getHandling() <em>Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandling()
	 * @generated
	 * @ordered
	 */
	protected EvidenceVariableHandling handling;

	/**
	 * The cached value of the '{@link #getValueCategory() <em>Value Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> valueCategory;

	/**
	 * The cached value of the '{@link #getValueQuantity() <em>Value Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> valueQuantity;

	/**
	 * The cached value of the '{@link #getValueRange() <em>Value Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Range> valueRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariable1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceVariable1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getVariableDefinition() {
		return variableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDefinition(Reference newVariableDefinition, NotificationChain msgs) {
		Reference oldVariableDefinition = variableDefinition;
		variableDefinition = newVariableDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE1__VARIABLE_DEFINITION, oldVariableDefinition, newVariableDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDefinition(Reference newVariableDefinition) {
		if (newVariableDefinition != variableDefinition) {
			NotificationChain msgs = null;
			if (variableDefinition != null)
				msgs = ((InternalEObject)variableDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE1__VARIABLE_DEFINITION, null, msgs);
			if (newVariableDefinition != null)
				msgs = ((InternalEObject)newVariableDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE1__VARIABLE_DEFINITION, null, msgs);
			msgs = basicSetVariableDefinition(newVariableDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE1__VARIABLE_DEFINITION, newVariableDefinition, newVariableDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableHandling getHandling() {
		return handling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandling(EvidenceVariableHandling newHandling, NotificationChain msgs) {
		EvidenceVariableHandling oldHandling = handling;
		handling = newHandling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE1__HANDLING, oldHandling, newHandling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandling(EvidenceVariableHandling newHandling) {
		if (newHandling != handling) {
			NotificationChain msgs = null;
			if (handling != null)
				msgs = ((InternalEObject)handling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE1__HANDLING, null, msgs);
			if (newHandling != null)
				msgs = ((InternalEObject)newHandling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE1__HANDLING, null, msgs);
			msgs = basicSetHandling(newHandling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE1__HANDLING, newHandling, newHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getValueCategory() {
		if (valueCategory == null) {
			valueCategory = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.EVIDENCE_VARIABLE1__VALUE_CATEGORY);
		}
		return valueCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantity> getValueQuantity() {
		if (valueQuantity == null) {
			valueQuantity = new EObjectContainmentEList<Quantity>(Quantity.class, this, FhirPackage.EVIDENCE_VARIABLE1__VALUE_QUANTITY);
		}
		return valueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Range> getValueRange() {
		if (valueRange == null) {
			valueRange = new EObjectContainmentEList<Range>(Range.class, this, FhirPackage.EVIDENCE_VARIABLE1__VALUE_RANGE);
		}
		return valueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_VARIABLE1__VARIABLE_DEFINITION:
				return basicSetVariableDefinition(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE1__HANDLING:
				return basicSetHandling(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_CATEGORY:
				return ((InternalEList<?>)getValueCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_QUANTITY:
				return ((InternalEList<?>)getValueQuantity()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_RANGE:
				return ((InternalEList<?>)getValueRange()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EVIDENCE_VARIABLE1__VARIABLE_DEFINITION:
				return getVariableDefinition();
			case FhirPackage.EVIDENCE_VARIABLE1__HANDLING:
				return getHandling();
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_CATEGORY:
				return getValueCategory();
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_RANGE:
				return getValueRange();
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
			case FhirPackage.EVIDENCE_VARIABLE1__VARIABLE_DEFINITION:
				setVariableDefinition((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE1__HANDLING:
				setHandling((EvidenceVariableHandling)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_CATEGORY:
				getValueCategory().clear();
				getValueCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_QUANTITY:
				getValueQuantity().clear();
				getValueQuantity().addAll((Collection<? extends Quantity>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_RANGE:
				getValueRange().clear();
				getValueRange().addAll((Collection<? extends Range>)newValue);
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
			case FhirPackage.EVIDENCE_VARIABLE1__VARIABLE_DEFINITION:
				setVariableDefinition((Reference)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE1__HANDLING:
				setHandling((EvidenceVariableHandling)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_CATEGORY:
				getValueCategory().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_QUANTITY:
				getValueQuantity().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_RANGE:
				getValueRange().clear();
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
			case FhirPackage.EVIDENCE_VARIABLE1__VARIABLE_DEFINITION:
				return variableDefinition != null;
			case FhirPackage.EVIDENCE_VARIABLE1__HANDLING:
				return handling != null;
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_CATEGORY:
				return valueCategory != null && !valueCategory.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_QUANTITY:
				return valueQuantity != null && !valueQuantity.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE1__VALUE_RANGE:
				return valueRange != null && !valueRange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariable1Impl
