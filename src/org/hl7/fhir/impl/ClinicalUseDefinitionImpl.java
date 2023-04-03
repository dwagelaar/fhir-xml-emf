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
import org.hl7.fhir.ClinicalUseDefinition;
import org.hl7.fhir.ClinicalUseDefinitionContraindication;
import org.hl7.fhir.ClinicalUseDefinitionIndication;
import org.hl7.fhir.ClinicalUseDefinitionInteraction;
import org.hl7.fhir.ClinicalUseDefinitionType;
import org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect;
import org.hl7.fhir.ClinicalUseDefinitionWarning;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Use Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getUndesirableEffect <em>Undesirable Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionImpl#getWarning <em>Warning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalUseDefinitionImpl extends DomainResourceImpl implements ClinicalUseDefinition {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClinicalUseDefinitionType type;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subject;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getContraindication() <em>Contraindication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraindication()
	 * @generated
	 * @ordered
	 */
	protected ClinicalUseDefinitionContraindication contraindication;

	/**
	 * The cached value of the '{@link #getIndication() <em>Indication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication()
	 * @generated
	 * @ordered
	 */
	protected ClinicalUseDefinitionIndication indication;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected ClinicalUseDefinitionInteraction interaction;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> population;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> library;

	/**
	 * The cached value of the '{@link #getUndesirableEffect() <em>Undesirable Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndesirableEffect()
	 * @generated
	 * @ordered
	 */
	protected ClinicalUseDefinitionUndesirableEffect undesirableEffect;

	/**
	 * The cached value of the '{@link #getWarning() <em>Warning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarning()
	 * @generated
	 * @ordered
	 */
	protected ClinicalUseDefinitionWarning warning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalUseDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClinicalUseDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CLINICAL_USE_DEFINITION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ClinicalUseDefinitionType newType, NotificationChain msgs) {
		ClinicalUseDefinitionType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClinicalUseDefinitionType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLINICAL_USE_DEFINITION__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_USE_DEFINITION__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionContraindication getContraindication() {
		return contraindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContraindication(ClinicalUseDefinitionContraindication newContraindication, NotificationChain msgs) {
		ClinicalUseDefinitionContraindication oldContraindication = contraindication;
		contraindication = newContraindication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__CONTRAINDICATION, oldContraindication, newContraindication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraindication(ClinicalUseDefinitionContraindication newContraindication) {
		if (newContraindication != contraindication) {
			NotificationChain msgs = null;
			if (contraindication != null)
				msgs = ((InternalEObject)contraindication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__CONTRAINDICATION, null, msgs);
			if (newContraindication != null)
				msgs = ((InternalEObject)newContraindication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__CONTRAINDICATION, null, msgs);
			msgs = basicSetContraindication(newContraindication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__CONTRAINDICATION, newContraindication, newContraindication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionIndication getIndication() {
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndication(ClinicalUseDefinitionIndication newIndication, NotificationChain msgs) {
		ClinicalUseDefinitionIndication oldIndication = indication;
		indication = newIndication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__INDICATION, oldIndication, newIndication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndication(ClinicalUseDefinitionIndication newIndication) {
		if (newIndication != indication) {
			NotificationChain msgs = null;
			if (indication != null)
				msgs = ((InternalEObject)indication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__INDICATION, null, msgs);
			if (newIndication != null)
				msgs = ((InternalEObject)newIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__INDICATION, null, msgs);
			msgs = basicSetIndication(newIndication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__INDICATION, newIndication, newIndication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionInteraction getInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(ClinicalUseDefinitionInteraction newInteraction, NotificationChain msgs) {
		ClinicalUseDefinitionInteraction oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__INTERACTION, oldInteraction, newInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(ClinicalUseDefinitionInteraction newInteraction) {
		if (newInteraction != interaction) {
			NotificationChain msgs = null;
			if (interaction != null)
				msgs = ((InternalEObject)interaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__INTERACTION, null, msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__INTERACTION, null, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_USE_DEFINITION__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Canonical> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.CLINICAL_USE_DEFINITION__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionUndesirableEffect getUndesirableEffect() {
		return undesirableEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUndesirableEffect(ClinicalUseDefinitionUndesirableEffect newUndesirableEffect, NotificationChain msgs) {
		ClinicalUseDefinitionUndesirableEffect oldUndesirableEffect = undesirableEffect;
		undesirableEffect = newUndesirableEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__UNDESIRABLE_EFFECT, oldUndesirableEffect, newUndesirableEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndesirableEffect(ClinicalUseDefinitionUndesirableEffect newUndesirableEffect) {
		if (newUndesirableEffect != undesirableEffect) {
			NotificationChain msgs = null;
			if (undesirableEffect != null)
				msgs = ((InternalEObject)undesirableEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__UNDESIRABLE_EFFECT, null, msgs);
			if (newUndesirableEffect != null)
				msgs = ((InternalEObject)newUndesirableEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__UNDESIRABLE_EFFECT, null, msgs);
			msgs = basicSetUndesirableEffect(newUndesirableEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__UNDESIRABLE_EFFECT, newUndesirableEffect, newUndesirableEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionWarning getWarning() {
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarning(ClinicalUseDefinitionWarning newWarning, NotificationChain msgs) {
		ClinicalUseDefinitionWarning oldWarning = warning;
		warning = newWarning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__WARNING, oldWarning, newWarning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarning(ClinicalUseDefinitionWarning newWarning) {
		if (newWarning != warning) {
			NotificationChain msgs = null;
			if (warning != null)
				msgs = ((InternalEObject)warning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__WARNING, null, msgs);
			if (newWarning != null)
				msgs = ((InternalEObject)newWarning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION__WARNING, null, msgs);
			msgs = basicSetWarning(newWarning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION__WARNING, newWarning, newWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLINICAL_USE_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__CONTRAINDICATION:
				return basicSetContraindication(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__INDICATION:
				return basicSetIndication(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__INTERACTION:
				return basicSetInteraction(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__UNDESIRABLE_EFFECT:
				return basicSetUndesirableEffect(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION__WARNING:
				return basicSetWarning(null, msgs);
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
			case FhirPackage.CLINICAL_USE_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CLINICAL_USE_DEFINITION__TYPE:
				return getType();
			case FhirPackage.CLINICAL_USE_DEFINITION__CATEGORY:
				return getCategory();
			case FhirPackage.CLINICAL_USE_DEFINITION__SUBJECT:
				return getSubject();
			case FhirPackage.CLINICAL_USE_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.CLINICAL_USE_DEFINITION__CONTRAINDICATION:
				return getContraindication();
			case FhirPackage.CLINICAL_USE_DEFINITION__INDICATION:
				return getIndication();
			case FhirPackage.CLINICAL_USE_DEFINITION__INTERACTION:
				return getInteraction();
			case FhirPackage.CLINICAL_USE_DEFINITION__POPULATION:
				return getPopulation();
			case FhirPackage.CLINICAL_USE_DEFINITION__LIBRARY:
				return getLibrary();
			case FhirPackage.CLINICAL_USE_DEFINITION__UNDESIRABLE_EFFECT:
				return getUndesirableEffect();
			case FhirPackage.CLINICAL_USE_DEFINITION__WARNING:
				return getWarning();
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
			case FhirPackage.CLINICAL_USE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__TYPE:
				setType((ClinicalUseDefinitionType)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__CONTRAINDICATION:
				setContraindication((ClinicalUseDefinitionContraindication)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__INDICATION:
				setIndication((ClinicalUseDefinitionIndication)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__INTERACTION:
				setInteraction((ClinicalUseDefinitionInteraction)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__UNDESIRABLE_EFFECT:
				setUndesirableEffect((ClinicalUseDefinitionUndesirableEffect)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__WARNING:
				setWarning((ClinicalUseDefinitionWarning)newValue);
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
			case FhirPackage.CLINICAL_USE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__TYPE:
				setType((ClinicalUseDefinitionType)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__CONTRAINDICATION:
				setContraindication((ClinicalUseDefinitionContraindication)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__INDICATION:
				setIndication((ClinicalUseDefinitionIndication)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__INTERACTION:
				setInteraction((ClinicalUseDefinitionInteraction)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__POPULATION:
				getPopulation().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__LIBRARY:
				getLibrary().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__UNDESIRABLE_EFFECT:
				setUndesirableEffect((ClinicalUseDefinitionUndesirableEffect)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION__WARNING:
				setWarning((ClinicalUseDefinitionWarning)null);
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
			case FhirPackage.CLINICAL_USE_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION__TYPE:
				return type != null;
			case FhirPackage.CLINICAL_USE_DEFINITION__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.CLINICAL_USE_DEFINITION__CONTRAINDICATION:
				return contraindication != null;
			case FhirPackage.CLINICAL_USE_DEFINITION__INDICATION:
				return indication != null;
			case FhirPackage.CLINICAL_USE_DEFINITION__INTERACTION:
				return interaction != null;
			case FhirPackage.CLINICAL_USE_DEFINITION__POPULATION:
				return population != null && !population.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION__LIBRARY:
				return library != null && !library.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION__UNDESIRABLE_EFFECT:
				return undesirableEffect != null;
			case FhirPackage.CLINICAL_USE_DEFINITION__WARNING:
				return warning != null;
		}
		return super.eIsSet(featureID);
	}

} //ClinicalUseDefinitionImpl
