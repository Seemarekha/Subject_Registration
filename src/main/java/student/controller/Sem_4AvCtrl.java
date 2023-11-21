package student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.sem_4AvDao;
import student.model.sem_4Av;

/**
 * Servlet implementation class Sem_4AvCtrl
 */
@WebServlet("/Sem_4AvCtrl")
public class Sem_4AvCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sem_4AvCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Call the DAO method to retrieve data from the database
    	sem_4AvDao dao= new sem_4AvDao();
    	List<sem_4Av>list=dao.getData();
    	request.setAttribute("student_data",list);
    	RequestDispatcher rd=request.getRequestDispatcher("Select_coursewareAV4.jsp");
    	rd.forward(request, response);
    	
		 }
}