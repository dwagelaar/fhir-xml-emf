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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ExampleScenarioContainedInstance;
import org.hl7.fhir.ExampleScenarioInstance;
import org.hl7.fhir.ExampleScenarioVersion;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getStructureVersion <em>Structure Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getStructureProfileCanonical <em>Structure Profile Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getStructureProfileUri <em>Structure Profile Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getContainedInstance <em>Contained Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioInstanceImpl extends BackboneElementImpl implements ExampleScenarioInstance {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String key;

	/**
	 * The cached value of the '{@link #getStructureType() <em>Structure Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected Coding structureType;

	/**
	 * The cached value of the '{@link #getStructureVersion() <em>Structure Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String structureVersion;

	/**
	 * The cached value of the '{@link #getStructureProfileCanonical() <em>Structure Profile Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureProfileCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical structureProfileCanonical;

	/**
	 * The cached value of the '{@link #getStructureProfileUri() <em>Structure Profile Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureProfileUri()
	 * @generated
	 * @ordered
	 */
	protected Uri structureProfileUri;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Reference content;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleScenarioVersion> version;

	/**
	 * The cached value of the '{@link #getContainedInstance() <em>Contained Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleScenarioContainedInstance> containedInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(org.hl7.fhir.String newKey, NotificationChain msgs) {
		org.hl7.fhir.String oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(org.hl7.fhir.String newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getStructureType() {
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureType(Coding newStructureType, NotificationChain msgs) {
		Coding oldStructureType = structureType;
		structureType = newStructureType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_TYPE, oldStructureType, newStructureType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureType(Coding newStructureType) {
		if (newStructureType != structureType) {
			NotificationChain msgs = null;
			if (structureType != null)
				msgs = ((InternalEObject)structureType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_TYPE, null, msgs);
			if (newStructureType != null)
				msgs = ((InternalEObject)newStructureType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_TYPE, null, msgs);
			msgs = basicSetStructureType(newStructureType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_TYPE, newStructureType, newStructureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getStructureVersion() {
		return structureVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureVersion(org.hl7.fhir.String newStructureVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldStructureVersion = structureVersion;
		structureVersion = newStructureVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_VERSION, oldStructureVersion, newStructureVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureVersion(org.hl7.fhir.String newStructureVersion) {
		if (newStructureVersion != structureVersion) {
			NotificationChain msgs = null;
			if (structureVersion != null)
				msgs = ((InternalEObject)structureVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_VERSION, null, msgs);
			if (newStructureVersion != null)
				msgs = ((InternalEObject)newStructureVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_VERSION, null, msgs);
			msgs = basicSetStructureVersion(newStructureVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_VERSION, newStructureVersion, newStructureVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getStructureProfileCanonical() {
		return structureProfileCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureProfileCanonical(Canonical newStructureProfileCanonical, NotificationChain msgs) {
		Canonical oldStructureProfileCanonical = structureProfileCanonical;
		structureProfileCanonical = newStructureProfileCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_CANONICAL, oldStructureProfileCanonical, newStructureProfileCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureProfileCanonical(Canonical newStructureProfileCanonical) {
		if (newStructureProfileCanonical != structureProfileCanonical) {
			NotificationChain msgs = null;
			if (structureProfileCanonical != null)
				msgs = ((InternalEObject)structureProfileCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_CANONICAL, null, msgs);
			if (newStructureProfileCanonical != null)
				msgs = ((InternalEObject)newStructureProfileCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_CANONICAL, null, msgs);
			msgs = basicSetStructureProfileCanonical(newStructureProfileCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_CANONICAL, newStructureProfileCanonical, newStructureProfileCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getStructureProfileUri() {
		return structureProfileUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureProfileUri(Uri newStructureProfileUri, NotificationChain msgs) {
		Uri oldStructureProfileUri = structureProfileUri;
		structureProfileUri = newStructureProfileUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_URI, oldStructureProfileUri, newStructureProfileUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureProfileUri(Uri newStructureProfileUri) {
		if (newStructureProfileUri != structureProfileUri) {
			NotificationChain msgs = null;
			if (structureProfileUri != null)
				msgs = ((InternalEObject)structureProfileUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_URI, null, msgs);
			if (newStructureProfileUri != null)
				msgs = ((InternalEObject)newStructureProfileUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_URI, null, msgs);
			msgs = basicSetStructureProfileUri(newStructureProfileUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_URI, newStructureProfileUri, newStructureProfileUri));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Reference newContent, NotificationChain msgs) {
		Reference oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Reference newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExampleScenarioVersion> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<ExampleScenarioVersion>(ExampleScenarioVersion.class, this, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExampleScenarioContainedInstance> getContainedInstance() {
		if (containedInstance == null) {
			containedInstance = new EObjectContainmentEList<ExampleScenarioContainedInstance>(ExampleScenarioContainedInstance.class, this, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE);
		}
		return containedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__KEY:
				return basicSetKey(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_TYPE:
				return basicSetStructureType(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_VERSION:
				return basicSetStructureVersion(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_CANONICAL:
				return basicSetStructureProfileCanonical(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_URI:
				return basicSetStructureProfileUri(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTENT:
				return basicSetContent(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				return ((InternalEList<?>)getContainedInstance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__KEY:
				return getKey();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_TYPE:
				return getStructureType();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_VERSION:
				return getStructureVersion();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_CANONICAL:
				return getStructureProfileCanonical();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_URI:
				return getStructureProfileUri();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__TITLE:
				return getTitle();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTENT:
				return getContent();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				return getVersion();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				return getContainedInstance();
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
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__KEY:
				setKey((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_TYPE:
				setStructureType((Coding)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_VERSION:
				setStructureVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_CANONICAL:
				setStructureProfileCanonical((Canonical)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_URI:
				setStructureProfileUri((Uri)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTENT:
				setContent((Reference)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends ExampleScenarioVersion>)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				getContainedInstance().clear();
				getContainedInstance().addAll((Collection<? extends ExampleScenarioContainedInstance>)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__KEY:
				setKey((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_TYPE:
				setStructureType((Coding)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_VERSION:
				setStructureVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_CANONICAL:
				setStructureProfileCanonical((Canonical)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_URI:
				setStructureProfileUri((Uri)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTENT:
				setContent((Reference)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				getVersion().clear();
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				getContainedInstance().clear();
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
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__KEY:
				return key != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_TYPE:
				return structureType != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_VERSION:
				return structureVersion != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_CANONICAL:
				return structureProfileCanonical != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__STRUCTURE_PROFILE_URI:
				return structureProfileUri != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__TITLE:
				return title != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				return description != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTENT:
				return content != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				return version != null && !version.isEmpty();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				return containedInstance != null && !containedInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioInstanceImpl
