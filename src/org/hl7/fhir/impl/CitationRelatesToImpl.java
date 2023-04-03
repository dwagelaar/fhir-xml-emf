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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CitationRelatesTo;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifactTypeExpanded;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Relates To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getResourceReference <em>Resource Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationRelatesToImpl extends BackboneElementImpl implements CitationRelatesTo {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelatedArtifactTypeExpanded type;

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
	protected org.hl7.fhir.String label;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String display;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationRelatesToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationRelatesTo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeExpanded getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(RelatedArtifactTypeExpanded newType, NotificationChain msgs) {
		RelatedArtifactTypeExpanded oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelatedArtifactTypeExpanded newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CITATION_RELATES_TO__CLASSIFIER);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.hl7.fhir.String newLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.hl7.fhir.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.fhir.String newDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.hl7.fhir.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__CITATION, oldCitation, newCitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitation(Markdown newCitation) {
		if (newCitation != citation) {
			NotificationChain msgs = null;
			if (citation != null)
				msgs = ((InternalEObject)citation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__CITATION, null, msgs);
			if (newCitation != null)
				msgs = ((InternalEObject)newCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__CITATION, null, msgs);
			msgs = basicSetCitation(newCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__CITATION, newCitation, newCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Attachment newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__DOCUMENT, null, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__DOCUMENT, null, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Canonical newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__RESOURCE_REFERENCE, oldResourceReference, newResourceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceReference(Reference newResourceReference) {
		if (newResourceReference != resourceReference) {
			NotificationChain msgs = null;
			if (resourceReference != null)
				msgs = ((InternalEObject)resourceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__RESOURCE_REFERENCE, null, msgs);
			if (newResourceReference != null)
				msgs = ((InternalEObject)newResourceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__RESOURCE_REFERENCE, null, msgs);
			msgs = basicSetResourceReference(newResourceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__RESOURCE_REFERENCE, newResourceReference, newResourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_RELATES_TO__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_RELATES_TO__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__DISPLAY:
				return basicSetDisplay(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__CITATION:
				return basicSetCitation(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__DOCUMENT:
				return basicSetDocument(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__RESOURCE_REFERENCE:
				return basicSetResourceReference(null, msgs);
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
			case FhirPackage.CITATION_RELATES_TO__TYPE:
				return getType();
			case FhirPackage.CITATION_RELATES_TO__CLASSIFIER:
				return getClassifier();
			case FhirPackage.CITATION_RELATES_TO__LABEL:
				return getLabel();
			case FhirPackage.CITATION_RELATES_TO__DISPLAY:
				return getDisplay();
			case FhirPackage.CITATION_RELATES_TO__CITATION:
				return getCitation();
			case FhirPackage.CITATION_RELATES_TO__DOCUMENT:
				return getDocument();
			case FhirPackage.CITATION_RELATES_TO__RESOURCE:
				return getResource();
			case FhirPackage.CITATION_RELATES_TO__RESOURCE_REFERENCE:
				return getResourceReference();
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
			case FhirPackage.CITATION_RELATES_TO__TYPE:
				setType((RelatedArtifactTypeExpanded)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__LABEL:
				setLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__DISPLAY:
				setDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__CITATION:
				setCitation((Markdown)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__DOCUMENT:
				setDocument((Attachment)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__RESOURCE:
				setResource((Canonical)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__RESOURCE_REFERENCE:
				setResourceReference((Reference)newValue);
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
			case FhirPackage.CITATION_RELATES_TO__TYPE:
				setType((RelatedArtifactTypeExpanded)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__CLASSIFIER:
				getClassifier().clear();
				return;
			case FhirPackage.CITATION_RELATES_TO__LABEL:
				setLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__DISPLAY:
				setDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__CITATION:
				setCitation((Markdown)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__DOCUMENT:
				setDocument((Attachment)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__RESOURCE:
				setResource((Canonical)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__RESOURCE_REFERENCE:
				setResourceReference((Reference)null);
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
			case FhirPackage.CITATION_RELATES_TO__TYPE:
				return type != null;
			case FhirPackage.CITATION_RELATES_TO__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
			case FhirPackage.CITATION_RELATES_TO__LABEL:
				return label != null;
			case FhirPackage.CITATION_RELATES_TO__DISPLAY:
				return display != null;
			case FhirPackage.CITATION_RELATES_TO__CITATION:
				return citation != null;
			case FhirPackage.CITATION_RELATES_TO__DOCUMENT:
				return document != null;
			case FhirPackage.CITATION_RELATES_TO__RESOURCE:
				return resource != null;
			case FhirPackage.CITATION_RELATES_TO__RESOURCE_REFERENCE:
				return resourceReference != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationRelatesToImpl
