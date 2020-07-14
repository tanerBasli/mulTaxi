package com.cafeintech.multaxi.client.model;

import java.io.Serializable;

public class BaseModel implements Serializable {

	private static final long serialVersionUID = -3463693460375367136L;
	private String token;
	private String username;
	private String date;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
