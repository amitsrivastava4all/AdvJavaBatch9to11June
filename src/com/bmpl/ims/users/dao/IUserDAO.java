package com.bmpl.ims.users.dao;

import java.sql.SQLException;

public interface IUserDAO {
	
	int add();
	
	int delete();
	
	int update();
	
	boolean read(String userid , String password) throws ClassNotFoundException, SQLException;

}
