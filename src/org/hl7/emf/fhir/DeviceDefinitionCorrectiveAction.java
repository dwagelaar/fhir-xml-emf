/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Corrective Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionCorrectiveAction#getRecall <em>Recall</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionCorrectiveAction#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.DeviceDefinitionCorrectiveAction#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionCorrectiveAction()
 * @model extendedMetaData="name='DeviceDefinition.CorrectiveAction' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinitionCorrectiveAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Recall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the last corrective action known for this device was a recall.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recall</em>' containment reference.
	 * @see #setRecall(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionCorrectiveAction_Recall()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='recall' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getRecall();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionCorrectiveAction#getRecall <em>Recall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recall</em>' containment reference.
	 * @see #getRecall()
	 * @generated
	 */
	void setRecall(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scope of the corrective action - whether the action targeted all units of a given device model, or only a specific set of batches identified by lot numbers, or individually identified devices identified by the serial name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(DeviceCorrectiveActionScope)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionCorrectiveAction_Scope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceCorrectiveActionScope getScope();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionCorrectiveAction#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(DeviceCorrectiveActionScope value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start and end dates of the  corrective action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getDeviceDefinitionCorrectiveAction_Period()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.DeviceDefinitionCorrectiveAction#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // DeviceDefinitionCorrectiveAction
