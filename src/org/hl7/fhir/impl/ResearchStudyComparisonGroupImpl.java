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
import org.hl7.fhir.Id;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ResearchStudyComparisonGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Study Comparison Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyComparisonGroupImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyComparisonGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyComparisonGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyComparisonGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyComparisonGroupImpl#getIntendedExposure <em>Intended Exposure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyComparisonGroupImpl#getObservedGroup <em>Observed Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchStudyComparisonGroupImpl extends BackboneElementImpl implements ResearchStudyComparisonGroup {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected Id linkId;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

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
	 * The cached value of the '{@link #getIntendedExposure() <em>Intended Exposure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedExposure()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> intendedExposure;

	/**
	 * The cached value of the '{@link #getObservedGroup() <em>Observed Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedGroup()
	 * @generated
	 * @ordered
	 */
	protected Reference observedGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchStudyComparisonGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResearchStudyComparisonGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(Id newLinkId, NotificationChain msgs) {
		Id oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__LINK_ID, oldLinkId, newLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(Id newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__LINK_ID, newLinkId, newLinkId));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getIntendedExposure() {
		if (intendedExposure == null) {
			intendedExposure = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__INTENDED_EXPOSURE);
		}
		return intendedExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getObservedGroup() {
		return observedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservedGroup(Reference newObservedGroup, NotificationChain msgs) {
		Reference oldObservedGroup = observedGroup;
		observedGroup = newObservedGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__OBSERVED_GROUP, oldObservedGroup, newObservedGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedGroup(Reference newObservedGroup) {
		if (newObservedGroup != observedGroup) {
			NotificationChain msgs = null;
			if (observedGroup != null)
				msgs = ((InternalEObject)observedGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__OBSERVED_GROUP, null, msgs);
			if (newObservedGroup != null)
				msgs = ((InternalEObject)newObservedGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__OBSERVED_GROUP, null, msgs);
			msgs = basicSetObservedGroup(newObservedGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__OBSERVED_GROUP, newObservedGroup, newObservedGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__INTENDED_EXPOSURE:
				return ((InternalEList<?>)getIntendedExposure()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__OBSERVED_GROUP:
				return basicSetObservedGroup(null, msgs);
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
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__LINK_ID:
				return getLinkId();
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__NAME:
				return getName();
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__TYPE:
				return getType();
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__DESCRIPTION:
				return getDescription();
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__INTENDED_EXPOSURE:
				return getIntendedExposure();
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__OBSERVED_GROUP:
				return getObservedGroup();
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
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__LINK_ID:
				setLinkId((Id)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__INTENDED_EXPOSURE:
				getIntendedExposure().clear();
				getIntendedExposure().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__OBSERVED_GROUP:
				setObservedGroup((Reference)newValue);
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
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__LINK_ID:
				setLinkId((Id)null);
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__INTENDED_EXPOSURE:
				getIntendedExposure().clear();
				return;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__OBSERVED_GROUP:
				setObservedGroup((Reference)null);
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
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__LINK_ID:
				return linkId != null;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__NAME:
				return name != null;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__TYPE:
				return type != null;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__DESCRIPTION:
				return description != null;
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__INTENDED_EXPOSURE:
				return intendedExposure != null && !intendedExposure.isEmpty();
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP__OBSERVED_GROUP:
				return observedGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ResearchStudyComparisonGroupImpl
