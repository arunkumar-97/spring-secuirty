package com.jesperapps.loginuser.message;


public class LoginUserResponse {
	
	private int statusCode;
	private String responseMessage;
	
	public LoginUserResponse(int statusCode, String description) {
		this.statusCode = statusCode;
		this.responseMessage = description;
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	
}
