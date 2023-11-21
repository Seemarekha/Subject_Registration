package student.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.StdDao;
import student.model.registered_std;

/**
 * Servlet implementation class StdCtrl
 */
@WebServlet("/StdCtrl")
public class StdCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StdCtrl() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Call the DAO method to retrieve data from the database
    	StdDao dao= new StdDao();
    	List<registered_std>list=dao.getData();
    	request.setAttribute("student_data",list);
    	RequestDispatcher rd=request.getRequestDispatcher("Select_courseware.jsp");
    	rd.forward(request, response);
    	
		 }
}