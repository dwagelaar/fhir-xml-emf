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

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.GraphDefinitionCompartment;
import org.hl7.emf.fhir.GraphDefinitionLink;
import org.hl7.emf.fhir.Id;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Definition Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.GraphDefinitionLinkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.GraphDefinitionLinkImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.GraphDefinitionLinkImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.GraphDefinitionLinkImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.GraphDefinitionLinkImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.GraphDefinitionLinkImpl#getSliceName <em>Slice Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.GraphDefinitionLinkImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.GraphDefinitionLinkImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.GraphDefinitionLinkImpl#getCompartment <em>Compartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphDefinitionLinkImpl extends BackboneElementImpl implements GraphDefinitionLink {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String description;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String max;

	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected Id sourceId;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String path;

	/**
	 * The cached value of the '{@link #getSliceName() <em>Slice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String sliceName;

	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected Id targetId;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String params;

	/**
	 * The cached value of the '{@link #getCompartment() <em>Compartment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartment()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphDefinitionCompartment> compartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphDefinitionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGraphDefinitionLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.emf.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.emf.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(org.hl7.emf.fhir.Integer newMin, NotificationChain msgs) {
		org.hl7.emf.fhir.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__MIN, oldMin, newMin);
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
	public void setMin(org.hl7.emf.fhir.Integer newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(org.hl7.emf.fhir.String newMax, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__MAX, oldMax, newMax);
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
	public void setMax(org.hl7.emf.fhir.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceId(Id newSourceId, NotificationChain msgs) {
		Id oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__SOURCE_ID, oldSourceId, newSourceId);
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
	public void setSourceId(Id newSourceId) {
		if (newSourceId != sourceId) {
			NotificationChain msgs = null;
			if (sourceId != null)
				msgs = ((InternalEObject)sourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__SOURCE_ID, null, msgs);
			if (newSourceId != null)
				msgs = ((InternalEObject)newSourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__SOURCE_ID, null, msgs);
			msgs = basicSetSourceId(newSourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__SOURCE_ID, newSourceId, newSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.hl7.emf.fhir.String newPath, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__PATH, oldPath, newPath);
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
	public void setPath(org.hl7.emf.fhir.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getSliceName() {
		return sliceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSliceName(org.hl7.emf.fhir.String newSliceName, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldSliceName = sliceName;
		sliceName = newSliceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, oldSliceName, newSliceName);
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
	public void setSliceName(org.hl7.emf.fhir.String newSliceName) {
		if (newSliceName != sliceName) {
			NotificationChain msgs = null;
			if (sliceName != null)
				msgs = ((InternalEObject)sliceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, null, msgs);
			if (newSliceName != null)
				msgs = ((InternalEObject)newSliceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, null, msgs);
			msgs = basicSetSliceName(newSliceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, newSliceName, newSliceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetId(Id newTargetId, NotificationChain msgs) {
		Id oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__TARGET_ID, oldTargetId, newTargetId);
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
	public void setTargetId(Id newTargetId) {
		if (newTargetId != targetId) {
			NotificationChain msgs = null;
			if (targetId != null)
				msgs = ((InternalEObject)targetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__TARGET_ID, null, msgs);
			if (newTargetId != null)
				msgs = ((InternalEObject)newTargetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__TARGET_ID, null, msgs);
			msgs = basicSetTargetId(newTargetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__TARGET_ID, newTargetId, newTargetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(org.hl7.emf.fhir.String newParams, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__PARAMS, oldParams, newParams);
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
	public void setParams(org.hl7.emf.fhir.String newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphDefinitionCompartment> getCompartment() {
		if (compartment == null) {
			compartment = new EObjectContainmentEList<GraphDefinitionCompartment>(GraphDefinitionCompartment.class, this, FhirPackage.GRAPH_DEFINITION_LINK__COMPARTMENT);
		}
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				return basicSetMin(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				return basicSetMax(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__SOURCE_ID:
				return basicSetSourceId(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				return basicSetPath(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				return basicSetSliceName(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET_ID:
				return basicSetTargetId(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__PARAMS:
				return basicSetParams(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__COMPARTMENT:
				return ((InternalEList<?>)getCompartment()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				return getDescription();
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				return getMin();
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				return getMax();
			case FhirPackage.GRAPH_DEFINITION_LINK__SOURCE_ID:
				return getSourceId();
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				return getPath();
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				return getSliceName();
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET_ID:
				return getTargetId();
			case FhirPackage.GRAPH_DEFINITION_LINK__PARAMS:
				return getParams();
			case FhirPackage.GRAPH_DEFINITION_LINK__COMPARTMENT:
				return getCompartment();
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
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				setDescription((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				setMin((org.hl7.emf.fhir.Integer)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				setMax((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__SOURCE_ID:
				setSourceId((Id)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				setPath((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				setSliceName((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET_ID:
				setTargetId((Id)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__PARAMS:
				setParams((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__COMPARTMENT:
				getCompartment().clear();
				getCompartment().addAll((Collection<? extends GraphDefinitionCompartment>)newValue);
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
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				setDescription((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				setMin((org.hl7.emf.fhir.Integer)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				setMax((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__SOURCE_ID:
				setSourceId((Id)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				setPath((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				setSliceName((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET_ID:
				setTargetId((Id)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__PARAMS:
				setParams((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__COMPARTMENT:
				getCompartment().clear();
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
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				return description != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				return min != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				return max != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__SOURCE_ID:
				return sourceId != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				return path != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				return sliceName != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET_ID:
				return targetId != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__PARAMS:
				return params != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__COMPARTMENT:
				return compartment != null && !compartment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphDefinitionLinkImpl
