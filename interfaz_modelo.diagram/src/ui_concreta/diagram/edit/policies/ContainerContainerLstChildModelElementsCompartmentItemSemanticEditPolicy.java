/*
* 
*/
package ui_concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ContainerContainerLstChildModelElementsCompartmentItemSemanticEditPolicy
		extends ui_concreta.diagram.edit.policies.Ui_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContainerContainerLstChildModelElementsCompartmentItemSemanticEditPolicy() {
		super(ui_concreta.diagram.providers.Ui_concretaElementTypes.Container_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Container_3002 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.Container2CreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.IFrame_3003 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.IFrameCreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Label_3004 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.LabelCreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Input_3005 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.InputCreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Button_3006 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.ButtonCreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Select_3007 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.SelectCreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Table_3008 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.TableCreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Img_3009 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.ImgCreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Blockquote_3010 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.BlockquoteCreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Ul_3011 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.UlCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
