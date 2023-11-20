package Admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.dao.ViewSem4_AR_VR;

import Admin.model.AddCourseModel;

@WebServlet("/ViewCourseSem4_AR_VR")
public class ViewCourseSem4_AR_VR extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ViewCourseSem4_AR_VR() {
        super();
            }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ViewSem4_AR_VR dao= new ViewSem4_AR_VR();
    	List<AddCourseModel>list=dao.getData();
    	request.setAttribute("course",list);
    	RequestDispatcher rd=request.getRequestDispatcher("ViewSem4(AR_VR).jsp");
    	rd.forward(request, response);
	}
}
