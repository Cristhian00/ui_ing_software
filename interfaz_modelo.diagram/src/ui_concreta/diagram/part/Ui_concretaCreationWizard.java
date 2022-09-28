/*
 * 
 */
package ui_concreta.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class Ui_concretaCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected ui_concreta.diagram.part.Ui_concretaCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected ui_concreta.diagram.part.Ui_concretaCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ui_concreta.diagram.part.Messages.Ui_concretaCreationWizardTitle);
		setDefaultPageImageDescriptor(ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewUi_concretaWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new ui_concreta.diagram.part.Ui_concretaCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "ui_concreta_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(ui_concreta.diagram.part.Messages.Ui_concretaCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				ui_concreta.diagram.part.Messages.Ui_concretaCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ui_concreta.diagram.part.Ui_concretaCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "ui_concreta") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".ui_concreta_diagram".length()); //$NON-NLS-1$
					setFileName(ui_concreta.diagram.part.Ui_concretaDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "ui_concreta")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(ui_concreta.diagram.part.Messages.Ui_concretaCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				ui_concreta.diagram.part.Messages.Ui_concretaCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = ui_concreta.diagram.part.Ui_concretaDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ui_concreta.diagram.part.Ui_concretaDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								ui_concreta.diagram.part.Messages.Ui_concretaCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						ui_concreta.diagram.part.Messages.Ui_concretaCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
