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
 * A representation of the literals of the enumeration '<em><b>Permission Rule Combining Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getPermissionRuleCombiningEnum()
 * @model extendedMetaData="name='PermissionRuleCombiningEnum'"
 * @generated
 */
public enum PermissionRuleCombiningEnum implements Enumerator {
	/**
	 * The '<em><b>Deny Overrides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deny-overrides
	 * <!-- end-model-doc -->
	 * @see #DENY_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	DENY_OVERRIDES(0, "denyOverrides", "deny-overrides"),

	/**
	 * The '<em><b>Permit Overrides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permit-overrides
	 * <!-- end-model-doc -->
	 * @see #PERMIT_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	PERMIT_OVERRIDES(1, "permitOverrides", "permit-overrides"),

	/**
	 * The '<em><b>Ordered Deny Overrides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered-deny-overrides
	 * <!-- end-model-doc -->
	 * @see #ORDERED_DENY_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERED_DENY_OVERRIDES(2, "orderedDenyOverrides", "ordered-deny-overrides"),

	/**
	 * The '<em><b>Ordered Permit Overrides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered-permit-overrides
	 * <!-- end-model-doc -->
	 * @see #ORDERED_PERMIT_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERED_PERMIT_OVERRIDES(3, "orderedPermitOverrides", "ordered-permit-overrides"),

	/**
	 * The '<em><b>Deny Unless Permit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deny-unless-permit
	 * <!-- end-model-doc -->
	 * @see #DENY_UNLESS_PERMIT_VALUE
	 * @generated
	 * @ordered
	 */
	DENY_UNLESS_PERMIT(4, "denyUnlessPermit", "deny-unless-permit"),

	/**
	 * The '<em><b>Permit Unless Deny</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permit-unless-deny
	 * <!-- end-model-doc -->
	 * @see #PERMIT_UNLESS_DENY_VALUE
	 * @generated
	 * @ordered
	 */
	PERMIT_UNLESS_DENY(5, "permitUnlessDeny", "permit-unless-deny");

	/**
	 * The '<em><b>Deny Overrides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deny-overrides
	 * <!-- end-model-doc -->
	 * @see #DENY_OVERRIDES
	 * @model name="denyOverrides" literal="deny-overrides"
	 * @generated
	 * @ordered
	 */
	public static final int DENY_OVERRIDES_VALUE = 0;

	/**
	 * The '<em><b>Permit Overrides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permit-overrides
	 * <!-- end-model-doc -->
	 * @see #PERMIT_OVERRIDES
	 * @model name="permitOverrides" literal="permit-overrides"
	 * @generated
	 * @ordered
	 */
	public static final int PERMIT_OVERRIDES_VALUE = 1;

	/**
	 * The '<em><b>Ordered Deny Overrides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered-deny-overrides
	 * <!-- end-model-doc -->
	 * @see #ORDERED_DENY_OVERRIDES
	 * @model name="orderedDenyOverrides" literal="ordered-deny-overrides"
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_DENY_OVERRIDES_VALUE = 2;

	/**
	 * The '<em><b>Ordered Permit Overrides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered-permit-overrides
	 * <!-- end-model-doc -->
	 * @see #ORDERED_PERMIT_OVERRIDES
	 * @model name="orderedPermitOverrides" literal="ordered-permit-overrides"
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_PERMIT_OVERRIDES_VALUE = 3;

	/**
	 * The '<em><b>Deny Unless Permit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deny-unless-permit
	 * <!-- end-model-doc -->
	 * @see #DENY_UNLESS_PERMIT
	 * @model name="denyUnlessPermit" literal="deny-unless-permit"
	 * @generated
	 * @ordered
	 */
	public static final int DENY_UNLESS_PERMIT_VALUE = 4;

	/**
	 * The '<em><b>Permit Unless Deny</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permit-unless-deny
	 * <!-- end-model-doc -->
	 * @see #PERMIT_UNLESS_DENY
	 * @model name="permitUnlessDeny" literal="permit-unless-deny"
	 * @generated
	 * @ordered
	 */
	public static final int PERMIT_UNLESS_DENY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Permission Rule Combining Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PermissionRuleCombiningEnum[] VALUES_ARRAY =
		new PermissionRuleCombiningEnum[] {
			DENY_OVERRIDES,
			PERMIT_OVERRIDES,
			ORDERED_DENY_OVERRIDES,
			ORDERED_PERMIT_OVERRIDES,
			DENY_UNLESS_PERMIT,
			PERMIT_UNLESS_DENY,
		};

	/**
	 * A public read-only list of all the '<em><b>Permission Rule Combining Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PermissionRuleCombiningEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Permission Rule Combining Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PermissionRuleCombiningEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PermissionRuleCombiningEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Permission Rule Combining Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PermissionRuleCombiningEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PermissionRuleCombiningEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Permission Rule Combining Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PermissionRuleCombiningEnum get(int value) {
		switch (value) {
			case DENY_OVERRIDES_VALUE: return DENY_OVERRIDES;
			case PERMIT_OVERRIDES_VALUE: return PERMIT_OVERRIDES;
			case ORDERED_DENY_OVERRIDES_VALUE: return ORDERED_DENY_OVERRIDES;
			case ORDERED_PERMIT_OVERRIDES_VALUE: return ORDERED_PERMIT_OVERRIDES;
			case DENY_UNLESS_PERMIT_VALUE: return DENY_UNLESS_PERMIT;
			case PERMIT_UNLESS_DENY_VALUE: return PERMIT_UNLESS_DENY;
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
	private PermissionRuleCombiningEnum(int value, String name, String literal) {
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
	
} //PermissionRuleCombiningEnum
