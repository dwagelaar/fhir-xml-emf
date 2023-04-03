/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MolecularSequenceStartingSequence;
import org.hl7.fhir.OrientationType;
import org.hl7.fhir.Reference;
import org.hl7.fhir.StrandType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Starting Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStartingSequenceImpl#getGenomeAssembly <em>Genome Assembly</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStartingSequenceImpl#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStartingSequenceImpl#getSequenceCodeableConcept <em>Sequence Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStartingSequenceImpl#getSequenceString <em>Sequence String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStartingSequenceImpl#getSequenceReference <em>Sequence Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStartingSequenceImpl#getWindowStart <em>Window Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStartingSequenceImpl#getWindowEnd <em>Window End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStartingSequenceImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStartingSequenceImpl#getStrand <em>Strand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceStartingSequenceImpl extends BackboneElementImpl implements MolecularSequenceStartingSequence {
	/**
	 * The cached value of the '{@link #getGenomeAssembly() <em>Genome Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomeAssembly()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept genomeAssembly;

	/**
	 * The cached value of the '{@link #getChromosome() <em>Chromosome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChromosome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept chromosome;

	/**
	 * The cached value of the '{@link #getSequenceCodeableConcept() <em>Sequence Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sequenceCodeableConcept;

	/**
	 * The cached value of the '{@link #getSequenceString() <em>Sequence String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String sequenceString;

	/**
	 * The cached value of the '{@link #getSequenceReference() <em>Sequence Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference sequenceReference;

	/**
	 * The cached value of the '{@link #getWindowStart() <em>Window Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowStart()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer windowStart;

	/**
	 * The cached value of the '{@link #getWindowEnd() <em>Window End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowEnd()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer windowEnd;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType orientation;

	/**
	 * The cached value of the '{@link #getStrand() <em>Strand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrand()
	 * @generated
	 * @ordered
	 */
	protected StrandType strand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceStartingSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMolecularSequenceStartingSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGenomeAssembly() {
		return genomeAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenomeAssembly(CodeableConcept newGenomeAssembly, NotificationChain msgs) {
		CodeableConcept oldGenomeAssembly = genomeAssembly;
		genomeAssembly = newGenomeAssembly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__GENOME_ASSEMBLY, oldGenomeAssembly, newGenomeAssembly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenomeAssembly(CodeableConcept newGenomeAssembly) {
		if (newGenomeAssembly != genomeAssembly) {
			NotificationChain msgs = null;
			if (genomeAssembly != null)
				msgs = ((InternalEObject)genomeAssembly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__GENOME_ASSEMBLY, null, msgs);
			if (newGenomeAssembly != null)
				msgs = ((InternalEObject)newGenomeAssembly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__GENOME_ASSEMBLY, null, msgs);
			msgs = basicSetGenomeAssembly(newGenomeAssembly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__GENOME_ASSEMBLY, newGenomeAssembly, newGenomeAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getChromosome() {
		return chromosome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChromosome(CodeableConcept newChromosome, NotificationChain msgs) {
		CodeableConcept oldChromosome = chromosome;
		chromosome = newChromosome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__CHROMOSOME, oldChromosome, newChromosome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChromosome(CodeableConcept newChromosome) {
		if (newChromosome != chromosome) {
			NotificationChain msgs = null;
			if (chromosome != null)
				msgs = ((InternalEObject)chromosome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__CHROMOSOME, null, msgs);
			if (newChromosome != null)
				msgs = ((InternalEObject)newChromosome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__CHROMOSOME, null, msgs);
			msgs = basicSetChromosome(newChromosome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__CHROMOSOME, newChromosome, newChromosome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSequenceCodeableConcept() {
		return sequenceCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceCodeableConcept(CodeableConcept newSequenceCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSequenceCodeableConcept = sequenceCodeableConcept;
		sequenceCodeableConcept = newSequenceCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_CODEABLE_CONCEPT, oldSequenceCodeableConcept, newSequenceCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceCodeableConcept(CodeableConcept newSequenceCodeableConcept) {
		if (newSequenceCodeableConcept != sequenceCodeableConcept) {
			NotificationChain msgs = null;
			if (sequenceCodeableConcept != null)
				msgs = ((InternalEObject)sequenceCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_CODEABLE_CONCEPT, null, msgs);
			if (newSequenceCodeableConcept != null)
				msgs = ((InternalEObject)newSequenceCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSequenceCodeableConcept(newSequenceCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_CODEABLE_CONCEPT, newSequenceCodeableConcept, newSequenceCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSequenceString() {
		return sequenceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceString(org.hl7.fhir.String newSequenceString, NotificationChain msgs) {
		org.hl7.fhir.String oldSequenceString = sequenceString;
		sequenceString = newSequenceString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_STRING, oldSequenceString, newSequenceString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceString(org.hl7.fhir.String newSequenceString) {
		if (newSequenceString != sequenceString) {
			NotificationChain msgs = null;
			if (sequenceString != null)
				msgs = ((InternalEObject)sequenceString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_STRING, null, msgs);
			if (newSequenceString != null)
				msgs = ((InternalEObject)newSequenceString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_STRING, null, msgs);
			msgs = basicSetSequenceString(newSequenceString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_STRING, newSequenceString, newSequenceString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSequenceReference() {
		return sequenceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceReference(Reference newSequenceReference, NotificationChain msgs) {
		Reference oldSequenceReference = sequenceReference;
		sequenceReference = newSequenceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_REFERENCE, oldSequenceReference, newSequenceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceReference(Reference newSequenceReference) {
		if (newSequenceReference != sequenceReference) {
			NotificationChain msgs = null;
			if (sequenceReference != null)
				msgs = ((InternalEObject)sequenceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_REFERENCE, null, msgs);
			if (newSequenceReference != null)
				msgs = ((InternalEObject)newSequenceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_REFERENCE, null, msgs);
			msgs = basicSetSequenceReference(newSequenceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_REFERENCE, newSequenceReference, newSequenceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getWindowStart() {
		return windowStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindowStart(org.hl7.fhir.Integer newWindowStart, NotificationChain msgs) {
		org.hl7.fhir.Integer oldWindowStart = windowStart;
		windowStart = newWindowStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_START, oldWindowStart, newWindowStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowStart(org.hl7.fhir.Integer newWindowStart) {
		if (newWindowStart != windowStart) {
			NotificationChain msgs = null;
			if (windowStart != null)
				msgs = ((InternalEObject)windowStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_START, null, msgs);
			if (newWindowStart != null)
				msgs = ((InternalEObject)newWindowStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_START, null, msgs);
			msgs = basicSetWindowStart(newWindowStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_START, newWindowStart, newWindowStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getWindowEnd() {
		return windowEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindowEnd(org.hl7.fhir.Integer newWindowEnd, NotificationChain msgs) {
		org.hl7.fhir.Integer oldWindowEnd = windowEnd;
		windowEnd = newWindowEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_END, oldWindowEnd, newWindowEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowEnd(org.hl7.fhir.Integer newWindowEnd) {
		if (newWindowEnd != windowEnd) {
			NotificationChain msgs = null;
			if (windowEnd != null)
				msgs = ((InternalEObject)windowEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_END, null, msgs);
			if (newWindowEnd != null)
				msgs = ((InternalEObject)newWindowEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_END, null, msgs);
			msgs = basicSetWindowEnd(newWindowEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_END, newWindowEnd, newWindowEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(OrientationType newOrientation, NotificationChain msgs) {
		OrientationType oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__ORIENTATION, oldOrientation, newOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationType newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrandType getStrand() {
		return strand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrand(StrandType newStrand, NotificationChain msgs) {
		StrandType oldStrand = strand;
		strand = newStrand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__STRAND, oldStrand, newStrand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrand(StrandType newStrand) {
		if (newStrand != strand) {
			NotificationChain msgs = null;
			if (strand != null)
				msgs = ((InternalEObject)strand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__STRAND, null, msgs);
			if (newStrand != null)
				msgs = ((InternalEObject)newStrand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__STRAND, null, msgs);
			msgs = basicSetStrand(newStrand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__STRAND, newStrand, newStrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__GENOME_ASSEMBLY:
				return basicSetGenomeAssembly(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__CHROMOSOME:
				return basicSetChromosome(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_CODEABLE_CONCEPT:
				return basicSetSequenceCodeableConcept(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_STRING:
				return basicSetSequenceString(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_REFERENCE:
				return basicSetSequenceReference(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_START:
				return basicSetWindowStart(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_END:
				return basicSetWindowEnd(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__STRAND:
				return basicSetStrand(null, msgs);
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
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__GENOME_ASSEMBLY:
				return getGenomeAssembly();
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__CHROMOSOME:
				return getChromosome();
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_CODEABLE_CONCEPT:
				return getSequenceCodeableConcept();
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_STRING:
				return getSequenceString();
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_REFERENCE:
				return getSequenceReference();
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_START:
				return getWindowStart();
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_END:
				return getWindowEnd();
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__ORIENTATION:
				return getOrientation();
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__STRAND:
				return getStrand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__GENOME_ASSEMBLY:
				setGenomeAssembly((CodeableConcept)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__CHROMOSOME:
				setChromosome((CodeableConcept)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_CODEABLE_CONCEPT:
				setSequenceCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_STRING:
				setSequenceString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_REFERENCE:
				setSequenceReference((Reference)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_START:
				setWindowStart((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_END:
				setWindowEnd((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__ORIENTATION:
				setOrientation((OrientationType)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__STRAND:
				setStrand((StrandType)newValue);
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
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__GENOME_ASSEMBLY:
				setGenomeAssembly((CodeableConcept)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__CHROMOSOME:
				setChromosome((CodeableConcept)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_CODEABLE_CONCEPT:
				setSequenceCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_STRING:
				setSequenceString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_REFERENCE:
				setSequenceReference((Reference)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_START:
				setWindowStart((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_END:
				setWindowEnd((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__ORIENTATION:
				setOrientation((OrientationType)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__STRAND:
				setStrand((StrandType)null);
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
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__GENOME_ASSEMBLY:
				return genomeAssembly != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__CHROMOSOME:
				return chromosome != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_CODEABLE_CONCEPT:
				return sequenceCodeableConcept != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_STRING:
				return sequenceString != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__SEQUENCE_REFERENCE:
				return sequenceReference != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_START:
				return windowStart != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__WINDOW_END:
				return windowEnd != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__ORIENTATION:
				return orientation != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE__STRAND:
				return strand != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceStartingSequenceImpl
