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

import org.hl7.fhir.ConformanceExpectation;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RequirementsStatement;
import org.hl7.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getConditionality <em>Conditionality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequirementsStatementImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsStatementImpl extends BackboneElementImpl implements RequirementsStatement {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Id key;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String label;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceExpectation> conformance;

	/**
	 * The cached value of the '{@link #getConditionality() <em>Conditionality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionality()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean conditionality;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected Markdown requirement;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String derivedFrom;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String parent;

	/**
	 * The cached value of the '{@link #getSatisfiedBy() <em>Satisfied By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Url> satisfiedBy;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Url> reference;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRequirementsStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(Id newKey, NotificationChain msgs) {
		Id oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Id newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.hl7.fhir.String newLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.hl7.fhir.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceExpectation> getConformance() {
		if (conformance == null) {
			conformance = new EObjectContainmentEList<ConformanceExpectation>(ConformanceExpectation.class, this, FhirPackage.REQUIREMENTS_STATEMENT__CONFORMANCE);
		}
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getConditionality() {
		return conditionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionality(org.hl7.fhir.Boolean newConditionality, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldConditionality = conditionality;
		conditionality = newConditionality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__CONDITIONALITY, oldConditionality, newConditionality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionality(org.hl7.fhir.Boolean newConditionality) {
		if (newConditionality != conditionality) {
			NotificationChain msgs = null;
			if (conditionality != null)
				msgs = ((InternalEObject)conditionality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__CONDITIONALITY, null, msgs);
			if (newConditionality != null)
				msgs = ((InternalEObject)newConditionality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__CONDITIONALITY, null, msgs);
			msgs = basicSetConditionality(newConditionality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__CONDITIONALITY, newConditionality, newConditionality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(Markdown newRequirement, NotificationChain msgs) {
		Markdown oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__REQUIREMENT, oldRequirement, newRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(Markdown newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__REQUIREMENT, null, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__REQUIREMENT, null, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__REQUIREMENT, newRequirement, newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedFrom(org.hl7.fhir.String newDerivedFrom, NotificationChain msgs) {
		org.hl7.fhir.String oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__DERIVED_FROM, oldDerivedFrom, newDerivedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFrom(org.hl7.fhir.String newDerivedFrom) {
		if (newDerivedFrom != derivedFrom) {
			NotificationChain msgs = null;
			if (derivedFrom != null)
				msgs = ((InternalEObject)derivedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__DERIVED_FROM, null, msgs);
			if (newDerivedFrom != null)
				msgs = ((InternalEObject)newDerivedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__DERIVED_FROM, null, msgs);
			msgs = basicSetDerivedFrom(newDerivedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__DERIVED_FROM, newDerivedFrom, newDerivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(org.hl7.fhir.String newParent, NotificationChain msgs) {
		org.hl7.fhir.String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(org.hl7.fhir.String newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUIREMENTS_STATEMENT__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUIREMENTS_STATEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Url> getSatisfiedBy() {
		if (satisfiedBy == null) {
			satisfiedBy = new EObjectContainmentEList<Url>(Url.class, this, FhirPackage.REQUIREMENTS_STATEMENT__SATISFIED_BY);
		}
		return satisfiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Url> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Url>(Url.class, this, FhirPackage.REQUIREMENTS_STATEMENT__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REQUIREMENTS_STATEMENT__SOURCE);
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
			case FhirPackage.REQUIREMENTS_STATEMENT__KEY:
				return basicSetKey(null, msgs);
			case FhirPackage.REQUIREMENTS_STATEMENT__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.REQUIREMENTS_STATEMENT__CONFORMANCE:
				return ((InternalEList<?>)getConformance()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUIREMENTS_STATEMENT__CONDITIONALITY:
				return basicSetConditionality(null, msgs);
			case FhirPackage.REQUIREMENTS_STATEMENT__REQUIREMENT:
				return basicSetRequirement(null, msgs);
			case FhirPackage.REQUIREMENTS_STATEMENT__DERIVED_FROM:
				return basicSetDerivedFrom(null, msgs);
			case FhirPackage.REQUIREMENTS_STATEMENT__PARENT:
				return basicSetParent(null, msgs);
			case FhirPackage.REQUIREMENTS_STATEMENT__SATISFIED_BY:
				return ((InternalEList<?>)getSatisfiedBy()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUIREMENTS_STATEMENT__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUIREMENTS_STATEMENT__SOURCE:
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
			case FhirPackage.REQUIREMENTS_STATEMENT__KEY:
				return getKey();
			case FhirPackage.REQUIREMENTS_STATEMENT__LABEL:
				return getLabel();
			case FhirPackage.REQUIREMENTS_STATEMENT__CONFORMANCE:
				return getConformance();
			case FhirPackage.REQUIREMENTS_STATEMENT__CONDITIONALITY:
				return getConditionality();
			case FhirPackage.REQUIREMENTS_STATEMENT__REQUIREMENT:
				return getRequirement();
			case FhirPackage.REQUIREMENTS_STATEMENT__DERIVED_FROM:
				return getDerivedFrom();
			case FhirPackage.REQUIREMENTS_STATEMENT__PARENT:
				return getParent();
			case FhirPackage.REQUIREMENTS_STATEMENT__SATISFIED_BY:
				return getSatisfiedBy();
			case FhirPackage.REQUIREMENTS_STATEMENT__REFERENCE:
				return getReference();
			case FhirPackage.REQUIREMENTS_STATEMENT__SOURCE:
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
			case FhirPackage.REQUIREMENTS_STATEMENT__KEY:
				setKey((Id)newValue);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__LABEL:
				setLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__CONFORMANCE:
				getConformance().clear();
				getConformance().addAll((Collection<? extends ConformanceExpectation>)newValue);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__CONDITIONALITY:
				setConditionality((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__REQUIREMENT:
				setRequirement((Markdown)newValue);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__DERIVED_FROM:
				setDerivedFrom((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__PARENT:
				setParent((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				getSatisfiedBy().addAll((Collection<? extends Url>)newValue);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Url>)newValue);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.REQUIREMENTS_STATEMENT__KEY:
				setKey((Id)null);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__LABEL:
				setLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__CONFORMANCE:
				getConformance().clear();
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__CONDITIONALITY:
				setConditionality((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__REQUIREMENT:
				setRequirement((Markdown)null);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__DERIVED_FROM:
				setDerivedFrom((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__PARENT:
				setParent((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__REFERENCE:
				getReference().clear();
				return;
			case FhirPackage.REQUIREMENTS_STATEMENT__SOURCE:
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
			case FhirPackage.REQUIREMENTS_STATEMENT__KEY:
				return key != null;
			case FhirPackage.REQUIREMENTS_STATEMENT__LABEL:
				return label != null;
			case FhirPackage.REQUIREMENTS_STATEMENT__CONFORMANCE:
				return conformance != null && !conformance.isEmpty();
			case FhirPackage.REQUIREMENTS_STATEMENT__CONDITIONALITY:
				return conditionality != null;
			case FhirPackage.REQUIREMENTS_STATEMENT__REQUIREMENT:
				return requirement != null;
			case FhirPackage.REQUIREMENTS_STATEMENT__DERIVED_FROM:
				return derivedFrom != null;
			case FhirPackage.REQUIREMENTS_STATEMENT__PARENT:
				return parent != null;
			case FhirPackage.REQUIREMENTS_STATEMENT__SATISFIED_BY:
				return satisfiedBy != null && !satisfiedBy.isEmpty();
			case FhirPackage.REQUIREMENTS_STATEMENT__REFERENCE:
				return reference != null && !reference.isEmpty();
			case FhirPackage.REQUIREMENTS_STATEMENT__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementsStatementImpl
