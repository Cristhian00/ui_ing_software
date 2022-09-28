/**
 */
package ui_concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concreta.UI_Diagram#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ui_concreta.UI_Diagram#getUserInterface <em>User Interface</em>}</li>
 * </ul>
 *
 * @see ui_concreta.Ui_concretaPackage#getUI_Diagram()
 * @model
 * @generated
 */
public interface UI_Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ui_concreta.Ui_concretaPackage#getUI_Diagram_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ui_concreta.UI_Diagram#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>User Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interface</em>' containment reference.
	 * @see #setUserInterface(UserInterface)
	 * @see ui_concreta.Ui_concretaPackage#getUI_Diagram_UserInterface()
	 * @model containment="true"
	 * @generated
	 */
	UserInterface getUserInterface();

	/**
	 * Sets the value of the '{@link ui_concreta.UI_Diagram#getUserInterface <em>User Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interface</em>' containment reference.
	 * @see #getUserInterface()
	 * @generated
	 */
	void setUserInterface(UserInterface value);

} // UI_Diagram
