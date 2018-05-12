package com.armin.sap.ds.data.shared;

public interface ISharedData {

	Object getData(String key);
	void setData(String key, Object data);
	void registerSubscriber(ISharedDataSubscriber subscriber);
	void unregisterSubscriber(ISharedDataSubscriber subscriber);
	void notifySubscribers(String key, Object value);
}