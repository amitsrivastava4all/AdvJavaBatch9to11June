package com.srivastava.actions;

import java.util.Date;

public class WelcomeAction {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String execute(){
		this.setMessage("Welcome User "+new Date());
		return "success";
	}
	

}
