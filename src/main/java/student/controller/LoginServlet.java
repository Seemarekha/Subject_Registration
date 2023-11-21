package student.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.*;
import student.model.*;


@WebServlet("/std_login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

	response.getWriter().append("Served at: ").append(request.getContextPath());
	String regd_no = request.getParameter("regd_no");
	String password = request.getParameter("password");
	LoginDao da =new LoginDao();
	Regd_Login user = null;
	try {
		user = da.checkLogin(regd_no,password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	RequestDispatcher rd=null;
	if(user!=null) {
		rd=request.getRequestDispatcher("stud_dashboard.jsp");
		request.setAttribute("std_regd",user);
		
	}else {
		request.setAttribute("Error", "UserID or Password is incorrect........."); 
		rd=request.getRequestDispatcher("std_login.jsp");
		
	}
	rd.forward(request,response);
	
}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
     doGet(request,response);

}
}
