/**
 */
package org.hl7.emf.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Subscription Payload Content Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getSubscriptionPayloadContentEnum()
 * @model extendedMetaData="name='SubscriptionPayloadContentEnum'"
 * @generated
 */
public enum SubscriptionPayloadContentEnum implements Enumerator {
	/**
	 * The '<em><b>Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Empty
	 * <!-- end-model-doc -->
	 * @see #EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY(0, "empty", "empty"),

	/**
	 * The '<em><b>Id Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id-only
	 * <!-- end-model-doc -->
	 * @see #ID_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ID_ONLY(1, "idOnly", "id-only"),

	/**
	 * The '<em><b>Full Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full-resource
	 * <!-- end-model-doc -->
	 * @see #FULL_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_RESOURCE(2, "fullResource", "full-resource");

	/**
	 * The '<em><b>Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Empty
	 * <!-- end-model-doc -->
	 * @see #EMPTY
	 * @model name="empty"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_VALUE = 0;

	/**
	 * The '<em><b>Id Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id-only
	 * <!-- end-model-doc -->
	 * @see #ID_ONLY
	 * @model name="idOnly" literal="id-only"
	 * @generated
	 * @ordered
	 */
	public static final int ID_ONLY_VALUE = 1;

	/**
	 * The '<em><b>Full Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full-resource
	 * <!-- end-model-doc -->
	 * @see #FULL_RESOURCE
	 * @model name="fullResource" literal="full-resource"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_RESOURCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Subscription Payload Content Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubscriptionPayloadContentEnum[] VALUES_ARRAY =
		new SubscriptionPayloadContentEnum[] {
			EMPTY,
			ID_ONLY,
			FULL_RESOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Subscription Payload Content Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubscriptionPayloadContentEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Subscription Payload Content Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionPayloadContentEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubscriptionPayloadContentEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subscription Payload Content Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionPayloadContentEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubscriptionPayloadContentEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subscription Payload Content Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionPayloadContentEnum get(int value) {
		switch (value) {
			case EMPTY_VALUE: return EMPTY;
			case ID_ONLY_VALUE: return ID_ONLY;
			case FULL_RESOURCE_VALUE: return FULL_RESOURCE;
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
	private SubscriptionPayloadContentEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //SubscriptionPayloadContentEnum
