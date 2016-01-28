package com.gregorydombchik.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloServiceAsync {
	void getMessage(AsyncCallback<Hello> callback);
	void setMessage(String message, AsyncCallback<Hello> callback);
}
