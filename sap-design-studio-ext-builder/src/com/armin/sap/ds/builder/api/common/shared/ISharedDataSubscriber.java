package com.armin.sap.ds.builder.api.common.shared;

public interface ISharedDataSubscriber {
	void onSharedDataChanged(String key, Object value);
}
