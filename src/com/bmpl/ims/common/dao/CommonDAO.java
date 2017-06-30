package com.bmpl.ims.common.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CommonDAO {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		String dbURL = "jdbc:mysql://localhost:3306/imsdb";
		//Driver Load
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbURL,"root","");
		return con;
	}

}
