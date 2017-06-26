package com.gamaset.caliban.vo;

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

	
	public ErrorVO(Integer code, String message, List<String> errors) {
		this.code = code;
		this.message = message;
		this.errors = errors;
	}
	public Integer getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	public List<String> getErrors() {
		return errors;
	}

}
