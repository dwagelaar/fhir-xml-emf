/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GenomicStudyInput;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genomic Study Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyInputImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyInputImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyInputImpl#getGeneratedByIdentifier <em>Generated By Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyInputImpl#getGeneratedByReference <em>Generated By Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenomicStudyInputImpl extends BackboneElementImpl implements GenomicStudyInput {
	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected Reference file;

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
	 * The cached value of the '{@link #getGeneratedByIdentifier() <em>Generated By Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedByIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier generatedByIdentifier;

	/**
	 * The cached value of the '{@link #getGeneratedByReference() <em>Generated By Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedByReference()
	 * @generated
	 * @ordered
	 */
	protected Reference generatedByReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenomicStudyInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGenomicStudyInput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(Reference newFile, NotificationChain msgs) {
		Reference oldFile = file;
		file = newFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_INPUT__FILE, oldFile, newFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(Reference newFile) {
		if (newFile != file) {
			NotificationChain msgs = null;
			if (file != null)
				msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_INPUT__FILE, null, msgs);
			if (newFile != null)
				msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_INPUT__FILE, null, msgs);
			msgs = basicSetFile(newFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_INPUT__FILE, newFile, newFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_INPUT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_INPUT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_INPUT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_INPUT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getGeneratedByIdentifier() {
		return generatedByIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedByIdentifier(Identifier newGeneratedByIdentifier, NotificationChain msgs) {
		Identifier oldGeneratedByIdentifier = generatedByIdentifier;
		generatedByIdentifier = newGeneratedByIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_IDENTIFIER, oldGeneratedByIdentifier, newGeneratedByIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedByIdentifier(Identifier newGeneratedByIdentifier) {
		if (newGeneratedByIdentifier != generatedByIdentifier) {
			NotificationChain msgs = null;
			if (generatedByIdentifier != null)
				msgs = ((InternalEObject)generatedByIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_IDENTIFIER, null, msgs);
			if (newGeneratedByIdentifier != null)
				msgs = ((InternalEObject)newGeneratedByIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_IDENTIFIER, null, msgs);
			msgs = basicSetGeneratedByIdentifier(newGeneratedByIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_IDENTIFIER, newGeneratedByIdentifier, newGeneratedByIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getGeneratedByReference() {
		return generatedByReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedByReference(Reference newGeneratedByReference, NotificationChain msgs) {
		Reference oldGeneratedByReference = generatedByReference;
		generatedByReference = newGeneratedByReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_REFERENCE, oldGeneratedByReference, newGeneratedByReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedByReference(Reference newGeneratedByReference) {
		if (newGeneratedByReference != generatedByReference) {
			NotificationChain msgs = null;
			if (generatedByReference != null)
				msgs = ((InternalEObject)generatedByReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_REFERENCE, null, msgs);
			if (newGeneratedByReference != null)
				msgs = ((InternalEObject)newGeneratedByReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_REFERENCE, null, msgs);
			msgs = basicSetGeneratedByReference(newGeneratedByReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_REFERENCE, newGeneratedByReference, newGeneratedByReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GENOMIC_STUDY_INPUT__FILE:
				return basicSetFile(null, msgs);
			case FhirPackage.GENOMIC_STUDY_INPUT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_IDENTIFIER:
				return basicSetGeneratedByIdentifier(null, msgs);
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_REFERENCE:
				return basicSetGeneratedByReference(null, msgs);
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
			case FhirPackage.GENOMIC_STUDY_INPUT__FILE:
				return getFile();
			case FhirPackage.GENOMIC_STUDY_INPUT__TYPE:
				return getType();
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_IDENTIFIER:
				return getGeneratedByIdentifier();
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_REFERENCE:
				return getGeneratedByReference();
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
			case FhirPackage.GENOMIC_STUDY_INPUT__FILE:
				setFile((Reference)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_INPUT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_IDENTIFIER:
				setGeneratedByIdentifier((Identifier)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_REFERENCE:
				setGeneratedByReference((Reference)newValue);
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
			case FhirPackage.GENOMIC_STUDY_INPUT__FILE:
				setFile((Reference)null);
				return;
			case FhirPackage.GENOMIC_STUDY_INPUT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_IDENTIFIER:
				setGeneratedByIdentifier((Identifier)null);
				return;
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_REFERENCE:
				setGeneratedByReference((Reference)null);
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
			case FhirPackage.GENOMIC_STUDY_INPUT__FILE:
				return file != null;
			case FhirPackage.GENOMIC_STUDY_INPUT__TYPE:
				return type != null;
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_IDENTIFIER:
				return generatedByIdentifier != null;
			case FhirPackage.GENOMIC_STUDY_INPUT__GENERATED_BY_REFERENCE:
				return generatedByReference != null;
		}
		return super.eIsSet(featureID);
	}

} //GenomicStudyInputImpl
