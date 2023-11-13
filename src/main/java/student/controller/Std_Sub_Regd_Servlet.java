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

public class Std_Sub_Regd_Servlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		Std_Sub_RegdDao dao = new Std_Sub_RegdDao();
		Regd_Login user = null;
		 System.out.print("hello");
		RequestDispatcher rd=null;
		
		try {
			user =dao.SubRegd(); 
			
			 rd= request.getRequestDispatcher("Select_course.jsp");
			    request.setAttribute("std_info", user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		Student_Sub_Regd user1 = null;
		user1 =dao.Sem1Sub(); 
		 rd= request.getRequestDispatcher("Select_course.jsp");
		    request.setAttribute("regd_info", user1);
		
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   
			
		rd.forward(request, response);
	}
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 doGet(request,response);
	}

}
