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

import org.hl7.emf.fhir.Annotation;
import org.hl7.emf.fhir.CitationAbstract;
import org.hl7.emf.fhir.CitationCitedArtifact;
import org.hl7.emf.fhir.CitationClassification1;
import org.hl7.emf.fhir.CitationContributorship;
import org.hl7.emf.fhir.CitationPart;
import org.hl7.emf.fhir.CitationPublicationForm;
import org.hl7.emf.fhir.CitationRelatesTo;
import org.hl7.emf.fhir.CitationStatusDate1;
import org.hl7.emf.fhir.CitationTitle;
import org.hl7.emf.fhir.CitationVersion;
import org.hl7.emf.fhir.CitationWebLocation;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Cited Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getRelatedIdentifier <em>Related Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getDateAccessed <em>Date Accessed</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getPublicationForm <em>Publication Form</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getWebLocation <em>Web Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getContributorship <em>Contributorship</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.CitationCitedArtifactImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationCitedArtifactImpl extends BackboneElementImpl implements CitationCitedArtifact {
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
	 * The cached value of the '{@link #getRelatedIdentifier() <em>Related Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> relatedIdentifier;

	/**
	 * The cached value of the '{@link #getDateAccessed() <em>Date Accessed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAccessed()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateAccessed;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected CitationVersion version;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> currentState;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationStatusDate1> statusDate;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationTitle> title;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationAbstract> abstract_;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected CitationPart part;

	/**
	 * The cached value of the '{@link #getRelatesTo() <em>Relates To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationRelatesTo> relatesTo;

	/**
	 * The cached value of the '{@link #getPublicationForm() <em>Publication Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationForm()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationPublicationForm> publicationForm;

	/**
	 * The cached value of the '{@link #getWebLocation() <em>Web Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationWebLocation> webLocation;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationClassification1> classification;

	/**
	 * The cached value of the '{@link #getContributorship() <em>Contributorship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributorship()
	 * @generated
	 * @ordered
	 */
	protected CitationContributorship contributorship;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationCitedArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationCitedArtifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CITATION_CITED_ARTIFACT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getRelatedIdentifier() {
		if (relatedIdentifier == null) {
			relatedIdentifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CITATION_CITED_ARTIFACT__RELATED_IDENTIFIER);
		}
		return relatedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDateAccessed() {
		return dateAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateAccessed(DateTime newDateAccessed, NotificationChain msgs) {
		DateTime oldDateAccessed = dateAccessed;
		dateAccessed = newDateAccessed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CITED_ARTIFACT__DATE_ACCESSED, oldDateAccessed, newDateAccessed);
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
	public void setDateAccessed(DateTime newDateAccessed) {
		if (newDateAccessed != dateAccessed) {
			NotificationChain msgs = null;
			if (dateAccessed != null)
				msgs = ((InternalEObject)dateAccessed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CITED_ARTIFACT__DATE_ACCESSED, null, msgs);
			if (newDateAccessed != null)
				msgs = ((InternalEObject)newDateAccessed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CITED_ARTIFACT__DATE_ACCESSED, null, msgs);
			msgs = basicSetDateAccessed(newDateAccessed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CITED_ARTIFACT__DATE_ACCESSED, newDateAccessed, newDateAccessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationVersion getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(CitationVersion newVersion, NotificationChain msgs) {
		CitationVersion oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CITED_ARTIFACT__VERSION, oldVersion, newVersion);
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
	public void setVersion(CitationVersion newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CITED_ARTIFACT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CITED_ARTIFACT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CITED_ARTIFACT__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCurrentState() {
		if (currentState == null) {
			currentState = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CITATION_CITED_ARTIFACT__CURRENT_STATE);
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationStatusDate1> getStatusDate() {
		if (statusDate == null) {
			statusDate = new EObjectContainmentEList<CitationStatusDate1>(CitationStatusDate1.class, this, FhirPackage.CITATION_CITED_ARTIFACT__STATUS_DATE);
		}
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationTitle> getTitle() {
		if (title == null) {
			title = new EObjectContainmentEList<CitationTitle>(CitationTitle.class, this, FhirPackage.CITATION_CITED_ARTIFACT__TITLE);
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationAbstract> getAbstract() {
		if (abstract_ == null) {
			abstract_ = new EObjectContainmentEList<CitationAbstract>(CitationAbstract.class, this, FhirPackage.CITATION_CITED_ARTIFACT__ABSTRACT);
		}
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationPart getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPart(CitationPart newPart, NotificationChain msgs) {
		CitationPart oldPart = part;
		part = newPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CITED_ARTIFACT__PART, oldPart, newPart);
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
	public void setPart(CitationPart newPart) {
		if (newPart != part) {
			NotificationChain msgs = null;
			if (part != null)
				msgs = ((InternalEObject)part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CITED_ARTIFACT__PART, null, msgs);
			if (newPart != null)
				msgs = ((InternalEObject)newPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CITED_ARTIFACT__PART, null, msgs);
			msgs = basicSetPart(newPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CITED_ARTIFACT__PART, newPart, newPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationRelatesTo> getRelatesTo() {
		if (relatesTo == null) {
			relatesTo = new EObjectContainmentEList<CitationRelatesTo>(CitationRelatesTo.class, this, FhirPackage.CITATION_CITED_ARTIFACT__RELATES_TO);
		}
		return relatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationPublicationForm> getPublicationForm() {
		if (publicationForm == null) {
			publicationForm = new EObjectContainmentEList<CitationPublicationForm>(CitationPublicationForm.class, this, FhirPackage.CITATION_CITED_ARTIFACT__PUBLICATION_FORM);
		}
		return publicationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationWebLocation> getWebLocation() {
		if (webLocation == null) {
			webLocation = new EObjectContainmentEList<CitationWebLocation>(CitationWebLocation.class, this, FhirPackage.CITATION_CITED_ARTIFACT__WEB_LOCATION);
		}
		return webLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationClassification1> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<CitationClassification1>(CitationClassification1.class, this, FhirPackage.CITATION_CITED_ARTIFACT__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationContributorship getContributorship() {
		return contributorship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributorship(CitationContributorship newContributorship, NotificationChain msgs) {
		CitationContributorship oldContributorship = contributorship;
		contributorship = newContributorship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CITED_ARTIFACT__CONTRIBUTORSHIP, oldContributorship, newContributorship);
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
	public void setContributorship(CitationContributorship newContributorship) {
		if (newContributorship != contributorship) {
			NotificationChain msgs = null;
			if (contributorship != null)
				msgs = ((InternalEObject)contributorship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CITED_ARTIFACT__CONTRIBUTORSHIP, null, msgs);
			if (newContributorship != null)
				msgs = ((InternalEObject)newContributorship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CITED_ARTIFACT__CONTRIBUTORSHIP, null, msgs);
			msgs = basicSetContributorship(newContributorship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CITED_ARTIFACT__CONTRIBUTORSHIP, newContributorship, newContributorship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.CITATION_CITED_ARTIFACT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_CITED_ARTIFACT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATED_IDENTIFIER:
				return ((InternalEList<?>)getRelatedIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__DATE_ACCESSED:
				return basicSetDateAccessed(null, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__CURRENT_STATE:
				return ((InternalEList<?>)getCurrentState()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__STATUS_DATE:
				return ((InternalEList<?>)getStatusDate()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__PART:
				return basicSetPart(null, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATES_TO:
				return ((InternalEList<?>)getRelatesTo()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__PUBLICATION_FORM:
				return ((InternalEList<?>)getPublicationForm()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__WEB_LOCATION:
				return ((InternalEList<?>)getWebLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__CONTRIBUTORSHIP:
				return basicSetContributorship(null, msgs);
			case FhirPackage.CITATION_CITED_ARTIFACT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CITATION_CITED_ARTIFACT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATED_IDENTIFIER:
				return getRelatedIdentifier();
			case FhirPackage.CITATION_CITED_ARTIFACT__DATE_ACCESSED:
				return getDateAccessed();
			case FhirPackage.CITATION_CITED_ARTIFACT__VERSION:
				return getVersion();
			case FhirPackage.CITATION_CITED_ARTIFACT__CURRENT_STATE:
				return getCurrentState();
			case FhirPackage.CITATION_CITED_ARTIFACT__STATUS_DATE:
				return getStatusDate();
			case FhirPackage.CITATION_CITED_ARTIFACT__TITLE:
				return getTitle();
			case FhirPackage.CITATION_CITED_ARTIFACT__ABSTRACT:
				return getAbstract();
			case FhirPackage.CITATION_CITED_ARTIFACT__PART:
				return getPart();
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATES_TO:
				return getRelatesTo();
			case FhirPackage.CITATION_CITED_ARTIFACT__PUBLICATION_FORM:
				return getPublicationForm();
			case FhirPackage.CITATION_CITED_ARTIFACT__WEB_LOCATION:
				return getWebLocation();
			case FhirPackage.CITATION_CITED_ARTIFACT__CLASSIFICATION:
				return getClassification();
			case FhirPackage.CITATION_CITED_ARTIFACT__CONTRIBUTORSHIP:
				return getContributorship();
			case FhirPackage.CITATION_CITED_ARTIFACT__NOTE:
				return getNote();
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
			case FhirPackage.CITATION_CITED_ARTIFACT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATED_IDENTIFIER:
				getRelatedIdentifier().clear();
				getRelatedIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__DATE_ACCESSED:
				setDateAccessed((DateTime)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__VERSION:
				setVersion((CitationVersion)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__CURRENT_STATE:
				getCurrentState().clear();
				getCurrentState().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__STATUS_DATE:
				getStatusDate().clear();
				getStatusDate().addAll((Collection<? extends CitationStatusDate1>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends CitationTitle>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends CitationAbstract>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__PART:
				setPart((CitationPart)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATES_TO:
				getRelatesTo().clear();
				getRelatesTo().addAll((Collection<? extends CitationRelatesTo>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__PUBLICATION_FORM:
				getPublicationForm().clear();
				getPublicationForm().addAll((Collection<? extends CitationPublicationForm>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__WEB_LOCATION:
				getWebLocation().clear();
				getWebLocation().addAll((Collection<? extends CitationWebLocation>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends CitationClassification1>)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__CONTRIBUTORSHIP:
				setContributorship((CitationContributorship)newValue);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.CITATION_CITED_ARTIFACT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATED_IDENTIFIER:
				getRelatedIdentifier().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__DATE_ACCESSED:
				setDateAccessed((DateTime)null);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__VERSION:
				setVersion((CitationVersion)null);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__CURRENT_STATE:
				getCurrentState().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__STATUS_DATE:
				getStatusDate().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__TITLE:
				getTitle().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__ABSTRACT:
				getAbstract().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__PART:
				setPart((CitationPart)null);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATES_TO:
				getRelatesTo().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__PUBLICATION_FORM:
				getPublicationForm().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__WEB_LOCATION:
				getWebLocation().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__CLASSIFICATION:
				getClassification().clear();
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__CONTRIBUTORSHIP:
				setContributorship((CitationContributorship)null);
				return;
			case FhirPackage.CITATION_CITED_ARTIFACT__NOTE:
				getNote().clear();
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
			case FhirPackage.CITATION_CITED_ARTIFACT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATED_IDENTIFIER:
				return relatedIdentifier != null && !relatedIdentifier.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__DATE_ACCESSED:
				return dateAccessed != null;
			case FhirPackage.CITATION_CITED_ARTIFACT__VERSION:
				return version != null;
			case FhirPackage.CITATION_CITED_ARTIFACT__CURRENT_STATE:
				return currentState != null && !currentState.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__STATUS_DATE:
				return statusDate != null && !statusDate.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__TITLE:
				return title != null && !title.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__ABSTRACT:
				return abstract_ != null && !abstract_.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__PART:
				return part != null;
			case FhirPackage.CITATION_CITED_ARTIFACT__RELATES_TO:
				return relatesTo != null && !relatesTo.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__PUBLICATION_FORM:
				return publicationForm != null && !publicationForm.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__WEB_LOCATION:
				return webLocation != null && !webLocation.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case FhirPackage.CITATION_CITED_ARTIFACT__CONTRIBUTORSHIP:
				return contributorship != null;
			case FhirPackage.CITATION_CITED_ARTIFACT__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CitationCitedArtifactImpl
