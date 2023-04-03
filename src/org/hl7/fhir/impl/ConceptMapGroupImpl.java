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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.ConceptMapUnmapped;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapGroupImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapGroupImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapGroupImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapGroupImpl#getUnmapped <em>Unmapped</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapGroupImpl extends BackboneElementImpl implements ConceptMapGroup {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Canonical source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Canonical target;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapElement> element;

	/**
	 * The cached value of the '{@link #getUnmapped() <em>Unmapped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmapped()
	 * @generated
	 * @ordered
	 */
	protected ConceptMapUnmapped unmapped;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConceptMapGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Canonical newSource, NotificationChain msgs) {
		Canonical oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Canonical newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Canonical newTarget, NotificationChain msgs) {
		Canonical oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Canonical newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapElement> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<ConceptMapElement>(ConceptMapElement.class, this, FhirPackage.CONCEPT_MAP_GROUP__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapUnmapped getUnmapped() {
		return unmapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnmapped(ConceptMapUnmapped newUnmapped, NotificationChain msgs) {
		ConceptMapUnmapped oldUnmapped = unmapped;
		unmapped = newUnmapped;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__UNMAPPED, oldUnmapped, newUnmapped);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnmapped(ConceptMapUnmapped newUnmapped) {
		if (newUnmapped != unmapped) {
			NotificationChain msgs = null;
			if (unmapped != null)
				msgs = ((InternalEObject)unmapped).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__UNMAPPED, null, msgs);
			if (newUnmapped != null)
				msgs = ((InternalEObject)newUnmapped).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__UNMAPPED, null, msgs);
			msgs = basicSetUnmapped(newUnmapped, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__UNMAPPED, newUnmapped, newUnmapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				return basicSetUnmapped(null, msgs);
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
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				return getSource();
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				return getTarget();
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return getElement();
			case FhirPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				return getUnmapped();
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
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				setSource((Canonical)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				setTarget((Canonical)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends ConceptMapElement>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				setUnmapped((ConceptMapUnmapped)newValue);
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
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				setSource((Canonical)null);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				setTarget((Canonical)null);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				getElement().clear();
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				setUnmapped((ConceptMapUnmapped)null);
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
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				return source != null;
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				return target != null;
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return element != null && !element.isEmpty();
			case FhirPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				return unmapped != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapGroupImpl
