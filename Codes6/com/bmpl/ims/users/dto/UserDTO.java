package com.bmpl.ims.users.dto;

public class UserDTO {
	
	private String userid;
	private String password;
	private String status;
	private String pinCode;
	
	public UserDTO(String userid, String password){
		this.userid = userid;
		this.password = password;
	}
	
	public UserDTO(String userid, String password, String pinCode,String status){
		this.userid = userid;
		this.password = password;
		this.pinCode = pinCode;
	}
	
	public UserDTO(String userid, String password, String status){
		this.userid = userid;
		this.password = password;
		this.status = status;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	

}
