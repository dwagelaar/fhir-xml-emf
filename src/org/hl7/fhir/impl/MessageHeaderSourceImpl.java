/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Header Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderSourceImpl#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderSourceImpl#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderSourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderSourceImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderSourceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderSourceImpl#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageHeaderSourceImpl extends BackboneElementImpl implements MessageHeaderSource {
	/**
	 * The cached value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected Url endpointUrl;

	/**
	 * The cached value of the '{@link #getEndpointReference() <em>Endpoint Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointReference()
	 * @generated
	 * @ordered
	 */
	protected Reference endpointReference;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String software;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint contact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageHeaderSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMessageHeaderSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getEndpointUrl() {
		return endpointUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointUrl(Url newEndpointUrl, NotificationChain msgs) {
		Url oldEndpointUrl = endpointUrl;
		endpointUrl = newEndpointUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_URL, oldEndpointUrl, newEndpointUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointUrl(Url newEndpointUrl) {
		if (newEndpointUrl != endpointUrl) {
			NotificationChain msgs = null;
			if (endpointUrl != null)
				msgs = ((InternalEObject)endpointUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_URL, null, msgs);
			if (newEndpointUrl != null)
				msgs = ((InternalEObject)newEndpointUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_URL, null, msgs);
			msgs = basicSetEndpointUrl(newEndpointUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_URL, newEndpointUrl, newEndpointUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEndpointReference() {
		return endpointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointReference(Reference newEndpointReference, NotificationChain msgs) {
		Reference oldEndpointReference = endpointReference;
		endpointReference = newEndpointReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_REFERENCE, oldEndpointReference, newEndpointReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointReference(Reference newEndpointReference) {
		if (newEndpointReference != endpointReference) {
			NotificationChain msgs = null;
			if (endpointReference != null)
				msgs = ((InternalEObject)endpointReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_REFERENCE, null, msgs);
			if (newEndpointReference != null)
				msgs = ((InternalEObject)newEndpointReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_REFERENCE, null, msgs);
			msgs = basicSetEndpointReference(newEndpointReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_REFERENCE, newEndpointReference, newEndpointReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(org.hl7.fhir.String newSoftware, NotificationChain msgs) {
		org.hl7.fhir.String oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__SOFTWARE, oldSoftware, newSoftware);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(org.hl7.fhir.String newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject)software).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__SOFTWARE, null, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject)newSoftware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__SOFTWARE, null, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__SOFTWARE, newSoftware, newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContact(ContactPoint newContact, NotificationChain msgs) {
		ContactPoint oldContact = contact;
		contact = newContact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__CONTACT, oldContact, newContact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact(ContactPoint newContact) {
		if (newContact != contact) {
			NotificationChain msgs = null;
			if (contact != null)
				msgs = ((InternalEObject)contact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__CONTACT, null, msgs);
			if (newContact != null)
				msgs = ((InternalEObject)newContact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_SOURCE__CONTACT, null, msgs);
			msgs = basicSetContact(newContact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_SOURCE__CONTACT, newContact, newContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_URL:
				return basicSetEndpointUrl(null, msgs);
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_REFERENCE:
				return basicSetEndpointReference(null, msgs);
			case FhirPackage.MESSAGE_HEADER_SOURCE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.MESSAGE_HEADER_SOURCE__SOFTWARE:
				return basicSetSoftware(null, msgs);
			case FhirPackage.MESSAGE_HEADER_SOURCE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.MESSAGE_HEADER_SOURCE__CONTACT:
				return basicSetContact(null, msgs);
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
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_URL:
				return getEndpointUrl();
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_REFERENCE:
				return getEndpointReference();
			case FhirPackage.MESSAGE_HEADER_SOURCE__NAME:
				return getName();
			case FhirPackage.MESSAGE_HEADER_SOURCE__SOFTWARE:
				return getSoftware();
			case FhirPackage.MESSAGE_HEADER_SOURCE__VERSION:
				return getVersion();
			case FhirPackage.MESSAGE_HEADER_SOURCE__CONTACT:
				return getContact();
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
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_URL:
				setEndpointUrl((Url)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_REFERENCE:
				setEndpointReference((Reference)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__SOFTWARE:
				setSoftware((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__CONTACT:
				setContact((ContactPoint)newValue);
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
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_URL:
				setEndpointUrl((Url)null);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_REFERENCE:
				setEndpointReference((Reference)null);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__SOFTWARE:
				setSoftware((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MESSAGE_HEADER_SOURCE__CONTACT:
				setContact((ContactPoint)null);
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
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_URL:
				return endpointUrl != null;
			case FhirPackage.MESSAGE_HEADER_SOURCE__ENDPOINT_REFERENCE:
				return endpointReference != null;
			case FhirPackage.MESSAGE_HEADER_SOURCE__NAME:
				return name != null;
			case FhirPackage.MESSAGE_HEADER_SOURCE__SOFTWARE:
				return software != null;
			case FhirPackage.MESSAGE_HEADER_SOURCE__VERSION:
				return version != null;
			case FhirPackage.MESSAGE_HEADER_SOURCE__CONTACT:
				return contact != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageHeaderSourceImpl
