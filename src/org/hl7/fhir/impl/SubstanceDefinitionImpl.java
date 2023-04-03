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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceDefinition;
import org.hl7.fhir.SubstanceDefinitionCharacterization;
import org.hl7.fhir.SubstanceDefinitionCode;
import org.hl7.fhir.SubstanceDefinitionMoiety;
import org.hl7.fhir.SubstanceDefinitionMolecularWeight;
import org.hl7.fhir.SubstanceDefinitionName;
import org.hl7.fhir.SubstanceDefinitionProperty;
import org.hl7.fhir.SubstanceDefinitionRelationship;
import org.hl7.fhir.SubstanceDefinitionSourceMaterial;
import org.hl7.fhir.SubstanceDefinitionStructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getMoiety <em>Moiety</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getCharacterization <em>Characterization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getReferenceInformation <em>Reference Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getNucleicAcid <em>Nucleic Acid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getPolymer <em>Polymer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getProtein <em>Protein</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionImpl#getSourceMaterial <em>Source Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionImpl extends DomainResourceImpl implements SubstanceDefinition {
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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

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
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classification;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept domain;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> grade;

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
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> informationSource;

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
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturer;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supplier;

	/**
	 * The cached value of the '{@link #getMoiety() <em>Moiety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoiety()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionMoiety> moiety;

	/**
	 * The cached value of the '{@link #getCharacterization() <em>Characterization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterization()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionCharacterization> characterization;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionProperty> property;

	/**
	 * The cached value of the '{@link #getReferenceInformation() <em>Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceInformation()
	 * @generated
	 * @ordered
	 */
	protected Reference referenceInformation;

	/**
	 * The cached value of the '{@link #getMolecularWeight() <em>Molecular Weight</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeight()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionMolecularWeight> molecularWeight;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected SubstanceDefinitionStructure structure;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionCode> code;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionName> name;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionRelationship> relationship;

	/**
	 * The cached value of the '{@link #getNucleicAcid() <em>Nucleic Acid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNucleicAcid()
	 * @generated
	 * @ordered
	 */
	protected Reference nucleicAcid;

	/**
	 * The cached value of the '{@link #getPolymer() <em>Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolymer()
	 * @generated
	 * @ordered
	 */
	protected Reference polymer;

	/**
	 * The cached value of the '{@link #getProtein() <em>Protein</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtein()
	 * @generated
	 * @ordered
	 */
	protected Reference protein;

	/**
	 * The cached value of the '{@link #getSourceMaterial() <em>Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMaterial()
	 * @generated
	 * @ordered
	 */
	protected SubstanceDefinitionSourceMaterial sourceMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SUBSTANCE_DEFINITION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_DEFINITION__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(CodeableConcept newDomain, NotificationChain msgs) {
		CodeableConcept oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(CodeableConcept newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getGrade() {
		if (grade == null) {
			grade = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_DEFINITION__GRADE);
		}
		return grade;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getInformationSource() {
		if (informationSource == null) {
			informationSource = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_DEFINITION__INFORMATION_SOURCE);
		}
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.SUBSTANCE_DEFINITION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_DEFINITION__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupplier() {
		if (supplier == null) {
			supplier = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_DEFINITION__SUPPLIER);
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionMoiety> getMoiety() {
		if (moiety == null) {
			moiety = new EObjectContainmentEList<SubstanceDefinitionMoiety>(SubstanceDefinitionMoiety.class, this, FhirPackage.SUBSTANCE_DEFINITION__MOIETY);
		}
		return moiety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionCharacterization> getCharacterization() {
		if (characterization == null) {
			characterization = new EObjectContainmentEList<SubstanceDefinitionCharacterization>(SubstanceDefinitionCharacterization.class, this, FhirPackage.SUBSTANCE_DEFINITION__CHARACTERIZATION);
		}
		return characterization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<SubstanceDefinitionProperty>(SubstanceDefinitionProperty.class, this, FhirPackage.SUBSTANCE_DEFINITION__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferenceInformation() {
		return referenceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceInformation(Reference newReferenceInformation, NotificationChain msgs) {
		Reference oldReferenceInformation = referenceInformation;
		referenceInformation = newReferenceInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION, oldReferenceInformation, newReferenceInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceInformation(Reference newReferenceInformation) {
		if (newReferenceInformation != referenceInformation) {
			NotificationChain msgs = null;
			if (referenceInformation != null)
				msgs = ((InternalEObject)referenceInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION, null, msgs);
			if (newReferenceInformation != null)
				msgs = ((InternalEObject)newReferenceInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION, null, msgs);
			msgs = basicSetReferenceInformation(newReferenceInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION, newReferenceInformation, newReferenceInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionMolecularWeight> getMolecularWeight() {
		if (molecularWeight == null) {
			molecularWeight = new EObjectContainmentEList<SubstanceDefinitionMolecularWeight>(SubstanceDefinitionMolecularWeight.class, this, FhirPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT);
		}
		return molecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionStructure getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(SubstanceDefinitionStructure newStructure, NotificationChain msgs) {
		SubstanceDefinitionStructure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(SubstanceDefinitionStructure newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionCode> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<SubstanceDefinitionCode>(SubstanceDefinitionCode.class, this, FhirPackage.SUBSTANCE_DEFINITION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionName> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<SubstanceDefinitionName>(SubstanceDefinitionName.class, this, FhirPackage.SUBSTANCE_DEFINITION__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionRelationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<SubstanceDefinitionRelationship>(SubstanceDefinitionRelationship.class, this, FhirPackage.SUBSTANCE_DEFINITION__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getNucleicAcid() {
		return nucleicAcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNucleicAcid(Reference newNucleicAcid, NotificationChain msgs) {
		Reference oldNucleicAcid = nucleicAcid;
		nucleicAcid = newNucleicAcid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID, oldNucleicAcid, newNucleicAcid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNucleicAcid(Reference newNucleicAcid) {
		if (newNucleicAcid != nucleicAcid) {
			NotificationChain msgs = null;
			if (nucleicAcid != null)
				msgs = ((InternalEObject)nucleicAcid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID, null, msgs);
			if (newNucleicAcid != null)
				msgs = ((InternalEObject)newNucleicAcid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID, null, msgs);
			msgs = basicSetNucleicAcid(newNucleicAcid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID, newNucleicAcid, newNucleicAcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPolymer() {
		return polymer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolymer(Reference newPolymer, NotificationChain msgs) {
		Reference oldPolymer = polymer;
		polymer = newPolymer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__POLYMER, oldPolymer, newPolymer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolymer(Reference newPolymer) {
		if (newPolymer != polymer) {
			NotificationChain msgs = null;
			if (polymer != null)
				msgs = ((InternalEObject)polymer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__POLYMER, null, msgs);
			if (newPolymer != null)
				msgs = ((InternalEObject)newPolymer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__POLYMER, null, msgs);
			msgs = basicSetPolymer(newPolymer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__POLYMER, newPolymer, newPolymer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProtein() {
		return protein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtein(Reference newProtein, NotificationChain msgs) {
		Reference oldProtein = protein;
		protein = newProtein;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__PROTEIN, oldProtein, newProtein);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtein(Reference newProtein) {
		if (newProtein != protein) {
			NotificationChain msgs = null;
			if (protein != null)
				msgs = ((InternalEObject)protein).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__PROTEIN, null, msgs);
			if (newProtein != null)
				msgs = ((InternalEObject)newProtein).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__PROTEIN, null, msgs);
			msgs = basicSetProtein(newProtein, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__PROTEIN, newProtein, newProtein));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionSourceMaterial getSourceMaterial() {
		return sourceMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMaterial(SubstanceDefinitionSourceMaterial newSourceMaterial, NotificationChain msgs) {
		SubstanceDefinitionSourceMaterial oldSourceMaterial = sourceMaterial;
		sourceMaterial = newSourceMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL, oldSourceMaterial, newSourceMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMaterial(SubstanceDefinitionSourceMaterial newSourceMaterial) {
		if (newSourceMaterial != sourceMaterial) {
			NotificationChain msgs = null;
			if (sourceMaterial != null)
				msgs = ((InternalEObject)sourceMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL, null, msgs);
			if (newSourceMaterial != null)
				msgs = ((InternalEObject)newSourceMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL, null, msgs);
			msgs = basicSetSourceMaterial(newSourceMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL, newSourceMaterial, newSourceMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__DOMAIN:
				return basicSetDomain(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__GRADE:
				return ((InternalEList<?>)getGrade()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__INFORMATION_SOURCE:
				return ((InternalEList<?>)getInformationSource()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__SUPPLIER:
				return ((InternalEList<?>)getSupplier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__MOIETY:
				return ((InternalEList<?>)getMoiety()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__CHARACTERIZATION:
				return ((InternalEList<?>)getCharacterization()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				return basicSetReferenceInformation(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				return ((InternalEList<?>)getMolecularWeight()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				return basicSetStructure(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				return basicSetNucleicAcid(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__POLYMER:
				return basicSetPolymer(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__PROTEIN:
				return basicSetProtein(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				return basicSetSourceMaterial(null, msgs);
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
			case FhirPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUBSTANCE_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.SUBSTANCE_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.SUBSTANCE_DEFINITION__CLASSIFICATION:
				return getClassification();
			case FhirPackage.SUBSTANCE_DEFINITION__DOMAIN:
				return getDomain();
			case FhirPackage.SUBSTANCE_DEFINITION__GRADE:
				return getGrade();
			case FhirPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.SUBSTANCE_DEFINITION__INFORMATION_SOURCE:
				return getInformationSource();
			case FhirPackage.SUBSTANCE_DEFINITION__NOTE:
				return getNote();
			case FhirPackage.SUBSTANCE_DEFINITION__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.SUBSTANCE_DEFINITION__SUPPLIER:
				return getSupplier();
			case FhirPackage.SUBSTANCE_DEFINITION__MOIETY:
				return getMoiety();
			case FhirPackage.SUBSTANCE_DEFINITION__CHARACTERIZATION:
				return getCharacterization();
			case FhirPackage.SUBSTANCE_DEFINITION__PROPERTY:
				return getProperty();
			case FhirPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				return getReferenceInformation();
			case FhirPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				return getMolecularWeight();
			case FhirPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				return getStructure();
			case FhirPackage.SUBSTANCE_DEFINITION__CODE:
				return getCode();
			case FhirPackage.SUBSTANCE_DEFINITION__NAME:
				return getName();
			case FhirPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				return getNucleicAcid();
			case FhirPackage.SUBSTANCE_DEFINITION__POLYMER:
				return getPolymer();
			case FhirPackage.SUBSTANCE_DEFINITION__PROTEIN:
				return getProtein();
			case FhirPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				return getSourceMaterial();
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
			case FhirPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__DOMAIN:
				setDomain((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__GRADE:
				getGrade().clear();
				getGrade().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__INFORMATION_SOURCE:
				getInformationSource().clear();
				getInformationSource().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__SUPPLIER:
				getSupplier().clear();
				getSupplier().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__MOIETY:
				getMoiety().clear();
				getMoiety().addAll((Collection<? extends SubstanceDefinitionMoiety>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__CHARACTERIZATION:
				getCharacterization().clear();
				getCharacterization().addAll((Collection<? extends SubstanceDefinitionCharacterization>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends SubstanceDefinitionProperty>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				setReferenceInformation((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				getMolecularWeight().clear();
				getMolecularWeight().addAll((Collection<? extends SubstanceDefinitionMolecularWeight>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				setStructure((SubstanceDefinitionStructure)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends SubstanceDefinitionCode>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__NAME:
				getName().clear();
				getName().addAll((Collection<? extends SubstanceDefinitionName>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends SubstanceDefinitionRelationship>)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				setNucleicAcid((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__POLYMER:
				setPolymer((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__PROTEIN:
				setProtein((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				setSourceMaterial((SubstanceDefinitionSourceMaterial)newValue);
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
			case FhirPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__DOMAIN:
				setDomain((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__GRADE:
				getGrade().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__INFORMATION_SOURCE:
				getInformationSource().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__NOTE:
				getNote().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__SUPPLIER:
				getSupplier().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__MOIETY:
				getMoiety().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__CHARACTERIZATION:
				getCharacterization().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				setReferenceInformation((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				getMolecularWeight().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				setStructure((SubstanceDefinitionStructure)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__CODE:
				getCode().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__NAME:
				getName().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				getRelationship().clear();
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				setNucleicAcid((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__POLYMER:
				setPolymer((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__PROTEIN:
				setProtein((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				setSourceMaterial((SubstanceDefinitionSourceMaterial)null);
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
			case FhirPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__VERSION:
				return version != null;
			case FhirPackage.SUBSTANCE_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.SUBSTANCE_DEFINITION__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__DOMAIN:
				return domain != null;
			case FhirPackage.SUBSTANCE_DEFINITION__GRADE:
				return grade != null && !grade.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.SUBSTANCE_DEFINITION__INFORMATION_SOURCE:
				return informationSource != null && !informationSource.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__SUPPLIER:
				return supplier != null && !supplier.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__MOIETY:
				return moiety != null && !moiety.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__CHARACTERIZATION:
				return characterization != null && !characterization.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				return referenceInformation != null;
			case FhirPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				return molecularWeight != null && !molecularWeight.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				return structure != null;
			case FhirPackage.SUBSTANCE_DEFINITION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__NAME:
				return name != null && !name.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case FhirPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				return nucleicAcid != null;
			case FhirPackage.SUBSTANCE_DEFINITION__POLYMER:
				return polymer != null;
			case FhirPackage.SUBSTANCE_DEFINITION__PROTEIN:
				return protein != null;
			case FhirPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				return sourceMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionImpl
