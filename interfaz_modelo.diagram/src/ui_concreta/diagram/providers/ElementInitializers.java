/*
 * 
 */
package ui_concreta.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
