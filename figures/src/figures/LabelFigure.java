
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
public class LabelFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureLabelLabelFigure;

	/**
	 * @generated
	 */
	public LabelFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/label.png").createImage(), 0);
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureLabelLabelFigure = new WrappingLabel();

		fFigureLabelLabelFigure.setText("Label");

		this.add(fFigureLabelLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureLabelLabelFigure() {
		return fFigureLabelLabelFigure;
	}

}
