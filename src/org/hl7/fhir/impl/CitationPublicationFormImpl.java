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

import org.hl7.fhir.CitationPublicationForm;
import org.hl7.fhir.CitationPublishedIn;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Publication Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getPublishedIn <em>Published In</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getCitedMedium <em>Cited Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getArticleDate <em>Article Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getPublicationDateText <em>Publication Date Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getPublicationDateSeason <em>Publication Date Season</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getAccessionNumber <em>Accession Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getPageString <em>Page String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getFirstPage <em>First Page</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getLastPage <em>Last Page</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPublicationFormImpl#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationPublicationFormImpl extends BackboneElementImpl implements CitationPublicationForm {
	/**
	 * The cached value of the '{@link #getPublishedIn() <em>Published In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedIn()
	 * @generated
	 * @ordered
	 */
	protected CitationPublishedIn publishedIn;

	/**
	 * The cached value of the '{@link #getCitedMedium() <em>Cited Medium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedMedium()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept citedMedium;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String volume;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String issue;

	/**
	 * The cached value of the '{@link #getArticleDate() <em>Article Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime articleDate;

	/**
	 * The cached value of the '{@link #getPublicationDateText() <em>Publication Date Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDateText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publicationDateText;

	/**
	 * The cached value of the '{@link #getPublicationDateSeason() <em>Publication Date Season</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDateSeason()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publicationDateSeason;

	/**
	 * The cached value of the '{@link #getLastRevisionDate() <em>Last Revision Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastRevisionDate;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> language;

	/**
	 * The cached value of the '{@link #getAccessionNumber() <em>Accession Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessionNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String accessionNumber;

	/**
	 * The cached value of the '{@link #getPageString() <em>Page String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String pageString;

	/**
	 * The cached value of the '{@link #getFirstPage() <em>First Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String firstPage;

	/**
	 * The cached value of the '{@link #getLastPage() <em>Last Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String lastPage;

	/**
	 * The cached value of the '{@link #getPageCount() <em>Page Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageCount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String pageCount;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationPublicationFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationPublicationForm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationPublishedIn getPublishedIn() {
		return publishedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishedIn(CitationPublishedIn newPublishedIn, NotificationChain msgs) {
		CitationPublishedIn oldPublishedIn = publishedIn;
		publishedIn = newPublishedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PUBLISHED_IN, oldPublishedIn, newPublishedIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedIn(CitationPublishedIn newPublishedIn) {
		if (newPublishedIn != publishedIn) {
			NotificationChain msgs = null;
			if (publishedIn != null)
				msgs = ((InternalEObject)publishedIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PUBLISHED_IN, null, msgs);
			if (newPublishedIn != null)
				msgs = ((InternalEObject)newPublishedIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PUBLISHED_IN, null, msgs);
			msgs = basicSetPublishedIn(newPublishedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PUBLISHED_IN, newPublishedIn, newPublishedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCitedMedium() {
		return citedMedium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitedMedium(CodeableConcept newCitedMedium, NotificationChain msgs) {
		CodeableConcept oldCitedMedium = citedMedium;
		citedMedium = newCitedMedium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__CITED_MEDIUM, oldCitedMedium, newCitedMedium);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedMedium(CodeableConcept newCitedMedium) {
		if (newCitedMedium != citedMedium) {
			NotificationChain msgs = null;
			if (citedMedium != null)
				msgs = ((InternalEObject)citedMedium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__CITED_MEDIUM, null, msgs);
			if (newCitedMedium != null)
				msgs = ((InternalEObject)newCitedMedium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__CITED_MEDIUM, null, msgs);
			msgs = basicSetCitedMedium(newCitedMedium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__CITED_MEDIUM, newCitedMedium, newCitedMedium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolume(org.hl7.fhir.String newVolume, NotificationChain msgs) {
		org.hl7.fhir.String oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__VOLUME, oldVolume, newVolume);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(org.hl7.fhir.String newVolume) {
		if (newVolume != volume) {
			NotificationChain msgs = null;
			if (volume != null)
				msgs = ((InternalEObject)volume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__VOLUME, null, msgs);
			if (newVolume != null)
				msgs = ((InternalEObject)newVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__VOLUME, null, msgs);
			msgs = basicSetVolume(newVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__VOLUME, newVolume, newVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssue(org.hl7.fhir.String newIssue, NotificationChain msgs) {
		org.hl7.fhir.String oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__ISSUE, oldIssue, newIssue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(org.hl7.fhir.String newIssue) {
		if (newIssue != issue) {
			NotificationChain msgs = null;
			if (issue != null)
				msgs = ((InternalEObject)issue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__ISSUE, null, msgs);
			if (newIssue != null)
				msgs = ((InternalEObject)newIssue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__ISSUE, null, msgs);
			msgs = basicSetIssue(newIssue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__ISSUE, newIssue, newIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getArticleDate() {
		return articleDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleDate(DateTime newArticleDate, NotificationChain msgs) {
		DateTime oldArticleDate = articleDate;
		articleDate = newArticleDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__ARTICLE_DATE, oldArticleDate, newArticleDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArticleDate(DateTime newArticleDate) {
		if (newArticleDate != articleDate) {
			NotificationChain msgs = null;
			if (articleDate != null)
				msgs = ((InternalEObject)articleDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__ARTICLE_DATE, null, msgs);
			if (newArticleDate != null)
				msgs = ((InternalEObject)newArticleDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__ARTICLE_DATE, null, msgs);
			msgs = basicSetArticleDate(newArticleDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__ARTICLE_DATE, newArticleDate, newArticleDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublicationDateText() {
		return publicationDateText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationDateText(org.hl7.fhir.String newPublicationDateText, NotificationChain msgs) {
		org.hl7.fhir.String oldPublicationDateText = publicationDateText;
		publicationDateText = newPublicationDateText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_TEXT, oldPublicationDateText, newPublicationDateText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDateText(org.hl7.fhir.String newPublicationDateText) {
		if (newPublicationDateText != publicationDateText) {
			NotificationChain msgs = null;
			if (publicationDateText != null)
				msgs = ((InternalEObject)publicationDateText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_TEXT, null, msgs);
			if (newPublicationDateText != null)
				msgs = ((InternalEObject)newPublicationDateText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_TEXT, null, msgs);
			msgs = basicSetPublicationDateText(newPublicationDateText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_TEXT, newPublicationDateText, newPublicationDateText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublicationDateSeason() {
		return publicationDateSeason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationDateSeason(org.hl7.fhir.String newPublicationDateSeason, NotificationChain msgs) {
		org.hl7.fhir.String oldPublicationDateSeason = publicationDateSeason;
		publicationDateSeason = newPublicationDateSeason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_SEASON, oldPublicationDateSeason, newPublicationDateSeason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDateSeason(org.hl7.fhir.String newPublicationDateSeason) {
		if (newPublicationDateSeason != publicationDateSeason) {
			NotificationChain msgs = null;
			if (publicationDateSeason != null)
				msgs = ((InternalEObject)publicationDateSeason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_SEASON, null, msgs);
			if (newPublicationDateSeason != null)
				msgs = ((InternalEObject)newPublicationDateSeason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_SEASON, null, msgs);
			msgs = basicSetPublicationDateSeason(newPublicationDateSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_SEASON, newPublicationDateSeason, newPublicationDateSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getLastRevisionDate() {
		return lastRevisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastRevisionDate(DateTime newLastRevisionDate, NotificationChain msgs) {
		DateTime oldLastRevisionDate = lastRevisionDate;
		lastRevisionDate = newLastRevisionDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__LAST_REVISION_DATE, oldLastRevisionDate, newLastRevisionDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevisionDate(DateTime newLastRevisionDate) {
		if (newLastRevisionDate != lastRevisionDate) {
			NotificationChain msgs = null;
			if (lastRevisionDate != null)
				msgs = ((InternalEObject)lastRevisionDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__LAST_REVISION_DATE, null, msgs);
			if (newLastRevisionDate != null)
				msgs = ((InternalEObject)newLastRevisionDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__LAST_REVISION_DATE, null, msgs);
			msgs = basicSetLastRevisionDate(newLastRevisionDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__LAST_REVISION_DATE, newLastRevisionDate, newLastRevisionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CITATION_PUBLICATION_FORM__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAccessionNumber() {
		return accessionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessionNumber(org.hl7.fhir.String newAccessionNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldAccessionNumber = accessionNumber;
		accessionNumber = newAccessionNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__ACCESSION_NUMBER, oldAccessionNumber, newAccessionNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessionNumber(org.hl7.fhir.String newAccessionNumber) {
		if (newAccessionNumber != accessionNumber) {
			NotificationChain msgs = null;
			if (accessionNumber != null)
				msgs = ((InternalEObject)accessionNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__ACCESSION_NUMBER, null, msgs);
			if (newAccessionNumber != null)
				msgs = ((InternalEObject)newAccessionNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__ACCESSION_NUMBER, null, msgs);
			msgs = basicSetAccessionNumber(newAccessionNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__ACCESSION_NUMBER, newAccessionNumber, newAccessionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPageString() {
		return pageString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageString(org.hl7.fhir.String newPageString, NotificationChain msgs) {
		org.hl7.fhir.String oldPageString = pageString;
		pageString = newPageString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PAGE_STRING, oldPageString, newPageString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageString(org.hl7.fhir.String newPageString) {
		if (newPageString != pageString) {
			NotificationChain msgs = null;
			if (pageString != null)
				msgs = ((InternalEObject)pageString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PAGE_STRING, null, msgs);
			if (newPageString != null)
				msgs = ((InternalEObject)newPageString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PAGE_STRING, null, msgs);
			msgs = basicSetPageString(newPageString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PAGE_STRING, newPageString, newPageString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getFirstPage() {
		return firstPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstPage(org.hl7.fhir.String newFirstPage, NotificationChain msgs) {
		org.hl7.fhir.String oldFirstPage = firstPage;
		firstPage = newFirstPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__FIRST_PAGE, oldFirstPage, newFirstPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPage(org.hl7.fhir.String newFirstPage) {
		if (newFirstPage != firstPage) {
			NotificationChain msgs = null;
			if (firstPage != null)
				msgs = ((InternalEObject)firstPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__FIRST_PAGE, null, msgs);
			if (newFirstPage != null)
				msgs = ((InternalEObject)newFirstPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__FIRST_PAGE, null, msgs);
			msgs = basicSetFirstPage(newFirstPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__FIRST_PAGE, newFirstPage, newFirstPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLastPage() {
		return lastPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastPage(org.hl7.fhir.String newLastPage, NotificationChain msgs) {
		org.hl7.fhir.String oldLastPage = lastPage;
		lastPage = newLastPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__LAST_PAGE, oldLastPage, newLastPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPage(org.hl7.fhir.String newLastPage) {
		if (newLastPage != lastPage) {
			NotificationChain msgs = null;
			if (lastPage != null)
				msgs = ((InternalEObject)lastPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__LAST_PAGE, null, msgs);
			if (newLastPage != null)
				msgs = ((InternalEObject)newLastPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__LAST_PAGE, null, msgs);
			msgs = basicSetLastPage(newLastPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__LAST_PAGE, newLastPage, newLastPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPageCount() {
		return pageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageCount(org.hl7.fhir.String newPageCount, NotificationChain msgs) {
		org.hl7.fhir.String oldPageCount = pageCount;
		pageCount = newPageCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PAGE_COUNT, oldPageCount, newPageCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageCount(org.hl7.fhir.String newPageCount) {
		if (newPageCount != pageCount) {
			NotificationChain msgs = null;
			if (pageCount != null)
				msgs = ((InternalEObject)pageCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PAGE_COUNT, null, msgs);
			if (newPageCount != null)
				msgs = ((InternalEObject)newPageCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__PAGE_COUNT, null, msgs);
			msgs = basicSetPageCount(newPageCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__PAGE_COUNT, newPageCount, newPageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(Markdown newCopyright, NotificationChain msgs) {
		Markdown oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(Markdown newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PUBLICATION_FORM__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PUBLICATION_FORM__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLISHED_IN:
				return basicSetPublishedIn(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__CITED_MEDIUM:
				return basicSetCitedMedium(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__VOLUME:
				return basicSetVolume(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__ISSUE:
				return basicSetIssue(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__ARTICLE_DATE:
				return basicSetArticleDate(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_TEXT:
				return basicSetPublicationDateText(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_SEASON:
				return basicSetPublicationDateSeason(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_REVISION_DATE:
				return basicSetLastRevisionDate(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__ACCESSION_NUMBER:
				return basicSetAccessionNumber(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_STRING:
				return basicSetPageString(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__FIRST_PAGE:
				return basicSetFirstPage(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_PAGE:
				return basicSetLastPage(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_COUNT:
				return basicSetPageCount(null, msgs);
			case FhirPackage.CITATION_PUBLICATION_FORM__COPYRIGHT:
				return basicSetCopyright(null, msgs);
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
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLISHED_IN:
				return getPublishedIn();
			case FhirPackage.CITATION_PUBLICATION_FORM__CITED_MEDIUM:
				return getCitedMedium();
			case FhirPackage.CITATION_PUBLICATION_FORM__VOLUME:
				return getVolume();
			case FhirPackage.CITATION_PUBLICATION_FORM__ISSUE:
				return getIssue();
			case FhirPackage.CITATION_PUBLICATION_FORM__ARTICLE_DATE:
				return getArticleDate();
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_TEXT:
				return getPublicationDateText();
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_SEASON:
				return getPublicationDateSeason();
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_REVISION_DATE:
				return getLastRevisionDate();
			case FhirPackage.CITATION_PUBLICATION_FORM__LANGUAGE:
				return getLanguage();
			case FhirPackage.CITATION_PUBLICATION_FORM__ACCESSION_NUMBER:
				return getAccessionNumber();
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_STRING:
				return getPageString();
			case FhirPackage.CITATION_PUBLICATION_FORM__FIRST_PAGE:
				return getFirstPage();
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_PAGE:
				return getLastPage();
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_COUNT:
				return getPageCount();
			case FhirPackage.CITATION_PUBLICATION_FORM__COPYRIGHT:
				return getCopyright();
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
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLISHED_IN:
				setPublishedIn((CitationPublishedIn)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__CITED_MEDIUM:
				setCitedMedium((CodeableConcept)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__VOLUME:
				setVolume((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__ISSUE:
				setIssue((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__ARTICLE_DATE:
				setArticleDate((DateTime)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_TEXT:
				setPublicationDateText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_SEASON:
				setPublicationDateSeason((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_REVISION_DATE:
				setLastRevisionDate((DateTime)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__ACCESSION_NUMBER:
				setAccessionNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_STRING:
				setPageString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__FIRST_PAGE:
				setFirstPage((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_PAGE:
				setLastPage((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_COUNT:
				setPageCount((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__COPYRIGHT:
				setCopyright((Markdown)newValue);
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
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLISHED_IN:
				setPublishedIn((CitationPublishedIn)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__CITED_MEDIUM:
				setCitedMedium((CodeableConcept)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__VOLUME:
				setVolume((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__ISSUE:
				setIssue((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__ARTICLE_DATE:
				setArticleDate((DateTime)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_TEXT:
				setPublicationDateText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_SEASON:
				setPublicationDateSeason((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_REVISION_DATE:
				setLastRevisionDate((DateTime)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__LANGUAGE:
				getLanguage().clear();
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__ACCESSION_NUMBER:
				setAccessionNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_STRING:
				setPageString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__FIRST_PAGE:
				setFirstPage((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_PAGE:
				setLastPage((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_COUNT:
				setPageCount((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PUBLICATION_FORM__COPYRIGHT:
				setCopyright((Markdown)null);
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
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLISHED_IN:
				return publishedIn != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__CITED_MEDIUM:
				return citedMedium != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__VOLUME:
				return volume != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__ISSUE:
				return issue != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__ARTICLE_DATE:
				return articleDate != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_TEXT:
				return publicationDateText != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__PUBLICATION_DATE_SEASON:
				return publicationDateSeason != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_REVISION_DATE:
				return lastRevisionDate != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__LANGUAGE:
				return language != null && !language.isEmpty();
			case FhirPackage.CITATION_PUBLICATION_FORM__ACCESSION_NUMBER:
				return accessionNumber != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_STRING:
				return pageString != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__FIRST_PAGE:
				return firstPage != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__LAST_PAGE:
				return lastPage != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__PAGE_COUNT:
				return pageCount != null;
			case FhirPackage.CITATION_PUBLICATION_FORM__COPYRIGHT:
				return copyright != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationPublicationFormImpl
