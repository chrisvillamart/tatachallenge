package com.example.dto;

public class ResultDTO {
    int code;
    String message;
    Object Result;
    
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResult() {
		return Result;
	}
	public void setResult(Object result) {
		Result = result;
	} 
    
}
