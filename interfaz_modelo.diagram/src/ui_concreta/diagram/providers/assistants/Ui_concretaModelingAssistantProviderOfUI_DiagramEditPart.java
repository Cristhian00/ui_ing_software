/*
 * 
 */
package ui_concreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Ui_concretaModelingAssistantProviderOfUI_DiagramEditPart
		extends ui_concreta.diagram.providers.Ui_concretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.UserInterface_2001);
		return types;
	}

}
