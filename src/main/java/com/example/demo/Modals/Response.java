package com.example.demo.Modals;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Response {

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List getResultObj() {
		return resultObj;
	}

	public void setResultObj(List resultObj) {
		this.resultObj = resultObj;
	}

	private String status;

	private String message;

	private List resultObj;
}
