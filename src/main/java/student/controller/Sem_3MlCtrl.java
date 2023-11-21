package student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.sem_3MlDao;
import student.model.sem_3Ml;

/**
 * Servlet implementation class Sem_3MlCtrl
 */
@WebServlet("/Sem_3MlCtrl")
public class Sem_3MlCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sem_3MlCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Call the DAO method to retrieve data from the database
    	sem_3MlDao dao= new sem_3MlDao();
    	List<sem_3Ml>list=dao.getData();
    	request.setAttribute("student_data",list);
    	RequestDispatcher rd=request.getRequestDispatcher("Select_coursewareML3.jsp");
    	rd.forward(request, response);
    	
		 }
}
