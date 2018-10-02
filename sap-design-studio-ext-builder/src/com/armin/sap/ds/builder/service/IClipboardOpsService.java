package com.armin.sap.ds.builder.service;

import com.armin.sap.ds.builder.api.models.IModel;

public interface IClipboardOpsService {
	void copyModelsToClipboard(IModel[] models);
	IModel[] pasteModelsFromClipboard();
}
