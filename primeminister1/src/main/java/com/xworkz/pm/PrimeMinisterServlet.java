package com.xworkz.pm;

import java.io.IOException;

//import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 8, urlPatterns = "/prime")
public class PrimeMinisterServlet extends HttpServlet {

	public PrimeMinisterServlet() {
		System.out.println("created cunstructor of PMServlet");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost method...... ");
		resp.setContentType("text/html");
		String name1 = req.getParameter("name");
		String country1 = req.getParameter("country");
		String marriage1 = req.getParameter("marriage");
		String party1 = req.getParameter("party");
		String age1 = req.getParameter("age");
		String gender1 = req.getParameter("gender");
		String period1 = req.getParameter("period");
		String time1 = req.getParameter("time");

		req.setAttribute("Nm", name1);
		req.setAttribute("Ctry", country1);
		req.setAttribute("Mrg", marriage1);
		req.setAttribute("Prty", party1);
		req.setAttribute("Ag", age1);
		req.setAttribute("Gndr", gender1);
		req.setAttribute("Prd", period1);
		req.setAttribute("Tm", time1);
	
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/success.jsp");
		requestDispatcher.forward(req, resp);
	}
		
	

}
