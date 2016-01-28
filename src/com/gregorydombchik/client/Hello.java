package com.gregorydombchik.client;

import java.io.Serializable;

public class Hello implements Serializable {
	private String message;
	
	public Hello(){
	}
	
	public Hello(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
