/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Unmapped</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ConceptMapUnmapped#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMapUnmapped#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMapUnmapped#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMapUnmapped#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMapUnmapped#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMapUnmapped#getOtherMap <em>Other Map</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapUnmapped()
 * @model extendedMetaData="name='ConceptMap.Unmapped' kind='elementOnly'"
 * @generated
 */
public interface ConceptMapUnmapped extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines which action to take if there is no match for the source concept in the target system designated for the group. One of 3 actions are possible: use the unmapped source code (this is useful when doing a mapping between versions, and only a few codes have changed), use a fixed code (a default code), or alternatively, a reference to a different concept map can be provided (by canonical URL).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(ConceptMapGroupUnmappedMode)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapUnmapped_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptMapGroupUnmappedMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMapUnmapped#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ConceptMapGroupUnmappedMode value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixed code to use when the mode = 'fixed'  - all unmapped codes are mapped to a single fixed code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapUnmapped_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMapUnmapped#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The display for the code. The display is only provided to help editors when editing the concept map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapUnmapped_Display()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMapUnmapped#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of fixed codes to use when the mode = 'fixed'  - all unmapped codes are mapped to each of the fixed codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapUnmapped_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMapUnmapped#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(Canonical value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default relationship value to apply between the source and target concepts when the source code is unmapped and the mode is 'fixed' or 'use-source-code'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(ConceptMapRelationship)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapUnmapped_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptMapRelationship getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMapUnmapped#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(ConceptMapRelationship value);

	/**
	 * Returns the value of the '<em><b>Other Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The canonical reference to an additional ConceptMap resource instance to use for mapping if this ConceptMap resource contains no matching mapping for the source concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Map</em>' containment reference.
	 * @see #setOtherMap(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapUnmapped_OtherMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherMap' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getOtherMap();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMapUnmapped#getOtherMap <em>Other Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Map</em>' containment reference.
	 * @see #getOtherMap()
	 * @generated
	 */
	void setOtherMap(Canonical value);

} // ConceptMapUnmapped
