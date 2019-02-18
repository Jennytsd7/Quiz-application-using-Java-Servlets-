package com.Quizzer.code.model;

import java.util.List;

public class Response {

	private String status;
	private String errorMessage;
	private List<?> listResponse;
	public Response(String status, String errorMessage, List<?> response) {
		super();
		this.status = status;
		this.errorMessage = errorMessage;
		this.listResponse = response;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<?> getResponse() {
		return listResponse;
	}
	public void setResponse(List<?> response) {
		this.listResponse = response;
	}
	
	
}