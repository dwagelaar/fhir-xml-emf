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

import org.hl7.emf.fhir.Annotation;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.EvidenceCertainty;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Certainty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceCertaintyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceCertaintyImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceCertaintyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceCertaintyImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceCertaintyImpl#getRater <em>Rater</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceCertaintyImpl#getSubcomponent <em>Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceCertaintyImpl extends BackboneElementImpl implements EvidenceCertainty {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept rating;

	/**
	 * The cached value of the '{@link #getRater() <em>Rater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRater()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String rater;

	/**
	 * The cached value of the '{@link #getSubcomponent() <em>Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceCertainty> subcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceCertaintyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceCertainty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_CERTAINTY__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_CERTAINTY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_CERTAINTY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_CERTAINTY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.EVIDENCE_CERTAINTY__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_CERTAINTY__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_CERTAINTY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_CERTAINTY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_CERTAINTY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRating(CodeableConcept newRating, NotificationChain msgs) {
		CodeableConcept oldRating = rating;
		rating = newRating;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_CERTAINTY__RATING, oldRating, newRating);
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
	public void setRating(CodeableConcept newRating) {
		if (newRating != rating) {
			NotificationChain msgs = null;
			if (rating != null)
				msgs = ((InternalEObject)rating).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_CERTAINTY__RATING, null, msgs);
			if (newRating != null)
				msgs = ((InternalEObject)newRating).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_CERTAINTY__RATING, null, msgs);
			msgs = basicSetRating(newRating, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_CERTAINTY__RATING, newRating, newRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getRater() {
		return rater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRater(org.hl7.emf.fhir.String newRater, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldRater = rater;
		rater = newRater;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_CERTAINTY__RATER, oldRater, newRater);
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
	public void setRater(org.hl7.emf.fhir.String newRater) {
		if (newRater != rater) {
			NotificationChain msgs = null;
			if (rater != null)
				msgs = ((InternalEObject)rater).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_CERTAINTY__RATER, null, msgs);
			if (newRater != null)
				msgs = ((InternalEObject)newRater).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_CERTAINTY__RATER, null, msgs);
			msgs = basicSetRater(newRater, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_CERTAINTY__RATER, newRater, newRater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvidenceCertainty> getSubcomponent() {
		if (subcomponent == null) {
			subcomponent = new EObjectContainmentEList<EvidenceCertainty>(EvidenceCertainty.class, this, FhirPackage.EVIDENCE_CERTAINTY__SUBCOMPONENT);
		}
		return subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_CERTAINTY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE_CERTAINTY__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_CERTAINTY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EVIDENCE_CERTAINTY__RATING:
				return basicSetRating(null, msgs);
			case FhirPackage.EVIDENCE_CERTAINTY__RATER:
				return basicSetRater(null, msgs);
			case FhirPackage.EVIDENCE_CERTAINTY__SUBCOMPONENT:
				return ((InternalEList<?>)getSubcomponent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EVIDENCE_CERTAINTY__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE_CERTAINTY__NOTE:
				return getNote();
			case FhirPackage.EVIDENCE_CERTAINTY__TYPE:
				return getType();
			case FhirPackage.EVIDENCE_CERTAINTY__RATING:
				return getRating();
			case FhirPackage.EVIDENCE_CERTAINTY__RATER:
				return getRater();
			case FhirPackage.EVIDENCE_CERTAINTY__SUBCOMPONENT:
				return getSubcomponent();
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
			case FhirPackage.EVIDENCE_CERTAINTY__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__RATING:
				setRating((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__RATER:
				setRater((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__SUBCOMPONENT:
				getSubcomponent().clear();
				getSubcomponent().addAll((Collection<? extends EvidenceCertainty>)newValue);
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
			case FhirPackage.EVIDENCE_CERTAINTY__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__RATING:
				setRating((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__RATER:
				setRater((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_CERTAINTY__SUBCOMPONENT:
				getSubcomponent().clear();
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
			case FhirPackage.EVIDENCE_CERTAINTY__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE_CERTAINTY__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EVIDENCE_CERTAINTY__TYPE:
				return type != null;
			case FhirPackage.EVIDENCE_CERTAINTY__RATING:
				return rating != null;
			case FhirPackage.EVIDENCE_CERTAINTY__RATER:
				return rater != null;
			case FhirPackage.EVIDENCE_CERTAINTY__SUBCOMPONENT:
				return subcomponent != null && !subcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceCertaintyImpl
