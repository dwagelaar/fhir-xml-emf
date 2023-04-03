/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Notification Type</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubscriptionNotificationType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubscriptionNotificationType()
 * @model extendedMetaData="name='SubscriptionNotificationType' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionNotificationType extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.SubscriptionNotificationTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SubscriptionNotificationTypeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(SubscriptionNotificationTypeEnum)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionNotificationType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	SubscriptionNotificationTypeEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionNotificationType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SubscriptionNotificationTypeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SubscriptionNotificationTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.SubscriptionNotificationType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(SubscriptionNotificationTypeEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.SubscriptionNotificationType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(SubscriptionNotificationTypeEnum)
	 * @generated
	 */
	boolean isSetValue();

} // SubscriptionNotificationType
