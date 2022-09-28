package com.xworkz.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = { "/city", "/showDetails" })
public class CompanyServlet extends HttpServlet {

	private ArrayList<CompanyDTO> arrayList= new ArrayList<CompanyDTO>();

	public CompanyServlet() {
		System.out.println("created companyservlet consrtructor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running dopost method");
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String founderName = req.getParameter("founder name");
		String since = req.getParameter("since");
		String employees = req.getParameter("employees");
		String address = req.getParameter("address");
		String business = req.getParameter("business");

		System.out.println("Name-" + name);
		System.out.println("FounderName-" + founderName);
		System.out.println("Since-" + since);
		System.out.println("Employees-" + employees);
		System.out.println("Address-" + address);
		System.out.println("Business-" + business);
		PrintWriter writer = resp.getWriter();
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>");
		writer.append("Details saved successfully");
		writer.append("</h1>");
		writer.append("Name-"+name);
		writer.append("<br>");
		writer.append("FounderName-" + founderName);
		writer.append("<br>");
		writer.append("Since-" + since);
		writer.append("<br>");
		writer.append("Employees-" + employees);
		writer.append("<br>");
		writer.append("Address-" + address);
		writer.append("<br>");
		writer.append("Business-" + business);
		writer.append("<br>");
		writer.append("<body>");
		writer.append("<html>");
		 
		CompanyDTO companyDTO = new CompanyDTO(name, founderName, since, employees, address, business);
		boolean company= arrayList.add(companyDTO);
		System.out.println(company);
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget method");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>");
		writer.append("Details saved successfully......");
		writer.append("</h1>");
		writer.append("<table>");
		for (CompanyDTO companyDTO : arrayList) {
			writer.append("<tr>");
			writer.append("<td>");
			writer.append(companyDTO.getName());
			writer.append("</td>");
			writer.append("<td>");
			writer.append(companyDTO.getFounderName());
			writer.append("</td>");
			writer.append("<td>");
			writer.append(companyDTO.getSince());
			writer.append("</td>");
			writer.append("<td>");
			writer.append(companyDTO.getEmployees());
			writer.append("</td>");
			writer.append("<td>");
			writer.append(companyDTO.getAddress());
			writer.append("</td>");
			writer.append("<td>");
			writer.append(companyDTO.getBisiness());
			writer.append("</td>");
			writer.append("</tr>");
		}
		writer.append("</table>");
		writer.append("</body>");
		writer.append("</html>");
	}

}
