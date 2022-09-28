/**
 */
package ui_concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concreta.ModelFactory#getLstUI_Diagrams <em>Lst UI Diagrams</em>}</li>
 * </ul>
 *
 * @see ui_concreta.Ui_concretaPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst UI Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link ui_concreta.UI_Diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst UI Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst UI Diagrams</em>' containment reference list.
	 * @see ui_concreta.Ui_concretaPackage#getModelFactory_LstUI_Diagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<UI_Diagram> getLstUI_Diagrams();

} // ModelFactory
