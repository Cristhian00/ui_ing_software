/*
* 
*/
package ui_concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy
		extends ui_concreta.diagram.edit.policies.Ui_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy() {
		super(ui_concreta.diagram.providers.Ui_concretaElementTypes.UserInterface_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Container_3001 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.ContainerCreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.IFrame_3012 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.IFrame2CreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Label_3013 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.Label2CreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Input_3014 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.Input2CreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Button_3015 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.Button2CreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Select_3016 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.Select2CreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Table_3017 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.Table2CreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Img_3018 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.Img2CreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Blockquote_3019 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.Blockquote2CreateCommand(req));
		}
		if (ui_concreta.diagram.providers.Ui_concretaElementTypes.Ul_3020 == req.getElementType()) {
			return getGEFWrapper(new ui_concreta.diagram.edit.commands.Ul2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
