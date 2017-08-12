package com.srivastava.views;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srivastava.models.CalcBeanRemote;

/**
 * Servlet implementation class SumServlet
 */
@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	@EJB
	CalcBeanRemote remote;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int sum = remote.add(100, 200);
			response.getWriter().println("Sum is "+sum);
	}

}
