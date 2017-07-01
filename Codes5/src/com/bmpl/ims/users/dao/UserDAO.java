package com.bmpl.ims.users.dao;

import static com.bmpl.ims.common.dao.CommonDAO.getConnection;
import static com.bmpl.ims.common.dao.CommonSQL.LOGIN_SQL;
import static com.bmpl.ims.common.dao.CommonSQL.REGISTER_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bmpl.ims.users.dto.UserDTO;

public class UserDAO implements IUserDAO {

	@Override
	public int add(UserDTO userDTO) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			con = getConnection();
			pstmt = con.prepareStatement(REGISTER_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			pstmt.setInt(3, Integer.parseInt(userDTO.getPinCode()));
			int recordCount = pstmt.executeUpdate();
			return recordCount;
		}
		finally{
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
		
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
	public boolean read(UserDTO userDTO) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		//Statement stmt = null;
		ResultSet rs = null;
		try{
			con = getConnection();
			pstmt = con.prepareStatement(LOGIN_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			//pstmt.setInt(3 ,Integer.parseInt(userDTO.getPinCode()));
			rs = pstmt.executeQuery();
			//stmt = con.createStatement();
			/*rs = stmt.executeQuery("select userid, password from "
					+ "user_mst where"
					+ " userid='"+userDTO.getUserid() +
					"' and password ='"+userDTO.getPassword()+"'"
					+" and pincode="+userDTO.getPinCode());*/
			if(rs.next()){
				return true;
			}
			return false;
		}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
			con.close();
			}
		}
		
		
	}

}
