package com.cafeintech.multaxi.client.model.response;

public class LoginResponseModel extends BaseClientResponseModel {

	private String authCode;

	public LoginResponseModel(String authCode) {
		super();
		this.authCode = authCode;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	
}
