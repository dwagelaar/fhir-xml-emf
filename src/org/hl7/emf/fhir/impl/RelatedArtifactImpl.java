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
import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.Code;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.Date;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.RelatedArtifact;
import org.hl7.emf.fhir.RelatedArtifactType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getResourceReference <em>Resource Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getPublicationStatus <em>Publication Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.RelatedArtifactImpl#getPublicationDate <em>Publication Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedArtifactImpl extends DataTypeImpl implements RelatedArtifact {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelatedArtifactType type;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classifier;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String label;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String display;

	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected Markdown citation;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Attachment document;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Canonical resource;

	/**
	 * The cached value of the '{@link #getResourceReference() <em>Resource Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference resourceReference;

	/**
	 * The cached value of the '{@link #getPublicationStatus() <em>Publication Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationStatus()
	 * @generated
	 * @ordered
	 */
	protected Code publicationStatus;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected Date publicationDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRelatedArtifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedArtifactType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(RelatedArtifactType newType, NotificationChain msgs) {
		RelatedArtifactType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__TYPE, oldType, newType);
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
	public void setType(RelatedArtifactType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RELATED_ARTIFACT__CLASSIFIER);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.hl7.emf.fhir.String newLabel, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__LABEL, oldLabel, newLabel);
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
	public void setLabel(org.hl7.emf.fhir.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.emf.fhir.String newDisplay, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__DISPLAY, oldDisplay, newDisplay);
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
	public void setDisplay(org.hl7.emf.fhir.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(Markdown newCitation, NotificationChain msgs) {
		Markdown oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__CITATION, oldCitation, newCitation);
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
	public void setCitation(Markdown newCitation) {
		if (newCitation != citation) {
			NotificationChain msgs = null;
			if (citation != null)
				msgs = ((InternalEObject)citation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__CITATION, null, msgs);
			if (newCitation != null)
				msgs = ((InternalEObject)newCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__CITATION, null, msgs);
			msgs = basicSetCitation(newCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__CITATION, newCitation, newCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Attachment newDocument, NotificationChain msgs) {
		Attachment oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__DOCUMENT, oldDocument, newDocument);
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
	public void setDocument(Attachment newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__DOCUMENT, null, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__DOCUMENT, null, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Canonical newResource, NotificationChain msgs) {
		Canonical oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__RESOURCE, oldResource, newResource);
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
	public void setResource(Canonical newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getResourceReference() {
		return resourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceReference(Reference newResourceReference, NotificationChain msgs) {
		Reference oldResourceReference = resourceReference;
		resourceReference = newResourceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__RESOURCE_REFERENCE, oldResourceReference, newResourceReference);
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
	public void setResourceReference(Reference newResourceReference) {
		if (newResourceReference != resourceReference) {
			NotificationChain msgs = null;
			if (resourceReference != null)
				msgs = ((InternalEObject)resourceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__RESOURCE_REFERENCE, null, msgs);
			if (newResourceReference != null)
				msgs = ((InternalEObject)newResourceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__RESOURCE_REFERENCE, null, msgs);
			msgs = basicSetResourceReference(newResourceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__RESOURCE_REFERENCE, newResourceReference, newResourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getPublicationStatus() {
		return publicationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationStatus(Code newPublicationStatus, NotificationChain msgs) {
		Code oldPublicationStatus = publicationStatus;
		publicationStatus = newPublicationStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__PUBLICATION_STATUS, oldPublicationStatus, newPublicationStatus);
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
	public void setPublicationStatus(Code newPublicationStatus) {
		if (newPublicationStatus != publicationStatus) {
			NotificationChain msgs = null;
			if (publicationStatus != null)
				msgs = ((InternalEObject)publicationStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__PUBLICATION_STATUS, null, msgs);
			if (newPublicationStatus != null)
				msgs = ((InternalEObject)newPublicationStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__PUBLICATION_STATUS, null, msgs);
			msgs = basicSetPublicationStatus(newPublicationStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__PUBLICATION_STATUS, newPublicationStatus, newPublicationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationDate(Date newPublicationDate, NotificationChain msgs) {
		Date oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__PUBLICATION_DATE, oldPublicationDate, newPublicationDate);
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
	public void setPublicationDate(Date newPublicationDate) {
		if (newPublicationDate != publicationDate) {
			NotificationChain msgs = null;
			if (publicationDate != null)
				msgs = ((InternalEObject)publicationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__PUBLICATION_DATE, null, msgs);
			if (newPublicationDate != null)
				msgs = ((InternalEObject)newPublicationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RELATED_ARTIFACT__PUBLICATION_DATE, null, msgs);
			msgs = basicSetPublicationDate(newPublicationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RELATED_ARTIFACT__PUBLICATION_DATE, newPublicationDate, newPublicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RELATED_ARTIFACT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.RELATED_ARTIFACT__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.RELATED_ARTIFACT__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.RELATED_ARTIFACT__DISPLAY:
				return basicSetDisplay(null, msgs);
			case FhirPackage.RELATED_ARTIFACT__CITATION:
				return basicSetCitation(null, msgs);
			case FhirPackage.RELATED_ARTIFACT__DOCUMENT:
				return basicSetDocument(null, msgs);
			case FhirPackage.RELATED_ARTIFACT__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.RELATED_ARTIFACT__RESOURCE_REFERENCE:
				return basicSetResourceReference(null, msgs);
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_STATUS:
				return basicSetPublicationStatus(null, msgs);
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_DATE:
				return basicSetPublicationDate(null, msgs);
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
			case FhirPackage.RELATED_ARTIFACT__TYPE:
				return getType();
			case FhirPackage.RELATED_ARTIFACT__CLASSIFIER:
				return getClassifier();
			case FhirPackage.RELATED_ARTIFACT__LABEL:
				return getLabel();
			case FhirPackage.RELATED_ARTIFACT__DISPLAY:
				return getDisplay();
			case FhirPackage.RELATED_ARTIFACT__CITATION:
				return getCitation();
			case FhirPackage.RELATED_ARTIFACT__DOCUMENT:
				return getDocument();
			case FhirPackage.RELATED_ARTIFACT__RESOURCE:
				return getResource();
			case FhirPackage.RELATED_ARTIFACT__RESOURCE_REFERENCE:
				return getResourceReference();
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_STATUS:
				return getPublicationStatus();
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_DATE:
				return getPublicationDate();
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
			case FhirPackage.RELATED_ARTIFACT__TYPE:
				setType((RelatedArtifactType)newValue);
				return;
			case FhirPackage.RELATED_ARTIFACT__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RELATED_ARTIFACT__LABEL:
				setLabel((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.RELATED_ARTIFACT__DISPLAY:
				setDisplay((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.RELATED_ARTIFACT__CITATION:
				setCitation((Markdown)newValue);
				return;
			case FhirPackage.RELATED_ARTIFACT__DOCUMENT:
				setDocument((Attachment)newValue);
				return;
			case FhirPackage.RELATED_ARTIFACT__RESOURCE:
				setResource((Canonical)newValue);
				return;
			case FhirPackage.RELATED_ARTIFACT__RESOURCE_REFERENCE:
				setResourceReference((Reference)newValue);
				return;
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_STATUS:
				setPublicationStatus((Code)newValue);
				return;
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_DATE:
				setPublicationDate((Date)newValue);
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
			case FhirPackage.RELATED_ARTIFACT__TYPE:
				setType((RelatedArtifactType)null);
				return;
			case FhirPackage.RELATED_ARTIFACT__CLASSIFIER:
				getClassifier().clear();
				return;
			case FhirPackage.RELATED_ARTIFACT__LABEL:
				setLabel((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.RELATED_ARTIFACT__DISPLAY:
				setDisplay((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.RELATED_ARTIFACT__CITATION:
				setCitation((Markdown)null);
				return;
			case FhirPackage.RELATED_ARTIFACT__DOCUMENT:
				setDocument((Attachment)null);
				return;
			case FhirPackage.RELATED_ARTIFACT__RESOURCE:
				setResource((Canonical)null);
				return;
			case FhirPackage.RELATED_ARTIFACT__RESOURCE_REFERENCE:
				setResourceReference((Reference)null);
				return;
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_STATUS:
				setPublicationStatus((Code)null);
				return;
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_DATE:
				setPublicationDate((Date)null);
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
			case FhirPackage.RELATED_ARTIFACT__TYPE:
				return type != null;
			case FhirPackage.RELATED_ARTIFACT__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
			case FhirPackage.RELATED_ARTIFACT__LABEL:
				return label != null;
			case FhirPackage.RELATED_ARTIFACT__DISPLAY:
				return display != null;
			case FhirPackage.RELATED_ARTIFACT__CITATION:
				return citation != null;
			case FhirPackage.RELATED_ARTIFACT__DOCUMENT:
				return document != null;
			case FhirPackage.RELATED_ARTIFACT__RESOURCE:
				return resource != null;
			case FhirPackage.RELATED_ARTIFACT__RESOURCE_REFERENCE:
				return resourceReference != null;
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_STATUS:
				return publicationStatus != null;
			case FhirPackage.RELATED_ARTIFACT__PUBLICATION_DATE:
				return publicationDate != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatedArtifactImpl
