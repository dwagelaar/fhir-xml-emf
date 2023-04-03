/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FHIR Path Types Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getFHIRPathTypesEnum()
 * @model extendedMetaData="name='FHIRPathTypesEnum'"
 * @generated
 */
public enum FHIRPathTypesEnum implements Enumerator {
	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_HL7_ORG_FHIRPATH_SYSTEM_STRING(0, "httpHl7OrgFhirpathSystemString", "http://hl7.org/fhirpath/System.String"),

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_HL7_ORG_FHIRPATH_SYSTEM_BOOLEAN(1, "httpHl7OrgFhirpathSystemBoolean", "http://hl7.org/fhirpath/System.Boolean"),

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE(2, "httpHl7OrgFhirpathSystemDate", "http://hl7.org/fhirpath/System.Date"),

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DateTime
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_TIME(3, "httpHl7OrgFhirpathSystemDateTime", "http://hl7.org/fhirpath/System.DateTime"),

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decimal
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_HL7_ORG_FHIRPATH_SYSTEM_DECIMAL(4, "httpHl7OrgFhirpathSystemDecimal", "http://hl7.org/fhirpath/System.Decimal"),

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_HL7_ORG_FHIRPATH_SYSTEM_INTEGER(5, "httpHl7OrgFhirpathSystemInteger", "http://hl7.org/fhirpath/System.Integer"),

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_HL7_ORG_FHIRPATH_SYSTEM_TIME(6, "httpHl7OrgFhirpathSystemTime", "http://hl7.org/fhirpath/System.Time");

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_STRING
	 * @model name="httpHl7OrgFhirpathSystemString" literal="http://hl7.org/fhirpath/System.String"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_HL7_ORG_FHIRPATH_SYSTEM_STRING_VALUE = 0;

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_BOOLEAN
	 * @model name="httpHl7OrgFhirpathSystemBoolean" literal="http://hl7.org/fhirpath/System.Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_HL7_ORG_FHIRPATH_SYSTEM_BOOLEAN_VALUE = 1;

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE
	 * @model name="httpHl7OrgFhirpathSystemDate" literal="http://hl7.org/fhirpath/System.Date"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_VALUE = 2;

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DateTime
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_TIME
	 * @model name="httpHl7OrgFhirpathSystemDateTime" literal="http://hl7.org/fhirpath/System.DateTime"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_TIME_VALUE = 3;

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decimal
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_DECIMAL
	 * @model name="httpHl7OrgFhirpathSystemDecimal" literal="http://hl7.org/fhirpath/System.Decimal"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_HL7_ORG_FHIRPATH_SYSTEM_DECIMAL_VALUE = 4;

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_INTEGER
	 * @model name="httpHl7OrgFhirpathSystemInteger" literal="http://hl7.org/fhirpath/System.Integer"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_HL7_ORG_FHIRPATH_SYSTEM_INTEGER_VALUE = 5;

	/**
	 * The '<em><b>Http Hl7 Org Fhirpath System Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time
	 * <!-- end-model-doc -->
	 * @see #HTTP_HL7_ORG_FHIRPATH_SYSTEM_TIME
	 * @model name="httpHl7OrgFhirpathSystemTime" literal="http://hl7.org/fhirpath/System.Time"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_HL7_ORG_FHIRPATH_SYSTEM_TIME_VALUE = 6;

	/**
	 * An array of all the '<em><b>FHIR Path Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FHIRPathTypesEnum[] VALUES_ARRAY =
		new FHIRPathTypesEnum[] {
			HTTP_HL7_ORG_FHIRPATH_SYSTEM_STRING,
			HTTP_HL7_ORG_FHIRPATH_SYSTEM_BOOLEAN,
			HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE,
			HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_TIME,
			HTTP_HL7_ORG_FHIRPATH_SYSTEM_DECIMAL,
			HTTP_HL7_ORG_FHIRPATH_SYSTEM_INTEGER,
			HTTP_HL7_ORG_FHIRPATH_SYSTEM_TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>FHIR Path Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FHIRPathTypesEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FHIR Path Types Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FHIRPathTypesEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FHIRPathTypesEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FHIR Path Types Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FHIRPathTypesEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FHIRPathTypesEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FHIR Path Types Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FHIRPathTypesEnum get(int value) {
		switch (value) {
			case HTTP_HL7_ORG_FHIRPATH_SYSTEM_STRING_VALUE: return HTTP_HL7_ORG_FHIRPATH_SYSTEM_STRING;
			case HTTP_HL7_ORG_FHIRPATH_SYSTEM_BOOLEAN_VALUE: return HTTP_HL7_ORG_FHIRPATH_SYSTEM_BOOLEAN;
			case HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_VALUE: return HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE;
			case HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_TIME_VALUE: return HTTP_HL7_ORG_FHIRPATH_SYSTEM_DATE_TIME;
			case HTTP_HL7_ORG_FHIRPATH_SYSTEM_DECIMAL_VALUE: return HTTP_HL7_ORG_FHIRPATH_SYSTEM_DECIMAL;
			case HTTP_HL7_ORG_FHIRPATH_SYSTEM_INTEGER_VALUE: return HTTP_HL7_ORG_FHIRPATH_SYSTEM_INTEGER;
			case HTTP_HL7_ORG_FHIRPATH_SYSTEM_TIME_VALUE: return HTTP_HL7_ORG_FHIRPATH_SYSTEM_TIME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FHIRPathTypesEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FHIRPathTypesEnum
