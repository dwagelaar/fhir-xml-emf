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

import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.ImplementationGuideResource1;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Resource1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuideResource1Impl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuideResource1Impl#getIsExample <em>Is Example</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuideResource1Impl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuideResource1Impl#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideResource1Impl extends BackboneElementImpl implements ImplementationGuideResource1 {
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
	 * The cached value of the '{@link #getIsExample() <em>Is Example</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExample()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean isExample;

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
	 * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected Url relativePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideResource1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuideResource1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE, oldReference, newReference);
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
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getIsExample() {
		return isExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsExample(org.hl7.emf.fhir.Boolean newIsExample, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldIsExample = isExample;
		isExample = newIsExample;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__IS_EXAMPLE, oldIsExample, newIsExample);
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
	public void setIsExample(org.hl7.emf.fhir.Boolean newIsExample) {
		if (newIsExample != isExample) {
			NotificationChain msgs = null;
			if (isExample != null)
				msgs = ((InternalEObject)isExample).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__IS_EXAMPLE, null, msgs);
			if (newIsExample != null)
				msgs = ((InternalEObject)newIsExample).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__IS_EXAMPLE, null, msgs);
			msgs = basicSetIsExample(newIsExample, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__IS_EXAMPLE, newIsExample, newIsExample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getRelativePath() {
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativePath(Url newRelativePath, NotificationChain msgs) {
		Url oldRelativePath = relativePath;
		relativePath = newRelativePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH, oldRelativePath, newRelativePath);
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
	public void setRelativePath(Url newRelativePath) {
		if (newRelativePath != relativePath) {
			NotificationChain msgs = null;
			if (relativePath != null)
				msgs = ((InternalEObject)relativePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH, null, msgs);
			if (newRelativePath != null)
				msgs = ((InternalEObject)newRelativePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH, null, msgs);
			msgs = basicSetRelativePath(newRelativePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH, newRelativePath, newRelativePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__IS_EXAMPLE:
				return basicSetIsExample(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				return basicSetRelativePath(null, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				return getReference();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__IS_EXAMPLE:
				return getIsExample();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__PROFILE:
				return getProfile();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				return getRelativePath();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				setReference((Reference)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__IS_EXAMPLE:
				setIsExample((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				setRelativePath((Url)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				setReference((Reference)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__IS_EXAMPLE:
				setIsExample((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__PROFILE:
				getProfile().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				setRelativePath((Url)null);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				return reference != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__IS_EXAMPLE:
				return isExample != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__PROFILE:
				return profile != null && !profile.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				return relativePath != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideResource1Impl
