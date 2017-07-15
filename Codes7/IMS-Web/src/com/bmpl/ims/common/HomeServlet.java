package com.bmpl.ims.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet(name = "Home", urlPatterns = { "/home" })
public class HomeServlet extends HttpServlet {
	private int countHits;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		countHits++;
		out.println("<h1>Hello User"+ countHits+"</h1>");
		out.close();
	}

}
