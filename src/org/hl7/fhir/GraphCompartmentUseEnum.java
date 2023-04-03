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
 * A representation of the literals of the enumeration '<em><b>Graph Compartment Use Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGraphCompartmentUseEnum()
 * @model extendedMetaData="name='GraphCompartmentUseEnum'"
 * @generated
 */
public enum GraphCompartmentUseEnum implements Enumerator {
	/**
	 * The '<em><b>Where</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where
	 * <!-- end-model-doc -->
	 * @see #WHERE_VALUE
	 * @generated
	 * @ordered
	 */
	WHERE(0, "where", "where"),

	/**
	 * The '<em><b>Requires</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * requires
	 * <!-- end-model-doc -->
	 * @see #REQUIRES_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRES(1, "requires", "requires");

	/**
	 * The '<em><b>Where</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where
	 * <!-- end-model-doc -->
	 * @see #WHERE
	 * @model name="where"
	 * @generated
	 * @ordered
	 */
	public static final int WHERE_VALUE = 0;

	/**
	 * The '<em><b>Requires</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * requires
	 * <!-- end-model-doc -->
	 * @see #REQUIRES
	 * @model name="requires"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRES_VALUE = 1;

	/**
	 * An array of all the '<em><b>Graph Compartment Use Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GraphCompartmentUseEnum[] VALUES_ARRAY =
		new GraphCompartmentUseEnum[] {
			WHERE,
			REQUIRES,
		};

	/**
	 * A public read-only list of all the '<em><b>Graph Compartment Use Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GraphCompartmentUseEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Graph Compartment Use Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GraphCompartmentUseEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphCompartmentUseEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Compartment Use Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GraphCompartmentUseEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphCompartmentUseEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Compartment Use Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GraphCompartmentUseEnum get(int value) {
		switch (value) {
			case WHERE_VALUE: return WHERE;
			case REQUIRES_VALUE: return REQUIRES;
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
	private GraphCompartmentUseEnum(int value, String name, String literal) {
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
	
} //GraphCompartmentUseEnum
