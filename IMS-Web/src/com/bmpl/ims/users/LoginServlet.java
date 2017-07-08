package com.bmpl.ims.users;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String password = request.getParameter("pwd");
		PrintWriter out= response.getWriter();
		if((userid==null && password==null)|| userid.trim().length()==0 && password.trim().length()==0 ){
		HttpSession session = request.getSession(false);
		if(session!=null){
			if(session.getAttribute("userid")!=null){
				response.sendRedirect("welcome");
				return ;
			}
			else
			{
				response.sendRedirect("index.html");
				return ;
			}
		}
		else
		{
			response.sendRedirect("index.html");
			return ;
		}
		}
		if( userid.equals(password)){
			HttpSession session = request.getSession(true);
			session.setAttribute("userid", userid);
			session.setAttribute("logintime", new Date());
			response.sendRedirect("welcome");
			//RequestDispatcher rd = request.getRequestDispatcher("welcome");
			//rd.forward(request, response);
			//response.sendRedirect("welcome?uid="+userid+"&logintime="+new Date());
		}
		else
		{
			out.println("Invalid Userid or Password");
		}
		out.close();
		
		
	}

}
