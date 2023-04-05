/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.Code;
import org.hl7.emf.fhir.ConceptMapGroupUnmappedMode;
import org.hl7.emf.fhir.ConceptMapRelationship;
import org.hl7.emf.fhir.ConceptMapUnmapped;
import org.hl7.emf.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Unmapped</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapUnmappedImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapUnmappedImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapUnmappedImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapUnmappedImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapUnmappedImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapUnmappedImpl#getOtherMap <em>Other Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapUnmappedImpl extends BackboneElementImpl implements ConceptMapUnmapped {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ConceptMapGroupUnmappedMode mode;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String display;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected Canonical valueSet;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected ConceptMapRelationship relationship;

	/**
	 * The cached value of the '{@link #getOtherMap() <em>Other Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMap()
	 * @generated
	 * @ordered
	 */
	protected Canonical otherMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapUnmappedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConceptMapUnmapped();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapGroupUnmappedMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(ConceptMapGroupUnmappedMode newMode, NotificationChain msgs) {
		ConceptMapGroupUnmappedMode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__MODE, oldMode, newMode);
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
	public void setMode(ConceptMapGroupUnmappedMode newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__CODE, oldCode, newCode);
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
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.emf.fhir.String newDisplay, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__DISPLAY, oldDisplay, newDisplay);
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
	public void setDisplay(org.hl7.emf.fhir.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(Canonical newValueSet, NotificationChain msgs) {
		Canonical oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__VALUE_SET, oldValueSet, newValueSet);
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
	public void setValueSet(Canonical newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapRelationship getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(ConceptMapRelationship newRelationship, NotificationChain msgs) {
		ConceptMapRelationship oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(ConceptMapRelationship newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getOtherMap() {
		return otherMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherMap(Canonical newOtherMap, NotificationChain msgs) {
		Canonical oldOtherMap = otherMap;
		otherMap = newOtherMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__OTHER_MAP, oldOtherMap, newOtherMap);
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
	public void setOtherMap(Canonical newOtherMap) {
		if (newOtherMap != otherMap) {
			NotificationChain msgs = null;
			if (otherMap != null)
				msgs = ((InternalEObject)otherMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__OTHER_MAP, null, msgs);
			if (newOtherMap != null)
				msgs = ((InternalEObject)newOtherMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_UNMAPPED__OTHER_MAP, null, msgs);
			msgs = basicSetOtherMap(newOtherMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_UNMAPPED__OTHER_MAP, newOtherMap, newOtherMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONCEPT_MAP_UNMAPPED__MODE:
				return basicSetMode(null, msgs);
			case FhirPackage.CONCEPT_MAP_UNMAPPED__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CONCEPT_MAP_UNMAPPED__DISPLAY:
				return basicSetDisplay(null, msgs);
			case FhirPackage.CONCEPT_MAP_UNMAPPED__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case FhirPackage.CONCEPT_MAP_UNMAPPED__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.CONCEPT_MAP_UNMAPPED__OTHER_MAP:
				return basicSetOtherMap(null, msgs);
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
			case FhirPackage.CONCEPT_MAP_UNMAPPED__MODE:
				return getMode();
			case FhirPackage.CONCEPT_MAP_UNMAPPED__CODE:
				return getCode();
			case FhirPackage.CONCEPT_MAP_UNMAPPED__DISPLAY:
				return getDisplay();
			case FhirPackage.CONCEPT_MAP_UNMAPPED__VALUE_SET:
				return getValueSet();
			case FhirPackage.CONCEPT_MAP_UNMAPPED__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.CONCEPT_MAP_UNMAPPED__OTHER_MAP:
				return getOtherMap();
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
			case FhirPackage.CONCEPT_MAP_UNMAPPED__MODE:
				setMode((ConceptMapGroupUnmappedMode)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__CODE:
				setCode((Code)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__DISPLAY:
				setDisplay((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__VALUE_SET:
				setValueSet((Canonical)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__RELATIONSHIP:
				setRelationship((ConceptMapRelationship)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__OTHER_MAP:
				setOtherMap((Canonical)newValue);
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
			case FhirPackage.CONCEPT_MAP_UNMAPPED__MODE:
				setMode((ConceptMapGroupUnmappedMode)null);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__CODE:
				setCode((Code)null);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__DISPLAY:
				setDisplay((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__VALUE_SET:
				setValueSet((Canonical)null);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__RELATIONSHIP:
				setRelationship((ConceptMapRelationship)null);
				return;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__OTHER_MAP:
				setOtherMap((Canonical)null);
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
			case FhirPackage.CONCEPT_MAP_UNMAPPED__MODE:
				return mode != null;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__CODE:
				return code != null;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__DISPLAY:
				return display != null;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__VALUE_SET:
				return valueSet != null;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.CONCEPT_MAP_UNMAPPED__OTHER_MAP:
				return otherMap != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapUnmappedImpl
