package com.bmpl.ims.common.dao;

public interface CommonSQL {
	String LOGIN_SQL = "select userid ,password from user_mst where userid=? "
			+ "and password=? ";
	String REGISTER_SQL = "insert into user_mst (userid,password,pincode) "
			+ "values(?,?,?)";

}
