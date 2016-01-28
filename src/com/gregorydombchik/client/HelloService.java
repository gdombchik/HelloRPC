package com.gregorydombchik.client;

import com.gregorydombchik.client.Hello;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("hello")
public interface HelloService extends RemoteService {
	public Hello getMessage();
	public Hello setMessage(String message);
}
