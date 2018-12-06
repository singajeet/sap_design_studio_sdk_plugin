package com.armin.sap.ds.builder.core.common.shared;

public interface ISharedDataSubscriber {
	void onSharedDataChanged(String key, Object value);
}
