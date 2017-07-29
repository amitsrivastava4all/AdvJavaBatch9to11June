package com.srivastava.actions;

public class LoginAction {
	private String userid;
	private String pwd;
	private String msg;
	
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
