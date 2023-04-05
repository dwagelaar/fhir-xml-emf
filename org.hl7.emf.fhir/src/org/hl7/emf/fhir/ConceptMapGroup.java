/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Group</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ConceptMapGroup#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMapGroup#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMapGroup#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ConceptMapGroup#getUnmapped <em>Unmapped</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapGroup()
 * @model extendedMetaData="name='ConceptMap.Group' kind='elementOnly'"
 * @generated
 */
public interface ConceptMapGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that identifies the source system where the concepts to be mapped are defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapGroup_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getSource();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMapGroup#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Canonical value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that identifies the target system that the concepts will be mapped to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapGroup_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMapGroup#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Canonical value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ConceptMapElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mappings for an individual concept in the source to one or more concepts in the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapGroup_Element()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapElement> getElement();

	/**
	 * Returns the value of the '<em><b>Unmapped</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What to do when there is no mapping to a target concept from the source concept and ConceptMap.group.element.noMap is not true. This provides the "default" to be applied when there is no target concept mapping specified or the expansion of ConceptMap.group.element.target.valueSet is empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unmapped</em>' containment reference.
	 * @see #setUnmapped(ConceptMapUnmapped)
	 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapGroup_Unmapped()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unmapped' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptMapUnmapped getUnmapped();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ConceptMapGroup#getUnmapped <em>Unmapped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmapped</em>' containment reference.
	 * @see #getUnmapped()
	 * @generated
	 */
	void setUnmapped(ConceptMapUnmapped value);

} // ConceptMapGroup
