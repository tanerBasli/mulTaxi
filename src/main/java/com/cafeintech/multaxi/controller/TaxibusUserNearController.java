package com.cafeintech.multaxi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafeintech.multaxi.client.model.CoordinateModel;
import com.cafeintech.multaxi.client.model.response.TaxiNearUsersResponseModel;
import com.cafeintech.multaxi.client.model.response.UserNearTaxisResponseModel;

@RestController
public class TaxibusUserNearController {

	@PostMapping("/getUserNearTaxis.json")
    public UserNearTaxisResponseModel getUserNearTaxis(HttpServletRequest request, CoordinateModel requestModel) {
        return new UserNearTaxisResponseModel();
    }
 
	@PostMapping("/getTaxiNearUsers.json")
    public TaxiNearUsersResponseModel getTaxiNearUsers(HttpServletRequest request, CoordinateModel requestModel) {
    	return new TaxiNearUsersResponseModel();
    }
}

