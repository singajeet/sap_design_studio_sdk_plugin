package com.armin.sap.ds.builder.commands.handlers.tree;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.ui.ISources;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.dnd.ProjectItemNodeTransfer;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;
import com.armin.sap.ds.builder.service.ClipboardOpsService;
import com.armin.sap.ds.builder.service.IClipboardOpsService;

public class CutCommandHandler extends AbstractHandler {

	ProjectItemNodeTransfer _transfer;
	Clipboard _clipboard;
	private ILog logger;
	
	public CutCommandHandler() {
		logger = Activator.getDefault().getLog();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		TreeSelection treeNode = (TreeSelection)HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);		
		Object[] selectedNodes = treeNode.toArray();
		IModel[] dataModels = new IModel[selectedNodes.length];
		for(int i=0;i<selectedNodes.length; i++) {
			IProjectItemNode node = (IProjectItemNode)selectedNodes[i];
			IModel model = node.getModel();
			dataModels[i] = model;
			
			IProjectItemNode parentNode = (IProjectItemNode)node.getParent(null);
			parentNode.removeItem(node);
		}
		IClipboardOpsService service = PlatformUI.getWorkbench().getService(IClipboardOpsService.class);
		if(service == null) {
			service = new ClipboardOpsService();
		}
		logger.log(new Status(IStatus.OK, this.getClass().getName(), dataModels.length + " Model(s) will be copied to Clipboard"));
		service.copyModelsToClipboard(dataModels);
		return null;
	}

}
