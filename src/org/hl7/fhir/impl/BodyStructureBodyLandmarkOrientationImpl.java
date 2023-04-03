/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.BodyStructureBodyLandmarkOrientation;
import org.hl7.fhir.BodyStructureDistanceFromLandmark;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Structure Body Landmark Orientation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureBodyLandmarkOrientationImpl#getLandmarkDescription <em>Landmark Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureBodyLandmarkOrientationImpl#getClockFacePosition <em>Clock Face Position</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureBodyLandmarkOrientationImpl#getDistanceFromLandmark <em>Distance From Landmark</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureBodyLandmarkOrientationImpl#getSurfaceOrientation <em>Surface Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyStructureBodyLandmarkOrientationImpl extends BackboneElementImpl implements BodyStructureBodyLandmarkOrientation {
	/**
	 * The cached value of the '{@link #getLandmarkDescription() <em>Landmark Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandmarkDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> landmarkDescription;

	/**
	 * The cached value of the '{@link #getClockFacePosition() <em>Clock Face Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockFacePosition()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> clockFacePosition;

	/**
	 * The cached value of the '{@link #getDistanceFromLandmark() <em>Distance From Landmark</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceFromLandmark()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyStructureDistanceFromLandmark> distanceFromLandmark;

	/**
	 * The cached value of the '{@link #getSurfaceOrientation() <em>Surface Orientation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceOrientation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> surfaceOrientation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyStructureBodyLandmarkOrientationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBodyStructureBodyLandmarkOrientation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getLandmarkDescription() {
		if (landmarkDescription == null) {
			landmarkDescription = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__LANDMARK_DESCRIPTION);
		}
		return landmarkDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getClockFacePosition() {
		if (clockFacePosition == null) {
			clockFacePosition = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__CLOCK_FACE_POSITION);
		}
		return clockFacePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyStructureDistanceFromLandmark> getDistanceFromLandmark() {
		if (distanceFromLandmark == null) {
			distanceFromLandmark = new EObjectContainmentEList<BodyStructureDistanceFromLandmark>(BodyStructureDistanceFromLandmark.class, this, FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__DISTANCE_FROM_LANDMARK);
		}
		return distanceFromLandmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSurfaceOrientation() {
		if (surfaceOrientation == null) {
			surfaceOrientation = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__SURFACE_ORIENTATION);
		}
		return surfaceOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__LANDMARK_DESCRIPTION:
				return ((InternalEList<?>)getLandmarkDescription()).basicRemove(otherEnd, msgs);
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__CLOCK_FACE_POSITION:
				return ((InternalEList<?>)getClockFacePosition()).basicRemove(otherEnd, msgs);
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__DISTANCE_FROM_LANDMARK:
				return ((InternalEList<?>)getDistanceFromLandmark()).basicRemove(otherEnd, msgs);
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__SURFACE_ORIENTATION:
				return ((InternalEList<?>)getSurfaceOrientation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__LANDMARK_DESCRIPTION:
				return getLandmarkDescription();
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__CLOCK_FACE_POSITION:
				return getClockFacePosition();
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__DISTANCE_FROM_LANDMARK:
				return getDistanceFromLandmark();
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__SURFACE_ORIENTATION:
				return getSurfaceOrientation();
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
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__LANDMARK_DESCRIPTION:
				getLandmarkDescription().clear();
				getLandmarkDescription().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__CLOCK_FACE_POSITION:
				getClockFacePosition().clear();
				getClockFacePosition().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__DISTANCE_FROM_LANDMARK:
				getDistanceFromLandmark().clear();
				getDistanceFromLandmark().addAll((Collection<? extends BodyStructureDistanceFromLandmark>)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__SURFACE_ORIENTATION:
				getSurfaceOrientation().clear();
				getSurfaceOrientation().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__LANDMARK_DESCRIPTION:
				getLandmarkDescription().clear();
				return;
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__CLOCK_FACE_POSITION:
				getClockFacePosition().clear();
				return;
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__DISTANCE_FROM_LANDMARK:
				getDistanceFromLandmark().clear();
				return;
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__SURFACE_ORIENTATION:
				getSurfaceOrientation().clear();
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
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__LANDMARK_DESCRIPTION:
				return landmarkDescription != null && !landmarkDescription.isEmpty();
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__CLOCK_FACE_POSITION:
				return clockFacePosition != null && !clockFacePosition.isEmpty();
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__DISTANCE_FROM_LANDMARK:
				return distanceFromLandmark != null && !distanceFromLandmark.isEmpty();
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION__SURFACE_ORIENTATION:
				return surfaceOrientation != null && !surfaceOrientation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyStructureBodyLandmarkOrientationImpl
