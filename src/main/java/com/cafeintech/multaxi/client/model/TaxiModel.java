package com.cafeintech.multaxi.client.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaxiModel extends UserModel {

	private String name;
	private String baggageType;
	private String maxUser;

}
