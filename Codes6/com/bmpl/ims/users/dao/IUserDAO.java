package com.bmpl.ims.users.dao;

import java.sql.SQLException;

import com.bmpl.ims.users.dto.UserDTO;

public interface IUserDAO {
	
	int add(UserDTO userDTO) throws ClassNotFoundException, SQLException;
	
	int delete();
	
	int update();
	
	boolean read(UserDTO userDTO) throws ClassNotFoundException, SQLException;

}
