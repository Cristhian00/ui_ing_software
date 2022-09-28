
package figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

import figures.activator.PluginActivator;

/**
 * @generated
 */
public class ButtonFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureButtonLabelFigure;

	/**
	 * @generated
	 */
	public ButtonFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/button.png").createImage(), 0);
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureButtonLabelFigure = new WrappingLabel();

		fFigureButtonLabelFigure.setText("Button");

		this.add(fFigureButtonLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureButtonLabelFigure() {
		return fFigureButtonLabelFigure;
	}

}
