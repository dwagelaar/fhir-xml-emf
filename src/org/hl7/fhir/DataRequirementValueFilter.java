/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Requirement Value Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DataRequirementValueFilter#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementValueFilter#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementValueFilter#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementValueFilter#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementValueFilter#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementValueFilter#getValueDuration <em>Value Duration</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDataRequirementValueFilter()
 * @model extendedMetaData="name='DataRequirement.ValueFilter' kind='elementOnly'"
 * @generated
 */
public interface DataRequirementValueFilter extends DataType {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute of the filter. The specified path SHALL be a FHIRPath resolvable on the specified type of the DataRequirement, and SHALL consist only of identifiers, constant indexers, and .resolve(). The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details). Note that the index must be an integer constant. The path must resolve to an element of a type that is comparable to the valueFilter.value[x] element for the filter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementValueFilter_Path()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirementValueFilter#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Search Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A search parameter defined on the specified type of the DataRequirement, and which searches on elements of a type compatible with the type of the valueFilter.value[x] for the filter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Param</em>' containment reference.
	 * @see #setSearchParam(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementValueFilter_SearchParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchParam' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSearchParam();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirementValueFilter#getSearchParam <em>Search Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Param</em>' containment reference.
	 * @see #getSearchParam()
	 * @generated
	 */
	void setSearchParam(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The comparator to be used to determine whether the value is matching.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparator</em>' containment reference.
	 * @see #setComparator(Code)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementValueFilter_Comparator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comparator' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getComparator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirementValueFilter#getComparator <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' containment reference.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(Code value);

	/**
	 * Returns the value of the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date Time</em>' containment reference.
	 * @see #setValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementValueFilter_ValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirementValueFilter#getValueDateTime <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' containment reference.
	 * @see #getValueDateTime()
	 * @generated
	 */
	void setValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Period</em>' containment reference.
	 * @see #setValuePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementValueFilter_ValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirementValueFilter#getValuePeriod <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Period</em>' containment reference.
	 * @see #getValuePeriod()
	 * @generated
	 */
	void setValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Value Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Duration</em>' containment reference.
	 * @see #setValueDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementValueFilter_ValueDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getValueDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirementValueFilter#getValueDuration <em>Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Duration</em>' containment reference.
	 * @see #getValueDuration()
	 * @generated
	 */
	void setValueDuration(Duration value);

} // DataRequirementValueFilter
