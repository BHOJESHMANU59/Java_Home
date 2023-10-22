package com.restapi.response;

import org.springframework.http.HttpStatus;


public class ResponseStructure<T>
{
	private T Data;
	private HttpStatus httpStatus;
	public T getData() {
		return Data;
	}
	public void setData(T data) {
		Data = data;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
