package com.cafeintech.multaxi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cafeintech.multaxi.client.model.request.LoginRequestModel;
import com.cafeintech.multaxi.client.model.request.OtpValidationRequestModel;
import com.cafeintech.multaxi.client.model.response.LoginResponseModel;

@RestController
public class TaxibusLoginController {

	@PostMapping("/login.json")
    public LoginResponseModel login(HttpServletRequest request, @RequestBody LoginRequestModel requestModel) {
        return new LoginResponseModel("A123456");
    }
 
	@PostMapping("/checkOtp.json")
    public void checkOtp(HttpServletRequest request, @RequestBody OtpValidationRequestModel requestModel) {
    	/**
    	 * TODO: OTP control must be impelemted
    	 */
    	
    }
}

