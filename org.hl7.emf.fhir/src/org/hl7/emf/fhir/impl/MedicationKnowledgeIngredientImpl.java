/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.MedicationKnowledgeIngredient;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgeIngredientImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgeIngredientImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgeIngredientImpl#getStrengthRatio <em>Strength Ratio</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgeIngredientImpl#getStrengthCodeableConcept <em>Strength Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgeIngredientImpl#getStrengthQuantity <em>Strength Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeIngredientImpl extends BackboneElementImpl implements MedicationKnowledgeIngredient {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference item;

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
	 * The cached value of the '{@link #getStrengthRatio() <em>Strength Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio strengthRatio;

	/**
	 * The cached value of the '{@link #getStrengthCodeableConcept() <em>Strength Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept strengthCodeableConcept;

	/**
	 * The cached value of the '{@link #getStrengthQuantity() <em>Strength Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity strengthQuantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledgeIngredient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(CodeableReference newItem, NotificationChain msgs) {
		CodeableReference oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEM, oldItem, newItem);
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
	public void setItem(CodeableReference newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getStrengthRatio() {
		return strengthRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthRatio(Ratio newStrengthRatio, NotificationChain msgs) {
		Ratio oldStrengthRatio = strengthRatio;
		strengthRatio = newStrengthRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_RATIO, oldStrengthRatio, newStrengthRatio);
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
	public void setStrengthRatio(Ratio newStrengthRatio) {
		if (newStrengthRatio != strengthRatio) {
			NotificationChain msgs = null;
			if (strengthRatio != null)
				msgs = ((InternalEObject)strengthRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_RATIO, null, msgs);
			if (newStrengthRatio != null)
				msgs = ((InternalEObject)newStrengthRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_RATIO, null, msgs);
			msgs = basicSetStrengthRatio(newStrengthRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_RATIO, newStrengthRatio, newStrengthRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStrengthCodeableConcept() {
		return strengthCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthCodeableConcept(CodeableConcept newStrengthCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldStrengthCodeableConcept = strengthCodeableConcept;
		strengthCodeableConcept = newStrengthCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_CODEABLE_CONCEPT, oldStrengthCodeableConcept, newStrengthCodeableConcept);
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
	public void setStrengthCodeableConcept(CodeableConcept newStrengthCodeableConcept) {
		if (newStrengthCodeableConcept != strengthCodeableConcept) {
			NotificationChain msgs = null;
			if (strengthCodeableConcept != null)
				msgs = ((InternalEObject)strengthCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_CODEABLE_CONCEPT, null, msgs);
			if (newStrengthCodeableConcept != null)
				msgs = ((InternalEObject)newStrengthCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetStrengthCodeableConcept(newStrengthCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_CODEABLE_CONCEPT, newStrengthCodeableConcept, newStrengthCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getStrengthQuantity() {
		return strengthQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthQuantity(Quantity newStrengthQuantity, NotificationChain msgs) {
		Quantity oldStrengthQuantity = strengthQuantity;
		strengthQuantity = newStrengthQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_QUANTITY, oldStrengthQuantity, newStrengthQuantity);
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
	public void setStrengthQuantity(Quantity newStrengthQuantity) {
		if (newStrengthQuantity != strengthQuantity) {
			NotificationChain msgs = null;
			if (strengthQuantity != null)
				msgs = ((InternalEObject)strengthQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_QUANTITY, null, msgs);
			if (newStrengthQuantity != null)
				msgs = ((InternalEObject)newStrengthQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_QUANTITY, null, msgs);
			msgs = basicSetStrengthQuantity(newStrengthQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_QUANTITY, newStrengthQuantity, newStrengthQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEM:
				return basicSetItem(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_RATIO:
				return basicSetStrengthRatio(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				return basicSetStrengthCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_QUANTITY:
				return basicSetStrengthQuantity(null, msgs);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEM:
				return getItem();
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__TYPE:
				return getType();
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_RATIO:
				return getStrengthRatio();
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				return getStrengthCodeableConcept();
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_QUANTITY:
				return getStrengthQuantity();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEM:
				setItem((CodeableReference)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_RATIO:
				setStrengthRatio((Ratio)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				setStrengthCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_QUANTITY:
				setStrengthQuantity((Quantity)newValue);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEM:
				setItem((CodeableReference)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_RATIO:
				setStrengthRatio((Ratio)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				setStrengthCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_QUANTITY:
				setStrengthQuantity((Quantity)null);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEM:
				return item != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__TYPE:
				return type != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_RATIO:
				return strengthRatio != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				return strengthCodeableConcept != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH_QUANTITY:
				return strengthQuantity != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeIngredientImpl
