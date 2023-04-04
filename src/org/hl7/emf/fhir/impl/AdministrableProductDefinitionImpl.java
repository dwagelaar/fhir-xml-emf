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

import org.hl7.emf.fhir.AdministrableProductDefinition;
import org.hl7.emf.fhir.AdministrableProductDefinitionProperty;
import org.hl7.emf.fhir.AdministrableProductDefinitionRouteOfAdministration;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.PublicationStatus;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrable Product Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getFormOf <em>Form Of</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getAdministrableDoseForm <em>Administrable Dose Form</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getProducedFrom <em>Produced From</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdministrableProductDefinitionImpl#getRouteOfAdministration <em>Route Of Administration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrableProductDefinitionImpl extends DomainResourceImpl implements AdministrableProductDefinition {
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
	 * The cached value of the '{@link #getFormOf() <em>Form Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> formOf;

	/**
	 * The cached value of the '{@link #getAdministrableDoseForm() <em>Administrable Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrableDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept administrableDoseForm;

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
	 * The cached value of the '{@link #getProducedFrom() <em>Produced From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> producedFrom;

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
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference device;

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
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<AdministrableProductDefinitionProperty> property;

	/**
	 * The cached value of the '{@link #getRouteOfAdministration() <em>Route Of Administration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteOfAdministration()
	 * @generated
	 * @ordered
	 */
	protected EList<AdministrableProductDefinitionRouteOfAdministration> routeOfAdministration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrableProductDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAdministrableProductDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getFormOf() {
		if (formOf == null) {
			formOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__FORM_OF);
		}
		return formOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAdministrableDoseForm() {
		return administrableDoseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrableDoseForm(CodeableConcept newAdministrableDoseForm, NotificationChain msgs) {
		CodeableConcept oldAdministrableDoseForm = administrableDoseForm;
		administrableDoseForm = newAdministrableDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ADMINISTRABLE_DOSE_FORM, oldAdministrableDoseForm, newAdministrableDoseForm);
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
	public void setAdministrableDoseForm(CodeableConcept newAdministrableDoseForm) {
		if (newAdministrableDoseForm != administrableDoseForm) {
			NotificationChain msgs = null;
			if (administrableDoseForm != null)
				msgs = ((InternalEObject)administrableDoseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ADMINISTRABLE_DOSE_FORM, null, msgs);
			if (newAdministrableDoseForm != null)
				msgs = ((InternalEObject)newAdministrableDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ADMINISTRABLE_DOSE_FORM, null, msgs);
			msgs = basicSetAdministrableDoseForm(newAdministrableDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ADMINISTRABLE_DOSE_FORM, newAdministrableDoseForm, newAdministrableDoseForm));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__UNIT_OF_PRESENTATION, oldUnitOfPresentation, newUnitOfPresentation);
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
				msgs = ((InternalEObject)unitOfPresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__UNIT_OF_PRESENTATION, null, msgs);
			if (newUnitOfPresentation != null)
				msgs = ((InternalEObject)newUnitOfPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__UNIT_OF_PRESENTATION, null, msgs);
			msgs = basicSetUnitOfPresentation(newUnitOfPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__UNIT_OF_PRESENTATION, newUnitOfPresentation, newUnitOfPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getProducedFrom() {
		if (producedFrom == null) {
			producedFrom = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PRODUCED_FROM);
		}
		return producedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Reference newDevice, NotificationChain msgs) {
		Reference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DEVICE, oldDevice, newDevice);
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
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DEVICE, newDevice, newDevice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdministrableProductDefinitionProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<AdministrableProductDefinitionProperty>(AdministrableProductDefinitionProperty.class, this, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdministrableProductDefinitionRouteOfAdministration> getRouteOfAdministration() {
		if (routeOfAdministration == null) {
			routeOfAdministration = new EObjectContainmentEList<AdministrableProductDefinitionRouteOfAdministration>(AdministrableProductDefinitionRouteOfAdministration.class, this, FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ROUTE_OF_ADMINISTRATION);
		}
		return routeOfAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__FORM_OF:
				return ((InternalEList<?>)getFormOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ADMINISTRABLE_DOSE_FORM:
				return basicSetAdministrableDoseForm(null, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__UNIT_OF_PRESENTATION:
				return basicSetUnitOfPresentation(null, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PRODUCED_FROM:
				return ((InternalEList<?>)getProducedFrom()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ROUTE_OF_ADMINISTRATION:
				return ((InternalEList<?>)getRouteOfAdministration()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__FORM_OF:
				return getFormOf();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ADMINISTRABLE_DOSE_FORM:
				return getAdministrableDoseForm();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__UNIT_OF_PRESENTATION:
				return getUnitOfPresentation();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PRODUCED_FROM:
				return getProducedFrom();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__INGREDIENT:
				return getIngredient();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DEVICE:
				return getDevice();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PROPERTY:
				return getProperty();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ROUTE_OF_ADMINISTRATION:
				return getRouteOfAdministration();
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
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__FORM_OF:
				getFormOf().clear();
				getFormOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ADMINISTRABLE_DOSE_FORM:
				setAdministrableDoseForm((CodeableConcept)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PRODUCED_FROM:
				getProducedFrom().clear();
				getProducedFrom().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends AdministrableProductDefinitionProperty>)newValue);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ROUTE_OF_ADMINISTRATION:
				getRouteOfAdministration().clear();
				getRouteOfAdministration().addAll((Collection<? extends AdministrableProductDefinitionRouteOfAdministration>)newValue);
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
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__FORM_OF:
				getFormOf().clear();
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ADMINISTRABLE_DOSE_FORM:
				setAdministrableDoseForm((CodeableConcept)null);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)null);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PRODUCED_FROM:
				getProducedFrom().clear();
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ROUTE_OF_ADMINISTRATION:
				getRouteOfAdministration().clear();
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
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__FORM_OF:
				return formOf != null && !formOf.isEmpty();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ADMINISTRABLE_DOSE_FORM:
				return administrableDoseForm != null;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__UNIT_OF_PRESENTATION:
				return unitOfPresentation != null;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PRODUCED_FROM:
				return producedFrom != null && !producedFrom.isEmpty();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DEVICE:
				return device != null;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION__ROUTE_OF_ADMINISTRATION:
				return routeOfAdministration != null && !routeOfAdministration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdministrableProductDefinitionImpl
