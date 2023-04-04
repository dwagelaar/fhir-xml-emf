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
import org.hl7.emf.fhir.DocumentReferenceContent;
import org.hl7.emf.fhir.DocumentReferenceProfile;
import org.hl7.emf.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceContentImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.DocumentReferenceContentImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceContentImpl extends BackboneElementImpl implements DocumentReferenceContent {
	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachment;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceProfile> profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDocumentReferenceContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment(Attachment newAttachment, NotificationChain msgs) {
		Attachment oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, oldAttachment, newAttachment);
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
	public void setAttachment(Attachment newAttachment) {
		if (newAttachment != attachment) {
			NotificationChain msgs = null;
			if (attachment != null)
				msgs = ((InternalEObject)attachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, null, msgs);
			if (newAttachment != null)
				msgs = ((InternalEObject)newAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, null, msgs);
			msgs = basicSetAttachment(newAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, newAttachment, newAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentReferenceProfile> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<DocumentReferenceProfile>(DocumentReferenceProfile.class, this, FhirPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				return basicSetAttachment(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				return getAttachment();
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				return getProfile();
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
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				setAttachment((Attachment)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends DocumentReferenceProfile>)newValue);
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
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				setAttachment((Attachment)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				getProfile().clear();
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
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				return attachment != null;
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT__PROFILE:
				return profile != null && !profile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceContentImpl
