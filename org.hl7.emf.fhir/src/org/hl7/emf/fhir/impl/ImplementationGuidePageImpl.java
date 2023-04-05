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

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.GuidePageGeneration;
import org.hl7.emf.fhir.ImplementationGuidePage;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuidePageImpl#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuidePageImpl#getSourceString <em>Source String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuidePageImpl#getSourceMarkdown <em>Source Markdown</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuidePageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuidePageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuidePageImpl#getGeneration <em>Generation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImplementationGuidePageImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuidePageImpl extends BackboneElementImpl implements ImplementationGuidePage {
	/**
	 * The cached value of the '{@link #getSourceUrl() <em>Source Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUrl()
	 * @generated
	 * @ordered
	 */
	protected Url sourceUrl;

	/**
	 * The cached value of the '{@link #getSourceString() <em>Source String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String sourceString;

	/**
	 * The cached value of the '{@link #getSourceMarkdown() <em>Source Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown sourceMarkdown;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Url name;

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
	 * The cached value of the '{@link #getGeneration() <em>Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration()
	 * @generated
	 * @ordered
	 */
	protected GuidePageGeneration generation;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuidePage> page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuidePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuidePage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getSourceUrl() {
		return sourceUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceUrl(Url newSourceUrl, NotificationChain msgs) {
		Url oldSourceUrl = sourceUrl;
		sourceUrl = newSourceUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_URL, oldSourceUrl, newSourceUrl);
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
	public void setSourceUrl(Url newSourceUrl) {
		if (newSourceUrl != sourceUrl) {
			NotificationChain msgs = null;
			if (sourceUrl != null)
				msgs = ((InternalEObject)sourceUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_URL, null, msgs);
			if (newSourceUrl != null)
				msgs = ((InternalEObject)newSourceUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_URL, null, msgs);
			msgs = basicSetSourceUrl(newSourceUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_URL, newSourceUrl, newSourceUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getSourceString() {
		return sourceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceString(org.hl7.emf.fhir.String newSourceString, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldSourceString = sourceString;
		sourceString = newSourceString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_STRING, oldSourceString, newSourceString);
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
	public void setSourceString(org.hl7.emf.fhir.String newSourceString) {
		if (newSourceString != sourceString) {
			NotificationChain msgs = null;
			if (sourceString != null)
				msgs = ((InternalEObject)sourceString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_STRING, null, msgs);
			if (newSourceString != null)
				msgs = ((InternalEObject)newSourceString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_STRING, null, msgs);
			msgs = basicSetSourceString(newSourceString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_STRING, newSourceString, newSourceString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getSourceMarkdown() {
		return sourceMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMarkdown(Markdown newSourceMarkdown, NotificationChain msgs) {
		Markdown oldSourceMarkdown = sourceMarkdown;
		sourceMarkdown = newSourceMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_MARKDOWN, oldSourceMarkdown, newSourceMarkdown);
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
	public void setSourceMarkdown(Markdown newSourceMarkdown) {
		if (newSourceMarkdown != sourceMarkdown) {
			NotificationChain msgs = null;
			if (sourceMarkdown != null)
				msgs = ((InternalEObject)sourceMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_MARKDOWN, null, msgs);
			if (newSourceMarkdown != null)
				msgs = ((InternalEObject)newSourceMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_MARKDOWN, null, msgs);
			msgs = basicSetSourceMarkdown(newSourceMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_MARKDOWN, newSourceMarkdown, newSourceMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Url newName, NotificationChain msgs) {
		Url oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME, oldName, newName);
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
	public void setName(Url newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuidePageGeneration getGeneration() {
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneration(GuidePageGeneration newGeneration, NotificationChain msgs) {
		GuidePageGeneration oldGeneration = generation;
		generation = newGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION, oldGeneration, newGeneration);
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
	public void setGeneration(GuidePageGeneration newGeneration) {
		if (newGeneration != generation) {
			NotificationChain msgs = null;
			if (generation != null)
				msgs = ((InternalEObject)generation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION, null, msgs);
			if (newGeneration != null)
				msgs = ((InternalEObject)newGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION, null, msgs);
			msgs = basicSetGeneration(newGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION, newGeneration, newGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationGuidePage> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<ImplementationGuidePage>(ImplementationGuidePage.class, this, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_URL:
				return basicSetSourceUrl(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_STRING:
				return basicSetSourceString(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_MARKDOWN:
				return basicSetSourceMarkdown(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				return basicSetGeneration(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_URL:
				return getSourceUrl();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_STRING:
				return getSourceString();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_MARKDOWN:
				return getSourceMarkdown();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME:
				return getName();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				return getTitle();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				return getGeneration();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				return getPage();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_URL:
				setSourceUrl((Url)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_STRING:
				setSourceString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_MARKDOWN:
				setSourceMarkdown((Markdown)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME:
				setName((Url)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				setTitle((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				setGeneration((GuidePageGeneration)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends ImplementationGuidePage>)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_URL:
				setSourceUrl((Url)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_STRING:
				setSourceString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_MARKDOWN:
				setSourceMarkdown((Markdown)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME:
				setName((Url)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				setTitle((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				setGeneration((GuidePageGeneration)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				getPage().clear();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_URL:
				return sourceUrl != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_STRING:
				return sourceString != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE_MARKDOWN:
				return sourceMarkdown != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME:
				return name != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				return title != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				return generation != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				return page != null && !page.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuidePageImpl
