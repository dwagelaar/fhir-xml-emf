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

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.MolecularSequenceEdit;
import org.hl7.emf.fhir.MolecularSequenceRelative;
import org.hl7.emf.fhir.MolecularSequenceStartingSequence;
import org.hl7.emf.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Relative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.MolecularSequenceRelativeImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MolecularSequenceRelativeImpl#getOrdinalPosition <em>Ordinal Position</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MolecularSequenceRelativeImpl#getSequenceRange <em>Sequence Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MolecularSequenceRelativeImpl#getStartingSequence <em>Starting Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MolecularSequenceRelativeImpl#getEdit <em>Edit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceRelativeImpl extends BackboneElementImpl implements MolecularSequenceRelative {
	/**
	 * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept coordinateSystem;

	/**
	 * The cached value of the '{@link #getOrdinalPosition() <em>Ordinal Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinalPosition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Integer ordinalPosition;

	/**
	 * The cached value of the '{@link #getSequenceRange() <em>Sequence Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceRange()
	 * @generated
	 * @ordered
	 */
	protected Range sequenceRange;

	/**
	 * The cached value of the '{@link #getStartingSequence() <em>Starting Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingSequence()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequenceStartingSequence startingSequence;

	/**
	 * The cached value of the '{@link #getEdit() <em>Edit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSequenceEdit> edit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceRelativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMolecularSequenceRelative();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCoordinateSystem() {
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(CodeableConcept newCoordinateSystem, NotificationChain msgs) {
		CodeableConcept oldCoordinateSystem = coordinateSystem;
		coordinateSystem = newCoordinateSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__COORDINATE_SYSTEM, oldCoordinateSystem, newCoordinateSystem);
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
	public void setCoordinateSystem(CodeableConcept newCoordinateSystem) {
		if (newCoordinateSystem != coordinateSystem) {
			NotificationChain msgs = null;
			if (coordinateSystem != null)
				msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__COORDINATE_SYSTEM, null, msgs);
			if (newCoordinateSystem != null)
				msgs = ((InternalEObject)newCoordinateSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__COORDINATE_SYSTEM, null, msgs);
			msgs = basicSetCoordinateSystem(newCoordinateSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__COORDINATE_SYSTEM, newCoordinateSystem, newCoordinateSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Integer getOrdinalPosition() {
		return ordinalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrdinalPosition(org.hl7.emf.fhir.Integer newOrdinalPosition, NotificationChain msgs) {
		org.hl7.emf.fhir.Integer oldOrdinalPosition = ordinalPosition;
		ordinalPosition = newOrdinalPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__ORDINAL_POSITION, oldOrdinalPosition, newOrdinalPosition);
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
	public void setOrdinalPosition(org.hl7.emf.fhir.Integer newOrdinalPosition) {
		if (newOrdinalPosition != ordinalPosition) {
			NotificationChain msgs = null;
			if (ordinalPosition != null)
				msgs = ((InternalEObject)ordinalPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__ORDINAL_POSITION, null, msgs);
			if (newOrdinalPosition != null)
				msgs = ((InternalEObject)newOrdinalPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__ORDINAL_POSITION, null, msgs);
			msgs = basicSetOrdinalPosition(newOrdinalPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__ORDINAL_POSITION, newOrdinalPosition, newOrdinalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getSequenceRange() {
		return sequenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceRange(Range newSequenceRange, NotificationChain msgs) {
		Range oldSequenceRange = sequenceRange;
		sequenceRange = newSequenceRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__SEQUENCE_RANGE, oldSequenceRange, newSequenceRange);
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
	public void setSequenceRange(Range newSequenceRange) {
		if (newSequenceRange != sequenceRange) {
			NotificationChain msgs = null;
			if (sequenceRange != null)
				msgs = ((InternalEObject)sequenceRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__SEQUENCE_RANGE, null, msgs);
			if (newSequenceRange != null)
				msgs = ((InternalEObject)newSequenceRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__SEQUENCE_RANGE, null, msgs);
			msgs = basicSetSequenceRange(newSequenceRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__SEQUENCE_RANGE, newSequenceRange, newSequenceRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceStartingSequence getStartingSequence() {
		return startingSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingSequence(MolecularSequenceStartingSequence newStartingSequence, NotificationChain msgs) {
		MolecularSequenceStartingSequence oldStartingSequence = startingSequence;
		startingSequence = newStartingSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__STARTING_SEQUENCE, oldStartingSequence, newStartingSequence);
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
	public void setStartingSequence(MolecularSequenceStartingSequence newStartingSequence) {
		if (newStartingSequence != startingSequence) {
			NotificationChain msgs = null;
			if (startingSequence != null)
				msgs = ((InternalEObject)startingSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__STARTING_SEQUENCE, null, msgs);
			if (newStartingSequence != null)
				msgs = ((InternalEObject)newStartingSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__STARTING_SEQUENCE, null, msgs);
			msgs = basicSetStartingSequence(newStartingSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__STARTING_SEQUENCE, newStartingSequence, newStartingSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MolecularSequenceEdit> getEdit() {
		if (edit == null) {
			edit = new EObjectContainmentEList<MolecularSequenceEdit>(MolecularSequenceEdit.class, this, FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__EDIT);
		}
		return edit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__ORDINAL_POSITION:
				return basicSetOrdinalPosition(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__SEQUENCE_RANGE:
				return basicSetSequenceRange(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__STARTING_SEQUENCE:
				return basicSetStartingSequence(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__EDIT:
				return ((InternalEList<?>)getEdit()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__COORDINATE_SYSTEM:
				return getCoordinateSystem();
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__ORDINAL_POSITION:
				return getOrdinalPosition();
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__SEQUENCE_RANGE:
				return getSequenceRange();
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__STARTING_SEQUENCE:
				return getStartingSequence();
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__EDIT:
				return getEdit();
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
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__COORDINATE_SYSTEM:
				setCoordinateSystem((CodeableConcept)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__ORDINAL_POSITION:
				setOrdinalPosition((org.hl7.emf.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__SEQUENCE_RANGE:
				setSequenceRange((Range)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__STARTING_SEQUENCE:
				setStartingSequence((MolecularSequenceStartingSequence)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__EDIT:
				getEdit().clear();
				getEdit().addAll((Collection<? extends MolecularSequenceEdit>)newValue);
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
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__COORDINATE_SYSTEM:
				setCoordinateSystem((CodeableConcept)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__ORDINAL_POSITION:
				setOrdinalPosition((org.hl7.emf.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__SEQUENCE_RANGE:
				setSequenceRange((Range)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__STARTING_SEQUENCE:
				setStartingSequence((MolecularSequenceStartingSequence)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__EDIT:
				getEdit().clear();
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
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__COORDINATE_SYSTEM:
				return coordinateSystem != null;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__ORDINAL_POSITION:
				return ordinalPosition != null;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__SEQUENCE_RANGE:
				return sequenceRange != null;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__STARTING_SEQUENCE:
				return startingSequence != null;
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE__EDIT:
				return edit != null && !edit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceRelativeImpl
