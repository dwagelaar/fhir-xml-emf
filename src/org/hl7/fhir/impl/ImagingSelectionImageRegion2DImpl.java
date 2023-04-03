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

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImagingSelectionDGraphicType;
import org.hl7.fhir.ImagingSelectionImageRegion2D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Selection Image Region2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImageRegion2DImpl#getRegionType <em>Region Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImageRegion2DImpl#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingSelectionImageRegion2DImpl extends BackboneElementImpl implements ImagingSelectionImageRegion2D {
	/**
	 * The cached value of the '{@link #getRegionType() <em>Region Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionType()
	 * @generated
	 * @ordered
	 */
	protected ImagingSelectionDGraphicType regionType;

	/**
	 * The cached value of the '{@link #getCoordinate() <em>Coordinate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> coordinate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingSelectionImageRegion2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingSelectionImageRegion2D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionDGraphicType getRegionType() {
		return regionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionType(ImagingSelectionDGraphicType newRegionType, NotificationChain msgs) {
		ImagingSelectionDGraphicType oldRegionType = regionType;
		regionType = newRegionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE, oldRegionType, newRegionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionType(ImagingSelectionDGraphicType newRegionType) {
		if (newRegionType != regionType) {
			NotificationChain msgs = null;
			if (regionType != null)
				msgs = ((InternalEObject)regionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE, null, msgs);
			if (newRegionType != null)
				msgs = ((InternalEObject)newRegionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE, null, msgs);
			msgs = basicSetRegionType(newRegionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE, newRegionType, newRegionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decimal> getCoordinate() {
		if (coordinate == null) {
			coordinate = new EObjectContainmentEList<Decimal>(Decimal.class, this, FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE);
		}
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				return basicSetRegionType(null, msgs);
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				return ((InternalEList<?>)getCoordinate()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				return getRegionType();
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				return getCoordinate();
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
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				setRegionType((ImagingSelectionDGraphicType)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				getCoordinate().clear();
				getCoordinate().addAll((Collection<? extends Decimal>)newValue);
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
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				setRegionType((ImagingSelectionDGraphicType)null);
				return;
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				getCoordinate().clear();
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
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				return regionType != null;
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				return coordinate != null && !coordinate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingSelectionImageRegion2DImpl
