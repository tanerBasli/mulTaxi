package com.multaxi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taxibus.client.model.CoordinateModel;
import com.taxibus.client.model.response.TaxiNearUsersResponseModel;
import com.taxibus.client.model.response.UserNearTaxisResponseModel;

@RestController
public class TaxibusUserNearController {

	@RequestMapping(method= RequestMethod.POST ,value= "/getUserNearTaxis.json")
    public UserNearTaxisResponseModel getUserNearTaxis(HttpServletRequest request, CoordinateModel requestModel) {
        return new UserNearTaxisResponseModel();
    }
 
    @RequestMapping(method= RequestMethod.POST ,value="/getTaxiNearUsers.json")
    public TaxiNearUsersResponseModel getTaxiNearUsers(HttpServletRequest request, CoordinateModel requestModel) {
    	return new TaxiNearUsersResponseModel();
    }
}

