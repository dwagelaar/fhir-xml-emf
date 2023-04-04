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
import org.hl7.emf.fhir.ConceptMapProperty;
import org.hl7.emf.fhir.ConceptMapPropertyType;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapPropertyImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapPropertyImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ConceptMapPropertyImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapPropertyImpl extends BackboneElementImpl implements ConceptMapProperty {
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
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected Uri uri;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConceptMapPropertyType type;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Canonical system;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConceptMapProperty();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUri(Uri newUri, NotificationChain msgs) {
		Uri oldUri = uri;
		uri = newUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__URI, oldUri, newUri);
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
	public void setUri(Uri newUri) {
		if (newUri != uri) {
			NotificationChain msgs = null;
			if (uri != null)
				msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__URI, null, msgs);
			if (newUri != null)
				msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__URI, null, msgs);
			msgs = basicSetUri(newUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__URI, newUri, newUri));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapPropertyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ConceptMapPropertyType newType, NotificationChain msgs) {
		ConceptMapPropertyType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__TYPE, oldType, newType);
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
	public void setType(ConceptMapPropertyType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Canonical newSystem, NotificationChain msgs) {
		Canonical oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__SYSTEM, oldSystem, newSystem);
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
	public void setSystem(Canonical newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_PROPERTY__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_PROPERTY__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONCEPT_MAP_PROPERTY__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CONCEPT_MAP_PROPERTY__URI:
				return basicSetUri(null, msgs);
			case FhirPackage.CONCEPT_MAP_PROPERTY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CONCEPT_MAP_PROPERTY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONCEPT_MAP_PROPERTY__SYSTEM:
				return basicSetSystem(null, msgs);
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
			case FhirPackage.CONCEPT_MAP_PROPERTY__CODE:
				return getCode();
			case FhirPackage.CONCEPT_MAP_PROPERTY__URI:
				return getUri();
			case FhirPackage.CONCEPT_MAP_PROPERTY__DESCRIPTION:
				return getDescription();
			case FhirPackage.CONCEPT_MAP_PROPERTY__TYPE:
				return getType();
			case FhirPackage.CONCEPT_MAP_PROPERTY__SYSTEM:
				return getSystem();
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
			case FhirPackage.CONCEPT_MAP_PROPERTY__CODE:
				setCode((Code)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_PROPERTY__URI:
				setUri((Uri)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_PROPERTY__DESCRIPTION:
				setDescription((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_PROPERTY__TYPE:
				setType((ConceptMapPropertyType)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_PROPERTY__SYSTEM:
				setSystem((Canonical)newValue);
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
			case FhirPackage.CONCEPT_MAP_PROPERTY__CODE:
				setCode((Code)null);
				return;
			case FhirPackage.CONCEPT_MAP_PROPERTY__URI:
				setUri((Uri)null);
				return;
			case FhirPackage.CONCEPT_MAP_PROPERTY__DESCRIPTION:
				setDescription((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP_PROPERTY__TYPE:
				setType((ConceptMapPropertyType)null);
				return;
			case FhirPackage.CONCEPT_MAP_PROPERTY__SYSTEM:
				setSystem((Canonical)null);
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
			case FhirPackage.CONCEPT_MAP_PROPERTY__CODE:
				return code != null;
			case FhirPackage.CONCEPT_MAP_PROPERTY__URI:
				return uri != null;
			case FhirPackage.CONCEPT_MAP_PROPERTY__DESCRIPTION:
				return description != null;
			case FhirPackage.CONCEPT_MAP_PROPERTY__TYPE:
				return type != null;
			case FhirPackage.CONCEPT_MAP_PROPERTY__SYSTEM:
				return system != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapPropertyImpl
