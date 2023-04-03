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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DeviceDefinitionGuideline;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Guideline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionGuidelineImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionGuidelineImpl#getUsageInstruction <em>Usage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionGuidelineImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionGuidelineImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionGuidelineImpl#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionGuidelineImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionGuidelineImpl#getIntendedUse <em>Intended Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionGuidelineImpl extends BackboneElementImpl implements DeviceDefinitionGuideline {
	/**
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContext;

	/**
	 * The cached value of the '{@link #getUsageInstruction() <em>Usage Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageInstruction()
	 * @generated
	 * @ordered
	 */
	protected Markdown usageInstruction;

	/**
	 * The cached value of the '{@link #getRelatedArtifact() <em>Related Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifact;

	/**
	 * The cached value of the '{@link #getIndication() <em>Indication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> indication;

	/**
	 * The cached value of the '{@link #getContraindication() <em>Contraindication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraindication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> contraindication;

	/**
	 * The cached value of the '{@link #getWarning() <em>Warning</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarning()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> warning;

	/**
	 * The cached value of the '{@link #getIntendedUse() <em>Intended Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUse()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String intendedUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionGuidelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinitionGuideline();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.DEVICE_DEFINITION_GUIDELINE__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getUsageInstruction() {
		return usageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageInstruction(Markdown newUsageInstruction, NotificationChain msgs) {
		Markdown oldUsageInstruction = usageInstruction;
		usageInstruction = newUsageInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_GUIDELINE__USAGE_INSTRUCTION, oldUsageInstruction, newUsageInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageInstruction(Markdown newUsageInstruction) {
		if (newUsageInstruction != usageInstruction) {
			NotificationChain msgs = null;
			if (usageInstruction != null)
				msgs = ((InternalEObject)usageInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_GUIDELINE__USAGE_INSTRUCTION, null, msgs);
			if (newUsageInstruction != null)
				msgs = ((InternalEObject)newUsageInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_GUIDELINE__USAGE_INSTRUCTION, null, msgs);
			msgs = basicSetUsageInstruction(newUsageInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_GUIDELINE__USAGE_INSTRUCTION, newUsageInstruction, newUsageInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedArtifact> getRelatedArtifact() {
		if (relatedArtifact == null) {
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.DEVICE_DEFINITION_GUIDELINE__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getIndication() {
		if (indication == null) {
			indication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_DEFINITION_GUIDELINE__INDICATION);
		}
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getContraindication() {
		if (contraindication == null) {
			contraindication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_DEFINITION_GUIDELINE__CONTRAINDICATION);
		}
		return contraindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getWarning() {
		if (warning == null) {
			warning = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_DEFINITION_GUIDELINE__WARNING);
		}
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getIntendedUse() {
		return intendedUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntendedUse(org.hl7.fhir.String newIntendedUse, NotificationChain msgs) {
		org.hl7.fhir.String oldIntendedUse = intendedUse;
		intendedUse = newIntendedUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_GUIDELINE__INTENDED_USE, oldIntendedUse, newIntendedUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntendedUse(org.hl7.fhir.String newIntendedUse) {
		if (newIntendedUse != intendedUse) {
			NotificationChain msgs = null;
			if (intendedUse != null)
				msgs = ((InternalEObject)intendedUse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_GUIDELINE__INTENDED_USE, null, msgs);
			if (newIntendedUse != null)
				msgs = ((InternalEObject)newIntendedUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_GUIDELINE__INTENDED_USE, null, msgs);
			msgs = basicSetIntendedUse(newIntendedUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_GUIDELINE__INTENDED_USE, newIntendedUse, newIntendedUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USAGE_INSTRUCTION:
				return basicSetUsageInstruction(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INDICATION:
				return ((InternalEList<?>)getIndication()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__CONTRAINDICATION:
				return ((InternalEList<?>)getContraindication()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__WARNING:
				return ((InternalEList<?>)getWarning()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INTENDED_USE:
				return basicSetIntendedUse(null, msgs);
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
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USAGE_INSTRUCTION:
				return getUsageInstruction();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INDICATION:
				return getIndication();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__CONTRAINDICATION:
				return getContraindication();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__WARNING:
				return getWarning();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INTENDED_USE:
				return getIntendedUse();
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
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USAGE_INSTRUCTION:
				setUsageInstruction((Markdown)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INDICATION:
				getIndication().clear();
				getIndication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__CONTRAINDICATION:
				getContraindication().clear();
				getContraindication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__WARNING:
				getWarning().clear();
				getWarning().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INTENDED_USE:
				setIntendedUse((org.hl7.fhir.String)newValue);
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
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USAGE_INSTRUCTION:
				setUsageInstruction((Markdown)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INDICATION:
				getIndication().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__CONTRAINDICATION:
				getContraindication().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__WARNING:
				getWarning().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INTENDED_USE:
				setIntendedUse((org.hl7.fhir.String)null);
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
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__USAGE_INSTRUCTION:
				return usageInstruction != null;
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INDICATION:
				return indication != null && !indication.isEmpty();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__CONTRAINDICATION:
				return contraindication != null && !contraindication.isEmpty();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__WARNING:
				return warning != null && !warning.isEmpty();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE__INTENDED_USE:
				return intendedUse != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionGuidelineImpl
