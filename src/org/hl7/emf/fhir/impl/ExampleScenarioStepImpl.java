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
import org.hl7.emf.fhir.ExampleScenarioAlternative;
import org.hl7.emf.fhir.ExampleScenarioOperation;
import org.hl7.emf.fhir.ExampleScenarioProcess;
import org.hl7.emf.fhir.ExampleScenarioStep;
import org.hl7.emf.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ExampleScenarioStepImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ExampleScenarioStepImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ExampleScenarioStepImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ExampleScenarioStepImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ExampleScenarioStepImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ExampleScenarioStepImpl#getPause <em>Pause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioStepImpl extends BackboneElementImpl implements ExampleScenarioStep {
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String number;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected ExampleScenarioProcess process;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected Canonical workflow;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ExampleScenarioOperation operation;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleScenarioAlternative> alternative;

	/**
	 * The cached value of the '{@link #getPause() <em>Pause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPause()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean pause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(org.hl7.emf.fhir.String newNumber, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__NUMBER, oldNumber, newNumber);
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
	public void setNumber(org.hl7.emf.fhir.String newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioProcess getProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(ExampleScenarioProcess newProcess, NotificationChain msgs) {
		ExampleScenarioProcess oldProcess = process;
		process = newProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS, oldProcess, newProcess);
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
	public void setProcess(ExampleScenarioProcess newProcess) {
		if (newProcess != process) {
			NotificationChain msgs = null;
			if (process != null)
				msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS, null, msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS, null, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getWorkflow() {
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflow(Canonical newWorkflow, NotificationChain msgs) {
		Canonical oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__WORKFLOW, oldWorkflow, newWorkflow);
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
	public void setWorkflow(Canonical newWorkflow) {
		if (newWorkflow != workflow) {
			NotificationChain msgs = null;
			if (workflow != null)
				msgs = ((InternalEObject)workflow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__WORKFLOW, null, msgs);
			if (newWorkflow != null)
				msgs = ((InternalEObject)newWorkflow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__WORKFLOW, null, msgs);
			msgs = basicSetWorkflow(newWorkflow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__WORKFLOW, newWorkflow, newWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(ExampleScenarioOperation newOperation, NotificationChain msgs) {
		ExampleScenarioOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION, oldOperation, newOperation);
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
	public void setOperation(ExampleScenarioOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleScenarioAlternative> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectContainmentEList<ExampleScenarioAlternative>(ExampleScenarioAlternative.class, this, FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getPause() {
		return pause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPause(org.hl7.emf.fhir.Boolean newPause, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldPause = pause;
		pause = newPause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE, oldPause, newPause);
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
	public void setPause(org.hl7.emf.fhir.Boolean newPause) {
		if (newPause != pause) {
			NotificationChain msgs = null;
			if (pause != null)
				msgs = ((InternalEObject)pause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE, null, msgs);
			if (newPause != null)
				msgs = ((InternalEObject)newPause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE, null, msgs);
			msgs = basicSetPause(newPause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE, newPause, newPause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_STEP__NUMBER:
				return basicSetNumber(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				return basicSetProcess(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_STEP__WORKFLOW:
				return basicSetWorkflow(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				return basicSetOperation(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				return ((InternalEList<?>)getAlternative()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				return basicSetPause(null, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_STEP__NUMBER:
				return getNumber();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				return getProcess();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__WORKFLOW:
				return getWorkflow();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				return getOperation();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				return getAlternative();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				return getPause();
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
			case FhirPackage.EXAMPLE_SCENARIO_STEP__NUMBER:
				setNumber((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				setProcess((ExampleScenarioProcess)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__WORKFLOW:
				setWorkflow((Canonical)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				setOperation((ExampleScenarioOperation)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				getAlternative().clear();
				getAlternative().addAll((Collection<? extends ExampleScenarioAlternative>)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				setPause((org.hl7.emf.fhir.Boolean)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_STEP__NUMBER:
				setNumber((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				setProcess((ExampleScenarioProcess)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__WORKFLOW:
				setWorkflow((Canonical)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				setOperation((ExampleScenarioOperation)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				getAlternative().clear();
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				setPause((org.hl7.emf.fhir.Boolean)null);
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
			case FhirPackage.EXAMPLE_SCENARIO_STEP__NUMBER:
				return number != null;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				return process != null;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__WORKFLOW:
				return workflow != null;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				return operation != null;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				return alternative != null && !alternative.isEmpty();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				return pause != null;
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioStepImpl
