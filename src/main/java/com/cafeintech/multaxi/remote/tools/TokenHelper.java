package com.multaxi.remote.tools;

import com.taxibus.remote.model.response.TokenResponseModel;

public class TokenHelper {

	private TokenResponseModel token;

	private static TokenHelper tokenHelper;

	private TokenHelper() {
		
//		TimerTask timertask = new TimerTask() {
//			@Override
//			public void run() {
//				token = new TaxiBusWebServiceCallHelper().createTokenResponse();
//			}
//		};
//
//		Timer timer = new Timer();
//		timer.schedule(timertask, 0, token.getExpiresIn());
	}

	public synchronized static TokenHelper getInstance() {
		if (tokenHelper == null) {
			tokenHelper = new TokenHelper();
		}
		return tokenHelper;
	}

	public String getToken() {
		if(token == null) {
			this.token = new TaxiBusWebServiceCallHelper().createTokenResponse();
		}
		return token.getTokenType() + " " + token.getAccessToken();
	}

}
