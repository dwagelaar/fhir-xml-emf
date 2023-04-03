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
 * A representation of the literals of the enumeration '<em><b>Message Significance Category Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMessageSignificanceCategoryEnum()
 * @model extendedMetaData="name='MessageSignificanceCategoryEnum'"
 * @generated
 */
public enum MessageSignificanceCategoryEnum implements Enumerator {
	/**
	 * The '<em><b>Consequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consequence
	 * <!-- end-model-doc -->
	 * @see #CONSEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSEQUENCE(0, "consequence", "consequence"),

	/**
	 * The '<em><b>Currency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Currency
	 * <!-- end-model-doc -->
	 * @see #CURRENCY_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENCY(1, "currency", "currency"),

	/**
	 * The '<em><b>Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notification
	 * <!-- end-model-doc -->
	 * @see #NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	NOTIFICATION(2, "notification", "notification");

	/**
	 * The '<em><b>Consequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consequence
	 * <!-- end-model-doc -->
	 * @see #CONSEQUENCE
	 * @model name="consequence"
	 * @generated
	 * @ordered
	 */
	public static final int CONSEQUENCE_VALUE = 0;

	/**
	 * The '<em><b>Currency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Currency
	 * <!-- end-model-doc -->
	 * @see #CURRENCY
	 * @model name="currency"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENCY_VALUE = 1;

	/**
	 * The '<em><b>Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notification
	 * <!-- end-model-doc -->
	 * @see #NOTIFICATION
	 * @model name="notification"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFICATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Message Significance Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageSignificanceCategoryEnum[] VALUES_ARRAY =
		new MessageSignificanceCategoryEnum[] {
			CONSEQUENCE,
			CURRENCY,
			NOTIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Significance Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageSignificanceCategoryEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Significance Category Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSignificanceCategoryEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSignificanceCategoryEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Significance Category Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSignificanceCategoryEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSignificanceCategoryEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Significance Category Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSignificanceCategoryEnum get(int value) {
		switch (value) {
			case CONSEQUENCE_VALUE: return CONSEQUENCE;
			case CURRENCY_VALUE: return CURRENCY;
			case NOTIFICATION_VALUE: return NOTIFICATION;
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
	private MessageSignificanceCategoryEnum(int value, String name, String literal) {
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
	
} //MessageSignificanceCategoryEnum
