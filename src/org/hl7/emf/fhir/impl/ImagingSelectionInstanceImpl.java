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

import org.hl7.emf.fhir.Coding;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Id;
import org.hl7.emf.fhir.ImagingSelectionImageRegion2D;
import org.hl7.emf.fhir.ImagingSelectionImageRegion3D;
import org.hl7.emf.fhir.ImagingSelectionInstance;
import org.hl7.emf.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Selection Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ImagingSelectionInstanceImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImagingSelectionInstanceImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImagingSelectionInstanceImpl#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImagingSelectionInstanceImpl#getSubset <em>Subset</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImagingSelectionInstanceImpl#getImageRegion2D <em>Image Region2 D</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImagingSelectionInstanceImpl#getImageRegion3D <em>Image Region3 D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingSelectionInstanceImpl extends BackboneElementImpl implements ImagingSelectionInstance {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Id uid;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt number;

	/**
	 * The cached value of the '{@link #getSopClass() <em>Sop Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSopClass()
	 * @generated
	 * @ordered
	 */
	protected Coding sopClass;

	/**
	 * The cached value of the '{@link #getSubset() <em>Subset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubset()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.emf.fhir.String> subset;

	/**
	 * The cached value of the '{@link #getImageRegion2D() <em>Image Region2 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRegion2D()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingSelectionImageRegion2D> imageRegion2D;

	/**
	 * The cached value of the '{@link #getImageRegion3D() <em>Image Region3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRegion3D()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingSelectionImageRegion3D> imageRegion3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingSelectionInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingSelectionInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(Id newUid, NotificationChain msgs) {
		Id oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION_INSTANCE__UID, oldUid, newUid);
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
	public void setUid(Id newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION_INSTANCE__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION_INSTANCE__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION_INSTANCE__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(UnsignedInt newNumber, NotificationChain msgs) {
		UnsignedInt oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION_INSTANCE__NUMBER, oldNumber, newNumber);
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
	public void setNumber(UnsignedInt newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION_INSTANCE__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION_INSTANCE__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION_INSTANCE__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getSopClass() {
		return sopClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSopClass(Coding newSopClass, NotificationChain msgs) {
		Coding oldSopClass = sopClass;
		sopClass = newSopClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION_INSTANCE__SOP_CLASS, oldSopClass, newSopClass);
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
	public void setSopClass(Coding newSopClass) {
		if (newSopClass != sopClass) {
			NotificationChain msgs = null;
			if (sopClass != null)
				msgs = ((InternalEObject)sopClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION_INSTANCE__SOP_CLASS, null, msgs);
			if (newSopClass != null)
				msgs = ((InternalEObject)newSopClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_SELECTION_INSTANCE__SOP_CLASS, null, msgs);
			msgs = basicSetSopClass(newSopClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_SELECTION_INSTANCE__SOP_CLASS, newSopClass, newSopClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.emf.fhir.String> getSubset() {
		if (subset == null) {
			subset = new EObjectContainmentEList<org.hl7.emf.fhir.String>(org.hl7.emf.fhir.String.class, this, FhirPackage.IMAGING_SELECTION_INSTANCE__SUBSET);
		}
		return subset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImagingSelectionImageRegion2D> getImageRegion2D() {
		if (imageRegion2D == null) {
			imageRegion2D = new EObjectContainmentEList<ImagingSelectionImageRegion2D>(ImagingSelectionImageRegion2D.class, this, FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION2_D);
		}
		return imageRegion2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImagingSelectionImageRegion3D> getImageRegion3D() {
		if (imageRegion3D == null) {
			imageRegion3D = new EObjectContainmentEList<ImagingSelectionImageRegion3D>(ImagingSelectionImageRegion3D.class, this, FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION3_D);
		}
		return imageRegion3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_SELECTION_INSTANCE__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_SELECTION_INSTANCE__NUMBER:
				return basicSetNumber(null, msgs);
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SOP_CLASS:
				return basicSetSopClass(null, msgs);
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SUBSET:
				return ((InternalEList<?>)getSubset()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION2_D:
				return ((InternalEList<?>)getImageRegion2D()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION3_D:
				return ((InternalEList<?>)getImageRegion3D()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_SELECTION_INSTANCE__UID:
				return getUid();
			case FhirPackage.IMAGING_SELECTION_INSTANCE__NUMBER:
				return getNumber();
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SOP_CLASS:
				return getSopClass();
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SUBSET:
				return getSubset();
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION2_D:
				return getImageRegion2D();
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION3_D:
				return getImageRegion3D();
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
			case FhirPackage.IMAGING_SELECTION_INSTANCE__UID:
				setUid((Id)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__NUMBER:
				setNumber((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SOP_CLASS:
				setSopClass((Coding)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SUBSET:
				getSubset().clear();
				getSubset().addAll((Collection<? extends org.hl7.emf.fhir.String>)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION2_D:
				getImageRegion2D().clear();
				getImageRegion2D().addAll((Collection<? extends ImagingSelectionImageRegion2D>)newValue);
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION3_D:
				getImageRegion3D().clear();
				getImageRegion3D().addAll((Collection<? extends ImagingSelectionImageRegion3D>)newValue);
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
			case FhirPackage.IMAGING_SELECTION_INSTANCE__UID:
				setUid((Id)null);
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__NUMBER:
				setNumber((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SOP_CLASS:
				setSopClass((Coding)null);
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SUBSET:
				getSubset().clear();
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION2_D:
				getImageRegion2D().clear();
				return;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION3_D:
				getImageRegion3D().clear();
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
			case FhirPackage.IMAGING_SELECTION_INSTANCE__UID:
				return uid != null;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__NUMBER:
				return number != null;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SOP_CLASS:
				return sopClass != null;
			case FhirPackage.IMAGING_SELECTION_INSTANCE__SUBSET:
				return subset != null && !subset.isEmpty();
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION2_D:
				return imageRegion2D != null && !imageRegion2D.isEmpty();
			case FhirPackage.IMAGING_SELECTION_INSTANCE__IMAGE_REGION3_D:
				return imageRegion3D != null && !imageRegion3D.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingSelectionInstanceImpl
