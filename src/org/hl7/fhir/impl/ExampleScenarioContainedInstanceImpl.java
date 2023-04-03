/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ExampleScenarioContainedInstance;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Contained Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioContainedInstanceImpl#getInstanceReference <em>Instance Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioContainedInstanceImpl#getVersionReference <em>Version Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioContainedInstanceImpl extends BackboneElementImpl implements ExampleScenarioContainedInstance {
	/**
	 * The cached value of the '{@link #getInstanceReference() <em>Instance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceReference()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String instanceReference;

	/**
	 * The cached value of the '{@link #getVersionReference() <em>Version Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionReference()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String versionReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioContainedInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioContainedInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getInstanceReference() {
		return instanceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceReference(org.hl7.fhir.String newInstanceReference, NotificationChain msgs) {
		org.hl7.fhir.String oldInstanceReference = instanceReference;
		instanceReference = newInstanceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__INSTANCE_REFERENCE, oldInstanceReference, newInstanceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceReference(org.hl7.fhir.String newInstanceReference) {
		if (newInstanceReference != instanceReference) {
			NotificationChain msgs = null;
			if (instanceReference != null)
				msgs = ((InternalEObject)instanceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__INSTANCE_REFERENCE, null, msgs);
			if (newInstanceReference != null)
				msgs = ((InternalEObject)newInstanceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__INSTANCE_REFERENCE, null, msgs);
			msgs = basicSetInstanceReference(newInstanceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__INSTANCE_REFERENCE, newInstanceReference, newInstanceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersionReference() {
		return versionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionReference(org.hl7.fhir.String newVersionReference, NotificationChain msgs) {
		org.hl7.fhir.String oldVersionReference = versionReference;
		versionReference = newVersionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_REFERENCE, oldVersionReference, newVersionReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionReference(org.hl7.fhir.String newVersionReference) {
		if (newVersionReference != versionReference) {
			NotificationChain msgs = null;
			if (versionReference != null)
				msgs = ((InternalEObject)versionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_REFERENCE, null, msgs);
			if (newVersionReference != null)
				msgs = ((InternalEObject)newVersionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_REFERENCE, null, msgs);
			msgs = basicSetVersionReference(newVersionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_REFERENCE, newVersionReference, newVersionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__INSTANCE_REFERENCE:
				return basicSetInstanceReference(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_REFERENCE:
				return basicSetVersionReference(null, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__INSTANCE_REFERENCE:
				return getInstanceReference();
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_REFERENCE:
				return getVersionReference();
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
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__INSTANCE_REFERENCE:
				setInstanceReference((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_REFERENCE:
				setVersionReference((org.hl7.fhir.String)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__INSTANCE_REFERENCE:
				setInstanceReference((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_REFERENCE:
				setVersionReference((org.hl7.fhir.String)null);
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
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__INSTANCE_REFERENCE:
				return instanceReference != null;
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_REFERENCE:
				return versionReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioContainedInstanceImpl
