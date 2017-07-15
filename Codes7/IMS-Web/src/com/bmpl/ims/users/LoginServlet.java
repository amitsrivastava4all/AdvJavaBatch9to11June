package com.bmpl.ims.users;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		HttpSession session = request.getSession(false);  // Checking Session is Exist or not
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
			boolean isCookiePresent = false;
			// Check Cookie is Present or Not
			Cookie cookies[] = request.getCookies();
			if(cookies!=null && cookies.length>0){
				for(Cookie cookie : cookies){
					if(cookie.getName().equals("mycolor")){
						isCookiePresent = true;
						break;
					}
				}
			}
			if(!isCookiePresent){
				String color = request.getParameter("favcolor");
				Cookie cookie = new Cookie("mycolor",color);
				cookie.setMaxAge(365*24*60*60);
				response.addCookie(cookie);
			}
//			HttpSession session = request.getSession();
//			if(session.isNew()){
//				session.setAttribute(arg0, arg1);
//			}
			response.setHeader("Cache-control", "no-cache, no-store");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			HttpSession session = request.getSession(true);  // It create a new session
			session.setAttribute("userid", userid);
			session.setAttribute("logintime", new Date());
			String userType= request.getParameter("role");
			String branch = request.getParameter("branch");
			response.sendRedirect("welcome.ims?role="+userType+"&branch="+branch);
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
