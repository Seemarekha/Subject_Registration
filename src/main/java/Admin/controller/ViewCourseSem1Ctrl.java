package Admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.dao.ViewSem1Dao;
import Admin.model.AddCourseModel;

@WebServlet("/ViewCourseSem1Ctrl")
public class ViewCourseSem1Ctrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ViewCourseSem1Ctrl() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ViewSem1Dao dao= new ViewSem1Dao();
    	List<AddCourseModel>list=dao.getData();
    	request.setAttribute("course",list);
    	RequestDispatcher rd=request.getRequestDispatcher("ViewSem1.jsp");
    	rd.forward(request, response);
	}

}
