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

import org.hl7.emf.fhir.CompartmentDefinitionResource;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.ResourceType;
import org.hl7.emf.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Definition Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.CompartmentDefinitionResourceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CompartmentDefinitionResourceImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CompartmentDefinitionResourceImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CompartmentDefinitionResourceImpl#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CompartmentDefinitionResourceImpl#getEndParam <em>End Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompartmentDefinitionResourceImpl extends BackboneElementImpl implements CompartmentDefinitionResource {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected ResourceType code;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.emf.fhir.String> param;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String documentation;

	/**
	 * The cached value of the '{@link #getStartParam() <em>Start Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartParam()
	 * @generated
	 * @ordered
	 */
	protected Uri startParam;

	/**
	 * The cached value of the '{@link #getEndParam() <em>End Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndParam()
	 * @generated
	 * @ordered
	 */
	protected Uri endParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentDefinitionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCompartmentDefinitionResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(ResourceType newCode, NotificationChain msgs) {
		ResourceType oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__CODE, oldCode, newCode);
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
	public void setCode(ResourceType newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.emf.fhir.String> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<org.hl7.emf.fhir.String>(org.hl7.emf.fhir.String.class, this, FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(org.hl7.emf.fhir.String newDocumentation, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
	public void setDocumentation(org.hl7.emf.fhir.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getStartParam() {
		return startParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartParam(Uri newStartParam, NotificationChain msgs) {
		Uri oldStartParam = startParam;
		startParam = newStartParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__START_PARAM, oldStartParam, newStartParam);
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
	public void setStartParam(Uri newStartParam) {
		if (newStartParam != startParam) {
			NotificationChain msgs = null;
			if (startParam != null)
				msgs = ((InternalEObject)startParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__START_PARAM, null, msgs);
			if (newStartParam != null)
				msgs = ((InternalEObject)newStartParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__START_PARAM, null, msgs);
			msgs = basicSetStartParam(newStartParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__START_PARAM, newStartParam, newStartParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getEndParam() {
		return endParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndParam(Uri newEndParam, NotificationChain msgs) {
		Uri oldEndParam = endParam;
		endParam = newEndParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__END_PARAM, oldEndParam, newEndParam);
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
	public void setEndParam(Uri newEndParam) {
		if (newEndParam != endParam) {
			NotificationChain msgs = null;
			if (endParam != null)
				msgs = ((InternalEObject)endParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__END_PARAM, null, msgs);
			if (newEndParam != null)
				msgs = ((InternalEObject)newEndParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__END_PARAM, null, msgs);
			msgs = basicSetEndParam(newEndParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__END_PARAM, newEndParam, newEndParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__START_PARAM:
				return basicSetStartParam(null, msgs);
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__END_PARAM:
				return basicSetEndParam(null, msgs);
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
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__CODE:
				return getCode();
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__PARAM:
				return getParam();
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__START_PARAM:
				return getStartParam();
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__END_PARAM:
				return getEndParam();
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
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__CODE:
				setCode((ResourceType)newValue);
				return;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends org.hl7.emf.fhir.String>)newValue);
				return;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__DOCUMENTATION:
				setDocumentation((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__START_PARAM:
				setStartParam((Uri)newValue);
				return;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__END_PARAM:
				setEndParam((Uri)newValue);
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
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__CODE:
				setCode((ResourceType)null);
				return;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__PARAM:
				getParam().clear();
				return;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__DOCUMENTATION:
				setDocumentation((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__START_PARAM:
				setStartParam((Uri)null);
				return;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__END_PARAM:
				setEndParam((Uri)null);
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
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__CODE:
				return code != null;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__PARAM:
				return param != null && !param.isEmpty();
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__DOCUMENTATION:
				return documentation != null;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__START_PARAM:
				return startParam != null;
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE__END_PARAM:
				return endParam != null;
		}
		return super.eIsSet(featureID);
	}

} //CompartmentDefinitionResourceImpl
