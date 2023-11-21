package student.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import student.dao.Std_subjDao;
import student.model.stdnt_subj_redgn;




/**
 * Servlet implementation class Std_subjCtrl
 */
@WebServlet("/Std_subjCtrl")
public class Std_subjCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Std_subjCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fullname=request.getParameter("fullname");
		String regno=request.getParameter("regno");
		String semester=request.getParameter("semester");
		String academicyear=request.getParameter("academicyear");

		
		stdnt_subj_redgn model=new stdnt_subj_redgn();
		model.setFullname(fullname);
		model.setRegno(regno);
		model.setSemester(semester);
		model.setAcademicyear(academicyear);
		
		
		Std_subjDao dao=new Std_subjDao();
		try {
			dao.addStudent(model);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("Data.jsp");
		rd.forward(request, response);
		
		
		
	}

}
