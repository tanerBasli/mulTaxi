package com.cafeintech.multaxi.client.model;

public class TaxiModel extends UserModel {

	private String name;
	private String baggageType;
	private String maxUser;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBaggageType() {
		return baggageType;
	}

	public void setBaggageType(String baggageType) {
		this.baggageType = baggageType;
	}

	public String getMaxUser() {
		return maxUser;
	}

	public void setMaxUser(String maxUser) {
		this.maxUser = maxUser;
	}

}
