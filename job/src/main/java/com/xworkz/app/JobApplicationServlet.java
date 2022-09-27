package com.xworkz.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/switch")
public class JobApplicationServlet extends HttpServlet {

	ArrayList<ApplicationDTO> arrayList = new ArrayList<ApplicationDTO>();

	public JobApplicationServlet() {
		System.out.println("create" + getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init method without parameter");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init method with parameter");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service method");

		resp.setContentType("text/html");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phoneNo = req.getParameter("phoneNo");
		String altPhoneNo = req.getParameter("Altphone No");
		String gender = req.getParameter("Gender");
		String qualification = req.getParameter("Qualification");
		String passout = req.getParameter("Passout Year");
		String university = req.getParameter("University");
		String address = req.getParameter("Address");
		String skills = req.getParameter("Skills");
		String salary = req.getParameter("Salary");
		String experience = req.getParameter("Experience Year");
		String idProof = req.getParameter("ID Proof");
		String proofNo = req.getParameter("Proof No");

		System.out.println("Name-" + name);
		System.out.println("Email-" + email);
		System.out.println("PhoneNo-" + phoneNo);
		System.out.println("AltPhNo-" + altPhoneNo);
		System.out.println("Gender-" + gender);
		System.out.println("Qualification-" + qualification);
		System.out.println("PassOut-" + passout);
		System.out.println("University-" + university);
		System.out.println("Address-" + address);
		System.out.println("Skills-" + skills);
		System.out.println("Salary-" + salary);
		System.out.println("Experience-" + experience);
		System.out.println("IdProof-" + idProof);
		System.out.println("ProofNo-" + proofNo);

		PrintWriter writer = resp.getWriter();
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>");
		writer.append("Job Application");
		writer.append("</h1>");
		writer.append("Name-".concat(name));
		writer.append("<br>");
		writer.append("Email-".concat(email));
		writer.append("<br>");
		writer.append("PhoneNo-".concat(phoneNo));
		writer.append("<br>");
		writer.append("AltPhoneNo-".concat(altPhoneNo));
		writer.append("<br>");
		writer.append("Gender-".concat(gender));
		writer.append("<br>");
		writer.append("Qualification-".concat(qualification));
		writer.append("<br>");
		writer.append("Passout-".concat(passout));
		writer.append("<br>");
		writer.append("University-".concat(university));
		writer.append("<br>");
		writer.append("Address-".concat(address));
		writer.append("<br>");
		writer.append("Skills-".concat(skills));
		writer.append("<br>");
		writer.append("Salary-".concat(salary));
		writer.append("<br>");
		writer.append("Experience-".concat(experience));
		writer.append("<br>");
		writer.append("IdProof-".concat(idProof));
		writer.append("<br>");
		writer.append("ProofNo-".concat(proofNo));
		writer.append("<br>");
		writer.append("</body");
		writer.append("</html>");

		new ApplicationDTO(name, email, Long.parseLong(phoneNo), Long.parseLong(altPhoneNo), gender, qualification,
				Integer.parseInt(passout), university, address, skills, Double.parseDouble(salary),
				Integer.parseInt(experience), idProof, Long.parseLong(proofNo));

	}

}
