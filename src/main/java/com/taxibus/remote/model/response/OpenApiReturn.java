package com.taxibus.remote.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenApiReturn<T> {

	@JsonProperty(value = "return")
	private T ret;

	public T getRet() {
		return ret;
	}

	public void setRet(T ret) {
		this.ret = ret;
	}

}
