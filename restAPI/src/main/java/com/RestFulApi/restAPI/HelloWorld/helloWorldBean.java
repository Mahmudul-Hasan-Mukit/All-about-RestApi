package com.RestFulApi.restAPI.HelloWorld;

public class helloWorldBean {
	private String message;
	helloWorldBean(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "helloWorldBean [message=" + message + "]";
	}
	
	
}
