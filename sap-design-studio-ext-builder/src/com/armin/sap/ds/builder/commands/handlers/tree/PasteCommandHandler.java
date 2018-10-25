package com.armin.sap.ds.builder.navigator.tree.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISources;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.service.ClipboardOpsService;
import com.armin.sap.ds.builder.service.IClipboardOpsService;

public class PasteCommandHandler extends AbstractHandler {
	
	private ILog logger;
	
	public PasteCommandHandler() {
		logger = Activator.getDefault().getLog();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IClipboardOpsService service = PlatformUI.getWorkbench().getService(IClipboardOpsService.class);
		if(service == null) {
			service = new ClipboardOpsService();
		}
		
		IModel[] models = service.pasteModelsFromClipboard();
		TreeSelection treeNode = (TreeSelection)HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);		
		Object[] selectedNodes = treeNode.toArray();
		
		if(selectedNodes instanceof ExtensionCollectionNode[]) {
			ExtensionCollectionNode collection = (ExtensionCollectionNode)selectedNodes[0];
			for(IModel model : models) {
				collection.addExtension((Extension)model);
			}
		}
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), models.length + " Models pasted"));
		
		return null;
	}

}
