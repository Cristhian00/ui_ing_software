/*
 * 
 */
package ui_concreta.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Ui_concretaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userInterfaceTitle_5021Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceTitle_5021Parser() {
		if (userInterfaceTitle_5021Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concreta.Ui_concretaPackage.eINSTANCE.getUserInterface_Title() };
			ui_concreta.diagram.parsers.MessageFormatParser parser = new ui_concreta.diagram.parsers.MessageFormatParser(
					features);
			userInterfaceTitle_5021Parser = parser;
		}
		return userInterfaceTitle_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser iFrameTitle_5009Parser;

	/**
	* @generated
	*/
	private IParser getIFrameTitle_5009Parser() {
		if (iFrameTitle_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concreta.Ui_concretaPackage.eINSTANCE.getModelElement_Title() };
			ui_concreta.diagram.parsers.MessageFormatParser parser = new ui_concreta.diagram.parsers.MessageFormatParser(
					features);
			iFrameTitle_5009Parser = parser;
		}
		return iFrameTitle_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser selectTitle_5004Parser;

	/**
	* @generated
	*/
	private IParser getSelectTitle_5004Parser() {
		if (selectTitle_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concreta.Ui_concretaPackage.eINSTANCE.getModelElement_Title() };
			ui_concreta.diagram.parsers.MessageFormatParser parser = new ui_concreta.diagram.parsers.MessageFormatParser(
					features);
			selectTitle_5004Parser = parser;
		}
		return selectTitle_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser iFrameTitle_5012Parser;

	/**
	* @generated
	*/
	private IParser getIFrameTitle_5012Parser() {
		if (iFrameTitle_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concreta.Ui_concretaPackage.eINSTANCE.getModelElement_Title() };
			ui_concreta.diagram.parsers.MessageFormatParser parser = new ui_concreta.diagram.parsers.MessageFormatParser(
					features);
			iFrameTitle_5012Parser = parser;
		}
		return iFrameTitle_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser selectTitle_5016Parser;

	/**
	* @generated
	*/
	private IParser getSelectTitle_5016Parser() {
		if (selectTitle_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concreta.Ui_concretaPackage.eINSTANCE.getModelElement_Title() };
			ui_concreta.diagram.parsers.MessageFormatParser parser = new ui_concreta.diagram.parsers.MessageFormatParser(
					features);
			selectTitle_5016Parser = parser;
		}
		return selectTitle_5016Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ui_concreta.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID:
			return getUserInterfaceTitle_5021Parser();
		case ui_concreta.diagram.edit.parts.IFrameTitleEditPart.VISUAL_ID:
			return getIFrameTitle_5009Parser();
		case ui_concreta.diagram.edit.parts.SelectTitleEditPart.VISUAL_ID:
			return getSelectTitle_5004Parser();
		case ui_concreta.diagram.edit.parts.IFrameTitle2EditPart.VISUAL_ID:
			return getIFrameTitle_5012Parser();
		case ui_concreta.diagram.edit.parts.SelectTitle2EditPart.VISUAL_ID:
			return getSelectTitle_5016Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ui_concreta.diagram.providers.Ui_concretaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
