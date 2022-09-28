
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
public class ImgFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureImgLabelFigure;

	/**
	 * @generated
	 */
	public ImgFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/img.png").createImage(), 0);
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureImgLabelFigure = new WrappingLabel();

		fFigureImgLabelFigure.setText("Img");

		this.add(fFigureImgLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureImgLabelFigure() {
		return fFigureImgLabelFigure;
	}

}
