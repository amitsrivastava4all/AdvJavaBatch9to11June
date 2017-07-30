package com.srivastava.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userid;
	private String pwd;
	private String msg;
	
	@Override
	public void validate(){
		
		if(this.getUserid().length()==0)
		{
			this.addFieldError("userid", this.getText("loginform.useriderror"));
		}
		if(this.getPwd().length()==0)
		{
			this.addFieldError("pwd", this.getText("loginform.pwderror"));
		}
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String login(){
		if(userid.equals(pwd)){
			
			this.setMsg("Welcome "+userid);
			return "success";
		}
		else{
			this.setMsg("Invalid Userid or Password");
			return "fail";
		}
		
	}
}
