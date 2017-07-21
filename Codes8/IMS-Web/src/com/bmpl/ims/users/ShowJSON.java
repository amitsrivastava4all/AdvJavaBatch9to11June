package com.bmpl.ims.users;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowJSON
 */
@WebServlet("/showjson")
public class ShowJSON extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String password = request.getParameter("pwd");
		System.out.println("JSON :::::: Userid "+userid+" Password "+password);
		PrintWriter out = response.getWriter();
		if(userid.equals(password)){
		String result = "{'message': 'Welcome User'}";
		out.println(result);
		}
		else{
			String result2 = "{'message': 'Invalid Userid or Password'}";
			out.println(result2);
		}
	}

}
