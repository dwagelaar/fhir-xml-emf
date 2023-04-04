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

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.ManufacturedItemDefinitionComponent;
import org.hl7.emf.fhir.ManufacturedItemDefinitionConstituent;
import org.hl7.emf.fhir.ManufacturedItemDefinitionProperty;
import org.hl7.emf.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufactured Item Definition Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionComponentImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionComponentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionComponentImpl#getConstituent <em>Constituent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionComponentImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionComponentImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturedItemDefinitionComponentImpl extends BackboneElementImpl implements ManufacturedItemDefinitionComponent {
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
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> function;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> amount;

	/**
	 * The cached value of the '{@link #getConstituent() <em>Constituent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstituent()
	 * @generated
	 * @ordered
	 */
	protected EList<ManufacturedItemDefinitionConstituent> constituent;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ManufacturedItemDefinitionProperty> property;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ManufacturedItemDefinitionComponent> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturedItemDefinitionComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getManufacturedItemDefinitionComponent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Quantity> getAmount() {
		if (amount == null) {
			amount = new EObjectContainmentEList<Quantity>(Quantity.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__AMOUNT);
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManufacturedItemDefinitionConstituent> getConstituent() {
		if (constituent == null) {
			constituent = new EObjectContainmentEList<ManufacturedItemDefinitionConstituent>(ManufacturedItemDefinitionConstituent.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__CONSTITUENT);
		}
		return constituent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManufacturedItemDefinitionProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ManufacturedItemDefinitionProperty>(ManufacturedItemDefinitionProperty.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManufacturedItemDefinitionComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ManufacturedItemDefinitionComponent>(ManufacturedItemDefinitionComponent.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__AMOUNT:
				return ((InternalEList<?>)getAmount()).basicRemove(otherEnd, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__CONSTITUENT:
				return ((InternalEList<?>)getConstituent()).basicRemove(otherEnd, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__TYPE:
				return getType();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__FUNCTION:
				return getFunction();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__AMOUNT:
				return getAmount();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__CONSTITUENT:
				return getConstituent();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__PROPERTY:
				return getProperty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__COMPONENT:
				return getComponent();
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
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__AMOUNT:
				getAmount().clear();
				getAmount().addAll((Collection<? extends Quantity>)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__CONSTITUENT:
				getConstituent().clear();
				getConstituent().addAll((Collection<? extends ManufacturedItemDefinitionConstituent>)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ManufacturedItemDefinitionProperty>)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ManufacturedItemDefinitionComponent>)newValue);
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
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__FUNCTION:
				getFunction().clear();
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__AMOUNT:
				getAmount().clear();
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__CONSTITUENT:
				getConstituent().clear();
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__COMPONENT:
				getComponent().clear();
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
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__TYPE:
				return type != null;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__FUNCTION:
				return function != null && !function.isEmpty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__AMOUNT:
				return amount != null && !amount.isEmpty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__CONSTITUENT:
				return constituent != null && !constituent.isEmpty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManufacturedItemDefinitionComponentImpl
