package Admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.dao.AdminDao;
import Admin.model.AdminModel;



@WebServlet("/AdminCtrl")
public class AdminCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AdminCtrl() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher rd1=request.getRequestDispatcher("Home.jsp");	
		 rd1.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//doGet(request, response);
		
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		AdminModel adminModel = new AdminModel();
		
		AdminDao adminDao = new AdminDao();
		boolean admin = false;
		
		admin=adminDao.authenticateAdmin(email, password);
		
		RequestDispatcher rd=null;
		
		if(admin != false) {
			rd = request.getRequestDispatcher("Admin_dashboard.jsp");
			request.setAttribute("Dashboard", adminModel);
		}else {
			rd = request.getRequestDispatcher("AdminLogin.jsp");
			request.setAttribute("ErrorMessage", "Invalid credentials. Please try again.");
		}
		rd.forward(request, response);
	}

}
