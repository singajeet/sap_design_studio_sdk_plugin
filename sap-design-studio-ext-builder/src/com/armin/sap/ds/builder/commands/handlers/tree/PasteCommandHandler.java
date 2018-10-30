package com.armin.sap.ds.builder.commands.handlers.tree;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISources;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.jobs.TransferExtensionFromClipboardJob;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;
import com.armin.sap.ds.builder.refactor.RefactorExtensionModel;
import com.armin.sap.ds.builder.service.ClipboardOpsService;
import com.armin.sap.ds.builder.service.IClipboardOpsService;

public class PasteCommandHandler extends AbstractHandler {
	
	private ILog logger;
	private ExtensionCollectionNode collection;
	
	public PasteCommandHandler() {
		logger = Activator.getDefault().getLog();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		TreeSelection treeNode = (TreeSelection)HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);		
		Object[] selectedNodes = treeNode.toArray();		
		
		if(selectedNodes[0] instanceof ExtensionCollectionNode) {
			collection = (ExtensionCollectionNode)selectedNodes[0];
			
			IClipboardOpsService service = PlatformUI.getWorkbench().getService(IClipboardOpsService.class);
			
			if(service == null) {
				service = new ClipboardOpsService();
			}
			
			IModel[] models = service.pasteModelsFromClipboard();
			for(int i=0; i < models.length; i++) {
				if(models[i] instanceof Extension) {
					Extension sourceModel = (Extension)models[i];
					if(collection.exists(sourceModel)) {
						InputDialog renameDlg = new InputDialog(null, "ID Conflict", 
								"Enter a new ID for '" + sourceModel.getId() + "': ", sourceModel.getId(), null);
						renameDlg.setBlockOnOpen(true);
						int result = renameDlg.open();
						if(result == InputDialog.OK) {
							String newID = renameDlg.getValue();
							String oldID = sourceModel.getId();
							if(!newID.toUpperCase().equals(sourceModel.getId().toUpperCase())){
								RefactorExtensionModel refactor = new RefactorExtensionModel(sourceModel);
								refactor.renameId(oldID, newID);
								refactor.rename(oldID, newID);
								
							} else {
								models[i] = null;
							}
						} else {
							models[i] = null;
						}
					}
				}
			}			
			WorkspaceJob job = new TransferExtensionFromClipboardJob(models, collection);		
			job.setRule(collection.getProject());
			job.schedule();
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Workspace job has been scheduled"));
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setEnabled(evaluationContext);
		IEvaluationContext context = (IEvaluationContext)evaluationContext;
		Object selectedObj = context.getVariable(ISources.ACTIVE_CURRENT_SELECTION_NAME);
		Object element = null;
		
		if(selectedObj instanceof TreeSelection) {
			TreeSelection treeNode = (TreeSelection)selectedObj;
			element = treeNode.getFirstElement();
		}else if(selectedObj instanceof StructuredSelection) {
			StructuredSelection selection = (StructuredSelection)selectedObj;
			element = selection.getFirstElement();
		}	
			
		IClipboardOpsService service = PlatformUI.getWorkbench().getService(IClipboardOpsService.class);
		if(service == null) {
			service = new ClipboardOpsService();
		}
		
		if(service.isContentAvailableForNode((IProjectItemNode)element))
			this.setBaseEnabled(true);
		else
			this.setBaseEnabled(false);	
		 
	}

}
