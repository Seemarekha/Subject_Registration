package Admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Admin.dao.StdRegdListDao;
import Admin.model.StdModel;

@WebServlet("/StdRegdListCtrl")
public class StdRegdListCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StdRegdListCtrl() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		StdRegdListDao stdDao = new StdRegdListDao();
		
		List<StdModel> stdmodel = stdDao.getRegisteredStudent();
		
//		RequestDispatcher rd = null;
		
//		request.setAttribute("stdList", stdmodel);
//		rd=request.getRequestDispatcher("Registered_student_list.jsp");
//		
//		
//		
//		rd.forward(request, response);
		
		HttpSession session = request.getSession();
		session.setAttribute("stdList", stdmodel);

		
		response.sendRedirect("Registered_student_list.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
