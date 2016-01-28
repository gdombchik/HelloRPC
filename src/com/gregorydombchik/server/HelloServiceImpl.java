package com.gregorydombchik.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.gregorydombchik.client.Hello;
import com.gregorydombchik.client.HelloService;

public class HelloServiceImpl extends RemoteServiceServlet implements
		HelloService {
	
	@Override
	public Hello getMessage() {		
		return new Hello("This message is from Hello object");
	}

	public Hello setMessage(String message){
		return new Hello(message + " : Text added by HelloServiceImpl");
	}
}
