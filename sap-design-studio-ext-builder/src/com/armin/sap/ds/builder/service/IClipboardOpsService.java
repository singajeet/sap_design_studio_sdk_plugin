package com.armin.sap.ds.builder.service;

import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

public interface IClipboardOpsService {
	void copyModelsToClipboard(IModel[] models);
	IModel[] pasteModelsFromClipboard();
	boolean isContentAvailableForNode(IProjectItemNode node);
}
