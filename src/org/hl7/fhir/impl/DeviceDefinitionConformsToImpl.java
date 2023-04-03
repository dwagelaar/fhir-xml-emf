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
import org.hl7.fhir.DeviceDefinitionConformsTo;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.RelatedArtifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Conforms To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionConformsToImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionConformsToImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionConformsToImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionConformsToImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionConformsToImpl extends BackboneElementImpl implements DeviceDefinitionConformsTo {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept specification;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> version;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionConformsToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinitionConformsTo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(CodeableConcept newSpecification, NotificationChain msgs) {
		CodeableConcept oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(CodeableConcept newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedArtifact> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__CATEGORY:
				return getCategory();
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SPECIFICATION:
				return getSpecification();
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__VERSION:
				return getVersion();
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SOURCE:
				return getSource();
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
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SPECIFICATION:
				setSpecification((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends RelatedArtifact>)newValue);
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
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SPECIFICATION:
				setSpecification((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__VERSION:
				getVersion().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SOURCE:
				getSource().clear();
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
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__CATEGORY:
				return category != null;
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SPECIFICATION:
				return specification != null;
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__VERSION:
				return version != null && !version.isEmpty();
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionConformsToImpl
