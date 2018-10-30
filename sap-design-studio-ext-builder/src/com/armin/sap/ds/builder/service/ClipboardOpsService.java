package com.armin.sap.ds.builder.service;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.dnd.ProjectItemNodeTransfer;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

public class ClipboardOpsService implements IClipboardOpsService {

	private IServiceLocator _locator;
	private ILog logger;	
	private IClipboardTransferService _transferService;
	private Clipboard _clipboard;
	
	public ClipboardOpsService() {
		logger = Activator.getDefault().getLog();
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "ClipboardOpsService instance created"));		
		_transferService = new ClipboardTransferService();		
	}
	
	public ClipboardOpsService(IServiceLocator locator) {
		logger = Activator.getDefault().getLog();
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "ClipboardOpsService instance created"));		
		_locator = locator;
		locator.hasService(IHandlerService.class);
		
		_transferService = (IClipboardTransferService) _locator.getService(IClipboardTransferService.class);		
		if(_transferService == null) {
			_transferService = new ClipboardTransferService();
		}
	}

	@Override
	public void copyModelsToClipboard(IModel[] models) {
		_clipboard = new Clipboard(Activator.getDefault().getWorkbench().getDisplay());
		ProjectItemNodeTransfer transfer = (ProjectItemNodeTransfer)_transferService.getProjectItemNodeTransferInstance();
		
		Transfer[] transfers = new Transfer[] {transfer};
		Object[] data = new Object[] {models};
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), models.length + " Model(s) will be copied to Clipboard"));
		
		_clipboard.setContents(data, transfers);
		_clipboard.dispose();
	}

	@Override
	public IModel[] pasteModelsFromClipboard() {
		_clipboard = new Clipboard(Activator.getDefault().getWorkbench().getDisplay());
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "Available type names in clipboard..."));
		for(String typeName : _clipboard.getAvailableTypeNames()) {
			logger.log(new Status(IStatus.OK, this.getClass().getName(), "TypeName: " + typeName));
		}
		ProjectItemNodeTransfer transfer = (ProjectItemNodeTransfer)_transferService.getProjectItemNodeTransferInstance();
		
		Object obj = _clipboard.getContents(transfer);
		Object[] dataSet = null;
		IModel[] models = null;
		if(obj instanceof Object[]) {
			dataSet = (Object[])obj;
			models = new IModel[dataSet.length];
			logger.log(new Status(IStatus.OK, this.getClass().getName(), dataSet.length + " Model(s) will be pasted from Clipboard"));
			for(int i = 0; i < models.length; i++) {
				models[i] = (IModel)dataSet[i];
				logger.log(new Status(IStatus.OK, this.getClass().getName(), "Model pasted: " + (IModel)dataSet[i]));
			}		
		} else {
			logger.log(new Status(IStatus.OK, this.getClass().getName(), "1 Model(s) will be pasted from Clipboard"));
			models = new IModel[] {(IModel)obj};
			logger.log(new Status(IStatus.OK, this.getClass().getName(), "Model pasted: " + (IModel)obj));
		}
	
		_clipboard.dispose();
		
		return models;
	}

	@Override
	public boolean isContentAvailableForNode(IProjectItemNode node) {
		_clipboard = new Clipboard(Activator.getDefault().getWorkbench().getDisplay());
		TransferData[] dataTypes = _clipboard.getAvailableTypes();
		
		if(node instanceof ExtensionCollectionNode) {
			for(TransferData dataType : dataTypes) {
				if(ProjectItemNodeTransfer.getInstance().isSupportedType(dataType)) {
					return true;
				}
			}
		}
		
		return false;
	}

}
