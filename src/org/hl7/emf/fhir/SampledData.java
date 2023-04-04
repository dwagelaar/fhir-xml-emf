/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampled Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getIntervalUnit <em>Interval Unit</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getCodeMap <em>Code Map</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getOffsets <em>Offsets</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SampledData#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSampledData()
 * @model extendedMetaData="name='SampledData' kind='elementOnly'"
 * @generated
 */
public interface SampledData extends DataType {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_Origin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getOrigin();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Quantity value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of intervalUnits between samples, e.g. milliseconds for time-based sampling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference.
	 * @see #setInterval(Decimal)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_Interval()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interval' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getInterval();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getInterval <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' containment reference.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(Decimal value);

	/**
	 * Returns the value of the '<em><b>Interval Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measurement unit in which the sample interval is expressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval Unit</em>' containment reference.
	 * @see #setIntervalUnit(Code)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_IntervalUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intervalUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getIntervalUnit();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getIntervalUnit <em>Interval Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Unit</em>' containment reference.
	 * @see #getIntervalUnit()
	 * @generated
	 */
	void setIntervalUnit(Code value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A correction factor that is applied to the sampled data points before they are added to the origin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_Factor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Lower Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower limit of detection of the measured points. This is needed if any of the data points have the value "L" (lower than detection limit).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Limit</em>' containment reference.
	 * @see #setLowerLimit(Decimal)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_LowerLimit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowerLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getLowerLimit();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getLowerLimit <em>Lower Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Limit</em>' containment reference.
	 * @see #getLowerLimit()
	 * @generated
	 */
	void setLowerLimit(Decimal value);

	/**
	 * Returns the value of the '<em><b>Upper Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper limit of detection of the measured points. This is needed if any of the data points have the value "U" (higher than detection limit).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Limit</em>' containment reference.
	 * @see #setUpperLimit(Decimal)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_UpperLimit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='upperLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getUpperLimit();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getUpperLimit <em>Upper Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Limit</em>' containment reference.
	 * @see #getUpperLimit()
	 * @generated
	 */
	void setUpperLimit(Decimal value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of sample points at each time point. If this value is greater than one, then the dimensions will be interlaced - all the sample points for a point in time will be recorded at once.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_Dimensions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDimensions();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Code Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to ConceptMap that defines the codes used in the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Map</em>' containment reference.
	 * @see #setCodeMap(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_CodeMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeMap' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getCodeMap();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getCodeMap <em>Code Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Map</em>' containment reference.
	 * @see #getCodeMap()
	 * @generated
	 */
	void setCodeMap(Canonical value);

	/**
	 * Returns the value of the '<em><b>Offsets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A series of data points which are decimal values separated by a single space (character u20).  The units in which the offsets are expressed are found in intervalUnit.  The absolute point at which the measurements begin SHALL be conveyed outside the scope of this datatype, e.g. Observation.effectiveDateTime for a timing offset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offsets</em>' containment reference.
	 * @see #setOffsets(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_Offsets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsets' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getOffsets();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getOffsets <em>Offsets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offsets</em>' containment reference.
	 * @see #getOffsets()
	 * @generated
	 */
	void setOffsets(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A series of data points which are decimal values or codes separated by a single space (character u20). The special codes "E" (error), "L" (below detection limit) and "U" (above detection limit) are also defined for used in place of decimal values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(SampledDataDataType)
	 * @see org.hl7.emf.fhir.FhirPackage#getSampledData_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledDataDataType getData();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SampledData#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(SampledDataDataType value);

} // SampledData
