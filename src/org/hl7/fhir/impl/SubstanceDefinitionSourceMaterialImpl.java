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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SubstanceDefinitionSourceMaterial;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition Source Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionSourceMaterialImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionSourceMaterialImpl#getGenus <em>Genus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionSourceMaterialImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionSourceMaterialImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionSourceMaterialImpl#getCountryOfOrigin <em>Country Of Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionSourceMaterialImpl extends BackboneElementImpl implements SubstanceDefinitionSourceMaterial {
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
	 * The cached value of the '{@link #getGenus() <em>Genus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept genus;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept species;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept part;

	/**
	 * The cached value of the '{@link #getCountryOfOrigin() <em>Country Of Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryOfOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> countryOfOrigin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionSourceMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceDefinitionSourceMaterial();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGenus() {
		return genus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenus(CodeableConcept newGenus, NotificationChain msgs) {
		CodeableConcept oldGenus = genus;
		genus = newGenus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__GENUS, oldGenus, newGenus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenus(CodeableConcept newGenus) {
		if (newGenus != genus) {
			NotificationChain msgs = null;
			if (genus != null)
				msgs = ((InternalEObject)genus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__GENUS, null, msgs);
			if (newGenus != null)
				msgs = ((InternalEObject)newGenus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__GENUS, null, msgs);
			msgs = basicSetGenus(newGenus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__GENUS, newGenus, newGenus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecies(CodeableConcept newSpecies, NotificationChain msgs) {
		CodeableConcept oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__SPECIES, oldSpecies, newSpecies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(CodeableConcept newSpecies) {
		if (newSpecies != species) {
			NotificationChain msgs = null;
			if (species != null)
				msgs = ((InternalEObject)species).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__SPECIES, null, msgs);
			if (newSpecies != null)
				msgs = ((InternalEObject)newSpecies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__SPECIES, null, msgs);
			msgs = basicSetSpecies(newSpecies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__SPECIES, newSpecies, newSpecies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPart(CodeableConcept newPart, NotificationChain msgs) {
		CodeableConcept oldPart = part;
		part = newPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__PART, oldPart, newPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart(CodeableConcept newPart) {
		if (newPart != part) {
			NotificationChain msgs = null;
			if (part != null)
				msgs = ((InternalEObject)part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__PART, null, msgs);
			if (newPart != null)
				msgs = ((InternalEObject)newPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__PART, null, msgs);
			msgs = basicSetPart(newPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__PART, newPart, newPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCountryOfOrigin() {
		if (countryOfOrigin == null) {
			countryOfOrigin = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN);
		}
		return countryOfOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__GENUS:
				return basicSetGenus(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__SPECIES:
				return basicSetSpecies(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__PART:
				return basicSetPart(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				return ((InternalEList<?>)getCountryOfOrigin()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__TYPE:
				return getType();
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__GENUS:
				return getGenus();
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__SPECIES:
				return getSpecies();
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__PART:
				return getPart();
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				return getCountryOfOrigin();
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
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__GENUS:
				setGenus((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__SPECIES:
				setSpecies((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__PART:
				setPart((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				getCountryOfOrigin().clear();
				getCountryOfOrigin().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__GENUS:
				setGenus((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__SPECIES:
				setSpecies((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__PART:
				setPart((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				getCountryOfOrigin().clear();
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
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__TYPE:
				return type != null;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__GENUS:
				return genus != null;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__SPECIES:
				return species != null;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__PART:
				return part != null;
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				return countryOfOrigin != null && !countryOfOrigin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionSourceMaterialImpl
