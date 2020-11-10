package com.cafeintech.multaxi.client.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GsmModel extends BaseModel {

	private String countryCode;
	private String areaCode;
	private String number;
	private String fullNumber;
	
}
