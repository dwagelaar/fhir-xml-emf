/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.Attachment;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CommunicationRequestPayload;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Request Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.CommunicationRequestPayloadImpl#getContentAttachment <em>Content Attachment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CommunicationRequestPayloadImpl#getContentReference <em>Content Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CommunicationRequestPayloadImpl#getContentCodeableConcept <em>Content Codeable Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationRequestPayloadImpl extends BackboneElementImpl implements CommunicationRequestPayload {
	/**
	 * The cached value of the '{@link #getContentAttachment() <em>Content Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment contentAttachment;

	/**
	 * The cached value of the '{@link #getContentReference() <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentReference()
	 * @generated
	 * @ordered
	 */
	protected Reference contentReference;

	/**
	 * The cached value of the '{@link #getContentCodeableConcept() <em>Content Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept contentCodeableConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationRequestPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCommunicationRequestPayload();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getContentAttachment() {
		return contentAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentAttachment(Attachment newContentAttachment, NotificationChain msgs) {
		Attachment oldContentAttachment = contentAttachment;
		contentAttachment = newContentAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT, oldContentAttachment, newContentAttachment);
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
	public void setContentAttachment(Attachment newContentAttachment) {
		if (newContentAttachment != contentAttachment) {
			NotificationChain msgs = null;
			if (contentAttachment != null)
				msgs = ((InternalEObject)contentAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT, null, msgs);
			if (newContentAttachment != null)
				msgs = ((InternalEObject)newContentAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT, null, msgs);
			msgs = basicSetContentAttachment(newContentAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT, newContentAttachment, newContentAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getContentReference() {
		return contentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentReference(Reference newContentReference, NotificationChain msgs) {
		Reference oldContentReference = contentReference;
		contentReference = newContentReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE, oldContentReference, newContentReference);
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
	public void setContentReference(Reference newContentReference) {
		if (newContentReference != contentReference) {
			NotificationChain msgs = null;
			if (contentReference != null)
				msgs = ((InternalEObject)contentReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE, null, msgs);
			if (newContentReference != null)
				msgs = ((InternalEObject)newContentReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE, null, msgs);
			msgs = basicSetContentReference(newContentReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE, newContentReference, newContentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getContentCodeableConcept() {
		return contentCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentCodeableConcept(CodeableConcept newContentCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldContentCodeableConcept = contentCodeableConcept;
		contentCodeableConcept = newContentCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_CODEABLE_CONCEPT, oldContentCodeableConcept, newContentCodeableConcept);
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
	public void setContentCodeableConcept(CodeableConcept newContentCodeableConcept) {
		if (newContentCodeableConcept != contentCodeableConcept) {
			NotificationChain msgs = null;
			if (contentCodeableConcept != null)
				msgs = ((InternalEObject)contentCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_CODEABLE_CONCEPT, null, msgs);
			if (newContentCodeableConcept != null)
				msgs = ((InternalEObject)newContentCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetContentCodeableConcept(newContentCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_CODEABLE_CONCEPT, newContentCodeableConcept, newContentCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				return basicSetContentAttachment(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				return basicSetContentReference(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_CODEABLE_CONCEPT:
				return basicSetContentCodeableConcept(null, msgs);
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
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				return getContentAttachment();
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				return getContentReference();
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_CODEABLE_CONCEPT:
				return getContentCodeableConcept();
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
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				setContentAttachment((Attachment)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				setContentReference((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_CODEABLE_CONCEPT:
				setContentCodeableConcept((CodeableConcept)newValue);
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
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				setContentAttachment((Attachment)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				setContentReference((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_CODEABLE_CONCEPT:
				setContentCodeableConcept((CodeableConcept)null);
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
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				return contentAttachment != null;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				return contentReference != null;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_CODEABLE_CONCEPT:
				return contentCodeableConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationRequestPayloadImpl
