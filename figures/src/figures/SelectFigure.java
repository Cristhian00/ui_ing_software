
package figures;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class SelectFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureSelectLabelFigure;

	/**
	 * @generated
	 */
	public SelectFigure() {
		this.setCornerDimensions(new Dimension(8, 8));
		this.setBorder(new MarginBorder(5, 5, 5, 5));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureSelectLabelFigure = new WrappingLabel();

		fFigureSelectLabelFigure.setText("Select");

		this.add(fFigureSelectLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureSelectLabelFigure() {
		return fFigureSelectLabelFigure;
	}

}
