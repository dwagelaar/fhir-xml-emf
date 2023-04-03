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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.EvidenceReportSection;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Report Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getFocusReference <em>Focus Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getEntryClassifier <em>Entry Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getEntryReference <em>Entry Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getEntryQuantity <em>Entry Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getEmptyReason <em>Empty Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceReportSectionImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceReportSectionImpl extends BackboneElementImpl implements EvidenceReportSection {
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
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept focus;

	/**
	 * The cached value of the '{@link #getFocusReference() <em>Focus Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocusReference()
	 * @generated
	 * @ordered
	 */
	protected Reference focusReference;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> author;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Narrative text;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ListMode mode;

	/**
	 * The cached value of the '{@link #getOrderedBy() <em>Ordered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedBy()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orderedBy;

	/**
	 * The cached value of the '{@link #getEntryClassifier() <em>Entry Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> entryClassifier;

	/**
	 * The cached value of the '{@link #getEntryReference() <em>Entry Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> entryReference;

	/**
	 * The cached value of the '{@link #getEntryQuantity() <em>Entry Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> entryQuantity;

	/**
	 * The cached value of the '{@link #getEmptyReason() <em>Empty Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept emptyReason;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceReportSection> section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceReportSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceReportSection();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(CodeableConcept newFocus, NotificationChain msgs) {
		CodeableConcept oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS, oldFocus, newFocus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(CodeableConcept newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFocusReference() {
		return focusReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocusReference(Reference newFocusReference, NotificationChain msgs) {
		Reference oldFocusReference = focusReference;
		focusReference = newFocusReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS_REFERENCE, oldFocusReference, newFocusReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocusReference(Reference newFocusReference) {
		if (newFocusReference != focusReference) {
			NotificationChain msgs = null;
			if (focusReference != null)
				msgs = ((InternalEObject)focusReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS_REFERENCE, null, msgs);
			if (newFocusReference != null)
				msgs = ((InternalEObject)newFocusReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS_REFERENCE, null, msgs);
			msgs = basicSetFocusReference(newFocusReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS_REFERENCE, newFocusReference, newFocusReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.EVIDENCE_REPORT_SECTION__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Narrative newText, NotificationChain msgs) {
		Narrative oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Narrative newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(ListMode newMode, NotificationChain msgs) {
		ListMode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__MODE, oldMode, newMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ListMode newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOrderedBy() {
		return orderedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderedBy(CodeableConcept newOrderedBy, NotificationChain msgs) {
		CodeableConcept oldOrderedBy = orderedBy;
		orderedBy = newOrderedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__ORDERED_BY, oldOrderedBy, newOrderedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedBy(CodeableConcept newOrderedBy) {
		if (newOrderedBy != orderedBy) {
			NotificationChain msgs = null;
			if (orderedBy != null)
				msgs = ((InternalEObject)orderedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__ORDERED_BY, null, msgs);
			if (newOrderedBy != null)
				msgs = ((InternalEObject)newOrderedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__ORDERED_BY, null, msgs);
			msgs = basicSetOrderedBy(newOrderedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__ORDERED_BY, newOrderedBy, newOrderedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getEntryClassifier() {
		if (entryClassifier == null) {
			entryClassifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_CLASSIFIER);
		}
		return entryClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEntryReference() {
		if (entryReference == null) {
			entryReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_REFERENCE);
		}
		return entryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantity> getEntryQuantity() {
		if (entryQuantity == null) {
			entryQuantity = new EObjectContainmentEList<Quantity>(Quantity.class, this, FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_QUANTITY);
		}
		return entryQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getEmptyReason() {
		return emptyReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmptyReason(CodeableConcept newEmptyReason, NotificationChain msgs) {
		CodeableConcept oldEmptyReason = emptyReason;
		emptyReason = newEmptyReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__EMPTY_REASON, oldEmptyReason, newEmptyReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyReason(CodeableConcept newEmptyReason) {
		if (newEmptyReason != emptyReason) {
			NotificationChain msgs = null;
			if (emptyReason != null)
				msgs = ((InternalEObject)emptyReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__EMPTY_REASON, null, msgs);
			if (newEmptyReason != null)
				msgs = ((InternalEObject)newEmptyReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_REPORT_SECTION__EMPTY_REASON, null, msgs);
			msgs = basicSetEmptyReason(newEmptyReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_REPORT_SECTION__EMPTY_REASON, newEmptyReason, newEmptyReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceReportSection> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<EvidenceReportSection>(EvidenceReportSection.class, this, FhirPackage.EVIDENCE_REPORT_SECTION__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_REPORT_SECTION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS:
				return basicSetFocus(null, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS_REFERENCE:
				return basicSetFocusReference(null, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__MODE:
				return basicSetMode(null, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__ORDERED_BY:
				return basicSetOrderedBy(null, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_CLASSIFIER:
				return ((InternalEList<?>)getEntryClassifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_REFERENCE:
				return ((InternalEList<?>)getEntryReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_QUANTITY:
				return ((InternalEList<?>)getEntryQuantity()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__EMPTY_REASON:
				return basicSetEmptyReason(null, msgs);
			case FhirPackage.EVIDENCE_REPORT_SECTION__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EVIDENCE_REPORT_SECTION__TITLE:
				return getTitle();
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS:
				return getFocus();
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS_REFERENCE:
				return getFocusReference();
			case FhirPackage.EVIDENCE_REPORT_SECTION__AUTHOR:
				return getAuthor();
			case FhirPackage.EVIDENCE_REPORT_SECTION__TEXT:
				return getText();
			case FhirPackage.EVIDENCE_REPORT_SECTION__MODE:
				return getMode();
			case FhirPackage.EVIDENCE_REPORT_SECTION__ORDERED_BY:
				return getOrderedBy();
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_CLASSIFIER:
				return getEntryClassifier();
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_REFERENCE:
				return getEntryReference();
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_QUANTITY:
				return getEntryQuantity();
			case FhirPackage.EVIDENCE_REPORT_SECTION__EMPTY_REASON:
				return getEmptyReason();
			case FhirPackage.EVIDENCE_REPORT_SECTION__SECTION:
				return getSection();
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
			case FhirPackage.EVIDENCE_REPORT_SECTION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS:
				setFocus((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS_REFERENCE:
				setFocusReference((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__TEXT:
				setText((Narrative)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__MODE:
				setMode((ListMode)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ORDERED_BY:
				setOrderedBy((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_CLASSIFIER:
				getEntryClassifier().clear();
				getEntryClassifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_REFERENCE:
				getEntryReference().clear();
				getEntryReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_QUANTITY:
				getEntryQuantity().clear();
				getEntryQuantity().addAll((Collection<? extends Quantity>)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__EMPTY_REASON:
				setEmptyReason((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends EvidenceReportSection>)newValue);
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
			case FhirPackage.EVIDENCE_REPORT_SECTION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS:
				setFocus((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS_REFERENCE:
				setFocusReference((Reference)null);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__TEXT:
				setText((Narrative)null);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__MODE:
				setMode((ListMode)null);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ORDERED_BY:
				setOrderedBy((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_CLASSIFIER:
				getEntryClassifier().clear();
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_REFERENCE:
				getEntryReference().clear();
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_QUANTITY:
				getEntryQuantity().clear();
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__EMPTY_REASON:
				setEmptyReason((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_REPORT_SECTION__SECTION:
				getSection().clear();
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
			case FhirPackage.EVIDENCE_REPORT_SECTION__TITLE:
				return title != null;
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS:
				return focus != null;
			case FhirPackage.EVIDENCE_REPORT_SECTION__FOCUS_REFERENCE:
				return focusReference != null;
			case FhirPackage.EVIDENCE_REPORT_SECTION__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.EVIDENCE_REPORT_SECTION__TEXT:
				return text != null;
			case FhirPackage.EVIDENCE_REPORT_SECTION__MODE:
				return mode != null;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ORDERED_BY:
				return orderedBy != null;
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_CLASSIFIER:
				return entryClassifier != null && !entryClassifier.isEmpty();
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_REFERENCE:
				return entryReference != null && !entryReference.isEmpty();
			case FhirPackage.EVIDENCE_REPORT_SECTION__ENTRY_QUANTITY:
				return entryQuantity != null && !entryQuantity.isEmpty();
			case FhirPackage.EVIDENCE_REPORT_SECTION__EMPTY_REASON:
				return emptyReason != null;
			case FhirPackage.EVIDENCE_REPORT_SECTION__SECTION:
				return section != null && !section.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceReportSectionImpl
