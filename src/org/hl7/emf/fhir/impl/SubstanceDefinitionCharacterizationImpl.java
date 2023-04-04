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

import org.hl7.emf.fhir.Attachment;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.SubstanceDefinitionCharacterization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition Characterization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.SubstanceDefinitionCharacterizationImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubstanceDefinitionCharacterizationImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubstanceDefinitionCharacterizationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubstanceDefinitionCharacterizationImpl#getFile <em>File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionCharacterizationImpl extends BackboneElementImpl implements SubstanceDefinitionCharacterization {
	/**
	 * The cached value of the '{@link #getTechnique() <em>Technique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnique()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept technique;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionCharacterizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceDefinitionCharacterization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTechnique() {
		return technique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnique(CodeableConcept newTechnique, NotificationChain msgs) {
		CodeableConcept oldTechnique = technique;
		technique = newTechnique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__TECHNIQUE, oldTechnique, newTechnique);
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
	public void setTechnique(CodeableConcept newTechnique) {
		if (newTechnique != technique) {
			NotificationChain msgs = null;
			if (technique != null)
				msgs = ((InternalEObject)technique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__TECHNIQUE, null, msgs);
			if (newTechnique != null)
				msgs = ((InternalEObject)newTechnique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__TECHNIQUE, null, msgs);
			msgs = basicSetTechnique(newTechnique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__TECHNIQUE, newTechnique, newTechnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(CodeableConcept newForm, NotificationChain msgs) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FORM, oldForm, newForm);
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
	public void setForm(CodeableConcept newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachment> getFile() {
		if (file == null) {
			file = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FILE);
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__TECHNIQUE:
				return basicSetTechnique(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FILE:
				return ((InternalEList<?>)getFile()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__TECHNIQUE:
				return getTechnique();
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FORM:
				return getForm();
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FILE:
				return getFile();
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
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__TECHNIQUE:
				setTechnique((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FILE:
				getFile().clear();
				getFile().addAll((Collection<? extends Attachment>)newValue);
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
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__TECHNIQUE:
				setTechnique((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FORM:
				setForm((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FILE:
				getFile().clear();
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
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__TECHNIQUE:
				return technique != null;
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FORM:
				return form != null;
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__DESCRIPTION:
				return description != null;
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION__FILE:
				return file != null && !file.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionCharacterizationImpl
