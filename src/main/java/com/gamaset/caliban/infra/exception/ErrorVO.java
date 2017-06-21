package com.gamaset.caliban.infra.exception;

import java.util.List;

/**
 * 
 * @author Christopher Rozario
 *
 * @since
 */
public class ErrorVO {

	private Integer code;
	private String message;
	private List<String> errors;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

}
