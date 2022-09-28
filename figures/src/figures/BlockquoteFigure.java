
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
public class BlockquoteFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureBlockquoteLabelFigure;

	/**
	 * @generated
	 */
	public BlockquoteFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/blockquote.png").createImage(), 0);
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureBlockquoteLabelFigure = new WrappingLabel();

		fFigureBlockquoteLabelFigure.setText("Blockquote");

		this.add(fFigureBlockquoteLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureBlockquoteLabelFigure() {
		return fFigureBlockquoteLabelFigure;
	}

}
