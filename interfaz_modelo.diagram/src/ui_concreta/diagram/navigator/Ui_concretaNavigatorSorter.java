/*
* 
*/
package ui_concreta.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Ui_concretaNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7007;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7006;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ui_concreta.diagram.navigator.Ui_concretaNavigatorItem) {
			ui_concreta.diagram.navigator.Ui_concretaNavigatorItem item = (ui_concreta.diagram.navigator.Ui_concretaNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
