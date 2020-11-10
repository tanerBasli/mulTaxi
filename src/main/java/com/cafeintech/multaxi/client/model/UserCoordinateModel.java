package com.cafeintech.multaxi.client.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserCoordinateModel extends BaseModel {

	private UserModel user;
	private CoordinateModel coordinate;
	
}
