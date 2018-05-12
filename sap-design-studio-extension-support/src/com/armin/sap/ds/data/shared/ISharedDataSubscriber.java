package com.armin.sap.ds.data.shared;

public interface ISharedDataSubscriber {
	void onSharedDataChanged(String key, Object value);
}
