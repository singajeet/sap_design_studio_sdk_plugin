package com.armin.sap.ds.builder.commands.handlers.edit;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.dnd.ProjectItemNodeTransfer;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.IProjectItemNode;

public class DeleteCommandHandler extends AbstractHandler {

	ProjectItemNodeTransfer _transfer;
	Clipboard _clipboard;
	private ILog logger;
	
	public DeleteCommandHandler() {
		logger = Activator.getDefault().getLog();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		TreeSelection treeNode = (TreeSelection)HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);		
		Object[] selectedNodes = treeNode.toArray();
		
		for(int i=0;i<selectedNodes.length; i++) {
			IProjectItemNode node = (IProjectItemNode)selectedNodes[i];
			IProjectItemNode parentNode = (IProjectItemNode)node.getParent(null);
			parentNode.removeItem(node);
		}
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), selectedNodes.length + " Model(s) will be copied to Clipboard"));
		
		return null;
	}

}
