package com.bmpl.ims.users;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		HttpSession session  = request.getSession(false);
		if(session == null){
			response.sendRedirect("index.html");
		}
		else{
			String userid = (String)session.getAttribute("userid");
			Date logintime= (Date)session.getAttribute("logintime");
		//String userid = request.getParameter("userid");
		//Date logintime= (Date)request.getAttribute("logintime");
		//String userid = request.getParameter("uid");
		//String logintime= request.getParameter("logintime");
		out.println("<h1>Welcome "+userid+" Login Time "+logintime+"  </h1>");
		out.close();
		}
	}

}
