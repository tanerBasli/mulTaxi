package com.cafeintech.multaxi.client.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserModel extends BaseModel {

	private String userId;
	private String deviceId;
	private List<GsmModel> gsm;
	private List<String> settings;

}
