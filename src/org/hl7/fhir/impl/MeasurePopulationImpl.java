/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Expression;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasurePopulationImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasurePopulationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasurePopulationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasurePopulationImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasurePopulationImpl#getGroupDefinition <em>Group Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasurePopulationImpl#getInputPopulationId <em>Input Population Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasurePopulationImpl#getAggregateMethod <em>Aggregate Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurePopulationImpl extends BackboneElementImpl implements MeasurePopulation {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String linkId;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected Expression criteria;

	/**
	 * The cached value of the '{@link #getGroupDefinition() <em>Group Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDefinition()
	 * @generated
	 * @ordered
	 */
	protected Reference groupDefinition;

	/**
	 * The cached value of the '{@link #getInputPopulationId() <em>Input Population Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPopulationId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String inputPopulationId;

	/**
	 * The cached value of the '{@link #getAggregateMethod() <em>Aggregate Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept aggregateMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurePopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasurePopulation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.hl7.fhir.String newLinkId, NotificationChain msgs) {
		org.hl7.fhir.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__LINK_ID, oldLinkId, newLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(org.hl7.fhir.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriteria(Expression newCriteria, NotificationChain msgs) {
		Expression oldCriteria = criteria;
		criteria = newCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__CRITERIA, oldCriteria, newCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(Expression newCriteria) {
		if (newCriteria != criteria) {
			NotificationChain msgs = null;
			if (criteria != null)
				msgs = ((InternalEObject)criteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__CRITERIA, null, msgs);
			if (newCriteria != null)
				msgs = ((InternalEObject)newCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__CRITERIA, null, msgs);
			msgs = basicSetCriteria(newCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__CRITERIA, newCriteria, newCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getGroupDefinition() {
		return groupDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupDefinition(Reference newGroupDefinition, NotificationChain msgs) {
		Reference oldGroupDefinition = groupDefinition;
		groupDefinition = newGroupDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__GROUP_DEFINITION, oldGroupDefinition, newGroupDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupDefinition(Reference newGroupDefinition) {
		if (newGroupDefinition != groupDefinition) {
			NotificationChain msgs = null;
			if (groupDefinition != null)
				msgs = ((InternalEObject)groupDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__GROUP_DEFINITION, null, msgs);
			if (newGroupDefinition != null)
				msgs = ((InternalEObject)newGroupDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__GROUP_DEFINITION, null, msgs);
			msgs = basicSetGroupDefinition(newGroupDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__GROUP_DEFINITION, newGroupDefinition, newGroupDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getInputPopulationId() {
		return inputPopulationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPopulationId(org.hl7.fhir.String newInputPopulationId, NotificationChain msgs) {
		org.hl7.fhir.String oldInputPopulationId = inputPopulationId;
		inputPopulationId = newInputPopulationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__INPUT_POPULATION_ID, oldInputPopulationId, newInputPopulationId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPopulationId(org.hl7.fhir.String newInputPopulationId) {
		if (newInputPopulationId != inputPopulationId) {
			NotificationChain msgs = null;
			if (inputPopulationId != null)
				msgs = ((InternalEObject)inputPopulationId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__INPUT_POPULATION_ID, null, msgs);
			if (newInputPopulationId != null)
				msgs = ((InternalEObject)newInputPopulationId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__INPUT_POPULATION_ID, null, msgs);
			msgs = basicSetInputPopulationId(newInputPopulationId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__INPUT_POPULATION_ID, newInputPopulationId, newInputPopulationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAggregateMethod() {
		return aggregateMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateMethod(CodeableConcept newAggregateMethod, NotificationChain msgs) {
		CodeableConcept oldAggregateMethod = aggregateMethod;
		aggregateMethod = newAggregateMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__AGGREGATE_METHOD, oldAggregateMethod, newAggregateMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateMethod(CodeableConcept newAggregateMethod) {
		if (newAggregateMethod != aggregateMethod) {
			NotificationChain msgs = null;
			if (aggregateMethod != null)
				msgs = ((InternalEObject)aggregateMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__AGGREGATE_METHOD, null, msgs);
			if (newAggregateMethod != null)
				msgs = ((InternalEObject)newAggregateMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_POPULATION__AGGREGATE_METHOD, null, msgs);
			msgs = basicSetAggregateMethod(newAggregateMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_POPULATION__AGGREGATE_METHOD, newAggregateMethod, newAggregateMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_POPULATION__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.MEASURE_POPULATION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEASURE_POPULATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.MEASURE_POPULATION__CRITERIA:
				return basicSetCriteria(null, msgs);
			case FhirPackage.MEASURE_POPULATION__GROUP_DEFINITION:
				return basicSetGroupDefinition(null, msgs);
			case FhirPackage.MEASURE_POPULATION__INPUT_POPULATION_ID:
				return basicSetInputPopulationId(null, msgs);
			case FhirPackage.MEASURE_POPULATION__AGGREGATE_METHOD:
				return basicSetAggregateMethod(null, msgs);
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
			case FhirPackage.MEASURE_POPULATION__LINK_ID:
				return getLinkId();
			case FhirPackage.MEASURE_POPULATION__CODE:
				return getCode();
			case FhirPackage.MEASURE_POPULATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.MEASURE_POPULATION__CRITERIA:
				return getCriteria();
			case FhirPackage.MEASURE_POPULATION__GROUP_DEFINITION:
				return getGroupDefinition();
			case FhirPackage.MEASURE_POPULATION__INPUT_POPULATION_ID:
				return getInputPopulationId();
			case FhirPackage.MEASURE_POPULATION__AGGREGATE_METHOD:
				return getAggregateMethod();
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
			case FhirPackage.MEASURE_POPULATION__LINK_ID:
				setLinkId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE_POPULATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_POPULATION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.MEASURE_POPULATION__CRITERIA:
				setCriteria((Expression)newValue);
				return;
			case FhirPackage.MEASURE_POPULATION__GROUP_DEFINITION:
				setGroupDefinition((Reference)newValue);
				return;
			case FhirPackage.MEASURE_POPULATION__INPUT_POPULATION_ID:
				setInputPopulationId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE_POPULATION__AGGREGATE_METHOD:
				setAggregateMethod((CodeableConcept)newValue);
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
			case FhirPackage.MEASURE_POPULATION__LINK_ID:
				setLinkId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE_POPULATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_POPULATION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.MEASURE_POPULATION__CRITERIA:
				setCriteria((Expression)null);
				return;
			case FhirPackage.MEASURE_POPULATION__GROUP_DEFINITION:
				setGroupDefinition((Reference)null);
				return;
			case FhirPackage.MEASURE_POPULATION__INPUT_POPULATION_ID:
				setInputPopulationId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE_POPULATION__AGGREGATE_METHOD:
				setAggregateMethod((CodeableConcept)null);
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
			case FhirPackage.MEASURE_POPULATION__LINK_ID:
				return linkId != null;
			case FhirPackage.MEASURE_POPULATION__CODE:
				return code != null;
			case FhirPackage.MEASURE_POPULATION__DESCRIPTION:
				return description != null;
			case FhirPackage.MEASURE_POPULATION__CRITERIA:
				return criteria != null;
			case FhirPackage.MEASURE_POPULATION__GROUP_DEFINITION:
				return groupDefinition != null;
			case FhirPackage.MEASURE_POPULATION__INPUT_POPULATION_ID:
				return inputPopulationId != null;
			case FhirPackage.MEASURE_POPULATION__AGGREGATE_METHOD:
				return aggregateMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasurePopulationImpl
