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
import org.hl7.fhir.EvidenceSampleSize;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Sample Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceSampleSizeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceSampleSizeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceSampleSizeImpl#getNumberOfStudies <em>Number Of Studies</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceSampleSizeImpl#getNumberOfParticipants <em>Number Of Participants</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceSampleSizeImpl#getKnownDataCount <em>Known Data Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceSampleSizeImpl extends BackboneElementImpl implements EvidenceSampleSize {
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
	 * The cached value of the '{@link #getNumberOfStudies() <em>Number Of Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStudies()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfStudies;

	/**
	 * The cached value of the '{@link #getNumberOfParticipants() <em>Number Of Participants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfParticipants()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfParticipants;

	/**
	 * The cached value of the '{@link #getKnownDataCount() <em>Known Data Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownDataCount()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt knownDataCount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceSampleSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceSampleSize();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_SAMPLE_SIZE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_SAMPLE_SIZE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_SAMPLE_SIZE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_SAMPLE_SIZE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.EVIDENCE_SAMPLE_SIZE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfStudies() {
		return numberOfStudies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfStudies(UnsignedInt newNumberOfStudies, NotificationChain msgs) {
		UnsignedInt oldNumberOfStudies = numberOfStudies;
		numberOfStudies = newNumberOfStudies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_STUDIES, oldNumberOfStudies, newNumberOfStudies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfStudies(UnsignedInt newNumberOfStudies) {
		if (newNumberOfStudies != numberOfStudies) {
			NotificationChain msgs = null;
			if (numberOfStudies != null)
				msgs = ((InternalEObject)numberOfStudies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_STUDIES, null, msgs);
			if (newNumberOfStudies != null)
				msgs = ((InternalEObject)newNumberOfStudies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_STUDIES, null, msgs);
			msgs = basicSetNumberOfStudies(newNumberOfStudies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_STUDIES, newNumberOfStudies, newNumberOfStudies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfParticipants() {
		return numberOfParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfParticipants(UnsignedInt newNumberOfParticipants, NotificationChain msgs) {
		UnsignedInt oldNumberOfParticipants = numberOfParticipants;
		numberOfParticipants = newNumberOfParticipants;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS, oldNumberOfParticipants, newNumberOfParticipants);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfParticipants(UnsignedInt newNumberOfParticipants) {
		if (newNumberOfParticipants != numberOfParticipants) {
			NotificationChain msgs = null;
			if (numberOfParticipants != null)
				msgs = ((InternalEObject)numberOfParticipants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS, null, msgs);
			if (newNumberOfParticipants != null)
				msgs = ((InternalEObject)newNumberOfParticipants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS, null, msgs);
			msgs = basicSetNumberOfParticipants(newNumberOfParticipants, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS, newNumberOfParticipants, newNumberOfParticipants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getKnownDataCount() {
		return knownDataCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnownDataCount(UnsignedInt newKnownDataCount, NotificationChain msgs) {
		UnsignedInt oldKnownDataCount = knownDataCount;
		knownDataCount = newKnownDataCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_SAMPLE_SIZE__KNOWN_DATA_COUNT, oldKnownDataCount, newKnownDataCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnownDataCount(UnsignedInt newKnownDataCount) {
		if (newKnownDataCount != knownDataCount) {
			NotificationChain msgs = null;
			if (knownDataCount != null)
				msgs = ((InternalEObject)knownDataCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_SAMPLE_SIZE__KNOWN_DATA_COUNT, null, msgs);
			if (newKnownDataCount != null)
				msgs = ((InternalEObject)newKnownDataCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_SAMPLE_SIZE__KNOWN_DATA_COUNT, null, msgs);
			msgs = basicSetKnownDataCount(newKnownDataCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_SAMPLE_SIZE__KNOWN_DATA_COUNT, newKnownDataCount, newKnownDataCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				return basicSetNumberOfStudies(null, msgs);
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				return basicSetNumberOfParticipants(null, msgs);
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__KNOWN_DATA_COUNT:
				return basicSetKnownDataCount(null, msgs);
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
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NOTE:
				return getNote();
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				return getNumberOfStudies();
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				return getNumberOfParticipants();
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__KNOWN_DATA_COUNT:
				return getKnownDataCount();
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
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				setNumberOfStudies((UnsignedInt)newValue);
				return;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				setNumberOfParticipants((UnsignedInt)newValue);
				return;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__KNOWN_DATA_COUNT:
				setKnownDataCount((UnsignedInt)newValue);
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
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				setNumberOfStudies((UnsignedInt)null);
				return;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				setNumberOfParticipants((UnsignedInt)null);
				return;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__KNOWN_DATA_COUNT:
				setKnownDataCount((UnsignedInt)null);
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
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				return numberOfStudies != null;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				return numberOfParticipants != null;
			case FhirPackage.EVIDENCE_SAMPLE_SIZE__KNOWN_DATA_COUNT:
				return knownDataCount != null;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceSampleSizeImpl
