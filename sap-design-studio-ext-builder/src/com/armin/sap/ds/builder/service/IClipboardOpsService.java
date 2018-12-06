package com.armin.sap.ds.builder.service;

import com.armin.sap.ds.builder.models.domain.IModel;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.IProjectItemNode;

public interface IClipboardOpsService {
	void copyModelsToClipboard(IModel[] models);
	IModel[] pasteModelsFromClipboard();
	boolean isContentAvailableForNode(IProjectItemNode node);
}
