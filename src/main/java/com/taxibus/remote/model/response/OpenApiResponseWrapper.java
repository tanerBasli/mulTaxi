package com.taxibus.remote.model.response;

public class OpenApiResponseWrapper<T> {

	private OpenApiReturn<T> response;

	public OpenApiReturn<T> getResponse() {
		return response;
	}

	public void setResponse(OpenApiReturn<T> response) {
		this.response = response;
	}

}
