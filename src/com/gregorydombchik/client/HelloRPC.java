package com.gregorydombchik.client;


import com.gregorydombchik.client.Hello;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class HelloRPC implements EntryPoint {
	
	private final HelloServiceAsync helloService = GWT.create(HelloService.class);

	@Override
	public void onModuleLoad() {
		final Label label = new Label("Hello");
		
		/*helloService.getMessage(
		new AsyncCallback<Hello>() {
			public void onFailure(Throwable caught) {
				
			}

			public void onSuccess(Hello result) {
				label.setText(result.getMessage());
				RootPanel.get("nameFieldContainer").add(label);
			}
		});*/
		
		helloService.setMessage(
				new String("Initial Hello"), new AsyncCallback<Hello>() {
				public void onFailure(Throwable caught) {
					
				}
	
				public void onSuccess(Hello result) {
					label.setText(result.getMessage());
					RootPanel.get("nameFieldContainer").add(label);
				}
			});
	}
}
