/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Artifact Type Expanded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RelatedArtifactTypeExpanded#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRelatedArtifactTypeExpanded()
 * @model extendedMetaData="name='RelatedArtifactTypeExpanded' kind='elementOnly'"
 * @generated
 */
public interface RelatedArtifactTypeExpanded extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.RelatedArtifactTypeExpandedEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.RelatedArtifactTypeExpandedEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(RelatedArtifactTypeExpandedEnum)
	 * @see org.hl7.fhir.FhirPackage#getRelatedArtifactTypeExpanded_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	RelatedArtifactTypeExpandedEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RelatedArtifactTypeExpanded#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.RelatedArtifactTypeExpandedEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(RelatedArtifactTypeExpandedEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.RelatedArtifactTypeExpanded#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(RelatedArtifactTypeExpandedEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.RelatedArtifactTypeExpanded#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(RelatedArtifactTypeExpandedEnum)
	 * @generated
	 */
	boolean isSetValue();

} // RelatedArtifactTypeExpanded
