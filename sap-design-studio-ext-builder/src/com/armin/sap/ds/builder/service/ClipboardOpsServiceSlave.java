package com.armin.sap.ds.builder.service;

import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.api.models.domain.IModel;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.IProjectItemNode;

public class ClipboardOpsServiceSlave implements IClipboardOpsService {

	private IServiceLocator _locator;
	private IClipboardOpsService _parentService;
	
	public ClipboardOpsServiceSlave(IServiceLocator locator, IClipboardOpsService parentService) {
		_locator = locator;
		_parentService = parentService;
		_locator.hasService(IHandlerService.class);
	}

	@Override
	public void copyModelsToClipboard(IModel[] models) {
		_parentService.copyModelsToClipboard(models);
	}

	@Override
	public IModel[] pasteModelsFromClipboard() {
		return _parentService.pasteModelsFromClipboard();
	}

	@Override
	public boolean isContentAvailableForNode(IProjectItemNode node) {		
		return _parentService.isContentAvailableForNode(node);
	}

}
