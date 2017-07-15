package com.bmpl.ims.users;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/logout.ims")
public class LogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session  = request.getSession(false);
		String phone = this.getServletConfig().getServletContext().getInitParameter("tollfree");
		String email = this.getServletConfig().getInitParameter("email");
//		if(session == null){
//			response.sendRedirect("index.html");
//		}
//		else{
			Enumeration<String> attr = session.getAttributeNames();
			while(attr.hasMoreElements()){
				session.removeAttribute(attr.nextElement());
			}
			
			//session.removeAttribute("logintime");
			session.invalidate();
			out.println("U Logout SuccessFully... Email is "+email+ " Phone is "+phone);
			response.setHeader("Cache-control", "no-cache, no-store");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
		//}
	}

}
