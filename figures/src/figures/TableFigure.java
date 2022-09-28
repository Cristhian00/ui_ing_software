
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
public class TableFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureTableLabelFigure;

	/**
	 * @generated
	 */
	public TableFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/tabla.png").createImage(), 0);
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureTableLabelFigure = new WrappingLabel();

		fFigureTableLabelFigure.setText("Table");

		this.add(fFigureTableLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureTableLabelFigure() {
		return fFigureTableLabelFigure;
	}

}
