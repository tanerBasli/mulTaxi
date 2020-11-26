package com.multaxi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taxibus.client.model.request.LoginRequestModel;
import com.taxibus.client.model.request.OtpValidationRequestModel;
import com.taxibus.client.model.response.LoginResponseModel;

@RestController
public class TaxibusLoginController {

	@RequestMapping(method= RequestMethod.POST ,value= "/login.json")
    public LoginResponseModel login(HttpServletRequest request, @RequestBody LoginRequestModel requestModel) {
        return new LoginResponseModel("A123456");
    }
 
    @RequestMapping(method= RequestMethod.POST ,value="/checkOtp.json")
    public void checkOtp(HttpServletRequest request, @RequestBody OtpValidationRequestModel requestModel) {

    }
}

