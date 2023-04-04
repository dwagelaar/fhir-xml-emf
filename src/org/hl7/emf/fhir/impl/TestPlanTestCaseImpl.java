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

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.TestPlanAssertion;
import org.hl7.emf.fhir.TestPlanDependency1;
import org.hl7.emf.fhir.TestPlanTestCase;
import org.hl7.emf.fhir.TestPlanTestData;
import org.hl7.emf.fhir.TestPlanTestRun;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Plan Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestCaseImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestCaseImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestCaseImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestCaseImpl#getTestRun <em>Test Run</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestCaseImpl#getTestData <em>Test Data</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestCaseImpl#getAssertion <em>Assertion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestPlanTestCaseImpl extends BackboneElementImpl implements TestPlanTestCase {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Integer sequence;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> scope;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<TestPlanDependency1> dependency;

	/**
	 * The cached value of the '{@link #getTestRun() <em>Test Run</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRun()
	 * @generated
	 * @ordered
	 */
	protected EList<TestPlanTestRun> testRun;

	/**
	 * The cached value of the '{@link #getTestData() <em>Test Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestData()
	 * @generated
	 * @ordered
	 */
	protected EList<TestPlanTestData> testData;

	/**
	 * The cached value of the '{@link #getAssertion() <em>Assertion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertion()
	 * @generated
	 * @ordered
	 */
	protected EList<TestPlanAssertion> assertion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPlanTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestPlanTestCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Integer getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(org.hl7.emf.fhir.Integer newSequence, NotificationChain msgs) {
		org.hl7.emf.fhir.Integer oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_CASE__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(org.hl7.emf.fhir.Integer newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_CASE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_CASE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_CASE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getScope() {
		if (scope == null) {
			scope = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.TEST_PLAN_TEST_CASE__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestPlanDependency1> getDependency() {
		if (dependency == null) {
			dependency = new EObjectContainmentEList<TestPlanDependency1>(TestPlanDependency1.class, this, FhirPackage.TEST_PLAN_TEST_CASE__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestPlanTestRun> getTestRun() {
		if (testRun == null) {
			testRun = new EObjectContainmentEList<TestPlanTestRun>(TestPlanTestRun.class, this, FhirPackage.TEST_PLAN_TEST_CASE__TEST_RUN);
		}
		return testRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestPlanTestData> getTestData() {
		if (testData == null) {
			testData = new EObjectContainmentEList<TestPlanTestData>(TestPlanTestData.class, this, FhirPackage.TEST_PLAN_TEST_CASE__TEST_DATA);
		}
		return testData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestPlanAssertion> getAssertion() {
		if (assertion == null) {
			assertion = new EObjectContainmentEList<TestPlanAssertion>(TestPlanAssertion.class, this, FhirPackage.TEST_PLAN_TEST_CASE__ASSERTION);
		}
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_PLAN_TEST_CASE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.TEST_PLAN_TEST_CASE__SCOPE:
				return ((InternalEList<?>)getScope()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_PLAN_TEST_CASE__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_RUN:
				return ((InternalEList<?>)getTestRun()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_DATA:
				return ((InternalEList<?>)getTestData()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_PLAN_TEST_CASE__ASSERTION:
				return ((InternalEList<?>)getAssertion()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.TEST_PLAN_TEST_CASE__SEQUENCE:
				return getSequence();
			case FhirPackage.TEST_PLAN_TEST_CASE__SCOPE:
				return getScope();
			case FhirPackage.TEST_PLAN_TEST_CASE__DEPENDENCY:
				return getDependency();
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_RUN:
				return getTestRun();
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_DATA:
				return getTestData();
			case FhirPackage.TEST_PLAN_TEST_CASE__ASSERTION:
				return getAssertion();
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
			case FhirPackage.TEST_PLAN_TEST_CASE__SEQUENCE:
				setSequence((org.hl7.emf.fhir.Integer)newValue);
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends TestPlanDependency1>)newValue);
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_RUN:
				getTestRun().clear();
				getTestRun().addAll((Collection<? extends TestPlanTestRun>)newValue);
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_DATA:
				getTestData().clear();
				getTestData().addAll((Collection<? extends TestPlanTestData>)newValue);
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__ASSERTION:
				getAssertion().clear();
				getAssertion().addAll((Collection<? extends TestPlanAssertion>)newValue);
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
			case FhirPackage.TEST_PLAN_TEST_CASE__SEQUENCE:
				setSequence((org.hl7.emf.fhir.Integer)null);
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__SCOPE:
				getScope().clear();
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__DEPENDENCY:
				getDependency().clear();
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_RUN:
				getTestRun().clear();
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_DATA:
				getTestData().clear();
				return;
			case FhirPackage.TEST_PLAN_TEST_CASE__ASSERTION:
				getAssertion().clear();
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
			case FhirPackage.TEST_PLAN_TEST_CASE__SEQUENCE:
				return sequence != null;
			case FhirPackage.TEST_PLAN_TEST_CASE__SCOPE:
				return scope != null && !scope.isEmpty();
			case FhirPackage.TEST_PLAN_TEST_CASE__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_RUN:
				return testRun != null && !testRun.isEmpty();
			case FhirPackage.TEST_PLAN_TEST_CASE__TEST_DATA:
				return testData != null && !testData.isEmpty();
			case FhirPackage.TEST_PLAN_TEST_CASE__ASSERTION:
				return assertion != null && !assertion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestPlanTestCaseImpl
