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

import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Permission;
import org.hl7.fhir.PermissionJustification;
import org.hl7.fhir.PermissionRule;
import org.hl7.fhir.PermissionRuleCombining;
import org.hl7.fhir.PermissionStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PermissionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionImpl#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionImpl#getValidity <em>Validity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionImpl#getCombining <em>Combining</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionImpl extends DomainResourceImpl implements Permission {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PermissionStatus status;

	/**
	 * The cached value of the '{@link #getAsserter() <em>Asserter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsserter()
	 * @generated
	 * @ordered
	 */
	protected Reference asserter;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateTime> date;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected Period validity;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected PermissionJustification justification;

	/**
	 * The cached value of the '{@link #getCombining() <em>Combining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombining()
	 * @generated
	 * @ordered
	 */
	protected PermissionRuleCombining combining;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<PermissionRule> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPermission();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PermissionStatus newStatus, NotificationChain msgs) {
		PermissionStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PermissionStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAsserter() {
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsserter(Reference newAsserter, NotificationChain msgs) {
		Reference oldAsserter = asserter;
		asserter = newAsserter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__ASSERTER, oldAsserter, newAsserter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsserter(Reference newAsserter) {
		if (newAsserter != asserter) {
			NotificationChain msgs = null;
			if (asserter != null)
				msgs = ((InternalEObject)asserter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__ASSERTER, null, msgs);
			if (newAsserter != null)
				msgs = ((InternalEObject)newAsserter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__ASSERTER, null, msgs);
			msgs = basicSetAsserter(newAsserter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__ASSERTER, newAsserter, newAsserter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateTime> getDate() {
		if (date == null) {
			date = new EObjectContainmentEList<DateTime>(DateTime.class, this, FhirPackage.PERMISSION__DATE);
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValidity() {
		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidity(Period newValidity, NotificationChain msgs) {
		Period oldValidity = validity;
		validity = newValidity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__VALIDITY, oldValidity, newValidity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidity(Period newValidity) {
		if (newValidity != validity) {
			NotificationChain msgs = null;
			if (validity != null)
				msgs = ((InternalEObject)validity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__VALIDITY, null, msgs);
			if (newValidity != null)
				msgs = ((InternalEObject)newValidity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__VALIDITY, null, msgs);
			msgs = basicSetValidity(newValidity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__VALIDITY, newValidity, newValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionJustification getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJustification(PermissionJustification newJustification, NotificationChain msgs) {
		PermissionJustification oldJustification = justification;
		justification = newJustification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__JUSTIFICATION, oldJustification, newJustification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustification(PermissionJustification newJustification) {
		if (newJustification != justification) {
			NotificationChain msgs = null;
			if (justification != null)
				msgs = ((InternalEObject)justification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__JUSTIFICATION, null, msgs);
			if (newJustification != null)
				msgs = ((InternalEObject)newJustification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__JUSTIFICATION, null, msgs);
			msgs = basicSetJustification(newJustification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__JUSTIFICATION, newJustification, newJustification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionRuleCombining getCombining() {
		return combining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombining(PermissionRuleCombining newCombining, NotificationChain msgs) {
		PermissionRuleCombining oldCombining = combining;
		combining = newCombining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__COMBINING, oldCombining, newCombining);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombining(PermissionRuleCombining newCombining) {
		if (newCombining != combining) {
			NotificationChain msgs = null;
			if (combining != null)
				msgs = ((InternalEObject)combining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__COMBINING, null, msgs);
			if (newCombining != null)
				msgs = ((InternalEObject)newCombining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION__COMBINING, null, msgs);
			msgs = basicSetCombining(newCombining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION__COMBINING, newCombining, newCombining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PermissionRule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<PermissionRule>(PermissionRule.class, this, FhirPackage.PERMISSION__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PERMISSION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PERMISSION__ASSERTER:
				return basicSetAsserter(null, msgs);
			case FhirPackage.PERMISSION__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case FhirPackage.PERMISSION__VALIDITY:
				return basicSetValidity(null, msgs);
			case FhirPackage.PERMISSION__JUSTIFICATION:
				return basicSetJustification(null, msgs);
			case FhirPackage.PERMISSION__COMBINING:
				return basicSetCombining(null, msgs);
			case FhirPackage.PERMISSION__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PERMISSION__STATUS:
				return getStatus();
			case FhirPackage.PERMISSION__ASSERTER:
				return getAsserter();
			case FhirPackage.PERMISSION__DATE:
				return getDate();
			case FhirPackage.PERMISSION__VALIDITY:
				return getValidity();
			case FhirPackage.PERMISSION__JUSTIFICATION:
				return getJustification();
			case FhirPackage.PERMISSION__COMBINING:
				return getCombining();
			case FhirPackage.PERMISSION__RULE:
				return getRule();
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
			case FhirPackage.PERMISSION__STATUS:
				setStatus((PermissionStatus)newValue);
				return;
			case FhirPackage.PERMISSION__ASSERTER:
				setAsserter((Reference)newValue);
				return;
			case FhirPackage.PERMISSION__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateTime>)newValue);
				return;
			case FhirPackage.PERMISSION__VALIDITY:
				setValidity((Period)newValue);
				return;
			case FhirPackage.PERMISSION__JUSTIFICATION:
				setJustification((PermissionJustification)newValue);
				return;
			case FhirPackage.PERMISSION__COMBINING:
				setCombining((PermissionRuleCombining)newValue);
				return;
			case FhirPackage.PERMISSION__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends PermissionRule>)newValue);
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
			case FhirPackage.PERMISSION__STATUS:
				setStatus((PermissionStatus)null);
				return;
			case FhirPackage.PERMISSION__ASSERTER:
				setAsserter((Reference)null);
				return;
			case FhirPackage.PERMISSION__DATE:
				getDate().clear();
				return;
			case FhirPackage.PERMISSION__VALIDITY:
				setValidity((Period)null);
				return;
			case FhirPackage.PERMISSION__JUSTIFICATION:
				setJustification((PermissionJustification)null);
				return;
			case FhirPackage.PERMISSION__COMBINING:
				setCombining((PermissionRuleCombining)null);
				return;
			case FhirPackage.PERMISSION__RULE:
				getRule().clear();
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
			case FhirPackage.PERMISSION__STATUS:
				return status != null;
			case FhirPackage.PERMISSION__ASSERTER:
				return asserter != null;
			case FhirPackage.PERMISSION__DATE:
				return date != null && !date.isEmpty();
			case FhirPackage.PERMISSION__VALIDITY:
				return validity != null;
			case FhirPackage.PERMISSION__JUSTIFICATION:
				return justification != null;
			case FhirPackage.PERMISSION__COMBINING:
				return combining != null;
			case FhirPackage.PERMISSION__RULE:
				return rule != null && !rule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PermissionImpl
