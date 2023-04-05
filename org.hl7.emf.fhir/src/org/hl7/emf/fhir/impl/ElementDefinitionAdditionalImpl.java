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

import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.Code;
import org.hl7.emf.fhir.ElementDefinitionAdditional;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Additional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionAdditionalImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionAdditionalImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionAdditionalImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionAdditionalImpl#getShortDoco <em>Short Doco</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionAdditionalImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ElementDefinitionAdditionalImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionAdditionalImpl extends BackboneTypeImpl implements ElementDefinitionAdditional {
	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Code purpose;

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
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Markdown documentation;

	/**
	 * The cached value of the '{@link #getShortDoco() <em>Short Doco</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDoco()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String shortDoco;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> usage;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionAdditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElementDefinitionAdditional();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(Code newPurpose, NotificationChain msgs) {
		Code oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__PURPOSE, oldPurpose, newPurpose);
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
	public void setPurpose(Code newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__VALUE_SET, oldValueSet, newValueSet);
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
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Markdown newDocumentation, NotificationChain msgs) {
		Markdown oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__DOCUMENTATION, oldDocumentation, newDocumentation);
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
	public void setDocumentation(Markdown newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getShortDoco() {
		return shortDoco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortDoco(org.hl7.emf.fhir.String newShortDoco, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldShortDoco = shortDoco;
		shortDoco = newShortDoco;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__SHORT_DOCO, oldShortDoco, newShortDoco);
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
	public void setShortDoco(org.hl7.emf.fhir.String newShortDoco) {
		if (newShortDoco != shortDoco) {
			NotificationChain msgs = null;
			if (shortDoco != null)
				msgs = ((InternalEObject)shortDoco).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__SHORT_DOCO, null, msgs);
			if (newShortDoco != null)
				msgs = ((InternalEObject)newShortDoco).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__SHORT_DOCO, null, msgs);
			msgs = basicSetShortDoco(newShortDoco, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__SHORT_DOCO, newShortDoco, newShortDoco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUsage() {
		if (usage == null) {
			usage = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAny(org.hl7.emf.fhir.Boolean newAny, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldAny = any;
		any = newAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__ANY, oldAny, newAny);
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
	public void setAny(org.hl7.emf.fhir.Boolean newAny) {
		if (newAny != any) {
			NotificationChain msgs = null;
			if (any != null)
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__ANY, null, msgs);
			if (newAny != null)
				msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__ANY, null, msgs);
			msgs = basicSetAny(newAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__ANY, newAny, newAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__SHORT_DOCO:
				return basicSetShortDoco(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__USAGE:
				return ((InternalEList<?>)getUsage()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__ANY:
				return basicSetAny(null, msgs);
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
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__PURPOSE:
				return getPurpose();
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__VALUE_SET:
				return getValueSet();
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__SHORT_DOCO:
				return getShortDoco();
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__USAGE:
				return getUsage();
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__ANY:
				return getAny();
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
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__PURPOSE:
				setPurpose((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__VALUE_SET:
				setValueSet((Canonical)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__DOCUMENTATION:
				setDocumentation((Markdown)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__SHORT_DOCO:
				setShortDoco((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__ANY:
				setAny((org.hl7.emf.fhir.Boolean)newValue);
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
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__PURPOSE:
				setPurpose((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__VALUE_SET:
				setValueSet((Canonical)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__DOCUMENTATION:
				setDocumentation((Markdown)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__SHORT_DOCO:
				setShortDoco((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__USAGE:
				getUsage().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__ANY:
				setAny((org.hl7.emf.fhir.Boolean)null);
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
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__PURPOSE:
				return purpose != null;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__VALUE_SET:
				return valueSet != null;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__DOCUMENTATION:
				return documentation != null;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__SHORT_DOCO:
				return shortDoco != null;
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__USAGE:
				return usage != null && !usage.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL__ANY:
				return any != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionAdditionalImpl
