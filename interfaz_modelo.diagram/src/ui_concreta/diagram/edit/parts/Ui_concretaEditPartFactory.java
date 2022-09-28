/*
 * 
 */
package ui_concreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Ui_concretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view)) {

			case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.UI_DiagramEditPart(view);

			case ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.UserInterfaceEditPart(view);

			case ui_concreta.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.UserInterfaceTitleEditPart(view);

			case ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.ContainerEditPart(view);

			case ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.Container2EditPart(view);

			case ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.IFrameEditPart(view);

			case ui_concreta.diagram.edit.parts.IFrameTitleEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.IFrameTitleEditPart(view);

			case ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.LabelEditPart(view);

			case ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.InputEditPart(view);

			case ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.ButtonEditPart(view);

			case ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.SelectEditPart(view);

			case ui_concreta.diagram.edit.parts.SelectTitleEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.SelectTitleEditPart(view);

			case ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.TableEditPart(view);

			case ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.ImgEditPart(view);

			case ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.BlockquoteEditPart(view);

			case ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.UlEditPart(view);

			case ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.IFrame2EditPart(view);

			case ui_concreta.diagram.edit.parts.IFrameTitle2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.IFrameTitle2EditPart(view);

			case ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.Label2EditPart(view);

			case ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.Input2EditPart(view);

			case ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.Button2EditPart(view);

			case ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.Select2EditPart(view);

			case ui_concreta.diagram.edit.parts.SelectTitle2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.SelectTitle2EditPart(view);

			case ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.Table2EditPart(view);

			case ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.Img2EditPart(view);

			case ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.Blockquote2EditPart(view);

			case ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.Ul2EditPart(view);

			case ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart(
						view);

			case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart(
						view);

			case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart(
						view);

			case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart(view);

			case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
