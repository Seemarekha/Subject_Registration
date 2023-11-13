package student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import student.model.*;
import student.dao.*;
@WebServlet("/std_registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String std_name = request.getParameter("std_name");
		String regd_no = request.getParameter("regd_no");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");
		String contact_no = request.getParameter("contact_no");
		String academic_year = request.getParameter("academic_year");
		
		Regd_Login rdata = new Regd_Login();
		
		rdata.setStd_name(std_name);
		rdata.setRegd_no(regd_no);
		rdata.setEmail(email);
		rdata.setPassword(password);
		rdata.setConfirmpassword(confirmpassword);
		rdata.setContact_no(contact_no);
		rdata.setAcademic_year(academic_year);
		
		RegistrationDao rgd = new RegistrationDao();
		long R = 0;
		try
		{
			R = rgd.addStudent(rdata);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(R != 0)
		{
			System.out.println("Added");
		}
		else {
			System.out.println("Not Added");
		}
		RequestDispatcher rd = request.getRequestDispatcher("std_login.jsp");
		rd.forward(request, response);
		
	}


}
