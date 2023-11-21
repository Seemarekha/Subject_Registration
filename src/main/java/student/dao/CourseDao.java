package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student.model.Student_Sub_Regd;

public class CourseDao {
	public static Connection getConnection() throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","root");
	}

	public List<Student_Sub_Regd> Sem1() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_1");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}

	public List<Student_Sub_Regd> Sem2() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_2");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}

	public List<Student_Sub_Regd> Sem3_ST() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_2");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}

	public List<Student_Sub_Regd> Sem3_ML() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_2");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}

	public List<Student_Sub_Regd> Sem3_Cloud() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_2");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}

	public List<Student_Sub_Regd> Sem3_AR_VR() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_2");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}

	public List<Student_Sub_Regd> Sem4_ST() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_2");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}

	public List<Student_Sub_Regd> Sem4_ML() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_2");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}

	public List<Student_Sub_Regd> Sem4_Cloud() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_2");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}

	public List<Student_Sub_Regd> Sem4_AR_VR() {
		List<Student_Sub_Regd> stdmodel = new ArrayList<>();
		Connection con = null;
		try {
			con=CourseDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_2");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Student_Sub_Regd std = new Student_Sub_Regd();
				std.setCourse_code(rs.getString("course_code"));
				std.setCourse_Name(rs.getString("course_name"));
				std.setCredit(rs.getString("credit"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
	}
}
