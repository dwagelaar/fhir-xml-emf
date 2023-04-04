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
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.ManufacturedItemDefinition;
import org.hl7.emf.fhir.ManufacturedItemDefinitionComponent;
import org.hl7.emf.fhir.ManufacturedItemDefinitionProperty;
import org.hl7.emf.fhir.MarketingStatus;
import org.hl7.emf.fhir.PublicationStatus;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufactured Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getManufacturedDoseForm <em>Manufactured Dose Form</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getMarketingStatus <em>Marketing Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ManufacturedItemDefinitionImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturedItemDefinitionImpl extends DomainResourceImpl implements ManufacturedItemDefinition {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String name;

	/**
	 * The cached value of the '{@link #getManufacturedDoseForm() <em>Manufactured Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept manufacturedDoseForm;

	/**
	 * The cached value of the '{@link #getUnitOfPresentation() <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfPresentation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unitOfPresentation;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturer;

	/**
	 * The cached value of the '{@link #getMarketingStatus() <em>Marketing Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketingStatus> marketingStatus;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> ingredient;

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
	protected ManufacturedItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getManufacturedItemDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION__STATUS, oldStatus, newStatus);
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
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.emf.fhir.String newName, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION__NAME, oldName, newName);
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
	public void setName(org.hl7.emf.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getManufacturedDoseForm() {
		return manufacturedDoseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturedDoseForm(CodeableConcept newManufacturedDoseForm, NotificationChain msgs) {
		CodeableConcept oldManufacturedDoseForm = manufacturedDoseForm;
		manufacturedDoseForm = newManufacturedDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURED_DOSE_FORM, oldManufacturedDoseForm, newManufacturedDoseForm);
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
	public void setManufacturedDoseForm(CodeableConcept newManufacturedDoseForm) {
		if (newManufacturedDoseForm != manufacturedDoseForm) {
			NotificationChain msgs = null;
			if (manufacturedDoseForm != null)
				msgs = ((InternalEObject)manufacturedDoseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURED_DOSE_FORM, null, msgs);
			if (newManufacturedDoseForm != null)
				msgs = ((InternalEObject)newManufacturedDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURED_DOSE_FORM, null, msgs);
			msgs = basicSetManufacturedDoseForm(newManufacturedDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURED_DOSE_FORM, newManufacturedDoseForm, newManufacturedDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnitOfPresentation() {
		return unitOfPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfPresentation(CodeableConcept newUnitOfPresentation, NotificationChain msgs) {
		CodeableConcept oldUnitOfPresentation = unitOfPresentation;
		unitOfPresentation = newUnitOfPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION__UNIT_OF_PRESENTATION, oldUnitOfPresentation, newUnitOfPresentation);
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
	public void setUnitOfPresentation(CodeableConcept newUnitOfPresentation) {
		if (newUnitOfPresentation != unitOfPresentation) {
			NotificationChain msgs = null;
			if (unitOfPresentation != null)
				msgs = ((InternalEObject)unitOfPresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION__UNIT_OF_PRESENTATION, null, msgs);
			if (newUnitOfPresentation != null)
				msgs = ((InternalEObject)newUnitOfPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MANUFACTURED_ITEM_DEFINITION__UNIT_OF_PRESENTATION, null, msgs);
			msgs = basicSetUnitOfPresentation(newUnitOfPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MANUFACTURED_ITEM_DEFINITION__UNIT_OF_PRESENTATION, newUnitOfPresentation, newUnitOfPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarketingStatus> getMarketingStatus() {
		if (marketingStatus == null) {
			marketingStatus = new EObjectContainmentEList<MarketingStatus>(MarketingStatus.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION__MARKETING_STATUS);
		}
		return marketingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManufacturedItemDefinitionProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ManufacturedItemDefinitionProperty>(ManufacturedItemDefinitionProperty.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION__PROPERTY);
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
			component = new EObjectContainmentEList<ManufacturedItemDefinitionComponent>(ManufacturedItemDefinitionComponent.class, this, FhirPackage.MANUFACTURED_ITEM_DEFINITION__COMPONENT);
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
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURED_DOSE_FORM:
				return basicSetManufacturedDoseForm(null, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__UNIT_OF_PRESENTATION:
				return basicSetUnitOfPresentation(null, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MARKETING_STATUS:
				return ((InternalEList<?>)getMarketingStatus()).basicRemove(otherEnd, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__COMPONENT:
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
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__NAME:
				return getName();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURED_DOSE_FORM:
				return getManufacturedDoseForm();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__UNIT_OF_PRESENTATION:
				return getUnitOfPresentation();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MARKETING_STATUS:
				return getMarketingStatus();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__INGREDIENT:
				return getIngredient();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__PROPERTY:
				return getProperty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__COMPONENT:
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
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__NAME:
				setName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURED_DOSE_FORM:
				setManufacturedDoseForm((CodeableConcept)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MARKETING_STATUS:
				getMarketingStatus().clear();
				getMarketingStatus().addAll((Collection<? extends MarketingStatus>)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ManufacturedItemDefinitionProperty>)newValue);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__COMPONENT:
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
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__NAME:
				setName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURED_DOSE_FORM:
				setManufacturedDoseForm((CodeableConcept)null);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)null);
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MARKETING_STATUS:
				getMarketingStatus().clear();
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__COMPONENT:
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
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__NAME:
				return name != null;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURED_DOSE_FORM:
				return manufacturedDoseForm != null;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__UNIT_OF_PRESENTATION:
				return unitOfPresentation != null;
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__MARKETING_STATUS:
				return marketingStatus != null && !marketingStatus.isEmpty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManufacturedItemDefinitionImpl
