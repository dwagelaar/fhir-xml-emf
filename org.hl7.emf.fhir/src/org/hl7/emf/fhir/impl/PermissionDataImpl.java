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
import org.hl7.emf.fhir.Expression;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Period;
import org.hl7.emf.fhir.PermissionData;
import org.hl7.emf.fhir.PermissionResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.PermissionDataImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PermissionDataImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PermissionDataImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.PermissionDataImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionDataImpl extends BackboneElementImpl implements PermissionData {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<PermissionResource> resource;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> security;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> period;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPermissionData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PermissionResource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<PermissionResource>(PermissionResource.class, this, FhirPackage.PERMISSION_DATA__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.PERMISSION_DATA__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Period> getPeriod() {
		if (period == null) {
			period = new EObjectContainmentEList<Period>(Period.class, this, FhirPackage.PERMISSION_DATA__PERIOD);
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION_DATA__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION_DATA__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERMISSION_DATA__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PERMISSION_DATA__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PERMISSION_DATA__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case FhirPackage.PERMISSION_DATA__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
			case FhirPackage.PERMISSION_DATA__PERIOD:
				return ((InternalEList<?>)getPeriod()).basicRemove(otherEnd, msgs);
			case FhirPackage.PERMISSION_DATA__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case FhirPackage.PERMISSION_DATA__RESOURCE:
				return getResource();
			case FhirPackage.PERMISSION_DATA__SECURITY:
				return getSecurity();
			case FhirPackage.PERMISSION_DATA__PERIOD:
				return getPeriod();
			case FhirPackage.PERMISSION_DATA__EXPRESSION:
				return getExpression();
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
			case FhirPackage.PERMISSION_DATA__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends PermissionResource>)newValue);
				return;
			case FhirPackage.PERMISSION_DATA__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.PERMISSION_DATA__PERIOD:
				getPeriod().clear();
				getPeriod().addAll((Collection<? extends Period>)newValue);
				return;
			case FhirPackage.PERMISSION_DATA__EXPRESSION:
				setExpression((Expression)newValue);
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
			case FhirPackage.PERMISSION_DATA__RESOURCE:
				getResource().clear();
				return;
			case FhirPackage.PERMISSION_DATA__SECURITY:
				getSecurity().clear();
				return;
			case FhirPackage.PERMISSION_DATA__PERIOD:
				getPeriod().clear();
				return;
			case FhirPackage.PERMISSION_DATA__EXPRESSION:
				setExpression((Expression)null);
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
			case FhirPackage.PERMISSION_DATA__RESOURCE:
				return resource != null && !resource.isEmpty();
			case FhirPackage.PERMISSION_DATA__SECURITY:
				return security != null && !security.isEmpty();
			case FhirPackage.PERMISSION_DATA__PERIOD:
				return period != null && !period.isEmpty();
			case FhirPackage.PERMISSION_DATA__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //PermissionDataImpl
