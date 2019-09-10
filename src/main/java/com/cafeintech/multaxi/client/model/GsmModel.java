package com.cafeintech.multaxi.client.model;

public class GsmModel extends BaseModel {

	private String countryCode;
	private String areaCode;
	private String number;
	private String fullNumber;
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getFullNumber() {
		return fullNumber;
	}
	public void setFullNumber(String fullNumber) {
		this.fullNumber = fullNumber;
	}
	
}
