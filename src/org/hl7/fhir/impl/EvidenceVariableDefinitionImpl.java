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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.EvidenceVariableDefinition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableDefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableDefinitionImpl#getVariableRole <em>Variable Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableDefinitionImpl#getObserved <em>Observed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableDefinitionImpl#getIntended <em>Intended</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableDefinitionImpl#getDirectnessMatch <em>Directness Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableDefinitionImpl extends BackboneElementImpl implements EvidenceVariableDefinition {
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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getVariableRole() <em>Variable Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept variableRole;

	/**
	 * The cached value of the '{@link #getObserved() <em>Observed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserved()
	 * @generated
	 * @ordered
	 */
	protected Reference observed;

	/**
	 * The cached value of the '{@link #getIntended() <em>Intended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntended()
	 * @generated
	 * @ordered
	 */
	protected Reference intended;

	/**
	 * The cached value of the '{@link #getDirectnessMatch() <em>Directness Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectnessMatch()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept directnessMatch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceVariableDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getVariableRole() {
		return variableRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableRole(CodeableConcept newVariableRole, NotificationChain msgs) {
		CodeableConcept oldVariableRole = variableRole;
		variableRole = newVariableRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__VARIABLE_ROLE, oldVariableRole, newVariableRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableRole(CodeableConcept newVariableRole) {
		if (newVariableRole != variableRole) {
			NotificationChain msgs = null;
			if (variableRole != null)
				msgs = ((InternalEObject)variableRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__VARIABLE_ROLE, null, msgs);
			if (newVariableRole != null)
				msgs = ((InternalEObject)newVariableRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__VARIABLE_ROLE, null, msgs);
			msgs = basicSetVariableRole(newVariableRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__VARIABLE_ROLE, newVariableRole, newVariableRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getObserved() {
		return observed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObserved(Reference newObserved, NotificationChain msgs) {
		Reference oldObserved = observed;
		observed = newObserved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__OBSERVED, oldObserved, newObserved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserved(Reference newObserved) {
		if (newObserved != observed) {
			NotificationChain msgs = null;
			if (observed != null)
				msgs = ((InternalEObject)observed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__OBSERVED, null, msgs);
			if (newObserved != null)
				msgs = ((InternalEObject)newObserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__OBSERVED, null, msgs);
			msgs = basicSetObserved(newObserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__OBSERVED, newObserved, newObserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getIntended() {
		return intended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntended(Reference newIntended, NotificationChain msgs) {
		Reference oldIntended = intended;
		intended = newIntended;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__INTENDED, oldIntended, newIntended);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntended(Reference newIntended) {
		if (newIntended != intended) {
			NotificationChain msgs = null;
			if (intended != null)
				msgs = ((InternalEObject)intended).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__INTENDED, null, msgs);
			if (newIntended != null)
				msgs = ((InternalEObject)newIntended).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__INTENDED, null, msgs);
			msgs = basicSetIntended(newIntended, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__INTENDED, newIntended, newIntended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDirectnessMatch() {
		return directnessMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectnessMatch(CodeableConcept newDirectnessMatch, NotificationChain msgs) {
		CodeableConcept oldDirectnessMatch = directnessMatch;
		directnessMatch = newDirectnessMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DIRECTNESS_MATCH, oldDirectnessMatch, newDirectnessMatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectnessMatch(CodeableConcept newDirectnessMatch) {
		if (newDirectnessMatch != directnessMatch) {
			NotificationChain msgs = null;
			if (directnessMatch != null)
				msgs = ((InternalEObject)directnessMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DIRECTNESS_MATCH, null, msgs);
			if (newDirectnessMatch != null)
				msgs = ((InternalEObject)newDirectnessMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DIRECTNESS_MATCH, null, msgs);
			msgs = basicSetDirectnessMatch(newDirectnessMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DIRECTNESS_MATCH, newDirectnessMatch, newDirectnessMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__VARIABLE_ROLE:
				return basicSetVariableRole(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__OBSERVED:
				return basicSetObserved(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__INTENDED:
				return basicSetIntended(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DIRECTNESS_MATCH:
				return basicSetDirectnessMatch(null, msgs);
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
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__NOTE:
				return getNote();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__VARIABLE_ROLE:
				return getVariableRole();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__OBSERVED:
				return getObserved();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__INTENDED:
				return getIntended();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DIRECTNESS_MATCH:
				return getDirectnessMatch();
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
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__VARIABLE_ROLE:
				setVariableRole((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__OBSERVED:
				setObserved((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__INTENDED:
				setIntended((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DIRECTNESS_MATCH:
				setDirectnessMatch((CodeableConcept)newValue);
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
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__VARIABLE_ROLE:
				setVariableRole((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__OBSERVED:
				setObserved((Reference)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__INTENDED:
				setIntended((Reference)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DIRECTNESS_MATCH:
				setDirectnessMatch((CodeableConcept)null);
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
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__VARIABLE_ROLE:
				return variableRole != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__OBSERVED:
				return observed != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__INTENDED:
				return intended != null;
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION__DIRECTNESS_MATCH:
				return directnessMatch != null;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableDefinitionImpl
