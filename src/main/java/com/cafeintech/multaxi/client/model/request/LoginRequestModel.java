package com.cafeintech.multaxi.client.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginRequestModel extends BaseClientRequestModel {

	private String userName;
	private String password;
	
}
