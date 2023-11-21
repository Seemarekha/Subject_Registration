package student.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import student.dao.*;
import student.model.*;

@WebServlet("/Std_Sub_Regd_Servlet")
public class Std_Sub_Regd_Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NullPointerException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String regd_no = request.getParameter("regd_no");
		String std_name = request.getParameter("std_name");
		String semester = request.getParameter("semester");
		String academic_year = request.getParameter("academic_year");

		Regd_Login rdata = new Regd_Login();

		rdata.setRegd_no(regd_no);
		rdata.setStd_name(std_name);
		rdata.setSemester(semester);
		rdata.setAcademic_year(academic_year);

		Std_Sub_RegdDao rd = new Std_Sub_RegdDao();
		boolean R = false;
		try {
			R = rd.SubRegd(regd_no, std_name, semester, academic_year);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (R != false) {
			System.out.println("Added");
		} else {
			System.out.println("Not Added");
		}

		// Std_Sub_RegdDao dao = new Std_Sub_RegdDao();
		// Regd_Login user = null;
		// String sem = request.getParameter("sem");

		HttpSession session = request.getSession();

		session.setAttribute("id", regd_no);
		session.setAttribute("name", std_name);
		session.setAttribute("sem", semester);
		session.setAttribute("academic_year", academic_year);

		response.sendRedirect("Select_course.jsp");

		try {
			CourseDao dao = new CourseDao();
			// List<Student_Sub_Regd> user = dao.getCourse();

			String sem = null;
			sem = request.getParameter("semester");
			System.out.println("sem : " + sem);
			if (sem != null) {
				if (sem.length() == 1) {

					List<Student_Sub_Regd> user1 = dao.Sem1();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);
					//response.sendRedirect("Select_course.jsp");

				} else if (sem.length() == 2) {
					List<Student_Sub_Regd> user1 = dao.Sem2();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);

					response.sendRedirect("Select_course.jsp");

				} else if (sem.length() == 3) {
					List<Student_Sub_Regd> user1 = dao.Sem3_ST();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);

					response.sendRedirect("Select_course.jsp");
				} else if (sem.length() == 4) {
					List<Student_Sub_Regd> user1 = dao.Sem3_ML();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);

					response.sendRedirect("Select_course.jsp");
					
				} else if (sem.length() == 5) {
					List<Student_Sub_Regd> user1 = dao.Sem3_Cloud();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);

					response.sendRedirect("Select_course.jsp");

					
				} else if (sem.length() == 6) {
					List<Student_Sub_Regd> user1 = dao.Sem3_AR_VR();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);

					response.sendRedirect("Select_course.jsp");



				} else if (sem.length() == 7) {
					List<Student_Sub_Regd> user1 = dao.Sem4_ST();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);

					response.sendRedirect("Select_course.jsp");
					
				} else if (sem.length() == 8) {
					List<Student_Sub_Regd> user1 = dao.Sem4_ML();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);

					response.sendRedirect("Select_course.jsp");
					
				} else if (sem.length() == 9) {
					List<Student_Sub_Regd> user1 = dao.Sem4_Cloud();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);

					response.sendRedirect("Select_course.jsp");
					
				} else if (sem.length() == 10) {
					List<Student_Sub_Regd> user1 = dao.Sem4_AR_VR();
					HttpSession session1 = request.getSession();
					session1.setAttribute("semester", user1);

					response.sendRedirect("Select_course.jsp");
				} else {
					System.out.println();
				}
			} else {
				System.out.println("sem is null");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
