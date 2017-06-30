package com.bmpl.ims.users.views;

import java.sql.SQLException;
import java.util.Scanner;

import com.bmpl.ims.users.dao.UserDAO;

public class LoginView {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid ");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String pwd = scanner.next();
		UserDAO userDAO= new UserDAO();
		if(userDAO.read(userid, pwd)){
			System.out.println("Found...");
		}
		else
		{
			System.out.println("not Found..");
		}

	}

}
