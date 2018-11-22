package com.armin.sap.ds.builder.jobs;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.domain.Extension;
import com.armin.sap.ds.builder.api.models.domain.IModel;
import com.armin.sap.ds.builder.ui.navigation.tree.TreeNodeAccessMode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionCollectionNode;

public class TransferExtensionFromClipboardJob extends WorkspaceJob {


	private IModel[] _extensionModels;
	private ILog logger;
	private ExtensionCollectionNode _parentNode;
	
	public TransferExtensionFromClipboardJob(IModel[] source, ExtensionCollectionNode targetNode) {
		super("Copy Extensions Models under selected Extension Collection");
		_extensionModels = source;	
		_parentNode = targetNode;		
		logger = Activator.getDefault().getLog();
	}
	
	public TransferExtensionFromClipboardJob(String name, IModel[] source, ExtensionCollectionNode targetNode, IProject project) {
		this(source, targetNode);
		this.setName(name);
	}

	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
		for(int i = 0; i < _extensionModels.length; i++) {
			IModel model = _extensionModels[i];
			try {
				if(model != null)
					_parentNode.setAccessMode(TreeNodeAccessMode.EDIT);
					_parentNode.addExtension((Extension)model);
					_parentNode.setAccessMode(TreeNodeAccessMode.READ_ONLY);
			} catch (Exception e) {				
				e.printStackTrace();
				return Status.CANCEL_STATUS;
			}						
		}
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), _extensionModels.length + " Models pasted"));							
		return Status.OK_STATUS;
	}

}
