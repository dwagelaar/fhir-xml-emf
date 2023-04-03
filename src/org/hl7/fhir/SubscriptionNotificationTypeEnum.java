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
 * A representation of the literals of the enumeration '<em><b>Subscription Notification Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSubscriptionNotificationTypeEnum()
 * @model extendedMetaData="name='SubscriptionNotificationTypeEnum'"
 * @generated
 */
public enum SubscriptionNotificationTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Handshake</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Handshake
	 * <!-- end-model-doc -->
	 * @see #HANDSHAKE_VALUE
	 * @generated
	 * @ordered
	 */
	HANDSHAKE(0, "handshake", "handshake"),

	/**
	 * The '<em><b>Heartbeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Heartbeat
	 * <!-- end-model-doc -->
	 * @see #HEARTBEAT_VALUE
	 * @generated
	 * @ordered
	 */
	HEARTBEAT(1, "heartbeat", "heartbeat"),

	/**
	 * The '<em><b>Event Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Event Notification
	 * <!-- end-model-doc -->
	 * @see #EVENT_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_NOTIFICATION(2, "eventNotification", "event-notification"),

	/**
	 * The '<em><b>Query Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Query Status
	 * <!-- end-model-doc -->
	 * @see #QUERY_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_STATUS(3, "queryStatus", "query-status"),

	/**
	 * The '<em><b>Query Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Query Event
	 * <!-- end-model-doc -->
	 * @see #QUERY_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_EVENT(4, "queryEvent", "query-event");

	/**
	 * The '<em><b>Handshake</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Handshake
	 * <!-- end-model-doc -->
	 * @see #HANDSHAKE
	 * @model name="handshake"
	 * @generated
	 * @ordered
	 */
	public static final int HANDSHAKE_VALUE = 0;

	/**
	 * The '<em><b>Heartbeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Heartbeat
	 * <!-- end-model-doc -->
	 * @see #HEARTBEAT
	 * @model name="heartbeat"
	 * @generated
	 * @ordered
	 */
	public static final int HEARTBEAT_VALUE = 1;

	/**
	 * The '<em><b>Event Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Event Notification
	 * <!-- end-model-doc -->
	 * @see #EVENT_NOTIFICATION
	 * @model name="eventNotification" literal="event-notification"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_NOTIFICATION_VALUE = 2;

	/**
	 * The '<em><b>Query Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Query Status
	 * <!-- end-model-doc -->
	 * @see #QUERY_STATUS
	 * @model name="queryStatus" literal="query-status"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_STATUS_VALUE = 3;

	/**
	 * The '<em><b>Query Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Query Event
	 * <!-- end-model-doc -->
	 * @see #QUERY_EVENT
	 * @model name="queryEvent" literal="query-event"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_EVENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Subscription Notification Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubscriptionNotificationTypeEnum[] VALUES_ARRAY =
		new SubscriptionNotificationTypeEnum[] {
			HANDSHAKE,
			HEARTBEAT,
			EVENT_NOTIFICATION,
			QUERY_STATUS,
			QUERY_EVENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Subscription Notification Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubscriptionNotificationTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Subscription Notification Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionNotificationTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubscriptionNotificationTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subscription Notification Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionNotificationTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubscriptionNotificationTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subscription Notification Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionNotificationTypeEnum get(int value) {
		switch (value) {
			case HANDSHAKE_VALUE: return HANDSHAKE;
			case HEARTBEAT_VALUE: return HEARTBEAT;
			case EVENT_NOTIFICATION_VALUE: return EVENT_NOTIFICATION;
			case QUERY_STATUS_VALUE: return QUERY_STATUS;
			case QUERY_EVENT_VALUE: return QUERY_EVENT;
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
	private SubscriptionNotificationTypeEnum(int value, String name, String literal) {
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
	
} //SubscriptionNotificationTypeEnum
