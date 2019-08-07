package com.cafeintech.multaxi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafeintech.multaxi.client.model.response.TokenModel;
import com.cafeintech.multaxi.controller.util.RandomStringGenerator;

@RestController
public class TaxibusHereController {

	@RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to Taxibus.";
    }
 
    @RequestMapping("/gettoken.json")
    public TokenModel message() {//REST Endpoint.
    	
    	RandomStringGenerator generator = new RandomStringGenerator();
    	
        return new TokenModel(generator.randomString(32));
    }
	
}
