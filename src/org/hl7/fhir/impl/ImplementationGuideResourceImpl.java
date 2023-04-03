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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.FHIRVersion;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getIsExample <em>Is Example</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getGroupingId <em>Grouping Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideResourceImpl extends BackboneElementImpl implements ImplementationGuideResource {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<FHIRVersion> fhirVersion;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

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
	 * The cached value of the '{@link #getIsExample() <em>Is Example</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExample()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isExample;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> profile;

	/**
	 * The cached value of the '{@link #getGroupingId() <em>Grouping Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingId()
	 * @generated
	 * @ordered
	 */
	protected Id groupingId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuideResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FHIRVersion> getFhirVersion() {
		if (fhirVersion == null) {
			fhirVersion = new EObjectContainmentEList<FHIRVersion>(FHIRVersion.class, this, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION);
		}
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIsExample() {
		return isExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsExample(org.hl7.fhir.Boolean newIsExample, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsExample = isExample;
		isExample = newIsExample;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__IS_EXAMPLE, oldIsExample, newIsExample);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExample(org.hl7.fhir.Boolean newIsExample) {
		if (newIsExample != isExample) {
			NotificationChain msgs = null;
			if (isExample != null)
				msgs = ((InternalEObject)isExample).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__IS_EXAMPLE, null, msgs);
			if (newIsExample != null)
				msgs = ((InternalEObject)newIsExample).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__IS_EXAMPLE, null, msgs);
			msgs = basicSetIsExample(newIsExample, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__IS_EXAMPLE, newIsExample, newIsExample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Canonical> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getGroupingId() {
		return groupingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupingId(Id newGroupingId, NotificationChain msgs) {
		Id oldGroupingId = groupingId;
		groupingId = newGroupingId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID, oldGroupingId, newGroupingId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingId(Id newGroupingId) {
		if (newGroupingId != groupingId) {
			NotificationChain msgs = null;
			if (groupingId != null)
				msgs = ((InternalEObject)groupingId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID, null, msgs);
			if (newGroupingId != null)
				msgs = ((InternalEObject)newGroupingId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID, null, msgs);
			msgs = basicSetGroupingId(newGroupingId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID, newGroupingId, newGroupingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				return ((InternalEList<?>)getFhirVersion()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__IS_EXAMPLE:
				return basicSetIsExample(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				return basicSetGroupingId(null, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				return getReference();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				return getFhirVersion();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				return getName();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__IS_EXAMPLE:
				return getIsExample();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PROFILE:
				return getProfile();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				return getGroupingId();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				setReference((Reference)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				getFhirVersion().clear();
				getFhirVersion().addAll((Collection<? extends FHIRVersion>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__IS_EXAMPLE:
				setIsExample((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				setGroupingId((Id)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				setReference((Reference)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				getFhirVersion().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__IS_EXAMPLE:
				setIsExample((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PROFILE:
				getProfile().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				setGroupingId((Id)null);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				return reference != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				return fhirVersion != null && !fhirVersion.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				return name != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				return description != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__IS_EXAMPLE:
				return isExample != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PROFILE:
				return profile != null && !profile.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				return groupingId != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideResourceImpl
