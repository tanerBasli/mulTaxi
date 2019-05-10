package com.cafeintech.multaxi.client.model.response;


import java.util.List;

import com.cafeintech.multaxi.client.model.UserCoordinateModel;

public class TaxiNearUsersResponseModel extends BaseClientResponseModel {

	private UserCoordinateModel user;

	private List<UserCoordinateModel> otherUsers;

	public UserCoordinateModel getUser() {
		return user;
	}

	public void setUser(UserCoordinateModel user) {
		this.user = user;
	}

	public List<UserCoordinateModel> getOtherUsers() {
		return otherUsers;
	}

	public void setOtherUsers(List<UserCoordinateModel> otherUsers) {
		this.otherUsers = otherUsers;
	}
}
