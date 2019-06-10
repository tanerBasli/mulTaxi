package com.cafeintech.multaxi.client.model;

import java.util.List;

public class UserModel extends BaseModel {

	private String userId;
	
	private String deviceId;
	
	private List<GsmModel> gsm;

	private List<String> settings;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public List<GsmModel> getGsm() {
		return gsm;
	}

	public void setGsm(List<GsmModel> gsm) {
		this.gsm = gsm;
	}

	public List<String> getSettings() {
		return settings;
	}

	public void setSettings(List<String> settings) {
		this.settings = settings;
	}

}
