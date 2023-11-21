package student.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student.model.registered_std;


public class StdDao {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","root");
	}
	public List<registered_std> getData() {
		List<registered_std>list=null;
		Connection con=null;
		
		try {
			con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from admin_sem_1");
			
			
			
			ResultSet rs=ps.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				registered_std	model=new registered_std();
				model.setCourseCode(rs.getString("course_code"));
				model.setCourseName(rs.getString("course_name"));
				model.setCredits(rs.getString("credit"));
				model.setCourseType(rs.getString("type"));
				model.setAcademicYear(rs.getString("academic_year"));
				
				
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