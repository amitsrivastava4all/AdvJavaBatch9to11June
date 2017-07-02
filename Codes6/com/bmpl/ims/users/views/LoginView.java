package com.bmpl.ims.users.views;

import java.sql.SQLException;
import java.util.Scanner;

import com.bmpl.ims.users.dao.UserDAO;
import com.bmpl.ims.users.dto.UserDTO;

public class LoginView {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid ");
		String userid = scanner.nextLine();
		System.out.println("Enter the Password");
		String pwd = scanner.nextLine();
		System.out.println("Enter the Pincode");
		String pinCode = scanner.nextLine();
		UserDAO userDAO= new UserDAO();
		UserDTO userDTO = new UserDTO(userid, pwd,pinCode,"A");
		if(userDAO.read(userDTO)){
			System.out.println("Found...");
		}
		else
		{
			System.out.println("not Found..");
		}

	}

}
