package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import student.model.Regd_Login;
import student.model.Student_Sub_Regd;

public class Std_Sub_RegdDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","root");	
	}
	public Regd_Login SubRegd() throws SQLException {
		Connection con =null ;
		ResultSet rs = null;
		Regd_Login user=null;
		try {
			con = LoginDao.getConnection();
			PreparedStatement prd= con.prepareStatement(" Select  regd_no, std_name ,  academic_year  from std_regd");
			

			rs = prd.executeQuery(); 
			 
			 
				 while(rs.next()) {
						 user = new Regd_Login();
						user.setRegd_no(rs.getString("regd_no"));
						user.setStd_name(rs.getString("std_name"));
						user.setAcademic_year(rs.getString("academic_year"));
						System.out.println(user);			 

	                }
				 
            }catch(Exception e) {
	              e.printStackTrace();
            }finally {
	              con.close();
           }
		return user;
	}
	public Student_Sub_Regd Sem1Sub() throws SQLException {
		Connection con =null ;
		Student_Sub_Regd user1=null;
		try {
			con = LoginDao.getConnection();
			System.out.print("hey");
			PreparedStatement prd1= con.prepareStatement(" Select  course_code, course_name ,  credit  from admin_sem_1");
			 ResultSet rs1 = prd1.executeQuery();
			
			 
			 
				 while(rs1.next()) {
						 user1 = new Student_Sub_Regd();
						user1.setCourse_code(rs1.getString("Course_code"));
						user1.setCourse_Name(rs1.getString("Course_Name"));
						user1.setCredit(rs1.getString("Credit"));
						System.out.println(user1);			 

	                }
				 
            }catch(Exception e) {
	              e.printStackTrace();
            }finally {
	              con.close();
           }
		return user1;
		
		
	}
}
	
	
	

