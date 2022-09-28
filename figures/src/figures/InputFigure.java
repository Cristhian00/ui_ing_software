
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
public class InputFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureInputLabelFigure;

	/**
	 * @generated
	 */
	public InputFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/input.png").createImage(), 0);
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureInputLabelFigure = new WrappingLabel();

		fFigureInputLabelFigure.setText("Input");

		this.add(fFigureInputLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureInputLabelFigure() {
		return fFigureInputLabelFigure;
	}

}
