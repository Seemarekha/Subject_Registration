package Admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.dao.ViewSem3_Cloud;

import Admin.model.AddCourseModel;

@WebServlet("/ViewCourseSem3_Cloud")
public class ViewCourseSem3_Cloud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCourseSem3_Cloud() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ViewSem3_Cloud dao= new ViewSem3_Cloud();
    	List<AddCourseModel>list=dao.getData();
    	request.setAttribute("course",list);
    	RequestDispatcher rd=request.getRequestDispatcher("ViewSem3(Cloud).jsp");
    	rd.forward(request, response);
	}
}
