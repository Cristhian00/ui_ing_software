/**
 */
package ui_concreta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concreta.GraphicalContainer#getLstChildModelElements <em>Lst Child Model Elements</em>}</li>
 * </ul>
 *
 * @see ui_concreta.Ui_concretaPackage#getGraphicalContainer()
 * @model abstract="true"
 * @generated
 */
public interface GraphicalContainer extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ui_concreta.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Child Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Child Model Elements</em>' containment reference list.
	 * @see ui_concreta.Ui_concretaPackage#getGraphicalContainer_LstChildModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getLstChildModelElements();

} // GraphicalContainer
