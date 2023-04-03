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

import org.hl7.fhir.CitationContributionInstance;
import org.hl7.fhir.CitationEntry;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getForenameInitials <em>Forename Initials</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getContributionType <em>Contribution Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getContributionInstance <em>Contribution Instance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getCorrespondingContact <em>Corresponding Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getRankingOrder <em>Ranking Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationEntryImpl extends BackboneElementImpl implements CitationEntry {
	/**
	 * The cached value of the '{@link #getContributor() <em>Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributor()
	 * @generated
	 * @ordered
	 */
	protected Reference contributor;

	/**
	 * The cached value of the '{@link #getForenameInitials() <em>Forename Initials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForenameInitials()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String forenameInitials;

	/**
	 * The cached value of the '{@link #getAffiliation() <em>Affiliation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> affiliation;

	/**
	 * The cached value of the '{@link #getContributionType() <em>Contribution Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> contributionType;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getContributionInstance() <em>Contribution Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationContributionInstance> contributionInstance;

	/**
	 * The cached value of the '{@link #getCorrespondingContact() <em>Corresponding Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingContact()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean correspondingContact;

	/**
	 * The cached value of the '{@link #getRankingOrder() <em>Ranking Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankingOrder()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt rankingOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContributor() {
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributor(Reference newContributor, NotificationChain msgs) {
		Reference oldContributor = contributor;
		contributor = newContributor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__CONTRIBUTOR, oldContributor, newContributor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributor(Reference newContributor) {
		if (newContributor != contributor) {
			NotificationChain msgs = null;
			if (contributor != null)
				msgs = ((InternalEObject)contributor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__CONTRIBUTOR, null, msgs);
			if (newContributor != null)
				msgs = ((InternalEObject)newContributor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__CONTRIBUTOR, null, msgs);
			msgs = basicSetContributor(newContributor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__CONTRIBUTOR, newContributor, newContributor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getForenameInitials() {
		return forenameInitials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForenameInitials(org.hl7.fhir.String newForenameInitials, NotificationChain msgs) {
		org.hl7.fhir.String oldForenameInitials = forenameInitials;
		forenameInitials = newForenameInitials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__FORENAME_INITIALS, oldForenameInitials, newForenameInitials);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForenameInitials(org.hl7.fhir.String newForenameInitials) {
		if (newForenameInitials != forenameInitials) {
			NotificationChain msgs = null;
			if (forenameInitials != null)
				msgs = ((InternalEObject)forenameInitials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__FORENAME_INITIALS, null, msgs);
			if (newForenameInitials != null)
				msgs = ((InternalEObject)newForenameInitials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__FORENAME_INITIALS, null, msgs);
			msgs = basicSetForenameInitials(newForenameInitials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__FORENAME_INITIALS, newForenameInitials, newForenameInitials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAffiliation() {
		if (affiliation == null) {
			affiliation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CITATION_ENTRY__AFFILIATION);
		}
		return affiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getContributionType() {
		if (contributionType == null) {
			contributionType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE);
		}
		return contributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CitationContributionInstance> getContributionInstance() {
		if (contributionInstance == null) {
			contributionInstance = new EObjectContainmentEList<CitationContributionInstance>(CitationContributionInstance.class, this, FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE);
		}
		return contributionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getCorrespondingContact() {
		return correspondingContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondingContact(org.hl7.fhir.Boolean newCorrespondingContact, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldCorrespondingContact = correspondingContact;
		correspondingContact = newCorrespondingContact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT, oldCorrespondingContact, newCorrespondingContact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingContact(org.hl7.fhir.Boolean newCorrespondingContact) {
		if (newCorrespondingContact != correspondingContact) {
			NotificationChain msgs = null;
			if (correspondingContact != null)
				msgs = ((InternalEObject)correspondingContact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT, null, msgs);
			if (newCorrespondingContact != null)
				msgs = ((InternalEObject)newCorrespondingContact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT, null, msgs);
			msgs = basicSetCorrespondingContact(newCorrespondingContact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT, newCorrespondingContact, newCorrespondingContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getRankingOrder() {
		return rankingOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRankingOrder(PositiveInt newRankingOrder, NotificationChain msgs) {
		PositiveInt oldRankingOrder = rankingOrder;
		rankingOrder = newRankingOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__RANKING_ORDER, oldRankingOrder, newRankingOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRankingOrder(PositiveInt newRankingOrder) {
		if (newRankingOrder != rankingOrder) {
			NotificationChain msgs = null;
			if (rankingOrder != null)
				msgs = ((InternalEObject)rankingOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__RANKING_ORDER, null, msgs);
			if (newRankingOrder != null)
				msgs = ((InternalEObject)newRankingOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__RANKING_ORDER, null, msgs);
			msgs = basicSetRankingOrder(newRankingOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__RANKING_ORDER, newRankingOrder, newRankingOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_ENTRY__CONTRIBUTOR:
				return basicSetContributor(null, msgs);
			case FhirPackage.CITATION_ENTRY__FORENAME_INITIALS:
				return basicSetForenameInitials(null, msgs);
			case FhirPackage.CITATION_ENTRY__AFFILIATION:
				return ((InternalEList<?>)getAffiliation()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				return ((InternalEList<?>)getContributionType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_ENTRY__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				return ((InternalEList<?>)getContributionInstance()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				return basicSetCorrespondingContact(null, msgs);
			case FhirPackage.CITATION_ENTRY__RANKING_ORDER:
				return basicSetRankingOrder(null, msgs);
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
			case FhirPackage.CITATION_ENTRY__CONTRIBUTOR:
				return getContributor();
			case FhirPackage.CITATION_ENTRY__FORENAME_INITIALS:
				return getForenameInitials();
			case FhirPackage.CITATION_ENTRY__AFFILIATION:
				return getAffiliation();
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				return getContributionType();
			case FhirPackage.CITATION_ENTRY__ROLE:
				return getRole();
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				return getContributionInstance();
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				return getCorrespondingContact();
			case FhirPackage.CITATION_ENTRY__RANKING_ORDER:
				return getRankingOrder();
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
			case FhirPackage.CITATION_ENTRY__CONTRIBUTOR:
				setContributor((Reference)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__FORENAME_INITIALS:
				setForenameInitials((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__AFFILIATION:
				getAffiliation().clear();
				getAffiliation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				getContributionType().clear();
				getContributionType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				getContributionInstance().clear();
				getContributionInstance().addAll((Collection<? extends CitationContributionInstance>)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				setCorrespondingContact((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__RANKING_ORDER:
				setRankingOrder((PositiveInt)newValue);
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
			case FhirPackage.CITATION_ENTRY__CONTRIBUTOR:
				setContributor((Reference)null);
				return;
			case FhirPackage.CITATION_ENTRY__FORENAME_INITIALS:
				setForenameInitials((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_ENTRY__AFFILIATION:
				getAffiliation().clear();
				return;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				getContributionType().clear();
				return;
			case FhirPackage.CITATION_ENTRY__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				getContributionInstance().clear();
				return;
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				setCorrespondingContact((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CITATION_ENTRY__RANKING_ORDER:
				setRankingOrder((PositiveInt)null);
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
			case FhirPackage.CITATION_ENTRY__CONTRIBUTOR:
				return contributor != null;
			case FhirPackage.CITATION_ENTRY__FORENAME_INITIALS:
				return forenameInitials != null;
			case FhirPackage.CITATION_ENTRY__AFFILIATION:
				return affiliation != null && !affiliation.isEmpty();
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				return contributionType != null && !contributionType.isEmpty();
			case FhirPackage.CITATION_ENTRY__ROLE:
				return role != null;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				return contributionInstance != null && !contributionInstance.isEmpty();
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				return correspondingContact != null;
			case FhirPackage.CITATION_ENTRY__RANKING_ORDER:
				return rankingOrder != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationEntryImpl
