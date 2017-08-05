package com.srivastava.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware, ServletRequestAware{
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
			
			//HttpSession session = request.getSession(true);
			//session.setAttribute("uid", userid);
			sessionMap.put("uid", userid); // session.setAttribute("uid",userid);
			if(sessionMap.get("uid")==null){
				return "login";
			}
			this.setMsg("Welcome "+userid);
			return "success";
		}
		else{
			this.setMsg("Invalid Userid or Password");
			return "fail";
		}
		
	}

	
	private Map<String,Object> sessionMap ;
	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.sessionMap = map;
		
	}

	private HttpServletRequest request;
	@Override
	public void setServletRequest(HttpServletRequest req) {
		// TODO Auto-generated method stub
		this.request = req;
		
	}
}
