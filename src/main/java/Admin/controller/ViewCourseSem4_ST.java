package Admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Admin.dao.ViewSem4_ST;
import Admin.model.AddCourseModel;

/**
 * Servlet implementation class ViewCourseSem4_ST
 */
@WebServlet("/ViewCourseSem4_ST")
public class ViewCourseSem4_ST extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCourseSem4_ST() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ViewSem4_ST dao= new ViewSem4_ST();
    	List<AddCourseModel>list=dao.getData();
    	request.setAttribute("course",list);
    	RequestDispatcher rd=request.getRequestDispatcher("ViewSem4(ST).jsp");
    	rd.forward(request, response);
	}
}
