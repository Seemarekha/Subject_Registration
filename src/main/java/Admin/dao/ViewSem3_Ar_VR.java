package Admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Admin.model.AddCourseModel;

public class ViewSem3_Ar_VR {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","sutun@123");
	}

	public List<AddCourseModel> getData() {
		List<AddCourseModel>list=null;
		Connection con=null;
		System.out.print("hi");
		try {
			con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from sem_3_ar/vr");
			
			
			
			ResultSet rs=ps.executeQuery();
			
			System.out.print("hiii");
			list = new ArrayList<>();
			while(rs.next()) {
				AddCourseModel	model=new AddCourseModel();
				model.setCourseCode(rs.getString("CourseCode"));
				model.setCourseName(rs.getString("CourseName"));
				model.setCredits(rs.getString("Credits"));
				model.setCourseType(rs.getString("CourseType"));
				model.setAcademicYear(rs.getString("AcademicYear"));
				
				
				list.add(model);
			}
		
		}
		
	catch (Exception e) {
    	e.printStackTrace();
    	
    }
            finally {
            	try {
            		con.close();
            	}catch(SQLException e) {
            		e.printStackTrace();
            	}
            }
            return list;
        }
	

}
