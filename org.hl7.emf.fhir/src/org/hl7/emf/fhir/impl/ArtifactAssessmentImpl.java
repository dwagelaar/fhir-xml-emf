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

import org.hl7.emf.fhir.ArtifactAssessment;
import org.hl7.emf.fhir.ArtifactAssessmentContent;
import org.hl7.emf.fhir.ArtifactAssessmentDisposition;
import org.hl7.emf.fhir.ArtifactAssessmentWorkflowStatus;
import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.Date;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getCiteAsReference <em>Cite As Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getCiteAsMarkdown <em>Cite As Markdown</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getArtifactReference <em>Artifact Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getArtifactCanonical <em>Artifact Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getArtifactUri <em>Artifact Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getWorkflowStatus <em>Workflow Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ArtifactAssessmentImpl#getDisposition <em>Disposition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactAssessmentImpl extends DomainResourceImpl implements ArtifactAssessment {
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
	protected org.hl7.emf.fhir.String title;

	/**
	 * The cached value of the '{@link #getCiteAsReference() <em>Cite As Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiteAsReference()
	 * @generated
	 * @ordered
	 */
	protected Reference citeAsReference;

	/**
	 * The cached value of the '{@link #getCiteAsMarkdown() <em>Cite As Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiteAsMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown citeAsMarkdown;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

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
	 * The cached value of the '{@link #getApprovalDate() <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected Date approvalDate;

	/**
	 * The cached value of the '{@link #getLastReviewDate() <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastReviewDate;

	/**
	 * The cached value of the '{@link #getArtifactReference() <em>Artifact Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactReference()
	 * @generated
	 * @ordered
	 */
	protected Reference artifactReference;

	/**
	 * The cached value of the '{@link #getArtifactCanonical() <em>Artifact Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical artifactCanonical;

	/**
	 * The cached value of the '{@link #getArtifactUri() <em>Artifact Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactUri()
	 * @generated
	 * @ordered
	 */
	protected Uri artifactUri;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactAssessmentContent> content;

	/**
	 * The cached value of the '{@link #getWorkflowStatus() <em>Workflow Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowStatus()
	 * @generated
	 * @ordered
	 */
	protected ArtifactAssessmentWorkflowStatus workflowStatus;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected ArtifactAssessmentDisposition disposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getArtifactAssessment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ARTIFACT_ASSESSMENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.emf.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.hl7.emf.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCiteAsReference() {
		return citeAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCiteAsReference(Reference newCiteAsReference, NotificationChain msgs) {
		Reference oldCiteAsReference = citeAsReference;
		citeAsReference = newCiteAsReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_REFERENCE, oldCiteAsReference, newCiteAsReference);
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
	public void setCiteAsReference(Reference newCiteAsReference) {
		if (newCiteAsReference != citeAsReference) {
			NotificationChain msgs = null;
			if (citeAsReference != null)
				msgs = ((InternalEObject)citeAsReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_REFERENCE, null, msgs);
			if (newCiteAsReference != null)
				msgs = ((InternalEObject)newCiteAsReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_REFERENCE, null, msgs);
			msgs = basicSetCiteAsReference(newCiteAsReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_REFERENCE, newCiteAsReference, newCiteAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getCiteAsMarkdown() {
		return citeAsMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCiteAsMarkdown(Markdown newCiteAsMarkdown, NotificationChain msgs) {
		Markdown oldCiteAsMarkdown = citeAsMarkdown;
		citeAsMarkdown = newCiteAsMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_MARKDOWN, oldCiteAsMarkdown, newCiteAsMarkdown);
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
	public void setCiteAsMarkdown(Markdown newCiteAsMarkdown) {
		if (newCiteAsMarkdown != citeAsMarkdown) {
			NotificationChain msgs = null;
			if (citeAsMarkdown != null)
				msgs = ((InternalEObject)citeAsMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_MARKDOWN, null, msgs);
			if (newCiteAsMarkdown != null)
				msgs = ((InternalEObject)newCiteAsMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_MARKDOWN, null, msgs);
			msgs = basicSetCiteAsMarkdown(newCiteAsMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_MARKDOWN, newCiteAsMarkdown, newCiteAsMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__COPYRIGHT, oldCopyright, newCopyright);
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
	public void setCopyright(Markdown newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getApprovalDate() {
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalDate(Date newApprovalDate, NotificationChain msgs) {
		Date oldApprovalDate = approvalDate;
		approvalDate = newApprovalDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
	public void setApprovalDate(Date newApprovalDate) {
		if (newApprovalDate != approvalDate) {
			NotificationChain msgs = null;
			if (approvalDate != null)
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__APPROVAL_DATE, newApprovalDate, newApprovalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastReviewDate() {
		return lastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastReviewDate(Date newLastReviewDate, NotificationChain msgs) {
		Date oldLastReviewDate = lastReviewDate;
		lastReviewDate = newLastReviewDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
	public void setLastReviewDate(Date newLastReviewDate) {
		if (newLastReviewDate != lastReviewDate) {
			NotificationChain msgs = null;
			if (lastReviewDate != null)
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getArtifactReference() {
		return artifactReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactReference(Reference newArtifactReference, NotificationChain msgs) {
		Reference oldArtifactReference = artifactReference;
		artifactReference = newArtifactReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_REFERENCE, oldArtifactReference, newArtifactReference);
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
	public void setArtifactReference(Reference newArtifactReference) {
		if (newArtifactReference != artifactReference) {
			NotificationChain msgs = null;
			if (artifactReference != null)
				msgs = ((InternalEObject)artifactReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_REFERENCE, null, msgs);
			if (newArtifactReference != null)
				msgs = ((InternalEObject)newArtifactReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_REFERENCE, null, msgs);
			msgs = basicSetArtifactReference(newArtifactReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_REFERENCE, newArtifactReference, newArtifactReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getArtifactCanonical() {
		return artifactCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactCanonical(Canonical newArtifactCanonical, NotificationChain msgs) {
		Canonical oldArtifactCanonical = artifactCanonical;
		artifactCanonical = newArtifactCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_CANONICAL, oldArtifactCanonical, newArtifactCanonical);
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
	public void setArtifactCanonical(Canonical newArtifactCanonical) {
		if (newArtifactCanonical != artifactCanonical) {
			NotificationChain msgs = null;
			if (artifactCanonical != null)
				msgs = ((InternalEObject)artifactCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_CANONICAL, null, msgs);
			if (newArtifactCanonical != null)
				msgs = ((InternalEObject)newArtifactCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_CANONICAL, null, msgs);
			msgs = basicSetArtifactCanonical(newArtifactCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_CANONICAL, newArtifactCanonical, newArtifactCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getArtifactUri() {
		return artifactUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactUri(Uri newArtifactUri, NotificationChain msgs) {
		Uri oldArtifactUri = artifactUri;
		artifactUri = newArtifactUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_URI, oldArtifactUri, newArtifactUri);
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
	public void setArtifactUri(Uri newArtifactUri) {
		if (newArtifactUri != artifactUri) {
			NotificationChain msgs = null;
			if (artifactUri != null)
				msgs = ((InternalEObject)artifactUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_URI, null, msgs);
			if (newArtifactUri != null)
				msgs = ((InternalEObject)newArtifactUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_URI, null, msgs);
			msgs = basicSetArtifactUri(newArtifactUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_URI, newArtifactUri, newArtifactUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactAssessmentContent> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<ArtifactAssessmentContent>(ArtifactAssessmentContent.class, this, FhirPackage.ARTIFACT_ASSESSMENT__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactAssessmentWorkflowStatus getWorkflowStatus() {
		return workflowStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflowStatus(ArtifactAssessmentWorkflowStatus newWorkflowStatus, NotificationChain msgs) {
		ArtifactAssessmentWorkflowStatus oldWorkflowStatus = workflowStatus;
		workflowStatus = newWorkflowStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__WORKFLOW_STATUS, oldWorkflowStatus, newWorkflowStatus);
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
	public void setWorkflowStatus(ArtifactAssessmentWorkflowStatus newWorkflowStatus) {
		if (newWorkflowStatus != workflowStatus) {
			NotificationChain msgs = null;
			if (workflowStatus != null)
				msgs = ((InternalEObject)workflowStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__WORKFLOW_STATUS, null, msgs);
			if (newWorkflowStatus != null)
				msgs = ((InternalEObject)newWorkflowStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__WORKFLOW_STATUS, null, msgs);
			msgs = basicSetWorkflowStatus(newWorkflowStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__WORKFLOW_STATUS, newWorkflowStatus, newWorkflowStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactAssessmentDisposition getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(ArtifactAssessmentDisposition newDisposition, NotificationChain msgs) {
		ArtifactAssessmentDisposition oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__DISPOSITION, oldDisposition, newDisposition);
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
	public void setDisposition(ArtifactAssessmentDisposition newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ARTIFACT_ASSESSMENT__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ARTIFACT_ASSESSMENT__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ARTIFACT_ASSESSMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_REFERENCE:
				return basicSetCiteAsReference(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_MARKDOWN:
				return basicSetCiteAsMarkdown(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_REFERENCE:
				return basicSetArtifactReference(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_CANONICAL:
				return basicSetArtifactCanonical(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_URI:
				return basicSetArtifactUri(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__WORKFLOW_STATUS:
				return basicSetWorkflowStatus(null, msgs);
			case FhirPackage.ARTIFACT_ASSESSMENT__DISPOSITION:
				return basicSetDisposition(null, msgs);
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
			case FhirPackage.ARTIFACT_ASSESSMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ARTIFACT_ASSESSMENT__TITLE:
				return getTitle();
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_REFERENCE:
				return getCiteAsReference();
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_MARKDOWN:
				return getCiteAsMarkdown();
			case FhirPackage.ARTIFACT_ASSESSMENT__DATE:
				return getDate();
			case FhirPackage.ARTIFACT_ASSESSMENT__COPYRIGHT:
				return getCopyright();
			case FhirPackage.ARTIFACT_ASSESSMENT__APPROVAL_DATE:
				return getApprovalDate();
			case FhirPackage.ARTIFACT_ASSESSMENT__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_REFERENCE:
				return getArtifactReference();
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_CANONICAL:
				return getArtifactCanonical();
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_URI:
				return getArtifactUri();
			case FhirPackage.ARTIFACT_ASSESSMENT__CONTENT:
				return getContent();
			case FhirPackage.ARTIFACT_ASSESSMENT__WORKFLOW_STATUS:
				return getWorkflowStatus();
			case FhirPackage.ARTIFACT_ASSESSMENT__DISPOSITION:
				return getDisposition();
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
			case FhirPackage.ARTIFACT_ASSESSMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__TITLE:
				setTitle((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_REFERENCE:
				setCiteAsReference((Reference)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_MARKDOWN:
				setCiteAsMarkdown((Markdown)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_REFERENCE:
				setArtifactReference((Reference)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_CANONICAL:
				setArtifactCanonical((Canonical)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_URI:
				setArtifactUri((Uri)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends ArtifactAssessmentContent>)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__WORKFLOW_STATUS:
				setWorkflowStatus((ArtifactAssessmentWorkflowStatus)newValue);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__DISPOSITION:
				setDisposition((ArtifactAssessmentDisposition)newValue);
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
			case FhirPackage.ARTIFACT_ASSESSMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__TITLE:
				setTitle((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_REFERENCE:
				setCiteAsReference((Reference)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_MARKDOWN:
				setCiteAsMarkdown((Markdown)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_REFERENCE:
				setArtifactReference((Reference)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_CANONICAL:
				setArtifactCanonical((Canonical)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_URI:
				setArtifactUri((Uri)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__CONTENT:
				getContent().clear();
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__WORKFLOW_STATUS:
				setWorkflowStatus((ArtifactAssessmentWorkflowStatus)null);
				return;
			case FhirPackage.ARTIFACT_ASSESSMENT__DISPOSITION:
				setDisposition((ArtifactAssessmentDisposition)null);
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
			case FhirPackage.ARTIFACT_ASSESSMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ARTIFACT_ASSESSMENT__TITLE:
				return title != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_REFERENCE:
				return citeAsReference != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__CITE_AS_MARKDOWN:
				return citeAsMarkdown != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__DATE:
				return date != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__COPYRIGHT:
				return copyright != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__APPROVAL_DATE:
				return approvalDate != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_REFERENCE:
				return artifactReference != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_CANONICAL:
				return artifactCanonical != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__ARTIFACT_URI:
				return artifactUri != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__CONTENT:
				return content != null && !content.isEmpty();
			case FhirPackage.ARTIFACT_ASSESSMENT__WORKFLOW_STATUS:
				return workflowStatus != null;
			case FhirPackage.ARTIFACT_ASSESSMENT__DISPOSITION:
				return disposition != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtifactAssessmentImpl
