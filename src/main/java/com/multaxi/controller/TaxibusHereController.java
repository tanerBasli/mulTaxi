package com.multaxi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxibus.client.model.response.TokenModel;

@RestController
public class TaxibusHereController {

	@RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to Taxibus.";
    }
 
    @RequestMapping("/gettoken.json")
    public TokenModel message() {//REST Endpoint.
        return new TokenModel("TOKEN_DENEME");
    }
	
}
