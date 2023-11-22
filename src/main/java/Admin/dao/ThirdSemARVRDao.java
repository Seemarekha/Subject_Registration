package Admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Admin.model.AddCourseModel;

public class ThirdSemARVRDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","Alok613@");
		
	}
	
	public int addCourse(AddCourseModel course) throws SQLException {
		
		Connection con= null;
		int status=0;
		
		try {
			con=ThirdSemARVRDao.getConnection();
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement("INSERT INTO admin_sem_3_ar/vr(course_code,course_name,credit,course_type,academic_year) VALUES(?,?,?,?,?)");
			
			ps.setString(1,course.getCourseCode());
			ps.setString(2,course.getCourseName());
			ps.setString(3,course.getCredits());
			ps.setString(4, course.getCourseType());
			ps.setString(5, course.getAcademicYear());
			
			status = ps.executeUpdate();
			
			if(status!=0) {
				con.commit();
			}else {
				con.rollback();
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			con.rollback();
		}
		finally {
			con.close();
		}
		return status;
	}

}
