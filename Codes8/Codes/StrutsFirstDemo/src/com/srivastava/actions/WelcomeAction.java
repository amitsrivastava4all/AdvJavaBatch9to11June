package com.srivastava.actions;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport{ //implements Action{
	private String message = "Welcome ";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String execute(){
		String msg = this.getText("message");
		this.setMessage(msg+new Date());
		return SUCCESS;
	}
	
	public String show()
	{
		String msg = this.getText("message");
		this.setMessage(msg+new Date());
		return SUCCESS;
	}
	

}
