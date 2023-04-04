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

import org.hl7.emf.fhir.AuditEventAgent;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getWho <em>Who</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getNetworkReference <em>Network Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getNetworkUri <em>Network Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getNetworkString <em>Network String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventAgentImpl#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventAgentImpl extends BackboneElementImpl implements AuditEventAgent {
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
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> role;

	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Reference who;

	/**
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean requestor;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> policy;

	/**
	 * The cached value of the '{@link #getNetworkReference() <em>Network Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkReference()
	 * @generated
	 * @ordered
	 */
	protected Reference networkReference;

	/**
	 * The cached value of the '{@link #getNetworkUri() <em>Network Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkUri()
	 * @generated
	 * @ordered
	 */
	protected Uri networkUri;

	/**
	 * The cached value of the '{@link #getNetworkString() <em>Network String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String networkString;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> authorization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAuditEventAgent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.AUDIT_EVENT_AGENT__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWho(Reference newWho, NotificationChain msgs) {
		Reference oldWho = who;
		who = newWho;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__WHO, oldWho, newWho);
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
	public void setWho(Reference newWho) {
		if (newWho != who) {
			NotificationChain msgs = null;
			if (who != null)
				msgs = ((InternalEObject)who).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__WHO, null, msgs);
			if (newWho != null)
				msgs = ((InternalEObject)newWho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__WHO, null, msgs);
			msgs = basicSetWho(newWho, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__WHO, newWho, newWho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getRequestor() {
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestor(org.hl7.emf.fhir.Boolean newRequestor, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldRequestor = requestor;
		requestor = newRequestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__REQUESTOR, oldRequestor, newRequestor);
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
	public void setRequestor(org.hl7.emf.fhir.Boolean newRequestor) {
		if (newRequestor != requestor) {
			NotificationChain msgs = null;
			if (requestor != null)
				msgs = ((InternalEObject)requestor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__REQUESTOR, null, msgs);
			if (newRequestor != null)
				msgs = ((InternalEObject)newRequestor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__REQUESTOR, null, msgs);
			msgs = basicSetRequestor(newRequestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__REQUESTOR, newRequestor, newRequestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getPolicy() {
		if (policy == null) {
			policy = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.AUDIT_EVENT_AGENT__POLICY);
		}
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getNetworkReference() {
		return networkReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkReference(Reference newNetworkReference, NotificationChain msgs) {
		Reference oldNetworkReference = networkReference;
		networkReference = newNetworkReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__NETWORK_REFERENCE, oldNetworkReference, newNetworkReference);
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
	public void setNetworkReference(Reference newNetworkReference) {
		if (newNetworkReference != networkReference) {
			NotificationChain msgs = null;
			if (networkReference != null)
				msgs = ((InternalEObject)networkReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__NETWORK_REFERENCE, null, msgs);
			if (newNetworkReference != null)
				msgs = ((InternalEObject)newNetworkReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__NETWORK_REFERENCE, null, msgs);
			msgs = basicSetNetworkReference(newNetworkReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__NETWORK_REFERENCE, newNetworkReference, newNetworkReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getNetworkUri() {
		return networkUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkUri(Uri newNetworkUri, NotificationChain msgs) {
		Uri oldNetworkUri = networkUri;
		networkUri = newNetworkUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__NETWORK_URI, oldNetworkUri, newNetworkUri);
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
	public void setNetworkUri(Uri newNetworkUri) {
		if (newNetworkUri != networkUri) {
			NotificationChain msgs = null;
			if (networkUri != null)
				msgs = ((InternalEObject)networkUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__NETWORK_URI, null, msgs);
			if (newNetworkUri != null)
				msgs = ((InternalEObject)newNetworkUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__NETWORK_URI, null, msgs);
			msgs = basicSetNetworkUri(newNetworkUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__NETWORK_URI, newNetworkUri, newNetworkUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getNetworkString() {
		return networkString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkString(org.hl7.emf.fhir.String newNetworkString, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldNetworkString = networkString;
		networkString = newNetworkString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__NETWORK_STRING, oldNetworkString, newNetworkString);
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
	public void setNetworkString(org.hl7.emf.fhir.String newNetworkString) {
		if (newNetworkString != networkString) {
			NotificationChain msgs = null;
			if (networkString != null)
				msgs = ((InternalEObject)networkString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__NETWORK_STRING, null, msgs);
			if (newNetworkString != null)
				msgs = ((InternalEObject)newNetworkString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_AGENT__NETWORK_STRING, null, msgs);
			msgs = basicSetNetworkString(newNetworkString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_AGENT__NETWORK_STRING, newNetworkString, newNetworkString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAuthorization() {
		if (authorization == null) {
			authorization = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.AUDIT_EVENT_AGENT__AUTHORIZATION);
		}
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.AUDIT_EVENT_AGENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.AUDIT_EVENT_AGENT__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT_AGENT__WHO:
				return basicSetWho(null, msgs);
			case FhirPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				return basicSetRequestor(null, msgs);
			case FhirPackage.AUDIT_EVENT_AGENT__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.AUDIT_EVENT_AGENT__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_REFERENCE:
				return basicSetNetworkReference(null, msgs);
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_URI:
				return basicSetNetworkUri(null, msgs);
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_STRING:
				return basicSetNetworkString(null, msgs);
			case FhirPackage.AUDIT_EVENT_AGENT__AUTHORIZATION:
				return ((InternalEList<?>)getAuthorization()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.AUDIT_EVENT_AGENT__TYPE:
				return getType();
			case FhirPackage.AUDIT_EVENT_AGENT__ROLE:
				return getRole();
			case FhirPackage.AUDIT_EVENT_AGENT__WHO:
				return getWho();
			case FhirPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				return getRequestor();
			case FhirPackage.AUDIT_EVENT_AGENT__LOCATION:
				return getLocation();
			case FhirPackage.AUDIT_EVENT_AGENT__POLICY:
				return getPolicy();
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_REFERENCE:
				return getNetworkReference();
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_URI:
				return getNetworkUri();
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_STRING:
				return getNetworkString();
			case FhirPackage.AUDIT_EVENT_AGENT__AUTHORIZATION:
				return getAuthorization();
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
			case FhirPackage.AUDIT_EVENT_AGENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__WHO:
				setWho((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				setRequestor((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_REFERENCE:
				setNetworkReference((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_URI:
				setNetworkUri((Uri)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_STRING:
				setNetworkString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__AUTHORIZATION:
				getAuthorization().clear();
				getAuthorization().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.AUDIT_EVENT_AGENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__ROLE:
				getRole().clear();
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__WHO:
				setWho((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				setRequestor((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__POLICY:
				getPolicy().clear();
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_REFERENCE:
				setNetworkReference((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_URI:
				setNetworkUri((Uri)null);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_STRING:
				setNetworkString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.AUDIT_EVENT_AGENT__AUTHORIZATION:
				getAuthorization().clear();
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
			case FhirPackage.AUDIT_EVENT_AGENT__TYPE:
				return type != null;
			case FhirPackage.AUDIT_EVENT_AGENT__ROLE:
				return role != null && !role.isEmpty();
			case FhirPackage.AUDIT_EVENT_AGENT__WHO:
				return who != null;
			case FhirPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				return requestor != null;
			case FhirPackage.AUDIT_EVENT_AGENT__LOCATION:
				return location != null;
			case FhirPackage.AUDIT_EVENT_AGENT__POLICY:
				return policy != null && !policy.isEmpty();
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_REFERENCE:
				return networkReference != null;
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_URI:
				return networkUri != null;
			case FhirPackage.AUDIT_EVENT_AGENT__NETWORK_STRING:
				return networkString != null;
			case FhirPackage.AUDIT_EVENT_AGENT__AUTHORIZATION:
				return authorization != null && !authorization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventAgentImpl
