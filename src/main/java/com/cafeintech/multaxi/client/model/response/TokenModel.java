package com.cafeintech.multaxi.client.model.response;

public class TokenModel extends BaseClientResponseModel {

	private String token;

	public TokenModel(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
