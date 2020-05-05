package com.taxibus.client.model.request;

public class OtpValidationRequestModel extends BaseClientRequestModel {
	
	private String smsCode;

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
}
