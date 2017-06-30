package com.bmpl.ims.users.dao;

import static com.bmpl.ims.common.dao.CommonDAO.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO implements IUserDAO {

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean read(String userid , String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select userid, password from "
					+ "user_mst where userid='"+userid +"' and password ='"+password+"'");
			if(rs.next()){
				return true;
			}
			return false;
		}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(con!=null){
			con.close();
			}
		}
		
		
	}

}
