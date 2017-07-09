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

import com.bmpl.ims.common.SessionCheckListener;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome.ims")
public class WelcomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		HttpSession session  = request.getSession(false);
//		if(session == null){
//			response.sendRedirect("index.html");
//		}
//		else{
			String userid = (String)session.getAttribute("userid");
			Date logintime= (Date)session.getAttribute("logintime");
			String userType = request.getParameter("role");
		//String userid = request.getParameter("userid");
		//Date logintime= (Date)request.getAttribute("logintime");
		//String userid = request.getParameter("uid");
		//String logintime= request.getParameter("logintime");
			 userType = Integer.parseInt(userType)==10?"Admin":"Guest";
			 response.setContentType("text/html");
			out.println("<form action='logout.ims'>");
			out.println("<input type='submit' value='Logout'>");
			out.println("</form>");
		out.println("<h1>Welcome "+userid+" and Role is "+userType+" Login Time "+logintime+"  </h1>");
		out.println("<br> No of User Login "+SessionCheckListener.getCounter());
		response.setHeader("Cache-control", "no-cache, no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "-1");
		out.close();
		//}
	}

}
