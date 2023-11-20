package Admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.dao.ViewSem4_ML;

import Admin.model.AddCourseModel;

/**
 * Servlet implementation class ViewCourseSem4_ML
 */
@WebServlet("/ViewCourseSem4_ML")
public class ViewCourseSem4_ML extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCourseSem4_ML() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ViewSem4_ML dao= new ViewSem4_ML();
    	List<AddCourseModel>list=dao.getData();
    	request.setAttribute("course",list);
    	RequestDispatcher rd=request.getRequestDispatcher("ViewSem4(ML).jsp");
    	rd.forward(request, response);
	}
}

