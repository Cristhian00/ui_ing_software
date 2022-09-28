
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
public class UlFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureUlLabelFigure;

	/**
	 * @generated
	 */
	public UlFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/ul.png").createImage(), 0);
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureUlLabelFigure = new WrappingLabel();

		fFigureUlLabelFigure.setText("Ul");

		this.add(fFigureUlLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureUlLabelFigure() {
		return fFigureUlLabelFigure;
	}

}
