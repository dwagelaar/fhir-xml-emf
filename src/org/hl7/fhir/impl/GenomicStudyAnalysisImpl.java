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
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GenomicStudyAnalysis;
import org.hl7.fhir.GenomicStudyDevice;
import org.hl7.fhir.GenomicStudyInput;
import org.hl7.fhir.GenomicStudyOutput;
import org.hl7.fhir.GenomicStudyPerformer;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genomic Study Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getGenomeBuild <em>Genome Build</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getProtocolPerformed <em>Protocol Performed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getRegionsStudied <em>Regions Studied</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getRegionsCalled <em>Regions Called</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GenomicStudyAnalysisImpl#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenomicStudyAnalysisImpl extends BackboneElementImpl implements GenomicStudyAnalysis {
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
	 * The cached value of the '{@link #getMethodType() <em>Method Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> methodType;

	/**
	 * The cached value of the '{@link #getChangeType() <em>Change Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> changeType;

	/**
	 * The cached value of the '{@link #getGenomeBuild() <em>Genome Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomeBuild()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept genomeBuild;

	/**
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesUri() <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUri()
	 * @generated
	 * @ordered
	 */
	protected Uri instantiatesUri;

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
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> focus;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimen;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getProtocolPerformed() <em>Protocol Performed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolPerformed()
	 * @generated
	 * @ordered
	 */
	protected Reference protocolPerformed;

	/**
	 * The cached value of the '{@link #getRegionsStudied() <em>Regions Studied</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionsStudied()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> regionsStudied;

	/**
	 * The cached value of the '{@link #getRegionsCalled() <em>Regions Called</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionsCalled()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> regionsCalled;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<GenomicStudyInput> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<GenomicStudyOutput> output;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<GenomicStudyPerformer> performer;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<GenomicStudyDevice> device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenomicStudyAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGenomicStudyAnalysis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getMethodType() {
		if (methodType == null) {
			methodType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__METHOD_TYPE);
		}
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getChangeType() {
		if (changeType == null) {
			changeType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__CHANGE_TYPE);
		}
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGenomeBuild() {
		return genomeBuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenomeBuild(CodeableConcept newGenomeBuild, NotificationChain msgs) {
		CodeableConcept oldGenomeBuild = genomeBuild;
		genomeBuild = newGenomeBuild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__GENOME_BUILD, oldGenomeBuild, newGenomeBuild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenomeBuild(CodeableConcept newGenomeBuild) {
		if (newGenomeBuild != genomeBuild) {
			NotificationChain msgs = null;
			if (genomeBuild != null)
				msgs = ((InternalEObject)genomeBuild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__GENOME_BUILD, null, msgs);
			if (newGenomeBuild != null)
				msgs = ((InternalEObject)newGenomeBuild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__GENOME_BUILD, null, msgs);
			msgs = basicSetGenomeBuild(newGenomeBuild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__GENOME_BUILD, newGenomeBuild, newGenomeBuild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getInstantiatesCanonical() {
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesCanonical(Canonical newInstantiatesCanonical, NotificationChain msgs) {
		Canonical oldInstantiatesCanonical = instantiatesCanonical;
		instantiatesCanonical = newInstantiatesCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_CANONICAL, oldInstantiatesCanonical, newInstantiatesCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatesCanonical(Canonical newInstantiatesCanonical) {
		if (newInstantiatesCanonical != instantiatesCanonical) {
			NotificationChain msgs = null;
			if (instantiatesCanonical != null)
				msgs = ((InternalEObject)instantiatesCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_CANONICAL, null, msgs);
			if (newInstantiatesCanonical != null)
				msgs = ((InternalEObject)newInstantiatesCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_CANONICAL, null, msgs);
			msgs = basicSetInstantiatesCanonical(newInstantiatesCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_CANONICAL, newInstantiatesCanonical, newInstantiatesCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getInstantiatesUri() {
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesUri(Uri newInstantiatesUri, NotificationChain msgs) {
		Uri oldInstantiatesUri = instantiatesUri;
		instantiatesUri = newInstantiatesUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_URI, oldInstantiatesUri, newInstantiatesUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatesUri(Uri newInstantiatesUri) {
		if (newInstantiatesUri != instantiatesUri) {
			NotificationChain msgs = null;
			if (instantiatesUri != null)
				msgs = ((InternalEObject)instantiatesUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_URI, null, msgs);
			if (newInstantiatesUri != null)
				msgs = ((InternalEObject)newInstantiatesUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_URI, null, msgs);
			msgs = basicSetInstantiatesUri(newInstantiatesUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_URI, newInstantiatesUri, newInstantiatesUri));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getFocus() {
		if (focus == null) {
			focus = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__FOCUS);
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProtocolPerformed() {
		return protocolPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocolPerformed(Reference newProtocolPerformed, NotificationChain msgs) {
		Reference oldProtocolPerformed = protocolPerformed;
		protocolPerformed = newProtocolPerformed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__PROTOCOL_PERFORMED, oldProtocolPerformed, newProtocolPerformed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolPerformed(Reference newProtocolPerformed) {
		if (newProtocolPerformed != protocolPerformed) {
			NotificationChain msgs = null;
			if (protocolPerformed != null)
				msgs = ((InternalEObject)protocolPerformed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__PROTOCOL_PERFORMED, null, msgs);
			if (newProtocolPerformed != null)
				msgs = ((InternalEObject)newProtocolPerformed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GENOMIC_STUDY_ANALYSIS__PROTOCOL_PERFORMED, null, msgs);
			msgs = basicSetProtocolPerformed(newProtocolPerformed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GENOMIC_STUDY_ANALYSIS__PROTOCOL_PERFORMED, newProtocolPerformed, newProtocolPerformed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRegionsStudied() {
		if (regionsStudied == null) {
			regionsStudied = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_STUDIED);
		}
		return regionsStudied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRegionsCalled() {
		if (regionsCalled == null) {
			regionsCalled = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_CALLED);
		}
		return regionsCalled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenomicStudyInput> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<GenomicStudyInput>(GenomicStudyInput.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenomicStudyOutput> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<GenomicStudyOutput>(GenomicStudyOutput.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenomicStudyPerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<GenomicStudyPerformer>(GenomicStudyPerformer.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenomicStudyDevice> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<GenomicStudyDevice>(GenomicStudyDevice.class, this, FhirPackage.GENOMIC_STUDY_ANALYSIS__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__METHOD_TYPE:
				return ((InternalEList<?>)getMethodType()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__CHANGE_TYPE:
				return ((InternalEList<?>)getChangeType()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__GENOME_BUILD:
				return basicSetGenomeBuild(null, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_CANONICAL:
				return basicSetInstantiatesCanonical(null, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_URI:
				return basicSetInstantiatesUri(null, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__FOCUS:
				return ((InternalEList<?>)getFocus()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PROTOCOL_PERFORMED:
				return basicSetProtocolPerformed(null, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_STUDIED:
				return ((InternalEList<?>)getRegionsStudied()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_CALLED:
				return ((InternalEList<?>)getRegionsCalled()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__METHOD_TYPE:
				return getMethodType();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__CHANGE_TYPE:
				return getChangeType();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__GENOME_BUILD:
				return getGenomeBuild();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__TITLE:
				return getTitle();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__FOCUS:
				return getFocus();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__SPECIMEN:
				return getSpecimen();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DATE:
				return getDate();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__NOTE:
				return getNote();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PROTOCOL_PERFORMED:
				return getProtocolPerformed();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_STUDIED:
				return getRegionsStudied();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_CALLED:
				return getRegionsCalled();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INPUT:
				return getInput();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__OUTPUT:
				return getOutput();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PERFORMER:
				return getPerformer();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DEVICE:
				return getDevice();
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
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__METHOD_TYPE:
				getMethodType().clear();
				getMethodType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__CHANGE_TYPE:
				getChangeType().clear();
				getChangeType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__GENOME_BUILD:
				setGenomeBuild((CodeableConcept)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Canonical)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_URI:
				setInstantiatesUri((Uri)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__FOCUS:
				getFocus().clear();
				getFocus().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PROTOCOL_PERFORMED:
				setProtocolPerformed((Reference)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_STUDIED:
				getRegionsStudied().clear();
				getRegionsStudied().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_CALLED:
				getRegionsCalled().clear();
				getRegionsCalled().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends GenomicStudyInput>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends GenomicStudyOutput>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends GenomicStudyPerformer>)newValue);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends GenomicStudyDevice>)newValue);
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
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__METHOD_TYPE:
				getMethodType().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__CHANGE_TYPE:
				getChangeType().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__GENOME_BUILD:
				setGenomeBuild((CodeableConcept)null);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Canonical)null);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_URI:
				setInstantiatesUri((Uri)null);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__FOCUS:
				getFocus().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__SPECIMEN:
				getSpecimen().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__NOTE:
				getNote().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PROTOCOL_PERFORMED:
				setProtocolPerformed((Reference)null);
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_STUDIED:
				getRegionsStudied().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_CALLED:
				getRegionsCalled().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INPUT:
				getInput().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__OUTPUT:
				getOutput().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DEVICE:
				getDevice().clear();
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
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__METHOD_TYPE:
				return methodType != null && !methodType.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__CHANGE_TYPE:
				return changeType != null && !changeType.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__GENOME_BUILD:
				return genomeBuild != null;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INSTANTIATES_URI:
				return instantiatesUri != null;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__TITLE:
				return title != null;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__FOCUS:
				return focus != null && !focus.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DATE:
				return date != null;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PROTOCOL_PERFORMED:
				return protocolPerformed != null;
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_STUDIED:
				return regionsStudied != null && !regionsStudied.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__REGIONS_CALLED:
				return regionsCalled != null && !regionsCalled.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__INPUT:
				return input != null && !input.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__OUTPUT:
				return output != null && !output.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS__DEVICE:
				return device != null && !device.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenomicStudyAnalysisImpl
