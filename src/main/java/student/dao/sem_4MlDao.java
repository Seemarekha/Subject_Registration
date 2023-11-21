package student.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student.model.sem_4Ml;


public class sem_4MlDao {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","root");
	}
	public List<sem_4Ml> getData() {
		List<sem_4Ml>list=null;
		Connection con=null;
		
		try {
			con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from admin_sem_4_ml");
			
			
			
			ResultSet rs=ps.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				sem_4Ml	model=new sem_4Ml();
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