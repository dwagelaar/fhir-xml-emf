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
import org.hl7.emf.fhir.AuditEventDetail;
import org.hl7.emf.fhir.AuditEventEntity;
import org.hl7.emf.fhir.Base64Binary;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventEntityImpl#getWhat <em>What</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventEntityImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventEntityImpl#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventEntityImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventEntityImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AuditEventEntityImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventEntityImpl extends BackboneElementImpl implements AuditEventEntity {
	/**
	 * The cached value of the '{@link #getWhat() <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected Reference what;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getSecurityLabel() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> securityLabel;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary query;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventDetail> detail;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventAgent> agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAuditEventEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getWhat() {
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhat(Reference newWhat, NotificationChain msgs) {
		Reference oldWhat = what;
		what = newWhat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__WHAT, oldWhat, newWhat);
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
	public void setWhat(Reference newWhat) {
		if (newWhat != what) {
			NotificationChain msgs = null;
			if (what != null)
				msgs = ((InternalEObject)what).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__WHAT, null, msgs);
			if (newWhat != null)
				msgs = ((InternalEObject)newWhat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__WHAT, null, msgs);
			msgs = basicSetWhat(newWhat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__WHAT, newWhat, newWhat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__ROLE, oldRole, newRole);
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
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSecurityLabel() {
		if (securityLabel == null) {
			securityLabel = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL);
		}
		return securityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Base64Binary newQuery, NotificationChain msgs) {
		Base64Binary oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__QUERY, oldQuery, newQuery);
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
	public void setQuery(Base64Binary newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuditEventDetail> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<AuditEventDetail>(AuditEventDetail.class, this, FhirPackage.AUDIT_EVENT_ENTITY__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuditEventAgent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<AuditEventAgent>(AuditEventAgent.class, this, FhirPackage.AUDIT_EVENT_ENTITY__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				return basicSetWhat(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabel()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				return basicSetQuery(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__AGENT:
				return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				return getWhat();
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				return getRole();
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				return getSecurityLabel();
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				return getQuery();
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				return getDetail();
			case FhirPackage.AUDIT_EVENT_ENTITY__AGENT:
				return getAgent();
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
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				setWhat((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				getSecurityLabel().clear();
				getSecurityLabel().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				setQuery((Base64Binary)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends AuditEventDetail>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__AGENT:
				getAgent().clear();
				getAgent().addAll((Collection<? extends AuditEventAgent>)newValue);
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
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				setWhat((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				getSecurityLabel().clear();
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				setQuery((Base64Binary)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				getDetail().clear();
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__AGENT:
				getAgent().clear();
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
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				return what != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				return role != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				return securityLabel != null && !securityLabel.isEmpty();
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				return query != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				return detail != null && !detail.isEmpty();
			case FhirPackage.AUDIT_EVENT_ENTITY__AGENT:
				return agent != null && !agent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventEntityImpl
