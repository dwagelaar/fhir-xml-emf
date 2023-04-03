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
 * A representation of the literals of the enumeration '<em><b>Reference Version Rules Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getReferenceVersionRulesEnum()
 * @model extendedMetaData="name='ReferenceVersionRulesEnum'"
 * @generated
 */
public enum ReferenceVersionRulesEnum implements Enumerator {
	/**
	 * The '<em><b>Either</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either Specific or independent
	 * <!-- end-model-doc -->
	 * @see #EITHER_VALUE
	 * @generated
	 * @ordered
	 */
	EITHER(0, "either", "either"),

	/**
	 * The '<em><b>Independent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version independent
	 * <!-- end-model-doc -->
	 * @see #INDEPENDENT_VALUE
	 * @generated
	 * @ordered
	 */
	INDEPENDENT(1, "independent", "independent"),

	/**
	 * The '<em><b>Specific</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version Specific
	 * <!-- end-model-doc -->
	 * @see #SPECIFIC_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFIC(2, "specific", "specific");

	/**
	 * The '<em><b>Either</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either Specific or independent
	 * <!-- end-model-doc -->
	 * @see #EITHER
	 * @model name="either"
	 * @generated
	 * @ordered
	 */
	public static final int EITHER_VALUE = 0;

	/**
	 * The '<em><b>Independent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version independent
	 * <!-- end-model-doc -->
	 * @see #INDEPENDENT
	 * @model name="independent"
	 * @generated
	 * @ordered
	 */
	public static final int INDEPENDENT_VALUE = 1;

	/**
	 * The '<em><b>Specific</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version Specific
	 * <!-- end-model-doc -->
	 * @see #SPECIFIC
	 * @model name="specific"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Reference Version Rules Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceVersionRulesEnum[] VALUES_ARRAY =
		new ReferenceVersionRulesEnum[] {
			EITHER,
			INDEPENDENT,
			SPECIFIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Reference Version Rules Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceVersionRulesEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Version Rules Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceVersionRulesEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceVersionRulesEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Version Rules Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceVersionRulesEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceVersionRulesEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Version Rules Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceVersionRulesEnum get(int value) {
		switch (value) {
			case EITHER_VALUE: return EITHER;
			case INDEPENDENT_VALUE: return INDEPENDENT;
			case SPECIFIC_VALUE: return SPECIFIC;
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
	private ReferenceVersionRulesEnum(int value, String name, String literal) {
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
	
} //ReferenceVersionRulesEnum
