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

import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.ServiceRequestOrderDetail;
import org.hl7.emf.fhir.ServiceRequestParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Request Order Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ServiceRequestOrderDetailImpl#getParameterFocus <em>Parameter Focus</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ServiceRequestOrderDetailImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceRequestOrderDetailImpl extends BackboneElementImpl implements ServiceRequestOrderDetail {
	/**
	 * The cached value of the '{@link #getParameterFocus() <em>Parameter Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterFocus()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference parameterFocus;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRequestParameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRequestOrderDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getServiceRequestOrderDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getParameterFocus() {
		return parameterFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterFocus(CodeableReference newParameterFocus, NotificationChain msgs) {
		CodeableReference oldParameterFocus = parameterFocus;
		parameterFocus = newParameterFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER_FOCUS, oldParameterFocus, newParameterFocus);
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
	public void setParameterFocus(CodeableReference newParameterFocus) {
		if (newParameterFocus != parameterFocus) {
			NotificationChain msgs = null;
			if (parameterFocus != null)
				msgs = ((InternalEObject)parameterFocus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER_FOCUS, null, msgs);
			if (newParameterFocus != null)
				msgs = ((InternalEObject)newParameterFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER_FOCUS, null, msgs);
			msgs = basicSetParameterFocus(newParameterFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER_FOCUS, newParameterFocus, newParameterFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceRequestParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ServiceRequestParameter>(ServiceRequestParameter.class, this, FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER_FOCUS:
				return basicSetParameterFocus(null, msgs);
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER_FOCUS:
				return getParameterFocus();
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER:
				return getParameter();
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
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER_FOCUS:
				setParameterFocus((CodeableReference)newValue);
				return;
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ServiceRequestParameter>)newValue);
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
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER_FOCUS:
				setParameterFocus((CodeableReference)null);
				return;
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER:
				getParameter().clear();
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
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER_FOCUS:
				return parameterFocus != null;
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL__PARAMETER:
				return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceRequestOrderDetailImpl
