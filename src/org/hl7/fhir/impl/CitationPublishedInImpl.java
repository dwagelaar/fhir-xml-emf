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

import org.hl7.fhir.CitationPublishedIn;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Published In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationPublishedInImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublishedInImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublishedInImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublishedInImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublishedInImpl#getPublisherLocation <em>Publisher Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationPublishedInImpl extends BackboneElementImpl implements CitationPublishedIn {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Reference publisher;

	/**
	 * The cached value of the '{@link #getPublisherLocation() <em>Publisher Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherLocation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisherLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationPublishedInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationPublishedIn();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLISHED_IN__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLISHED_IN__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLISHED_IN__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLISHED_IN__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CITATION_PUBLISHED_IN__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLISHED_IN__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLISHED_IN__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLISHED_IN__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLISHED_IN__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(Reference newPublisher, NotificationChain msgs) {
		Reference oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Reference newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublisherLocation() {
		return publisherLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherLocation(org.hl7.fhir.String newPublisherLocation, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisherLocation = publisherLocation;
		publisherLocation = newPublisherLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER_LOCATION, oldPublisherLocation, newPublisherLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherLocation(org.hl7.fhir.String newPublisherLocation) {
		if (newPublisherLocation != publisherLocation) {
			NotificationChain msgs = null;
			if (publisherLocation != null)
				msgs = ((InternalEObject)publisherLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER_LOCATION, null, msgs);
			if (newPublisherLocation != null)
				msgs = ((InternalEObject)newPublisherLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER_LOCATION, null, msgs);
			msgs = basicSetPublisherLocation(newPublisherLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER_LOCATION, newPublisherLocation, newPublisherLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_PUBLISHED_IN__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CITATION_PUBLISHED_IN__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_PUBLISHED_IN__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER_LOCATION:
				return basicSetPublisherLocation(null, msgs);
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
			case FhirPackage.CITATION_PUBLISHED_IN__TYPE:
				return getType();
			case FhirPackage.CITATION_PUBLISHED_IN__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CITATION_PUBLISHED_IN__TITLE:
				return getTitle();
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER:
				return getPublisher();
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER_LOCATION:
				return getPublisherLocation();
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
			case FhirPackage.CITATION_PUBLISHED_IN__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CITATION_PUBLISHED_IN__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CITATION_PUBLISHED_IN__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER:
				setPublisher((Reference)newValue);
				return;
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER_LOCATION:
				setPublisherLocation((org.hl7.fhir.String)newValue);
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
			case FhirPackage.CITATION_PUBLISHED_IN__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CITATION_PUBLISHED_IN__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CITATION_PUBLISHED_IN__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER:
				setPublisher((Reference)null);
				return;
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER_LOCATION:
				setPublisherLocation((org.hl7.fhir.String)null);
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
			case FhirPackage.CITATION_PUBLISHED_IN__TYPE:
				return type != null;
			case FhirPackage.CITATION_PUBLISHED_IN__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CITATION_PUBLISHED_IN__TITLE:
				return title != null;
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER:
				return publisher != null;
			case FhirPackage.CITATION_PUBLISHED_IN__PUBLISHER_LOCATION:
				return publisherLocation != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationPublishedInImpl
