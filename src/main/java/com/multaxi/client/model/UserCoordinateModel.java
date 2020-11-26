package com.multaxi.client.model;

public class UserCoordinateModel extends BaseModel {

	private UserModel user;
	private CoordinateModel coordinate;
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public CoordinateModel getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(CoordinateModel coordinate) {
		this.coordinate = coordinate;
	}
	
	
}
