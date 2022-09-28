/*
 * 
 */
package ui_concreta.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ui_concreta.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		ui_concreta.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		ui_concreta.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		ui_concreta.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		ui_concreta.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
