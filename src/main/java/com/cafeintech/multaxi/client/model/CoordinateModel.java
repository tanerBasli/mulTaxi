package com.cafeintech.multaxi.client.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CoordinateModel extends BaseModel {

	private String longitude;
	private String latitude;
	private String maxDistance;

}
