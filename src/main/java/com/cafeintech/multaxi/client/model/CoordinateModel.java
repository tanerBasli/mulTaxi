package com.multaxi.client.model;

public class CoordinateModel extends BaseModel {

	private String longitude;
	private String latitude;
	private String maxDistance;

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(String maxDistance) {
		this.maxDistance = maxDistance;
	}

}
