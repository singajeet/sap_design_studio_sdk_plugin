package com.armin.sap.ds.builder.shared;

public interface ISharedDataSubscriber {
	void onSharedDataChanged(String key, Object value);
}
