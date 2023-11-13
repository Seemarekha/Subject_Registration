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
	//response.getWriter().append("Served at: ").append(request.getContextPath());
	response.getWriter().append("Served at: ").append(request.getContextPath());
	String Registration = request.getParameter("Registration");
	String Password = request.getParameter("Password");
	LoginDao da =new LoginDao();
	Regd_Login user = null;
	try {
		user = da.checkLogin(Registration,Password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	RequestDispatcher rd=null;
	if(user!=null) {
		rd=request.getRequestDispatcher("stud_dashboard.jsp");
		request.setAttribute("std_regd",user);
//		HttpSession session = request.getSession(true);
//		session.setAttribute("User_Info", user);
		
	}else {
		request.setAttribute("Error", "UserID or Password is incorrect........."); 
		rd=request.getRequestDispatcher("std_login.jsp");
		
	}
	rd.forward(request,response);
	
}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
     doGet(request,response);
//		
//    String Registration = request.getParameter("Registration");
//  	String Password = request.getParameter("Password");
//  	
//  	LoginDao da =new LoginDao();
//  	
//  	//Regd_Login mod = new Regd_Login();
//  	
//  	Regd_Login user = null;
//  	
//  	
//  	try {
//  		user = da.checkLogin(Registration,Password);
//  		
//  		RequestDispatcher rd=null;
//  	  	if(user!=null) {
////  	  		HttpSession session = request.getSession(true);
////  	  		session.setAttribute("User_Info", user);
//  	  		
//  	  		
//  	  		rd=request.getRequestDispatcher("stud_dashboard.jsp");
//  	  		request.setAttribute("std_regd",user);
//  	  	    rd.forward(request, response);
//  	  		
//  	  	}else {
//  	  		request.setAttribute("Error", "UserID or Password is incorrect........."); 
//  	  		rd=request.getRequestDispatcher("std_login.jsp");	
//  	  	}
//  		
//  	} catch (SQLException e) {
//  		// TODO Auto-generated catch block
//  		e.printStackTrace();
//  	}
//  	
//  	
//  	
//	}	
}
}
