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
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.NutritionOrderAdditive;
import org.hl7.emf.fhir.NutritionOrderAdministration;
import org.hl7.emf.fhir.NutritionOrderEnteralFormula;
import org.hl7.emf.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Enteral Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderEnteralFormulaImpl#getBaseFormulaType <em>Base Formula Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderEnteralFormulaImpl#getBaseFormulaProductName <em>Base Formula Product Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderEnteralFormulaImpl#getDeliveryDevice <em>Delivery Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderEnteralFormulaImpl#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderEnteralFormulaImpl#getCaloricDensity <em>Caloric Density</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderEnteralFormulaImpl#getRouteOfAdministration <em>Route Of Administration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderEnteralFormulaImpl#getAdministration <em>Administration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderEnteralFormulaImpl#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.NutritionOrderEnteralFormulaImpl#getAdministrationInstruction <em>Administration Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderEnteralFormulaImpl extends BackboneElementImpl implements NutritionOrderEnteralFormula {
	/**
	 * The cached value of the '{@link #getBaseFormulaType() <em>Base Formula Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFormulaType()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference baseFormulaType;

	/**
	 * The cached value of the '{@link #getBaseFormulaProductName() <em>Base Formula Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFormulaProductName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String baseFormulaProductName;

	/**
	 * The cached value of the '{@link #getDeliveryDevice() <em>Delivery Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> deliveryDevice;

	/**
	 * The cached value of the '{@link #getAdditive() <em>Additive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditive()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderAdditive> additive;

	/**
	 * The cached value of the '{@link #getCaloricDensity() <em>Caloric Density</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaloricDensity()
	 * @generated
	 * @ordered
	 */
	protected Quantity caloricDensity;

	/**
	 * The cached value of the '{@link #getRouteOfAdministration() <em>Route Of Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteOfAdministration()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept routeOfAdministration;

	/**
	 * The cached value of the '{@link #getAdministration() <em>Administration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministration()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderAdministration> administration;

	/**
	 * The cached value of the '{@link #getMaxVolumeToDeliver() <em>Max Volume To Deliver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVolumeToDeliver()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxVolumeToDeliver;

	/**
	 * The cached value of the '{@link #getAdministrationInstruction() <em>Administration Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrationInstruction()
	 * @generated
	 * @ordered
	 */
	protected Markdown administrationInstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderEnteralFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionOrderEnteralFormula();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getBaseFormulaType() {
		return baseFormulaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseFormulaType(CodeableReference newBaseFormulaType, NotificationChain msgs) {
		CodeableReference oldBaseFormulaType = baseFormulaType;
		baseFormulaType = newBaseFormulaType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, oldBaseFormulaType, newBaseFormulaType);
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
	public void setBaseFormulaType(CodeableReference newBaseFormulaType) {
		if (newBaseFormulaType != baseFormulaType) {
			NotificationChain msgs = null;
			if (baseFormulaType != null)
				msgs = ((InternalEObject)baseFormulaType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, null, msgs);
			if (newBaseFormulaType != null)
				msgs = ((InternalEObject)newBaseFormulaType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, null, msgs);
			msgs = basicSetBaseFormulaType(newBaseFormulaType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, newBaseFormulaType, newBaseFormulaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getBaseFormulaProductName() {
		return baseFormulaProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseFormulaProductName(org.hl7.emf.fhir.String newBaseFormulaProductName, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldBaseFormulaProductName = baseFormulaProductName;
		baseFormulaProductName = newBaseFormulaProductName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, oldBaseFormulaProductName, newBaseFormulaProductName);
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
	public void setBaseFormulaProductName(org.hl7.emf.fhir.String newBaseFormulaProductName) {
		if (newBaseFormulaProductName != baseFormulaProductName) {
			NotificationChain msgs = null;
			if (baseFormulaProductName != null)
				msgs = ((InternalEObject)baseFormulaProductName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, null, msgs);
			if (newBaseFormulaProductName != null)
				msgs = ((InternalEObject)newBaseFormulaProductName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, null, msgs);
			msgs = basicSetBaseFormulaProductName(newBaseFormulaProductName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, newBaseFormulaProductName, newBaseFormulaProductName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getDeliveryDevice() {
		if (deliveryDevice == null) {
			deliveryDevice = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__DELIVERY_DEVICE);
		}
		return deliveryDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionOrderAdditive> getAdditive() {
		if (additive == null) {
			additive = new EObjectContainmentEList<NutritionOrderAdditive>(NutritionOrderAdditive.class, this, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE);
		}
		return additive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getCaloricDensity() {
		return caloricDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaloricDensity(Quantity newCaloricDensity, NotificationChain msgs) {
		Quantity oldCaloricDensity = caloricDensity;
		caloricDensity = newCaloricDensity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, oldCaloricDensity, newCaloricDensity);
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
	public void setCaloricDensity(Quantity newCaloricDensity) {
		if (newCaloricDensity != caloricDensity) {
			NotificationChain msgs = null;
			if (caloricDensity != null)
				msgs = ((InternalEObject)caloricDensity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, null, msgs);
			if (newCaloricDensity != null)
				msgs = ((InternalEObject)newCaloricDensity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, null, msgs);
			msgs = basicSetCaloricDensity(newCaloricDensity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, newCaloricDensity, newCaloricDensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRouteOfAdministration() {
		return routeOfAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteOfAdministration(CodeableConcept newRouteOfAdministration, NotificationChain msgs) {
		CodeableConcept oldRouteOfAdministration = routeOfAdministration;
		routeOfAdministration = newRouteOfAdministration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTE_OF_ADMINISTRATION, oldRouteOfAdministration, newRouteOfAdministration);
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
	public void setRouteOfAdministration(CodeableConcept newRouteOfAdministration) {
		if (newRouteOfAdministration != routeOfAdministration) {
			NotificationChain msgs = null;
			if (routeOfAdministration != null)
				msgs = ((InternalEObject)routeOfAdministration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTE_OF_ADMINISTRATION, null, msgs);
			if (newRouteOfAdministration != null)
				msgs = ((InternalEObject)newRouteOfAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTE_OF_ADMINISTRATION, null, msgs);
			msgs = basicSetRouteOfAdministration(newRouteOfAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTE_OF_ADMINISTRATION, newRouteOfAdministration, newRouteOfAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionOrderAdministration> getAdministration() {
		if (administration == null) {
			administration = new EObjectContainmentEList<NutritionOrderAdministration>(NutritionOrderAdministration.class, this, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION);
		}
		return administration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMaxVolumeToDeliver() {
		return maxVolumeToDeliver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxVolumeToDeliver(Quantity newMaxVolumeToDeliver, NotificationChain msgs) {
		Quantity oldMaxVolumeToDeliver = maxVolumeToDeliver;
		maxVolumeToDeliver = newMaxVolumeToDeliver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, oldMaxVolumeToDeliver, newMaxVolumeToDeliver);
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
	public void setMaxVolumeToDeliver(Quantity newMaxVolumeToDeliver) {
		if (newMaxVolumeToDeliver != maxVolumeToDeliver) {
			NotificationChain msgs = null;
			if (maxVolumeToDeliver != null)
				msgs = ((InternalEObject)maxVolumeToDeliver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, null, msgs);
			if (newMaxVolumeToDeliver != null)
				msgs = ((InternalEObject)newMaxVolumeToDeliver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, null, msgs);
			msgs = basicSetMaxVolumeToDeliver(newMaxVolumeToDeliver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, newMaxVolumeToDeliver, newMaxVolumeToDeliver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getAdministrationInstruction() {
		return administrationInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrationInstruction(Markdown newAdministrationInstruction, NotificationChain msgs) {
		Markdown oldAdministrationInstruction = administrationInstruction;
		administrationInstruction = newAdministrationInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION, oldAdministrationInstruction, newAdministrationInstruction);
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
	public void setAdministrationInstruction(Markdown newAdministrationInstruction) {
		if (newAdministrationInstruction != administrationInstruction) {
			NotificationChain msgs = null;
			if (administrationInstruction != null)
				msgs = ((InternalEObject)administrationInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION, null, msgs);
			if (newAdministrationInstruction != null)
				msgs = ((InternalEObject)newAdministrationInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION, null, msgs);
			msgs = basicSetAdministrationInstruction(newAdministrationInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION, newAdministrationInstruction, newAdministrationInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				return basicSetBaseFormulaType(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				return basicSetBaseFormulaProductName(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__DELIVERY_DEVICE:
				return ((InternalEList<?>)getDeliveryDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE:
				return ((InternalEList<?>)getAdditive()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				return basicSetCaloricDensity(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTE_OF_ADMINISTRATION:
				return basicSetRouteOfAdministration(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				return ((InternalEList<?>)getAdministration()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				return basicSetMaxVolumeToDeliver(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION:
				return basicSetAdministrationInstruction(null, msgs);
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
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				return getBaseFormulaType();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				return getBaseFormulaProductName();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__DELIVERY_DEVICE:
				return getDeliveryDevice();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE:
				return getAdditive();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				return getCaloricDensity();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTE_OF_ADMINISTRATION:
				return getRouteOfAdministration();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				return getAdministration();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				return getMaxVolumeToDeliver();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION:
				return getAdministrationInstruction();
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
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				setBaseFormulaType((CodeableReference)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				setBaseFormulaProductName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__DELIVERY_DEVICE:
				getDeliveryDevice().clear();
				getDeliveryDevice().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE:
				getAdditive().clear();
				getAdditive().addAll((Collection<? extends NutritionOrderAdditive>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				setCaloricDensity((Quantity)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTE_OF_ADMINISTRATION:
				setRouteOfAdministration((CodeableConcept)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				getAdministration().clear();
				getAdministration().addAll((Collection<? extends NutritionOrderAdministration>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				setMaxVolumeToDeliver((Quantity)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION:
				setAdministrationInstruction((Markdown)newValue);
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
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				setBaseFormulaType((CodeableReference)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				setBaseFormulaProductName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__DELIVERY_DEVICE:
				getDeliveryDevice().clear();
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE:
				getAdditive().clear();
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				setCaloricDensity((Quantity)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTE_OF_ADMINISTRATION:
				setRouteOfAdministration((CodeableConcept)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				getAdministration().clear();
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				setMaxVolumeToDeliver((Quantity)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION:
				setAdministrationInstruction((Markdown)null);
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
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				return baseFormulaType != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				return baseFormulaProductName != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__DELIVERY_DEVICE:
				return deliveryDevice != null && !deliveryDevice.isEmpty();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE:
				return additive != null && !additive.isEmpty();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				return caloricDensity != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTE_OF_ADMINISTRATION:
				return routeOfAdministration != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				return administration != null && !administration.isEmpty();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				return maxVolumeToDeliver != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION:
				return administrationInstruction != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderEnteralFormulaImpl
